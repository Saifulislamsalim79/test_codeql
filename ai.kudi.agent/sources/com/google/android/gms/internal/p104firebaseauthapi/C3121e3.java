package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e3 */
/* loaded from: classes2.dex */
public final class C3121e3 {

    /* renamed from: a */
    public static final String f8416a;

    /* renamed from: b */
    public static final String f8417b;
    @Deprecated

    /* renamed from: c */
    public static final C3129eb f8418c;

    static {
        new C3310l3();
        f8416a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new C3570v3();
        f8417b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new C3648y3();
        new C3492s3();
        new C3122e4();
        new C3230i4();
        new C3041b4();
        new C3311l4();
        f8418c = C3129eb.m31196A();
        try {
            m31210a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m31210a() throws GeneralSecurityException {
        C3067c3.m31295n(new C3229i3());
        C3650y5.m29972a();
        C3067c3.m31296m(new C3310l3(), true);
        C3067c3.m31296m(new C3570v3(), true);
        C3067c3.m31296m(new C3492s3(), true);
        C3648y3.m29975j(true);
        C3067c3.m31296m(new C3041b4(), true);
        C3067c3.m31296m(new C3122e4(), true);
        C3067c3.m31296m(new C3230i4(), true);
        C3067c3.m31296m(new C3311l4(), true);
    }
}
