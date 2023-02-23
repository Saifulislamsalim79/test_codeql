package p577n.p578a.p579a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p577n.p578a.p579a.C14371c;
import p577n.p578a.p579a.C14379i;
import p577n.p578a.p579a.C14381j;
import p577n.p578a.p579a.C14383k;
import p577n.p578a.p579a.C14386l;
import p577n.p578a.p579a.C14394p;
import p577n.p578a.p579a.C14401t;
import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.AbstractC14427p;
import p577n.p578a.p582b.C14413b;
import p577n.p578a.p582b.C14416e;
import p577n.p578a.p582b.C14418g;
import p577n.p578a.p582b.C14420i;
import p577n.p578a.p582b.C14421j;
import p577n.p578a.p582b.C14424m;
import p577n.p578a.p582b.C14426o;
import p577n.p578a.p582b.C14435x;
import p577n.p578a.p583c.InterfaceC14437a;
import p577n.p578a.p583c.InterfaceC14439c;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.InterfaceC14448d;
import p577n.p578a.p583c.p584f.InterfaceC14449e;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
/* compiled from: DocumentParser.java */
/* renamed from: n.a.a.h */
/* loaded from: classes3.dex */
public class C14377h implements InterfaceC14452h {

    /* renamed from: p */
    private static final Set<Class<? extends AbstractC14412a>> f31694p = new LinkedHashSet(Arrays.asList(C14413b.class, C14420i.class, C14418g.class, C14421j.class, C14435x.class, AbstractC14427p.class, C14424m.class));

    /* renamed from: q */
    private static final Map<Class<? extends AbstractC14412a>, InterfaceC14449e> f31695q;

    /* renamed from: a */
    private CharSequence f31696a;

    /* renamed from: d */
    private boolean f31699d;

    /* renamed from: h */
    private boolean f31703h;

    /* renamed from: i */
    private final List<InterfaceC14449e> f31704i;

    /* renamed from: j */
    private final InterfaceC14439c f31705j;

    /* renamed from: k */
    private final List<InterfaceC14453a> f31706k;

    /* renamed from: l */
    private final C14376g f31707l;

    /* renamed from: b */
    private int f31697b = 0;

    /* renamed from: c */
    private int f31698c = 0;

    /* renamed from: e */
    private int f31700e = 0;

    /* renamed from: f */
    private int f31701f = 0;

    /* renamed from: g */
    private int f31702g = 0;

    /* renamed from: m */
    private final Map<String, C14426o> f31708m = new LinkedHashMap();

    /* renamed from: n */
    private List<InterfaceC14448d> f31709n = new ArrayList();

    /* renamed from: o */
    private Set<InterfaceC14448d> f31710o = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DocumentParser.java */
    /* renamed from: n.a.a.h$a */
    /* loaded from: classes3.dex */
    public static class C14378a implements InterfaceC14451g {

        /* renamed from: a */
        private final InterfaceC14448d f31711a;

        public C14378a(InterfaceC14448d interfaceC14448d) {
            this.f31711a = interfaceC14448d;
        }

        @Override // p577n.p578a.p583c.p584f.InterfaceC14451g
        /* renamed from: a */
        public InterfaceC14448d mo1708a() {
            return this.f31711a;
        }

        @Override // p577n.p578a.p583c.p584f.InterfaceC14451g
        /* renamed from: b */
        public CharSequence mo1707b() {
            InterfaceC14448d interfaceC14448d = this.f31711a;
            if (interfaceC14448d instanceof C14399r) {
                CharSequence m1840i = ((C14399r) interfaceC14448d).m1840i();
                if (m1840i.length() == 0) {
                    return null;
                }
                return m1840i;
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C14413b.class, new C14371c.C14372a());
        hashMap.put(C14420i.class, new C14381j.C14382a());
        hashMap.put(C14418g.class, new C14379i.C14380a());
        hashMap.put(C14421j.class, new C14383k.C14385b());
        hashMap.put(C14435x.class, new C14401t.C14402a());
        hashMap.put(AbstractC14427p.class, new C14394p.C14395a());
        hashMap.put(C14424m.class, new C14386l.C14387a());
        f31695q = Collections.unmodifiableMap(hashMap);
    }

    public C14377h(List<InterfaceC14449e> list, InterfaceC14439c interfaceC14439c, List<InterfaceC14453a> list2) {
        this.f31704i = list;
        this.f31705j = interfaceC14439c;
        this.f31706k = list2;
        C14376g c14376g = new C14376g();
        this.f31707l = c14376g;
        m1924g(c14376g);
    }

    /* renamed from: g */
    private void m1924g(InterfaceC14448d interfaceC14448d) {
        this.f31709n.add(interfaceC14448d);
        this.f31710o.add(interfaceC14448d);
    }

    /* renamed from: i */
    private <T extends InterfaceC14448d> T m1923i(T t) {
        while (!mo1702e().mo1719d(t.mo1716g())) {
            m1917o(mo1702e());
        }
        mo1702e().mo1716g().m1780b(t.mo1716g());
        m1924g(t);
        return t;
    }

    /* renamed from: j */
    private void m1922j(C14399r c14399r) {
        for (C14426o c14426o : c14399r.m1839j()) {
            c14399r.mo1716g().m1773i(c14426o);
            String m1784n = c14426o.m1784n();
            if (!this.f31708m.containsKey(m1784n)) {
                this.f31708m.put(m1784n, c14426o);
            }
        }
    }

    /* renamed from: k */
    private void m1921k() {
        CharSequence subSequence;
        if (this.f31699d) {
            CharSequence charSequence = this.f31696a;
            CharSequence subSequence2 = charSequence.subSequence(this.f31697b + 1, charSequence.length());
            int m1822a = C14411d.m1822a(this.f31698c);
            StringBuilder sb = new StringBuilder(subSequence2.length() + m1822a);
            for (int i = 0; i < m1822a; i++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f31696a;
            subSequence = charSequence2.subSequence(this.f31697b, charSequence2.length());
        }
        mo1702e().mo1715h(subSequence);
    }

    /* renamed from: l */
    private void m1920l() {
        if (this.f31696a.charAt(this.f31697b) == '\t') {
            this.f31697b++;
            int i = this.f31698c;
            this.f31698c = i + C14411d.m1822a(i);
            return;
        }
        this.f31697b++;
        this.f31698c++;
    }

    /* renamed from: m */
    public static List<InterfaceC14449e> m1919m(List<InterfaceC14449e> list, Set<Class<? extends AbstractC14412a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (Class<? extends AbstractC14412a> cls : set) {
            arrayList.add(f31695q.get(cls));
        }
        return arrayList;
    }

    /* renamed from: n */
    private void m1918n() {
        List<InterfaceC14448d> list = this.f31709n;
        list.remove(list.size() - 1);
    }

    /* renamed from: o */
    private void m1917o(InterfaceC14448d interfaceC14448d) {
        if (mo1702e() == interfaceC14448d) {
            m1918n();
        }
        if (interfaceC14448d instanceof C14399r) {
            m1922j((C14399r) interfaceC14448d);
        }
        interfaceC14448d.mo1718e();
    }

    /* renamed from: p */
    private C14416e m1916p() {
        m1915q(this.f31709n);
        m1908x();
        return this.f31707l.mo1716g();
    }

    /* renamed from: q */
    private void m1915q(List<InterfaceC14448d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m1917o(list.get(size));
        }
    }

    /* renamed from: r */
    private C14373d m1914r(InterfaceC14448d interfaceC14448d) {
        C14378a c14378a = new C14378a(interfaceC14448d);
        for (InterfaceC14449e interfaceC14449e : this.f31704i) {
            AbstractC14450f mo1714a = interfaceC14449e.mo1714a(this, c14378a);
            if (mo1714a instanceof C14373d) {
                return (C14373d) mo1714a;
            }
        }
        return null;
    }

    /* renamed from: s */
    private void m1913s() {
        int i = this.f31697b;
        int i2 = this.f31698c;
        this.f31703h = true;
        int length = this.f31696a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.f31696a.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.f31703h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f31700e = i;
        this.f31701f = i2;
        this.f31702g = i2 - this.f31698c;
    }

    /* renamed from: t */
    public static Set<Class<? extends AbstractC14412a>> m1912t() {
        return f31694p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
        m1906z(r9.f31700e);
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1911u(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p577n.p578a.p579a.C14377h.m1911u(java.lang.CharSequence):void");
    }

    /* renamed from: w */
    private void m1909w() {
        InterfaceC14448d mo1702e = mo1702e();
        m1918n();
        this.f31710o.remove(mo1702e);
        if (mo1702e instanceof C14399r) {
            m1922j((C14399r) mo1702e);
        }
        mo1702e.mo1716g().m1771l();
    }

    /* renamed from: x */
    private void m1908x() {
        InterfaceC14437a mo1728a = this.f31705j.mo1728a(new C14388m(this.f31706k, this.f31708m));
        for (InterfaceC14448d interfaceC14448d : this.f31710o) {
            interfaceC14448d.mo1722a(mo1728a);
        }
    }

    /* renamed from: y */
    private void m1907y(int i) {
        int i2 = this.f31701f;
        if (i >= i2) {
            this.f31697b = this.f31700e;
            this.f31698c = i2;
        }
        int length = this.f31696a.length();
        while (this.f31698c < i && this.f31697b != length) {
            m1920l();
        }
        if (this.f31698c > i) {
            this.f31697b--;
            this.f31698c = i;
            this.f31699d = true;
            return;
        }
        this.f31699d = false;
    }

    /* renamed from: z */
    private void m1906z(int i) {
        int i2 = this.f31700e;
        if (i >= i2) {
            this.f31697b = i2;
            this.f31698c = this.f31701f;
        }
        int length = this.f31696a.length();
        while (true) {
            int i3 = this.f31697b;
            if (i3 >= i || i3 == length) {
                break;
            }
            m1920l();
        }
        this.f31699d = false;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: a */
    public boolean mo1706a() {
        return this.f31703h;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: b */
    public int mo1705b() {
        return this.f31702g;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: c */
    public CharSequence mo1704c() {
        return this.f31696a;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: d */
    public int mo1703d() {
        return this.f31700e;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: e */
    public InterfaceC14448d mo1702e() {
        List<InterfaceC14448d> list = this.f31709n;
        return list.get(list.size() - 1);
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: f */
    public int mo1701f() {
        return this.f31698c;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14452h
    /* renamed from: h */
    public int mo1700h() {
        return this.f31697b;
    }

    /* renamed from: v */
    public C14416e m1910v(String str) {
        int i = 0;
        while (true) {
            int m1820c = C14411d.m1820c(str, i);
            if (m1820c == -1) {
                break;
            }
            m1911u(str.substring(i, m1820c));
            i = m1820c + 1;
            if (i < str.length() && str.charAt(m1820c) == '\r' && str.charAt(i) == '\n') {
                i = m1820c + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            m1911u(str.substring(i));
        }
        return m1916p();
    }
}
