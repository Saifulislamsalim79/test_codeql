package ai.kudi.dip.library.carouselView;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.AbstractC1744u;
import androidx.recyclerview.widget.C1734o;
import androidx.recyclerview.widget.C1735p;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* compiled from: CarouselSnapHelper.kt */
/* renamed from: ai.kudi.dip.library.carouselView.b */
/* loaded from: classes2.dex */
public final class C0777b extends C1735p {

    /* renamed from: f */
    private Context f2210f;

    /* renamed from: g */
    private AbstractC1744u f2211g;

    /* renamed from: h */
    private Scroller f2212h;

    /* renamed from: i */
    private int f2213i;

    /* compiled from: CarouselSnapHelper.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.b$a */
    /* loaded from: classes2.dex */
    public static final class C0778a extends C1734o {

        /* renamed from: r */
        final /* synthetic */ RecyclerView.AbstractC1635p f2215r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0778a(RecyclerView.AbstractC1635p abstractC1635p, Context context) {
            super(context);
            this.f2215r = abstractC1635p;
        }

        @Override // androidx.recyclerview.widget.C1734o, androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
        /* renamed from: o */
        protected void mo34549o(View view, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1610a0.C1611a c1611a) {
            int m10268d;
            int m10271a;
            l.f(view, "targetView");
            l.f(c1614b0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
            l.f(c1611a, "action");
            int[] mo34558c = C0777b.this.mo34558c(this.f2215r, view);
            int i = mo34558c[0];
            int i2 = mo34558c[1];
            m10268d = C11841h.m10268d(1000, m34650w(Math.abs(i)));
            m10271a = C11841h.m10271a(1, m10268d);
            c1611a.m35220d(i, i2, m10271a, this.f5354j);
        }

        @Override // androidx.recyclerview.widget.C1734o
        /* renamed from: v */
        protected float mo27027v(DisplayMetrics displayMetrics) {
            l.f(displayMetrics, "displayMetrics");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* renamed from: s */
    private final int m37994s(View view, AbstractC1744u abstractC1744u) {
        l.d(abstractC1744u);
        return abstractC1744u.mo34612g(view) - abstractC1744u.mo34606m();
    }

    /* renamed from: t */
    private final View m37993t(RecyclerView.AbstractC1635p abstractC1635p, AbstractC1744u abstractC1744u) {
        int m35142T;
        View view = null;
        if (abstractC1635p == null || (m35142T = abstractC1635p.m35142T()) == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        l.d(abstractC1744u);
        int mo34606m = abstractC1744u.mo34606m();
        int i2 = 0;
        if (m35142T > 0) {
            while (true) {
                int i3 = i2 + 1;
                View m35145S = abstractC1635p.m35145S(i2);
                int abs = Math.abs(abstractC1744u.mo34612g(m35145S) - mo34606m);
                if (abs < i) {
                    view = m35145S;
                    i = abs;
                }
                if (i3 >= m35142T) {
                    break;
                }
                i2 = i3;
            }
        }
        return view;
    }

    /* renamed from: u */
    private final AbstractC1744u m37992u(RecyclerView.AbstractC1635p abstractC1635p) {
        if (this.f2211g == null) {
            this.f2211g = AbstractC1744u.m34620a(abstractC1635p);
        }
        return this.f2211g;
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: b */
    public void mo34559b(RecyclerView recyclerView) throws IllegalStateException {
        if (recyclerView != null) {
            this.f2210f = recyclerView.getContext();
            this.f2212h = new Scroller(this.f2210f, new DecelerateInterpolator());
        } else {
            this.f2212h = null;
            this.f2210f = null;
        }
        super.mo34559b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.C1735p, androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: c */
    public int[] mo34558c(RecyclerView.AbstractC1635p abstractC1635p, View view) {
        l.f(abstractC1635p, "layoutManager");
        l.f(view, "targetView");
        return new int[]{m37994s(view, m37992u(abstractC1635p))};
    }

    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: d */
    public int[] mo34557d(int i, int i2) {
        int[] iArr = new int[2];
        AbstractC1744u abstractC1744u = this.f2211g;
        if (abstractC1744u == null) {
            return iArr;
        }
        if (this.f2213i == 0) {
            l.d(abstractC1744u);
            this.f2213i = (abstractC1744u.mo34610i() - abstractC1744u.mo34606m()) / 2;
        }
        Scroller scroller = this.f2212h;
        if (scroller != null) {
            if (scroller != null) {
                int i3 = this.f2213i;
                scroller.fling(0, 0, i, i2, -i3, i3, 0, 0);
            }
            Scroller scroller2 = this.f2212h;
            l.d(scroller2);
            iArr[0] = scroller2.getFinalX();
            Scroller scroller3 = this.f2212h;
            l.d(scroller3);
            iArr[1] = scroller3.getFinalY();
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: e */
    public RecyclerView.AbstractC1610a0 mo34556e(RecyclerView.AbstractC1635p abstractC1635p) {
        l.f(abstractC1635p, "layoutManager");
        if (abstractC1635p instanceof RecyclerView.AbstractC1610a0.InterfaceC1612b) {
            return super.mo34556e(abstractC1635p);
        }
        Context context = this.f2210f;
        if (context == null) {
            return null;
        }
        return new C0778a(abstractC1635p, context);
    }

    @Override // androidx.recyclerview.widget.C1735p, androidx.recyclerview.widget.AbstractC1753z
    /* renamed from: h */
    public View mo34223h(RecyclerView.AbstractC1635p abstractC1635p) {
        l.f(abstractC1635p, "layoutManager");
        return m37993t(abstractC1635p, m37992u(abstractC1635p));
    }
}
