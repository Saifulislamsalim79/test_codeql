package p577n.p578a.p579a;

import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14413b;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: BlockQuoteParser.java */
/* renamed from: n.a.a.c */
/* loaded from: classes3.dex */
public class C14371c extends AbstractC14445a {

    /* renamed from: a */
    private final C14413b f31673a = new C14413b();

    /* compiled from: BlockQuoteParser.java */
    /* renamed from: n.a.a.c$a */
    /* loaded from: classes3.dex */
    public static class C14372a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            int mo1703d = interfaceC14452h.mo1703d();
            if (C14371c.m1932k(interfaceC14452h, mo1703d)) {
                int mo1701f = interfaceC14452h.mo1701f() + interfaceC14452h.mo1705b() + 1;
                if (C14411d.m1814i(interfaceC14452h.mo1704c(), mo1703d + 1)) {
                    mo1701f++;
                }
                AbstractC14450f m1710d = AbstractC14450f.m1710d(new C14371c());
                m1710d.mo1713a(mo1701f);
                return m1710d;
            }
            return AbstractC14450f.m1711c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m1932k(InterfaceC14452h interfaceC14452h, int i) {
        CharSequence mo1704c = interfaceC14452h.mo1704c();
        return interfaceC14452h.mo1705b() < C14411d.f31790a && i < mo1704c.length() && mo1704c.charAt(i) == '>';
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: b */
    public boolean mo1721b() {
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        int mo1703d = interfaceC14452h.mo1703d();
        if (m1932k(interfaceC14452h, mo1703d)) {
            int mo1701f = interfaceC14452h.mo1701f() + interfaceC14452h.mo1705b() + 1;
            if (C14411d.m1814i(interfaceC14452h.mo1704c(), mo1703d + 1)) {
                mo1701f++;
            }
            return C14447c.m1726a(mo1701f);
        }
        return C14447c.m1723d();
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: d */
    public boolean mo1719d(AbstractC14412a abstractC14412a) {
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: j */
    public C14413b mo1716g() {
        return this.f31673a;
    }
}
