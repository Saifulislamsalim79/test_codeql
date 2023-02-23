package p577n.p578a.p579a;

import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14435x;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: ThematicBreakParser.java */
/* renamed from: n.a.a.t */
/* loaded from: classes3.dex */
public class C14401t extends AbstractC14445a {

    /* renamed from: a */
    private final C14435x f31781a = new C14435x();

    /* compiled from: ThematicBreakParser.java */
    /* renamed from: n.a.a.t$a */
    /* loaded from: classes3.dex */
    public static class C14402a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            if (interfaceC14452h.mo1705b() >= 4) {
                return AbstractC14450f.m1711c();
            }
            int mo1703d = interfaceC14452h.mo1703d();
            CharSequence mo1704c = interfaceC14452h.mo1704c();
            if (C14401t.m1835j(mo1704c, mo1703d)) {
                AbstractC14450f m1710d = AbstractC14450f.m1710d(new C14401t());
                m1710d.mo1712b(mo1704c.length());
                return m1710d;
            }
            return AbstractC14450f.m1711c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m1835j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i4++;
                } else if (charAt == '-') {
                    i2++;
                } else if (charAt != '_') {
                    return false;
                } else {
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        return C14447c.m1723d();
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31781a;
    }
}
