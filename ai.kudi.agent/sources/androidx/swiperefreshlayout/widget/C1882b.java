package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p201g.p227h.p237k.C7675h;
import p201g.p249m.p250a.p251a.C7805b;
/* compiled from: CircularProgressDrawable.java */
/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes2.dex */
public class C1882b extends Drawable implements Animatable {

    /* renamed from: c */
    private final C1885c f5720c;

    /* renamed from: d */
    private float f5721d;

    /* renamed from: e */
    private Resources f5722e;

    /* renamed from: f */
    private Animator f5723f;

    /* renamed from: w */
    float f5724w;

    /* renamed from: x */
    boolean f5725x;

    /* renamed from: y */
    private static final Interpolator f5718y = new LinearInterpolator();

    /* renamed from: z */
    private static final Interpolator f5719z = new C7805b();

    /* renamed from: A */
    private static final int[] f5717A = {-16777216};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes2.dex */
    public class C1883a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ C1885c f5726c;

        C1883a(C1885c c1885c) {
            this.f5726c = c1885c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1882b.this.m34352n(floatValue, this.f5726c);
            C1882b.this.m34364b(floatValue, this.f5726c, false);
            C1882b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes2.dex */
    public class C1884b implements Animator.AnimatorListener {

        /* renamed from: c */
        final /* synthetic */ C1885c f5728c;

        C1884b(C1885c c1885c) {
            this.f5728c = c1885c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1882b.this.m34364b(1.0f, this.f5728c, true);
            this.f5728c.m34351A();
            this.f5728c.m34339l();
            C1882b c1882b = C1882b.this;
            if (c1882b.f5725x) {
                c1882b.f5725x = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f5728c.m34327x(false);
                return;
            }
            c1882b.f5724w += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1882b.this.f5724w = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes2.dex */
    public static class C1885c {

        /* renamed from: i */
        int[] f5738i;

        /* renamed from: j */
        int f5739j;

        /* renamed from: k */
        float f5740k;

        /* renamed from: l */
        float f5741l;

        /* renamed from: m */
        float f5742m;

        /* renamed from: n */
        boolean f5743n;

        /* renamed from: o */
        Path f5744o;

        /* renamed from: q */
        float f5746q;

        /* renamed from: r */
        int f5747r;

        /* renamed from: s */
        int f5748s;

        /* renamed from: u */
        int f5750u;

        /* renamed from: a */
        final RectF f5730a = new RectF();

        /* renamed from: b */
        final Paint f5731b = new Paint();

        /* renamed from: c */
        final Paint f5732c = new Paint();

        /* renamed from: d */
        final Paint f5733d = new Paint();

        /* renamed from: e */
        float f5734e = 0.0f;

        /* renamed from: f */
        float f5735f = 0.0f;

        /* renamed from: g */
        float f5736g = 0.0f;

        /* renamed from: h */
        float f5737h = 5.0f;

        /* renamed from: p */
        float f5745p = 1.0f;

        /* renamed from: t */
        int f5749t = 255;

        C1885c() {
            this.f5731b.setStrokeCap(Paint.Cap.SQUARE);
            this.f5731b.setAntiAlias(true);
            this.f5731b.setStyle(Paint.Style.STROKE);
            this.f5732c.setStyle(Paint.Style.FILL);
            this.f5732c.setAntiAlias(true);
            this.f5733d.setColor(0);
        }

        /* renamed from: A */
        void m34351A() {
            this.f5740k = this.f5734e;
            this.f5741l = this.f5735f;
            this.f5742m = this.f5736g;
        }

        /* renamed from: a */
        void m34350a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5730a;
            float f = this.f5746q;
            float f2 = (this.f5737h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f5747r * this.f5745p) / 2.0f, this.f5737h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f5734e;
            float f4 = this.f5736g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5735f + f4) * 360.0f) - f5;
            this.f5731b.setColor(this.f5750u);
            this.f5731b.setAlpha(this.f5749t);
            float f7 = this.f5737h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5733d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5731b);
            m34349b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        void m34349b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5743n) {
                Path path = this.f5744o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5744o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5744o.moveTo(0.0f, 0.0f);
                this.f5744o.lineTo(this.f5747r * this.f5745p, 0.0f);
                Path path3 = this.f5744o;
                float f3 = this.f5745p;
                path3.lineTo((this.f5747r * f3) / 2.0f, this.f5748s * f3);
                this.f5744o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f5747r * this.f5745p) / 2.0f), rectF.centerY() + (this.f5737h / 2.0f));
                this.f5744o.close();
                this.f5732c.setColor(this.f5750u);
                this.f5732c.setAlpha(this.f5749t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5744o, this.f5732c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m34348c() {
            return this.f5749t;
        }

        /* renamed from: d */
        float m34347d() {
            return this.f5735f;
        }

        /* renamed from: e */
        int m34346e() {
            return this.f5738i[m34345f()];
        }

        /* renamed from: f */
        int m34345f() {
            return (this.f5739j + 1) % this.f5738i.length;
        }

        /* renamed from: g */
        float m34344g() {
            return this.f5734e;
        }

        /* renamed from: h */
        int m34343h() {
            return this.f5738i[this.f5739j];
        }

        /* renamed from: i */
        float m34342i() {
            return this.f5741l;
        }

        /* renamed from: j */
        float m34341j() {
            return this.f5742m;
        }

        /* renamed from: k */
        float m34340k() {
            return this.f5740k;
        }

        /* renamed from: l */
        void m34339l() {
            m34331t(m34345f());
        }

        /* renamed from: m */
        void m34338m() {
            this.f5740k = 0.0f;
            this.f5741l = 0.0f;
            this.f5742m = 0.0f;
            m34326y(0.0f);
            m34329v(0.0f);
            m34328w(0.0f);
        }

        /* renamed from: n */
        void m34337n(int i) {
            this.f5749t = i;
        }

        /* renamed from: o */
        void m34336o(float f, float f2) {
            this.f5747r = (int) f;
            this.f5748s = (int) f2;
        }

        /* renamed from: p */
        void m34335p(float f) {
            if (f != this.f5745p) {
                this.f5745p = f;
            }
        }

        /* renamed from: q */
        void m34334q(float f) {
            this.f5746q = f;
        }

        /* renamed from: r */
        void m34333r(int i) {
            this.f5750u = i;
        }

        /* renamed from: s */
        void m34332s(ColorFilter colorFilter) {
            this.f5731b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m34331t(int i) {
            this.f5739j = i;
            this.f5750u = this.f5738i[i];
        }

        /* renamed from: u */
        void m34330u(int[] iArr) {
            this.f5738i = iArr;
            m34331t(0);
        }

        /* renamed from: v */
        void m34329v(float f) {
            this.f5735f = f;
        }

        /* renamed from: w */
        void m34328w(float f) {
            this.f5736g = f;
        }

        /* renamed from: x */
        void m34327x(boolean z) {
            if (this.f5743n != z) {
                this.f5743n = z;
            }
        }

        /* renamed from: y */
        void m34326y(float f) {
            this.f5734e = f;
        }

        /* renamed from: z */
        void m34325z(float f) {
            this.f5737h = f;
            this.f5731b.setStrokeWidth(f);
        }
    }

    public C1882b(Context context) {
        C7675h.m17866f(context);
        this.f5722e = context.getResources();
        C1885c c1885c = new C1885c();
        this.f5720c = c1885c;
        c1885c.m34330u(f5717A);
        m34355k(2.5f);
        m34353m();
    }

    /* renamed from: a */
    private void m34365a(float f, C1885c c1885c) {
        m34352n(f, c1885c);
        c1885c.m34326y(c1885c.m34340k() + (((c1885c.m34342i() - 0.01f) - c1885c.m34340k()) * f));
        c1885c.m34329v(c1885c.m34342i());
        c1885c.m34328w(c1885c.m34341j() + ((((float) (Math.floor(c1885c.m34341j() / 0.8f) + 1.0d)) - c1885c.m34341j()) * f));
    }

    /* renamed from: c */
    private int m34363c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: h */
    private void m34358h(float f) {
        this.f5721d = f;
    }

    /* renamed from: i */
    private void m34357i(float f, float f2, float f3, float f4) {
        C1885c c1885c = this.f5720c;
        float f5 = this.f5722e.getDisplayMetrics().density;
        c1885c.m34325z(f2 * f5);
        c1885c.m34334q(f * f5);
        c1885c.m34331t(0);
        c1885c.m34336o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m34353m() {
        C1885c c1885c = this.f5720c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C1883a(c1885c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5718y);
        ofFloat.addListener(new C1884b(c1885c));
        this.f5723f = ofFloat;
    }

    /* renamed from: b */
    void m34364b(float f, C1885c c1885c, boolean z) {
        float interpolation;
        float f2;
        if (this.f5725x) {
            m34365a(f, c1885c);
        } else if (f != 1.0f || z) {
            float m34341j = c1885c.m34341j();
            if (f < 0.5f) {
                interpolation = c1885c.m34340k();
                f2 = (f5719z.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m34340k = c1885c.m34340k() + 0.79f;
                interpolation = m34340k - (((1.0f - f5719z.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m34340k;
            }
            c1885c.m34326y(interpolation);
            c1885c.m34329v(f2);
            c1885c.m34328w(m34341j + (0.20999998f * f));
            m34358h((f + this.f5724w) * 216.0f);
        }
    }

    /* renamed from: d */
    public void m34362d(boolean z) {
        this.f5720c.m34327x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5721d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5720c.m34350a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m34361e(float f) {
        this.f5720c.m34335p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m34360f(int... iArr) {
        this.f5720c.m34330u(iArr);
        this.f5720c.m34331t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m34359g(float f) {
        this.f5720c.m34328w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5720c.m34348c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5723f.isRunning();
    }

    /* renamed from: j */
    public void m34356j(float f, float f2) {
        this.f5720c.m34326y(f);
        this.f5720c.m34329v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m34355k(float f) {
        this.f5720c.m34325z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m34354l(int i) {
        if (i == 0) {
            m34357i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m34357i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m34352n(float f, C1885c c1885c) {
        if (f > 0.75f) {
            c1885c.m34333r(m34363c((f - 0.75f) / 0.25f, c1885c.m34343h(), c1885c.m34346e()));
        } else {
            c1885c.m34333r(c1885c.m34343h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5720c.m34337n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5720c.m34332s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5723f.cancel();
        this.f5720c.m34351A();
        if (this.f5720c.m34347d() != this.f5720c.m34344g()) {
            this.f5725x = true;
            this.f5723f.setDuration(666L);
            this.f5723f.start();
            return;
        }
        this.f5720c.m34331t(0);
        this.f5720c.m34338m();
        this.f5723f.setDuration(1332L);
        this.f5723f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5723f.cancel();
        m34358h(0.0f);
        this.f5720c.m34327x(false);
        this.f5720c.m34331t(0);
        this.f5720c.m34338m();
        invalidateSelf();
    }
}
