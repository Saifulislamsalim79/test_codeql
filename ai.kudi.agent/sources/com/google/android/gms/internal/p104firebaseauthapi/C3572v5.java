package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v5 */
/* loaded from: classes2.dex */
final class C3572v5 extends AbstractC3228i2<InterfaceC3439q2, C3316l9> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3572v5(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3228i2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC3439q2 mo29907b(C3316l9 c3316l9) throws GeneralSecurityException {
        C3316l9 c3316l92 = c3316l9;
        EnumC3235i9 m30388A = c3316l92.m30782E().m30388A();
        SecretKeySpec secretKeySpec = new SecretKeySpec(c3316l92.m30781F().m31017Z(), "HMAC");
        int m30382z = c3316l92.m30782E().m30382z();
        EnumC3235i9 enumC3235i9 = EnumC3235i9.UNKNOWN_HASH;
        int ordinal = m30388A.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return new C3553uc(new C3527tc("HMACSHA224", secretKeySpec), m30382z);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new C3553uc(new C3527tc("HMACSHA512", secretKeySpec), m30382z);
                }
                return new C3553uc(new C3527tc("HMACSHA256", secretKeySpec), m30382z);
            }
            return new C3553uc(new C3527tc("HMACSHA384", secretKeySpec), m30382z);
        }
        return new C3553uc(new C3527tc("HMACSHA1", secretKeySpec), m30382z);
    }
}
