package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.C6029h;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseModalLayout.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6059a extends FrameLayout {

    /* renamed from: c */
    private float f14805c;

    /* renamed from: d */
    private float f14806d;

    /* renamed from: e */
    private DisplayMetrics f14807e;

    /* renamed from: f */
    private List<View> f14808f;

    public AbstractC6059a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14808f = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6029h.ModalLayout, 0, 0);
        try {
            this.f14805c = obtainStyledAttributes.getFloat(C6029h.ModalLayout_maxWidthPct, -1.0f);
            this.f14806d = obtainStyledAttributes.getFloat(C6029h.ModalLayout_maxHeightPct, -1.0f);
            obtainStyledAttributes.recycle();
            this.f14807e = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m22849a(int i) {
        if (getMaxHeightPct() > 0.0f) {
            C6065m.m22821a("Height: restrict by pct");
            return m22840j((int) (getDisplayMetrics().heightPixels * getMaxHeightPct()), 4);
        }
        C6065m.m22821a("Height: restrict by spec");
        return View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m22848b(int i) {
        if (getMaxWidthPct() > 0.0f) {
            C6065m.m22821a("Width: restrict by pct");
            return m22840j((int) (getDisplayMetrics().widthPixels * getMaxWidthPct()), 4);
        }
        C6065m.m22821a("Width: restrict by spec");
        return View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m22847c(int i) {
        return (int) Math.floor(TypedValue.applyDimension(1, i, this.f14807e));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public View m22846d(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("No such child: " + i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m22845e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public int m22844f(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public FrameLayout.LayoutParams m22843g(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DisplayMetrics getDisplayMetrics() {
        return this.f14807e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxHeightPct() {
        return this.f14806d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxWidthPct() {
        return this.f14805c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<View> getVisibleChildren() {
        return this.f14808f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m22842h(View view, int i, int i2) {
        m22841i(view, i, i2, i + m22844f(view), i2 + m22845e(view));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m22841i(View view, int i, int i2, int i3, int i4) {
        C6065m.m22818d("\tleft, right", i, i3);
        C6065m.m22818d("\ttop, bottom", i2, i4);
        view.layout(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public int m22840j(int i, int i2) {
        return i2 * Math.round(i / i2);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        C6065m.m22818d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i, i2, i3, i4);
        C6065m.m22818d("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C6065m.m22820b("BEGIN LAYOUT");
        C6065m.m22821a("onLayout: l: " + i + ", t: " + i2 + ", r: " + i3 + ", b: " + i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C6065m.m22820b("BEGIN MEASURE");
        C6065m.m22818d("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.f14808f.clear();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.f14808f.add(childAt);
            } else {
                C6065m.m22819c("Skipping GONE child", i3);
            }
        }
    }
}
