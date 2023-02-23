package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes2.dex */
public abstract class AbstractC1753z extends RecyclerView.AbstractC1642s {

    /* renamed from: a */
    RecyclerView f5383a;

    /* renamed from: b */
    private Scroller f5384b;

    /* renamed from: c */
    private final RecyclerView.AbstractC1644u f5385c = new C1754a();

    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.z$a */
    /* loaded from: classes2.dex */
    class C1754a extends RecyclerView.AbstractC1644u {

        /* renamed from: a */
        boolean f5386a = false;

        C1754a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f5386a) {
                this.f5386a = false;
                AbstractC1753z.this.m34550l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f5386a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.z$b */
    /* loaded from: classes2.dex */
    public class C1755b extends C1734o {
        C1755b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1734o, androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
        /* renamed from: o */
        protected void mo34549o(View view, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1610a0.C1611a c1611a) {
            AbstractC1753z abstractC1753z = AbstractC1753z.this;
            RecyclerView recyclerView = abstractC1753z.f5383a;
            if (recyclerView == null) {
                return;
            }
            int[] mo34558c = abstractC1753z.mo34558c(recyclerView.getLayoutManager(), view);
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
    }

    /* renamed from: g */
    private void m34554g() {
        this.f5383a.m35304d1(this.f5385c);
        this.f5383a.setOnFlingListener(null);
    }

    /* renamed from: j */
    private void m34552j() throws IllegalStateException {
        if (this.f5383a.getOnFlingListener() == null) {
            this.f5383a.m35282l(this.f5385c);
            this.f5383a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m34551k(RecyclerView.AbstractC1635p abstractC1635p, int i, int i2) {
        RecyclerView.AbstractC1610a0 mo34556e;
        int mo34553i;
        if (!(abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) || (mo34556e = mo34556e(abstractC1635p)) == null || (mo34553i = mo34553i(abstractC1635p, i, i2)) == -1) {
            return false;
        }
        mo34556e.m35226p(mo34553i);
        abstractC1635p.m35143S1(mo34556e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1642s
    /* renamed from: a */
    public boolean mo34560a(int i, int i2) {
        RecyclerView.AbstractC1635p layoutManager = this.f5383a.getLayoutManager();
        if (layoutManager == null || this.f5383a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5383a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m34551k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo34559b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5383a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m34554g();
        }
        this.f5383a = recyclerView;
        if (recyclerView != null) {
            m34552j();
            this.f5384b = new Scroller(this.f5383a.getContext(), new DecelerateInterpolator());
            m34550l();
        }
    }

    /* renamed from: c */
    public abstract int[] mo34558c(RecyclerView.AbstractC1635p abstractC1635p, View view);

    /* renamed from: d */
    public int[] mo34557d(int i, int i2) {
        this.f5384b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f5384b.getFinalX(), this.f5384b.getFinalY()};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.AbstractC1610a0 mo34556e(RecyclerView.AbstractC1635p abstractC1635p) {
        return m34555f(abstractC1635p);
    }

    @Deprecated
    /* renamed from: f */
    protected C1734o m34555f(RecyclerView.AbstractC1635p abstractC1635p) {
        if (abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) {
            return new C1755b(this.f5383a.getContext());
        }
        return null;
    }

    /* renamed from: h */
    public abstract View mo34223h(RecyclerView.AbstractC1635p abstractC1635p);

    /* renamed from: i */
    public abstract int mo34553i(RecyclerView.AbstractC1635p abstractC1635p, int i, int i2);

    /* renamed from: l */
    void m34550l() {
        RecyclerView.AbstractC1635p layoutManager;
        View mo34223h;
        RecyclerView recyclerView = this.f5383a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo34223h = mo34223h(layoutManager)) == null) {
            return;
        }
        int[] mo34558c = mo34558c(layoutManager, mo34223h);
        if (mo34558c[0] == 0 && mo34558c[1] == 0) {
            return;
        }
        this.f5383a.m35265q1(mo34558c[0], mo34558c[1]);
    }
}
