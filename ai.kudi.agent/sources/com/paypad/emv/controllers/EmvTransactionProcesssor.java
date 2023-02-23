package com.paypad.emv.controllers;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.datecs.pinpad.C2396b;
import com.datecs.pinpad.PinpadException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.paypad.controllers.PinpadHelper;
import com.paypad.controllers.PinpadManager;
import com.paypad.emv.EmvRequest;
import com.paypad.emv.EmvResponse;
import com.paypad.emv._0200Type;
import com.paypad.emv.utils.BerTlv;
import com.paypad.emv.utils.Tag;
import com.paypad.exceptions.TransactionAbortedException;
import com.paypad.exceptions.TransactionCanceledException;
import com.paypad.exceptions.TransactionDeniedException;
import com.paypad.exceptions.TransactionException;
import com.paypad.models.messaging.nibss.CashAdvanceRequest;
import com.paypad.models.messaging.nibss.CashBackRequest;
import com.paypad.models.messaging.nibss.Globals;
import com.paypad.models.messaging.nibss.NibssIsoProcessor;
import com.paypad.models.messaging.nibss.PurchaseRequest;
import com.paypad.utils.CryptoUtil;
import com.paypad.utils.HexUtil;
import com.paypad.utils.MiscUtils;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;
import p272h.p273a.p274a.C8211a;
/* loaded from: classes2.dex */
public class EmvTransactionProcesssor {
    private static final int KEY_DATA_INDEX = 0;
    private static String TAG = "EMVTransactionProcessor";
    private _0200Type _0200type;
    private Context appContext;
    private String dbDate;
    byte[] pinKey;
    private PinpadManager pinPadManager;
    private String processingCode;
    byte[] sessionKey;
    private String stan;
    public String track = "";
    private final boolean OFFLINE_PROCESSING = true;
    private final boolean COMMUNICATION_FAILURE = false;
    private Long amount = 0L;
    private boolean webServiceSuccess = false;

    public EmvTransactionProcesssor(PinpadManager pinpadManager, _0200Type _0200type, Context context) {
        this.pinPadManager = null;
        this.sessionKey = null;
        this.pinKey = null;
        this.appContext = context;
        this.pinPadManager = pinpadManager;
        this._0200type = _0200type;
        SharedPreferences sharedPreferences = context.getSharedPreferences("Configuration", 0);
        C8211a.f19743a = sharedPreferences;
        String string = sharedPreferences.getString(C8211a.f19753k, "none");
        if (!string.equals("none")) {
            this.sessionKey = HexUtil.hexStringToByteArray(string);
        }
        String string2 = C8211a.f19743a.getString(C8211a.f19754l, "none");
        if (string2.equals("none")) {
            return;
        }
        this.pinKey = HexUtil.hexStringToByteArray(string2);
    }

    private byte[] decode(String str) {
        return HexUtil.hexStringToByteArray(str, ' ');
    }

    private byte[] decryptData(byte[] bArr) {
        byte[] decrypt3DESCBC = CryptoUtil.decrypt3DESCBC(decode("B0 B1 B2 B3 B4 B5 B6 B7 B8 B9 BA BB BC BD BE BF"), new byte[8], bArr);
        if (decrypt3DESCBC.length < 12) {
            return null;
        }
        int i = (decrypt3DESCBC[8] & 255) + (decrypt3DESCBC[9] & 255);
        if (decrypt3DESCBC.length < i + 12) {
            return null;
        }
        int i2 = i + 10;
        if (((decrypt3DESCBC[i2] & 255) << 8) + (decrypt3DESCBC[i + 11] & 255) != CryptoUtil.crcccitt16(65535, decrypt3DESCBC, 0, i2)) {
            return null;
        }
        return Arrays.copyOfRange(decrypt3DESCBC, 10, i2);
    }

    private static String emvStatusToString(int i) {
        switch (i) {
            case 0:
                return "Operation successful";
            case 1:
                return "More than one matching applications found";
            case 2:
                return "Only one matching application found";
            case 3:
                return "No matching applications found";
            case 4:
                return "Easy Entry application";
            case 5:
                return "Amount is requested by the dynamic data authentication";
            case 6:
                return "Result needed";
            case 7:
                return "Authentication is completed";
            case 8:
                return "Authentication was not performed";
            case 9:
                return "OFFLINE plain text pin is required";
            case 10:
                return "ONLINE pin is required";
            case 11:
                return "OFFLINE ciphered pin is required";
            case 12:
                return "Explicit selection was done and blocked AIDs were found";
            case 13:
                return "An online request should be done";
            case 14:
                return "Transaction can be accepted offline";
            case 15:
                return "Transaction must be declined";
            case 16:
                return "CDA failed and the cryptogram got is not an AAC or the data handed for DDA was not found";
            case 17:
                return "Incorrect PIN";
            case 18:
                return "Incorrect PIN, last attempt available only";
            default:
                switch (i) {
                    case 50:
                        return "Command failed, possibly due wrong input parameters - wrong ATR, bit values, etc";
                    case 51:
                        return "Incoming data pointer is null or empty";
                    case 52:
                        return "Internal system error occurred";
                    case 53:
                        return "Incorrect format found in the input parameters";
                    case 54:
                        return "Invalid ATR sequence, not according to specification";
                    case 55:
                        return "Severe error occurred transaction must be aborted";
                    case 56:
                        return "AID not found in the card";
                    case 57:
                        return "Application is not correct";
                    case 58:
                        return "Some error during read process";
                    case 59:
                        return "Status word got from the PSE selection indicates that the card is blocked";
                    case 60:
                        return "No script loaded";
                    case 61:
                        return "Tag not found";
                    case 62:
                        return "Tag cannot be read";
                    case 63:
                        return "Length of the buffer is incorrect";
                    case 64:
                        return "Error in the HASH verification";
                    case 65:
                        return "No key was found to do the verification";
                    case 66:
                        return "No more available locations for keys";
                    case 67:
                        return "Error processing the AC generation";
                    case 68:
                        return "Status word got from the card is 6985";
                    case 69:
                        return "No method is currently applicable";
                    case 70:
                        return "Result already loaded for the current method";
                    default:
                        switch (i) {
                            case 80:
                                return "Invalid reminder";
                            case 81:
                                return "Invalid header";
                            case 82:
                                return "Invalid footer";
                            case 83:
                                return "Invalid format";
                            case 84:
                                return "Invalid certificate";
                            case 85:
                                return "Invalid signature";
                            default:
                                return "Unpecified status code " + i;
                        }
                }
        }
    }

    private byte[] formatPINBlock(String str, String str2) {
        int length = str2.length();
        String format = String.format("0%d%sffffffffff", Integer.valueOf(str.length()), str);
        int i = length - 13;
        String format2 = String.format("0000%s", str2.substring(i, ((length - i) + i) - 1));
        byte[] bytes = format.getBytes();
        byte[] bytes2 = format2.getBytes();
        byte[] bArr = new byte[bytes2.length];
        for (int i2 = 0; i2 < bytes2.length; i2++) {
            bArr[i2] = (byte) (bytes[i2] ^ bytes2[i2]);
        }
        return bArr;
    }

    public static String iccDate() {
        int i = Calendar.getInstance().get(5);
        int i2 = Calendar.getInstance().get(1);
        String valueOf = String.valueOf(i);
        String valueOf2 = String.valueOf(Calendar.getInstance().get(2) + 1);
        String valueOf3 = String.valueOf(i2);
        if (valueOf.length() == 1) {
            valueOf = "0" + valueOf;
        }
        if (valueOf2.length() == 1) {
            valueOf2 = "0" + valueOf2;
        }
        return valueOf3.substring(2) + valueOf2 + valueOf;
    }

    public static String iccTime() {
        return new SimpleDateFormat("hhmmss").format(Calendar.getInstance().getTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void processEMVOnlineTransaction(C2396b c2396b, EmvResponse emvResponse, EmvRequest emvRequest) throws PinpadException, IOException, TransactionException, InterruptedException {
        String trim;
        String str;
        String str2;
        int indexOf;
        String str3;
        String str4;
        CashAdvanceRequest cashAdvanceRequest;
        PurchaseRequest purchaseRequest;
        CashBackRequest cashBackRequest;
        C2396b c2396b2;
        Log.i("EMVPROCESSOR", "» Process online\n");
        Date time = Calendar.getInstance().getTime();
        this.dbDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) time);
        String pan = emvResponse.getPan();
        if (pan.charAt(pan.length() - 1) == 'F') {
            pan = pan.replaceAll("F", "");
        }
        String str5 = "00" + Globals.AccountTypeFrom + "00";
        String str6 = "09" + Globals.AccountTypeFrom + "00";
        String str7 = "01" + Globals.AccountTypeFrom + "00";
        String format = String.format("%012d", Long.valueOf(emvRequest.getMinorAmount()));
        String valueOf = String.valueOf(Globals.stan);
        this.stan = valueOf;
        int length = valueOf.length();
        if (length < 6) {
            int i = 0;
            for (int i2 = 6 - length; i < i2; i2 = i2) {
                this.stan = "0" + this.stan;
                i++;
            }
        }
        String format2 = new SimpleDateFormat("hhmmss").format(time);
        String valueOf2 = String.valueOf(Calendar.getInstance().get(5));
        String valueOf3 = String.valueOf(Calendar.getInstance().get(2) + 1);
        if (valueOf2.length() == 1) {
            valueOf2 = "0" + valueOf2;
        }
        if (valueOf3.length() == 1) {
            valueOf3 = "0" + valueOf3;
        }
        String str8 = valueOf3 + valueOf2;
        String str9 = str8 + format2;
        if (emvResponse.getCardData().getCardExpiryDate().length() == 4) {
            trim = emvResponse.getCardData().getCardExpiryDate();
        } else {
            trim = emvResponse.getCardData().getCardExpiryDate().substring(0, 4).trim();
        }
        String string = C8211a.f19743a.getString(C8211a.f19758p, "none");
        String cardSequenceNo = emvResponse.getCardData().getCardSequenceNo();
        if (cardSequenceNo.length() == 2) {
            cardSequenceNo = "0" + cardSequenceNo;
        }
        String valueOf4 = String.valueOf(Globals.rrn);
        int length2 = valueOf4.length();
        if (length2 < 12) {
            str = cardSequenceNo;
            str2 = valueOf4;
            int i3 = 0;
            for (int i4 = 12 - length2; i3 < i4; i4 = i4) {
                str2 = "0" + str2;
                i3++;
            }
        } else {
            str = cardSequenceNo;
            str2 = valueOf4;
        }
        String string2 = C8211a.f19743a.getString(C8211a.f19759q, "none");
        String string3 = C8211a.f19743a.getString(C8211a.f19756n, "none");
        String string4 = C8211a.f19743a.getString(C8211a.f19757o, "none");
        String pinData = emvResponse.getPinData() != null ? emvResponse.getPinData() : null;
        String str10 = this.track;
        if (str10.contains("D")) {
            indexOf = str10.indexOf(68);
        } else {
            indexOf = str10.contains("=") ? str10.indexOf(61) : 0;
        }
        String substring = str10.substring(indexOf + 1, indexOf + 8).substring(4);
        String format3 = String.format("%012d", Long.valueOf(C8211a.f19749g));
        String format4 = String.format("%s%s%s%s%s", "0200", this.stan, str9, "00000111129", "00000000000");
        String packICCDataJpos = packICCDataJpos(emvResponse);
        Globals.terminalID = string2;
        Globals.RRN = str2;
        Globals.amount1 = C8211a.f19745c;
        if (this._0200type.equals(_0200Type.purchase)) {
            Globals.cashback = "0.00";
            Globals.cashadvance = "0.00";
            Globals.purchase = C8211a.f19745c;
            Globals.total = C8211a.f19745c;
            purchaseRequest = new PurchaseRequest();
            purchaseRequest.setPan(pan);
            purchaseRequest.setProcessingCode(str5);
            purchaseRequest.setTransactionAmount(format);
            purchaseRequest.setTransmissionDateTime(str9);
            purchaseRequest.setStan(this.stan);
            purchaseRequest.setLocalTransactionDate(str8);
            purchaseRequest.setLocalTransactionTime(format2);
            purchaseRequest.setCardExpirationDate(trim);
            purchaseRequest.setMerchantType(string);
            purchaseRequest.setPosEntryMode("051");
            purchaseRequest.setCardSequenceNumber(str);
            purchaseRequest.setPosConditionCode("00");
            purchaseRequest.setPosPinCaptureCode("04");
            purchaseRequest.setTransactionFee("C00000000");
            purchaseRequest.setAcquiringInstIdCode("111129");
            purchaseRequest.setTrack2Data(str10);
            purchaseRequest.setRetrievalReferenceNumber(str2);
            purchaseRequest.setTerminalId(string2);
            purchaseRequest.setCardAcceptorIdCode(string3);
            purchaseRequest.setCardAcceptorNameLocation(string4);
            purchaseRequest.setCurrencyCode("566");
            purchaseRequest.setPinData(pinData);
            purchaseRequest.setIccData(packICCDataJpos.replace(" ", ""));
            purchaseRequest.setPosDataCode("511101512344101");
            purchaseRequest.setServiceRestrictionCode(substring);
            purchaseRequest.setSecurityRelatedInformation("");
            purchaseRequest.setAdditionalAmounts(format3);
            purchaseRequest.setMessageReasonCode("");
            purchaseRequest.setTransportData("MPOS");
            purchaseRequest.setPaymentInformation("");
            purchaseRequest.setOriginalDataElements(format4);
            str4 = "";
            str3 = str7;
            cashAdvanceRequest = null;
            cashBackRequest = 0;
        } else {
            String str11 = str;
            String str12 = pinData;
            String str13 = str2;
            if (this._0200type.equals(_0200Type.cashback)) {
                Globals.cashback = C8211a.f19747e;
                Globals.purchase = C8211a.f19746d;
                Globals.total = C8211a.f19746d;
                Globals.cashadvance = "0.00";
                CashBackRequest cashBackRequest2 = new CashBackRequest();
                cashBackRequest2.setPan(pan);
                cashBackRequest2.setProcessingCode(str6);
                cashBackRequest2.setTransactionAmount(format);
                cashBackRequest2.setTransmissionDateTime(str9);
                cashBackRequest2.setStan(this.stan);
                cashBackRequest2.setLocalTransactionDate(str8);
                cashBackRequest2.setLocalTransactionTime(format2);
                cashBackRequest2.setCardExpirationDate(trim);
                cashBackRequest2.setMerchantType(string);
                cashBackRequest2.setPosEntryMode("051");
                cashBackRequest2.setCardSequenceNumber(str11);
                cashBackRequest2.setPosConditionCode("00");
                cashBackRequest2.setPosPinCaptureCode("04");
                cashBackRequest2.setTransactionFee("C00000000");
                cashBackRequest2.setAcquiringInstIdCode("111129");
                cashBackRequest2.setTrack2Data(str10);
                cashBackRequest2.setRetrievalReferenceNumber(str13);
                cashBackRequest2.setTerminalId(string2);
                cashBackRequest2.setCardAcceptorIdCode(string3);
                cashBackRequest2.setCardAcceptorNameLocation(string4);
                cashBackRequest2.setCurrencyCode("566");
                cashBackRequest2.setPinData(str12);
                str4 = "";
                cashBackRequest2.setIccData(packICCDataJpos.replace(" ", str4));
                cashBackRequest2.setPosDataCode("511101512344101");
                cashBackRequest2.setServiceRestrictionCode(substring);
                cashBackRequest2.setSecurityRelatedInformation(str4);
                cashBackRequest2.setAdditionalAmounts(C8211a.f19747e);
                cashBackRequest2.setMessageReasonCode(str4);
                cashBackRequest2.setTransportData("MPOS");
                cashBackRequest2.setPaymentInformation(str4);
                str3 = str7;
                cashAdvanceRequest = null;
                purchaseRequest = null;
                cashBackRequest = cashBackRequest2;
            } else {
                if (this._0200type.equals(_0200Type.cashadvance)) {
                    Globals.cashadvance = C8211a.f19748f;
                    Globals.purchase = "0.00";
                    Globals.total = C8211a.f19748f;
                    Globals.cashback = "0.00";
                    CashAdvanceRequest cashAdvanceRequest2 = new CashAdvanceRequest();
                    cashAdvanceRequest2.setPan(pan);
                    str3 = str7;
                    cashAdvanceRequest2.setProcessingCode(str3);
                    cashAdvanceRequest2.setTransactionAmount(format);
                    cashAdvanceRequest2.setTransmissionDateTime(str9);
                    cashAdvanceRequest2.setStan(this.stan);
                    cashAdvanceRequest2.setLocalTransactionDate(str8);
                    cashAdvanceRequest2.setLocalTransactionTime(format2);
                    cashAdvanceRequest2.setCardExpirationDate(trim);
                    cashAdvanceRequest2.setMerchantType(string);
                    cashAdvanceRequest2.setPosEntryMode("051");
                    cashAdvanceRequest2.setCardSequenceNumber(str11);
                    cashAdvanceRequest2.setPosConditionCode("00");
                    cashAdvanceRequest2.setPosPinCaptureCode("04");
                    cashAdvanceRequest2.setTransactionFee("C00000000");
                    cashAdvanceRequest2.setAcquiringInstIdCode("111129");
                    cashAdvanceRequest2.setTrack2Data(str10);
                    cashAdvanceRequest2.setRetrievalReferenceNumber(str13);
                    cashAdvanceRequest2.setTerminalId(string2);
                    cashAdvanceRequest2.setCardAcceptorIdCode(string3);
                    cashAdvanceRequest2.setCardAcceptorNameLocation(string4);
                    cashAdvanceRequest2.setCurrencyCode("566");
                    cashAdvanceRequest2.setPinData(str12);
                    str4 = "";
                    cashAdvanceRequest2.setIccData(packICCDataJpos.replace(" ", str4));
                    cashAdvanceRequest2.setPosDataCode("511101512344101");
                    cashAdvanceRequest2.setServiceRestrictionCode(substring);
                    cashAdvanceRequest2.setSecurityRelatedInformation(str4);
                    cashAdvanceRequest2.setAdditionalAmounts(C8211a.f19748f);
                    cashAdvanceRequest2.setMessageReasonCode(str4);
                    cashAdvanceRequest2.setTransportData("MPOS");
                    cashAdvanceRequest2.setPaymentInformation(str4);
                    cashAdvanceRequest = cashAdvanceRequest2;
                    purchaseRequest = null;
                } else {
                    str3 = str7;
                    str4 = "";
                    cashAdvanceRequest = null;
                    purchaseRequest = null;
                }
                cashBackRequest = purchaseRequest;
            }
        }
        MiscUtils.initContext(this.appContext);
        MiscUtils.getFromSharedPreferences("Configuration", C8211a.f19762t, str4);
        MiscUtils.getFromSharedPreferences("Configuration", C8211a.f19763u, str4);
        Long valueOf5 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        Globals.transactionId = "T" + String.valueOf(valueOf5);
        if (this._0200type.equals(_0200Type.purchase)) {
            Globals.transactionType = "purchase";
            NibssIsoProcessor.process(purchaseRequest, this.sessionKey, this.appContext);
            logKudi();
        } else if (this._0200type.equals(_0200Type.cashback)) {
            Globals.transactionType = "cashback";
            NibssIsoProcessor.process(cashBackRequest, this.sessionKey);
            logTxn();
        } else if (this._0200type.equals(_0200Type.cashadvance)) {
            Globals.transactionType = "cashadvance";
            NibssIsoProcessor.process(cashAdvanceRequest, this.sessionKey);
            logTxn();
            this.processingCode = str3;
        }
        String str14 = Globals.authData;
        if (str14 != null) {
            c2396b2 = c2396b;
            c2396b2.m33041S(145, HexUtil.hexStringToByteArray(str14));
            throwOnEMVError(c2396b);
            c2396b.m33077A();
            throwOnEMVError(c2396b);
            Globals.authData = null;
        } else {
            c2396b2 = c2396b;
        }
        String str15 = Globals.script71;
        if (str15 != null) {
            c2396b2.m33041S(57124, HexUtil.hexStringToByteArray(str15));
            throwOnEMVError(c2396b);
            c2396b2.m33045Q(113);
            Globals.script71 = null;
        }
        Log.i("EMVPROCESSOR", "» Generate TC certificate (CDOL 2)\n");
        c2396b2.m33071D(1, 2);
        throwOnEMVError(c2396b);
        String str16 = Globals.script72;
        if (str16 != null) {
            c2396b2.m33041S(57124, HexUtil.hexStringToByteArray(str16));
            throwOnEMVError(c2396b);
            c2396b2.m33045Q(114);
            Globals.script72 = null;
        }
        int m33061I = c2396b.m33061I();
        if (m33061I != 0) {
            if (m33061I == 16) {
                throw new TransactionDeniedException(emvStatusToString(c2396b.m33061I()));
            }
            if (m33061I != 55 && m33061I != 67) {
                throwOnEMVError(c2396b);
            } else {
                throw new TransactionAbortedException(emvStatusToString(c2396b.m33061I()));
            }
        }
        String m33063H = c2396b2.m33063H(40743);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_CRYPT_INFO_DATA: " + m33063H + "\n");
        Integer.parseInt(m33063H, 16);
        String m33063H2 = c2396b2.m33063H(40758);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_ATC: " + m33063H2 + "\n");
        String m33063H3 = c2396b2.m33063H(40742);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_APP_CRYPTOGRAM: " + m33063H3 + "\n");
        String m33063H4 = c2396b2.m33063H(40720);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_ISSUER_APP_DAT: " + m33063H4 + "\n");
        String m33063H5 = c2396b2.m33063H(149);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_TVR: " + m33063H5 + "\n");
        String m33063H6 = c2396b2.m33063H(155);
        throwOnEMVError(c2396b);
        Log.i("EMVPROCESSOR", "  TAG_TSI: " + m33063H6 + "\n");
        Intent intent = new Intent();
        intent.setAction("com.esl.paypadlib");
        intent.putExtra("response", "transactionresponse");
        intent.putExtra("responsearray", new String[]{Globals.responseCode, Globals.appResponse, Globals.terminalID, Globals.cardNo, Globals.cardholder, this.dbDate, Globals.purchase, Globals.transactionId, Globals.RRN});
        this.appContext.sendBroadcast(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0cf4 A[LOOP:2: B:42:0x0611->B:131:0x0cf4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x07a2 A[EDGE_INSN: B:152:0x07a2->B:105:0x07a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processEMVTransaction(com.datecs.pinpad.C2396b r27, com.paypad.emv.EmvResponse r28, com.paypad.emv.EmvRequest r29) throws com.datecs.pinpad.PinpadException, java.io.IOException, java.lang.InterruptedException, com.paypad.exceptions.TransactionCanceledException, com.paypad.exceptions.TransactionAbortedException, com.paypad.exceptions.TransactionDeniedException, com.paypad.exceptions.TransactionException {
        /*
            Method dump skipped, instructions count: 3368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.emv.controllers.EmvTransactionProcesssor.processEMVTransaction(com.datecs.pinpad.b, com.paypad.emv.EmvResponse, com.paypad.emv.EmvRequest):void");
    }

    private void processMagneticCardTransaction(C2396b c2396b, byte[] bArr) throws PinpadException, IOException, InterruptedException, PinpadException, IOException, TransactionCanceledException, TransactionAbortedException {
        Log.i("EMVPROCESSOR", "» Process magnetic card\n");
        PinpadHelper.showBusy(c2396b);
        StringBuffer[] stringBufferArr = {new StringBuffer(), new StringBuffer(), new StringBuffer()};
        char c = 65535;
        for (byte b : bArr) {
            int i = b & 255;
            switch (i) {
                case 241:
                    c = 0;
                    break;
                case 242:
                    c = 1;
                    break;
                case 243:
                    c = 2;
                    break;
                default:
                    if (c > 65535) {
                        stringBufferArr[c].append((char) i);
                        break;
                    } else {
                        break;
                    }
            }
        }
        Log.i("EMVPROCESSOR", "  (1)Track data: " + stringBufferArr[0].toString() + "\n");
        Log.i("EMVPROCESSOR", "  (2)Track data: " + stringBufferArr[1].toString() + "\n");
        Log.i("EMVPROCESSOR", "  (3)Track data: " + stringBufferArr[2].toString() + "\n");
        Log.i("EMVPROCESSOR", "» Enter PIN\n");
        PinpadHelper.enterPin(c2396b, "Pin");
        PinpadHelper.showBusy(c2396b);
        byte[] m32981y = c2396b.m32981y(0);
        Log.i("EMVPROCESSOR", "  DUKPT KSN: " + HexUtil.byteArrayToHexString(m32981y) + "\n");
        byte[] m33038T0 = c2396b.m33038T0(2, 5, "0000000000000000".getBytes(), 0, null);
        Log.i("EMVPROCESSOR", "  ENCRTYPTED PIN: " + HexUtil.byteArrayToHexString(m33038T0) + "\n");
    }

    private void processManualEntryTransaction(C2396b c2396b) throws PinpadException, IOException, InterruptedException {
    }

    private String readTagAsString(C2396b c2396b, int i) throws PinpadException, IOException, InterruptedException {
        byte[] decryptData = decryptData(c2396b.m33059J(255, -1430532899, new Tag(i).getBytes()), c2396b.m32981y(0));
        if (decryptData != null) {
            return BerTlv.create(decryptData).getValueAsHexString();
        }
        throw new InterruptedException("Failed to decrypt data");
    }

    private void throwOnEMVError(C2396b c2396b) throws InterruptedException {
        int m33061I = c2396b.m33061I();
        if (m33061I == 0) {
            return;
        }
        throw new InterruptedException("EMV Error: " + emvStatusToString(m33061I));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[Catch: IOException -> 0x0125, TransactionDeniedException -> 0x0127, TransactionCanceledException -> 0x0129, TransactionAbortedException -> 0x012b, PinpadException -> 0x0148, TryCatch #7 {PinpadException -> 0x0148, blocks: (B:9:0x001e, B:12:0x002e, B:19:0x0074, B:21:0x0082, B:43:0x0113, B:22:0x008b, B:26:0x0099, B:28:0x009d, B:31:0x00e6, B:33:0x00f3, B:34:0x00f8, B:35:0x00ff, B:37:0x0101, B:39:0x0109, B:40:0x010f, B:17:0x006d), top: B:67:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: IOException -> 0x0125, TransactionDeniedException -> 0x0127, TransactionCanceledException -> 0x0129, TransactionAbortedException -> 0x012b, PinpadException -> 0x0148, TryCatch #7 {PinpadException -> 0x0148, blocks: (B:9:0x001e, B:12:0x002e, B:19:0x0074, B:21:0x0082, B:43:0x0113, B:22:0x008b, B:26:0x0099, B:28:0x009d, B:31:0x00e6, B:33:0x00f3, B:34:0x00f8, B:35:0x00ff, B:37:0x0101, B:39:0x0109, B:40:0x010f, B:17:0x006d), top: B:67:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: IOException -> 0x0125, TransactionDeniedException -> 0x0127, TransactionCanceledException -> 0x0129, TransactionAbortedException -> 0x012b, PinpadException -> 0x0148, TryCatch #7 {PinpadException -> 0x0148, blocks: (B:9:0x001e, B:12:0x002e, B:19:0x0074, B:21:0x0082, B:43:0x0113, B:22:0x008b, B:26:0x0099, B:28:0x009d, B:31:0x00e6, B:33:0x00f3, B:34:0x00f8, B:35:0x00ff, B:37:0x0101, B:39:0x0109, B:40:0x010f, B:17:0x006d), top: B:67:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[LOOP:0: B:67:0x001e->B:45:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.paypad.emv.EmvResponse doEmv(com.paypad.emv.EmvRequest r17) throws java.io.IOException, java.lang.InterruptedException, com.datecs.pinpad.PinpadException, com.paypad.exceptions.TransactionCanceledException, com.paypad.exceptions.TransactionException, com.paypad.exceptions.TransactionAbortedException, com.paypad.exceptions.TransactionDeniedException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.emv.controllers.EmvTransactionProcesssor.doEmv(com.paypad.emv.EmvRequest):com.paypad.emv.EmvResponse");
    }

    public void logKudi() {
        try {
            SharedPreferences sharedPreferences = this.appContext.getSharedPreferences("Configuration", 0);
            C8211a.f19743a = sharedPreferences;
            String string = sharedPreferences.getString(C8211a.f19759q, "");
            String string2 = C8211a.f19743a.getString(C8211a.f19764v, "");
            String string3 = C8211a.f19743a.getString(C8211a.f19744b, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("responseCode", Globals.responseCode);
            jSONObject.put("response", Globals.appResponse);
            jSONObject.put("terminalId", string);
            jSONObject.put("cardNo", Globals.cardNo);
            jSONObject.put("cardHolder", Globals.cardholder);
            jSONObject.put("timeCreated", this.dbDate);
            jSONObject.put(TransactionField.AMOUNT, Globals.purchase);
            jSONObject.put("transactionId", Globals.transactionId);
            jSONObject.put("rrn", String.valueOf(Globals.RRN));
            jSONObject.put("bank", string2);
            jSONObject.put("bankId", string3);
            jSONObject.put("cardType", Globals.tenderType);
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.emv.controllers.EmvTransactionProcesssor.2
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(Globals.paystackUrl).openConnection()));
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            byte[] bytes = jSONObject.toString().getBytes();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            System.out.print(httpsURLConnection.getResponseCode());
            logTxn();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (KeyManagementException e4) {
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public void logPaystack() {
        try {
            SharedPreferences sharedPreferences = this.appContext.getSharedPreferences("Configuration", 0);
            C8211a.f19743a = sharedPreferences;
            String string = sharedPreferences.getString(C8211a.f19759q, "");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(Globals.paystackmap);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("responseCode", Globals.responseCode);
            jSONObject3.put("response", Globals.appResponse);
            jSONObject3.put("terminalID", string);
            jSONObject3.put("pan", Globals.cardNo);
            jSONObject3.put("cardHolderName", Globals.cardholder);
            jSONObject3.put(AttributeType.DATE, this.dbDate);
            jSONObject3.put(TransactionField.AMOUNT, Globals.purchase);
            jSONObject3.put("transactionID", Globals.transactionId);
            jSONObject3.put("rrn", String.valueOf(Globals.RRN));
            jSONObject.put(TransactionBreakDownItemType.DATA, jSONObject2);
            jSONObject.put("meta", jSONObject3);
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.emv.controllers.EmvTransactionProcesssor.3
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(Globals.paystackUrl).openConnection()));
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            byte[] bytes = jSONObject.toString().getBytes();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            long responseCode = httpsURLConnection.getResponseCode();
            jSONObject.optBoolean(TransactionField.STATUS);
            System.out.print(responseCode);
            logTxn();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (KeyManagementException e4) {
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public void logTxn() {
        try {
            SharedPreferences sharedPreferences = this.appContext.getSharedPreferences("Configuration", 0);
            C8211a.f19743a = sharedPreferences;
            String string = sharedPreferences.getString(C8211a.f19762t, "");
            String string2 = C8211a.f19743a.getString(C8211a.f19759q, "");
            String string3 = C8211a.f19743a.getString(C8211a.f19763u, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CacheDataSource.PREF_USERNAME, string);
            jSONObject.put("rrn", String.valueOf(Globals.RRN));
            jSONObject.put("cardNo", Globals.cardNo);
            jSONObject.put("response", Globals.appResponse);
            jSONObject.put("responseCode", Globals.responseCode);
            jSONObject.put("purchase", Globals.purchase);
            jSONObject.put("total", new BigDecimal(Globals.total));
            jSONObject.put("transactionId", Globals.transactionId);
            jSONObject.put("transactionType", "CARD");
            jSONObject.put("tenderType", Globals.tenderType);
            jSONObject.put("cardHolder", Globals.cardholder);
            jSONObject.put("authCode", Globals.authCode);
            jSONObject.put("createdOn", this.dbDate);
            jSONObject.put("email", string3);
            jSONObject.put("accountType", Globals.AccountTypeFrom);
            jSONObject.put("expiry", "");
            jSONObject.put("aid", "");
            jSONObject.put("stan", String.valueOf(this.stan));
            jSONObject.put("terminalId", string2);
            jSONObject.put("location", "Nigeria");
            jSONObject.put("itemPurchased", "");
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.emv.controllers.EmvTransactionProcesssor.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://ibeta.paypad.com.ng/paypad/webapi/v2/logtransactions").openConnection()));
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            byte[] bytes = jSONObject.toString().getBytes();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            jSONObject.optBoolean(TransactionField.STATUS);
            System.out.print(httpsURLConnection.getResponseCode());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (KeyManagementException e4) {
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public String packICCDataJpos(EmvResponse emvResponse) {
        String terminalCountryCode;
        String transactionCurrencyCode;
        String cryptogram = emvResponse.getCryptogram();
        String cryptogramInformationData = emvResponse.getCryptogramInformationData();
        String str = ("" + String.format("9F26%02x%s", Integer.valueOf(cryptogram.length() / 2), cryptogram)) + String.format("9F27%02x%s", Integer.valueOf(cryptogramInformationData.length() / 2), cryptogramInformationData);
        String iad = emvResponse.getIad();
        String str2 = str + String.format("9F10%02x%s", Integer.valueOf(iad.length() / 2), iad);
        String unpredictableNo = emvResponse.getUnpredictableNo();
        String str3 = str2 + String.format("9F37%02x%s", Integer.valueOf(unpredictableNo.length() / 2), unpredictableNo);
        String atc = emvResponse.getAtc();
        String str4 = str3 + String.format("9F36%02x%s", Integer.valueOf(atc.length() / 2), atc);
        String tvr = emvResponse.getTvr();
        String str5 = str4 + String.format("95%02x%s", Integer.valueOf(tvr.length() / 2), tvr);
        String transDate = emvResponse.getTransDate();
        String str6 = str5 + String.format("9A%02x%s", Integer.valueOf(transDate.length() / 2), transDate);
        String transactionType = emvResponse.getTransactionType();
        String format = String.format("%012d", Long.valueOf(Long.parseLong(emvResponse.getAmountAuthorized())));
        String str7 = (str6 + String.format("9C%02x%s", Integer.valueOf(transactionType.length() / 2), transactionType)) + String.format("9F02%02x%s", Integer.valueOf(format.length() / 2), format);
        String aip = emvResponse.getAip();
        String str8 = str7 + String.format("82%02x%s", Integer.valueOf(aip.length() / 2), aip);
        if (emvResponse.getTerminalCountryCode().length() == 3) {
            terminalCountryCode = "0" + emvResponse.getTerminalCountryCode();
        } else {
            terminalCountryCode = emvResponse.getTerminalCountryCode();
        }
        String str9 = str8 + String.format("9F1A%02x%s", Integer.valueOf(terminalCountryCode.length() / 2), terminalCountryCode);
        if (emvResponse.getTransactionCurrencyCode().length() == 3) {
            transactionCurrencyCode = "0" + emvResponse.getTransactionCurrencyCode();
        } else {
            transactionCurrencyCode = emvResponse.getTransactionCurrencyCode();
        }
        String str10 = str9 + String.format("5F2A%02x%s", Integer.valueOf(transactionCurrencyCode.length() / 2), transactionCurrencyCode);
        String cvmResult = emvResponse.getCvmResult();
        String str11 = str10 + String.format("9F34%02x%s", Integer.valueOf(cvmResult.length() / 2), cvmResult);
        String terminalCapabilities = emvResponse.getTerminalCapabilities();
        String str12 = str11 + String.format("9F33%02x%s", Integer.valueOf(terminalCapabilities.length() / 2), terminalCapabilities);
        String terminalType = emvResponse.getTerminalType();
        String str13 = str12 + String.format("9F35%02x%s", Integer.valueOf(terminalType.length() / 2), terminalType);
        String format2 = String.format("%012d", Long.valueOf(Long.parseLong(emvResponse.getAmountOther())));
        return str13 + String.format("9F03%02x%s", Integer.valueOf(format2.length() / 2), format2);
    }

    private byte[] decryptData(byte[] bArr, byte[] bArr2) {
        SharedPreferences sharedPreferences = this.appContext.getSharedPreferences("Configuration", 0);
        C8211a.f19743a = sharedPreferences;
        byte[] decrypt3DESCBC = CryptoUtil.decrypt3DESCBC(CryptoUtil.calculateDataKey(bArr2, HexUtil.hexStringToByteArray(sharedPreferences.getString(C8211a.f19755m, "none"))), new byte[8], bArr);
        if (decrypt3DESCBC.length < 12) {
            return null;
        }
        int i = (decrypt3DESCBC[8] & 255) + (decrypt3DESCBC[9] & 255);
        if (decrypt3DESCBC.length < i + 12) {
            return null;
        }
        int i2 = i + 10;
        if (((decrypt3DESCBC[i2] & 255) << 8) + (decrypt3DESCBC[i + 11] & 255) != CryptoUtil.crcccitt16(65535, decrypt3DESCBC, 0, i2)) {
            return null;
        }
        return Arrays.copyOfRange(decrypt3DESCBC, 10, i2);
    }
}
