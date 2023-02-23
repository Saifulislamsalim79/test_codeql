package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f3 */
/* loaded from: classes2.dex */
public final class C3148f3 {

    /* renamed from: a */
    public static final C3020aa f8454a = m31162c(16);

    /* renamed from: b */
    public static final C3020aa f8455b;

    static {
        m31162c(32);
        m31163b(16, 16);
        m31163b(32, 16);
        f8455b = m31164a(16, 16, 32, 16, EnumC3235i9.SHA256);
        m31164a(32, 16, 32, 32, EnumC3235i9.SHA256);
        C3680z9 m31426z = C3020aa.m31426z();
        new C3041b4();
        m31426z.m29895i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        m31426z.m29896h(EnumC3048bb.TINK);
        m31426z.m31126e();
        C3680z9 m31426z2 = C3020aa.m31426z();
        new C3311l4();
        m31426z2.m29895i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        m31426z2.m29896h(EnumC3048bb.TINK);
        m31426z2.m31126e();
    }

    /* renamed from: a */
    public static C3020aa m31164a(int i, int i2, int i3, int i4, EnumC3235i9 enumC3235i9) {
        C3625x6 m29971A = C3651y6.m29971A();
        C3017a7 m31408A = C3044b7.m31408A();
        m31408A.m31454h(16);
        m29971A.m30055i(m31408A.m31126e());
        m29971A.m30056h(i);
        C3368n9 m30506A = C3394o9.m30506A();
        C3446q9 m30387B = C3472r9.m30387B();
        m30387B.m30442h(enumC3235i9);
        m30387B.m30441i(i4);
        m30506A.m30572i(m30387B.m31126e());
        m30506A.m30573h(32);
        C3443q6 m30389z = C3469r6.m30389z();
        m30389z.m30454h(m29971A.m31126e());
        m30389z.m30453i(m30506A.m31126e());
        C3680z9 m31426z = C3020aa.m31426z();
        m31426z.m29894j(m30389z.m31126e().mo30001k());
        new C3310l3();
        m31426z.m29895i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        m31426z.m29896h(EnumC3048bb.TINK);
        return m31426z.m31126e();
    }

    /* renamed from: b */
    public static C3020aa m31163b(int i, int i2) {
        C3179g7 m31081A = C3206h7.m31081A();
        m31081A.m31116h(i);
        C3260j7 m30855A = C3287k7.m30855A();
        m30855A.m30903h(16);
        m31081A.m31115i(m30855A.m31126e());
        C3680z9 m31426z = C3020aa.m31426z();
        m31426z.m29894j(m31081A.m31126e().mo30001k());
        new C3492s3();
        m31426z.m29895i("type.googleapis.com/google.crypto.tink.AesEaxKey");
        m31426z.m29896h(EnumC3048bb.TINK);
        return m31426z.m31126e();
    }

    /* renamed from: c */
    public static C3020aa m31162c(int i) {
        C3418p7 m30452A = C3444q7.m30452A();
        m30452A.m30472h(i);
        C3680z9 m31426z = C3020aa.m31426z();
        m31426z.m29894j(m30452A.m31126e().mo30001k());
        new C3570v3();
        m31426z.m29895i("type.googleapis.com/google.crypto.tink.AesGcmKey");
        m31426z.m29896h(EnumC3048bb.TINK);
        return m31426z.m31126e();
    }
}
