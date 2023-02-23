package p272h.p286c.p287a.p288a.p289i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2671t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2673v;
import java.util.Collections;
import java.util.Set;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p272h.p286c.p287a.p288a.InterfaceC8242h;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.AbstractC8358u;
import p272h.p286c.p287a.p288a.p289i.p290a0.InterfaceC8248e;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
/* compiled from: TransportRuntime.java */
/* renamed from: h.c.a.a.i.t */
/* loaded from: classes2.dex */
public class C8357t implements InterfaceC8356s {

    /* renamed from: e */
    private static volatile AbstractC8358u f20009e;

    /* renamed from: a */
    private final InterfaceC8318a f20010a;

    /* renamed from: b */
    private final InterfaceC8318a f20011b;

    /* renamed from: c */
    private final InterfaceC8248e f20012c;

    /* renamed from: d */
    private final C2671t f20013d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8357t(InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, InterfaceC8248e interfaceC8248e, C2671t c2671t, C2673v c2673v) {
        this.f20010a = interfaceC8318a;
        this.f20011b = interfaceC8318a2;
        this.f20012c = interfaceC8248e;
        this.f20013d = c2671t;
        c2673v.m32405a();
    }

    /* renamed from: b */
    private AbstractC8342j m16226b(AbstractC8350o abstractC8350o) {
        AbstractC8342j.AbstractC8343a m16285a = AbstractC8342j.m16285a();
        m16285a.mo16265i(this.f20010a.mo16295a());
        m16285a.mo16263k(this.f20011b.mo16295a());
        m16285a.mo16264j(abstractC8350o.mo16249g());
        m16285a.mo16266h(new C8341i(abstractC8350o.mo16254b(), abstractC8350o.m16252d()));
        m16285a.mo16267g(abstractC8350o.mo16253c().mo16443a());
        return m16285a.mo16270d();
    }

    /* renamed from: c */
    public static C8357t m16225c() {
        AbstractC8358u abstractC8358u = f20009e;
        if (abstractC8358u != null) {
            return abstractC8358u.mo16219g();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C8236b> m16224d(InterfaceC8339g interfaceC8339g) {
        if (interfaceC8339g instanceof InterfaceC8340h) {
            return Collections.unmodifiableSet(((InterfaceC8340h) interfaceC8339g).mo16288a());
        }
        return Collections.singleton(C8236b.m16444b("proto"));
    }

    /* renamed from: f */
    public static void m16222f(Context context) {
        if (f20009e == null) {
            synchronized (C8357t.class) {
                if (f20009e == null) {
                    AbstractC8358u.InterfaceC8359a m16291m = C8336f.m16291m();
                    m16291m.mo16218a(context);
                    f20009e = m16291m.build();
                }
            }
        }
    }

    @Override // p272h.p286c.p287a.p288a.p289i.InterfaceC8356s
    /* renamed from: a */
    public void mo16227a(AbstractC8350o abstractC8350o, InterfaceC8242h interfaceC8242h) {
        this.f20012c.mo16431a(abstractC8350o.mo16250f().m16237f(abstractC8350o.mo16253c().mo16441c()), m16226b(abstractC8350o), interfaceC8242h);
    }

    /* renamed from: e */
    public C2671t m16223e() {
        return this.f20013d;
    }

    /* renamed from: g */
    public InterfaceC8241g m16221g(InterfaceC8339g interfaceC8339g) {
        Set<C8236b> m16224d = m16224d(interfaceC8339g);
        AbstractC8352p.AbstractC8353a m16242a = AbstractC8352p.m16242a();
        m16242a.mo16235b(interfaceC8339g.mo16289b());
        m16242a.mo16234c(interfaceC8339g.getExtras());
        return new C8354q(m16224d, m16242a.mo16236a(), this);
    }
}
