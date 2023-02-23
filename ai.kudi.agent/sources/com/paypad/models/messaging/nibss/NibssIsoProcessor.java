package com.paypad.models.messaging.nibss;

import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.paypad.network.NibssSocketManager;
import com.paypad.utils.HexUtil;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ConnectTimeoutException;
import p272h.p273a.p274a.C8211a;
import p272h.p375g.p376a.C9427c;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.C9430f;
import p272h.p375g.p376a.EnumC9428d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public class NibssIsoProcessor {
    public static String clearSessionKey;
    static byte[] masterKey;
    static Socket socket;
    private static NibssSocketManager socketPluger;
    byte[] messagepayload1;
    byte[] responseBytes = null;
    byte[] responseBytes1;

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static String generateHash256Value(byte[] bArr, byte[] bArr2) {
        String str;
        String str2 = "";
        String str3 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr, 0, bArr.length);
            str3 = HexUtil.byteArrayToHexString(messageDigest.digest());
            str = str3.replace(" ", "");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            str = str3;
        }
        if (str.length() < 64) {
            int length = 64 - str.length();
            String str4 = str.toString();
            for (int i = 0; i < length; i++) {
                str2 = str2 + "0";
            }
            String str5 = str2 + str4;
            Log.i("Utility : ", str5);
            return str5;
        }
        return str;
    }

    public static void getICCResponse(String str) {
        if (str.substring(0, 2).equals("91")) {
            if (str.substring(0, 4).equals("9110")) {
                if (str.substring(4).length() < 20) {
                    Globals.authData = str.substring(4);
                    return;
                } else if (str.substring(4).length() == 20) {
                    Globals.authData = str.substring(4, 24);
                    return;
                } else {
                    Globals.authData = str.substring(4, 24);
                    if (str.substring(24, 26).equals("71")) {
                        int parseInt = (Integer.parseInt(str.substring(26, 28), 16) * 2) + 4;
                        Globals.script71 = str.substring(24, parseInt);
                        if (str.substring(parseInt).isEmpty()) {
                            return;
                        }
                        Globals.script72 = str.substring(parseInt);
                        return;
                    } else if (str.substring(24, 26).equals("72")) {
                        Globals.script72 = str.substring(24);
                        return;
                    } else {
                        return;
                    }
                }
            }
            int parseInt2 = (Integer.parseInt(str.substring(2, 4), 16) * 2) + 4;
            Globals.authData = str.substring(4, parseInt2);
            if (str.substring(parseInt2).isEmpty()) {
                return;
            }
            int i = parseInt2 + 2;
            if (str.substring(parseInt2, i).equals("71")) {
                int parseInt3 = (Integer.parseInt(str.substring(i, parseInt2 + 4), 16) * 2) + 4;
                Globals.script71 = str.substring(parseInt2, parseInt3);
                if (!str.substring(parseInt3).isEmpty()) {
                    Globals.script72 = str.substring(parseInt3);
                }
            }
            if (str.substring(parseInt2, i).equals("72")) {
                Globals.script72 = str.substring(parseInt2);
                return;
            }
            return;
        }
        if (str.substring(0, 2).equals("71")) {
            int parseInt4 = (Integer.parseInt(str.substring(2, 4), 16) * 2) + 4;
            Globals.script71 = str.substring(0, parseInt4);
            if (!str.substring(parseInt4).isEmpty()) {
                Globals.script72 = str.substring(parseInt4);
            }
        }
        if (str.substring(0, 2).equals("72")) {
            Globals.script72 = str;
        }
    }

    public static void getPinpadResponse() {
        if (Globals.responseCode.equals("00")) {
            Globals.returnMessage = "TRANSACTION\n   SUCCESSFUL";
        } else if (Globals.responseCode.equals("01")) {
            Globals.returnMessage = "   REFER TO\n  CARD ISSUER";
        } else if (Globals.responseCode.equals("02")) {
            Globals.returnMessage = "   REFER TO\n  CARD ISSUER";
        } else if (Globals.responseCode.equals("03")) {
            Globals.returnMessage = "   INVALID\n    MERCHANT   ";
        } else if (Globals.responseCode.equals("04")) {
            Globals.returnMessage = "  PICK-UP\n      CARD   ";
        } else if (Globals.responseCode.equals("05")) {
            Globals.returnMessage = "    DO NOT\n   HONOUR";
        } else if (Globals.responseCode.equals("06")) {
            Globals.returnMessage = "      ERROR   ";
        } else if (Globals.responseCode.equals("07")) {
            Globals.returnMessage = "   PICK-UP\n      CARD   ";
        } else if (Globals.responseCode.equals("08")) {
            Globals.returnMessage = "     HONOUR\n    WITH ID";
        } else if (Globals.responseCode.equals("09")) {
            Globals.returnMessage = "    REQUEST IN\n    PROGRESS   ";
        } else if (Globals.responseCode.equals("10")) {
            Globals.returnMessage = "   APPROVED,\n   PARTIAL";
        } else if (Globals.responseCode.equals("11")) {
            Globals.returnMessage = "   APPROVED,\n     VIP";
        } else if (Globals.responseCode.equals("12")) {
            Globals.returnMessage = "   INVALID\n   TRANSACTION";
        } else if (Globals.responseCode.equals("13")) {
            Globals.returnMessage = "   INVALID\n     AMOUNT   ";
        } else if (Globals.responseCode.equals("14")) {
            Globals.returnMessage = " INVALID CARD\n    NUMBER   ";
        } else if (Globals.responseCode.equals("15")) {
            Globals.returnMessage = "  NO SUCH\n    ISSUER   ";
        } else if (Globals.responseCode.equals("16")) {
            Globals.returnMessage = "    APPROVED\n UPDATE TRACK3";
        } else if (Globals.responseCode.equals("17")) {
            Globals.returnMessage = "   CUSTOMER\n  CANCELLATION   ";
        } else if (Globals.responseCode.equals("18")) {
            Globals.returnMessage = "   CUSTOMER\n    DISPUTE   ";
        } else if (Globals.responseCode.equals("19")) {
            Globals.returnMessage = "      RE-ENTER\n   TRANSACTION";
        } else if (Globals.responseCode.equals("20")) {
            Globals.returnMessage = "     INVALID\n     RESPONSE   ";
        } else if (Globals.responseCode.equals("21")) {
            Globals.returnMessage = "  NO ACTION\n     TAKEN";
        } else if (Globals.responseCode.equals("22")) {
            Globals.returnMessage = "  SUSPECTED\n   MALFUNCTION";
        } else if (Globals.responseCode.equals("23")) {
            Globals.returnMessage = "UNACCEPTABLE FEE\n FOR TRANSACTION";
        } else if (Globals.responseCode.equals("24")) {
            Globals.returnMessage = " FILE UPDATE\n  NOT SUPPORTED    ";
        } else if (Globals.responseCode.equals("25")) {
            Globals.returnMessage = "  UNABLE TO\n LOCATE RECORD   ";
        } else if (Globals.responseCode.equals("26")) {
            Globals.returnMessage = "   DUPLICATE\n      RECORD   ";
        } else if (Globals.responseCode.equals("27")) {
            Globals.returnMessage = " FILE UPDATE\n  EDIT ERROR  ";
        } else if (Globals.responseCode.equals("28")) {
            Globals.returnMessage = " FILE UPDATE\n  FILE LOCKED  ";
        } else if (Globals.responseCode.equals("29")) {
            Globals.returnMessage = " FILE UPDATE\n     FAILED";
        } else if (Globals.responseCode.equals("30")) {
            Globals.returnMessage = "      FORMAT\n      ERROR";
        } else if (Globals.responseCode.equals("31")) {
            Globals.returnMessage = "    BANK NOT\n    SUPPORTED   ";
        } else if (Globals.responseCode.equals("32")) {
            Globals.returnMessage = "   COMPLETED\n    PARTIALLY";
        } else if (Globals.responseCode.equals("33")) {
            Globals.returnMessage = "  EXPIRED CARD\n    PICK-UP";
        } else if (Globals.responseCode.equals("34")) {
            Globals.returnMessage = " SUSPECTED FRAUD\n  PICK-UP   ";
        } else if (Globals.responseCode.equals("35")) {
            Globals.returnMessage = " CONTACT ACQUIRER\n  PICK-UP   ";
        } else if (Globals.responseCode.equals("36")) {
            Globals.returnMessage = " RESTRICTED CARD\n  PICK-UP   ";
        } else if (Globals.responseCode.equals("37")) {
            Globals.returnMessage = "CALL ACQUIRER SECURITY PICK-UP   ";
        } else if (Globals.responseCode.equals("38")) {
            Globals.returnMessage = "PIN TRIES EXCEEDED\n  PICK-UP   ";
        } else if (Globals.responseCode.equals("39")) {
            Globals.returnMessage = "   NO CREDIT\n    ACCOUNT   ";
        } else if (Globals.responseCode.equals("40")) {
            Globals.returnMessage = "  FUNCTION NOT\n   SUPPORTED   ";
        } else if (Globals.responseCode.equals("41")) {
            Globals.returnMessage = "   LOST CARD";
        } else if (Globals.responseCode.equals("42")) {
            Globals.returnMessage = "  NO UNIVERSAL\n     ACCOUNT   ";
        } else if (Globals.responseCode.equals("43")) {
            Globals.returnMessage = " STOLEN CARD";
        } else if (Globals.responseCode.equals("44")) {
            Globals.returnMessage = " NO INVESTMENT\n      ACCOUNT";
        } else if (Globals.responseCode.equals("51")) {
            Globals.returnMessage = " NOT SUFFICIENT\n        FUNDS   ";
        } else if (Globals.responseCode.equals("52")) {
            Globals.returnMessage = "  NO CURRENT\n    ACCOUNT   ";
        } else if (Globals.responseCode.equals("53")) {
            Globals.returnMessage = "  NO SAVINGS\n    ACCOUNT   ";
        } else if (Globals.responseCode.equals("54")) {
            Globals.returnMessage = " EXPIRED CARD ";
        } else if (Globals.responseCode.equals("55")) {
            Globals.returnMessage = "   INCORRECT\n        PIN   ";
        } else if (Globals.responseCode.equals("56")) {
            Globals.returnMessage = "  NO CARD\n      RECORD   ";
        } else if (!Globals.responseCode.equals("57") && !Globals.responseCode.equals("58")) {
            if (Globals.responseCode.equals("59")) {
                Globals.returnMessage = "    SUSPECTED\n      FRAUD ";
            } else if (Globals.responseCode.equals("60")) {
                Globals.returnMessage = "    CONTACT\n       ACQUIRER   ";
            } else if (Globals.responseCode.equals("61")) {
                Globals.returnMessage = "EXCEEDS WITHDRAWAL\n       LIMIT   ";
            } else if (Globals.responseCode.equals("62")) {
                Globals.returnMessage = "   RESTRICTED\n        CARD   ";
            } else if (Globals.responseCode.equals("63")) {
                Globals.returnMessage = "   SECURITY\n   VIOLATION   ";
            } else if (Globals.responseCode.equals("64")) {
                Globals.returnMessage = " ORIGINAL AMOUNT\n     INCORRECT   ";
            } else if (Globals.responseCode.equals("65")) {
                Globals.returnMessage = "EXCEEDS WITHDRAWAL\n   FREQUENCY   ";
            } else if (Globals.responseCode.equals("66")) {
                Globals.returnMessage = "  CALL ACQUIRER\n      SECURITY  ";
            } else if (Globals.responseCode.equals("67")) {
                Globals.returnMessage = "HARD CAPTURE";
            } else if (Globals.responseCode.equals("68")) {
                Globals.returnMessage = "RESPONSE RECEIVED\n   TOO LATE ";
            } else if (Globals.responseCode.equals("75")) {
                Globals.returnMessage = "   PIN TRY\n    EXCEEDED  ";
            } else if (Globals.responseCode.equals("77")) {
                Globals.returnMessage = "BANK INTERVENE";
            } else if (Globals.responseCode.equals("78")) {
                Globals.returnMessage = "BANK INTERVENE";
            } else if (Globals.responseCode.equals("90")) {
                Globals.returnMessage = "   CUT-OFF\n  IN PROGRESS  ";
            } else if (Globals.responseCode.equals("91")) {
                Globals.returnMessage = "   SWITCH\n  INOPERATIVE   ";
            } else if (Globals.responseCode.equals("92")) {
                Globals.returnMessage = "     ROUTING\n      ERROR";
            } else if (Globals.responseCode.equals("93")) {
                Globals.returnMessage = "LAW VIOLATION";
            } else if (Globals.responseCode.equals("94")) {
                Globals.returnMessage = "    DUPLICATE\n   TRANSACTION   ";
            } else if (Globals.responseCode.equals("95")) {
                Globals.returnMessage = "    RECONCILE\n      ERROR";
            } else if (Globals.responseCode.equals("96")) {
                Globals.returnMessage = "   SYSTEM\n   MALFUNCTION";
            } else if (Globals.responseCode.equals("98")) {
                Globals.returnMessage = "  EXCEEDS CASH\n      LIMIT";
            }
        } else {
            Globals.returnMessage = "TRANSACTION\n  NOT PERMITTED";
        }
    }

    private static void increment(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Configuration", 0);
        C8211a.f19743a = sharedPreferences;
        String string = sharedPreferences.getString(C8211a.f19765w, "none");
        String string2 = C8211a.f19743a.getString(C8211a.f19766x, "none");
        long parseLong = Long.parseLong(string) + 1;
        long parseLong2 = Long.parseLong(string2) + 1;
        if (parseLong > 999999) {
            parseLong = 0;
        }
        long j = parseLong2 <= 999999999999L ? parseLong : 0L;
        Globals.stan = j;
        Globals.rrn = parseLong2;
        SharedPreferences.Editor edit = C8211a.f19743a.edit();
        edit.putString(C8211a.f19765w, String.valueOf(j));
        edit.putString(C8211a.f19766x, String.valueOf(parseLong2));
        edit.commit();
    }

    public static PurchaseResponse process(PurchaseRequest purchaseRequest, byte[] bArr, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Context context2;
        String str7;
        PurchaseResponse purchaseResponse;
        String str8;
        String str9;
        Context context3;
        String str10;
        String str11;
        String str12;
        Context context4;
        String str13;
        String str14;
        String str15;
        String str16;
        PurchaseResponse purchaseResponse2;
        String valueOf;
        String substring;
        C9427c c9427c;
        C9429e<?> c9429e;
        C9429e<?> c9429e2;
        try {
            try {
                try {
                    try {
                        try {
                            valueOf = String.valueOf(System.currentTimeMillis());
                            int length = valueOf.length();
                            if (length < 12) {
                                int i = 0;
                                for (int i2 = 12 - length; i < i2; i2 = i2) {
                                    try {
                                        valueOf = "0" + valueOf;
                                        i++;
                                    } catch (ConnectException unused) {
                                        str = "TRANSACTION\n NOT DONE ";
                                        str2 = "TRANSACTION NOT DONE ";
                                        str8 = "errorTranx";
                                        str9 = "response";
                                        str5 = "XX";
                                        str6 = "Not authenticated";
                                        purchaseResponse = null;
                                        context3 = context;
                                        str10 = "com.esl.paypadlib";
                                        Globals.responseCode = str5;
                                        Globals.appResponse = str2;
                                        Globals.returnMessage = str;
                                        Globals.authCode = str6;
                                        Intent intent = new Intent();
                                        intent.setAction(str10);
                                        intent.putExtra(str9, str8);
                                        context3.sendBroadcast(intent);
                                        return purchaseResponse;
                                    } catch (ConnectTimeoutException unused2) {
                                        str = "TRANSACTION\n NOT DONE ";
                                        str2 = "TRANSACTION NOT DONE ";
                                        str3 = "errorTranx";
                                        str4 = "response";
                                        str5 = "XX";
                                        str6 = "Not authenticated";
                                        purchaseResponse = null;
                                        context2 = context;
                                        str7 = "com.esl.paypadlib";
                                        Globals.responseCode = str5;
                                        Globals.appResponse = str2;
                                        Globals.returnMessage = str;
                                        Globals.authCode = str6;
                                        Intent intent2 = new Intent();
                                        intent2.setAction(str7);
                                        intent2.putExtra(str4, str3);
                                        context2.sendBroadcast(intent2);
                                        return purchaseResponse;
                                    } catch (Exception e) {
                                        e = e;
                                        str14 = "errorTranx";
                                        str15 = "response";
                                        str16 = "com.esl.paypadlib";
                                        str5 = "XX";
                                        str6 = "Not authenticated";
                                        purchaseResponse = null;
                                        e.printStackTrace();
                                        Globals.responseCode = str5;
                                        Globals.appResponse = "UNEXPECTED ERROR ";
                                        Globals.returnMessage = "UNEXPECTED\n ERROR ";
                                        Globals.authCode = str6;
                                        Intent intent3 = new Intent();
                                        intent3.setAction(str16);
                                        intent3.putExtra(str15, str14);
                                        context.sendBroadcast(intent3);
                                        return purchaseResponse;
                                    }
                                }
                            }
                            if (length > 12) {
                                valueOf = valueOf.substring(length - 12);
                            }
                            substring = valueOf.substring(valueOf.length() - 6);
                            c9427c = new C9427c();
                            c9427c.m14772j(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
                            str = "TRANSACTION\n NOT DONE ";
                            try {
                                c9429e = new C9429e<>(EnumC9428d.LLVAR, purchaseRequest.getPan());
                                Log.i("pan", purchaseRequest.getPan());
                                str2 = "TRANSACTION NOT DONE ";
                            } catch (ConnectException unused3) {
                                str2 = "TRANSACTION NOT DONE ";
                                str5 = "XX";
                                str6 = "Not authenticated";
                                purchaseResponse = null;
                                str8 = "errorTranx";
                                str9 = "response";
                                str10 = "com.esl.paypadlib";
                                context3 = context;
                                Globals.responseCode = str5;
                                Globals.appResponse = str2;
                                Globals.returnMessage = str;
                                Globals.authCode = str6;
                                Intent intent4 = new Intent();
                                intent4.setAction(str10);
                                intent4.putExtra(str9, str8);
                                context3.sendBroadcast(intent4);
                                return purchaseResponse;
                            } catch (ConnectTimeoutException unused4) {
                                str2 = "TRANSACTION NOT DONE ";
                                str5 = "XX";
                                str6 = "Not authenticated";
                                purchaseResponse = null;
                                str3 = "errorTranx";
                                str4 = "response";
                                str7 = "com.esl.paypadlib";
                                context2 = context;
                                Globals.responseCode = str5;
                                Globals.appResponse = str2;
                                Globals.returnMessage = str;
                                Globals.authCode = str6;
                                Intent intent22 = new Intent();
                                intent22.setAction(str7);
                                intent22.putExtra(str4, str3);
                                context2.sendBroadcast(intent22);
                                return purchaseResponse;
                            }
                        } catch (SocketTimeoutException unused5) {
                            str5 = "XX";
                            str6 = "Not authenticated";
                            str11 = "errorTranx";
                            str12 = "response";
                            str13 = "com.esl.paypadlib";
                            context4 = context;
                        }
                    } catch (ConnectException unused6) {
                        str = "TRANSACTION\n NOT DONE ";
                    } catch (ConnectTimeoutException unused7) {
                        str = "TRANSACTION\n NOT DONE ";
                    }
                } catch (Exception e2) {
                    e = e2;
                    str14 = "errorTranx";
                }
            } catch (SocketTimeoutException unused8) {
                str11 = "errorTranx";
                str12 = "response";
                str5 = "XX";
                str6 = "Not authenticated";
                context4 = context;
                str13 = "com.esl.paypadlib";
            }
        } catch (ConnectException unused9) {
            str = "TRANSACTION\n NOT DONE ";
            str2 = "TRANSACTION NOT DONE ";
            str8 = "errorTranx";
            str9 = "response";
            str5 = "XX";
            str6 = "Not authenticated";
            context3 = context;
            str10 = "com.esl.paypadlib";
            purchaseResponse = null;
        } catch (ConnectTimeoutException unused10) {
            str = "TRANSACTION\n NOT DONE ";
            str2 = "TRANSACTION NOT DONE ";
            str3 = "errorTranx";
            str4 = "response";
            str5 = "XX";
            str6 = "Not authenticated";
            context2 = context;
            str7 = "com.esl.paypadlib";
            purchaseResponse = null;
        }
        try {
            c9429e2 = new C9429e<>(EnumC9428d.NUMERIC, purchaseRequest.getProcessingCode(), 6);
            Log.i("pcode", purchaseRequest.getProcessingCode());
            str14 = "errorTranx";
        } catch (ConnectException unused11) {
            str5 = "XX";
            str6 = "Not authenticated";
            purchaseResponse = null;
            str8 = "errorTranx";
            str9 = "response";
            str10 = "com.esl.paypadlib";
            context3 = context;
            Globals.responseCode = str5;
            Globals.appResponse = str2;
            Globals.returnMessage = str;
            Globals.authCode = str6;
            Intent intent42 = new Intent();
            intent42.setAction(str10);
            intent42.putExtra(str9, str8);
            context3.sendBroadcast(intent42);
            return purchaseResponse;
        } catch (ConnectTimeoutException unused12) {
            str5 = "XX";
            str6 = "Not authenticated";
            purchaseResponse = null;
            str3 = "errorTranx";
            str4 = "response";
            str7 = "com.esl.paypadlib";
            context2 = context;
            Globals.responseCode = str5;
            Globals.appResponse = str2;
            Globals.returnMessage = str;
            Globals.authCode = str6;
            Intent intent222 = new Intent();
            intent222.setAction(str7);
            intent222.putExtra(str4, str3);
            context2.sendBroadcast(intent222);
            return purchaseResponse;
        }
        try {
            C9429e<?> c9429e3 = new C9429e<>(EnumC9428d.NUMERIC, purchaseRequest.getTransactionAmount(), 12);
            Log.i(KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT, purchaseRequest.getTransactionAmount());
            C9429e<?> c9429e4 = new C9429e<>(EnumC9428d.DATE10, purchaseRequest.getTransmissionDateTime());
            Log.i("dandt", purchaseRequest.getTransmissionDateTime());
            str15 = "response";
            try {
                C9429e<?> c9429e5 = new C9429e<>(EnumC9428d.NUMERIC, substring, 6);
                Log.i("stan", purchaseRequest.getStan());
                C9429e<?> c9429e6 = new C9429e<>(EnumC9428d.TIME, purchaseRequest.getLocalTransactionTime());
                Log.i(TransactionField.TIME, purchaseRequest.getLocalTransactionTime());
                str16 = "com.esl.paypadlib";
                try {
                    C9429e<?> c9429e7 = new C9429e<>(EnumC9428d.DATE4, purchaseRequest.getLocalTransactionDate());
                    Log.i(AttributeType.DATE, purchaseRequest.getLocalTransactionDate());
                    str5 = "XX";
                    try {
                        C9429e<?> c9429e8 = new C9429e<>(EnumC9428d.DATE4, purchaseRequest.getCardExpirationDate());
                        Log.i("expdate", purchaseRequest.getCardExpirationDate());
                        str6 = "Not authenticated";
                        try {
                            try {
                                try {
                                    C9429e<?> c9429e9 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getMerchantType(), 4);
                                    Log.i("mertype", purchaseRequest.getMerchantType());
                                    C9429e<?> c9429e10 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getPosEntryMode(), 3);
                                    Log.i("posentrymode", purchaseRequest.getPosEntryMode());
                                    C9429e<?> c9429e11 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getCardSequenceNumber(), 3);
                                    Log.i("seqcardno", purchaseRequest.getCardSequenceNumber());
                                    C9429e<?> c9429e12 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getPosConditionCode(), 2);
                                    Log.i("poscondtncode", purchaseRequest.getPosConditionCode());
                                    C9429e<?> c9429e13 = new C9429e<>(EnumC9428d.NUMERIC, purchaseRequest.getPosPinCaptureCode(), 2);
                                    Log.i("pospincapturecode", purchaseRequest.getPosPinCaptureCode());
                                    C9429e<?> c9429e14 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getTransactionFee(), 9);
                                    Log.i("transactnfee", purchaseRequest.getTransactionFee());
                                    C9429e<?> c9429e15 = new C9429e<>(EnumC9428d.LLVAR, purchaseRequest.getAcquiringInstIdCode());
                                    Log.i("acqinstcode", purchaseRequest.getAcquiringInstIdCode());
                                    C9429e<?> c9429e16 = new C9429e<>(EnumC9428d.LLVAR, purchaseRequest.getTrack2Data());
                                    Log.i("track2", purchaseRequest.getTrack2Data());
                                    C9429e<?> c9429e17 = new C9429e<>(EnumC9428d.ALPHA, valueOf, 12);
                                    Log.i("rrn", purchaseRequest.getRetrievalReferenceNumber());
                                    C9429e<?> c9429e18 = new C9429e<>(EnumC9428d.NUMERIC, purchaseRequest.getServiceRestrictionCode(), 3);
                                    Log.i("src", purchaseRequest.getServiceRestrictionCode());
                                    C9429e<?> c9429e19 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getTerminalId(), 8);
                                    Log.i("tid", purchaseRequest.getTerminalId());
                                    C9429e<?> c9429e20 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getCardAcceptorIdCode(), 15);
                                    Log.i("cac", purchaseRequest.getCardAcceptorIdCode());
                                    purchaseRequest.getCardAcceptorNameLocation();
                                    C9429e<?> c9429e21 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getCardAcceptorNameLocation(), 40);
                                    Log.i("canc", purchaseRequest.getCardAcceptorNameLocation());
                                    C9429e<?> c9429e22 = new C9429e<>(EnumC9428d.NUMERIC, purchaseRequest.getCurrencyCode(), 3);
                                    Log.i("currcode", purchaseRequest.getCurrencyCode());
                                    C9429e<?> c9429e23 = new C9429e<>(EnumC9428d.ALPHA, purchaseRequest.getPinData(), 16);
                                    C9429e<?> c9429e24 = new C9429e<>(EnumC9428d.LLLVAR, purchaseRequest.getIccData());
                                    Log.i("icc", purchaseRequest.getIccData());
                                    C9429e<?> c9429e25 = new C9429e<>(EnumC9428d.LLLVAR, purchaseRequest.getTransportData());
                                    Log.i("icc", purchaseRequest.getTransportData());
                                    C9429e<?> c9429e26 = new C9429e<>(EnumC9428d.LLLVAR, purchaseRequest.getPosDataCode());
                                    Log.i("icc", purchaseRequest.getPosDataCode());
                                    C9429e<?> c9429e27 = new C9429e<>(EnumC9428d.ALPHA, new String(new byte[]{0}), 64);
                                    c9427c.m14773i(2, c9429e);
                                    c9427c.m14773i(3, c9429e2);
                                    c9427c.m14773i(4, c9429e3);
                                    c9427c.m14773i(7, c9429e4);
                                    c9427c.m14773i(11, c9429e5);
                                    c9427c.m14773i(12, c9429e6);
                                    c9427c.m14773i(13, c9429e7);
                                    c9427c.m14773i(14, c9429e8);
                                    c9427c.m14773i(18, c9429e9);
                                    c9427c.m14773i(22, c9429e10);
                                    c9427c.m14773i(23, c9429e11);
                                    c9427c.m14773i(25, c9429e12);
                                    c9427c.m14773i(26, c9429e13);
                                    c9427c.m14773i(28, c9429e14);
                                    c9427c.m14773i(32, c9429e15);
                                    c9427c.m14773i(35, c9429e16);
                                    c9427c.m14773i(37, c9429e17);
                                    Log.i("PAYPADSDK", c9429e17.toString());
                                    c9427c.m14773i(40, c9429e18);
                                    c9427c.m14773i(41, c9429e19);
                                    c9427c.m14773i(42, c9429e20);
                                    c9427c.m14773i(43, c9429e21);
                                    c9427c.m14773i(49, c9429e22);
                                    if (purchaseRequest.getPinData() != null) {
                                        try {
                                            c9427c.m14773i(52, c9429e23);
                                            Log.i("pin", purchaseRequest.getPinData());
                                        } catch (ConnectException unused13) {
                                            context3 = context;
                                            str10 = str16;
                                            str8 = str14;
                                            str9 = str15;
                                            purchaseResponse = null;
                                            Globals.responseCode = str5;
                                            Globals.appResponse = str2;
                                            Globals.returnMessage = str;
                                            Globals.authCode = str6;
                                            Intent intent422 = new Intent();
                                            intent422.setAction(str10);
                                            intent422.putExtra(str9, str8);
                                            context3.sendBroadcast(intent422);
                                            return purchaseResponse;
                                        } catch (ConnectTimeoutException unused14) {
                                            context2 = context;
                                            str7 = str16;
                                            str3 = str14;
                                            str4 = str15;
                                            purchaseResponse = null;
                                            Globals.responseCode = str5;
                                            Globals.appResponse = str2;
                                            Globals.returnMessage = str;
                                            Globals.authCode = str6;
                                            Intent intent2222 = new Intent();
                                            intent2222.setAction(str7);
                                            intent2222.putExtra(str4, str3);
                                            context2.sendBroadcast(intent2222);
                                            return purchaseResponse;
                                        } catch (Exception e3) {
                                            e = e3;
                                            purchaseResponse = null;
                                            e.printStackTrace();
                                            Globals.responseCode = str5;
                                            Globals.appResponse = "UNEXPECTED ERROR ";
                                            Globals.returnMessage = "UNEXPECTED\n ERROR ";
                                            Globals.authCode = str6;
                                            Intent intent32 = new Intent();
                                            intent32.setAction(str16);
                                            intent32.putExtra(str15, str14);
                                            context.sendBroadcast(intent32);
                                            return purchaseResponse;
                                        }
                                    }
                                    c9427c.m14773i(55, c9429e24);
                                    c9427c.m14773i(59, c9429e25);
                                    c9427c.m14773i(123, c9429e26);
                                    c9427c.m14773i(128, c9429e27);
                                    byte[] m14770l = c9427c.m14770l();
                                    int length2 = m14770l.length;
                                    int i3 = length2 - 64;
                                    byte[] bArr2 = new byte[i3];
                                    if (length2 >= 64) {
                                        System.arraycopy(m14770l, 0, bArr2, 0, i3);
                                    }
                                    try {
                                        c9427c.m14773i(128, new C9429e<>(EnumC9428d.ALPHA, generateHash256Value(bArr2, bArr), 64));
                                        byte[] m14770l2 = c9427c.m14770l();
                                        int length3 = m14770l2.length;
                                        byte[] concat = concat(new byte[]{(byte) (length3 >> 8), (byte) length3}, m14770l2);
                                        Log.i("PAYPADSDK", new String(concat));
                                        X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.models.messaging.nibss.NibssIsoProcessor.1
                                            @Override // javax.net.ssl.X509TrustManager
                                            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str17) throws CertificateException {
                                            }

                                            @Override // javax.net.ssl.X509TrustManager
                                            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str17) throws CertificateException {
                                            }

                                            @Override // javax.net.ssl.X509TrustManager
                                            public X509Certificate[] getAcceptedIssuers() {
                                                return null;
                                            }
                                        };
                                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                                        TrustManager[] trustManagerArr = {x509TrustManager};
                                        purchaseResponse2 = null;
                                        try {
                                            sSLContext.init(null, trustManagerArr, null);
                                            Socket createSocket = sSLContext.getSocketFactory().createSocket();
                                            createSocket.connect(new InetSocketAddress(Globals.ipAddress, Globals.port), 60000);
                                            createSocket.setSoTimeout(75000);
                                            Globals.purchaseRequest = purchaseRequest;
                                            Globals.TSK = bArr;
                                            if (createSocket.isConnected()) {
                                                System.out.println("I am connected");
                                                socketPluger = new NibssSocketManager(createSocket);
                                            }
                                            socketPluger.sendData(concat);
                                            byte[] receive = socketPluger.receive();
                                            Log.i("PAYPADSDKRESPONSE", new String(receive));
                                            C9430f c9430f = new C9430f();
                                            c9430f.m14755a(c9427c);
                                            c9430f.m14747i(true);
                                            c9430f.m14739q(false);
                                            c9430f.m14738r(false);
                                            c9430f.m14744l(-1);
                                            c9430f.m14742n(false);
                                            c9430f.m14745k("assets/isoconfig.xml");
                                            C9427c m14748h = c9430f.m14748h(receive, 0);
                                            if (m14748h != null) {
                                                PurchaseResponse purchaseResponse3 = new PurchaseResponse();
                                                try {
                                                    if (m14748h.m14777e(38)) {
                                                        Globals.authCode = (String) m14748h.m14779c(38);
                                                    } else {
                                                        Globals.authCode = str6;
                                                    }
                                                    if (m14748h.m14777e(39)) {
                                                        purchaseResponse3.setField39((String) m14748h.m14779c(39));
                                                    }
                                                    if (m14748h.m14777e(55)) {
                                                        String str17 = (String) m14748h.m14779c(55);
                                                        Globals.icc = str17;
                                                        Log.i("PAYPADSDKRESPONSEICC", str17);
                                                    }
                                                    purchaseResponse = purchaseResponse3;
                                                } catch (ConnectException unused15) {
                                                    context3 = context;
                                                    purchaseResponse = purchaseResponse3;
                                                    str10 = str16;
                                                    str8 = str14;
                                                    str9 = str15;
                                                    Globals.responseCode = str5;
                                                    Globals.appResponse = str2;
                                                    Globals.returnMessage = str;
                                                    Globals.authCode = str6;
                                                    Intent intent4222 = new Intent();
                                                    intent4222.setAction(str10);
                                                    intent4222.putExtra(str9, str8);
                                                    context3.sendBroadcast(intent4222);
                                                    return purchaseResponse;
                                                } catch (ConnectTimeoutException unused16) {
                                                    context2 = context;
                                                    purchaseResponse = purchaseResponse3;
                                                    str7 = str16;
                                                    str3 = str14;
                                                    str4 = str15;
                                                    Globals.responseCode = str5;
                                                    Globals.appResponse = str2;
                                                    Globals.returnMessage = str;
                                                    Globals.authCode = str6;
                                                    Intent intent22222 = new Intent();
                                                    intent22222.setAction(str7);
                                                    intent22222.putExtra(str4, str3);
                                                    context2.sendBroadcast(intent22222);
                                                    return purchaseResponse;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    purchaseResponse = purchaseResponse3;
                                                    e.printStackTrace();
                                                    Globals.responseCode = str5;
                                                    Globals.appResponse = "UNEXPECTED ERROR ";
                                                    Globals.returnMessage = "UNEXPECTED\n ERROR ";
                                                    Globals.authCode = str6;
                                                    Intent intent322 = new Intent();
                                                    intent322.setAction(str16);
                                                    intent322.putExtra(str15, str14);
                                                    context.sendBroadcast(intent322);
                                                    return purchaseResponse;
                                                }
                                            } else {
                                                purchaseResponse = null;
                                            }
                                            try {
                                                Log.i("PAYPADSDK39", purchaseResponse.getField39());
                                                purchaseResponse.returnMessage();
                                                Globals.responseCode = purchaseResponse.getField39();
                                                Globals.appResponse = purchaseResponse.messages.get(purchaseResponse.getField39());
                                                getPinpadResponse();
                                            } catch (ConnectException unused17) {
                                                context3 = context;
                                                str10 = str16;
                                                str8 = str14;
                                                str9 = str15;
                                                Globals.responseCode = str5;
                                                Globals.appResponse = str2;
                                                Globals.returnMessage = str;
                                                Globals.authCode = str6;
                                                Intent intent42222 = new Intent();
                                                intent42222.setAction(str10);
                                                intent42222.putExtra(str9, str8);
                                                context3.sendBroadcast(intent42222);
                                                return purchaseResponse;
                                            } catch (ConnectTimeoutException unused18) {
                                                context2 = context;
                                                str7 = str16;
                                                str3 = str14;
                                                str4 = str15;
                                                Globals.responseCode = str5;
                                                Globals.appResponse = str2;
                                                Globals.returnMessage = str;
                                                Globals.authCode = str6;
                                                Intent intent222222 = new Intent();
                                                intent222222.setAction(str7);
                                                intent222222.putExtra(str4, str3);
                                                context2.sendBroadcast(intent222222);
                                                return purchaseResponse;
                                            } catch (Exception e5) {
                                                e = e5;
                                                e.printStackTrace();
                                                Globals.responseCode = str5;
                                                Globals.appResponse = "UNEXPECTED ERROR ";
                                                Globals.returnMessage = "UNEXPECTED\n ERROR ";
                                                Globals.authCode = str6;
                                                Intent intent3222 = new Intent();
                                                intent3222.setAction(str16);
                                                intent3222.putExtra(str15, str14);
                                                context.sendBroadcast(intent3222);
                                                return purchaseResponse;
                                            }
                                        } catch (ConnectException unused19) {
                                            context3 = context;
                                            purchaseResponse = purchaseResponse2;
                                            str10 = str16;
                                            str8 = str14;
                                            str9 = str15;
                                            Globals.responseCode = str5;
                                            Globals.appResponse = str2;
                                            Globals.returnMessage = str;
                                            Globals.authCode = str6;
                                            Intent intent422222 = new Intent();
                                            intent422222.setAction(str10);
                                            intent422222.putExtra(str9, str8);
                                            context3.sendBroadcast(intent422222);
                                            return purchaseResponse;
                                        } catch (ConnectTimeoutException unused20) {
                                            context2 = context;
                                            purchaseResponse = purchaseResponse2;
                                            str7 = str16;
                                            str3 = str14;
                                            str4 = str15;
                                            Globals.responseCode = str5;
                                            Globals.appResponse = str2;
                                            Globals.returnMessage = str;
                                            Globals.authCode = str6;
                                            Intent intent2222222 = new Intent();
                                            intent2222222.setAction(str7);
                                            intent2222222.putExtra(str4, str3);
                                            context2.sendBroadcast(intent2222222);
                                            return purchaseResponse;
                                        } catch (Exception e6) {
                                            e = e6;
                                            purchaseResponse = purchaseResponse2;
                                            e.printStackTrace();
                                            Globals.responseCode = str5;
                                            Globals.appResponse = "UNEXPECTED ERROR ";
                                            Globals.returnMessage = "UNEXPECTED\n ERROR ";
                                            Globals.authCode = str6;
                                            Intent intent32222 = new Intent();
                                            intent32222.setAction(str16);
                                            intent32222.putExtra(str15, str14);
                                            context.sendBroadcast(intent32222);
                                            return purchaseResponse;
                                        }
                                    } catch (SocketTimeoutException unused21) {
                                        context4 = context;
                                        str13 = str16;
                                        str11 = str14;
                                        str12 = str15;
                                        reversal(purchaseRequest, bArr, context);
                                        PurchaseResponse purchaseResponse4 = new PurchaseResponse();
                                        Globals.responseCode = str5;
                                        Globals.appResponse = "TRANSACTION TIMED OUT ";
                                        Globals.returnMessage = "TRANSACTION\n TIMED OUT ";
                                        Globals.authCode = str6;
                                        Intent intent5 = new Intent();
                                        intent5.setAction(str13);
                                        intent5.putExtra(str12, str11);
                                        context4.sendBroadcast(intent5);
                                        return purchaseResponse4;
                                    }
                                } catch (SocketTimeoutException unused22) {
                                }
                            } catch (SocketTimeoutException unused23) {
                            }
                        } catch (ConnectException unused24) {
                            purchaseResponse2 = null;
                            context3 = context;
                            purchaseResponse = purchaseResponse2;
                            str10 = str16;
                            str8 = str14;
                            str9 = str15;
                            Globals.responseCode = str5;
                            Globals.appResponse = str2;
                            Globals.returnMessage = str;
                            Globals.authCode = str6;
                            Intent intent4222222 = new Intent();
                            intent4222222.setAction(str10);
                            intent4222222.putExtra(str9, str8);
                            context3.sendBroadcast(intent4222222);
                            return purchaseResponse;
                        } catch (ConnectTimeoutException unused25) {
                            purchaseResponse2 = null;
                            context2 = context;
                            purchaseResponse = purchaseResponse2;
                            str7 = str16;
                            str3 = str14;
                            str4 = str15;
                            Globals.responseCode = str5;
                            Globals.appResponse = str2;
                            Globals.returnMessage = str;
                            Globals.authCode = str6;
                            Intent intent22222222 = new Intent();
                            intent22222222.setAction(str7);
                            intent22222222.putExtra(str4, str3);
                            context2.sendBroadcast(intent22222222);
                            return purchaseResponse;
                        } catch (Exception e7) {
                            e = e7;
                            purchaseResponse2 = null;
                            purchaseResponse = purchaseResponse2;
                            e.printStackTrace();
                            Globals.responseCode = str5;
                            Globals.appResponse = "UNEXPECTED ERROR ";
                            Globals.returnMessage = "UNEXPECTED\n ERROR ";
                            Globals.authCode = str6;
                            Intent intent322222 = new Intent();
                            intent322222.setAction(str16);
                            intent322222.putExtra(str15, str14);
                            context.sendBroadcast(intent322222);
                            return purchaseResponse;
                        }
                    } catch (ConnectException unused26) {
                        str6 = "Not authenticated";
                        purchaseResponse2 = null;
                        context3 = context;
                        purchaseResponse = purchaseResponse2;
                        str10 = str16;
                        str8 = str14;
                        str9 = str15;
                        Globals.responseCode = str5;
                        Globals.appResponse = str2;
                        Globals.returnMessage = str;
                        Globals.authCode = str6;
                        Intent intent42222222 = new Intent();
                        intent42222222.setAction(str10);
                        intent42222222.putExtra(str9, str8);
                        context3.sendBroadcast(intent42222222);
                        return purchaseResponse;
                    } catch (SocketTimeoutException unused27) {
                        str6 = "Not authenticated";
                        context4 = context;
                        str13 = str16;
                        str11 = str14;
                        str12 = str15;
                        reversal(purchaseRequest, bArr, context);
                        PurchaseResponse purchaseResponse42 = new PurchaseResponse();
                        Globals.responseCode = str5;
                        Globals.appResponse = "TRANSACTION TIMED OUT ";
                        Globals.returnMessage = "TRANSACTION\n TIMED OUT ";
                        Globals.authCode = str6;
                        Intent intent52 = new Intent();
                        intent52.setAction(str13);
                        intent52.putExtra(str12, str11);
                        context4.sendBroadcast(intent52);
                        return purchaseResponse42;
                    } catch (ConnectTimeoutException unused28) {
                        str6 = "Not authenticated";
                        purchaseResponse2 = null;
                        context2 = context;
                        purchaseResponse = purchaseResponse2;
                        str7 = str16;
                        str3 = str14;
                        str4 = str15;
                        Globals.responseCode = str5;
                        Globals.appResponse = str2;
                        Globals.returnMessage = str;
                        Globals.authCode = str6;
                        Intent intent222222222 = new Intent();
                        intent222222222.setAction(str7);
                        intent222222222.putExtra(str4, str3);
                        context2.sendBroadcast(intent222222222);
                        return purchaseResponse;
                    } catch (Exception e8) {
                        e = e8;
                        str6 = "Not authenticated";
                        purchaseResponse2 = null;
                        purchaseResponse = purchaseResponse2;
                        e.printStackTrace();
                        Globals.responseCode = str5;
                        Globals.appResponse = "UNEXPECTED ERROR ";
                        Globals.returnMessage = "UNEXPECTED\n ERROR ";
                        Globals.authCode = str6;
                        Intent intent3222222 = new Intent();
                        intent3222222.setAction(str16);
                        intent3222222.putExtra(str15, str14);
                        context.sendBroadcast(intent3222222);
                        return purchaseResponse;
                    }
                } catch (ConnectException unused29) {
                    str5 = "XX";
                } catch (SocketTimeoutException unused30) {
                    str5 = "XX";
                } catch (ConnectTimeoutException unused31) {
                    str5 = "XX";
                } catch (Exception e9) {
                    e = e9;
                    str5 = "XX";
                    str6 = "Not authenticated";
                    purchaseResponse2 = null;
                    purchaseResponse = purchaseResponse2;
                    e.printStackTrace();
                    Globals.responseCode = str5;
                    Globals.appResponse = "UNEXPECTED ERROR ";
                    Globals.returnMessage = "UNEXPECTED\n ERROR ";
                    Globals.authCode = str6;
                    Intent intent32222222 = new Intent();
                    intent32222222.setAction(str16);
                    intent32222222.putExtra(str15, str14);
                    context.sendBroadcast(intent32222222);
                    return purchaseResponse;
                }
            } catch (ConnectException unused32) {
                str5 = "XX";
                str6 = "Not authenticated";
                context3 = context;
                purchaseResponse = null;
                str10 = "com.esl.paypadlib";
            } catch (SocketTimeoutException unused33) {
                str5 = "XX";
                str6 = "Not authenticated";
                context4 = context;
                str13 = "com.esl.paypadlib";
            } catch (ConnectTimeoutException unused34) {
                str5 = "XX";
                str6 = "Not authenticated";
                context2 = context;
                purchaseResponse = null;
                str7 = "com.esl.paypadlib";
            } catch (Exception e10) {
                e = e10;
                str16 = "com.esl.paypadlib";
                str5 = "XX";
                str6 = "Not authenticated";
                purchaseResponse2 = null;
                purchaseResponse = purchaseResponse2;
                e.printStackTrace();
                Globals.responseCode = str5;
                Globals.appResponse = "UNEXPECTED ERROR ";
                Globals.returnMessage = "UNEXPECTED\n ERROR ";
                Globals.authCode = str6;
                Intent intent322222222 = new Intent();
                intent322222222.setAction(str16);
                intent322222222.putExtra(str15, str14);
                context.sendBroadcast(intent322222222);
                return purchaseResponse;
            }
        } catch (ConnectException unused35) {
            str5 = "XX";
            str6 = "Not authenticated";
            context3 = context;
            purchaseResponse = null;
            str9 = "response";
            str10 = "com.esl.paypadlib";
            str8 = str14;
        } catch (SocketTimeoutException unused36) {
            str5 = "XX";
            str6 = "Not authenticated";
            context4 = context;
            str12 = "response";
            str13 = "com.esl.paypadlib";
            str11 = str14;
        } catch (ConnectTimeoutException unused37) {
            str5 = "XX";
            str6 = "Not authenticated";
            context2 = context;
            purchaseResponse = null;
            str4 = "response";
            str7 = "com.esl.paypadlib";
            str3 = str14;
        } catch (Exception e11) {
            e = e11;
            str15 = "response";
            str16 = "com.esl.paypadlib";
            str5 = "XX";
            str6 = "Not authenticated";
            purchaseResponse2 = null;
            purchaseResponse = purchaseResponse2;
            e.printStackTrace();
            Globals.responseCode = str5;
            Globals.appResponse = "UNEXPECTED ERROR ";
            Globals.returnMessage = "UNEXPECTED\n ERROR ";
            Globals.authCode = str6;
            Intent intent3222222222 = new Intent();
            intent3222222222.setAction(str16);
            intent3222222222.putExtra(str15, str14);
            context.sendBroadcast(intent3222222222);
            return purchaseResponse;
        }
        return purchaseResponse;
    }

    private static void resize(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i = 0; i <= length - 1; i++) {
            bArr2[i] = bArr[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:106:0x0483
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void reversal(com.paypad.models.messaging.nibss._0200Request r38, byte[] r39, android.content.Context r40) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.models.messaging.nibss.NibssIsoProcessor.reversal(com.paypad.models.messaging.nibss._0200Request, byte[], android.content.Context):void");
    }

    public static CashBackResponse process(CashBackRequest cashBackRequest, byte[] bArr) {
        CashBackResponse cashBackResponse;
        try {
            C9427c c9427c = new C9427c();
            c9427c.m14772j(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
            C9429e<?> c9429e = new C9429e<>(EnumC9428d.LLVAR, cashBackRequest.getPan());
            C9429e<?> c9429e2 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getProcessingCode(), 6);
            C9429e<?> c9429e3 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getTransactionAmount(), 12);
            C9429e<?> c9429e4 = new C9429e<>(EnumC9428d.DATE10, cashBackRequest.getTransmissionDateTime());
            C9429e<?> c9429e5 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getStan(), 6);
            C9429e<?> c9429e6 = new C9429e<>(EnumC9428d.TIME, cashBackRequest.getLocalTransactionTime());
            C9429e<?> c9429e7 = new C9429e<>(EnumC9428d.DATE4, cashBackRequest.getLocalTransactionDate());
            C9429e<?> c9429e8 = new C9429e<>(EnumC9428d.DATE4, cashBackRequest.getCardExpirationDate());
            C9429e<?> c9429e9 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getMerchantType(), 4);
            C9429e<?> c9429e10 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getPosEntryMode(), 3);
            C9429e<?> c9429e11 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getCardSequenceNumber(), 3);
            C9429e<?> c9429e12 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getPosConditionCode(), 2);
            C9429e<?> c9429e13 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getPosPinCaptureCode(), 2);
            C9429e<?> c9429e14 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getTransactionFee(), 9);
            C9429e<?> c9429e15 = new C9429e<>(EnumC9428d.LLVAR, cashBackRequest.getAcquiringInstIdCode());
            C9429e<?> c9429e16 = new C9429e<>(EnumC9428d.LLVAR, cashBackRequest.getTrack2Data());
            C9429e<?> c9429e17 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getRetrievalReferenceNumber(), 12);
            C9429e<?> c9429e18 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getServiceRestrictionCode(), 3);
            C9429e<?> c9429e19 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getTerminalId(), 8);
            C9429e<?> c9429e20 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getCardAcceptorIdCode(), 15);
            cashBackRequest.getCardAcceptorNameLocation();
            C9429e<?> c9429e21 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getCardAcceptorNameLocation(), 40);
            C9429e<?> c9429e22 = new C9429e<>(EnumC9428d.NUMERIC, cashBackRequest.getCurrencyCode(), 3);
            C9429e<?> c9429e23 = new C9429e<>(EnumC9428d.ALPHA, cashBackRequest.getPinData(), 16);
            C9429e<?> c9429e24 = new C9429e<>(EnumC9428d.LLLVAR, cashBackRequest.getAdditionalAmounts());
            C9429e<?> c9429e25 = new C9429e<>(EnumC9428d.LLLVAR, cashBackRequest.getIccData());
            C9429e<?> c9429e26 = new C9429e<>(EnumC9428d.LLLVAR, cashBackRequest.getTransportData());
            C9429e<?> c9429e27 = new C9429e<>(EnumC9428d.LLLVAR, cashBackRequest.getPosDataCode());
            C9429e<?> c9429e28 = new C9429e<>(EnumC9428d.ALPHA, new String(new byte[]{0}), 64);
            c9427c.m14773i(2, c9429e);
            c9427c.m14773i(3, c9429e2);
            c9427c.m14773i(4, c9429e3);
            c9427c.m14773i(7, c9429e4);
            c9427c.m14773i(11, c9429e5);
            c9427c.m14773i(12, c9429e6);
            c9427c.m14773i(13, c9429e7);
            c9427c.m14773i(14, c9429e8);
            c9427c.m14773i(18, c9429e9);
            c9427c.m14773i(22, c9429e10);
            c9427c.m14773i(23, c9429e11);
            c9427c.m14773i(25, c9429e12);
            c9427c.m14773i(26, c9429e13);
            c9427c.m14773i(28, c9429e14);
            c9427c.m14773i(32, c9429e15);
            c9427c.m14773i(35, c9429e16);
            c9427c.m14773i(37, c9429e17);
            Log.i("PAYPADSDK", c9429e17.toString());
            c9427c.m14773i(40, c9429e18);
            c9427c.m14773i(41, c9429e19);
            c9427c.m14773i(42, c9429e20);
            c9427c.m14773i(43, c9429e21);
            c9427c.m14773i(49, c9429e22);
            if (cashBackRequest.getPinData() != null) {
                c9427c.m14773i(52, c9429e23);
            }
            c9427c.m14773i(54, c9429e24);
            c9427c.m14773i(55, c9429e25);
            c9427c.m14773i(59, c9429e26);
            c9427c.m14773i(123, c9429e27);
            c9427c.m14773i(128, c9429e28);
            byte[] m14770l = c9427c.m14770l();
            int length = m14770l.length;
            int i = length - 64;
            byte[] bArr2 = new byte[i];
            if (length >= 64) {
                System.arraycopy(m14770l, 0, bArr2, 0, i);
            }
            c9427c.m14773i(128, new C9429e<>(EnumC9428d.ALPHA, generateHash256Value(bArr2, bArr), 64));
            byte[] m14770l2 = c9427c.m14770l();
            int length2 = m14770l2.length;
            byte[] concat = concat(new byte[]{(byte) (length2 >> 8), (byte) length2}, m14770l2);
            Log.i("PAYPADSDK", new String(concat));
            NibssSocketManager nibssSocketManager = new NibssSocketManager(new Socket("196.6.103.18", 5009));
            nibssSocketManager.sendData(concat);
            byte[] receive = nibssSocketManager.receive();
            Log.i("PAYPADSDKRESPONSE", new String(receive));
            C9430f c9430f = new C9430f();
            c9430f.m14755a(c9427c);
            c9430f.m14747i(true);
            c9430f.m14739q(false);
            c9430f.m14738r(false);
            c9430f.m14744l(-1);
            c9430f.m14742n(false);
            c9430f.m14745k("assets/isoconfig.xml");
            C9427c m14748h = c9430f.m14748h(receive, 0);
            if (m14748h != null) {
                cashBackResponse = new CashBackResponse();
                try {
                    if (m14748h.m14777e(39)) {
                        cashBackResponse.setField39((String) m14748h.m14779c(39));
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("ISOPACKEGE", e.getMessage());
                    e.printStackTrace();
                    return cashBackResponse;
                }
            } else {
                cashBackResponse = null;
            }
            Log.i("PAYPADSDK39", cashBackResponse.getField39());
            cashBackResponse.returnMessage();
            Globals.responseCode = cashBackResponse.getField39();
            Globals.response1 = cashBackResponse.messages.get(cashBackResponse.getField39());
        } catch (Exception e2) {
            e = e2;
            cashBackResponse = null;
        }
        return cashBackResponse;
    }

    public static CashAdvanceResponse process(CashAdvanceRequest cashAdvanceRequest, byte[] bArr) {
        CashAdvanceResponse cashAdvanceResponse;
        try {
            C9427c c9427c = new C9427c();
            c9427c.m14772j(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
            C9429e<?> c9429e = new C9429e<>(EnumC9428d.LLVAR, cashAdvanceRequest.getPan());
            C9429e<?> c9429e2 = new C9429e<>(EnumC9428d.NUMERIC, cashAdvanceRequest.getProcessingCode(), 6);
            C9429e<?> c9429e3 = new C9429e<>(EnumC9428d.AMOUNT, cashAdvanceRequest.getTransactionAmount(), 12);
            C9429e<?> c9429e4 = new C9429e<>(EnumC9428d.DATE10, cashAdvanceRequest.getTransmissionDateTime());
            C9429e<?> c9429e5 = new C9429e<>(EnumC9428d.NUMERIC, cashAdvanceRequest.getStan(), 6);
            C9429e<?> c9429e6 = new C9429e<>(EnumC9428d.TIME, cashAdvanceRequest.getLocalTransactionTime());
            C9429e<?> c9429e7 = new C9429e<>(EnumC9428d.DATE4, cashAdvanceRequest.getLocalTransactionDate());
            C9429e<?> c9429e8 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getMerchantType(), 4);
            C9429e<?> c9429e9 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getPosEntryMode(), 3);
            C9429e<?> c9429e10 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getCardSequenceNumber(), 3);
            C9429e<?> c9429e11 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getPosConditionCode(), 2);
            C9429e<?> c9429e12 = new C9429e<>(EnumC9428d.NUMERIC, cashAdvanceRequest.getPosPinCaptureCode(), 2);
            C9429e<?> c9429e13 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getTransactionFee(), 9);
            C9429e<?> c9429e14 = new C9429e<>(EnumC9428d.LLVAR, cashAdvanceRequest.getAcquiringInstIdCode());
            C9429e<?> c9429e15 = new C9429e<>(EnumC9428d.LLVAR, cashAdvanceRequest.getTrack2Data());
            C9429e<?> c9429e16 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getRetrievalReferenceNumber(), 12);
            C9429e<?> c9429e17 = new C9429e<>(EnumC9428d.NUMERIC, cashAdvanceRequest.getServiceRestrictionCode(), 3);
            C9429e<?> c9429e18 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getTerminalId(), 8);
            C9429e<?> c9429e19 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getCardAcceptorIdCode(), 15);
            cashAdvanceRequest.getCardAcceptorNameLocation();
            C9429e<?> c9429e20 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getCardAcceptorNameLocation(), 40);
            C9429e<?> c9429e21 = new C9429e<>(EnumC9428d.NUMERIC, cashAdvanceRequest.getCurrencyCode(), 3);
            C9429e<?> c9429e22 = new C9429e<>(EnumC9428d.ALPHA, cashAdvanceRequest.getPinData(), 16);
            C9429e<?> c9429e23 = new C9429e<>(EnumC9428d.LLLVAR, cashAdvanceRequest.getAdditionalAmounts());
            C9429e<?> c9429e24 = new C9429e<>(EnumC9428d.LLLVAR, cashAdvanceRequest.getIccData());
            C9429e<?> c9429e25 = new C9429e<>(EnumC9428d.LLLVAR, cashAdvanceRequest.getPosDataCode());
            C9429e<?> c9429e26 = new C9429e<>(EnumC9428d.ALPHA, new String(new byte[]{0}), 64);
            c9427c.m14773i(2, c9429e);
            c9427c.m14773i(3, c9429e2);
            c9427c.m14773i(4, c9429e3);
            c9427c.m14773i(7, c9429e4);
            c9427c.m14773i(11, c9429e5);
            c9427c.m14773i(12, c9429e6);
            c9427c.m14773i(13, c9429e7);
            c9427c.m14773i(18, c9429e8);
            c9427c.m14773i(22, c9429e9);
            c9427c.m14773i(23, c9429e10);
            c9427c.m14773i(25, c9429e11);
            c9427c.m14773i(26, c9429e12);
            c9427c.m14773i(28, c9429e13);
            c9427c.m14773i(32, c9429e14);
            c9427c.m14773i(35, c9429e15);
            c9427c.m14773i(37, c9429e16);
            Log.i("PAYPADSDK", c9429e16.toString());
            c9427c.m14773i(40, c9429e17);
            c9427c.m14773i(41, c9429e18);
            c9427c.m14773i(42, c9429e19);
            c9427c.m14773i(43, c9429e20);
            c9427c.m14773i(49, c9429e21);
            if (cashAdvanceRequest.getPinData() != null) {
                c9427c.m14773i(52, c9429e22);
            }
            c9427c.m14773i(54, c9429e23);
            c9427c.m14773i(55, c9429e24);
            c9427c.m14773i(123, c9429e25);
            c9427c.m14773i(128, c9429e26);
            byte[] m14770l = c9427c.m14770l();
            int length = m14770l.length;
            int i = length - 64;
            byte[] bArr2 = new byte[i];
            if (length >= 64) {
                System.arraycopy(m14770l, 0, bArr2, 0, i);
            }
            c9427c.m14773i(128, new C9429e<>(EnumC9428d.ALPHA, generateHash256Value(bArr2, bArr), 64));
            byte[] m14770l2 = c9427c.m14770l();
            int length2 = m14770l2.length;
            byte[] concat = concat(new byte[]{(byte) (length2 >> 8), (byte) length2}, m14770l2);
            Log.i("PAYPADSDK", new String(concat));
            NibssSocketManager nibssSocketManager = new NibssSocketManager(new Socket("196.6.103.18", 5009));
            nibssSocketManager.sendData(concat);
            byte[] receive = nibssSocketManager.receive();
            Log.i("PAYPADSDKRESPONSE", new String(receive));
            C9430f c9430f = new C9430f();
            c9430f.m14755a(c9427c);
            c9430f.m14747i(true);
            c9430f.m14739q(false);
            c9430f.m14738r(false);
            c9430f.m14744l(-1);
            c9430f.m14742n(false);
            c9430f.m14745k("assets/isoconfig.xml");
            C9427c m14748h = c9430f.m14748h(receive, 0);
            if (m14748h != null) {
                cashAdvanceResponse = new CashAdvanceResponse();
                try {
                    if (m14748h.m14777e(39)) {
                        cashAdvanceResponse.setField39((String) m14748h.m14779c(39));
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("ISOPACKEGE", e.getMessage());
                    e.printStackTrace();
                    return cashAdvanceResponse;
                }
            } else {
                cashAdvanceResponse = null;
            }
            Log.i("PAYPADSDK39", cashAdvanceResponse.getField39());
            cashAdvanceResponse.returnMessage();
            Globals.responseCode = cashAdvanceResponse.getField39();
            Globals.response1 = cashAdvanceResponse.messages.get(cashAdvanceResponse.getField39());
        } catch (Exception e2) {
            e = e2;
            cashAdvanceResponse = null;
        }
        return cashAdvanceResponse;
    }
}
