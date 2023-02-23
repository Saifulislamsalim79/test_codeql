package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes2.dex */
public class ResizableImageView extends AppCompatImageView {

    /* renamed from: c */
    private int f14737c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.ResizableImageView$b */
    /* loaded from: classes2.dex */
    public static class C6035b {

        /* renamed from: a */
        final int f14738a;

        /* renamed from: b */
        final int f14739b;

        private C6035b(int i, int i2) {
            this.f14738a = i;
            this.f14739b = i2;
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22942e(context);
    }

    /* renamed from: c */
    private C6035b m22944c(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            C6065m.m22819c("Image: capping width", maxWidth);
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            C6065m.m22819c("Image: capping height", maxHeight);
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new C6035b(i, maxHeight);
    }

    /* renamed from: d */
    private void m22943d() {
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = max;
        float f2 = max2;
        C6065m.m22818d("Image: min width, height", f, f2);
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        C6065m.m22818d("Image: actual width, height", f3, f4);
        float f5 = measuredWidth < max ? f / f3 : 1.0f;
        float f6 = measuredHeight < max2 ? f2 / f4 : 1.0f;
        if (f5 <= f6) {
            f5 = f6;
        }
        if (f5 > 1.0d) {
            int ceil = (int) Math.ceil(f3 * f5);
            int ceil2 = (int) Math.ceil(f4 * f5);
            C6065m.m22821a("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + ceil + "x" + ceil2);
            C6035b m22944c = m22944c(ceil, ceil2);
            setMeasuredDimension(m22944c.f14738a, m22944c.f14739b);
        }
    }

    /* renamed from: e */
    private void m22942e(Context context) {
        this.f14737c = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    /* renamed from: f */
    private void m22941f(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        C6065m.m22818d("Image: intrinsic width, height", intrinsicWidth, intrinsicHeight);
        C6035b m22944c = m22944c((int) Math.ceil((intrinsicWidth * this.f14737c) / 160), (int) Math.ceil((intrinsicHeight * this.f14737c) / 160));
        C6065m.m22818d("Image: new target dimensions", m22944c.f14738a, m22944c.f14739b);
        setMeasuredDimension(m22944c.f14738a, m22944c.f14739b);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT > 16) {
            Drawable drawable = getDrawable();
            boolean adjustViewBounds = getAdjustViewBounds();
            if (drawable == null || !adjustViewBounds) {
                return;
            }
            m22941f(drawable);
            m22943d();
        }
    }
}
