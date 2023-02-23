package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ro */
/* loaded from: classes2.dex */
public abstract class AbstractC3487ro extends AbstractC3034ao {

    /* renamed from: b */
    private static final Logger f8924b = Logger.getLogger(AbstractC3487ro.class.getName());

    /* renamed from: c */
    private static final boolean f8925c = C3254j1.m30936C();

    /* renamed from: a */
    C3513so f8926a;

    private AbstractC3487ro() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC3487ro(C3357mo c3357mo) {
    }

    /* renamed from: E */
    public static int m30332E(AbstractC3223ho abstractC3223ho) {
        int mo31014f = abstractC3223ho.mo31014f();
        return m30324f(mo31014f) + mo31014f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: F */
    public static int m30331F(int i, InterfaceC3644y interfaceC3644y, InterfaceC3307l0 interfaceC3307l0) {
        int m30324f = m30324f(i << 3);
        int i2 = m30324f + m30324f;
        AbstractC3564un abstractC3564un = (AbstractC3564un) interfaceC3644y;
        int mo30163a = abstractC3564un.mo30163a();
        if (mo30163a == -1) {
            mo30163a = interfaceC3307l0.mo30813d(abstractC3564un);
            abstractC3564un.mo30162b(mo30163a);
        }
        return i2 + mo30163a;
    }

    /* renamed from: G */
    public static int m30330G(int i) {
        if (i >= 0) {
            return m30324f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m30329H(C3171g c3171g) {
        int m31123a = c3171g.m31123a();
        return m30324f(m31123a) + m31123a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m30328b(InterfaceC3644y interfaceC3644y, InterfaceC3307l0 interfaceC3307l0) {
        AbstractC3564un abstractC3564un = (AbstractC3564un) interfaceC3644y;
        int mo30163a = abstractC3564un.mo30163a();
        if (mo30163a == -1) {
            mo30163a = interfaceC3307l0.mo30813d(abstractC3564un);
            abstractC3564un.mo30162b(mo30163a);
        }
        return m30324f(mo30163a) + mo30163a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m30327c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m30326d(String str) {
        int length;
        try {
            length = C3386o1.m30525c(str);
        } catch (C3360n1 unused) {
            length = str.getBytes(C3117e.f8412a).length;
        }
        return m30324f(length) + length;
    }

    /* renamed from: e */
    public static int m30325e(int i) {
        return m30324f(i << 3);
    }

    /* renamed from: f */
    public static int m30324f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m30323g(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: h */
    public static AbstractC3487ro m30322h(byte[] bArr) {
        return new C3435po(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC3487ro m30321i(OutputStream outputStream, int i) {
        return new C3461qo(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo30336A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo30335B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo30334C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo30333D(long j) throws IOException;

    /* renamed from: j */
    public final void m30320j() {
        if (mo30313q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m30319k(String str, C3360n1 c3360n1) throws IOException {
        f8924b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c3360n1);
        byte[] bytes = str.getBytes(C3117e.f8412a);
        try {
            int length = bytes.length;
            mo30335B(length);
            mo30398a(bytes, 0, length);
        } catch (zzzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(e2);
        }
    }

    /* renamed from: m */
    public abstract void mo30317m() throws IOException;

    /* renamed from: n */
    public abstract void mo30316n(byte b) throws IOException;

    /* renamed from: o */
    public abstract void mo30315o(int i, boolean z) throws IOException;

    /* renamed from: p */
    public abstract void mo30314p(int i, AbstractC3223ho abstractC3223ho) throws IOException;

    /* renamed from: q */
    public abstract int mo30313q();

    /* renamed from: r */
    public abstract void mo30312r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo30311s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo30310t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo30309u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo30308v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo30307w(int i) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo30306x(int i, InterfaceC3644y interfaceC3644y, InterfaceC3307l0 interfaceC3307l0) throws IOException;

    /* renamed from: y */
    public abstract void mo30305y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo30304z(int i, int i2) throws IOException;
}
