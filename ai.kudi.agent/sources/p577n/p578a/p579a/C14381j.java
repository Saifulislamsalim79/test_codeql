package p577n.p578a.p579a;

import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14420i;
import p577n.p578a.p583c.InterfaceC14437a;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: HeadingParser.java */
/* renamed from: n.a.a.j */
/* loaded from: classes3.dex */
public class C14381j extends AbstractC14445a {

    /* renamed from: a */
    private final C14420i f31715a;

    /* renamed from: b */
    private final String f31716b;

    /* compiled from: HeadingParser.java */
    /* renamed from: n.a.a.j$a */
    /* loaded from: classes3.dex */
    public static class C14382a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            CharSequence mo1707b;
            if (interfaceC14452h.mo1705b() >= C14411d.f31790a) {
                return AbstractC14450f.m1711c();
            }
            CharSequence mo1704c = interfaceC14452h.mo1704c();
            int mo1703d = interfaceC14452h.mo1703d();
            C14381j m1899k = C14381j.m1899k(mo1704c, mo1703d);
            if (m1899k == null) {
                int m1898l = C14381j.m1898l(mo1704c, mo1703d);
                if (m1898l > 0 && (mo1707b = interfaceC14451g.mo1707b()) != null) {
                    AbstractC14450f m1710d = AbstractC14450f.m1710d(new C14381j(m1898l, mo1707b.toString()));
                    m1710d.mo1712b(mo1704c.length());
                    m1710d.mo1709e();
                    return m1710d;
                }
                return AbstractC14450f.m1711c();
            }
            AbstractC14450f m1710d2 = AbstractC14450f.m1710d(m1899k);
            m1710d2.mo1712b(mo1704c.length());
            return m1710d2;
        }
    }

    public C14381j(int i, String str) {
        C14420i c14420i = new C14420i();
        this.f31715a = c14420i;
        c14420i.m1792o(i);
        this.f31716b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C14381j m1899k(CharSequence charSequence, int i) {
        int m1812k = C14411d.m1812k('#', charSequence, i, charSequence.length()) - i;
        if (m1812k == 0 || m1812k > 6) {
            return null;
        }
        int i2 = i + m1812k;
        if (i2 >= charSequence.length()) {
            return new C14381j(m1812k, "");
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == ' ' || charAt == '\t') {
            int m1809n = C14411d.m1809n(charSequence, charSequence.length() - 1, i2);
            int m1811l = C14411d.m1811l('#', charSequence, m1809n, i2);
            int m1809n2 = C14411d.m1809n(charSequence, m1811l, i2);
            if (m1809n2 != m1811l) {
                return new C14381j(m1812k, charSequence.subSequence(i2, m1809n2 + 1).toString());
            }
            return new C14381j(m1812k, charSequence.subSequence(i2, m1809n + 1).toString());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m1898l(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '-') {
            if (charAt != '=') {
                return 0;
            }
            if (m1897m(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return m1897m(charSequence, i + 1, '-') ? 2 : 0;
    }

    /* renamed from: m */
    private static boolean m1897m(CharSequence charSequence, int i, char c) {
        return C14411d.m1810m(charSequence, C14411d.m1812k(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: a */
    public void mo1722a(InterfaceC14437a interfaceC14437a) {
        interfaceC14437a.mo1741a(this.f31716b, this.f31715a);
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        return C14447c.m1723d();
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31715a;
    }
}
