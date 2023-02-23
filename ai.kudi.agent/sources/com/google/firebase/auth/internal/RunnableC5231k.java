package com.google.firebase.auth.internal;

import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.C5988g;
import com.google.firebase.auth.C5207h;
import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.k */
/* loaded from: classes2.dex */
public final class RunnableC5231k implements Runnable {

    /* renamed from: c */
    private final String f13013c;

    /* renamed from: d */
    final /* synthetic */ C5233l f13014d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5231k(C5233l c5233l, String str) {
        this.f13014d = c5233l;
        com.google.android.gms.common.internal.s.f(str);
        this.f13013c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2946a c2946a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C5988g.m23091k(this.f13013c));
        if (firebaseAuth.m25413d() != null) {
            com.google.android.gms.tasks.j<C5207h> mo25342b = firebaseAuth.mo25342b(true);
            c2946a = C5233l.f13015h;
            c2946a.m31579g("Token refreshing started", new Object[0]);
            mo25342b.d(new C5229j(this));
        }
    }
}
