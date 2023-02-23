package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6061b;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6062c;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6064d;
/* loaded from: classes2.dex */
public class ModalLayoutPortrait extends AbstractC6059a {

    /* renamed from: w */
    private C6062c f14803w;

    /* renamed from: x */
    private int f14804x;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14803w = new C6062c();
    }

    /* renamed from: k */
    private boolean m22850k(View view) {
        return view.getId() == C6027f.body_scroll || view.getId() == C6027f.image_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = getVisibleChildren().get(i7);
            FrameLayout.LayoutParams m22843g = m22843g(view);
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i8 = measuredHeight + paddingTop;
            if ((m22843g.gravity & 1) == 1) {
                int i9 = (i3 - i) / 2;
                int i10 = measuredWidth / 2;
                i6 = i9 - i10;
                i5 = i9 + i10;
            } else {
                i5 = paddingLeft + measuredWidth;
                i6 = paddingLeft;
            }
            C6065m.m22821a("Layout child " + i7);
            C6065m.m22818d("\t(top, bottom)", (float) paddingTop, (float) i8);
            C6065m.m22818d("\t(left, right)", (float) i6, (float) i5);
            view.layout(i6, paddingTop, i5, i8);
            paddingTop += view.getMeasuredHeight();
            if (i7 < size - 1) {
                paddingTop += this.f14804x;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f14804x = m22847c(24);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int m22848b = m22848b(i);
        int m22849a = m22849a(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((getVisibleChildren().size() - 1) * this.f14804x);
        this.f14803w.m22829f(m22848b, m22849a);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            this.f14803w.m22834a(childAt, m22850k(childAt));
        }
        C6065m.m22821a("Screen dimens: " + getDisplayMetrics());
        C6065m.m22818d("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f = (float) m22848b;
        C6065m.m22818d("Base dimens", f, (float) m22849a);
        for (C6064d c6064d : this.f14803w.m22830e()) {
            C6065m.m22821a("Pre-measure child");
            c6064d.m22823e(m22848b, m22849a);
        }
        int m22831d = this.f14803w.m22831d() + paddingBottom;
        C6065m.m22819c("Total reserved height", paddingBottom);
        C6065m.m22819c("Total desired height", m22831d);
        boolean z = m22831d > m22849a;
        C6065m.m22821a("Total height constrained: " + z);
        if (z) {
            this.f14803w.m22833b((m22849a - paddingBottom) - this.f14803w.m22832c());
        }
        int i4 = m22848b - paddingRight;
        for (C6064d c6064d2 : this.f14803w.m22830e()) {
            C6065m.m22821a("Measuring child");
            C6061b.m22837b(c6064d2.m22825c(), i4, c6064d2.m22826b());
            paddingBottom += m22845e(c6064d2.m22825c());
        }
        C6065m.m22818d("Measured dims", f, paddingBottom);
        setMeasuredDimension(m22848b, paddingBottom);
    }
}
