package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a4 */
/* loaded from: classes2.dex */
final class C3014a4 extends AbstractC3201h2<C3261j8, C3180g8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3014a4(C3041b4 c3041b4, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3261j8 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3261j8.m30901B(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3180g8 mo30066c(C3261j8 c3261j8) throws GeneralSecurityException {
        C3153f8 m31114A = C3180g8.m31114A();
        m31114A.m31150i(0);
        m31114A.m31151h(AbstractC3223ho.m31022J(C3605wc.m30084a(32)));
        return m31114A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3261j8>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new C3174g2(C3261j8.m30902A(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new C3174g2(C3261j8.m30902A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3261j8 c3261j8) throws GeneralSecurityException {
    }
}
