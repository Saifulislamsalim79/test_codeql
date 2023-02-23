package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h3 */
/* loaded from: classes2.dex */
final class C3202h3 implements InterfaceC3542u1 {

    /* renamed from: a */
    private final C3543u2<InterfaceC3542u1> f8527a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3202h3(C3543u2 c3543u2, C3175g3 c3175g3) {
        this.f8527a = c3543u2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C3491s2<InterfaceC3542u1> c3491s2 : this.f8527a.m30202d(copyOfRange)) {
                try {
                    return c3491s2.m30288c().mo29893a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    logger = C3229i3.f8578a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e.toString());
                    logger.logp(level, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (C3491s2<InterfaceC3542u1> c3491s22 : this.f8527a.m30202d(C3620x1.f9072a)) {
            try {
                return c3491s22.m30288c().mo29893a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
