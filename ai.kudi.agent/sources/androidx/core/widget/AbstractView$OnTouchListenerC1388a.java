package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p201g.p227h.p238l.C7759x;
/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractView$OnTouchListenerC1388a implements View.OnTouchListener {

    /* renamed from: J */
    private static final int f4254J = ViewConfiguration.getTapTimeout();

    /* renamed from: D */
    private boolean f4258D;

    /* renamed from: E */
    boolean f4259E;

    /* renamed from: F */
    boolean f4260F;

    /* renamed from: G */
    boolean f4261G;

    /* renamed from: H */
    private boolean f4262H;

    /* renamed from: I */
    private boolean f4263I;

    /* renamed from: e */
    final View f4266e;

    /* renamed from: f */
    private Runnable f4267f;

    /* renamed from: y */
    private int f4270y;

    /* renamed from: z */
    private int f4271z;

    /* renamed from: c */
    final C1389a f4264c = new C1389a();

    /* renamed from: d */
    private final Interpolator f4265d = new AccelerateInterpolator();

    /* renamed from: w */
    private float[] f4268w = {0.0f, 0.0f};

    /* renamed from: x */
    private float[] f4269x = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: A */
    private float[] f4255A = {0.0f, 0.0f};

    /* renamed from: B */
    private float[] f4256B = {0.0f, 0.0f};

    /* renamed from: C */
    private float[] f4257C = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes2.dex */
    public static class C1389a {

        /* renamed from: a */
        private int f4272a;

        /* renamed from: b */
        private int f4273b;

        /* renamed from: c */
        private float f4274c;

        /* renamed from: d */
        private float f4275d;

        /* renamed from: j */
        private float f4281j;

        /* renamed from: k */
        private int f4282k;

        /* renamed from: e */
        private long f4276e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f4280i = -1;

        /* renamed from: f */
        private long f4277f = 0;

        /* renamed from: g */
        private int f4278g = 0;

        /* renamed from: h */
        private int f4279h = 0;

        C1389a() {
        }

        /* renamed from: e */
        private float m36131e(long j) {
            if (j < this.f4276e) {
                return 0.0f;
            }
            long j2 = this.f4280i;
            if (j2 >= 0 && j >= j2) {
                long j3 = j - j2;
                float f = this.f4281j;
                return (1.0f - f) + (f * AbstractView$OnTouchListenerC1388a.m36152e(((float) j3) / this.f4282k, 0.0f, 1.0f));
            }
            return AbstractView$OnTouchListenerC1388a.m36152e(((float) (j - this.f4276e)) / this.f4272a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m36129g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m36135a() {
            if (this.f4277f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m36129g = m36129g(m36131e(currentAnimationTimeMillis));
                this.f4277f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f4277f)) * m36129g;
                this.f4278g = (int) (this.f4274c * f);
                this.f4279h = (int) (f * this.f4275d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m36134b() {
            return this.f4278g;
        }

        /* renamed from: c */
        public int m36133c() {
            return this.f4279h;
        }

        /* renamed from: d */
        public int m36132d() {
            float f = this.f4274c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m36130f() {
            float f = this.f4275d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m36128h() {
            return this.f4280i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4280i + ((long) this.f4282k);
        }

        /* renamed from: i */
        public void m36127i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4282k = AbstractView$OnTouchListenerC1388a.m36151f((int) (currentAnimationTimeMillis - this.f4276e), 0, this.f4273b);
            this.f4281j = m36131e(currentAnimationTimeMillis);
            this.f4280i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m36126j(int i) {
            this.f4273b = i;
        }

        /* renamed from: k */
        public void m36125k(int i) {
            this.f4272a = i;
        }

        /* renamed from: l */
        public void m36124l(float f, float f2) {
            this.f4274c = f;
            this.f4275d = f2;
        }

        /* renamed from: m */
        public void m36123m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4276e = currentAnimationTimeMillis;
            this.f4280i = -1L;
            this.f4277f = currentAnimationTimeMillis;
            this.f4281j = 0.5f;
            this.f4278g = 0;
            this.f4279h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC1390b implements Runnable {
        RunnableC1390b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC1388a abstractView$OnTouchListenerC1388a = AbstractView$OnTouchListenerC1388a.this;
            if (abstractView$OnTouchListenerC1388a.f4261G) {
                if (abstractView$OnTouchListenerC1388a.f4259E) {
                    abstractView$OnTouchListenerC1388a.f4259E = false;
                    abstractView$OnTouchListenerC1388a.f4264c.m36123m();
                }
                C1389a c1389a = AbstractView$OnTouchListenerC1388a.this.f4264c;
                if (!c1389a.m36128h() && AbstractView$OnTouchListenerC1388a.this.m36137u()) {
                    AbstractView$OnTouchListenerC1388a abstractView$OnTouchListenerC1388a2 = AbstractView$OnTouchListenerC1388a.this;
                    if (abstractView$OnTouchListenerC1388a2.f4260F) {
                        abstractView$OnTouchListenerC1388a2.f4260F = false;
                        abstractView$OnTouchListenerC1388a2.m36154c();
                    }
                    c1389a.m36135a();
                    AbstractView$OnTouchListenerC1388a.this.mo36111j(c1389a.m36134b(), c1389a.m36133c());
                    C7759x.m17514h0(AbstractView$OnTouchListenerC1388a.this.f4266e, this);
                    return;
                }
                AbstractView$OnTouchListenerC1388a.this.f4261G = false;
            }
        }
    }

    public AbstractView$OnTouchListenerC1388a(View view) {
        this.f4266e = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m36143o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m36142p(f3, f3);
        m36146l(1);
        m36144n(Float.MAX_VALUE, Float.MAX_VALUE);
        m36139s(0.2f, 0.2f);
        m36138t(1.0f, 1.0f);
        m36147k(f4254J);
        m36140r(500);
        m36141q(500);
    }

    /* renamed from: d */
    private float m36153d(int i, float f, float f2, float f3) {
        float m36149h = m36149h(this.f4268w[i], f2, this.f4269x[i], f);
        if (m36149h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f4255A[i];
        float f5 = this.f4256B[i];
        float f6 = this.f4257C[i];
        float f7 = f4 * f3;
        if (m36149h > 0.0f) {
            return m36152e(m36149h * f7, f5, f6);
        }
        return -m36152e((-m36149h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m36152e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m36151f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m36150g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4270y;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f4261G && this.f4270y == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m36149h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m36152e = m36152e(f * f2, 0.0f, f3);
        float m36150g = m36150g(f2 - f4, m36152e) - m36150g(f4, m36152e);
        if (m36150g < 0.0f) {
            interpolation = -this.f4265d.getInterpolation(-m36150g);
        } else if (m36150g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f4265d.getInterpolation(m36150g);
        }
        return m36152e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m36148i() {
        if (this.f4259E) {
            this.f4261G = false;
        } else {
            this.f4264c.m36127i();
        }
    }

    /* renamed from: v */
    private void m36136v() {
        int i;
        if (this.f4267f == null) {
            this.f4267f = new RunnableC1390b();
        }
        this.f4261G = true;
        this.f4259E = true;
        if (!this.f4258D && (i = this.f4271z) > 0) {
            C7759x.m17512i0(this.f4266e, this.f4267f, i);
        } else {
            this.f4267f.run();
        }
        this.f4258D = true;
    }

    /* renamed from: a */
    public abstract boolean mo36113a(int i);

    /* renamed from: b */
    public abstract boolean mo36112b(int i);

    /* renamed from: c */
    void m36154c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4266e.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo36111j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC1388a m36147k(int i) {
        this.f4271z = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC1388a m36146l(int i) {
        this.f4270y = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC1388a m36145m(boolean z) {
        if (this.f4262H && !z) {
            m36148i();
        }
        this.f4262H = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC1388a m36144n(float f, float f2) {
        float[] fArr = this.f4269x;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC1388a m36143o(float f, float f2) {
        float[] fArr = this.f4257C;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4262H
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m36148i()
            goto L58
        L1a:
            r5.f4260F = r2
            r5.f4258D = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4266e
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m36153d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4266e
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m36153d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4264c
            r7.m36124l(r0, r6)
            boolean r6 = r5.f4261G
            if (r6 != 0) goto L58
            boolean r6 = r5.m36137u()
            if (r6 == 0) goto L58
            r5.m36136v()
        L58:
            boolean r6 = r5.f4263I
            if (r6 == 0) goto L61
            boolean r6 = r5.f4261G
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1388a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC1388a m36142p(float f, float f2) {
        float[] fArr = this.f4256B;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC1388a m36141q(int i) {
        this.f4264c.m36126j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC1388a m36140r(int i) {
        this.f4264c.m36125k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC1388a m36139s(float f, float f2) {
        float[] fArr = this.f4268w;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC1388a m36138t(float f, float f2) {
        float[] fArr = this.f4255A;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m36137u() {
        C1389a c1389a = this.f4264c;
        int m36130f = c1389a.m36130f();
        int m36132d = c1389a.m36132d();
        return (m36130f != 0 && mo36112b(m36130f)) || (m36132d != 0 && mo36113a(m36132d));
    }
}
