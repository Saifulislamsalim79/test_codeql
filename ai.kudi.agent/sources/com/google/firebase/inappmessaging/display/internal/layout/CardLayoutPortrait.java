package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6061b;
/* loaded from: classes2.dex */
public class CardLayoutPortrait extends AbstractC6059a {

    /* renamed from: A */
    private static double f14787A = 0.8d;

    /* renamed from: w */
    private View f14788w;

    /* renamed from: x */
    private View f14789x;

    /* renamed from: y */
    private View f14790y;

    /* renamed from: z */
    private View f14791z;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int size = getVisibleChildren().size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            View view = getVisibleChildren().get(i6);
            int measuredHeight = view.getMeasuredHeight() + i5;
            int measuredWidth = view.getMeasuredWidth() + 0;
            C6065m.m22821a("Layout child " + i6);
            C6065m.m22818d("\t(top, bottom)", (float) i5, (float) measuredHeight);
            C6065m.m22818d("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, i5, measuredWidth, measuredHeight);
            C6065m.m22818d("Child " + i6 + " wants to be ", view.getMeasuredWidth(), view.getMeasuredHeight());
            i5 += view.getMeasuredHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f14788w = m22846d(C6027f.image_view);
        this.f14789x = m22846d(C6027f.message_title);
        this.f14790y = m22846d(C6027f.body_scroll);
        this.f14791z = m22846d(C6027f.action_bar);
        int m22848b = m22848b(i);
        int m22849a = m22849a(i2);
        double d = f14787A;
        double d2 = m22849a;
        Double.isNaN(d2);
        int m22840j = m22840j((int) (d * d2), 4);
        C6065m.m22821a("Measuring image");
        C6061b.m22835d(this.f14788w, m22848b, m22849a);
        if (m22845e(this.f14788w) > m22840j) {
            C6065m.m22821a("Image exceeded maximum height, remeasuring image");
            C6061b.m22836c(this.f14788w, m22848b, m22840j);
        }
        int m22844f = m22844f(this.f14788w);
        C6065m.m22821a("Measuring title");
        C6061b.m22835d(this.f14789x, m22844f, m22849a);
        C6065m.m22821a("Measuring action bar");
        C6061b.m22835d(this.f14791z, m22844f, m22849a);
        C6065m.m22821a("Measuring scroll view");
        C6061b.m22835d(this.f14790y, m22844f, ((m22849a - m22845e(this.f14788w)) - m22845e(this.f14789x)) - m22845e(this.f14791z));
        int size = getVisibleChildren().size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += m22845e(getVisibleChildren().get(i4));
        }
        setMeasuredDimension(m22844f, i3);
    }
}
