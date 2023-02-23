package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r3 */
/* loaded from: classes2.dex */
final class C3466r3 extends AbstractC3201h2<C3206h7, C3125e7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3466r3(C3492s3 c3492s3, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3206h7 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3206h7.m31079C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3125e7 mo30066c(C3206h7 c3206h7) throws GeneralSecurityException {
        C3206h7 c3206h72 = c3206h7;
        C3098d7 m31206A = C3125e7.m31206A();
        m31206A.m31268h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3206h72.m31075z())));
        m31206A.m31267i(c3206h72.m31078D());
        m31206A.m31266j(0);
        return m31206A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3206h7>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", C3492s3.m30286j(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", C3492s3.m30286j(16, 16, 3));
        hashMap.put("AES256_EAX", C3492s3.m30286j(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", C3492s3.m30286j(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3206h7 c3206h7) throws GeneralSecurityException {
        C3206h7 c3206h72 = c3206h7;
        C3657yc.m29961b(c3206h72.m31075z());
        if (c3206h72.m31078D().m30851z() != 12 && c3206h72.m31078D().m30851z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
