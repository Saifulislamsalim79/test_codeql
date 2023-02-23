package p201g.p259r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC7982n1;
import p201g.p259r.AbstractC8061y;
/* compiled from: PagePresenter.kt */
/* renamed from: g.r.o0 */
/* loaded from: classes2.dex */
public final class C7987o0<T> implements InterfaceC7885g0<T> {

    /* renamed from: e */
    public static final C7988a f19238e = new C7988a(null);

    /* renamed from: f */
    private static final C7987o0<Object> f19239f = new C7987o0<>(AbstractC7905j0.C7907b.f18953g.m17060e());

    /* renamed from: a */
    private final List<C7936k1<T>> f19240a;

    /* renamed from: b */
    private int f19241b;

    /* renamed from: c */
    private int f19242c;

    /* renamed from: d */
    private int f19243d;

    /* compiled from: PagePresenter.kt */
    /* renamed from: g.r.o0$a */
    /* loaded from: classes2.dex */
    public static final class C7988a {
        private C7988a() {
        }

        public /* synthetic */ C7988a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> C7987o0<T> m16922a() {
            return C7987o0.f19239f;
        }
    }

    /* compiled from: PagePresenter.kt */
    /* renamed from: g.r.o0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7989b {
        /* renamed from: a */
        void mo16844a(int i, int i2);

        /* renamed from: b */
        void mo16843b(int i, int i2);

        /* renamed from: c */
        void mo16842c(int i, int i2);

        /* renamed from: d */
        void mo16841d(EnumC7830b0 enumC7830b0, boolean z, AbstractC8061y abstractC8061y);

        /* renamed from: e */
        void mo16840e(C7825a0 c7825a0, C7825a0 c7825a02);
    }

    /* compiled from: PagePresenter.kt */
    /* renamed from: g.r.o0$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7990c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19244a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
            iArr[EnumC7830b0.APPEND.ordinal()] = 3;
            f19244a = iArr;
        }
    }

    public C7987o0(AbstractC7905j0.C7907b<T> c7907b) {
        List<C7936k1<T>> m3823D0;
        l.f(c7907b, "insertEvent");
        m3823D0 = C13742z.m3823D0(c7907b.m17068h());
        this.f19240a = m3823D0;
        this.f19241b = m16930j(c7907b.m17068h());
        this.f19242c = c7907b.m17066j();
        this.f19243d = c7907b.m17067i();
    }

    /* renamed from: g */
    private final void m16933g(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + getSize());
        }
    }

    /* renamed from: h */
    private final void m16932h(AbstractC7905j0.C7906a<T> c7906a, InterfaceC7989b interfaceC7989b) {
        int size = getSize();
        if (c7906a.m17079c() == EnumC7830b0.PREPEND) {
            int mo16938b = mo16938b();
            this.f19241b = mo16939a() - m16931i(new C11837e(c7906a.m17077e(), c7906a.m17078d()));
            this.f19242c = c7906a.m17075g();
            int size2 = getSize() - size;
            if (size2 > 0) {
                interfaceC7989b.mo16844a(0, size2);
            } else if (size2 < 0) {
                interfaceC7989b.mo16843b(0, -size2);
            }
            int max = Math.max(0, mo16938b + size2);
            int m17075g = c7906a.m17075g() - max;
            if (m17075g > 0) {
                interfaceC7989b.mo16842c(max, m17075g);
            }
            interfaceC7989b.mo16841d(EnumC7830b0.PREPEND, false, AbstractC8061y.C8064c.f19411b.m16800b());
            return;
        }
        int mo16937c = mo16937c();
        this.f19241b = mo16939a() - m16931i(new C11837e(c7906a.m17077e(), c7906a.m17078d()));
        this.f19243d = c7906a.m17075g();
        int size3 = getSize() - size;
        if (size3 > 0) {
            interfaceC7989b.mo16844a(size, size3);
        } else if (size3 < 0) {
            interfaceC7989b.mo16843b(size + size3, -size3);
        }
        int m17075g2 = c7906a.m17075g() - (mo16937c - (size3 < 0 ? Math.min(mo16937c, -size3) : 0));
        if (m17075g2 > 0) {
            interfaceC7989b.mo16842c(getSize() - c7906a.m17075g(), m17075g2);
        }
        interfaceC7989b.mo16841d(EnumC7830b0.APPEND, false, AbstractC8061y.C8064c.f19411b.m16800b());
    }

    /* renamed from: i */
    private final int m16931i(C11837e c11837e) {
        boolean z;
        Iterator<C7936k1<T>> it = this.f19240a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C7936k1<T> next = it.next();
            int[] m17025e = next.m17025e();
            int length = m17025e.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (c11837e.m10286F(m17025e[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                i += next.m17028b().size();
                it.remove();
            }
        }
        return i;
    }

    /* renamed from: j */
    private final int m16930j(List<C7936k1<T>> list) {
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C7936k1) it.next()).m17028b().size();
        }
        return i;
    }

    /* renamed from: l */
    private final int m16928l() {
        Integer m4039L;
        m4039L = C13715n.m4039L(((C7936k1) C13722p.m3954R(this.f19240a)).m17025e());
        l.d(m4039L);
        return m4039L.intValue();
    }

    /* renamed from: m */
    private final int m16927m() {
        Integer m4040K;
        m4040K = C13715n.m4040K(((C7936k1) C13722p.m3943c0(this.f19240a)).m17025e());
        l.d(m4040K);
        return m4040K.intValue();
    }

    /* renamed from: o */
    private final void m16925o(AbstractC7905j0.C7907b<T> c7907b, InterfaceC7989b interfaceC7989b) {
        int m16930j = m16930j(c7907b.m17068h());
        int size = getSize();
        int i = C7990c.f19244a[c7907b.m17070f().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int min = Math.min(mo16938b(), m16930j);
                int i2 = m16930j - min;
                this.f19240a.addAll(0, c7907b.m17068h());
                this.f19241b = mo16939a() + m16930j;
                this.f19242c = c7907b.m17066j();
                interfaceC7989b.mo16842c(mo16938b() - min, min);
                interfaceC7989b.mo16844a(0, i2);
                int size2 = (getSize() - size) - i2;
                if (size2 > 0) {
                    interfaceC7989b.mo16844a(0, size2);
                } else if (size2 < 0) {
                    interfaceC7989b.mo16843b(0, -size2);
                }
            } else if (i == 3) {
                int min2 = Math.min(mo16937c(), m16930j);
                int mo16938b = mo16938b() + mo16939a();
                int i3 = m16930j - min2;
                List<C7936k1<T>> list = this.f19240a;
                list.addAll(list.size(), c7907b.m17068h());
                this.f19241b = mo16939a() + m16930j;
                this.f19243d = c7907b.m17067i();
                interfaceC7989b.mo16842c(mo16938b, min2);
                interfaceC7989b.mo16844a(mo16938b + min2, i3);
                int size3 = (getSize() - size) - i3;
                if (size3 > 0) {
                    interfaceC7989b.mo16844a(getSize() - size3, size3);
                } else if (size3 < 0) {
                    interfaceC7989b.mo16843b(getSize(), -size3);
                }
            }
            interfaceC7989b.mo16840e(c7907b.m17065k(), c7907b.m17069g());
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // p201g.p259r.InterfaceC7885g0
    /* renamed from: a */
    public int mo16939a() {
        return this.f19241b;
    }

    @Override // p201g.p259r.InterfaceC7885g0
    /* renamed from: b */
    public int mo16938b() {
        return this.f19242c;
    }

    @Override // p201g.p259r.InterfaceC7885g0
    /* renamed from: c */
    public int mo16937c() {
        return this.f19243d;
    }

    @Override // p201g.p259r.InterfaceC7885g0
    /* renamed from: d */
    public T mo16936d(int i) {
        int size = this.f19240a.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.f19240a.get(i2).m17028b().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.f19240a.get(i2).m17028b().get(i);
    }

    /* renamed from: f */
    public final AbstractC7982n1.C7983a m16934f(int i) {
        int m3889g;
        int i2 = 0;
        int mo16938b = i - mo16938b();
        while (mo16938b >= this.f19240a.get(i2).m17028b().size()) {
            m3889g = C13726r.m3889g(this.f19240a);
            if (i2 >= m3889g) {
                break;
            }
            mo16938b -= this.f19240a.get(i2).m17028b().size();
            i2++;
        }
        return this.f19240a.get(i2).m17024f(mo16938b, i - mo16938b(), ((getSize() - i) - mo16937c()) - 1, m16928l(), m16927m());
    }

    @Override // p201g.p259r.InterfaceC7885g0
    public int getSize() {
        return mo16938b() + mo16939a() + mo16937c();
    }

    /* renamed from: k */
    public final T m16929k(int i) {
        m16933g(i);
        int mo16938b = i - mo16938b();
        if (mo16938b < 0 || mo16938b >= mo16939a()) {
            return null;
        }
        return mo16936d(mo16938b);
    }

    /* renamed from: n */
    public final AbstractC7982n1.C7984b m16926n() {
        int mo16939a = mo16939a() / 2;
        return new AbstractC7982n1.C7984b(mo16939a, mo16939a, m16928l(), m16927m());
    }

    /* renamed from: p */
    public final void m16924p(AbstractC7905j0<T> abstractC7905j0, InterfaceC7989b interfaceC7989b) {
        l.f(abstractC7905j0, "pageEvent");
        l.f(interfaceC7989b, "callback");
        if (abstractC7905j0 instanceof AbstractC7905j0.C7907b) {
            m16925o((AbstractC7905j0.C7907b) abstractC7905j0, interfaceC7989b);
        } else if (abstractC7905j0 instanceof AbstractC7905j0.C7906a) {
            m16932h((AbstractC7905j0.C7906a) abstractC7905j0, interfaceC7989b);
        } else if (abstractC7905j0 instanceof AbstractC7905j0.C7910c) {
            AbstractC7905j0.C7910c c7910c = (AbstractC7905j0.C7910c) abstractC7905j0;
            interfaceC7989b.mo16840e(c7910c.m17058d(), c7910c.m17059c());
        }
    }

    /* renamed from: q */
    public final C8052w<T> m16923q() {
        int mo16938b = mo16938b();
        int mo16937c = mo16937c();
        List<C7936k1<T>> list = this.f19240a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C13736w.m3850v(arrayList, ((C7936k1) it.next()).m17028b());
        }
        return new C8052w<>(mo16938b, mo16937c, arrayList);
    }

    public String toString() {
        String m3797a0;
        int mo16939a = mo16939a();
        ArrayList arrayList = new ArrayList(mo16939a);
        for (int i = 0; i < mo16939a; i++) {
            arrayList.add(mo16936d(i));
        }
        m3797a0 = C13742z.m3797a0(arrayList, null, null, null, 0, null, null, 63, null);
        return "[(" + mo16938b() + " placeholders), " + m3797a0 + ", (" + mo16937c() + " placeholders)]";
    }
}
