package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g5 */
/* loaded from: classes2.dex */
public final class C3177g5 {
    /* renamed from: a */
    public static String m31120a(EnumC3235i9 enumC3235i9) throws NoSuchAlgorithmException {
        EnumC3288k8 enumC3288k8 = EnumC3288k8.UNKNOWN_FORMAT;
        EnumC3127e9 enumC3127e9 = EnumC3127e9.UNKNOWN_CURVE;
        EnumC3235i9 enumC3235i92 = EnumC3235i9.UNKNOWN_HASH;
        int ordinal = enumC3235i9.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return "HmacSha224";
                        }
                        String valueOf = String.valueOf(enumC3235i9);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("hash unsupported for HMAC: ");
                        sb.append(valueOf);
                        throw new NoSuchAlgorithmException(sb.toString());
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    /* renamed from: b */
    public static void m31119b(C3549u8 c3549u8) throws GeneralSecurityException {
        C3130ec.m31189f(m31118c(c3549u8.m30181E().m31258C()));
        m31120a(c3549u8.m30181E().m31257D());
        if (c3549u8.m30177z() != EnumC3288k8.UNKNOWN_FORMAT) {
            C3067c3.m31306c(c3549u8.m30185A().m30576C());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: c */
    public static int m31118c(EnumC3127e9 enumC3127e9) throws GeneralSecurityException {
        EnumC3288k8 enumC3288k8 = EnumC3288k8.UNKNOWN_FORMAT;
        EnumC3127e9 enumC3127e92 = EnumC3127e9.UNKNOWN_CURVE;
        EnumC3235i9 enumC3235i9 = EnumC3235i9.UNKNOWN_HASH;
        int ordinal = enumC3127e9.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(enumC3127e9);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m31117d(EnumC3288k8 enumC3288k8) throws GeneralSecurityException {
        EnumC3288k8 enumC3288k82 = EnumC3288k8.UNKNOWN_FORMAT;
        EnumC3127e9 enumC3127e9 = EnumC3127e9.UNKNOWN_CURVE;
        EnumC3235i9 enumC3235i9 = EnumC3235i9.UNKNOWN_HASH;
        int ordinal = enumC3288k8.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(enumC3288k8);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }
}
