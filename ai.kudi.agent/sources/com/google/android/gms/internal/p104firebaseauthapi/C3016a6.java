package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a6 */
/* loaded from: classes2.dex */
final class C3016a6 implements InterfaceC3439q2 {

    /* renamed from: a */
    private final C3543u2<InterfaceC3439q2> f8189a;

    /* renamed from: b */
    private final byte[] f8190b = {0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3016a6(C3543u2 c3543u2, C3676z5 c3676z5) {
        this.f8189a = c3543u2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3439q2
    /* renamed from: a */
    public final void mo30167a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C3491s2<InterfaceC3439q2> c3491s2 : this.f8189a.m30202d(copyOf)) {
                try {
                    if (c3491s2.m30289b().equals(EnumC3048bb.LEGACY)) {
                        c3491s2.m30288c().mo30167a(copyOfRange, C3578vb.m30128c(bArr2, this.f8190b));
                        return;
                    } else {
                        c3491s2.m30288c().mo30167a(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    logger = C3043b6.f8216a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb.append("tag prefix matches a key, but cannot verify: ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", sb.toString());
                }
            }
            for (C3491s2<InterfaceC3439q2> c3491s22 : this.f8189a.m30202d(C3620x1.f9072a)) {
                try {
                    c3491s22.m30288c().mo30167a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
