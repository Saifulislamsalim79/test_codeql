package com.paypad.initialization;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;
import p272h.p273a.p274a.C8211a;
import p272h.p372f.p373a.p374a.C9424a;
/* loaded from: classes2.dex */
public class Activation {
    Context mContext;
    C9424a params;
    ProgressDialog webServiceProgress;

    public Activation(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public void activateMerchant(String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        Activation activation = this;
        try {
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.paypad.initialization.Activation.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str4) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str4) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://ibeta.paypad.com.ng/paypad/webapi/v2/activateterminal").openConnection()));
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("activationCode", str);
            byte[] bytes = jSONObject2.toString().getBytes();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            long responseCode = httpsURLConnection.getResponseCode();
            System.out.print(responseCode);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            JSONObject jSONObject3 = new JSONObject(sb.toString()).getJSONArray("requestResponse").getJSONObject(0);
            String string = jSONObject3.getJSONObject("terminalDetails").getString("terminalId");
            jSONObject3.getString("status-code");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("accountDetails");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("merchantDetails");
            jSONObject4.getJSONArray("posAccounts");
            JSONObject jSONObject6 = jSONObject4.getJSONArray("merchantAdmins").getJSONObject(0);
            String string2 = jSONObject6.getString("email");
            String string3 = jSONObject6.getString(CacheDataSource.PREF_USERNAME);
            String string4 = jSONObject6.getString("phoneNumber");
            String string5 = jSONObject6.getString("merchantId");
            String string6 = jSONObject5.getString("bankId");
            try {
                String string7 = jSONObject5.getString(BanksWithMethods.BANK_NAME);
                try {
                    SharedPreferences sharedPreferences = activation.mContext.getSharedPreferences("Configuration", 0);
                    C8211a.f19743a = sharedPreferences;
                    activation = sharedPreferences.edit();
                    activation.putString(C8211a.f19759q, string);
                    activation.putString(C8211a.f19760r, string5);
                    activation.putString(C8211a.f19762t, string3);
                    activation.putString(C8211a.f19763u, string2);
                    activation.putString(C8211a.f19761s, string4);
                    activation.putString(C8211a.f19764v, string7);
                    activation.putString(C8211a.f19744b, string6);
                    System.out.print("terminal:" + jSONObject.optString("terminalId"));
                    activation.putString(C8211a.f19750h, "01008" + string);
                    activation.commit();
                    try {
                        if (responseCode == 200 && !string.isEmpty()) {
                            Intent intent = new Intent();
                            intent.setAction("com.esl.paypadlib");
                            intent.putExtra("response", "activatecomplete");
                            Activation activation2 = this;
                            activation2.mContext.sendBroadcast(intent);
                            activation = activation2;
                        } else {
                            activation = this;
                            Intent intent2 = new Intent();
                            intent2.setAction("com.esl.paypadlib");
                            str3 = "failedactivation";
                            try {
                                intent2.putExtra("response", str3);
                                str2 = "reason";
                                try {
                                    intent2.putExtra(str2, "Could not connect to Activate");
                                    activation.mContext.sendBroadcast(intent2);
                                    activation = activation;
                                } catch (Exception e) {
                                    e = e;
                                    e.printStackTrace();
                                    Intent intent3 = new Intent();
                                    intent3.setAction("com.esl.paypadlib");
                                    intent3.putExtra("response", str3);
                                    intent3.putExtra(str2, e.getMessage());
                                    activation.mContext.sendBroadcast(intent3);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str2 = "reason";
                                e.printStackTrace();
                                Intent intent32 = new Intent();
                                intent32.setAction("com.esl.paypadlib");
                                intent32.putExtra("response", str3);
                                intent32.putExtra(str2, e.getMessage());
                                activation.mContext.sendBroadcast(intent32);
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = "reason";
                        str3 = "failedactivation";
                        e.printStackTrace();
                        Intent intent322 = new Intent();
                        intent322.setAction("com.esl.paypadlib");
                        intent322.putExtra("response", str3);
                        intent322.putExtra(str2, e.getMessage());
                        activation.mContext.sendBroadcast(intent322);
                    }
                } catch (Exception e4) {
                    e = e4;
                    activation = this;
                }
            } catch (Exception e5) {
                e = e5;
                str3 = "failedactivation";
            }
        } catch (Exception e6) {
            e = e6;
            str2 = "reason";
            str3 = "failedactivation";
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
    }
}
