package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* compiled from: ShimmerDrawable.java */
/* renamed from: com.facebook.shimmer.c */
/* loaded from: classes2.dex */
public final class C2414c extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f6945a = new C2415a();

    /* renamed from: b */
    private final Paint f6946b = new Paint();

    /* renamed from: c */
    private final Rect f6947c = new Rect();

    /* renamed from: d */
    private final Matrix f6948d = new Matrix();

    /* renamed from: e */
    private ValueAnimator f6949e;

    /* renamed from: f */
    private C2410b f6950f;

    /* compiled from: ShimmerDrawable.java */
    /* renamed from: com.facebook.shimmer.c$a */
    /* loaded from: classes2.dex */
    class C2415a implements ValueAnimator.AnimatorUpdateListener {
        C2415a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2414c.this.invalidateSelf();
        }
    }

    public C2414c() {
        this.f6946b.setAntiAlias(true);
    }

    /* renamed from: c */
    private float m32931c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: g */
    private void m32927g() {
        C2410b c2410b;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (c2410b = this.f6950f) == null) {
            return;
        }
        int m32960d = c2410b.m32960d(width);
        int m32963a = this.f6950f.m32963a(height);
        C2410b c2410b2 = this.f6950f;
        boolean z = true;
        if (c2410b2.f6929f != 1) {
            int i = c2410b2.f6926c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                m32960d = 0;
            }
            if (!z) {
                m32963a = 0;
            }
            float f = m32963a;
            C2410b c2410b3 = this.f6950f;
            radialGradient = new LinearGradient(0.0f, 0.0f, m32960d, f, c2410b3.f6925b, c2410b3.f6924a, Shader.TileMode.CLAMP);
        } else {
            float f2 = m32963a / 2.0f;
            double max = Math.max(m32960d, m32963a);
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(max);
            float f3 = (float) (max / sqrt);
            C2410b c2410b4 = this.f6950f;
            radialGradient = new RadialGradient(m32960d / 2.0f, f2, f3, c2410b4.f6925b, c2410b4.f6924a, Shader.TileMode.CLAMP);
        }
        this.f6946b.setShader(radialGradient);
    }

    /* renamed from: h */
    private void m32926h() {
        boolean z;
        if (this.f6950f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f6949e;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.f6949e.cancel();
            this.f6949e.removeAllUpdateListeners();
        } else {
            z = false;
        }
        C2410b c2410b = this.f6950f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (c2410b.f6943t / c2410b.f6942s)) + 1.0f);
        this.f6949e = ofFloat;
        ofFloat.setRepeatMode(this.f6950f.f6941r);
        this.f6949e.setRepeatCount(this.f6950f.f6940q);
        ValueAnimator valueAnimator2 = this.f6949e;
        C2410b c2410b2 = this.f6950f;
        valueAnimator2.setDuration(c2410b2.f6942s + c2410b2.f6943t);
        this.f6949e.addUpdateListener(this.f6945a);
        if (z) {
            this.f6949e.start();
        }
    }

    /* renamed from: a */
    public boolean m32933a() {
        ValueAnimator valueAnimator = this.f6949e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m32932b() {
        C2410b c2410b;
        ValueAnimator valueAnimator = this.f6949e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c2410b = this.f6950f) == null || !c2410b.f6938o || getCallback() == null) {
            return;
        }
        this.f6949e.start();
    }

    /* renamed from: d */
    public void m32930d(C2410b c2410b) {
        this.f6950f = c2410b;
        if (c2410b != null) {
            this.f6946b.setXfermode(new PorterDuffXfermode(this.f6950f.f6939p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m32927g();
        m32926h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float m32931c;
        float m32931c2;
        if (this.f6950f == null || this.f6946b.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.f6950f.f6936m));
        float height = this.f6947c.height() + (this.f6947c.width() * tan);
        float width = this.f6947c.width() + (tan * this.f6947c.height());
        ValueAnimator valueAnimator = this.f6949e;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.f6950f.f6926c;
        if (i != 1) {
            if (i == 2) {
                m32931c2 = m32931c(width, -width, animatedFraction);
            } else if (i != 3) {
                m32931c2 = m32931c(-width, width, animatedFraction);
            } else {
                m32931c = m32931c(height, -height, animatedFraction);
            }
            f = m32931c2;
            m32931c = 0.0f;
        } else {
            m32931c = m32931c(-height, height, animatedFraction);
        }
        this.f6948d.reset();
        this.f6948d.setRotate(this.f6950f.f6936m, this.f6947c.width() / 2.0f, this.f6947c.height() / 2.0f);
        this.f6948d.postTranslate(f, m32931c);
        this.f6946b.getShader().setLocalMatrix(this.f6948d);
        canvas.drawRect(this.f6947c, this.f6946b);
    }

    /* renamed from: e */
    public void m32929e() {
        if (this.f6949e == null || m32933a() || getCallback() == null) {
            return;
        }
        this.f6949e.start();
    }

    /* renamed from: f */
    public void m32928f() {
        if (this.f6949e == null || !m32933a()) {
            return;
        }
        this.f6949e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C2410b c2410b = this.f6950f;
        return (c2410b == null || !(c2410b.f6937n || c2410b.f6939p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6947c.set(0, 0, rect.width(), rect.height());
        m32927g();
        m32932b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
