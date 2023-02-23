package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p201g.p202a.C7457f;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c */
    private boolean f3062c;

    /* renamed from: d */
    private int f3063d;

    /* renamed from: e */
    private int f3064e;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3063d = -1;
        this.f3064e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ButtonBarLayout);
        C7759x.m17502n0(this, context, C7461j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        this.f3062c = obtainStyledAttributes.getBoolean(C7461j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m37391a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m37390b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View findViewById = findViewById(C7457f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f3064e, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f3062c) {
            if (size > this.f3063d && m37390b()) {
                setStacked(false);
            }
            this.f3063d = size;
        }
        if (m37390b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f3062c && !m37390b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m37391a = m37391a(0);
        if (m37391a >= 0) {
            View childAt = getChildAt(m37391a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m37390b()) {
                int m37391a2 = m37391a(m37391a + 1);
                if (m37391a2 >= 0) {
                    paddingTop += getChildAt(m37391a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C7759x.m17561D(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f3062c != z) {
            this.f3062c = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
