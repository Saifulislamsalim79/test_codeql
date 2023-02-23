package p201g.p266v;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1463e0;
import java.util.ArrayList;
import java.util.List;
import p201g.p266v.AbstractC8160m;
/* compiled from: FragmentTransitionSupport.java */
/* renamed from: g.v.e */
/* loaded from: classes2.dex */
public class C8137e extends AbstractC1463e0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: g.v.e$a */
    /* loaded from: classes2.dex */
    class C8138a extends AbstractC8160m.AbstractC8165e {

        /* renamed from: a */
        final /* synthetic */ Rect f19519a;

        C8138a(C8137e c8137e, Rect rect) {
            this.f19519a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: g.v.e$b */
    /* loaded from: classes2.dex */
    class C8139b implements AbstractC8160m.InterfaceC8166f {

        /* renamed from: c */
        final /* synthetic */ View f19520c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f19521d;

        C8139b(C8137e c8137e, View view, ArrayList arrayList) {
            this.f19520c = view;
            this.f19521d = arrayList;
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: a */
        public void mo16577a(AbstractC8160m abstractC8160m) {
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: b */
        public void mo16620b(AbstractC8160m abstractC8160m) {
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            abstractC8160m.mo16608Q(this);
            this.f19520c.setVisibility(8);
            int size = this.f19521d.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f19521d.get(i)).setVisibility(0);
            }
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: d */
        public void mo16619d(AbstractC8160m abstractC8160m) {
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: e */
        public void mo16618e(AbstractC8160m abstractC8160m) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: g.v.e$c */
    /* loaded from: classes2.dex */
    class C8140c extends C8168n {

        /* renamed from: c */
        final /* synthetic */ Object f19522c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f19523d;

        /* renamed from: e */
        final /* synthetic */ Object f19524e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f19525f;

        /* renamed from: w */
        final /* synthetic */ Object f19526w;

        /* renamed from: x */
        final /* synthetic */ ArrayList f19527x;

        C8140c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f19522c = obj;
            this.f19523d = arrayList;
            this.f19524e = obj2;
            this.f19525f = arrayList2;
            this.f19526w = obj3;
            this.f19527x = arrayList3;
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: a */
        public void mo16577a(AbstractC8160m abstractC8160m) {
            Object obj = this.f19522c;
            if (obj != null) {
                C8137e.this.m16682w(obj, this.f19523d, null);
            }
            Object obj2 = this.f19524e;
            if (obj2 != null) {
                C8137e.this.m16682w(obj2, this.f19525f, null);
            }
            Object obj3 = this.f19526w;
            if (obj3 != null) {
                C8137e.this.m16682w(obj3, this.f19527x, null);
            }
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            abstractC8160m.mo16608Q(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: g.v.e$d */
    /* loaded from: classes2.dex */
    class C8141d extends AbstractC8160m.AbstractC8165e {

        /* renamed from: a */
        final /* synthetic */ Rect f19529a;

        C8141d(C8137e c8137e, Rect rect) {
            this.f19529a = rect;
        }
    }

    /* renamed from: v */
    private static boolean m16683v(AbstractC8160m abstractC8160m) {
        return (AbstractC1463e0.m35781i(abstractC8160m.m16622z()) && AbstractC1463e0.m35781i(abstractC8160m.m16655A()) && AbstractC1463e0.m35781i(abstractC8160m.m16654B())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: a */
    public void mo16697a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC8160m) obj).mo16599b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: b */
    public void mo16696b(Object obj, ArrayList<View> arrayList) {
        AbstractC8160m abstractC8160m = (AbstractC8160m) obj;
        if (abstractC8160m == null) {
            return;
        }
        int i = 0;
        if (abstractC8160m instanceof C8173q) {
            C8173q c8173q = (C8173q) abstractC8160m;
            int m16586m0 = c8173q.m16586m0();
            while (i < m16586m0) {
                mo16696b(c8173q.m16587l0(i), arrayList);
                i++;
            }
        } else if (m16683v(abstractC8160m) || !AbstractC1463e0.m35781i(abstractC8160m.m16653C())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                abstractC8160m.mo16599b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: c */
    public void mo16695c(ViewGroup viewGroup, Object obj) {
        C8169o.m16617a(viewGroup, (AbstractC8160m) obj);
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: e */
    public boolean mo16694e(Object obj) {
        return obj instanceof AbstractC8160m;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: f */
    public Object mo16693f(Object obj) {
        if (obj != null) {
            return ((AbstractC8160m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: j */
    public Object mo16692j(Object obj, Object obj2, Object obj3) {
        AbstractC8160m abstractC8160m = (AbstractC8160m) obj;
        AbstractC8160m abstractC8160m2 = (AbstractC8160m) obj2;
        AbstractC8160m abstractC8160m3 = (AbstractC8160m) obj3;
        if (abstractC8160m != null && abstractC8160m2 != null) {
            C8173q c8173q = new C8173q();
            c8173q.m16590i0(abstractC8160m);
            c8173q.m16590i0(abstractC8160m2);
            c8173q.m16580r0(1);
            abstractC8160m = c8173q;
        } else if (abstractC8160m == null) {
            abstractC8160m = abstractC8160m2 != null ? abstractC8160m2 : null;
        }
        if (abstractC8160m3 != null) {
            C8173q c8173q2 = new C8173q();
            if (abstractC8160m != null) {
                c8173q2.m16590i0(abstractC8160m);
            }
            c8173q2.m16590i0(abstractC8160m3);
            return c8173q2;
        }
        return abstractC8160m;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: k */
    public Object mo16691k(Object obj, Object obj2, Object obj3) {
        C8173q c8173q = new C8173q();
        if (obj != null) {
            c8173q.m16590i0((AbstractC8160m) obj);
        }
        if (obj2 != null) {
            c8173q.m16590i0((AbstractC8160m) obj2);
        }
        if (obj3 != null) {
            c8173q.m16590i0((AbstractC8160m) obj3);
        }
        return c8173q;
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: m */
    public void mo16690m(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC8160m) obj).mo16601a(new C8139b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: n */
    public void mo16689n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC8160m) obj).mo16601a(new C8140c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: o */
    public void mo16688o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC8160m) obj).mo16603X(new C8141d(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: p */
    public void mo16687p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m35782h(view, rect);
            ((AbstractC8160m) obj).mo16603X(new C8138a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: s */
    public void mo16686s(Object obj, View view, ArrayList<View> arrayList) {
        C8173q c8173q = (C8173q) obj;
        List<View> m16653C = c8173q.m16653C();
        m16653C.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1463e0.m35784d(m16653C, arrayList.get(i));
        }
        m16653C.add(view);
        arrayList.add(view);
        mo16696b(c8173q, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: t */
    public void mo16685t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C8173q c8173q = (C8173q) obj;
        if (c8173q != null) {
            c8173q.m16653C().clear();
            c8173q.m16653C().addAll(arrayList2);
            m16682w(c8173q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1463e0
    /* renamed from: u */
    public Object mo16684u(Object obj) {
        if (obj == null) {
            return null;
        }
        C8173q c8173q = new C8173q();
        c8173q.m16590i0((AbstractC8160m) obj);
        return c8173q;
    }

    /* renamed from: w */
    public void m16682w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC8160m abstractC8160m = (AbstractC8160m) obj;
        int i = 0;
        if (abstractC8160m instanceof C8173q) {
            C8173q c8173q = (C8173q) abstractC8160m;
            int m16586m0 = c8173q.m16586m0();
            while (i < m16586m0) {
                m16682w(c8173q.m16587l0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m16683v(abstractC8160m)) {
            List<View> m16653C = abstractC8160m.m16653C();
            if (m16653C.size() == arrayList.size() && m16653C.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    abstractC8160m.mo16599b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    abstractC8160m.mo16607R(arrayList.get(size2));
                }
            }
        }
    }
}
