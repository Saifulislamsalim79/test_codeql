package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LinearSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes2.dex */
public class C1735p extends AbstractC1753z {

    /* renamed from: d */
    private AbstractC1744u f5361d;

    /* renamed from: e */
    private AbstractC1744u f5362e;

    /* renamed from: m */
    private float m34647m(RecyclerView.AbstractC1635p abstractC1635p, AbstractC1744u abstractC1744u) {
        int m35142T = abstractC1635p.m35142T();
        if (m35142T == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m35142T; i3++) {
            View m35145S = abstractC1635p.m35145S(i3);
            int m35110n0 = abstractC1635p.m35110n0(m35145S);
            if (m35110n0 != -1) {
                if (m35110n0 < i) {
                    view = m35145S;
                    i = m35110n0;
                }
                if (m35110n0 > i2) {
                    view2 = m35145S;
                    i2 = m35110n0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC1744u.mo34615d(view), abstractC1744u.mo34615d(view2)) - Math.min(abstractC1744u.mo34612g(view), abstractC1744u.mo34612g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    /* renamed from: n */
    private int m34646n(View view, AbstractC1744u abstractC1744u) {
        return (abstractC1744u.mo34612g(view) + (abstractC1744u.mo34614e(view) / 2)) - (abstractC1744u.mo34606m() + (abstractC1744u.mo34605n() / 2));
    }

    /* renamed from: o */
    private int m34645o(RecyclerView.AbstractC1635p abstractC1635p, AbstractC1744u abstractC1744u, int i, int i2) {
        int[] mo34557d = mo34557d(i, i2);
        float m34647m = m34647m(abstractC1635p, abstractC1744u);
        if (m34647m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(mo34557d[0]) > Math.abs(mo34557d[1]) ? mo34557d[0] : mo34557d[1]) / m34647m);
    }

    /* renamed from: p */
    private View m34644p(RecyclerView.AbstractC1635p abstractC1635p, AbstractC1744u abstractC1744u) {
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

    /* renamed from: q */
    private AbstractC1744u m34643q(RecyclerView.AbstractC1635p abstractC1635p) {
        AbstractC1744u abstractC1744u = this.f5362e;
        if (abstractC1744u == null || abstractC1744u.f5372a != abstractC1635p) {
            this.f5362e = AbstractC1744u.m34620a(abstractC1635p);
        }
        return this.f5362e;
    }

    /* renamed from: r */
    private AbstractC1744u m34642r(RecyclerView.AbstractC1635p abstractC1635p) {
        AbstractC1744u abstractC1744u = this.f5361d;
        if (abstractC1744u == null || abstractC1744u.f5372a != abstractC1635p) {
            this.f5361d = AbstractC1744u.m34618c(abstractC1635p);
        }
        return this.f5361d;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: c */
    public int[] mo34558c(RecyclerView.AbstractC1635p abstractC1635p, View view) {
        int[] iArr = new int[2];
        if (abstractC1635p.mo32305u()) {
            iArr[0] = m34646n(view, m34643q(abstractC1635p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1635p.mo32303v()) {
            iArr[1] = m34646n(view, m34642r(abstractC1635p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: h */
    public View mo34223h(RecyclerView.AbstractC1635p abstractC1635p) {
        if (abstractC1635p.mo32303v()) {
            return m34644p(abstractC1635p, m34642r(abstractC1635p));
        }
        if (abstractC1635p.mo32305u()) {
            return m34644p(abstractC1635p, m34643q(abstractC1635p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: i */
    public int mo34553i(RecyclerView.AbstractC1635p abstractC1635p, int i, int i2) {
        int m35120i0;
        View mo34223h;
        int m35110n0;
        int i3;
        PointF mo32334a;
        int i4;
        int i5;
        if (!(abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) || (m35120i0 = abstractC1635p.m35120i0()) == 0 || (mo34223h = mo34223h(abstractC1635p)) == null || (m35110n0 = abstractC1635p.m35110n0(mo34223h)) == -1 || (mo32334a = ((RecyclerView.AbstractC1610a0.InterfaceC1612b) abstractC1635p).mo32334a(m35120i0 - 1)) == null) {
            return -1;
        }
        if (abstractC1635p.mo32305u()) {
            i4 = m34645o(abstractC1635p, m34643q(abstractC1635p), i, 0);
            if (mo32334a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC1635p.mo32303v()) {
            i5 = m34645o(abstractC1635p, m34642r(abstractC1635p), 0, i2);
            if (mo32334a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC1635p.mo32303v()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = m35110n0 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= m35120i0 ? i3 : i7;
    }
}
