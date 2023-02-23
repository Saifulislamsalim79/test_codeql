package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w5 */
/* loaded from: classes2.dex */
public final class C3598w5 extends AbstractC3201h2<C3394o9, C3316l9> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3598w5(C3624x5 c3624x5, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3394o9 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3394o9.m30503D(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3316l9 mo30066c(C3394o9 c3394o9) throws GeneralSecurityException {
        C3394o9 c3394o92 = c3394o9;
        C3289k9 m30786A = C3316l9.m30786A();
        m30786A.m30847j(0);
        m30786A.m30848i(c3394o92.m30502E());
        m30786A.m30849h(AbstractC3223ho.m31022J(C3605wc.m30084a(c3394o92.m30499z())));
        return m30786A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3394o9>> mo30065d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", C3624x5.m30059k(32, 16, EnumC3235i9.SHA256, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", C3624x5.m30059k(32, 16, EnumC3235i9.SHA256, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", C3624x5.m30059k(32, 32, EnumC3235i9.SHA256, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", C3624x5.m30059k(32, 32, EnumC3235i9.SHA256, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", C3624x5.m30059k(64, 16, EnumC3235i9.SHA512, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", C3624x5.m30059k(64, 16, EnumC3235i9.SHA512, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", C3624x5.m30059k(64, 32, EnumC3235i9.SHA512, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", C3624x5.m30059k(64, 32, EnumC3235i9.SHA512, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", C3624x5.m30059k(64, 64, EnumC3235i9.SHA512, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", C3624x5.m30059k(64, 64, EnumC3235i9.SHA512, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3394o9 c3394o9) throws GeneralSecurityException {
        C3394o9 c3394o92 = c3394o9;
        if (c3394o92.m30499z() >= 16) {
            C3624x5.m30057m(c3394o92.m30502E());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
