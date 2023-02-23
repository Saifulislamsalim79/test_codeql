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
public class CardLayoutLandscape extends AbstractC6059a {

    /* renamed from: A */
    private static double f14782A = 0.6d;

    /* renamed from: w */
    private View f14783w;

    /* renamed from: x */
    private View f14784x;

    /* renamed from: y */
    private View f14785y;

    /* renamed from: z */
    private View f14786z;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C6065m.m22821a("Layout image");
        int m22844f = m22844f(this.f14783w);
        m22841i(this.f14783w, 0, 0, m22844f, m22845e(this.f14783w));
        C6065m.m22821a("Layout title");
        int m22845e = m22845e(this.f14784x);
        m22841i(this.f14784x, m22844f, 0, measuredWidth, m22845e);
        C6065m.m22821a("Layout scroll");
        m22841i(this.f14785y, m22844f, m22845e, measuredWidth, m22845e + m22845e(this.f14785y));
        C6065m.m22821a("Layout action bar");
        m22841i(this.f14786z, m22844f, measuredHeight - m22845e(this.f14786z), measuredWidth, measuredHeight);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f14783w = m22846d(C6027f.image_view);
        this.f14784x = m22846d(C6027f.message_title);
        this.f14785y = m22846d(C6027f.body_scroll);
        View m22846d = m22846d(C6027f.action_bar);
        this.f14786z = m22846d;
        int i3 = 0;
        List<View> asList = Arrays.asList(this.f14784x, this.f14785y, m22846d);
        int m22848b = m22848b(i);
        int m22849a = m22849a(i2);
        double d = f14782A;
        double d2 = m22848b;
        Double.isNaN(d2);
        int m22840j = m22840j((int) (d * d2), 4);
        C6065m.m22821a("Measuring image");
        C6061b.m22836c(this.f14783w, m22848b, m22849a);
        if (m22844f(this.f14783w) > m22840j) {
            C6065m.m22821a("Image exceeded maximum width, remeasuring image");
            C6061b.m22835d(this.f14783w, m22840j, m22849a);
        }
        int m22845e = m22845e(this.f14783w);
        int m22844f = m22844f(this.f14783w);
        int i4 = m22848b - m22844f;
        float f = m22844f;
        C6065m.m22818d("Max col widths (l, r)", f, i4);
        C6065m.m22821a("Measuring title");
        C6061b.m22837b(this.f14784x, i4, m22845e);
        C6065m.m22821a("Measuring action bar");
        C6061b.m22837b(this.f14786z, i4, m22845e);
        C6065m.m22821a("Measuring scroll view");
        C6061b.m22836c(this.f14785y, i4, (m22845e - m22845e(this.f14784x)) - m22845e(this.f14786z));
        for (View view : asList) {
            i3 = Math.max(m22844f(view), i3);
        }
        C6065m.m22818d("Measured columns (l, r)", f, i3);
        int i5 = m22844f + i3;
        C6065m.m22818d("Measured dims", i5, m22845e);
        setMeasuredDimension(i5, m22845e);
    }
}
