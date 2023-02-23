package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p201g.p227h.p228e.C7603a;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.C9254l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BorderDrawable.java */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes2.dex */
public class C4634a extends Drawable {

    /* renamed from: b */
    private final Paint f11551b;

    /* renamed from: h */
    float f11557h;

    /* renamed from: i */
    private int f11558i;

    /* renamed from: j */
    private int f11559j;

    /* renamed from: k */
    private int f11560k;

    /* renamed from: l */
    private int f11561l;

    /* renamed from: m */
    private int f11562m;

    /* renamed from: o */
    private C9250k f11564o;

    /* renamed from: p */
    private ColorStateList f11565p;

    /* renamed from: a */
    private final C9254l f11550a = C9254l.m15295k();

    /* renamed from: c */
    private final Path f11552c = new Path();

    /* renamed from: d */
    private final Rect f11553d = new Rect();

    /* renamed from: e */
    private final RectF f11554e = new RectF();

    /* renamed from: f */
    private final RectF f11555f = new RectF();

    /* renamed from: g */
    private final C4636b f11556g = new C4636b();

    /* renamed from: n */
    private boolean f11563n = true;

    /* compiled from: BorderDrawable.java */
    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes2.dex */
    private class C4636b extends Drawable.ConstantState {
        private C4636b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C4634a.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4634a(C9250k c9250k) {
        this.f11564o = c9250k;
        Paint paint = new Paint(1);
        this.f11551b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m26946a() {
        Rect rect = this.f11553d;
        copyBounds(rect);
        float height = this.f11557h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C7603a.m18069e(this.f11558i, this.f11562m), C7603a.m18069e(this.f11559j, this.f11562m), C7603a.m18069e(C7603a.m18066h(this.f11559j, 0), this.f11562m), C7603a.m18069e(C7603a.m18066h(this.f11561l, 0), this.f11562m), C7603a.m18069e(this.f11561l, this.f11562m), C7603a.m18069e(this.f11560k, this.f11562m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    protected RectF m26945b() {
        this.f11555f.set(getBounds());
        return this.f11555f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26944c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f11562m = colorStateList.getColorForState(getState(), this.f11562m);
        }
        this.f11565p = colorStateList;
        this.f11563n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m26943d(float f) {
        if (this.f11557h != f) {
            this.f11557h = f;
            this.f11551b.setStrokeWidth(f * 1.3333f);
            this.f11563n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f11563n) {
            this.f11551b.setShader(m26946a());
            this.f11563n = false;
        }
        float strokeWidth = this.f11551b.getStrokeWidth() / 2.0f;
        copyBounds(this.f11553d);
        this.f11554e.set(this.f11553d);
        float min = Math.min(this.f11564o.m15346r().mo15365a(m26945b()), this.f11554e.width() / 2.0f);
        if (this.f11564o.m15343u(m26945b())) {
            this.f11554e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f11554e, min, min, this.f11551b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m26942e(int i, int i2, int i3, int i4) {
        this.f11558i = i;
        this.f11559j = i2;
        this.f11560k = i3;
        this.f11561l = i4;
    }

    /* renamed from: f */
    public void m26941f(C9250k c9250k) {
        this.f11564o = c9250k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f11556g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11557h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f11564o.m15343u(m26945b())) {
            outline.setRoundRect(getBounds(), this.f11564o.m15346r().mo15365a(m26945b()));
            return;
        }
        copyBounds(this.f11553d);
        this.f11554e.set(this.f11553d);
        this.f11550a.m15302d(this.f11564o, 1.0f, this.f11554e, this.f11552c);
        if (this.f11552c.isConvex()) {
            outline.setConvexPath(this.f11552c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f11564o.m15343u(m26945b())) {
            int round = Math.round(this.f11557h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f11565p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f11563n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f11565p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f11562m)) != this.f11562m) {
            this.f11563n = true;
            this.f11562m = colorForState;
        }
        if (this.f11563n) {
            invalidateSelf();
        }
        return this.f11563n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f11551b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11551b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
