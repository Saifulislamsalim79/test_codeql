package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e4 */
/* loaded from: classes2.dex */
public final class C3122e4 extends AbstractC3255j2<C3447qa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3122e4() {
        super(C3447qa.class, new C3068c4(InterfaceC3542u1.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3447qa> mo29976a() {
        return new C3095d4(this, C3551ua.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.REMOTE;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3447qa mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3447qa.m30438C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3447qa c3447qa) throws GeneralSecurityException {
        C3657yc.m29960c(c3447qa.m30434z(), 0);
    }
}
