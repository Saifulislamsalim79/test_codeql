package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p201g.p217d.C7517b;
import p201g.p217d.C7518c;
/* compiled from: RoundRectDrawableWithShadow.java */
/* renamed from: androidx.cardview.widget.g */
/* loaded from: classes2.dex */
class C1252g extends Drawable {

    /* renamed from: q */
    private static final double f3737q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static InterfaceC1253a f3738r;

    /* renamed from: a */
    private final int f3739a;

    /* renamed from: c */
    private Paint f3741c;

    /* renamed from: d */
    private Paint f3742d;

    /* renamed from: e */
    private final RectF f3743e;

    /* renamed from: f */
    private float f3744f;

    /* renamed from: g */
    private Path f3745g;

    /* renamed from: h */
    private float f3746h;

    /* renamed from: i */
    private float f3747i;

    /* renamed from: j */
    private float f3748j;

    /* renamed from: k */
    private ColorStateList f3749k;

    /* renamed from: m */
    private final int f3751m;

    /* renamed from: n */
    private final int f3752n;

    /* renamed from: l */
    private boolean f3750l = true;

    /* renamed from: o */
    private boolean f3753o = true;

    /* renamed from: p */
    private boolean f3754p = false;

    /* renamed from: b */
    private Paint f3740b = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* renamed from: androidx.cardview.widget.g$a */
    /* loaded from: classes2.dex */
    interface InterfaceC1253a {
        /* renamed from: a */
        void mo36639a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1252g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f3751m = resources.getColor(C7517b.cardview_shadow_start_color);
        this.f3752n = resources.getColor(C7517b.cardview_shadow_end_color);
        this.f3739a = resources.getDimensionPixelSize(C7518c.cardview_compat_inset_shadow);
        m36646n(colorStateList);
        Paint paint = new Paint(5);
        this.f3741c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3744f = (int) (f + 0.5f);
        this.f3743e = new RectF();
        Paint paint2 = new Paint(this.f3741c);
        this.f3742d = paint2;
        paint2.setAntiAlias(false);
        m36641s(f2, f3);
    }

    /* renamed from: a */
    private void m36659a(Rect rect) {
        float f = this.f3746h;
        float f2 = 1.5f * f;
        this.f3743e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m36658b();
    }

    /* renamed from: b */
    private void m36658b() {
        float f = this.f3744f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f3747i;
        rectF2.inset(-f2, -f2);
        Path path = this.f3745g;
        if (path == null) {
            this.f3745g = new Path();
        } else {
            path.reset();
        }
        this.f3745g.setFillType(Path.FillType.EVEN_ODD);
        this.f3745g.moveTo(-this.f3744f, 0.0f);
        this.f3745g.rLineTo(-this.f3747i, 0.0f);
        this.f3745g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3745g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3745g.close();
        float f3 = this.f3744f;
        float f4 = f3 / (this.f3747i + f3);
        Paint paint = this.f3741c;
        float f5 = this.f3744f + this.f3747i;
        int i = this.f3751m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f3752n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f3742d;
        float f6 = this.f3744f;
        float f7 = this.f3747i;
        int i2 = this.f3751m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f3752n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f3742d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m36657c(float f, float f2, boolean z) {
        if (z) {
            double d = f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - f3737q) * d2));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m36656d(float f, float f2, boolean z) {
        if (z) {
            double d = f * 1.5f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - f3737q) * d2));
        }
        return f * 1.5f;
    }

    /* renamed from: e */
    private void m36655e(Canvas canvas) {
        float f = this.f3744f;
        float f2 = (-f) - this.f3747i;
        float f3 = f + this.f3739a + (this.f3748j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f3743e.width() - f4 > 0.0f;
        boolean z2 = this.f3743e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f3743e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f3745g, this.f3741c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3743e.width() - f4, -this.f3744f, this.f3742d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f3743e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3745g, this.f3741c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3743e.width() - f4, (-this.f3744f) + this.f3747i, this.f3742d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f3743e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3745g, this.f3741c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3743e.height() - f4, -this.f3744f, this.f3742d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f3743e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3745g, this.f3741c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3743e.height() - f4, -this.f3744f, this.f3742d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m36646n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3749k = colorStateList;
        this.f3740b.setColor(colorStateList.getColorForState(getState(), this.f3749k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m36641s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float m36640t = m36640t(f);
            float m36640t2 = m36640t(f2);
            if (m36640t > m36640t2) {
                if (!this.f3754p) {
                    this.f3754p = true;
                }
                m36640t = m36640t2;
            }
            if (this.f3748j == m36640t && this.f3746h == m36640t2) {
                return;
            }
            this.f3748j = m36640t;
            this.f3746h = m36640t2;
            this.f3747i = (int) ((m36640t * 1.5f) + this.f3739a + 0.5f);
            this.f3750l = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m36640t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3750l) {
            m36659a(getBounds());
            this.f3750l = false;
        }
        canvas.translate(0.0f, this.f3748j / 2.0f);
        m36655e(canvas);
        canvas.translate(0.0f, (-this.f3748j) / 2.0f);
        f3738r.mo36639a(canvas, this.f3743e, this.f3744f, this.f3740b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m36654f() {
        return this.f3749k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m36653g() {
        return this.f3744f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m36656d(this.f3746h, this.f3744f, this.f3753o));
        int ceil2 = (int) Math.ceil(m36657c(this.f3746h, this.f3744f, this.f3753o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36652h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m36651i() {
        return this.f3746h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f3749k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m36650j() {
        float f = this.f3746h;
        return (Math.max(f, this.f3744f + this.f3739a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f3746h * 1.5f) + this.f3739a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m36649k() {
        float f = this.f3746h;
        return (Math.max(f, this.f3744f + this.f3739a + (f / 2.0f)) * 2.0f) + ((this.f3746h + this.f3739a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m36648l() {
        return this.f3748j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m36647m(boolean z) {
        this.f3753o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36645o(ColorStateList colorStateList) {
        m36646n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3750l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3749k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f3740b.getColor() == colorForState) {
            return false;
        }
        this.f3740b.setColor(colorForState);
        this.f3750l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36644p(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (this.f3744f == f2) {
                return;
            }
            this.f3744f = f2;
            this.f3750l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36643q(float f) {
        m36641s(this.f3748j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m36642r(float f) {
        m36641s(f, this.f3746h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3740b.setAlpha(i);
        this.f3741c.setAlpha(i);
        this.f3742d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3740b.setColorFilter(colorFilter);
    }
}
