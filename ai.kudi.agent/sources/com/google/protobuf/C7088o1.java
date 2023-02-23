package com.google.protobuf;

import com.google.protobuf.InterfaceC7131u1;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* renamed from: com.google.protobuf.o1 */
/* loaded from: classes2.dex */
public final class C7088o1 {

    /* renamed from: f */
    private static final C7088o1 f16912f = new C7088o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f16913a;

    /* renamed from: b */
    private int[] f16914b;

    /* renamed from: c */
    private Object[] f16915c;

    /* renamed from: d */
    private int f16916d;

    /* renamed from: e */
    private boolean f16917e;

    private C7088o1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m19786b() {
        int i = this.f16913a;
        if (i == this.f16914b.length) {
            int i2 = this.f16913a + (i < 4 ? 8 : i >> 1);
            this.f16914b = Arrays.copyOf(this.f16914b, i2);
            this.f16915c = Arrays.copyOf(this.f16915c, i2);
        }
    }

    /* renamed from: c */
    public static C7088o1 m19785c() {
        return f16912f;
    }

    /* renamed from: f */
    private static int m19782f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    private static int m19781g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C7088o1 m19779i(C7088o1 c7088o1, C7088o1 c7088o12) {
        int i = c7088o1.f16913a + c7088o12.f16913a;
        int[] copyOf = Arrays.copyOf(c7088o1.f16914b, i);
        System.arraycopy(c7088o12.f16914b, 0, copyOf, c7088o1.f16913a, c7088o12.f16913a);
        Object[] copyOf2 = Arrays.copyOf(c7088o1.f16915c, i);
        System.arraycopy(c7088o12.f16915c, 0, copyOf2, c7088o1.f16913a, c7088o12.f16913a);
        return new C7088o1(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C7088o1 m19778j() {
        return new C7088o1();
    }

    /* renamed from: k */
    private static boolean m19777k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m19774n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private static void m19772p(int i, Object obj, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        int m19564a = C7118t1.m19564a(i);
        int m19563b = C7118t1.m19563b(i);
        if (m19563b == 0) {
            interfaceC7131u1.mo19436q(m19564a, ((Long) obj).longValue());
        } else if (m19563b == 1) {
            interfaceC7131u1.mo19442k(m19564a, ((Long) obj).longValue());
        } else if (m19563b == 2) {
            interfaceC7131u1.mo19431v(m19564a, (AbstractC7039i) obj);
        } else if (m19563b != 3) {
            if (m19563b == 5) {
                interfaceC7131u1.mo19447f(m19564a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m20253f());
        } else {
            interfaceC7131u1.mo19441l();
            InterfaceC7131u1.EnumC7132a enumC7132a = InterfaceC7131u1.EnumC7132a.ASCENDING;
            interfaceC7131u1.mo19432u(m19564a);
            ((C7088o1) obj).m19771q(interfaceC7131u1);
            interfaceC7131u1.mo19460H(m19564a);
        }
    }

    /* renamed from: a */
    void m19787a() {
        if (!this.f16917e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int m19784d() {
        int m20338Z;
        int i = this.f16916d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16913a; i3++) {
            int i4 = this.f16914b[i3];
            int m19564a = C7118t1.m19564a(i4);
            int m19563b = C7118t1.m19563b(i4);
            if (m19563b == 0) {
                m20338Z = CodedOutputStream.m20338Z(m19564a, ((Long) this.f16915c[i3]).longValue());
            } else if (m19563b == 1) {
                m20338Z = CodedOutputStream.m20314p(m19564a, ((Long) this.f16915c[i3]).longValue());
            } else if (m19563b == 2) {
                m20338Z = CodedOutputStream.m20326h(m19564a, (AbstractC7039i) this.f16915c[i3]);
            } else if (m19563b == 3) {
                m20338Z = (CodedOutputStream.m20341W(m19564a) * 2) + ((C7088o1) this.f16915c[i3]).m19784d();
            } else if (m19563b == 5) {
                m20338Z = CodedOutputStream.m20317n(m19564a, ((Integer) this.f16915c[i3]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m20253f());
            }
            i2 += m20338Z;
        }
        this.f16916d = i2;
        return i2;
    }

    /* renamed from: e */
    public int m19783e() {
        int i = this.f16916d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16913a; i3++) {
            i2 += CodedOutputStream.m20361K(C7118t1.m19564a(this.f16914b[i3]), (AbstractC7039i) this.f16915c[i3]);
        }
        this.f16916d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C7088o1)) {
            C7088o1 c7088o1 = (C7088o1) obj;
            int i = this.f16913a;
            return i == c7088o1.f16913a && m19774n(this.f16914b, c7088o1.f16914b, i) && m19777k(this.f16915c, c7088o1.f16915c, this.f16913a);
        }
        return false;
    }

    /* renamed from: h */
    public void m19780h() {
        this.f16917e = false;
    }

    public int hashCode() {
        int i = this.f16913a;
        return ((((527 + i) * 31) + m19782f(this.f16914b, i)) * 31) + m19781g(this.f16915c, this.f16913a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m19776l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f16913a; i2++) {
            C7117t0.m19567c(sb, i, String.valueOf(C7118t1.m19564a(this.f16914b[i2])), this.f16915c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m19775m(int i, Object obj) {
        m19787a();
        m19786b();
        int[] iArr = this.f16914b;
        int i2 = this.f16913a;
        iArr[i2] = i;
        this.f16915c[i2] = obj;
        this.f16913a = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m19773o(InterfaceC7131u1 interfaceC7131u1) throws IOException {
        interfaceC7131u1.mo19441l();
        InterfaceC7131u1.EnumC7132a enumC7132a = InterfaceC7131u1.EnumC7132a.DESCENDING;
        for (int i = 0; i < this.f16913a; i++) {
            interfaceC7131u1.mo19448e(C7118t1.m19564a(this.f16914b[i]), this.f16915c[i]);
        }
    }

    /* renamed from: q */
    public void m19771q(InterfaceC7131u1 interfaceC7131u1) throws IOException {
        if (this.f16913a == 0) {
            return;
        }
        interfaceC7131u1.mo19441l();
        InterfaceC7131u1.EnumC7132a enumC7132a = InterfaceC7131u1.EnumC7132a.ASCENDING;
        for (int i = 0; i < this.f16913a; i++) {
            m19772p(this.f16914b[i], this.f16915c[i], interfaceC7131u1);
        }
    }

    private C7088o1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f16916d = -1;
        this.f16913a = i;
        this.f16914b = iArr;
        this.f16915c = objArr;
        this.f16917e = z;
    }
}
