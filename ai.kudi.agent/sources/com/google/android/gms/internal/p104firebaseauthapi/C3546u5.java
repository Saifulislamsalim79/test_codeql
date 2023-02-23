package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u5 */
/* loaded from: classes2.dex */
public final class C3546u5 extends AbstractC3255j2<C3151f6> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3546u5() {
        super(C3151f6.class, new C3494s5(InterfaceC3439q2.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static void m30197l(C3313l6 c3313l6) throws GeneralSecurityException {
        if (c3313l6.m30787z() >= 10) {
            if (c3313l6.m30787z() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m30196m(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3151f6> mo29976a() {
        return new C3520t5(this, C3232i6.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3151f6 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3151f6.m31158C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3151f6 c3151f6) throws GeneralSecurityException {
        C3151f6 c3151f62 = c3151f6;
        C3657yc.m29960c(c3151f62.m31152z(), 0);
        m30196m(c3151f62.m31156E().mo31014f());
        m30197l(c3151f62.m31157D());
    }
}
