package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y3 */
/* loaded from: classes2.dex */
public final class C3648y3 extends AbstractC3255j2<C3548u7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3648y3() {
        super(C3548u7.class, new C3596w3(InterfaceC3542u1.class));
    }

    /* renamed from: j */
    public static void m29975j(boolean z) throws GeneralSecurityException {
        if (m29973l()) {
            C3067c3.m31296m(new C3648y3(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ C3174g2 m29974k(int i, int i2) {
        C3600w7 m30054A = C3626x7.m30054A();
        m30054A.m30099h(i);
        return new C3174g2(m30054A.m31126e(), i2);
    }

    /* renamed from: l */
    private static boolean m29973l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3548u7> mo29976a() {
        return new C3622x3(this, C3626x7.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3548u7 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3548u7.m30190C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3548u7 c3548u7) throws GeneralSecurityException {
        C3548u7 c3548u72 = c3548u7;
        C3657yc.m29960c(c3548u72.m30186z(), 0);
        C3657yc.m29961b(c3548u72.m30189D().mo31014f());
    }
}
