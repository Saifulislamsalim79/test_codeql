package com.google.firebase.installations.p160p;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C5988g;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: IidStore.java */
/* renamed from: com.google.firebase.installations.p.b */
/* loaded from: classes2.dex */
public class C6444b {

    /* renamed from: c */
    private static final String[] f15563c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f15564a;

    /* renamed from: b */
    private final String f15565b;

    public C6444b(C5988g c5988g) {
        this.f15564a = c5988g.m23093i().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f15565b = m22025b(c5988g);
    }

    /* renamed from: a */
    private String m22026a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m22025b(C5988g c5988g) {
        String m23066e = c5988g.m23089m().m23066e();
        if (m23066e != null) {
            return m23066e;
        }
        String m23068c = c5988g.m23089m().m23068c();
        if (m23068c.startsWith("1:") || m23068c.startsWith("2:")) {
            String[] split = m23068c.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return m23068c;
    }

    /* renamed from: c */
    private static String m22024c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m22023d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m22022e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m22020g() {
        String string;
        synchronized (this.f15564a) {
            string = this.f15564a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m22019h() {
        synchronized (this.f15564a) {
            String string = this.f15564a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m22022e = m22022e(string);
            if (m22022e == null) {
                return null;
            }
            return m22024c(m22022e);
        }
    }

    /* renamed from: f */
    public String m22021f() {
        synchronized (this.f15564a) {
            String m22020g = m22020g();
            if (m22020g != null) {
                return m22020g;
            }
            return m22019h();
        }
    }

    /* renamed from: i */
    public String m22018i() {
        synchronized (this.f15564a) {
            for (String str : f15563c) {
                String string = this.f15564a.getString(m22026a(this.f15565b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m22023d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
