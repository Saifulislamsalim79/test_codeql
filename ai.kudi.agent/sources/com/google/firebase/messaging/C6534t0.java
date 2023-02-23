package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C1335a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: classes2.dex */
class C6534t0 {

    /* renamed from: a */
    final SharedPreferences f15770a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.t0$a */
    /* loaded from: classes2.dex */
    public static class C6535a {

        /* renamed from: d */
        private static final long f15771d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f15772a;

        /* renamed from: b */
        final String f15773b;

        /* renamed from: c */
        final long f15774c;

        private C6535a(String str, String str2, long j) {
            this.f15772a = str;
            this.f15773b = str2;
            this.f15774c = j;
        }

        /* renamed from: a */
        static String m21695a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
                return null;
            }
        }

        /* renamed from: c */
        static C6535a m21693c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C6535a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                    return null;
                }
            }
            return new C6535a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m21694b(String str) {
            return System.currentTimeMillis() > this.f15774c + f15771d || !str.equals(this.f15773b);
        }
    }

    public C6534t0(Context context) {
        this.f15770a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m21701a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m21701a(Context context, String str) {
        File file = new File(C1335a.m36318j(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m21697e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m21699c();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: b */
    private String m21700b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized void m21699c() {
        this.f15770a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C6535a m21698d(String str, String str2) {
        return C6535a.m21693c(this.f15770a.getString(m21700b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m21697e() {
        return this.f15770a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m21696f(String str, String str2, String str3, String str4) {
        String m21695a = C6535a.m21695a(str3, str4, System.currentTimeMillis());
        if (m21695a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f15770a.edit();
        edit.putString(m21700b(str, str2), m21695a);
        edit.commit();
    }
}
