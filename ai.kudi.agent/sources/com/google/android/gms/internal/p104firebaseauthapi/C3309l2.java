package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l2 */
/* loaded from: classes2.dex */
public final class C3309l2 {

    /* renamed from: a */
    private final C3155fa f8695a;

    private C3309l2(C3155fa c3155fa) {
        this.f8695a = c3155fa;
    }

    /* renamed from: e */
    public static C3309l2 m30801e() {
        return new C3309l2(C3236ia.m30972B());
    }

    /* renamed from: f */
    public static C3309l2 m30800f(C3282k2 c3282k2) {
        return new C3309l2(c3282k2.m30872c().m30947n());
    }

    /* renamed from: g */
    private final synchronized int m30799g() {
        int m30798h;
        m30798h = m30798h();
        while (m30795k(m30798h)) {
            m30798h = m30798h();
        }
        return m30798h;
    }

    /* renamed from: h */
    private static int m30798h() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* renamed from: i */
    private final synchronized C3209ha m30797i(C3602w9 c3602w9, EnumC3048bb enumC3048bb) throws GeneralSecurityException {
        C3182ga m31066C;
        int m30799g = m30799g();
        if (enumC3048bb != EnumC3048bb.UNKNOWN_PREFIX) {
            m31066C = C3209ha.m31066C();
            m31066C.m31105h(c3602w9);
            m31066C.m31104i(m30799g);
            m31066C.m31102l(EnumC3628x9.ENABLED);
            m31066C.m31103j(enumC3048bb);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return m31066C.m31126e();
    }

    /* renamed from: j */
    private final synchronized C3209ha m30796j(C3020aa c3020aa) throws GeneralSecurityException {
        return m30797i(C3067c3.m31306c(c3020aa), c3020aa.m31432C());
    }

    /* renamed from: k */
    private final synchronized boolean m30795k(int i) {
        boolean z;
        Iterator<C3209ha> it = this.f8695a.m31145n().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().m31058z() == i) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int m30805a(C3020aa c3020aa, boolean z) throws GeneralSecurityException {
        C3209ha m30796j;
        m30796j = m30796j(c3020aa);
        this.f8695a.m31148i(m30796j);
        return m30796j.m31058z();
    }

    /* renamed from: b */
    public final synchronized C3282k2 m30804b() throws GeneralSecurityException {
        return C3282k2.m30874a(this.f8695a.m31126e());
    }

    /* renamed from: c */
    public final synchronized C3309l2 m30803c(C3120e2 c3120e2) throws GeneralSecurityException {
        m30805a(c3120e2.m31215a(), false);
        return this;
    }

    /* renamed from: d */
    public final synchronized C3309l2 m30802d(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.f8695a.m31149h(); i2++) {
            C3209ha m31146l = this.f8695a.m31146l(i2);
            if (m31146l.m31058z() == i) {
                if (m31146l.m31067B().equals(EnumC3628x9.ENABLED)) {
                    this.f8695a.m31147j(i);
                } else {
                    StringBuilder sb = new StringBuilder(63);
                    sb.append("cannot set key as primary because it's not enabled: ");
                    sb.append(i);
                    throw new GeneralSecurityException(sb.toString());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("key not found: ");
        sb2.append(i);
        throw new GeneralSecurityException(sb2.toString());
        return this;
    }
}
