package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5740e0;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p132g0.C5745a;
import com.google.firebase.database.p131s.p132g0.C5747c;
import com.google.firebase.database.p131s.p132g0.C5752f;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.p137m.C5823a;
import com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5924c;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5939j;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ViewProcessor.java */
/* renamed from: com.google.firebase.database.s.j0.l */
/* loaded from: classes2.dex */
public class C5818l {

    /* renamed from: b */
    private static InterfaceC5826d.InterfaceC5827a f14293b = new C5819a();

    /* renamed from: a */
    private final InterfaceC5826d f14294a;

    /* compiled from: ViewProcessor.java */
    /* renamed from: com.google.firebase.database.s.j0.l$a */
    /* loaded from: classes2.dex */
    class C5819a implements InterfaceC5826d.InterfaceC5827a {
        C5819a() {
        }

        @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d.InterfaceC5827a
        /* renamed from: a */
        public C5944m mo23609a(AbstractC5937h abstractC5937h, C5944m c5944m, boolean z) {
            return null;
        }

        @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d.InterfaceC5827a
        /* renamed from: b */
        public InterfaceC5945n mo23608b(C5921b c5921b) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewProcessor.java */
    /* renamed from: com.google.firebase.database.s.j0.l$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5820b {

        /* renamed from: a */
        static final /* synthetic */ int[] f14295a;

        static {
            int[] iArr = new int[AbstractC5748d.EnumC5749a.values().length];
            f14295a = iArr;
            try {
                iArr[AbstractC5748d.EnumC5749a.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14295a[AbstractC5748d.EnumC5749a.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14295a[AbstractC5748d.EnumC5749a.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14295a[AbstractC5748d.EnumC5749a.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ViewProcessor.java */
    /* renamed from: com.google.firebase.database.s.j0.l$c */
    /* loaded from: classes2.dex */
    public static class C5821c {

        /* renamed from: a */
        public final C5817k f14296a;

        /* renamed from: b */
        public final List<C5803c> f14297b;

        public C5821c(C5817k c5817k, List<C5803c> list) {
            this.f14296a = c5817k;
            this.f14297b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewProcessor.java */
    /* renamed from: com.google.firebase.database.s.j0.l$d */
    /* loaded from: classes2.dex */
    public static class C5822d implements InterfaceC5826d.InterfaceC5827a {

        /* renamed from: a */
        private final C5740e0 f14298a;

        /* renamed from: b */
        private final C5817k f14299b;

        /* renamed from: c */
        private final InterfaceC5945n f14300c;

        public C5822d(C5740e0 c5740e0, C5817k c5817k, InterfaceC5945n interfaceC5945n) {
            this.f14298a = c5740e0;
            this.f14299b = c5817k;
            this.f14300c = interfaceC5945n;
        }

        @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d.InterfaceC5827a
        /* renamed from: a */
        public C5944m mo23609a(AbstractC5937h abstractC5937h, C5944m c5944m, boolean z) {
            InterfaceC5945n interfaceC5945n = this.f14300c;
            if (interfaceC5945n == null) {
                interfaceC5945n = this.f14299b.m23628b();
            }
            return this.f14298a.m23953g(interfaceC5945n, c5944m, z, abstractC5937h);
        }

        @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d.InterfaceC5827a
        /* renamed from: b */
        public InterfaceC5945n mo23608b(C5921b c5921b) {
            C5801a m23626d;
            C5801a m23627c = this.f14299b.m23627c();
            if (m23627c.m23693c(c5921b)) {
                return m23627c.m23694b().mo23211L(c5921b);
            }
            InterfaceC5945n interfaceC5945n = this.f14300c;
            if (interfaceC5945n != null) {
                m23626d = new C5801a(C5938i.m23239f(interfaceC5945n, C5939j.m23231j()), true, false);
            } else {
                m23626d = this.f14299b.m23626d();
            }
            return this.f14298a.m23959a(c5921b, m23626d);
        }
    }

    public C5818l(InterfaceC5826d interfaceC5826d) {
        this.f14294a = interfaceC5826d;
    }

    /* renamed from: a */
    private C5817k m23623a(C5817k c5817k, C5830l c5830l, C5779d<Boolean> c5779d, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n, C5823a c5823a) {
        if (c5740e0.m23951i(c5830l) != null) {
            return c5817k;
        }
        boolean m23691e = c5817k.m23626d().m23691e();
        C5801a m23626d = c5817k.m23626d();
        if (c5779d.getValue() != null) {
            if ((c5830l.isEmpty() && m23626d.m23690f()) || m23626d.m23692d(c5830l)) {
                return m23620d(c5817k, c5830l, m23626d.m23694b().mo23220B(c5830l), c5740e0, interfaceC5945n, m23691e, c5823a);
            }
            if (c5830l.isEmpty()) {
                C5737e m23963s = C5737e.m23963s();
                C5737e c5737e = m23963s;
                for (C5944m c5944m : m23626d.m23694b()) {
                    c5737e = c5737e.m23969e(c5944m.m23222c(), c5944m.m23221d());
                }
                return m23621c(c5817k, c5830l, c5737e, c5740e0, interfaceC5945n, m23691e, c5823a);
            }
            return c5817k;
        }
        C5737e m23963s2 = C5737e.m23963s();
        Iterator<Map.Entry<C5830l, Boolean>> it = c5779d.iterator();
        C5737e c5737e2 = m23963s2;
        while (it.hasNext()) {
            C5830l key = it.next().getKey();
            C5830l m23593I = c5830l.m23593I(key);
            if (m23626d.m23692d(m23593I)) {
                c5737e2 = c5737e2.m23970d(key, m23626d.m23694b().mo23220B(m23593I));
            }
        }
        return m23621c(c5817k, c5830l, c5737e2, c5740e0, interfaceC5945n, m23691e, c5823a);
    }

    /* renamed from: c */
    private C5817k m23621c(C5817k c5817k, C5830l c5830l, C5737e c5737e, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n, boolean z, C5823a c5823a) {
        if (!c5817k.m23626d().m23694b().isEmpty() || c5817k.m23626d().m23690f()) {
            C5795m.m23744g(c5737e.m23971V() == null, "Can't have a merge that is an overwrite");
            C5737e m23968f = c5830l.isEmpty() ? c5737e : C5737e.m23963s().m23968f(c5830l, c5737e);
            InterfaceC5945n m23694b = c5817k.m23626d().m23694b();
            Map<C5921b, C5737e> m23964m = m23968f.m23964m();
            C5817k c5817k2 = c5817k;
            for (Map.Entry<C5921b, C5737e> entry : m23964m.entrySet()) {
                C5921b key = entry.getKey();
                if (m23694b.mo23210R(key)) {
                    c5817k2 = m23620d(c5817k2, new C5830l(key), entry.getValue().m23967h(m23694b.mo23211L(key)), c5740e0, interfaceC5945n, z, c5823a);
                }
            }
            C5817k c5817k3 = c5817k2;
            for (Map.Entry<C5921b, C5737e> entry2 : m23964m.entrySet()) {
                C5921b key2 = entry2.getKey();
                boolean z2 = !c5817k.m23626d().m23693c(key2) && entry2.getValue().m23971V() == null;
                if (!m23694b.mo23210R(key2) && !z2) {
                    c5817k3 = m23620d(c5817k3, new C5830l(key2), entry2.getValue().m23967h(m23694b.mo23211L(key2)), c5740e0, interfaceC5945n, z, c5823a);
                }
            }
            return c5817k3;
        }
        return c5817k;
    }

    /* renamed from: d */
    private C5817k m23620d(C5817k c5817k, C5830l c5830l, InterfaceC5945n interfaceC5945n, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n2, boolean z, C5823a c5823a) {
        C5938i mo23598l;
        C5801a m23626d = c5817k.m23626d();
        InterfaceC5826d interfaceC5826d = this.f14294a;
        if (!z) {
            interfaceC5826d = interfaceC5826d.mo23601i();
        }
        boolean z2 = true;
        if (c5830l.isEmpty()) {
            mo23598l = interfaceC5826d.mo23597m(m23626d.m23695a(), C5938i.m23239f(interfaceC5945n, interfaceC5826d.mo23602h()), null);
        } else if (interfaceC5826d.mo23599k() && !m23626d.m23691e()) {
            C5795m.m23744g(!c5830l.isEmpty(), "An empty path should have been caught in the other branch");
            C5921b m23587Z = c5830l.m23587Z();
            mo23598l = interfaceC5826d.mo23597m(m23626d.m23695a(), m23626d.m23695a().m23233u(m23587Z, m23626d.m23694b().mo23211L(m23587Z).mo23218H(c5830l.m23583e0(), interfaceC5945n)), null);
        } else {
            C5921b m23587Z2 = c5830l.m23587Z();
            if (m23626d.m23692d(c5830l) || c5830l.size() <= 1) {
                C5830l m23583e0 = c5830l.m23583e0();
                InterfaceC5945n mo23218H = m23626d.m23694b().mo23211L(m23587Z2).mo23218H(m23583e0, interfaceC5945n);
                if (m23587Z2.m23292p()) {
                    mo23598l = interfaceC5826d.mo23600j(m23626d.m23695a(), mo23218H);
                } else {
                    mo23598l = interfaceC5826d.mo23598l(m23626d.m23695a(), m23587Z2, mo23218H, m23583e0, f14293b, null);
                }
                if (!m23626d.m23690f() && !c5830l.isEmpty()) {
                    z2 = false;
                }
                C5817k m23624f = c5817k.m23624f(mo23598l, z2, interfaceC5826d.mo23599k());
                return m23616h(m23624f, c5830l, c5740e0, new C5822d(c5740e0, m23624f, interfaceC5945n2), c5823a);
            }
            return c5817k;
        }
        if (!m23626d.m23690f()) {
            z2 = false;
        }
        C5817k m23624f2 = c5817k.m23624f(mo23598l, z2, interfaceC5826d.mo23599k());
        return m23616h(m23624f2, c5830l, c5740e0, new C5822d(c5740e0, m23624f2, interfaceC5945n2), c5823a);
    }

    /* renamed from: e */
    private C5817k m23619e(C5817k c5817k, C5830l c5830l, C5737e c5737e, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n, C5823a c5823a) {
        C5795m.m23744g(c5737e.m23971V() == null, "Can't have a merge that is an overwrite");
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = c5737e.iterator();
        C5817k c5817k2 = c5817k;
        while (it.hasNext()) {
            Map.Entry<C5830l, InterfaceC5945n> next = it.next();
            C5830l m23593I = c5830l.m23593I(next.getKey());
            if (m23617g(c5817k, m23593I.m23587Z())) {
                c5817k2 = m23618f(c5817k2, m23593I, next.getValue(), c5740e0, interfaceC5945n, c5823a);
            }
        }
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it2 = c5737e.iterator();
        C5817k c5817k3 = c5817k2;
        while (it2.hasNext()) {
            Map.Entry<C5830l, InterfaceC5945n> next2 = it2.next();
            C5830l m23593I2 = c5830l.m23593I(next2.getKey());
            if (!m23617g(c5817k, m23593I2.m23587Z())) {
                c5817k3 = m23618f(c5817k3, m23593I2, next2.getValue(), c5740e0, interfaceC5945n, c5823a);
            }
        }
        return c5817k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.firebase.database.p131s.p136j0.C5817k m23618f(com.google.firebase.database.p131s.p136j0.C5817k r9, com.google.firebase.database.p131s.C5830l r10, com.google.firebase.database.p139u.InterfaceC5945n r11, com.google.firebase.database.p131s.C5740e0 r12, com.google.firebase.database.p139u.InterfaceC5945n r13, com.google.firebase.database.p131s.p136j0.p137m.C5823a r14) {
        /*
            r8 = this;
            com.google.firebase.database.s.j0.a r0 = r9.m23627c()
            com.google.firebase.database.s.j0.l$d r6 = new com.google.firebase.database.s.j0.l$d
            r6.<init>(r12, r9, r13)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L34
            com.google.firebase.database.s.j0.m.d r10 = r8.f14294a
            com.google.firebase.database.u.h r10 = r10.mo23602h()
            com.google.firebase.database.u.i r10 = com.google.firebase.database.p139u.C5938i.m23239f(r11, r10)
            com.google.firebase.database.s.j0.m.d r11 = r8.f14294a
            com.google.firebase.database.s.j0.a r12 = r9.m23627c()
            com.google.firebase.database.u.i r12 = r12.m23695a()
            com.google.firebase.database.u.i r10 = r11.mo23597m(r12, r10, r14)
            r11 = 1
            com.google.firebase.database.s.j0.m.d r12 = r8.f14294a
            boolean r12 = r12.mo23599k()
            com.google.firebase.database.s.j0.k r9 = r9.m23625e(r10, r11, r12)
            goto Lb6
        L34:
            com.google.firebase.database.u.b r3 = r10.m23587Z()
            boolean r12 = r3.m23292p()
            if (r12 == 0) goto L59
            com.google.firebase.database.s.j0.m.d r10 = r8.f14294a
            com.google.firebase.database.s.j0.a r12 = r9.m23627c()
            com.google.firebase.database.u.i r12 = r12.m23695a()
            com.google.firebase.database.u.i r10 = r10.mo23600j(r12, r11)
            boolean r11 = r0.m23690f()
            boolean r12 = r0.m23691e()
            com.google.firebase.database.s.j0.k r9 = r9.m23625e(r10, r11, r12)
            goto Lb6
        L59:
            com.google.firebase.database.s.l r5 = r10.m23583e0()
            com.google.firebase.database.u.n r10 = r0.m23694b()
            com.google.firebase.database.u.n r10 = r10.mo23211L(r3)
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L6d
        L6b:
            r4 = r11
            goto L97
        L6d:
            com.google.firebase.database.u.n r12 = r6.mo23608b(r3)
            if (r12 == 0) goto L92
            com.google.firebase.database.u.b r13 = r5.m23589V()
            boolean r13 = r13.m23292p()
            if (r13 == 0) goto L8d
            com.google.firebase.database.s.l r13 = r5.m23586b0()
            com.google.firebase.database.u.n r13 = r12.mo23220B(r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L8d
            r4 = r12
            goto L97
        L8d:
            com.google.firebase.database.u.n r11 = r12.mo23218H(r5, r11)
            goto L6b
        L92:
            com.google.firebase.database.u.g r11 = com.google.firebase.database.p139u.C5936g.m23249P()
            goto L6b
        L97:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto Lb6
            com.google.firebase.database.s.j0.m.d r1 = r8.f14294a
            com.google.firebase.database.u.i r2 = r0.m23695a()
            r7 = r14
            com.google.firebase.database.u.i r10 = r1.mo23598l(r2, r3, r4, r5, r6, r7)
            boolean r11 = r0.m23690f()
            com.google.firebase.database.s.j0.m.d r12 = r8.f14294a
            boolean r12 = r12.mo23599k()
            com.google.firebase.database.s.j0.k r9 = r9.m23625e(r10, r11, r12)
        Lb6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p131s.p136j0.C5818l.m23618f(com.google.firebase.database.s.j0.k, com.google.firebase.database.s.l, com.google.firebase.database.u.n, com.google.firebase.database.s.e0, com.google.firebase.database.u.n, com.google.firebase.database.s.j0.m.a):com.google.firebase.database.s.j0.k");
    }

    /* renamed from: g */
    private static boolean m23617g(C5817k c5817k, C5921b c5921b) {
        return c5817k.m23627c().m23693c(c5921b);
    }

    /* renamed from: h */
    private C5817k m23616h(C5817k c5817k, C5830l c5830l, C5740e0 c5740e0, InterfaceC5826d.InterfaceC5827a interfaceC5827a, C5823a c5823a) {
        InterfaceC5945n m23959a;
        C5938i m23695a;
        InterfaceC5945n m23958b;
        C5801a m23627c = c5817k.m23627c();
        if (c5740e0.m23951i(c5830l) != null) {
            return c5817k;
        }
        boolean z = false;
        if (c5830l.isEmpty()) {
            C5795m.m23744g(c5817k.m23626d().m23690f(), "If change path is empty, we must have complete server data");
            if (c5817k.m23626d().m23691e()) {
                InterfaceC5945n m23628b = c5817k.m23628b();
                if (!(m23628b instanceof C5924c)) {
                    m23628b = C5936g.m23249P();
                }
                m23958b = c5740e0.m23955e(m23628b);
            } else {
                m23958b = c5740e0.m23958b(c5817k.m23628b());
            }
            m23695a = this.f14294a.mo23597m(c5817k.m23627c().m23695a(), C5938i.m23239f(m23958b, this.f14294a.mo23602h()), c5823a);
        } else {
            C5921b m23587Z = c5830l.m23587Z();
            if (m23587Z.m23292p()) {
                C5795m.m23744g(c5830l.size() == 1, "Can't have a priority with additional path components");
                InterfaceC5945n m23954f = c5740e0.m23954f(c5830l, m23627c.m23694b(), c5817k.m23626d().m23694b());
                if (m23954f != null) {
                    m23695a = this.f14294a.mo23600j(m23627c.m23695a(), m23954f);
                } else {
                    m23695a = m23627c.m23695a();
                }
            } else {
                C5830l m23583e0 = c5830l.m23583e0();
                if (m23627c.m23693c(m23587Z)) {
                    InterfaceC5945n m23954f2 = c5740e0.m23954f(c5830l, m23627c.m23694b(), c5817k.m23626d().m23694b());
                    if (m23954f2 != null) {
                        m23959a = m23627c.m23694b().mo23211L(m23587Z).mo23218H(m23583e0, m23954f2);
                    } else {
                        m23959a = m23627c.m23694b().mo23211L(m23587Z);
                    }
                } else {
                    m23959a = c5740e0.m23959a(m23587Z, c5817k.m23626d());
                }
                InterfaceC5945n interfaceC5945n = m23959a;
                if (interfaceC5945n != null) {
                    m23695a = this.f14294a.mo23598l(m23627c.m23695a(), m23587Z, interfaceC5945n, m23583e0, interfaceC5827a, c5823a);
                } else {
                    m23695a = m23627c.m23695a();
                }
            }
        }
        return c5817k.m23625e(m23695a, (m23627c.m23690f() || c5830l.isEmpty()) ? true : true, this.f14294a.mo23599k());
    }

    /* renamed from: i */
    private C5817k m23615i(C5817k c5817k, C5830l c5830l, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n, C5823a c5823a) {
        C5801a m23626d = c5817k.m23626d();
        return m23616h(c5817k.m23624f(m23626d.m23695a(), m23626d.m23690f() || c5830l.isEmpty(), m23626d.m23691e()), c5830l, c5740e0, f14293b, c5823a);
    }

    /* renamed from: j */
    private void m23614j(C5817k c5817k, C5817k c5817k2, List<C5803c> list) {
        C5801a m23627c = c5817k2.m23627c();
        if (m23627c.m23690f()) {
            boolean z = m23627c.m23694b().mo23217N() || m23627c.m23694b().isEmpty();
            if (list.isEmpty() && c5817k.m23627c().m23690f() && ((!z || m23627c.m23694b().equals(c5817k.m23629a())) && m23627c.m23694b().mo23208x().equals(c5817k.m23629a().mo23208x()))) {
                return;
            }
            list.add(C5803c.m23676m(m23627c.m23695a()));
        }
    }

    /* renamed from: b */
    public C5821c m23622b(C5817k c5817k, AbstractC5748d abstractC5748d, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n) {
        C5817k m23620d;
        C5823a c5823a = new C5823a();
        int i = C5820b.f14295a[abstractC5748d.m23906c().ordinal()];
        if (i == 1) {
            C5752f c5752f = (C5752f) abstractC5748d;
            if (c5752f.m23907b().m23902d()) {
                m23620d = m23618f(c5817k, c5752f.m23908a(), c5752f.m23899e(), c5740e0, interfaceC5945n, c5823a);
            } else {
                C5795m.m23745f(c5752f.m23907b().m23903c());
                m23620d = m23620d(c5817k, c5752f.m23908a(), c5752f.m23899e(), c5740e0, interfaceC5945n, c5752f.m23907b().m23901e() || (c5817k.m23626d().m23691e() && !c5752f.m23908a().isEmpty()), c5823a);
            }
        } else if (i == 2) {
            C5747c c5747c = (C5747c) abstractC5748d;
            if (c5747c.m23907b().m23902d()) {
                m23620d = m23619e(c5817k, c5747c.m23908a(), c5747c.m23909e(), c5740e0, interfaceC5945n, c5823a);
            } else {
                C5795m.m23745f(c5747c.m23907b().m23903c());
                m23620d = m23621c(c5817k, c5747c.m23908a(), c5747c.m23909e(), c5740e0, interfaceC5945n, c5747c.m23907b().m23901e() || c5817k.m23626d().m23691e(), c5823a);
            }
        } else if (i == 3) {
            C5745a c5745a = (C5745a) abstractC5748d;
            if (!c5745a.m23910f()) {
                m23620d = m23623a(c5817k, c5745a.m23908a(), c5745a.m23911e(), c5740e0, interfaceC5945n, c5823a);
            } else {
                m23620d = m23613k(c5817k, c5745a.m23908a(), c5740e0, interfaceC5945n, c5823a);
            }
        } else if (i == 4) {
            m23620d = m23615i(c5817k, abstractC5748d.m23908a(), c5740e0, interfaceC5945n, c5823a);
        } else {
            throw new AssertionError("Unknown operation: " + abstractC5748d.m23906c());
        }
        ArrayList arrayList = new ArrayList(c5823a.m23612a());
        m23614j(c5817k, m23620d, arrayList);
        return new C5821c(m23620d, arrayList);
    }

    /* renamed from: k */
    public C5817k m23613k(C5817k c5817k, C5830l c5830l, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n, C5823a c5823a) {
        InterfaceC5945n m23955e;
        if (c5740e0.m23951i(c5830l) != null) {
            return c5817k;
        }
        C5822d c5822d = new C5822d(c5740e0, c5817k, interfaceC5945n);
        C5938i m23695a = c5817k.m23627c().m23695a();
        if (!c5830l.isEmpty() && !c5830l.m23587Z().m23292p()) {
            C5921b m23587Z = c5830l.m23587Z();
            InterfaceC5945n m23959a = c5740e0.m23959a(m23587Z, c5817k.m23626d());
            if (m23959a == null && c5817k.m23626d().m23693c(m23587Z)) {
                m23959a = m23695a.m23236l().mo23211L(m23587Z);
            }
            InterfaceC5945n interfaceC5945n2 = m23959a;
            if (interfaceC5945n2 != null) {
                m23695a = this.f14294a.mo23598l(m23695a, m23587Z, interfaceC5945n2, c5830l.m23583e0(), c5822d, c5823a);
            } else if (interfaceC5945n2 == null && c5817k.m23627c().m23694b().mo23210R(m23587Z)) {
                m23695a = this.f14294a.mo23598l(m23695a, m23587Z, C5936g.m23249P(), c5830l.m23583e0(), c5822d, c5823a);
            }
            if (m23695a.m23236l().isEmpty() && c5817k.m23626d().m23690f()) {
                InterfaceC5945n m23958b = c5740e0.m23958b(c5817k.m23628b());
                if (m23958b.mo23217N()) {
                    m23695a = this.f14294a.mo23597m(m23695a, C5938i.m23239f(m23958b, this.f14294a.mo23602h()), c5823a);
                }
            }
        } else {
            if (c5817k.m23626d().m23690f()) {
                m23955e = c5740e0.m23958b(c5817k.m23628b());
            } else {
                m23955e = c5740e0.m23955e(c5817k.m23626d().m23694b());
            }
            m23695a = this.f14294a.mo23597m(m23695a, C5938i.m23239f(m23955e, this.f14294a.mo23602h()), c5823a);
        }
        return c5817k.m23625e(m23695a, c5817k.m23626d().m23690f() || c5740e0.m23951i(C5830l.m23588X()) != null, this.f14294a.mo23599k());
    }
}
