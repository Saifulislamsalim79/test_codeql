package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o3 */
/* loaded from: classes2.dex */
public final class C3388o3 extends AbstractC3255j2<C3573v6> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3388o3() {
        super(C3573v6.class, new C3336m3(InterfaceC3397oc.class));
    }

    /* renamed from: k */
    public static final void m30520k(C3573v6 c3573v6) throws GeneralSecurityException {
        C3657yc.m29960c(c3573v6.m30132z(), 0);
        C3657yc.m29961b(c3573v6.m30136F().mo31014f());
        m30519l(c3573v6.m30137E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m30519l(C3044b7 c3044b7) throws GeneralSecurityException {
        if (c3044b7.m31404z() < 12 || c3044b7.m31404z() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3573v6> mo29976a() {
        return new C3362n3(this, C3651y6.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3573v6 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3573v6.m30138D(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3573v6 c3573v6) throws GeneralSecurityException {
        m30520k(c3573v6);
    }
}
