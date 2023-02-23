package com.google.android.gms.auth.api.signin.p097a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.auth.api.signin.a.a */
/* loaded from: classes2.dex */
public class C2695a {

    /* renamed from: c */
    private static final Lock f7619c = new ReentrantLock();

    /* renamed from: d */
    private static C2695a f7620d;

    /* renamed from: a */
    private final Lock f7621a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f7622b;

    C2695a(Context context) {
        this.f7622b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C2695a m32150a(Context context) {
        s.j(context);
        f7619c.lock();
        try {
            if (f7620d == null) {
                f7620d = new C2695a(context.getApplicationContext());
            }
            return f7620d;
        } finally {
            f7619c.unlock();
        }
    }

    /* renamed from: d */
    private static final String m32147d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public GoogleSignInAccount m32149b() {
        String m32148c;
        String m32148c2 = m32148c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m32148c2) || (m32148c = m32148c(m32147d("googleSignInAccount", m32148c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m32153l0(m32148c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    protected final String m32148c(String str) {
        this.f7621a.lock();
        try {
            return this.f7622b.getString(str, null);
        } finally {
            this.f7621a.unlock();
        }
    }
}
