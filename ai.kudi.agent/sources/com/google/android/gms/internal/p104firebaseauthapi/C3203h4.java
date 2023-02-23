package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h4 */
/* loaded from: classes2.dex */
final class C3203h4 extends AbstractC3201h2<C3021ab, C3629xa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3203h4(C3230i4 c3230i4, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3021ab mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3021ab.m31423C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3629xa mo30066c(C3021ab c3021ab) throws GeneralSecurityException {
        C3603wa m30039A = C3629xa.m30039A();
        m30039A.m30086h(c3021ab);
        m30039A.m30085i(0);
        return m30039A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3021ab c3021ab) throws GeneralSecurityException {
        C3021ab c3021ab2 = c3021ab;
        if (c3021ab2.m31422D().isEmpty() || !c3021ab2.m31421E()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
