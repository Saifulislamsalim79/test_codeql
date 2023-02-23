package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l4 */
/* loaded from: classes2.dex */
public final class C3311l4 extends AbstractC3255j2<C3210hb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3311l4() {
        super(C3210hb.class, new C3257j4(InterfaceC3542u1.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3210hb> mo29976a() {
        return new C3284k4(this, C3291kb.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3210hb mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3210hb.m31055C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3210hb c3210hb) throws GeneralSecurityException {
        C3210hb c3210hb2 = c3210hb;
        C3657yc.m29960c(c3210hb2.m31051z(), 0);
        if (c3210hb2.m31054D().mo31014f() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
