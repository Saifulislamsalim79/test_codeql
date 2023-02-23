package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.f0 */
/* loaded from: classes2.dex */
public final class C5222f0 {

    /* renamed from: a */
    private static final C5222f0 f12999a = new C5222f0();

    private C5222f0() {
    }

    /* renamed from: b */
    public static C5222f0 m25333b() {
        return f12999a;
    }

    /* renamed from: f */
    private static void m25329f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : sharedPreferences.getAll().keySet()) {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: g */
    private static final SharedPreferences m25328g(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* renamed from: a */
    public final synchronized C5220e0 m25334a(Context context, String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        SharedPreferences m25328g = m25328g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = m25328g.getString(format, null);
        String string2 = m25328g.getString(format2, null);
        String string3 = m25328g.getString(format3, null);
        String string4 = m25328g.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = m25328g.getString(format4, null);
        SharedPreferences.Editor edit = m25328g.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new C5220e0(string, string2, string3, string4, string5);
    }

    /* renamed from: c */
    public final synchronized String m25332c(Context context, String str, String str2) {
        String string;
        String string2;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        SharedPreferences m25328g = m25328g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = m25328g.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = m25328g.getString(format2, null);
        SharedPreferences.Editor edit = m25328g.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }

    /* renamed from: d */
    public final synchronized void m25331d(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.f(str3);
        com.google.android.gms.common.internal.s.f(str7);
        SharedPreferences m25328g = m25328g(context, str);
        m25329f(m25328g);
        SharedPreferences.Editor edit = m25328g.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    /* renamed from: e */
    public final synchronized void m25330e(Context context, String str, String str2, String str3, String str4) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        SharedPreferences m25328g = m25328g(context, str);
        m25329f(m25328g);
        SharedPreferences.Editor edit = m25328g.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }
}
