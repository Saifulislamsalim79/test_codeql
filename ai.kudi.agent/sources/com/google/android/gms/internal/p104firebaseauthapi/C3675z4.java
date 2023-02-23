package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z4 */
/* loaded from: classes2.dex */
final class C3675z4 extends AbstractC3255j2<C3019a9> {
    public C3675z4() {
        super(C3019a9.class, new C3649y4(InterfaceC3012a2.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3019a9 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3019a9.m31442E(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3019a9 c3019a9) throws GeneralSecurityException {
        C3019a9 c3019a92 = c3019a9;
        C3657yc.m29960c(c3019a92.m31435z(), 0);
        C3177g5.m31119b(c3019a92.m31446A());
    }
}
