package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u3 */
/* loaded from: classes2.dex */
final class C3544u3 extends AbstractC3201h2<C3444q7, C3366n7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3544u3(C3570v3 c3570v3, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3444q7 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3444q7.m30450C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3366n7 mo30066c(C3444q7 c3444q7) throws GeneralSecurityException {
        C3340m7 m30585A = C3366n7.m30585A();
        m30585A.m30711h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3444q7.m30448z())));
        m30585A.m30710i(0);
        return m30585A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3444q7>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", C3570v3.m30142j(16, 1));
        hashMap.put("AES128_GCM_RAW", C3570v3.m30142j(16, 3));
        hashMap.put("AES256_GCM", C3570v3.m30142j(32, 1));
        hashMap.put("AES256_GCM_RAW", C3570v3.m30142j(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3444q7 c3444q7) throws GeneralSecurityException {
        C3657yc.m29961b(c3444q7.m30448z());
    }
}
