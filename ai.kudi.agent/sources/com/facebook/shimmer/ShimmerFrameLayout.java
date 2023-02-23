package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.C2410b;
/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: c */
    private final Paint f6921c;

    /* renamed from: d */
    private final C2414c f6922d;

    /* renamed from: e */
    private boolean f6923e;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6921c = new Paint();
        this.f6922d = new C2414c();
        this.f6923e = true;
        m32967a(context, attributeSet);
    }

    /* renamed from: a */
    private void m32967a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f6922d.setCallback(this);
        if (attributeSet == null) {
            m32966b(new C2410b.C2411a().m32958a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2409a.ShimmerFrameLayout, 0, 0);
        try {
            m32966b(((obtainStyledAttributes.hasValue(C2409a.ShimmerFrameLayout_shimmer_colored) && obtainStyledAttributes.getBoolean(C2409a.ShimmerFrameLayout_shimmer_colored, false)) ? new C2410b.C2413c() : new C2410b.C2411a()).mo32939c(obtainStyledAttributes).m32958a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public ShimmerFrameLayout m32966b(C2410b c2410b) {
        this.f6922d.m32930d(c2410b);
        if (c2410b != null && c2410b.f6937n) {
            setLayerType(2, this.f6921c);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    /* renamed from: c */
    public void m32965c() {
        this.f6922d.m32929e();
    }

    /* renamed from: d */
    public void m32964d() {
        this.f6922d.m32928f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6923e) {
            this.f6922d.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6922d.m32932b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m32964d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f6922d.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6922d;
    }
}
