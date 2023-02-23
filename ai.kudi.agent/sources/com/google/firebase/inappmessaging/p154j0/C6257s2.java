package com.google.firebase.inappmessaging.p154j0;

import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import com.google.firebase.inappmessaging.InterfaceC6411u;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.AbstractC6395m;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import j.e.e0.e;
import j.e.v;
import java.util.concurrent.Callable;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9376a;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: DisplayCallbacksImpl.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s2 */
/* loaded from: classes2.dex */
public class C6257s2 implements InterfaceC6411u {

    /* renamed from: j */
    private static boolean f15182j;

    /* renamed from: a */
    private final C6349x2 f15183a;

    /* renamed from: b */
    private final InterfaceC6332a f15184b;

    /* renamed from: c */
    private final C6232o3 f15185c;

    /* renamed from: d */
    private final C6222m3 f15186d;

    /* renamed from: e */
    private final AbstractC6395m f15187e;

    /* renamed from: f */
    private final C6168d3 f15188f;

    /* renamed from: g */
    private final C6231o2 f15189g;

    /* renamed from: h */
    private final AbstractC6386i f15190h;

    /* renamed from: i */
    private final String f15191i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6257s2(C6349x2 c6349x2, InterfaceC6332a interfaceC6332a, C6232o3 c6232o3, C6222m3 c6222m3, C6221m2 c6221m2, AbstractC6395m abstractC6395m, C6168d3 c6168d3, C6231o2 c6231o2, AbstractC6386i abstractC6386i, String str) {
        this.f15183a = c6349x2;
        this.f15184b = interfaceC6332a;
        this.f15185c = c6232o3;
        this.f15186d = c6222m3;
        this.f15187e = abstractC6395m;
        this.f15188f = c6168d3;
        this.f15189g = c6231o2;
        this.f15190h = abstractC6386i;
        this.f15191i = str;
        f15182j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ InterfaceC11687o m22462l(C4465k c4465k, Throwable th) throws Exception {
        if (th instanceof Exception) {
            c4465k.m27776b((Exception) th);
        } else {
            c4465k.m27776b(new RuntimeException(th));
        }
        return AbstractC11677k.m10596g();
    }

    /* renamed from: p */
    private void m22458p(String str) {
        m22457q(str, null);
    }

    /* renamed from: q */
    private void m22457q(String str, AbstractC11677k<String> abstractC11677k) {
        if (abstractC11677k != null) {
            C6163c3.m22621a(String.format("Not recording: %s. Reason: %s", str, abstractC11677k));
        } else if (this.f15190h.m22152a().m22178c()) {
            C6163c3.m22621a(String.format("Not recording: %s. Reason: Message is test message", str));
        } else if (!this.f15189g.m22510a()) {
            C6163c3.m22621a(String.format("Not recording: %s. Reason: Data collection is disabled", str));
        } else {
            C6163c3.m22621a(String.format("Not recording: %s", str));
        }
    }

    /* renamed from: r */
    private j<Void> m22456r(AbstractC11271b abstractC11271b) {
        if (!f15182j) {
            mo22087d();
        }
        return m22453u(abstractC11271b.m11232t(), this.f15185c.m22506a());
    }

    /* renamed from: s */
    private j<Void> m22455s(final C6365a c6365a) {
        C6163c3.m22621a("Attempting to record: message click to metrics logger");
        return m22456r(AbstractC11271b.m11240k(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.l
            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public final void run() {
                C6257s2.this.m22467g(c6365a);
            }
        }));
    }

    /* renamed from: t */
    private AbstractC11271b m22454t() {
        String m22180a = this.f15190h.m22152a().m22180a();
        C6163c3.m22621a("Attempting to record message impression in impression store for id: " + m22180a);
        C6349x2 c6349x2 = this.f15183a;
        C9376a.C9378b m14916V = C9376a.m14916V();
        m14916V.m14912G(this.f15184b.mo22281a());
        m14916V.m14913F(m22180a);
        AbstractC11271b m11244g = c6349x2.m22262m(m14916V.build()).m11243h(C6254s.f15178c).m11244g(C6338v.f15350a);
        return C6357z2.m22227j(this.f15191i) ? this.f15186d.m22530d(this.f15187e).m11243h(C6228o.f15123c).m11244g(C6334u.f15342a).m11237n().m11248c(m11244g) : m11244g;
    }

    /* renamed from: u */
    private static <T> j<T> m22453u(AbstractC11677k<T> abstractC11677k, v vVar) {
        final C4465k c4465k = new C4465k();
        abstractC11677k.m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.r1
            public final void accept(Object obj) {
                C4465k.this.m27775c(obj);
            }
        }).m10579x(AbstractC11677k.m10591l(new Callable() { // from class: com.google.firebase.inappmessaging.j0.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4465k.this.m27775c(null);
            }
        })).m10585r(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.n
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6257s2.m22462l(C4465k.this, (Throwable) obj);
            }
        }).m10581v(vVar).m10584s();
        return c4465k.m27777a();
    }

    /* renamed from: v */
    private boolean m22452v() {
        return this.f15189g.m22510a();
    }

    /* renamed from: w */
    private AbstractC11271b m22451w() {
        return AbstractC11271b.m11240k(C6244q.f15151a);
    }

    @Override // com.google.firebase.inappmessaging.InterfaceC6411u
    /* renamed from: a */
    public j<Void> mo22090a(C6365a c6365a) {
        if (m22452v()) {
            if (c6365a.m22202b() == null) {
                return mo22088c(InterfaceC6411u.EnumC6412a.CLICK);
            }
            return m22455s(c6365a);
        }
        m22458p("message click to metrics logger");
        return new C4465k().m27777a();
    }

    @Override // com.google.firebase.inappmessaging.InterfaceC6411u
    /* renamed from: b */
    public j<Void> mo22089b(final InterfaceC6411u.EnumC6413b enumC6413b) {
        if (m22452v()) {
            C6163c3.m22621a("Attempting to record: render error to metrics logger");
            return m22453u(m22454t().m11248c(AbstractC11271b.m11240k(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.p
                @Override // p425j.p444e.p450e0.InterfaceC11287a
                public final void run() {
                    C6257s2.this.m22469e(enumC6413b);
                }
            })).m11248c(m22451w()).m11232t(), this.f15185c.m22506a());
        }
        m22458p("render error to metrics logger");
        return new C4465k().m27777a();
    }

    @Override // com.google.firebase.inappmessaging.InterfaceC6411u
    /* renamed from: c */
    public j<Void> mo22088c(final InterfaceC6411u.EnumC6412a enumC6412a) {
        if (m22452v()) {
            C6163c3.m22621a("Attempting to record: message dismissal to metrics logger");
            return m22456r(AbstractC11271b.m11240k(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.m
                @Override // p425j.p444e.p450e0.InterfaceC11287a
                public final void run() {
                    C6257s2.this.m22460n(enumC6412a);
                }
            }));
        }
        m22458p("message dismissal to metrics logger");
        return new C4465k().m27777a();
    }

    @Override // com.google.firebase.inappmessaging.InterfaceC6411u
    /* renamed from: d */
    public j<Void> mo22087d() {
        if (m22452v() && !f15182j) {
            C6163c3.m22621a("Attempting to record: message impression to metrics logger");
            return m22453u(m22454t().m11248c(AbstractC11271b.m11240k(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.t
                @Override // p425j.p444e.p450e0.InterfaceC11287a
                public final void run() {
                    C6257s2.this.m22468f();
                }
            })).m11248c(m22451w()).m11232t(), this.f15185c.m22506a());
        }
        m22458p("message impression to metrics logger");
        return new C4465k().m27777a();
    }

    /* renamed from: e */
    public /* synthetic */ void m22469e(InterfaceC6411u.EnumC6413b enumC6413b) throws Exception {
        this.f15188f.m22601q(this.f15190h, enumC6413b);
    }

    /* renamed from: f */
    public /* synthetic */ void m22468f() throws Exception {
        this.f15188f.m22603o(this.f15190h);
    }

    /* renamed from: g */
    public /* synthetic */ void m22467g(C6365a c6365a) throws Exception {
        this.f15188f.m22602p(this.f15190h, c6365a);
    }

    /* renamed from: n */
    public /* synthetic */ void m22460n(InterfaceC6411u.EnumC6412a enumC6412a) throws Exception {
        this.f15188f.m22605m(this.f15190h, enumC6412a);
    }
}
