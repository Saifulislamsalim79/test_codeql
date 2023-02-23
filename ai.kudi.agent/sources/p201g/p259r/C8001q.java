package p201g.p259r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p491i0.C11834c;
import kotlin.p491i0.C11841h;
import kotlin.p557z.AbstractC13711l0;
import kotlin.p557z.C13703i;
import kotlin.p557z.C13742z;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC8061y;
/* compiled from: CachedPageEventFlow.kt */
/* renamed from: g.r.q */
/* loaded from: classes2.dex */
public final class C8001q<T> {

    /* renamed from: a */
    private int f19265a;

    /* renamed from: b */
    private int f19266b;

    /* renamed from: c */
    private final C13703i<C7936k1<T>> f19267c = new C13703i<>();

    /* renamed from: d */
    private final C7865e0 f19268d = new C7865e0();

    /* renamed from: e */
    private C7825a0 f19269e;

    /* compiled from: CachedPageEventFlow.kt */
    /* renamed from: g.r.q$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19270a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.PREPEND.ordinal()] = 1;
            iArr[EnumC7830b0.APPEND.ordinal()] = 2;
            iArr[EnumC7830b0.REFRESH.ordinal()] = 3;
            f19270a = iArr;
        }
    }

    /* renamed from: c */
    private final void m16908c(AbstractC7905j0.C7907b<T> c7907b) {
        C11834c m10263i;
        this.f19268d.m17126b(c7907b.m17065k());
        this.f19269e = c7907b.m17069g();
        int i = C8002a.f19270a[c7907b.m17070f().ordinal()];
        if (i == 1) {
            this.f19265a = c7907b.m17066j();
            m10263i = C11841h.m10263i(c7907b.m17068h().size() - 1, 0);
            Iterator<Integer> it = m10263i.iterator();
            while (it.hasNext()) {
                this.f19267c.addFirst(c7907b.m17068h().get(((AbstractC13711l0) it).mo4069b()));
            }
        } else if (i == 2) {
            this.f19266b = c7907b.m17067i();
            this.f19267c.addAll(c7907b.m17068h());
        } else if (i != 3) {
        } else {
            this.f19267c.clear();
            this.f19266b = c7907b.m17067i();
            this.f19265a = c7907b.m17066j();
            this.f19267c.addAll(c7907b.m17068h());
        }
    }

    /* renamed from: d */
    private final void m16907d(AbstractC7905j0.C7910c<T> c7910c) {
        this.f19268d.m17126b(c7910c.m17058d());
        this.f19269e = c7910c.m17059c();
    }

    /* renamed from: e */
    private final void m16906e(AbstractC7905j0.C7906a<T> c7906a) {
        this.f19268d.m17125c(c7906a.m17079c(), AbstractC8061y.C8064c.f19411b.m16800b());
        int i = C8002a.f19270a[c7906a.m17079c().ordinal()];
        int i2 = 0;
        if (i == 1) {
            this.f19265a = c7906a.m17075g();
            int m17076f = c7906a.m17076f();
            while (i2 < m17076f) {
                this.f19267c.removeFirst();
                i2++;
            }
        } else if (i == 2) {
            this.f19266b = c7906a.m17075g();
            int m17076f2 = c7906a.m17076f();
            while (i2 < m17076f2) {
                this.f19267c.removeLast();
                i2++;
            }
        } else {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
    }

    /* renamed from: a */
    public final void m16910a(AbstractC7905j0<T> abstractC7905j0) {
        l.f(abstractC7905j0, "event");
        if (abstractC7905j0 instanceof AbstractC7905j0.C7907b) {
            m16908c((AbstractC7905j0.C7907b) abstractC7905j0);
        } else if (abstractC7905j0 instanceof AbstractC7905j0.C7906a) {
            m16906e((AbstractC7905j0.C7906a) abstractC7905j0);
        } else if (abstractC7905j0 instanceof AbstractC7905j0.C7910c) {
            m16907d((AbstractC7905j0.C7910c) abstractC7905j0);
        }
    }

    /* renamed from: b */
    public final List<AbstractC7905j0<T>> m16909b() {
        List<C7936k1<T>> m3825B0;
        ArrayList arrayList = new ArrayList();
        C7825a0 m17124d = this.f19268d.m17124d();
        if (!this.f19267c.isEmpty()) {
            AbstractC7905j0.C7907b.C7908a c7908a = AbstractC7905j0.C7907b.f18953g;
            m3825B0 = C13742z.m3825B0(this.f19267c);
            arrayList.add(c7908a.m17062c(m3825B0, this.f19265a, this.f19266b, m17124d, this.f19269e));
        } else {
            arrayList.add(new AbstractC7905j0.C7910c(m17124d, this.f19269e));
        }
        return arrayList;
    }
}
