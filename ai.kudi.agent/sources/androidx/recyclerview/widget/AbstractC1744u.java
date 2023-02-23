package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes2.dex */
public abstract class AbstractC1744u {

    /* renamed from: a */
    protected final RecyclerView.AbstractC1635p f5372a;

    /* renamed from: b */
    private int f5373b;

    /* renamed from: c */
    final Rect f5374c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.u$a */
    /* loaded from: classes2.dex */
    public class C1745a extends AbstractC1744u {
        C1745a(RecyclerView.AbstractC1635p abstractC1635p) {
            super(abstractC1635p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: d */
        public int mo34615d(View view) {
            return this.f5372a.m35127d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: e */
        public int mo34614e(View view) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            return this.f5372a.m35128c0(view) + ((ViewGroup.MarginLayoutParams) c1640q).leftMargin + ((ViewGroup.MarginLayoutParams) c1640q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: f */
        public int mo34613f(View view) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            return this.f5372a.m35129b0(view) + ((ViewGroup.MarginLayoutParams) c1640q).topMargin + ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: g */
        public int mo34612g(View view) {
            return this.f5372a.m35130a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: h */
        public int mo34611h() {
            return this.f5372a.m35092u0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: i */
        public int mo34610i() {
            return this.f5372a.m35092u0() - this.f5372a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: j */
        public int mo34609j() {
            return this.f5372a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: k */
        public int mo34608k() {
            return this.f5372a.m35090v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: l */
        public int mo34607l() {
            return this.f5372a.m35122h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: m */
        public int mo34606m() {
            return this.f5372a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: n */
        public int mo34605n() {
            return (this.f5372a.m35092u0() - this.f5372a.getPaddingLeft()) - this.f5372a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: p */
        public int mo34604p(View view) {
            this.f5372a.m35094t0(view, true, this.f5374c);
            return this.f5374c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: q */
        public int mo34603q(View view) {
            this.f5372a.m35094t0(view, true, this.f5374c);
            return this.f5374c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: r */
        public void mo34602r(int i) {
            this.f5372a.mo35008J0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.u$b */
    /* loaded from: classes2.dex */
    public class C1746b extends AbstractC1744u {
        C1746b(RecyclerView.AbstractC1635p abstractC1635p) {
            super(abstractC1635p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: d */
        public int mo34615d(View view) {
            return this.f5372a.m35132Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: e */
        public int mo34614e(View view) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            return this.f5372a.m35129b0(view) + ((ViewGroup.MarginLayoutParams) c1640q).topMargin + ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: f */
        public int mo34613f(View view) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            return this.f5372a.m35128c0(view) + ((ViewGroup.MarginLayoutParams) c1640q).leftMargin + ((ViewGroup.MarginLayoutParams) c1640q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: g */
        public int mo34612g(View view) {
            return this.f5372a.m35126e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: h */
        public int mo34611h() {
            return this.f5372a.m35124g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: i */
        public int mo34610i() {
            return this.f5372a.m35124g0() - this.f5372a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: j */
        public int mo34609j() {
            return this.f5372a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: k */
        public int mo34608k() {
            return this.f5372a.m35122h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: l */
        public int mo34607l() {
            return this.f5372a.m35090v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: m */
        public int mo34606m() {
            return this.f5372a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: n */
        public int mo34605n() {
            return (this.f5372a.m35124g0() - this.f5372a.getPaddingTop()) - this.f5372a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: p */
        public int mo34604p(View view) {
            this.f5372a.m35094t0(view, true, this.f5374c);
            return this.f5374c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: q */
        public int mo34603q(View view) {
            this.f5372a.m35094t0(view, true, this.f5374c);
            return this.f5374c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1744u
        /* renamed from: r */
        public void mo34602r(int i) {
            this.f5372a.mo35006K0(i);
        }
    }

    /* synthetic */ AbstractC1744u(RecyclerView.AbstractC1635p abstractC1635p, C1745a c1745a) {
        this(abstractC1635p);
    }

    /* renamed from: a */
    public static AbstractC1744u m34620a(RecyclerView.AbstractC1635p abstractC1635p) {
        return new C1745a(abstractC1635p);
    }

    /* renamed from: b */
    public static AbstractC1744u m34619b(RecyclerView.AbstractC1635p abstractC1635p, int i) {
        if (i != 0) {
            if (i == 1) {
                return m34618c(abstractC1635p);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m34620a(abstractC1635p);
    }

    /* renamed from: c */
    public static AbstractC1744u m34618c(RecyclerView.AbstractC1635p abstractC1635p) {
        return new C1746b(abstractC1635p);
    }

    /* renamed from: d */
    public abstract int mo34615d(View view);

    /* renamed from: e */
    public abstract int mo34614e(View view);

    /* renamed from: f */
    public abstract int mo34613f(View view);

    /* renamed from: g */
    public abstract int mo34612g(View view);

    /* renamed from: h */
    public abstract int mo34611h();

    /* renamed from: i */
    public abstract int mo34610i();

    /* renamed from: j */
    public abstract int mo34609j();

    /* renamed from: k */
    public abstract int mo34608k();

    /* renamed from: l */
    public abstract int mo34607l();

    /* renamed from: m */
    public abstract int mo34606m();

    /* renamed from: n */
    public abstract int mo34605n();

    /* renamed from: o */
    public int m34617o() {
        if (Integer.MIN_VALUE == this.f5373b) {
            return 0;
        }
        return mo34605n() - this.f5373b;
    }

    /* renamed from: p */
    public abstract int mo34604p(View view);

    /* renamed from: q */
    public abstract int mo34603q(View view);

    /* renamed from: r */
    public abstract void mo34602r(int i);

    /* renamed from: s */
    public void m34616s() {
        this.f5373b = mo34605n();
    }

    private AbstractC1744u(RecyclerView.AbstractC1635p abstractC1635p) {
        this.f5373b = Integer.MIN_VALUE;
        this.f5374c = new Rect();
        this.f5372a = abstractC1635p;
    }
}
