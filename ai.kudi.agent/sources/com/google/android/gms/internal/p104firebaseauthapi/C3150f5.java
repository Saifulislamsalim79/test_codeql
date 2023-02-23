package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f5 */
/* loaded from: classes2.dex */
public final class C3150f5 {

    /* renamed from: a */
    private static final byte[] f8459a = new byte[0];

    /* renamed from: b */
    public static final C3020aa f8460b = m31161a(EnumC3127e9.NIST_P256, EnumC3235i9.SHA256, EnumC3288k8.UNCOMPRESSED, C3148f3.f8454a, EnumC3048bb.TINK, f8459a);

    static {
        m31161a(EnumC3127e9.NIST_P256, EnumC3235i9.SHA256, EnumC3288k8.COMPRESSED, C3148f3.f8454a, EnumC3048bb.RAW, f8459a);
        m31161a(EnumC3127e9.NIST_P256, EnumC3235i9.SHA256, EnumC3288k8.UNCOMPRESSED, C3148f3.f8455b, EnumC3048bb.TINK, f8459a);
    }

    /* renamed from: a */
    public static C3020aa m31161a(EnumC3127e9 enumC3127e9, EnumC3235i9 enumC3235i9, EnumC3288k8 enumC3288k8, C3020aa c3020aa, EnumC3048bb enumC3048bb, byte[] bArr) {
        C3419p8 m30443z = C3445q8.m30443z();
        C3073c9 m31252z = C3100d9.m31252z();
        m31252z.m31287h(enumC3127e9);
        m31252z.m31286i(enumC3235i9);
        m31252z.m31285j(AbstractC3223ho.m31022J(bArr));
        C3341m8 m30574z = C3367n8.m30574z();
        m30574z.m30709h(c3020aa);
        C3497s8 m30184B = C3549u8.m30184B();
        m30184B.m30281j(m31252z.m31126e());
        m30184B.m30283h(m30574z.m31126e());
        m30184B.m30282i(enumC3288k8);
        m30443z.m30471h(m30184B.m31126e());
        C3680z9 m31426z = C3020aa.m31426z();
        new C3623x4();
        m31426z.m29895i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        m31426z.m29896h(enumC3048bb);
        m31426z.m29894j(m30443z.m31126e().mo30001k());
        return m31426z.m31126e();
    }
}
