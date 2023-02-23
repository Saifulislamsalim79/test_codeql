package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k3 */
/* loaded from: classes2.dex */
final class C3283k3 extends AbstractC3201h2<C3469r6, C3391o6> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3283k3(C3310l3 c3310l3, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3469r6 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3469r6.m30394B(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3391o6 mo30066c(C3469r6 c3469r6) throws GeneralSecurityException {
        C3469r6 c3469r62 = c3469r6;
        new C3388o3();
        C3573v6 m30589g = C3362n3.m30589g(c3469r62.m30393C());
        C3316l9 mo30066c = new C3624x5().mo29976a().mo30066c(c3469r62.m30392D());
        C3365n6 m30515A = C3391o6.m30515A();
        m30515A.m30588h(m30589g);
        m30515A.m30587i(mo30066c);
        m30515A.m30586j(0);
        return m30515A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3469r6>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", C3310l3.m30794j(16, 16, 32, 16, EnumC3235i9.SHA256, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C3310l3.m30794j(16, 16, 32, 16, EnumC3235i9.SHA256, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", C3310l3.m30794j(32, 16, 32, 32, EnumC3235i9.SHA256, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C3310l3.m30794j(32, 16, 32, 32, EnumC3235i9.SHA256, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3469r6 c3469r6) throws GeneralSecurityException {
        C3469r6 c3469r62 = c3469r6;
        ((C3362n3) new C3388o3().mo29976a()).mo30064e(c3469r62.m30393C());
        new C3624x5().mo29976a().mo30064e(c3469r62.m30392D());
        C3657yc.m29961b(c3469r62.m30393C().m29963z());
    }
}
