package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A */
    private int[] f3075A;

    /* renamed from: B */
    private int[] f3076B;

    /* renamed from: C */
    private Drawable f3077C;

    /* renamed from: D */
    private int f3078D;

    /* renamed from: E */
    private int f3079E;

    /* renamed from: F */
    private int f3080F;

    /* renamed from: G */
    private int f3081G;

    /* renamed from: c */
    private boolean f3082c;

    /* renamed from: d */
    private int f3083d;

    /* renamed from: e */
    private int f3084e;

    /* renamed from: f */
    private int f3085f;

    /* renamed from: w */
    private int f3086w;

    /* renamed from: x */
    private int f3087x;

    /* renamed from: y */
    private float f3088y;

    /* renamed from: z */
    private boolean f3089z;

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    /* loaded from: classes2.dex */
    public static class C1037a extends LinearLayout.LayoutParams {
        public C1037a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1037a(int i, int i2) {
            super(i, i2);
        }

        public C1037a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m37386A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m37381k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m37373s = m37373s(i3);
            if (m37373s.getVisibility() != 8) {
                C1037a c1037a = (C1037a) m37373s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c1037a).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c1037a).width;
                    ((LinearLayout.LayoutParams) c1037a).width = m37373s.getMeasuredWidth();
                    measureChildWithMargins(m37373s, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c1037a).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m37380l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m37373s = m37373s(i3);
            if (m37373s.getVisibility() != 8) {
                C1037a c1037a = (C1037a) m37373s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c1037a).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c1037a).height;
                    ((LinearLayout.LayoutParams) c1037a).height = m37373s.getMeasuredHeight();
                    measureChildWithMargins(m37373s, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c1037a).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1037a;
    }

    /* renamed from: g */
    void m37385g(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean m36903b = C1170x0.m36903b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m37373s = m37373s(i2);
            if (m37373s != null && m37373s.getVisibility() != 8 && m37372t(i2)) {
                C1037a c1037a = (C1037a) m37373s.getLayoutParams();
                if (m36903b) {
                    left2 = m37373s.getRight() + ((LinearLayout.LayoutParams) c1037a).rightMargin;
                } else {
                    left2 = (m37373s.getLeft() - ((LinearLayout.LayoutParams) c1037a).leftMargin) - this.f3078D;
                }
                m37382j(canvas, left2);
            }
        }
        if (m37372t(virtualChildCount)) {
            View m37373s2 = m37373s(virtualChildCount - 1);
            if (m37373s2 != null) {
                C1037a c1037a2 = (C1037a) m37373s2.getLayoutParams();
                if (m36903b) {
                    left = m37373s2.getLeft() - ((LinearLayout.LayoutParams) c1037a2).leftMargin;
                    i = this.f3078D;
                    right = left - i;
                } else {
                    right = m37373s2.getRight() + ((LinearLayout.LayoutParams) c1037a2).rightMargin;
                }
            } else if (m36903b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f3078D;
                right = left - i;
            }
            m37382j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f3083d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f3083d;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f3083d == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f3084e;
            if (this.f3085f == 1 && (i = this.f3086w & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3087x) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3087x;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C1037a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3083d;
    }

    public Drawable getDividerDrawable() {
        return this.f3077C;
    }

    public int getDividerPadding() {
        return this.f3081G;
    }

    public int getDividerWidth() {
        return this.f3078D;
    }

    public int getGravity() {
        return this.f3086w;
    }

    public int getOrientation() {
        return this.f3085f;
    }

    public int getShowDividers() {
        return this.f3080F;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3088y;
    }

    /* renamed from: h */
    void m37384h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m37373s = m37373s(i);
            if (m37373s != null && m37373s.getVisibility() != 8 && m37372t(i)) {
                m37383i(canvas, (m37373s.getTop() - ((LinearLayout.LayoutParams) ((C1037a) m37373s.getLayoutParams())).topMargin) - this.f3079E);
            }
        }
        if (m37372t(virtualChildCount)) {
            View m37373s2 = m37373s(virtualChildCount - 1);
            if (m37373s2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f3079E;
            } else {
                bottom = m37373s2.getBottom() + ((LinearLayout.LayoutParams) ((C1037a) m37373s2.getLayoutParams())).bottomMargin;
            }
            m37383i(canvas, bottom);
        }
    }

    /* renamed from: i */
    void m37383i(Canvas canvas, int i) {
        this.f3077C.setBounds(getPaddingLeft() + this.f3081G, i, (getWidth() - getPaddingRight()) - this.f3081G, this.f3079E + i);
        this.f3077C.draw(canvas);
    }

    /* renamed from: j */
    void m37382j(Canvas canvas, int i) {
        this.f3077C.setBounds(i, getPaddingTop() + this.f3081G, this.f3078D + i, (getHeight() - getPaddingBottom()) - this.f3081G);
        this.f3077C.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C1037a generateDefaultLayoutParams() {
        int i = this.f3085f;
        if (i == 0) {
            return new C1037a(-2, -2);
        }
        if (i == 1) {
            return new C1037a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C1037a generateLayoutParams(AttributeSet attributeSet) {
        return new C1037a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C1037a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1037a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f3077C == null) {
            return;
        }
        if (this.f3085f == 1) {
            m37384h(canvas);
        } else {
            m37385g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3085f == 1) {
            m37370v(i, i2, i3, i4);
        } else {
            m37371u(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f3085f == 1) {
            m37366z(i, i2);
        } else {
            m37368x(i, i2);
        }
    }

    /* renamed from: p */
    int m37376p(View view, int i) {
        return 0;
    }

    /* renamed from: q */
    int m37375q(View view) {
        return 0;
    }

    /* renamed from: r */
    int m37374r(View view) {
        return 0;
    }

    /* renamed from: s */
    View m37373s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f3082c = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f3083d = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3077C) {
            return;
        }
        this.f3077C = drawable;
        if (drawable != null) {
            this.f3078D = drawable.getIntrinsicWidth();
            this.f3079E = drawable.getIntrinsicHeight();
        } else {
            this.f3078D = 0;
            this.f3079E = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f3081G = i;
    }

    public void setGravity(int i) {
        if (this.f3086w != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3086w = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f3086w;
        if ((8388615 & i3) != i2) {
            this.f3086w = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3089z = z;
    }

    public void setOrientation(int i) {
        if (this.f3085f != i) {
            this.f3085f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3080F) {
            requestLayout();
        }
        this.f3080F = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f3086w;
        if ((i3 & 112) != i2) {
            this.f3086w = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3088y = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m37372t(int i) {
        if (i == 0) {
            return (this.f3080F & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f3080F & 4) != 0;
        } else if ((this.f3080F & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m37371u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m37371u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m37370v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f3086w
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f3087x
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f3087x
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.m37373s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m37367y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C1037a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p201g.p227h.p238l.C7759x.m17563C(r17)
            int r1 = p201g.p227h.p238l.C7693e.m17805b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.m37372t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f3079E
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m37375q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m37386A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m37374r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m37376p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m37370v(int, int, int, int):void");
    }

    /* renamed from: w */
    void m37369w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m37368x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m37368x(int, int):void");
    }

    /* renamed from: y */
    int m37367y(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m37366z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m37366z(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3082c = true;
        this.f3083d = -1;
        this.f3084e = 0;
        this.f3086w = 8388659;
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.LinearLayoutCompat, i, 0);
        C7759x.m17502n0(this, context, C7461j.LinearLayoutCompat, attributeSet, m37026v.m37030r(), i, 0);
        int m37037k = m37026v.m37037k(C7461j.LinearLayoutCompat_android_orientation, -1);
        if (m37037k >= 0) {
            setOrientation(m37037k);
        }
        int m37037k2 = m37026v.m37037k(C7461j.LinearLayoutCompat_android_gravity, -1);
        if (m37037k2 >= 0) {
            setGravity(m37037k2);
        }
        boolean m37047a = m37026v.m37047a(C7461j.LinearLayoutCompat_android_baselineAligned, true);
        if (!m37047a) {
            setBaselineAligned(m37047a);
        }
        this.f3088y = m37026v.m37039i(C7461j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3083d = m37026v.m37037k(C7461j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3089z = m37026v.m37047a(C7461j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m37026v.m37041g(C7461j.LinearLayoutCompat_divider));
        this.f3080F = m37026v.m37037k(C7461j.LinearLayoutCompat_showDividers, 0);
        this.f3081G = m37026v.m37042f(C7461j.LinearLayoutCompat_dividerPadding, 0);
        m37026v.m37025w();
    }
}
