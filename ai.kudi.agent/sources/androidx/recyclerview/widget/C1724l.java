package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes2.dex */
public class C1724l extends RecyclerView.AbstractC1634o implements RecyclerView.InterfaceC1643t {

    /* renamed from: D */
    private static final int[] f5293D = {16842919};

    /* renamed from: E */
    private static final int[] f5294E = new int[0];

    /* renamed from: a */
    private final int f5298a;

    /* renamed from: b */
    private final int f5299b;

    /* renamed from: c */
    final StateListDrawable f5300c;

    /* renamed from: d */
    final Drawable f5301d;

    /* renamed from: e */
    private final int f5302e;

    /* renamed from: f */
    private final int f5303f;

    /* renamed from: g */
    private final StateListDrawable f5304g;

    /* renamed from: h */
    private final Drawable f5305h;

    /* renamed from: i */
    private final int f5306i;

    /* renamed from: j */
    private final int f5307j;

    /* renamed from: k */
    int f5308k;

    /* renamed from: l */
    int f5309l;

    /* renamed from: m */
    float f5310m;

    /* renamed from: n */
    int f5311n;

    /* renamed from: o */
    int f5312o;

    /* renamed from: p */
    float f5313p;

    /* renamed from: s */
    private RecyclerView f5316s;

    /* renamed from: q */
    private int f5314q = 0;

    /* renamed from: r */
    private int f5315r = 0;

    /* renamed from: t */
    private boolean f5317t = false;

    /* renamed from: u */
    private boolean f5318u = false;

    /* renamed from: v */
    private int f5319v = 0;

    /* renamed from: w */
    private int f5320w = 0;

    /* renamed from: x */
    private final int[] f5321x = new int[2];

    /* renamed from: y */
    private final int[] f5322y = new int[2];

    /* renamed from: z */
    final ValueAnimator f5323z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: A */
    int f5295A = 0;

    /* renamed from: B */
    private final Runnable f5296B = new RunnableC1725a();

    /* renamed from: C */
    private final RecyclerView.AbstractC1644u f5297C = new C1726b();

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes2.dex */
    class RunnableC1725a implements Runnable {
        RunnableC1725a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1724l.this.m34691k(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes2.dex */
    class C1726b extends RecyclerView.AbstractC1644u {
        C1726b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1724l.this.m34680v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.l$c */
    /* loaded from: classes2.dex */
    private class C1727c extends AnimatorListenerAdapter {

        /* renamed from: c */
        private boolean f5326c = false;

        C1727c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5326c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5326c) {
                this.f5326c = false;
            } else if (((Float) C1724l.this.f5323z.getAnimatedValue()).floatValue() == 0.0f) {
                C1724l c1724l = C1724l.this;
                c1724l.f5295A = 0;
                c1724l.m34683s(0);
            } else {
                C1724l c1724l2 = C1724l.this;
                c1724l2.f5295A = 2;
                c1724l2.m34686p();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.l$d */
    /* loaded from: classes2.dex */
    private class C1728d implements ValueAnimator.AnimatorUpdateListener {
        C1728d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1724l.this.f5300c.setAlpha(floatValue);
            C1724l.this.f5301d.setAlpha(floatValue);
            C1724l.this.m34686p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1724l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f5300c = stateListDrawable;
        this.f5301d = drawable;
        this.f5304g = stateListDrawable2;
        this.f5305h = drawable2;
        this.f5302e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5303f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5306i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5307j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5298a = i2;
        this.f5299b = i3;
        this.f5300c.setAlpha(255);
        this.f5301d.setAlpha(255);
        this.f5323z.addListener(new C1727c());
        this.f5323z.addUpdateListener(new C1728d());
        m34698d(recyclerView);
    }

    /* renamed from: e */
    private void m34697e() {
        this.f5316s.removeCallbacks(this.f5296B);
    }

    /* renamed from: f */
    private void m34696f() {
        this.f5316s.m35312a1(this);
        this.f5316s.m35307c1(this);
        this.f5316s.m35304d1(this.f5297C);
        m34697e();
    }

    /* renamed from: g */
    private void m34695g(Canvas canvas) {
        int i = this.f5315r;
        int i2 = this.f5306i;
        int i3 = i - i2;
        int i4 = this.f5312o;
        int i5 = this.f5311n;
        int i6 = i4 - (i5 / 2);
        this.f5304g.setBounds(0, 0, i5, i2);
        this.f5305h.setBounds(0, 0, this.f5314q, this.f5307j);
        canvas.translate(0.0f, i3);
        this.f5305h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f5304g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: h */
    private void m34694h(Canvas canvas) {
        int i = this.f5314q;
        int i2 = this.f5302e;
        int i3 = i - i2;
        int i4 = this.f5309l;
        int i5 = this.f5308k;
        int i6 = i4 - (i5 / 2);
        this.f5300c.setBounds(0, 0, i2, i5);
        this.f5301d.setBounds(0, 0, this.f5303f, this.f5315r);
        if (m34689m()) {
            this.f5301d.draw(canvas);
            canvas.translate(this.f5302e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f5300c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f5302e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f5301d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f5300c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: i */
    private int[] m34693i() {
        int[] iArr = this.f5322y;
        int i = this.f5299b;
        iArr[0] = i;
        iArr[1] = this.f5314q - i;
        return iArr;
    }

    /* renamed from: j */
    private int[] m34692j() {
        int[] iArr = this.f5321x;
        int i = this.f5299b;
        iArr[0] = i;
        iArr[1] = this.f5315r - i;
        return iArr;
    }

    /* renamed from: l */
    private void m34690l(float f) {
        int[] m34693i = m34693i();
        float max = Math.max(m34693i[0], Math.min(m34693i[1], f));
        if (Math.abs(this.f5312o - max) < 2.0f) {
            return;
        }
        int m34684r = m34684r(this.f5313p, max, m34693i, this.f5316s.computeHorizontalScrollRange(), this.f5316s.computeHorizontalScrollOffset(), this.f5314q);
        if (m34684r != 0) {
            this.f5316s.scrollBy(m34684r, 0);
        }
        this.f5313p = max;
    }

    /* renamed from: m */
    private boolean m34689m() {
        return C7759x.m17563C(this.f5316s) == 1;
    }

    /* renamed from: q */
    private void m34685q(int i) {
        m34697e();
        this.f5316s.postDelayed(this.f5296B, i);
    }

    /* renamed from: r */
    private int m34684r(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: t */
    private void m34682t() {
        this.f5316s.m35294h(this);
        this.f5316s.m35285k(this);
        this.f5316s.m35282l(this.f5297C);
    }

    /* renamed from: w */
    private void m34679w(float f) {
        int[] m34692j = m34692j();
        float max = Math.max(m34692j[0], Math.min(m34692j[1], f));
        if (Math.abs(this.f5309l - max) < 2.0f) {
            return;
        }
        int m34684r = m34684r(this.f5310m, max, m34692j, this.f5316s.computeVerticalScrollRange(), this.f5316s.computeVerticalScrollOffset(), this.f5315r);
        if (m34684r != 0) {
            this.f5316s.scrollBy(0, m34684r);
        }
        this.f5310m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1643t
    /* renamed from: a */
    public void mo34701a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5319v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m34687o = m34687o(motionEvent.getX(), motionEvent.getY());
            boolean m34688n = m34688n(motionEvent.getX(), motionEvent.getY());
            if (m34687o || m34688n) {
                if (m34688n) {
                    this.f5320w = 1;
                    this.f5313p = (int) motionEvent.getX();
                } else if (m34687o) {
                    this.f5320w = 2;
                    this.f5310m = (int) motionEvent.getY();
                }
                m34683s(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f5319v == 2) {
            this.f5310m = 0.0f;
            this.f5313p = 0.0f;
            m34683s(1);
            this.f5320w = 0;
        } else if (motionEvent.getAction() == 2 && this.f5319v == 2) {
            m34681u();
            if (this.f5320w == 1) {
                m34690l(motionEvent.getX());
            }
            if (this.f5320w == 2) {
                m34679w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1643t
    /* renamed from: b */
    public boolean mo34700b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f5319v;
        if (i == 1) {
            boolean m34687o = m34687o(motionEvent.getX(), motionEvent.getY());
            boolean m34688n = m34688n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m34687o && !m34688n) {
                return false;
            }
            if (m34688n) {
                this.f5320w = 1;
                this.f5313p = (int) motionEvent.getX();
            } else if (m34687o) {
                this.f5320w = 2;
                this.f5310m = (int) motionEvent.getY();
            }
            m34683s(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1643t
    /* renamed from: c */
    public void mo34699c(boolean z) {
    }

    /* renamed from: d */
    public void m34698d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5316s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m34696f();
        }
        this.f5316s = recyclerView;
        if (recyclerView != null) {
            m34682t();
        }
    }

    /* renamed from: k */
    void m34691k(int i) {
        int i2 = this.f5295A;
        if (i2 == 1) {
            this.f5323z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f5295A = 3;
        ValueAnimator valueAnimator = this.f5323z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f5323z.setDuration(i);
        this.f5323z.start();
    }

    /* renamed from: n */
    boolean m34688n(float f, float f2) {
        if (f2 >= this.f5315r - this.f5306i) {
            int i = this.f5312o;
            int i2 = this.f5311n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    boolean m34687o(float f, float f2) {
        if (!m34689m() ? f >= this.f5314q - this.f5302e : f <= this.f5302e) {
            int i = this.f5309l;
            int i2 = this.f5308k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        if (this.f5314q == this.f5316s.getWidth() && this.f5315r == this.f5316s.getHeight()) {
            if (this.f5295A != 0) {
                if (this.f5317t) {
                    m34694h(canvas);
                }
                if (this.f5318u) {
                    m34695g(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f5314q = this.f5316s.getWidth();
        this.f5315r = this.f5316s.getHeight();
        m34683s(0);
    }

    /* renamed from: p */
    void m34686p() {
        this.f5316s.invalidate();
    }

    /* renamed from: s */
    void m34683s(int i) {
        if (i == 2 && this.f5319v != 2) {
            this.f5300c.setState(f5293D);
            m34697e();
        }
        if (i == 0) {
            m34686p();
        } else {
            m34681u();
        }
        if (this.f5319v == 2 && i != 2) {
            this.f5300c.setState(f5294E);
            m34685q(1200);
        } else if (i == 1) {
            m34685q(1500);
        }
        this.f5319v = i;
    }

    /* renamed from: u */
    public void m34681u() {
        int i = this.f5295A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f5323z.cancel();
        }
        this.f5295A = 1;
        ValueAnimator valueAnimator = this.f5323z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5323z.setDuration(500L);
        this.f5323z.setStartDelay(0L);
        this.f5323z.start();
    }

    /* renamed from: v */
    void m34680v(int i, int i2) {
        int computeVerticalScrollRange = this.f5316s.computeVerticalScrollRange();
        int i3 = this.f5315r;
        this.f5317t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f5298a;
        int computeHorizontalScrollRange = this.f5316s.computeHorizontalScrollRange();
        int i4 = this.f5314q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f5298a;
        this.f5318u = z;
        if (!this.f5317t && !z) {
            if (this.f5319v != 0) {
                m34683s(0);
                return;
            }
            return;
        }
        if (this.f5317t) {
            float f = i3;
            this.f5309l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f5308k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f5318u) {
            float f2 = i4;
            this.f5312o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f5311n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f5319v;
        if (i5 == 0 || i5 == 1) {
            m34683s(1);
        }
    }
}
