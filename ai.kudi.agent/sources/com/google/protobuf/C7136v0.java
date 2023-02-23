package com.google.protobuf;

import com.google.protobuf.C7015d0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.C7126u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* renamed from: com.google.protobuf.v0 */
/* loaded from: classes2.dex */
final class C7136v0<T> implements InterfaceC7038h1<T> {

    /* renamed from: a */
    private final InterfaceC7100r0 f17073a;

    /* renamed from: b */
    private final AbstractC7085n1<?, ?> f17074b;

    /* renamed from: c */
    private final boolean f17075c;

    /* renamed from: d */
    private final AbstractC7093q<?> f17076d;

    private C7136v0(AbstractC7085n1<?, ?> abstractC7085n1, AbstractC7093q<?> abstractC7093q, InterfaceC7100r0 interfaceC7100r0) {
        this.f17074b = abstractC7085n1;
        this.f17075c = abstractC7093q.mo19716e(interfaceC7100r0);
        this.f17076d = abstractC7093q;
        this.f17073a = interfaceC7100r0;
    }

    /* renamed from: k */
    private <UT, UB> int m19415k(AbstractC7085n1<UT, UB> abstractC7085n1, T t) {
        return abstractC7085n1.mo19747i(abstractC7085n1.mo19749g(t));
    }

    /* renamed from: l */
    private <UT, UB, ET extends C7126u.InterfaceC7128b<ET>> void m19414l(AbstractC7085n1<UT, UB> abstractC7085n1, AbstractC7093q<ET> abstractC7093q, T t, InterfaceC7032g1 interfaceC7032g1, C7089p c7089p) throws IOException {
        UB mo19750f = abstractC7085n1.mo19750f(t);
        C7126u<ET> mo19717d = abstractC7093q.mo19717d(t);
        do {
            try {
                if (interfaceC7032g1.mo19921A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC7085n1.mo19743o(t, mo19750f);
            }
        } while (m19412n(interfaceC7032g1, c7089p, abstractC7093q, mo19717d, abstractC7085n1, mo19750f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static <T> C7136v0<T> m19413m(AbstractC7085n1<?, ?> abstractC7085n1, AbstractC7093q<?> abstractC7093q, InterfaceC7100r0 interfaceC7100r0) {
        return new C7136v0<>(abstractC7085n1, abstractC7093q, interfaceC7100r0);
    }

    /* renamed from: n */
    private <UT, UB, ET extends C7126u.InterfaceC7128b<ET>> boolean m19412n(InterfaceC7032g1 interfaceC7032g1, C7089p c7089p, AbstractC7093q<ET> abstractC7093q, C7126u<ET> c7126u, AbstractC7085n1<UT, UB> abstractC7085n1, UB ub) throws IOException {
        int tag = interfaceC7032g1.getTag();
        if (tag != C7118t1.f16945a) {
            if (C7118t1.m19563b(tag) == 2) {
                Object mo19719b = abstractC7093q.mo19719b(c7089p, this.f17073a, C7118t1.m19564a(tag));
                if (mo19719b != null) {
                    abstractC7093q.mo19713h(interfaceC7032g1, mo19719b, c7089p, c7126u);
                    return true;
                }
                return abstractC7085n1.m19794m(ub, interfaceC7032g1);
            }
            return interfaceC7032g1.mo19913I();
        }
        int i = 0;
        Object obj = null;
        AbstractC7039i abstractC7039i = null;
        while (interfaceC7032g1.mo19921A() != Integer.MAX_VALUE) {
            int tag2 = interfaceC7032g1.getTag();
            if (tag2 == C7118t1.f16947c) {
                i = interfaceC7032g1.mo19883o();
                obj = abstractC7093q.mo19719b(c7089p, this.f17073a, i);
            } else if (tag2 == C7118t1.f16948d) {
                if (obj != null) {
                    abstractC7093q.mo19713h(interfaceC7032g1, obj, c7089p, c7126u);
                } else {
                    abstractC7039i = interfaceC7032g1.mo19916F();
                }
            } else if (!interfaceC7032g1.mo19913I()) {
                break;
            }
        }
        if (interfaceC7032g1.getTag() == C7118t1.f16946b) {
            if (abstractC7039i != null) {
                if (obj != null) {
                    abstractC7093q.mo19712i(abstractC7039i, obj, c7089p, c7126u);
                } else {
                    abstractC7085n1.mo19752d(ub, i, abstractC7039i);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.m20256c();
    }

    /* renamed from: o */
    private <UT, UB> void m19411o(AbstractC7085n1<UT, UB> abstractC7085n1, T t, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        abstractC7085n1.mo19739s(abstractC7085n1.mo19749g(t), interfaceC7131u1);
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: a */
    public void mo19425a(T t, T t2) {
        C7061j1.m19972G(this.f17074b, t, t2);
        if (this.f17075c) {
            C7061j1.m19974E(this.f17076d, t, t2);
        }
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: b */
    public void mo19424b(T t, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        Iterator<Map.Entry<?, Object>> m19542r = this.f17076d.mo19718c(t).m19542r();
        while (m19542r.hasNext()) {
            Map.Entry<?, Object> next = m19542r.next();
            C7126u.InterfaceC7128b interfaceC7128b = (C7126u.InterfaceC7128b) next.getKey();
            if (interfaceC7128b.mo19345l() == C7118t1.EnumC7125c.MESSAGE && !interfaceC7128b.mo19347f() && !interfaceC7128b.mo19344s()) {
                if (next instanceof C7015d0.C7017b) {
                    interfaceC7131u1.mo19448e(interfaceC7128b.mo19348d(), ((C7015d0.C7017b) next).m20214a().m20163e());
                } else {
                    interfaceC7131u1.mo19448e(interfaceC7128b.mo19348d(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m19411o(this.f17074b, t, interfaceC7131u1);
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: c */
    public void mo19423c(T t) {
        this.f17074b.mo19746j(t);
        this.f17076d.mo19715f(t);
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: d */
    public final boolean mo19422d(T t) {
        return this.f17076d.mo19718c(t).m19545o();
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: e */
    public void mo19421e(T t, InterfaceC7032g1 interfaceC7032g1, C7089p c7089p) throws IOException {
        m19414l(this.f17074b, this.f17076d, t, interfaceC7032g1, c7089p);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo19420f(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C7020e.C7022b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.y r0 = (com.google.protobuf.AbstractC7141y) r0
            com.google.protobuf.o1 r1 = r0.unknownFields
            com.google.protobuf.o1 r2 = com.google.protobuf.C7088o1.m19785c()
            if (r1 != r2) goto L11
            com.google.protobuf.o1 r1 = com.google.protobuf.C7088o1.m19778j()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.y$c r11 = (com.google.protobuf.AbstractC7141y.AbstractC7144c) r11
            com.google.protobuf.u r11 = r11.m19355R()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.C7020e.m20199I(r12, r13, r15)
            int r13 = r15.f16785a
            int r3 = com.google.protobuf.C7118t1.f16945a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.C7118t1.m19563b(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.q<?> r2 = r10.f17076d
            com.google.protobuf.p r3 = r15.f16788d
            com.google.protobuf.r0 r5 = r10.f17073a
            int r6 = com.google.protobuf.C7118t1.m19564a(r13)
            java.lang.Object r2 = r2.mo19719b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.y$e r8 = (com.google.protobuf.AbstractC7141y.C7146e) r8
            if (r8 == 0) goto L5b
            com.google.protobuf.d1 r13 = com.google.protobuf.C7019d1.m20212a()
            com.google.protobuf.r0 r2 = r8.m19342b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.h1 r13 = r13.m20209d(r2)
            int r13 = com.google.protobuf.C7020e.m20178p(r13, r12, r4, r14, r15)
            com.google.protobuf.y$d r2 = r8.f17091b
            java.lang.Object r3 = r15.f16787c
            r11.m19537w(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C7020e.m20201G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.C7020e.m20194N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.C7020e.m20199I(r12, r4, r15)
            int r6 = r15.f16785a
            int r7 = com.google.protobuf.C7118t1.m19564a(r6)
            int r8 = com.google.protobuf.C7118t1.m19563b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.d1 r6 = com.google.protobuf.C7019d1.m20212a()
            com.google.protobuf.r0 r7 = r2.m19342b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.h1 r6 = r6.m20209d(r7)
            int r4 = com.google.protobuf.C7020e.m20178p(r6, r12, r4, r14, r15)
            com.google.protobuf.y$d r6 = r2.f17091b
            java.lang.Object r7 = r15.f16787c
            r11.m19537w(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.C7020e.m20192b(r12, r4, r15)
            java.lang.Object r3 = r15.f16787c
            com.google.protobuf.i r3 = (com.google.protobuf.AbstractC7039i) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.C7020e.m20199I(r12, r4, r15)
            int r13 = r15.f16785a
            com.google.protobuf.q<?> r2 = r10.f17076d
            com.google.protobuf.p r6 = r15.f16788d
            com.google.protobuf.r0 r7 = r10.f17073a
            java.lang.Object r2 = r2.mo19719b(r6, r7, r13)
            com.google.protobuf.y$e r2 = (com.google.protobuf.AbstractC7141y.C7146e) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.C7118t1.f16946b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.C7020e.m20194N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.C7118t1.m19562c(r13, r5)
            r1.m19775m(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.m20250i()
            goto Le0
        Ldf:
            throw r11
        Le0:
            goto Ldf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7136v0.mo19420f(java.lang.Object, byte[], int, int, com.google.protobuf.e$b):void");
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: g */
    public boolean mo19419g(T t, T t2) {
        if (this.f17074b.mo19749g(t).equals(this.f17074b.mo19749g(t2))) {
            if (this.f17075c) {
                return this.f17076d.mo19718c(t).equals(this.f17076d.mo19718c(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: h */
    public int mo19418h(T t) {
        int m19415k = m19415k(this.f17074b, t) + 0;
        return this.f17075c ? m19415k + this.f17076d.mo19718c(t).m19551i() : m19415k;
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: i */
    public T mo19417i() {
        return (T) this.f17073a.mo19352f().mo19366C0();
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: j */
    public int mo19416j(T t) {
        int hashCode = this.f17074b.mo19749g(t).hashCode();
        return this.f17075c ? (hashCode * 53) + this.f17076d.mo19718c(t).hashCode() : hashCode;
    }
}
