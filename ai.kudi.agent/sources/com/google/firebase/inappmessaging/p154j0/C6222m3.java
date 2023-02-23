package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.model.AbstractC6395m;
import com.google.firebase.inappmessaging.p154j0.C6209k3;
import com.google.firebase.inappmessaging.p154j0.C6215l3;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import j.e.e0.e;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: RateLimiterClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.m3 */
/* loaded from: classes2.dex */
public class C6222m3 {

    /* renamed from: d */
    private static final C6215l3 f15105d = C6215l3.m22549T();

    /* renamed from: a */
    private final C6181f3 f15106a;

    /* renamed from: b */
    private final InterfaceC6332a f15107b;

    /* renamed from: c */
    private AbstractC11677k<C6215l3> f15108c = AbstractC11677k.m10596g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6222m3(C6181f3 c6181f3, InterfaceC6332a interfaceC6332a) {
        this.f15106a = c6181f3;
        this.f15107b = interfaceC6332a;
    }

    /* renamed from: a */
    private void m22533a() {
        this.f15108c = AbstractC11677k.m10596g();
    }

    /* renamed from: b */
    private AbstractC11677k<C6215l3> m22532b() {
        return this.f15108c.m10579x(this.f15106a.m22597c(C6215l3.m22543Z()).m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.b2
            public final void accept(Object obj) {
                C6222m3.this.m22523k((C6215l3) obj);
            }
        })).m10598e(new e() { // from class: com.google.firebase.inappmessaging.j0.a2
            public final void accept(Object obj) {
                C6222m3.this.m22526h((Throwable) obj);
            }
        });
    }

    /* renamed from: c */
    private static C6209k3 m22531c(C6209k3 c6209k3) {
        C6209k3.C6210a m22559a0 = C6209k3.m22559a0(c6209k3);
        m22559a0.m22556F();
        m22559a0.m22554H(c6209k3.m22561Y() + 1);
        return m22559a0.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m22523k(C6215l3 c6215l3) {
        this.f15108c = AbstractC11677k.m10589n(c6215l3);
    }

    /* renamed from: f */
    private boolean m22528f(C6209k3 c6209k3, AbstractC6395m abstractC6395m) {
        return this.f15107b.mo22281a() - c6209k3.m22562X() > abstractC6395m.mo22123d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ C6215l3 m22524j(C6215l3 c6215l3, AbstractC6395m abstractC6395m, C6209k3 c6209k3) throws Exception {
        C6209k3 m22531c = m22531c(c6209k3);
        C6215l3.C6216a m22544Y = C6215l3.m22544Y(c6215l3);
        m22544Y.m22542F(abstractC6395m.mo22124c(), m22531c);
        return m22544Y.build();
    }

    /* renamed from: q */
    private C6209k3 m22517q() {
        C6209k3.C6210a m22560Z = C6209k3.m22560Z();
        m22560Z.m22554H(0L);
        m22560Z.m22555G(this.f15107b.mo22281a());
        return m22560Z.build();
    }

    /* renamed from: d */
    public AbstractC11271b m22530d(final AbstractC6395m abstractC6395m) {
        return m22532b().m10599c(f15105d).m10593j(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.e2
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6222m3.this.m22521m(abstractC6395m, (C6215l3) obj);
            }
        });
    }

    /* renamed from: g */
    public AbstractC11696w<Boolean> m22527g(final AbstractC6395m abstractC6395m) {
        return m22532b().m10579x(AbstractC11677k.m10589n(C6215l3.m22549T())).m10588o(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.d2
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6222m3.this.m22520n(abstractC6395m, (C6215l3) obj);
            }
        }).m10595h(new InterfaceC11292g() { // from class: com.google.firebase.inappmessaging.j0.z1
            @Override // p425j.p444e.p450e0.InterfaceC11292g
            /* renamed from: c */
            public final boolean mo10557c(Object obj) {
                return C6222m3.this.m22519o(abstractC6395m, (C6209k3) obj);
            }
        }).m10590m();
    }

    /* renamed from: h */
    public /* synthetic */ void m22526h(Throwable th) throws Exception {
        m22533a();
    }

    /* renamed from: i */
    public /* synthetic */ boolean m22525i(AbstractC6395m abstractC6395m, C6209k3 c6209k3) throws Exception {
        return !m22528f(c6209k3, abstractC6395m);
    }

    /* renamed from: l */
    public /* synthetic */ InterfaceC11284d m22522l(final C6215l3 c6215l3) throws Exception {
        return this.f15106a.m22596d(c6215l3).m11244g(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.c2
            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public final void run() {
                C6222m3.this.m22523k(c6215l3);
            }
        });
    }

    /* renamed from: m */
    public /* synthetic */ InterfaceC11284d m22521m(final AbstractC6395m abstractC6395m, final C6215l3 c6215l3) throws Exception {
        return AbstractC11688p.m10532N(c6215l3.m22548U(abstractC6395m.mo22124c(), m22517q())).m10482z(new InterfaceC11292g() { // from class: com.google.firebase.inappmessaging.j0.y1
            @Override // p425j.p444e.p450e0.InterfaceC11292g
            /* renamed from: c */
            public final boolean mo10557c(Object obj) {
                return C6222m3.this.m22525i(abstractC6395m, (C6209k3) obj);
            }
        }).m10509i0(AbstractC11688p.m10532N(m22517q())).m10531O(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.w1
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6222m3.m22524j(C6215l3.this, abstractC6395m, (C6209k3) obj);
            }
        }).m10541E(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.x1
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6222m3.this.m22522l((C6215l3) obj);
            }
        });
    }

    /* renamed from: n */
    public /* synthetic */ C6209k3 m22520n(AbstractC6395m abstractC6395m, C6215l3 c6215l3) throws Exception {
        return c6215l3.m22548U(abstractC6395m.mo22124c(), m22517q());
    }

    /* renamed from: o */
    public /* synthetic */ boolean m22519o(AbstractC6395m abstractC6395m, C6209k3 c6209k3) throws Exception {
        return m22528f(c6209k3, abstractC6395m) || c6209k3.m22561Y() < abstractC6395m.mo22125b();
    }
}
