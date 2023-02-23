package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LinearSmoothScroller.java */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes2.dex */
public class C1734o extends RecyclerView.AbstractC1610a0 {

    /* renamed from: k */
    protected PointF f5355k;

    /* renamed from: l */
    private final DisplayMetrics f5356l;

    /* renamed from: n */
    private float f5358n;

    /* renamed from: i */
    protected final LinearInterpolator f5353i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f5354j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f5357m = false;

    /* renamed from: o */
    protected int f5359o = 0;

    /* renamed from: p */
    protected int f5360p = 0;

    public C1734o(Context context) {
        this.f5356l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m34659A() {
        if (!this.f5357m) {
            this.f5358n = mo27027v(this.f5356l);
            this.f5357m = true;
        }
        return this.f5358n;
    }

    /* renamed from: y */
    private int m34649y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: B */
    protected int m34658B() {
        PointF pointF = this.f5355k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    protected void m34657C(RecyclerView.AbstractC1610a0.C1611a c1611a) {
        PointF m35237a = m35237a(m35232f());
        if (m35237a != null && (m35237a.x != 0.0f || m35237a.y != 0.0f)) {
            m35229i(m35237a);
            this.f5355k = m35237a;
            this.f5359o = (int) (m35237a.x * 10000.0f);
            this.f5360p = (int) (m35237a.y * 10000.0f);
            c1611a.m35220d((int) (this.f5359o * 1.2f), (int) (this.f5360p * 1.2f), (int) (mo34594x(10000) * 1.2f), this.f5353i);
            return;
        }
        c1611a.m35222b(m35232f());
        m35224r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
    /* renamed from: l */
    protected void mo34656l(int i, int i2, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1610a0.C1611a c1611a) {
        if (m35235c() == 0) {
            m35224r();
            return;
        }
        this.f5359o = m34649y(this.f5359o, i);
        int m34649y = m34649y(this.f5360p, i2);
        this.f5360p = m34649y;
        if (this.f5359o == 0 && m34649y == 0) {
            m34657C(c1611a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
    /* renamed from: m */
    protected void mo34655m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
    /* renamed from: n */
    protected void mo34654n() {
        this.f5360p = 0;
        this.f5359o = 0;
        this.f5355k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0
    /* renamed from: o */
    protected void mo34549o(View view, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1610a0.C1611a c1611a) {
        int m34652t = m34652t(view, m34648z());
        int m34651u = m34651u(view, m34658B());
        int m34650w = m34650w((int) Math.sqrt((m34652t * m34652t) + (m34651u * m34651u)));
        if (m34650w > 0) {
            c1611a.m35220d(-m34652t, -m34651u, m34650w, this.f5354j);
        }
    }

    /* renamed from: s */
    public int m34653s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: t */
    public int m34652t(View view, int i) {
        RecyclerView.AbstractC1635p m35233e = m35233e();
        if (m35233e == null || !m35233e.mo32305u()) {
            return 0;
        }
        RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
        return m34653s(m35233e.m35130a0(view) - ((ViewGroup.MarginLayoutParams) c1640q).leftMargin, m35233e.m35127d0(view) + ((ViewGroup.MarginLayoutParams) c1640q).rightMargin, m35233e.getPaddingLeft(), m35233e.m35092u0() - m35233e.getPaddingRight(), i);
    }

    /* renamed from: u */
    public int m34651u(View view, int i) {
        RecyclerView.AbstractC1635p m35233e = m35233e();
        if (m35233e == null || !m35233e.mo32303v()) {
            return 0;
        }
        RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
        return m34653s(m35233e.m35126e0(view) - ((ViewGroup.MarginLayoutParams) c1640q).topMargin, m35233e.m35132Y(view) + ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin, m35233e.getPaddingTop(), m35233e.m35124g0() - m35233e.getPaddingBottom(), i);
    }

    /* renamed from: v */
    protected float mo27027v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public int m34650w(int i) {
        double mo34594x = mo34594x(i);
        Double.isNaN(mo34594x);
        return (int) Math.ceil(mo34594x / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public int mo34594x(int i) {
        return (int) Math.ceil(Math.abs(i) * m34659A());
    }

    /* renamed from: z */
    protected int m34648z() {
        PointF pointF = this.f5355k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
