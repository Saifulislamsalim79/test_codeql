package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p4 */
/* loaded from: classes2.dex */
final class C3415p4 extends AbstractC3201h2<C3099d8, C3018a8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3415p4(C3467r4 c3467r4, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3099d8 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3099d8.m31263C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3018a8 mo30066c(C3099d8 c3099d8) throws GeneralSecurityException {
        C3678z7 m31453A = C3018a8.m31453A();
        m31453A.m29902h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3099d8.m31261z())));
        m31453A.m29901i(0);
        return m31453A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3099d8>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        C3072c8 m31265A = C3099d8.m31265A();
        m31265A.m31288h(64);
        hashMap.put("AES256_SIV", new C3174g2(m31265A.m31126e(), 1));
        C3072c8 m31265A2 = C3099d8.m31265A();
        m31265A2.m31288h(64);
        hashMap.put("AES256_SIV_RAW", new C3174g2(m31265A2.m31126e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3099d8 c3099d8) throws GeneralSecurityException {
        C3099d8 c3099d82 = c3099d8;
        if (c3099d82.m31261z() == 64) {
            return;
        }
        int m31261z = c3099d82.m31261z();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(m31261z);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
