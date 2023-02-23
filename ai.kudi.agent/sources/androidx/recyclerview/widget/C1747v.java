package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: PagerSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes2.dex */
public class C1747v extends AbstractC1753z {

    /* renamed from: d */
    private AbstractC1744u f5375d;

    /* renamed from: e */
    private AbstractC1744u f5376e;

    /* compiled from: PagerSnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.v$a */
    /* loaded from: classes2.dex */
    class C1748a extends C1734o {
        C1748a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1734o, androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
        /* renamed from: o */
        protected void mo34549o(View view, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1610a0.C1611a c1611a) {
            C1747v c1747v = C1747v.this;
            int[] mo34558c = c1747v.mo34558c(c1747v.f5383a.getLayoutManager(), view);
            int i = mo34558c[0];
            int i2 = mo34558c[1];
            int m34650w = m34650w(Math.max(Math.abs(i), Math.abs(i2)));
            if (m34650w > 0) {
                c1611a.m35220d(i, i2, m34650w, this.f5354j);
            }
        }

        @Override // androidx.recyclerview.widget.C1734o
        /* renamed from: v */
        protected float mo27027v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C1734o
        /* renamed from: x */
        protected int mo34594x(int i) {
            return Math.min(100, super.mo34594x(i));
        }
    }

    /* renamed from: m */
    private int m34601m(View view, AbstractC1744u abstractC1744u) {
        return (abstractC1744u.mo34612g(view) + (abstractC1744u.mo34614e(view) / 2)) - (abstractC1744u.mo34606m() + (abstractC1744u.mo34605n() / 2));
    }

    /* renamed from: n */
    private View m34600n(RecyclerView.AbstractC1635p abstractC1635p, AbstractC1744u abstractC1744u) {
        int m35142T = abstractC1635p.m35142T();
        View view = null;
        if (m35142T == 0) {
            return null;
        }
        int mo34606m = abstractC1744u.mo34606m() + (abstractC1744u.mo34605n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m35142T; i2++) {
            View m35145S = abstractC1635p.m35145S(i2);
            int abs = Math.abs((abstractC1744u.mo34612g(m35145S) + (abstractC1744u.mo34614e(m35145S) / 2)) - mo34606m);
            if (abs < i) {
                view = m35145S;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    private AbstractC1744u m34599o(RecyclerView.AbstractC1635p abstractC1635p) {
        AbstractC1744u abstractC1744u = this.f5376e;
        if (abstractC1744u == null || abstractC1744u.f5372a != abstractC1635p) {
            this.f5376e = AbstractC1744u.m34620a(abstractC1635p);
        }
        return this.f5376e;
    }

    /* renamed from: p */
    private AbstractC1744u m34598p(RecyclerView.AbstractC1635p abstractC1635p) {
        if (abstractC1635p.mo32303v()) {
            return m34597q(abstractC1635p);
        }
        if (abstractC1635p.mo32305u()) {
            return m34599o(abstractC1635p);
        }
        return null;
    }

    /* renamed from: q */
    private AbstractC1744u m34597q(RecyclerView.AbstractC1635p abstractC1635p) {
        AbstractC1744u abstractC1744u = this.f5375d;
        if (abstractC1744u == null || abstractC1744u.f5372a != abstractC1635p) {
            this.f5375d = AbstractC1744u.m34618c(abstractC1635p);
        }
        return this.f5375d;
    }

    /* renamed from: r */
    private boolean m34596r(RecyclerView.AbstractC1635p abstractC1635p, int i, int i2) {
        return abstractC1635p.mo32305u() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    private boolean m34595s(RecyclerView.AbstractC1635p abstractC1635p) {
        PointF mo32334a;
        int m35120i0 = abstractC1635p.m35120i0();
        if (!(abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) || (mo32334a = ((RecyclerView.AbstractC1610a0.InterfaceC1612b) abstractC1635p).mo32334a(m35120i0 - 1)) == null) {
            return false;
        }
        return mo32334a.x < 0.0f || mo32334a.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: c */
    public int[] mo34558c(RecyclerView.AbstractC1635p abstractC1635p, View view) {
        int[] iArr = new int[2];
        if (abstractC1635p.mo32305u()) {
            iArr[0] = m34601m(view, m34599o(abstractC1635p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1635p.mo32303v()) {
            iArr[1] = m34601m(view, m34597q(abstractC1635p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: e */
    public RecyclerView.AbstractC1610a0 mo34556e(RecyclerView.AbstractC1635p abstractC1635p) {
        if (abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) {
            return new C1748a(this.f5383a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: h */
    public View mo34223h(RecyclerView.AbstractC1635p abstractC1635p) {
        if (abstractC1635p.mo32303v()) {
            return m34600n(abstractC1635p, m34597q(abstractC1635p));
        }
        if (abstractC1635p.mo32305u()) {
            return m34600n(abstractC1635p, m34599o(abstractC1635p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: i */
    public int mo34553i(RecyclerView.AbstractC1635p abstractC1635p, int i, int i2) {
        AbstractC1744u m34598p;
        int m35120i0 = abstractC1635p.m35120i0();
        if (m35120i0 == 0 || (m34598p = m34598p(abstractC1635p)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int m35142T = abstractC1635p.m35142T();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < m35142T; i5++) {
            View m35145S = abstractC1635p.m35145S(i5);
            if (m35145S != null) {
                int m34601m = m34601m(m35145S, m34598p);
                if (m34601m <= 0 && m34601m > i3) {
                    view2 = m35145S;
                    i3 = m34601m;
                }
                if (m34601m >= 0 && m34601m < i4) {
                    view = m35145S;
                    i4 = m34601m;
                }
            }
        }
        boolean m34596r = m34596r(abstractC1635p, i, i2);
        if (!m34596r || view == null) {
            if (m34596r || view2 == null) {
                if (m34596r) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int m35110n0 = abstractC1635p.m35110n0(view) + (m34595s(abstractC1635p) == m34596r ? -1 : 1);
                if (m35110n0 < 0 || m35110n0 >= m35120i0) {
                    return -1;
                }
                return m35110n0;
            }
            return abstractC1635p.m35110n0(view2);
        }
        return abstractC1635p.m35110n0(view);
    }
}
