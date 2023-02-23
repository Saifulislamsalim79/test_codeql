package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.common.api.internal.InterfaceC2790n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4465k;
import com.google.firebase.auth.C5207h;
import com.google.firebase.auth.internal.C5239o;
import com.google.firebase.auth.internal.InterfaceC5216c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uh */
/* loaded from: classes2.dex */
public final class C3558uh extends AbstractC3379nk<C5207h, InterfaceC5216c0> {

    /* renamed from: v */
    private final C3554ud f9004v;

    public C3558uh(String str) {
        super(1);
        s.g(str, "refresh token cannot be null");
        this.f9004v = new C3554ud(str);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3379nk
    /* renamed from: a */
    public final void mo29957a() {
        if (TextUtils.isEmpty(this.f8768i.m31172s())) {
            this.f8768i.m31178d0(this.f9004v.zza());
        }
        ((InterfaceC5216c0) this.f8764e).mo25259a(this.f8768i, this.f8763d);
        m30539i(C5239o.m25314a(this.f8768i.m31173l()));
    }

    /* renamed from: k */
    public final /* synthetic */ void m30166k(InterfaceC3083cj interfaceC3083cj, C4465k c4465k) throws RemoteException {
        this.f8780u = new C3353mk(this, c4465k);
        interfaceC3083cj.mo31239e().mo30373E(this.f9004v, this.f8761b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3454qh
    public final AbstractC2796p<InterfaceC3083cj, C5207h> zza() {
        AbstractC2796p.C2797a m31935a = AbstractC2796p.m31935a();
        m31935a.m31930b(new InterfaceC2790n() { // from class: com.google.android.gms.internal.firebase-auth-api.th
            @Override // com.google.android.gms.common.api.internal.InterfaceC2790n
            /* renamed from: a */
            public final void mo16126a(Object obj, Object obj2) {
                C3558uh.this.m30166k((InterfaceC3083cj) obj, (C4465k) obj2);
            }
        });
        return m31935a.m31931a();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3454qh
    public final String zzb() {
        return "getAccessToken";
    }
}
