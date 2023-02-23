package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: ForegroundLinearLayout.java */
/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes2.dex */
public class C4663e extends LinearLayoutCompat {

    /* renamed from: H */
    private Drawable f11704H;

    /* renamed from: I */
    private final Rect f11705I;

    /* renamed from: J */
    private final Rect f11706J;

    /* renamed from: K */
    private int f11707K;

    /* renamed from: L */
    protected boolean f11708L;

    /* renamed from: M */
    boolean f11709M;

    public C4663e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f11704H;
        if (drawable != null) {
            if (this.f11709M) {
                this.f11709M = false;
                Rect rect = this.f11705I;
                Rect rect2 = this.f11706J;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f11708L) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f11707K, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f11704H;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11704H;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f11704H.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f11704H;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f11707K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11704H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11709M = z | this.f11709M;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11709M = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f11704H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f11704H);
            }
            this.f11704H = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f11707K == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f11707K != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f11707K = i;
            if (i == 119 && this.f11704H != null) {
                this.f11704H.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11704H;
    }

    public C4663e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11705I = new Rect();
        this.f11706J = new Rect();
        this.f11707K = 119;
        this.f11708L = true;
        this.f11709M = false;
        TypedArray m26690h = C4695q.m26690h(context, attributeSet, C9277l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f11707K = m26690h.getInt(C9277l.ForegroundLinearLayout_android_foregroundGravity, this.f11707K);
        Drawable drawable = m26690h.getDrawable(C9277l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f11708L = m26690h.getBoolean(C9277l.ForegroundLinearLayout_foregroundInsidePadding, true);
        m26690h.recycle();
    }
}
