package com.paypad.initialization;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.paypad.models.messaging.nibss.Globals;
import com.paypad.network.NibssSocketManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import java.util.Calendar;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;
import p272h.p273a.p274a.C8211a;
/* loaded from: classes2.dex */
public class Reversal {
    private static NibssSocketManager socketPluger;

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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:126:0x0503
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void reversal(com.paypad.models.messaging.nibss.PurchaseRequest r44, android.content.Context r45) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.initialization.Reversal.reversal(com.paypad.models.messaging.nibss.PurchaseRequest, android.content.Context):void");
    }

    public boolean logReversal(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("Configuration", 0);
        C8211a.f19743a = sharedPreferences;
        String string = sharedPreferences.getString(C8211a.f19763u, "none");
        String string2 = C8211a.f19743a.getString(C8211a.f19762t, "none");
        String string3 = C8211a.f19743a.getString(C8211a.f19759q, "none");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) Calendar.getInstance().getTime());
        try {
            jSONObject.put("itemPurchased", "REVERSAL");
            jSONObject.put(CacheDataSource.PREF_USERNAME, string2);
            jSONObject.put("rrn", str);
            jSONObject.put("cardNo", Globals.cardNo);
            jSONObject.put("response", Globals.appResponse);
            jSONObject.put("responseCode", Globals.responseCode);
            jSONObject.put("transactionId", "R" + Globals.transactionId);
            jSONObject.put("transactionType", "CARD");
            jSONObject.put("createdOn", format);
            jSONObject.put("email", string);
            jSONObject.put("purchase", Globals.purchase);
            jSONObject.put("total", new BigDecimal(Globals.total));
            jSONObject.put("transactionId", Globals.transactionId);
            jSONObject.put("transactionType", "CARD");
            jSONObject.put("tenderType", Globals.tenderType);
            jSONObject.put("cardHolder", Globals.cardholder);
            jSONObject.put("authCode", "");
            jSONObject.put("stan", str);
            jSONObject.put("terminalId", string3);
            jSONObject.put("location", "Nigeria");
            jSONObject.put("itemPurchased", "");
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.initialization.Reversal.2
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
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
            long responseCode = httpsURLConnection.getResponseCode();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    z = new JSONObject(sb.toString()).optBoolean(TransactionField.STATUS);
                    System.out.print(responseCode);
                    return z;
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return z;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return z;
        } catch (IOException e3) {
            e3.printStackTrace();
            return z;
        } catch (KeyManagementException e4) {
            e4.printStackTrace();
            return z;
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return z;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return z;
        }
    }
}
