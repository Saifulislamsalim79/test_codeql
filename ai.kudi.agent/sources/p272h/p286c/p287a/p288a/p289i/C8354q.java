package p272h.p286c.p287a.p288a.p289i;

import java.util.Set;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8239e;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransportFactoryImpl.java */
/* renamed from: h.c.a.a.i.q */
/* loaded from: classes2.dex */
public final class C8354q implements InterfaceC8241g {

    /* renamed from: a */
    private final Set<C8236b> f20001a;

    /* renamed from: b */
    private final AbstractC8352p f20002b;

    /* renamed from: c */
    private final InterfaceC8356s f20003c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8354q(Set<C8236b> set, AbstractC8352p abstractC8352p, InterfaceC8356s interfaceC8356s) {
        this.f20001a = set;
        this.f20002b = abstractC8352p;
        this.f20003c = interfaceC8356s;
    }

    @Override // p272h.p286c.p287a.p288a.InterfaceC8241g
    /* renamed from: a */
    public <T> InterfaceC8240f<T> mo16232a(String str, Class<T> cls, InterfaceC8239e<T, byte[]> interfaceC8239e) {
        return mo16231b(str, cls, C8236b.m16444b("proto"), interfaceC8239e);
    }

    @Override // p272h.p286c.p287a.p288a.InterfaceC8241g
    /* renamed from: b */
    public <T> InterfaceC8240f<T> mo16231b(String str, Class<T> cls, C8236b c8236b, InterfaceC8239e<T, byte[]> interfaceC8239e) {
        if (this.f20001a.contains(c8236b)) {
            return new C8355r(this.f20002b, str, c8236b, interfaceC8239e, this.f20003c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c8236b, this.f20001a));
    }
}
