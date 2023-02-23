package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: RoundRectDrawable.java */
/* renamed from: androidx.cardview.widget.f */
/* loaded from: classes2.dex */
class C1251f extends Drawable {

    /* renamed from: a */
    private float f3726a;

    /* renamed from: c */
    private final RectF f3728c;

    /* renamed from: d */
    private final Rect f3729d;

    /* renamed from: e */
    private float f3730e;

    /* renamed from: h */
    private ColorStateList f3733h;

    /* renamed from: i */
    private PorterDuffColorFilter f3734i;

    /* renamed from: j */
    private ColorStateList f3735j;

    /* renamed from: f */
    private boolean f3731f = false;

    /* renamed from: g */
    private boolean f3732g = true;

    /* renamed from: k */
    private PorterDuff.Mode f3736k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f3727b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1251f(ColorStateList colorStateList, float f) {
        this.f3726a = f;
        m36664e(colorStateList);
        this.f3728c = new RectF();
        this.f3729d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m36668a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m36664e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3733h = colorStateList;
        this.f3727b.setColor(colorStateList.getColorForState(getState(), this.f3733h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m36660i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3728c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3729d.set(rect);
        if (this.f3731f) {
            float m36656d = C1252g.m36656d(this.f3730e, this.f3726a, this.f3732g);
            this.f3729d.inset((int) Math.ceil(C1252g.m36657c(this.f3730e, this.f3726a, this.f3732g)), (int) Math.ceil(m36656d));
            this.f3728c.set(this.f3729d);
        }
    }

    /* renamed from: b */
    public ColorStateList m36667b() {
        return this.f3733h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m36666c() {
        return this.f3730e;
    }

    /* renamed from: d */
    public float m36665d() {
        return this.f3726a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f3727b;
        if (this.f3734i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3734i);
            z = true;
        }
        RectF rectF = this.f3728c;
        float f = this.f3726a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m36663f(ColorStateList colorStateList) {
        m36664e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36662g(float f, boolean z, boolean z2) {
        if (f == this.f3730e && this.f3731f == z && this.f3732g == z2) {
            return;
        }
        this.f3730e = f;
        this.f3731f = z;
        this.f3732g = z2;
        m36660i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3729d, this.f3726a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36661h(float f) {
        if (f == this.f3726a) {
            return;
        }
        this.f3726a = f;
        m36660i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3735j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f3733h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m36660i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3733h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f3727b.getColor();
        if (z) {
            this.f3727b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3735j;
        if (colorStateList2 == null || (mode = this.f3736k) == null) {
            return z;
        }
        this.f3734i = m36668a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3727b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3727b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3735j = colorStateList;
        this.f3734i = m36668a(colorStateList, this.f3736k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3736k = mode;
        this.f3734i = m36668a(this.f3735j, mode);
        invalidateSelf();
    }
}
