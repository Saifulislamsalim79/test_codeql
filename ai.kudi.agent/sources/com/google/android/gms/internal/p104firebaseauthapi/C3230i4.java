package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i4 */
/* loaded from: classes2.dex */
public final class C3230i4 extends AbstractC3255j2<C3629xa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3230i4() {
        super(C3629xa.class, new C3176g4(InterfaceC3542u1.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3629xa> mo29976a() {
        return new C3203h4(this, C3021ab.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.REMOTE;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3629xa mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3629xa.m30037C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3629xa c3629xa) throws GeneralSecurityException {
        C3657yc.m29960c(c3629xa.m30033z(), 0);
    }
}
