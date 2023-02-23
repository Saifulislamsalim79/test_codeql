package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s3 */
/* loaded from: classes2.dex */
public final class C3492s3 extends AbstractC3255j2<C3125e7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3492s3() {
        super(C3125e7.class, new C3440q3(InterfaceC3542u1.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ C3174g2 m30286j(int i, int i2, int i3) {
        C3179g7 m31081A = C3206h7.m31081A();
        m31081A.m31116h(i);
        C3260j7 m30855A = C3287k7.m30855A();
        m30855A.m30903h(16);
        m31081A.m31115i(m30855A.m31126e());
        return new C3174g2(m31081A.m31126e(), i3);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3125e7> mo29976a() {
        return new C3466r3(this, C3206h7.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3125e7 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3125e7.m31204C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3125e7 c3125e7) throws GeneralSecurityException {
        C3125e7 c3125e72 = c3125e7;
        C3657yc.m29960c(c3125e72.m31198z(), 0);
        C3657yc.m29961b(c3125e72.m31202E().mo31014f());
        if (c3125e72.m31203D().m30851z() != 12 && c3125e72.m31203D().m30851z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
