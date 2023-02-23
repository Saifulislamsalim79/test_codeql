package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x4 */
/* loaded from: classes2.dex */
public final class C3623x4 extends AbstractC3621x2<C3627x8, C3019a9> {

    /* renamed from: d */
    private static final byte[] f9073d = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3623x4() {
        super(C3627x8.class, C3019a9.class, new C3571v4(InterfaceC3672z1.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ C3174g2 m30062k(EnumC3127e9 enumC3127e9, EnumC3235i9 enumC3235i9, EnumC3288k8 enumC3288k8, C3120e2 c3120e2, byte[] bArr, int i) {
        EnumC3048bb enumC3048bb;
        C3419p8 m30443z = C3445q8.m30443z();
        C3073c9 m31252z = C3100d9.m31252z();
        m31252z.m31287h(enumC3127e9);
        m31252z.m31286i(enumC3235i9);
        m31252z.m31285j(AbstractC3223ho.m31022J(bArr));
        C3100d9 m31126e = m31252z.m31126e();
        C3680z9 m31426z = C3020aa.m31426z();
        m31426z.m29895i(c3120e2.m31214b());
        m31426z.m29894j(AbstractC3223ho.m31022J(c3120e2.m31213c()));
        int m31212d = c3120e2.m31212d() - 1;
        if (m31212d == 0) {
            enumC3048bb = EnumC3048bb.TINK;
        } else if (m31212d == 1) {
            enumC3048bb = EnumC3048bb.LEGACY;
        } else if (m31212d != 2) {
            enumC3048bb = EnumC3048bb.CRUNCHY;
        } else {
            enumC3048bb = EnumC3048bb.RAW;
        }
        m31426z.m29896h(enumC3048bb);
        C3341m8 m30574z = C3367n8.m30574z();
        m30574z.m30709h(m31426z.m31126e());
        C3497s8 m30184B = C3549u8.m30184B();
        m30184B.m30281j(m31126e);
        m30184B.m30283h(m30574z.m31126e());
        m30184B.m30282i(enumC3288k8);
        m30443z.m30471h(m30184B.m31126e());
        return new C3174g2(m30443z.m31126e(), i);
    }

    /* renamed from: l */
    public static final void m30061l(C3627x8 c3627x8) throws GeneralSecurityException {
        if (c3627x8.m30045E().mo31014f() != 0) {
            C3657yc.m29960c(c3627x8.m30041z(), 0);
            C3177g5.m31119b(c3627x8.m30046D().m31446A());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<C3445q8, C3627x8> mo29976a() {
        return new C3597w4(this, C3445q8.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC3644y mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3627x8.m30047C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(InterfaceC3644y interfaceC3644y) throws GeneralSecurityException {
        m30061l((C3627x8) interfaceC3644y);
    }
}
