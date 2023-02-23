package com.google.protobuf;

import com.google.protobuf.C7118t1;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* renamed from: com.google.protobuf.k */
/* loaded from: classes2.dex */
public final class C7062k implements InterfaceC7032g1 {

    /* renamed from: a */
    private final AbstractC7052j f16868a;

    /* renamed from: b */
    private int f16869b;

    /* renamed from: c */
    private int f16870c;

    /* renamed from: d */
    private int f16871d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: com.google.protobuf.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7063a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16872a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16872a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16950B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16954F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16962e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16956H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16949A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16967z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16963f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16966y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16964w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16953E.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16957I.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16958J.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16959K.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16960L.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16951C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16955G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16872a[C7118t1.EnumC7120b.f16965x.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C7062k(AbstractC7052j abstractC7052j) {
        C6997a0.m20234b(abstractC7052j, MetricTracker.Object.INPUT);
        AbstractC7052j abstractC7052j2 = abstractC7052j;
        this.f16868a = abstractC7052j2;
        abstractC7052j2.f16832d = this;
    }

    /* renamed from: P */
    public static C7062k m19906P(AbstractC7052j abstractC7052j) {
        C7062k c7062k = abstractC7052j.f16832d;
        return c7062k != null ? c7062k : new C7062k(abstractC7052j);
    }

    /* renamed from: Q */
    private Object m19905Q(C7118t1.EnumC7120b enumC7120b, Class<?> cls, C7089p c7089p) throws IOException {
        switch (C7063a.f16872a[enumC7120b.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo19888j());
            case 2:
                return mo19916F();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo19878t());
            case 5:
                return Integer.valueOf(mo19889i());
            case 6:
                return Long.valueOf(mo19895c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo19914H());
            case 9:
                return Long.valueOf(mo19909M());
            case 10:
                return mo19890h(cls, c7089p);
            case 11:
                return Integer.valueOf(mo19912J());
            case 12:
                return Long.valueOf(mo19886l());
            case 13:
                return Integer.valueOf(mo19876v());
            case 14:
                return Long.valueOf(mo19875w());
            case 15:
                return mo19908N();
            case 16:
                return Integer.valueOf(mo19883o());
            case 17:
                return Long.valueOf(mo19896b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    private <T> T m19904R(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        int i = this.f16870c;
        this.f16870c = C7118t1.m19562c(C7118t1.m19564a(this.f16869b), 4);
        try {
            T mo19417i = interfaceC7038h1.mo19417i();
            interfaceC7038h1.mo19421e(mo19417i, this, c7089p);
            interfaceC7038h1.mo19423c(mo19417i);
            if (this.f16869b == this.f16870c) {
                return mo19417i;
            }
            throw InvalidProtocolBufferException.m20250i();
        } finally {
            this.f16870c = i;
        }
    }

    /* renamed from: S */
    private <T> T m19903S(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        AbstractC7052j abstractC7052j;
        int mo20018F = this.f16868a.mo20018F();
        AbstractC7052j abstractC7052j2 = this.f16868a;
        if (abstractC7052j2.f16829a < abstractC7052j2.f16830b) {
            int mo19995n = abstractC7052j2.mo19995n(mo20018F);
            T mo19417i = interfaceC7038h1.mo19417i();
            this.f16868a.f16829a++;
            interfaceC7038h1.mo19421e(mo19417i, this, c7089p);
            interfaceC7038h1.mo19423c(mo19417i);
            this.f16868a.mo19999a(0);
            abstractC7052j.f16829a--;
            this.f16868a.mo19996m(mo19995n);
            return mo19417i;
        }
        throw InvalidProtocolBufferException.m20249j();
    }

    /* renamed from: U */
    private void m19901U(int i) throws IOException {
        if (this.f16868a.mo19998d() != i) {
            throw InvalidProtocolBufferException.m20245n();
        }
    }

    /* renamed from: V */
    private void m19900V(int i) throws IOException {
        if (C7118t1.m19563b(this.f16869b) != i) {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    /* renamed from: W */
    private void m19899W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m20250i();
        }
    }

    /* renamed from: X */
    private void m19898X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m20250i();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: A */
    public int mo19921A() throws IOException {
        int i = this.f16871d;
        if (i != 0) {
            this.f16869b = i;
            this.f16871d = 0;
        } else {
            this.f16869b = this.f16868a.mo20019E();
        }
        int i2 = this.f16869b;
        if (i2 == 0 || i2 == this.f16870c) {
            return Integer.MAX_VALUE;
        }
        return C7118t1.m19564a(i2);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: B */
    public void mo19920B(List<String> list) throws IOException {
        m19902T(list, false);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: C */
    public <T> T mo19919C(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        m19900V(2);
        return (T) m19903S(interfaceC7038h1, c7089p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void mo19918D(java.util.Map<K, V> r8, com.google.protobuf.C7064k0.C7065a<K, V> r9, com.google.protobuf.C7089p r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m19900V(r0)
            com.google.protobuf.j r1 = r7.f16868a
            int r1 = r1.mo20018F()
            com.google.protobuf.j r2 = r7.f16868a
            int r1 = r2.mo19995n(r1)
            K r2 = r9.f16877b
            V r3 = r9.f16879d
        L14:
            int r4 = r7.mo19921A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.j r5 = r7.f16868a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo19997e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo19913I()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.t1$b r4 = r9.f16878c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f16879d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m19905Q(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.t1$b r4 = r9.f16876a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m19905Q(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo19913I()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.j r8 = r7.f16868a
            r8.mo19996m(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.j r9 = r7.f16868a
            r9.mo19996m(r1)
            goto L6d
        L6c:
            throw r8
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7062k.mo19918D(java.util.Map, com.google.protobuf.k0$a, com.google.protobuf.p):void");
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: E */
    public void mo19917E(List<String> list) throws IOException {
        m19902T(list, true);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: F */
    public AbstractC7039i mo19916F() throws IOException {
        m19900V(2);
        return this.f16868a.mo19993p();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: G */
    public void mo19915G(List<Float> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7137w) {
            C7137w c7137w = (C7137w) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19899W(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7137w.m19404h(this.f16868a.mo19988u());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else if (m19563b == 5) {
                do {
                    c7137w.m19404h(this.f16868a.mo19988u());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19899W(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Float.valueOf(this.f16868a.mo19988u()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else if (m19563b2 == 5) {
            do {
                list.add(Float.valueOf(this.f16868a.mo19988u()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: H */
    public int mo19914H() throws IOException {
        m19900V(0);
        return this.f16868a.mo19987v();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: I */
    public boolean mo19913I() throws IOException {
        int i;
        if (this.f16868a.mo19997e() || (i = this.f16869b) == this.f16870c) {
            return false;
        }
        return this.f16868a.mo20016I(i);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: J */
    public int mo19912J() throws IOException {
        m19900V(5);
        return this.f16868a.mo19985y();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: K */
    public void mo19911K(List<AbstractC7039i> list) throws IOException {
        int mo20019E;
        if (C7118t1.m19563b(this.f16869b) == 2) {
            do {
                list.add(mo19916F());
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
            return;
        }
        throw InvalidProtocolBufferException.m20253f();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: L */
    public void mo19910L(List<Double> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7078m) {
            C7078m c7078m = (C7078m) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 1) {
                do {
                    c7078m.m19815h(this.f16868a.mo19992q());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19898X(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7078m.m19815h(this.f16868a.mo19992q());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 1) {
            do {
                list.add(Double.valueOf(this.f16868a.mo19992q()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19898X(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Double.valueOf(this.f16868a.mo19992q()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: M */
    public long mo19909M() throws IOException {
        m19900V(0);
        return this.f16868a.mo19986w();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: N */
    public String mo19908N() throws IOException {
        m19900V(2);
        return this.f16868a.mo20020D();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: O */
    public void mo19907O(List<Long> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 1) {
                do {
                    c7050i0.m20075k(this.f16868a.mo19989t());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19898X(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7050i0.m20075k(this.f16868a.mo19989t());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 1) {
            do {
                list.add(Long.valueOf(this.f16868a.mo19989t()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19898X(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Long.valueOf(this.f16868a.mo19989t()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    /* renamed from: T */
    public void m19902T(List<String> list, boolean z) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (C7118t1.m19563b(this.f16869b) == 2) {
            if ((list instanceof InterfaceC7031g0) && !z) {
                InterfaceC7031g0 interfaceC7031g0 = (InterfaceC7031g0) list;
                do {
                    interfaceC7031g0.mo19731A(mo19916F());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            }
            do {
                list.add(z ? mo19908N() : mo19873y());
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
            return;
        }
        throw InvalidProtocolBufferException.m20253f();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: a */
    public void mo19897a(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7149z.mo19336C(this.f16868a.mo20023A());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7149z.mo19336C(this.f16868a.mo20023A());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo20023A()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Integer.valueOf(this.f16868a.mo20023A()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: b */
    public long mo19896b() throws IOException {
        m19900V(0);
        return this.f16868a.mo20017G();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: c */
    public long mo19895c() throws IOException {
        m19900V(1);
        return this.f16868a.mo19989t();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: d */
    public void mo19894d(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19899W(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7149z.mo19336C(this.f16868a.mo19985y());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else if (m19563b == 5) {
                do {
                    c7149z.mo19336C(this.f16868a.mo19985y());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19899W(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Integer.valueOf(this.f16868a.mo19985y()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else if (m19563b2 == 5) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo19985y()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: e */
    public void mo19893e(List<Long> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7050i0.m20075k(this.f16868a.mo20022B());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7050i0.m20075k(this.f16868a.mo20022B());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Long.valueOf(this.f16868a.mo20022B()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Long.valueOf(this.f16868a.mo20022B()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: f */
    public <T> void mo19892f(List<T> list, InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        int mo20019E;
        if (C7118t1.m19563b(this.f16869b) == 3) {
            int i = this.f16869b;
            do {
                list.add(m19904R(interfaceC7038h1, c7089p));
                if (this.f16868a.mo19997e() || this.f16871d != 0) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == i);
            this.f16871d = mo20019E;
            return;
        }
        throw InvalidProtocolBufferException.m20253f();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: g */
    public void mo19891g(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7149z.mo19336C(this.f16868a.mo20018F());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7149z.mo19336C(this.f16868a.mo20018F());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo20018F()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Integer.valueOf(this.f16868a.mo20018F()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    public int getTag() {
        return this.f16869b;
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: h */
    public <T> T mo19890h(Class<T> cls, C7089p c7089p) throws IOException {
        m19900V(2);
        return (T) m19903S(C7019d1.m20212a().m20209d(cls), c7089p);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: i */
    public int mo19889i() throws IOException {
        m19900V(5);
        return this.f16868a.mo19990s();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: j */
    public boolean mo19888j() throws IOException {
        m19900V(0);
        return this.f16868a.mo19994o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: k */
    public <T> void mo19887k(List<T> list, InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        int mo20019E;
        if (C7118t1.m19563b(this.f16869b) == 2) {
            int i = this.f16869b;
            do {
                list.add(m19903S(interfaceC7038h1, c7089p));
                if (this.f16868a.mo19997e() || this.f16871d != 0) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == i);
            this.f16871d = mo20019E;
            return;
        }
        throw InvalidProtocolBufferException.m20253f();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: l */
    public long mo19886l() throws IOException {
        m19900V(1);
        return this.f16868a.mo19984z();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: m */
    public void mo19885m(List<Long> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7050i0.m20075k(this.f16868a.mo20017G());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7050i0.m20075k(this.f16868a.mo20017G());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Long.valueOf(this.f16868a.mo20017G()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Long.valueOf(this.f16868a.mo20017G()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: n */
    public <T> T mo19884n(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
        m19900V(3);
        return (T) m19904R(interfaceC7038h1, c7089p);
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: o */
    public int mo19883o() throws IOException {
        m19900V(0);
        return this.f16868a.mo20018F();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: p */
    public void mo19882p(List<Long> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7050i0.m20075k(this.f16868a.mo19986w());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7050i0.m20075k(this.f16868a.mo19986w());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Long.valueOf(this.f16868a.mo19986w()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Long.valueOf(this.f16868a.mo19986w()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: q */
    public void mo19881q(List<Long> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 1) {
                do {
                    c7050i0.m20075k(this.f16868a.mo19984z());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19898X(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7050i0.m20075k(this.f16868a.mo19984z());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 1) {
            do {
                list.add(Long.valueOf(this.f16868a.mo19984z()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19898X(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Long.valueOf(this.f16868a.mo19984z()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: r */
    public void mo19880r(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7149z.mo19336C(this.f16868a.mo19987v());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7149z.mo19336C(this.f16868a.mo19987v());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo19987v()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Integer.valueOf(this.f16868a.mo19987v()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    public double readDouble() throws IOException {
        m19900V(1);
        return this.f16868a.mo19992q();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    public float readFloat() throws IOException {
        m19900V(5);
        return this.f16868a.mo19988u();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: s */
    public void mo19879s(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7149z.mo19336C(this.f16868a.mo19991r());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7149z.mo19336C(this.f16868a.mo19991r());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo19991r()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Integer.valueOf(this.f16868a.mo19991r()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: t */
    public int mo19878t() throws IOException {
        m19900V(0);
        return this.f16868a.mo19991r();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: u */
    public void mo19877u(List<Integer> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 2) {
                int mo20018F = this.f16868a.mo20018F();
                m19899W(mo20018F);
                int mo19998d = this.f16868a.mo19998d() + mo20018F;
                do {
                    c7149z.mo19336C(this.f16868a.mo19990s());
                } while (this.f16868a.mo19998d() < mo19998d);
                return;
            } else if (m19563b == 5) {
                do {
                    c7149z.mo19336C(this.f16868a.mo19990s());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 2) {
            int mo20018F2 = this.f16868a.mo20018F();
            m19899W(mo20018F2);
            int mo19998d2 = this.f16868a.mo19998d() + mo20018F2;
            do {
                list.add(Integer.valueOf(this.f16868a.mo19990s()));
            } while (this.f16868a.mo19998d() < mo19998d2);
        } else if (m19563b2 == 5) {
            do {
                list.add(Integer.valueOf(this.f16868a.mo19990s()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: v */
    public int mo19876v() throws IOException {
        m19900V(0);
        return this.f16868a.mo20023A();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: w */
    public long mo19875w() throws IOException {
        m19900V(0);
        return this.f16868a.mo20022B();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: x */
    public void mo19874x(List<Boolean> list) throws IOException {
        int mo20019E;
        int mo20019E2;
        if (list instanceof C7030g) {
            C7030g c7030g = (C7030g) list;
            int m19563b = C7118t1.m19563b(this.f16869b);
            if (m19563b == 0) {
                do {
                    c7030g.m20118k(this.f16868a.mo19994o());
                    if (this.f16868a.mo19997e()) {
                        return;
                    }
                    mo20019E2 = this.f16868a.mo20019E();
                } while (mo20019E2 == this.f16869b);
                this.f16871d = mo20019E2;
                return;
            } else if (m19563b == 2) {
                int mo19998d = this.f16868a.mo19998d() + this.f16868a.mo20018F();
                do {
                    c7030g.m20118k(this.f16868a.mo19994o());
                } while (this.f16868a.mo19998d() < mo19998d);
                m19901U(mo19998d);
                return;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }
        int m19563b2 = C7118t1.m19563b(this.f16869b);
        if (m19563b2 == 0) {
            do {
                list.add(Boolean.valueOf(this.f16868a.mo19994o()));
                if (this.f16868a.mo19997e()) {
                    return;
                }
                mo20019E = this.f16868a.mo20019E();
            } while (mo20019E == this.f16869b);
            this.f16871d = mo20019E;
        } else if (m19563b2 == 2) {
            int mo19998d2 = this.f16868a.mo19998d() + this.f16868a.mo20018F();
            do {
                list.add(Boolean.valueOf(this.f16868a.mo19994o()));
            } while (this.f16868a.mo19998d() < mo19998d2);
            m19901U(mo19998d2);
        } else {
            throw InvalidProtocolBufferException.m20253f();
        }
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: y */
    public String mo19873y() throws IOException {
        m19900V(2);
        return this.f16868a.mo20021C();
    }

    @Override // com.google.protobuf.InterfaceC7032g1
    /* renamed from: z */
    public <T> T mo19872z(Class<T> cls, C7089p c7089p) throws IOException {
        m19900V(3);
        return (T) m19904R(C7019d1.m20212a().m20209d(cls), c7089p);
    }
}
