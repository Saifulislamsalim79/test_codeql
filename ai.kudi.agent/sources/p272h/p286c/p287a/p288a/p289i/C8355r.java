package p272h.p286c.p287a.p288a.p289i;

import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8239e;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8242h;
import p272h.p286c.p287a.p288a.p289i.AbstractC8350o;
/* compiled from: TransportImpl.java */
/* renamed from: h.c.a.a.i.r */
/* loaded from: classes2.dex */
final class C8355r<T> implements InterfaceC8240f<T> {

    /* renamed from: a */
    private final AbstractC8352p f20004a;

    /* renamed from: b */
    private final String f20005b;

    /* renamed from: c */
    private final C8236b f20006c;

    /* renamed from: d */
    private final InterfaceC8239e<T, byte[]> f20007d;

    /* renamed from: e */
    private final InterfaceC8356s f20008e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8355r(AbstractC8352p abstractC8352p, String str, C8236b c8236b, InterfaceC8239e<T, byte[]> interfaceC8239e, InterfaceC8356s interfaceC8356s) {
        this.f20004a = abstractC8352p;
        this.f20005b = str;
        this.f20006c = c8236b;
        this.f20007d = interfaceC8239e;
        this.f20008e = interfaceC8356s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m16228c(Exception exc) {
    }

    @Override // p272h.p286c.p287a.p288a.InterfaceC8240f
    /* renamed from: a */
    public void mo16230a(AbstractC8237c<T> abstractC8237c) {
        mo16229b(abstractC8237c, C8243a.f19811a);
    }

    @Override // p272h.p286c.p287a.p288a.InterfaceC8240f
    /* renamed from: b */
    public void mo16229b(AbstractC8237c<T> abstractC8237c, InterfaceC8242h interfaceC8242h) {
        InterfaceC8356s interfaceC8356s = this.f20008e;
        AbstractC8350o.AbstractC8351a m16255a = AbstractC8350o.m16255a();
        m16255a.mo16244e(this.f20004a);
        m16255a.mo16246c(abstractC8237c);
        m16255a.mo16243f(this.f20005b);
        m16255a.mo16245d(this.f20007d);
        m16255a.mo16247b(this.f20006c);
        interfaceC8356s.mo16227a(m16255a.mo16248a(), interfaceC8242h);
    }
}
