package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w4 */
/* loaded from: classes2.dex */
final class C3597w4 extends AbstractC3201h2<C3445q8, C3627x8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3597w4(C3623x4 c3623x4, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3445q8 mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3445q8.m30446B(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3627x8 mo30066c(C3445q8 c3445q8) throws GeneralSecurityException {
        C3445q8 c3445q82 = c3445q8;
        ECParameterSpec m31189f = C3130ec.m31189f(C3177g5.m31118c(c3445q82.m30445C().m30181E().m31258C()));
        KeyPairGenerator m31099a = C3184gc.f8507h.m31099a("EC");
        m31099a.initialize(m31189f);
        KeyPair generateKeyPair = m31099a.generateKeyPair();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        C3679z8 m31445B = C3019a9.m31445B();
        m31445B.m29899i(0);
        m31445B.m29900h(c3445q82.m30445C());
        m31445B.m29898j(AbstractC3223ho.m31022J(w.getAffineX().toByteArray()));
        m31445B.m29897l(AbstractC3223ho.m31022J(w.getAffineY().toByteArray()));
        C3601w8 m30049A = C3627x8.m30049A();
        m30049A.m30096j(0);
        m30049A.m30097i(m31445B.m31126e());
        m30049A.m30098h(AbstractC3223ho.m31022J(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray()));
        return m30049A.m31126e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: d */
    public final Map<String, C3174g2<C3445q8>> mo30065d() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        EnumC3127e9 enumC3127e9 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i9 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k8 = EnumC3288k8.UNCOMPRESSED;
        C3120e2 m31165a = C3147f2.m31165a("AES128_GCM");
        bArr = C3623x4.f9073d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C3623x4.m30062k(enumC3127e9, enumC3235i9, enumC3288k8, m31165a, bArr, 1));
        EnumC3127e9 enumC3127e92 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i92 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k82 = EnumC3288k8.UNCOMPRESSED;
        C3120e2 m31165a2 = C3147f2.m31165a("AES128_GCM");
        bArr2 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C3623x4.m30062k(enumC3127e92, enumC3235i92, enumC3288k82, m31165a2, bArr2, 3));
        EnumC3127e9 enumC3127e93 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i93 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k83 = EnumC3288k8.COMPRESSED;
        C3120e2 m31165a3 = C3147f2.m31165a("AES128_GCM");
        bArr3 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C3623x4.m30062k(enumC3127e93, enumC3235i93, enumC3288k83, m31165a3, bArr3, 1));
        EnumC3127e9 enumC3127e94 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i94 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k84 = EnumC3288k8.COMPRESSED;
        C3120e2 m31165a4 = C3147f2.m31165a("AES128_GCM");
        bArr4 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C3623x4.m30062k(enumC3127e94, enumC3235i94, enumC3288k84, m31165a4, bArr4, 3));
        EnumC3127e9 enumC3127e95 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i95 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k85 = EnumC3288k8.COMPRESSED;
        C3120e2 m31165a5 = C3147f2.m31165a("AES128_GCM");
        bArr5 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C3623x4.m30062k(enumC3127e95, enumC3235i95, enumC3288k85, m31165a5, bArr5, 3));
        EnumC3127e9 enumC3127e96 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i96 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k86 = EnumC3288k8.UNCOMPRESSED;
        C3120e2 m31165a6 = C3147f2.m31165a("AES128_CTR_HMAC_SHA256");
        bArr6 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C3623x4.m30062k(enumC3127e96, enumC3235i96, enumC3288k86, m31165a6, bArr6, 1));
        EnumC3127e9 enumC3127e97 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i97 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k87 = EnumC3288k8.UNCOMPRESSED;
        C3120e2 m31165a7 = C3147f2.m31165a("AES128_CTR_HMAC_SHA256");
        bArr7 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C3623x4.m30062k(enumC3127e97, enumC3235i97, enumC3288k87, m31165a7, bArr7, 3));
        EnumC3127e9 enumC3127e98 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i98 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k88 = EnumC3288k8.COMPRESSED;
        C3120e2 m31165a8 = C3147f2.m31165a("AES128_CTR_HMAC_SHA256");
        bArr8 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C3623x4.m30062k(enumC3127e98, enumC3235i98, enumC3288k88, m31165a8, bArr8, 1));
        EnumC3127e9 enumC3127e99 = EnumC3127e9.NIST_P256;
        EnumC3235i9 enumC3235i99 = EnumC3235i9.SHA256;
        EnumC3288k8 enumC3288k89 = EnumC3288k8.COMPRESSED;
        C3120e2 m31165a9 = C3147f2.m31165a("AES128_CTR_HMAC_SHA256");
        bArr9 = C3623x4.f9073d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C3623x4.m30062k(enumC3127e99, enumC3235i99, enumC3288k89, m31165a9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3201h2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30064e(C3445q8 c3445q8) throws GeneralSecurityException {
        C3177g5.m31119b(c3445q8.m30445C());
    }
}
