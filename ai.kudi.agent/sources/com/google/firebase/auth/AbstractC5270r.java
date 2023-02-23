package com.google.firebase.auth;

import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.FirebaseException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.r */
/* loaded from: classes2.dex */
public abstract class AbstractC5270r {

    /* renamed from: a */
    private static final C2946a f13079a = new C2946a("PhoneAuthProvider", new String[0]);

    /* renamed from: a */
    public void m25247a(String str) {
        f13079a.m31581e("Sms auto retrieval timed-out.", new Object[0]);
    }

    /* renamed from: b */
    public void m25246b(String str, C5268q c5268q) {
    }

    /* renamed from: c */
    public abstract void m25245c(C5266p c5266p);

    /* renamed from: d */
    public abstract void m25244d(FirebaseException firebaseException);
}
