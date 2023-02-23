package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4465k;
import com.google.firebase.auth.AbstractC5197c;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mk */
/* loaded from: classes2.dex */
public final class C3353mk<ResultT, CallbackT> {

    /* renamed from: a */
    private final AbstractC3379nk<ResultT, CallbackT> f8729a;

    /* renamed from: b */
    private final C4465k<ResultT> f8730b;

    public C3353mk(AbstractC3379nk<ResultT, CallbackT> abstractC3379nk, C4465k<ResultT> c4465k) {
        this.f8729a = abstractC3379nk;
        this.f8730b = c4465k;
    }

    /* renamed from: a */
    public final void m30658a(ResultT resultt, Status status) {
        s.k(this.f8730b, "completion source cannot be null");
        if (status == null) {
            this.f8730b.m27775c(resultt);
            return;
        }
        AbstractC3379nk<ResultT, CallbackT> abstractC3379nk = this.f8729a;
        if (abstractC3379nk.f8777r != null) {
            C4465k<ResultT> c4465k = this.f8730b;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(abstractC3379nk.f8762c);
            AbstractC3379nk<ResultT, CallbackT> abstractC3379nk2 = this.f8729a;
            c4465k.m27776b(C3137ej.m31185c(firebaseAuth, abstractC3379nk2.f8777r, ("reauthenticateWithCredential".equals(abstractC3379nk2.zzb()) || "reauthenticateWithCredentialWithData".equals(this.f8729a.zzb())) ? this.f8729a.f8763d : null));
            return;
        }
        AbstractC5197c abstractC5197c = abstractC3379nk.f8774o;
        if (abstractC5197c != null) {
            this.f8730b.m27776b(C3137ej.m31186b(status, abstractC5197c, abstractC3379nk.f8775p, abstractC3379nk.f8776q));
        } else {
            this.f8730b.m27776b(C3137ej.m31187a(status));
        }
    }
}
