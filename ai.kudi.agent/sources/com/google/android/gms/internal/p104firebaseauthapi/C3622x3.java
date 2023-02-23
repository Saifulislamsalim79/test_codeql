package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x3 */
/* loaded from: classes2.dex */
final class C3622x3 extends AbstractC3201h2<C3626x7, C3548u7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3622x3(C3648y3 c3648y3, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3626x7 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3626x7.m30052C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3548u7 mo30066c(C3626x7 c3626x7) throws GeneralSecurityException {
        C3496s7 m30192A = C3548u7.m30192A();
        m30192A.m30285h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3626x7.m30050z())));
        m30192A.m30284i(0);
        return m30192A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3626x7>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", C3648y3.m29974k(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", C3648y3.m29974k(16, 3));
        hashMap.put("AES256_GCM_SIV", C3648y3.m29974k(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", C3648y3.m29974k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3626x7 c3626x7) throws GeneralSecurityException {
        C3657yc.m29961b(c3626x7.m30050z());
    }
}
