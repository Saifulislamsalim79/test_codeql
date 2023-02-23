package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2 */
/* loaded from: classes2.dex */
public final class C3282k2 {

    /* renamed from: a */
    private final C3236ia f8663a;

    private C3282k2(C3236ia c3236ia) {
        this.f8663a = c3236ia;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final C3282k2 m30874a(C3236ia c3236ia) throws GeneralSecurityException {
        m30869f(c3236ia);
        return new C3282k2(c3236ia);
    }

    /* renamed from: f */
    public static void m30869f(C3236ia c3236ia) throws GeneralSecurityException {
        if (c3236ia == null || c3236ia.m30965z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: i */
    public static final C3282k2 m30866i(C3416p5 c3416p5, InterfaceC3542u1 interfaceC3542u1) throws GeneralSecurityException, IOException {
        C3208h9 m30475a = c3416p5.m30475a();
        if (m30475a != null && m30475a.m31072C().mo31014f() != 0) {
            try {
                C3236ia m30969E = C3236ia.m30969E(interfaceC3542u1.mo29893a(m30475a.m31072C().m31017Z(), new byte[0]), C3617wo.m30072a());
                m30869f(m30969E);
                return new C3282k2(m30969E);
            } catch (zzaae unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public final C3282k2 m30873b() throws GeneralSecurityException {
        if (this.f8663a != null) {
            C3155fa m30972B = C3236ia.m30972B();
            for (C3209ha c3209ha : this.f8663a.m30968F()) {
                C3602w9 m31068A = c3209ha.m31068A();
                if (m31068A.m30095A() == EnumC3576v9.ASYMMETRIC_PRIVATE) {
                    C3602w9 m31307b = C3067c3.m31307b(m31068A.m30091E(), m31068A.m30092D());
                    C3067c3.m31303f(m31307b);
                    C3182ga m31066C = C3209ha.m31066C();
                    m31066C.m31127d(c3209ha);
                    m31066C.m31105h(m31307b);
                    m30972B.m31148i(m31066C.m31126e());
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            m30972B.m31147j(this.f8663a.m30973A());
            return new C3282k2(m30972B.m31126e());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3236ia m30872c() {
        return this.f8663a;
    }

    /* renamed from: d */
    public final C3369na m30871d() {
        return C3094d3.m31270a(this.f8663a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final <P> P m30870e(Class<P> cls) throws GeneralSecurityException {
        Class<?> m31304e = C3067c3.m31304e(cls);
        if (m31304e == null) {
            String valueOf = String.valueOf(cls.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        C3094d3.m31269b(this.f8663a);
        C3543u2 m30204b = C3543u2.m30204b(m31304e);
        for (C3209ha c3209ha : this.f8663a.m30968F()) {
            if (c3209ha.m31067B() == EnumC3628x9.ENABLED) {
                C3491s2 m30205a = m30204b.m30205a(C3067c3.m31302g(c3209ha.m31068A(), m31304e), c3209ha);
                if (c3209ha.m31058z() == this.f8663a.m30973A()) {
                    m30204b.m30201e(m30205a);
                }
            }
        }
        return (P) C3067c3.m31299j(m30204b, cls);
    }

    /* renamed from: g */
    public final void m30868g(InterfaceC3335m2 interfaceC3335m2, InterfaceC3542u1 interfaceC3542u1) throws GeneralSecurityException, IOException {
        C3236ia c3236ia = this.f8663a;
        byte[] mo29892b = interfaceC3542u1.mo29892b(c3236ia.mo30000p(), new byte[0]);
        try {
            if (C3236ia.m30969E(interfaceC3542u1.mo29893a(mo29892b, new byte[0]), C3617wo.m30072a()).equals(c3236ia)) {
                C3181g9 m31069z = C3208h9.m31069z();
                m31069z.m31107h(AbstractC3223ho.m31022J(mo29892b));
                m31069z.m31106i(C3094d3.m31270a(c3236ia));
                interfaceC3335m2.mo30145b(m31069z.m31126e());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzaae unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30867h(com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2 r5) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.ia r0 = r4.f8663a
            java.util.List r0 = r0.m30968F()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.ha r1 = (com.google.android.gms.internal.p104firebaseauthapi.C3209ha) r1
            com.google.android.gms.internal.firebase-auth-api.w9 r2 = r1.m31068A()
            com.google.android.gms.internal.firebase-auth-api.v9 r2 = r2.m30095A()
            com.google.android.gms.internal.firebase-auth-api.v9 r3 = com.google.android.gms.internal.p104firebaseauthapi.EnumC3576v9.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.w9 r2 = r1.m31068A()
            com.google.android.gms.internal.firebase-auth-api.v9 r2 = r2.m30095A()
            com.google.android.gms.internal.firebase-auth-api.v9 r3 = com.google.android.gms.internal.p104firebaseauthapi.EnumC3576v9.SYMMETRIC
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.w9 r2 = r1.m31068A()
            com.google.android.gms.internal.firebase-auth-api.v9 r2 = r2.m30095A()
            com.google.android.gms.internal.firebase-auth-api.v9 r3 = com.google.android.gms.internal.p104firebaseauthapi.EnumC3576v9.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L3b
            goto La
        L3b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.w9 r3 = r1.m31068A()
            com.google.android.gms.internal.firebase-auth-api.v9 r3 = r3.m30095A()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.w9 r1 = r1.m31068A()
            java.lang.String r1 = r1.m30091E()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L64:
            com.google.android.gms.internal.firebase-auth-api.ia r0 = r4.f8663a
            r5.mo30146a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3282k2.m30867h(com.google.android.gms.internal.firebase-auth-api.m2):void");
    }

    public final String toString() {
        return C3094d3.m31270a(this.f8663a).toString();
    }
}
