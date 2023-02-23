package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t5 */
/* loaded from: classes2.dex */
final class C3520t5 extends AbstractC3201h2<C3232i6, C3151f6> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3520t5(C3546u5 c3546u5, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3232i6 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3232i6.m30979C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3151f6 mo30066c(C3232i6 c3232i6) throws GeneralSecurityException {
        C3232i6 c3232i62 = c3232i6;
        C3124e6 m31160A = C3151f6.m31160A();
        m31160A.m31207j(0);
        m31160A.m31209h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3232i62.m30975z())));
        m31160A.m31208i(c3232i62.m30978D());
        return m31160A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3232i6>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        C3205h6 m30981A = C3232i6.m30981A();
        m30981A.m31083h(32);
        C3286k6 m30791A = C3313l6.m30791A();
        m30791A.m30856h(16);
        m30981A.m31082i(m30791A.m31126e());
        hashMap.put("AES_CMAC", new C3174g2(m30981A.m31126e(), 1));
        C3205h6 m30981A2 = C3232i6.m30981A();
        m30981A2.m31083h(32);
        C3286k6 m30791A2 = C3313l6.m30791A();
        m30791A2.m30856h(16);
        m30981A2.m31082i(m30791A2.m31126e());
        hashMap.put("AES256_CMAC", new C3174g2(m30981A2.m31126e(), 1));
        C3205h6 m30981A3 = C3232i6.m30981A();
        m30981A3.m31083h(32);
        C3286k6 m30791A3 = C3313l6.m30791A();
        m30791A3.m30856h(16);
        m30981A3.m31082i(m30791A3.m31126e());
        hashMap.put("AES256_CMAC_RAW", new C3174g2(m30981A3.m31126e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3232i6 c3232i6) throws GeneralSecurityException {
        C3232i6 c3232i62 = c3232i6;
        C3546u5.m30197l(c3232i62.m30978D());
        C3546u5.m30196m(c3232i62.m30975z());
    }
}
