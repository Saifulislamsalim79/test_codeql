package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t4 */
/* loaded from: classes2.dex */
final class C3519t4 implements InterfaceC3646y1 {

    /* renamed from: a */
    private final C3543u2<InterfaceC3646y1> f8970a;

    public C3519t4(C3543u2<InterfaceC3646y1> c3543u2) {
        this.f8970a = c3543u2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3646y1
    /* renamed from: a */
    public final byte[] mo29977a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C3491s2<InterfaceC3646y1> c3491s2 : this.f8970a.m30202d(copyOfRange)) {
                try {
                    return c3491s2.m30288c().mo29977a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    logger = C3545u4.f8996a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e.toString());
                    logger.logp(level, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (C3491s2<InterfaceC3646y1> c3491s22 : this.f8970a.m30202d(C3620x1.f9072a)) {
            try {
                return c3491s22.m30288c().mo29977a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
