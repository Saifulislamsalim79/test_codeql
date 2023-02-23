package p577n.p578a.p579a;

import p577n.p578a.p579a.p581v.C14406a;
import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14418g;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: FencedCodeBlockParser.java */
/* renamed from: n.a.a.i */
/* loaded from: classes3.dex */
public class C14379i extends AbstractC14445a {

    /* renamed from: b */
    private String f31713b;

    /* renamed from: a */
    private final C14418g f31712a = new C14418g();

    /* renamed from: c */
    private StringBuilder f31714c = new StringBuilder();

    /* compiled from: FencedCodeBlockParser.java */
    /* renamed from: n.a.a.i$a */
    /* loaded from: classes3.dex */
    public static class C14380a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            int mo1705b = interfaceC14452h.mo1705b();
            if (mo1705b >= C14411d.f31790a) {
                return AbstractC14450f.m1711c();
            }
            int mo1703d = interfaceC14452h.mo1703d();
            C14379i m1903k = C14379i.m1903k(interfaceC14452h.mo1704c(), mo1703d, mo1705b);
            if (m1903k != null) {
                AbstractC14450f m1710d = AbstractC14450f.m1710d(m1903k);
                m1710d.mo1712b(mo1703d + m1903k.f31712a.m1801p());
                return m1710d;
            }
            return AbstractC14450f.m1711c();
        }
    }

    public C14379i(char c, int i, int i2) {
        this.f31712a.m1798s(c);
        this.f31712a.m1796u(i);
        this.f31712a.m1797t(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C14379i m1903k(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '`') {
                i3++;
            } else if (charAt != '~') {
                break;
            } else {
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (C14411d.m1821b('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new C14379i('`', i3, i2);
        } else if (i4 < 3 || i3 != 0) {
            return null;
        } else {
            return new C14379i('~', i4, i2);
        }
    }

    /* renamed from: l */
    private boolean m1902l(CharSequence charSequence, int i) {
        char m1803n = this.f31712a.m1803n();
        int m1801p = this.f31712a.m1801p();
        int m1812k = C14411d.m1812k(m1803n, charSequence, i, charSequence.length()) - i;
        return m1812k >= m1801p && C14411d.m1810m(charSequence, i + m1812k, charSequence.length()) == charSequence.length();
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        int mo1703d = interfaceC14452h.mo1703d();
        int mo1700h = interfaceC14452h.mo1700h();
        CharSequence mo1704c = interfaceC14452h.mo1704c();
        if (interfaceC14452h.mo1705b() < C14411d.f31790a && m1902l(mo1704c, mo1703d)) {
            return C14447c.m1724c();
        }
        int length = mo1704c.length();
        for (int m1802o = this.f31712a.m1802o(); m1802o > 0 && mo1700h < length && mo1704c.charAt(mo1700h) == ' '; m1802o--) {
            mo1700h++;
        }
        return C14447c.m1725b(mo1700h);
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: e */
    public void mo1718e() {
        this.f31712a.m1795v(C14406a.m1831d(this.f31713b.trim()));
        this.f31712a.m1794w(this.f31714c.toString());
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31712a;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: h */
    public void mo1715h(CharSequence charSequence) {
        if (this.f31713b == null) {
            this.f31713b = charSequence.toString();
            return;
        }
        this.f31714c.append(charSequence);
        this.f31714c.append('\n');
    }
}
