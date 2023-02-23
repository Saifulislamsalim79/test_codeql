package p577n.p578a.p579a;

import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.AbstractC14427p;
import p577n.p578a.p582b.C14414c;
import p577n.p578a.p582b.C14428q;
import p577n.p578a.p582b.C14430s;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14448d;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: ListBlockParser.java */
/* renamed from: n.a.a.p */
/* loaded from: classes3.dex */
public class C14394p extends AbstractC14445a {

    /* renamed from: a */
    private final AbstractC14427p f31766a;

    /* renamed from: b */
    private boolean f31767b;

    /* renamed from: c */
    private int f31768c;

    /* compiled from: ListBlockParser.java */
    /* renamed from: n.a.a.p$a */
    /* loaded from: classes3.dex */
    public static class C14395a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            InterfaceC14448d mo1708a = interfaceC14451g.mo1708a();
            if (interfaceC14452h.mo1705b() < C14411d.f31790a) {
                C14396b m1843n = C14394p.m1843n(interfaceC14452h.mo1704c(), interfaceC14452h.mo1703d(), interfaceC14452h.mo1701f() + interfaceC14452h.mo1705b(), interfaceC14451g.mo1707b() != null);
                if (m1843n == null) {
                    return AbstractC14450f.m1711c();
                }
                int i = m1843n.f31770b;
                C14398q c14398q = new C14398q(i - interfaceC14452h.mo1701f());
                if ((mo1708a instanceof C14394p) && C14394p.m1844m((AbstractC14427p) mo1708a.mo1716g(), m1843n.f31769a)) {
                    AbstractC14450f m1710d = AbstractC14450f.m1710d(c14398q);
                    m1710d.mo1713a(i);
                    return m1710d;
                }
                C14394p c14394p = new C14394p(m1843n.f31769a);
                m1843n.f31769a.m1781o(true);
                AbstractC14450f m1710d2 = AbstractC14450f.m1710d(c14394p, c14398q);
                m1710d2.mo1713a(i);
                return m1710d2;
            }
            return AbstractC14450f.m1711c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* renamed from: n.a.a.p$b */
    /* loaded from: classes3.dex */
    public static class C14396b {

        /* renamed from: a */
        final AbstractC14427p f31769a;

        /* renamed from: b */
        final int f31770b;

        C14396b(AbstractC14427p abstractC14427p, int i) {
            this.f31769a = abstractC14427p;
            this.f31770b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* renamed from: n.a.a.p$c */
    /* loaded from: classes3.dex */
    public static class C14397c {

        /* renamed from: a */
        final AbstractC14427p f31771a;

        /* renamed from: b */
        final int f31772b;

        C14397c(AbstractC14427p abstractC14427p, int i) {
            this.f31771a = abstractC14427p;
            this.f31772b = i;
        }
    }

    public C14394p(AbstractC14427p abstractC14427p) {
        this.f31766a = abstractC14427p;
    }

    /* renamed from: k */
    private static boolean m1846k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: l */
    private static boolean m1845l(CharSequence charSequence, int i) {
        char charAt;
        return i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\t' || charAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m1844m(AbstractC14427p abstractC14427p, AbstractC14427p abstractC14427p2) {
        if ((abstractC14427p instanceof C14414c) && (abstractC14427p2 instanceof C14414c)) {
            return m1846k(Character.valueOf(((C14414c) abstractC14427p).m1807p()), Character.valueOf(((C14414c) abstractC14427p2).m1807p()));
        }
        if ((abstractC14427p instanceof C14430s) && (abstractC14427p2 instanceof C14430s)) {
            return m1846k(Character.valueOf(((C14430s) abstractC14427p).m1770p()), Character.valueOf(((C14430s) abstractC14427p2).m1770p()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static C14396b m1843n(CharSequence charSequence, int i, int i2, boolean z) {
        C14397c m1842o = m1842o(charSequence, i);
        if (m1842o == null) {
            return null;
        }
        AbstractC14427p abstractC14427p = m1842o.f31771a;
        int i3 = m1842o.f31772b;
        int i4 = i2 + (i3 - i);
        boolean z2 = false;
        int length = charSequence.length();
        int i5 = i4;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z2 = true;
                    break;
                }
                i5++;
            } else {
                i5 += C14411d.m1822a(i5);
            }
            i3++;
        }
        if (!z || ((!(abstractC14427p instanceof C14430s) || ((C14430s) abstractC14427p).m1769q() == 1) && z2)) {
            if (!z2 || i5 - i4 > C14411d.f31790a) {
                i5 = i4 + 1;
            }
            return new C14396b(abstractC14427p, i5);
        }
        return null;
    }

    /* renamed from: o */
    private static C14397c m1842o(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return m1841p(charSequence, i);
        }
        int i2 = i + 1;
        if (m1845l(charSequence, i2)) {
            C14414c c14414c = new C14414c();
            c14414c.m1806q(charAt);
            return new C14397c(c14414c, i2);
        }
        return null;
    }

    /* renamed from: p */
    private static C14397c m1841p(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = i; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == ')' || charAt == '.') {
                if (i2 >= 1) {
                    int i4 = i3 + 1;
                    if (m1845l(charSequence, i4)) {
                        String charSequence2 = charSequence.subSequence(i, i3).toString();
                        C14430s c14430s = new C14430s();
                        c14430s.m1767s(Integer.parseInt(charSequence2));
                        c14430s.m1768r(charAt);
                        return new C14397c(c14430s, i4);
                    }
                }
                return null;
            }
            switch (charAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i2++;
                    if (i2 > 9) {
                        return null;
                    }
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: b */
    public boolean mo1721b() {
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        if (interfaceC14452h.mo1706a()) {
            this.f31767b = true;
            this.f31768c = 0;
        } else if (this.f31767b) {
            this.f31768c++;
        }
        return C14447c.m1725b(interfaceC14452h.mo1700h());
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: d */
    public boolean mo1719d(AbstractC14412a abstractC14412a) {
        if (abstractC14412a instanceof C14428q) {
            if (this.f31767b && this.f31768c == 1) {
                this.f31766a.m1781o(false);
                this.f31767b = false;
            }
            return true;
        }
        return false;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31766a;
    }
}
