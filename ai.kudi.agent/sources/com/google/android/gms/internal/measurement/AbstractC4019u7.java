package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u7 */
/* loaded from: classes2.dex */
public abstract class AbstractC4019u7 extends C3798g7 {

    /* renamed from: b */
    private static final Logger f9729b = Logger.getLogger(AbstractC4019u7.class.getName());

    /* renamed from: c */
    private static final boolean f9730c = C4070xa.m28650C();

    /* renamed from: a */
    C4035v7 f9731a;

    private AbstractC4019u7() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC4019u7(C3987s7 c3987s7) {
    }

    /* renamed from: A */
    public static int m28878A(C4036v8 c4036v8) {
        int m28739a = c4036v8.m28739a();
        return m28874a(m28739a) + m28739a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m28877B(InterfaceC3927o9 interfaceC3927o9, InterfaceC4101z9 interfaceC4101z9) {
        AbstractC3704a7 abstractC3704a7 = (AbstractC3704a7) interfaceC3927o9;
        int mo29395g = abstractC3704a7.mo29395g();
        if (mo29395g == -1) {
            mo29395g = interfaceC4101z9.mo28530d(abstractC3704a7);
            abstractC3704a7.mo29394i(mo29395g);
        }
        return m28874a(mo29395g) + mo29395g;
    }

    /* renamed from: C */
    public static int m28876C(String str) {
        int length;
        try {
            length = C3741cb.m29706c(str);
        } catch (C3725bb unused) {
            length = str.getBytes(C4004t8.f9713a).length;
        }
        return m28874a(length) + length;
    }

    /* renamed from: D */
    public static int m28875D(int i) {
        return m28874a(i << 3);
    }

    /* renamed from: a */
    public static int m28874a(int i) {
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

    /* renamed from: b */
    public static int m28873b(long j) {
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

    /* renamed from: c */
    public static AbstractC4019u7 m28872c(byte[] bArr) {
        return new C4003t7(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m28851x(AbstractC3909n7 abstractC3909n7) {
        int mo29340f = abstractC3909n7.mo29340f();
        return m28874a(mo29340f) + mo29340f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: y */
    public static int m28850y(int i, InterfaceC3927o9 interfaceC3927o9, InterfaceC4101z9 interfaceC4101z9) {
        int m28874a = m28874a(i << 3);
        int i2 = m28874a + m28874a;
        AbstractC3704a7 abstractC3704a7 = (AbstractC3704a7) interfaceC3927o9;
        int mo29395g = abstractC3704a7.mo29395g();
        if (mo29395g == -1) {
            mo29395g = interfaceC4101z9.mo28530d(abstractC3704a7);
            abstractC3704a7.mo29394i(mo29395g);
        }
        return i2 + mo29395g;
    }

    /* renamed from: z */
    public static int m28849z(int i) {
        if (i >= 0) {
            return m28874a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void m28871d() {
        if (mo28868g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m28870e(String str, C3725bb c3725bb) throws IOException {
        f9729b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c3725bb);
        byte[] bytes = str.getBytes(C4004t8.f9713a);
        try {
            int length = bytes.length;
            mo28854u(length);
            mo28858q(bytes, 0, length);
        } catch (zzjd e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(e2);
        }
    }

    /* renamed from: g */
    public abstract int mo28868g();

    /* renamed from: h */
    public abstract void mo28867h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo28866i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo28865j(int i, AbstractC3909n7 abstractC3909n7) throws IOException;

    /* renamed from: k */
    public abstract void mo28864k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo28863l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo28862m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo28861n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo28860o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo28859p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo28858q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo28857r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo28856s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo28855t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo28854u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo28853v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo28852w(long j) throws IOException;
}
