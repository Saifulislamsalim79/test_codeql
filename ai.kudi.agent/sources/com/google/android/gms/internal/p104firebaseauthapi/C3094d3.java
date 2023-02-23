package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d3 */
/* loaded from: classes2.dex */
final class C3094d3 {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static C3369na m31270a(C3236ia c3236ia) {
        C3290ka m30567z = C3369na.m30567z();
        m30567z.m30845i(c3236ia.m30973A());
        for (C3209ha c3209ha : c3236ia.m30968F()) {
            C3317la m30708A = C3343ma.m30708A();
            m30708A.m30773l(c3209ha.m31068A().m30091E());
            m30708A.m30774j(c3209ha.m31067B());
            m30708A.m30775i(c3209ha.m31064E());
            m30708A.m30776h(c3209ha.m31058z());
            m30567z.m30846h(m30708A.m31126e());
        }
        return m30567z.m31126e();
    }

    /* renamed from: b */
    public static void m31269b(C3236ia c3236ia) throws GeneralSecurityException {
        int m30973A = c3236ia.m30973A();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C3209ha c3209ha : c3236ia.m30968F()) {
            if (c3209ha.m31067B() == EnumC3628x9.ENABLED) {
                if (c3209ha.m31059J()) {
                    if (c3209ha.m31064E() != EnumC3048bb.UNKNOWN_PREFIX) {
                        if (c3209ha.m31067B() != EnumC3628x9.UNKNOWN_STATUS) {
                            if (c3209ha.m31058z() == m30973A) {
                                if (z) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z = true;
                            }
                            z2 &= c3209ha.m31068A().m30095A() == EnumC3576v9.ASYMMETRIC_PUBLIC;
                            i++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3209ha.m31058z())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3209ha.m31058z())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3209ha.m31058z())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
