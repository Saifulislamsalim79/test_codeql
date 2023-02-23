package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k4 */
/* loaded from: classes2.dex */
final class C3284k4 extends AbstractC3201h2<C3291kb, C3210hb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3284k4(C3311l4 c3311l4, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3291kb mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3291kb.m30843B(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3210hb mo30066c(C3291kb c3291kb) throws GeneralSecurityException {
        C3183gb m31057A = C3210hb.m31057A();
        m31057A.m31100i(0);
        m31057A.m31101h(AbstractC3223ho.m31022J(C3605wc.m30084a(32)));
        return m31057A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3291kb>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new C3174g2(C3291kb.m30844A(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new C3174g2(C3291kb.m30844A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3291kb c3291kb) throws GeneralSecurityException {
    }
}
