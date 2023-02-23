package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6061b;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class ModalLayoutLandscape extends AbstractC6059a {

    /* renamed from: A */
    private int f14795A;

    /* renamed from: B */
    private int f14796B;

    /* renamed from: C */
    private int f14797C;

    /* renamed from: D */
    private int f14798D;

    /* renamed from: w */
    private View f14799w;

    /* renamed from: x */
    private View f14800x;

    /* renamed from: y */
    private View f14801y;

    /* renamed from: z */
    private View f14802z;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i7 = this.f14797C;
        int i8 = this.f14798D;
        if (i7 < i8) {
            i6 = (i8 - i7) / 2;
            i5 = 0;
        } else {
            i5 = (i7 - i8) / 2;
            i6 = 0;
        }
        C6065m.m22821a("Layout image");
        int i9 = paddingTop + i6;
        int m22844f = m22844f(this.f14799w) + paddingLeft;
        m22841i(this.f14799w, paddingLeft, i9, m22844f, i9 + m22845e(this.f14799w));
        int i10 = m22844f + this.f14795A;
        C6065m.m22821a("Layout getTitle");
        int i11 = paddingTop + i5;
        int m22845e = m22845e(this.f14800x) + i11;
        m22841i(this.f14800x, i10, i11, measuredWidth, m22845e);
        C6065m.m22821a("Layout getBody");
        int i12 = m22845e + (this.f14800x.getVisibility() == 8 ? 0 : this.f14796B);
        int m22845e2 = m22845e(this.f14801y) + i12;
        m22841i(this.f14801y, i10, i12, measuredWidth, m22845e2);
        C6065m.m22821a("Layout button");
        m22842h(this.f14802z, i10, m22845e2 + (this.f14801y.getVisibility() != 8 ? this.f14796B : 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f14799w = m22846d(C6027f.image_view);
        this.f14800x = m22846d(C6027f.message_title);
        this.f14801y = m22846d(C6027f.body_scroll);
        this.f14802z = m22846d(C6027f.button);
        int i3 = 0;
        this.f14795A = this.f14799w.getVisibility() == 8 ? 0 : m22847c(24);
        this.f14796B = m22847c(24);
        List<View> asList = Arrays.asList(this.f14800x, this.f14801y, this.f14802z);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int m22848b = m22848b(i);
        int m22849a = m22849a(i2) - paddingBottom;
        int i4 = m22848b - paddingLeft;
        C6065m.m22821a("Measuring image");
        C6061b.m22837b(this.f14799w, (int) (i4 * 0.4f), m22849a);
        int m22844f = m22844f(this.f14799w);
        int i5 = i4 - (this.f14795A + m22844f);
        float f = m22844f;
        C6065m.m22818d("Max col widths (l, r)", f, i5);
        int i6 = 0;
        for (View view : asList) {
            if (view.getVisibility() != 8) {
                i6++;
            }
        }
        int max = Math.max(0, (i6 - 1) * this.f14796B);
        int i7 = m22849a - max;
        C6065m.m22821a("Measuring getTitle");
        C6061b.m22837b(this.f14800x, i5, i7);
        C6065m.m22821a("Measuring button");
        C6061b.m22837b(this.f14802z, i5, i7);
        C6065m.m22821a("Measuring scroll view");
        C6061b.m22837b(this.f14801y, i5, (i7 - m22845e(this.f14800x)) - m22845e(this.f14802z));
        this.f14797C = m22845e(this.f14799w);
        this.f14798D = max;
        for (View view2 : asList) {
            this.f14798D += m22845e(view2);
        }
        int max2 = Math.max(this.f14797C + paddingBottom, this.f14798D + paddingBottom);
        for (View view3 : asList) {
            i3 = Math.max(m22844f(view3), i3);
        }
        C6065m.m22818d("Measured columns (l, r)", f, i3);
        int i8 = m22844f + i3 + this.f14795A + paddingLeft;
        C6065m.m22818d("Measured dims", i8, max2);
        setMeasuredDimension(i8, max2);
    }
}
