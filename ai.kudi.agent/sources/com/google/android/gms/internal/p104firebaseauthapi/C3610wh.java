package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.common.api.internal.InterfaceC2790n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4465k;
import com.google.firebase.auth.C5199d;
import com.google.firebase.auth.internal.C5230j0;
import com.google.firebase.auth.internal.C5240o0;
import com.google.firebase.auth.internal.InterfaceC5216c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wh */
/* loaded from: classes2.dex */
public final class C3610wh extends AbstractC3379nk<Object, InterfaceC5216c0> {

    /* renamed from: v */
    private final C5199d f9057v;

    public C3610wh(C5199d c5199d) {
        super(2);
        s.k(c5199d, "credential cannot be null");
        this.f9057v = c5199d;
        s.g(c5199d.m25366u(), "email cannot be null");
        s.g(c5199d.m25373E(), "password cannot be null");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3379nk
    /* renamed from: a */
    public final void mo29957a() {
        C5240o0 m29949j = C3663yi.m29949j(this.f8762c, this.f8769j);
        ((InterfaceC5216c0) this.f8764e).mo25259a(this.f8768i, m29949j);
        m30539i(new C5230j0(m29949j));
    }

    /* renamed from: k */
    public final /* synthetic */ void m30082k(InterfaceC3083cj interfaceC3083cj, C4465k c4465k) throws RemoteException {
        this.f8780u = new C3353mk(this, c4465k);
        interfaceC3083cj.mo31239e().mo30355i1(new C3658yd(this.f9057v.m25366u(), this.f9057v.m25373E(), this.f8763d.mo25305h0()), this.f8761b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3454qh
    public final AbstractC2796p<InterfaceC3083cj, Object> zza() {
        AbstractC2796p.C2797a m31935a = AbstractC2796p.m31935a();
        m31935a.m31930b(new InterfaceC2790n() { // from class: com.google.android.gms.internal.firebase-auth-api.vh
            @Override // com.google.android.gms.common.api.internal.InterfaceC2790n
            /* renamed from: a */
            public final void mo16126a(Object obj, Object obj2) {
                C3610wh.this.m30082k((InterfaceC3083cj) obj, (C4465k) obj2);
            }
        });
        return m31935a.m31931a();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3454qh
    public final String zzb() {
        return "linkEmailAuthCredential";
    }
}
