package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b4 */
/* loaded from: classes2.dex */
public final class C3041b4 extends AbstractC3255j2<C3180g8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3041b4() {
        super(C3180g8.class, new C3674z3(InterfaceC3542u1.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3180g8> mo29976a() {
        return new C3014a4(this, C3261j8.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3180g8 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3180g8.m31112C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3180g8 c3180g8) throws GeneralSecurityException {
        C3180g8 c3180g82 = c3180g8;
        C3657yc.m29960c(c3180g82.m31108z(), 0);
        if (c3180g82.m31111D().mo31014f() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
