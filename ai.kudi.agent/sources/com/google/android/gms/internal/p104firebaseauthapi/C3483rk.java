package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rk */
/* loaded from: classes2.dex */
public final class C3483rk {
    /* renamed from: a */
    public static void m30342a(String str, InterfaceC3690zj interfaceC3690zj, InterfaceC3431pk interfaceC3431pk, Type type, C3111dk c3111dk) {
        InputStream errorStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = interfaceC3690zj.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            c3111dk.m31237a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (m30341b(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (!m30341b(responseCode)) {
                    interfaceC3431pk.mo29885e((String) C3664yj.m29942a(sb2, String.class));
                } else {
                    interfaceC3431pk.mo29886b((InterfaceC3030ak) C3664yj.m29942a(sb2, type));
                }
            } catch (Throwable th3) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (zzpz e) {
            e = e;
            interfaceC3431pk.mo29885e(e.getMessage());
        } catch (SocketTimeoutException unused) {
            interfaceC3431pk.mo29885e("TIMEOUT");
        } catch (UnknownHostException unused2) {
            interfaceC3431pk.mo29885e("<<Network Error>>");
        } catch (IOException e2) {
            e = e2;
            interfaceC3431pk.mo29885e(e.getMessage());
        } catch (JSONException e3) {
            e = e3;
            interfaceC3431pk.mo29885e(e.getMessage());
        }
    }

    /* renamed from: b */
    private static final boolean m30341b(int i) {
        return i >= 200 && i < 300;
    }
}
