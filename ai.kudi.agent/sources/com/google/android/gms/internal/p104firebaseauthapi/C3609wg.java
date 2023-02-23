package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wg */
/* loaded from: classes2.dex */
public final class C3609wg implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C3406ol f9054a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f9055b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f9056c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3609wg(C3350mh c3350mh, C3406ol c3406ol, Context context, C3056bj c3056bj) {
        this.f9056c = c3350mh;
        this.f9054a = c3406ol;
        this.f9055b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        this.f9054a.m30495b(c3140em.m31173l());
        abstractC3457qk = this.f9056c.f8728a;
        abstractC3457qk.mo30420d(null, this.f9054a, new C3583vg(this));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9055b.mo29940h(C5227i.m25323a(str));
    }
}
