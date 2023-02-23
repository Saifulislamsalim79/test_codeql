package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C2690d;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC2687a {

    /* renamed from: A */
    private int f7498A;

    /* renamed from: B */
    private int f7499B;

    /* renamed from: C */
    private int f7500C;

    /* renamed from: D */
    private int f7501D;

    /* renamed from: E */
    private int[] f7502E;

    /* renamed from: F */
    private SparseIntArray f7503F;

    /* renamed from: G */
    private C2690d f7504G;

    /* renamed from: H */
    private List<C2689c> f7505H;

    /* renamed from: I */
    private C2690d.C2692b f7506I;

    /* renamed from: c */
    private int f7507c;

    /* renamed from: d */
    private int f7508d;

    /* renamed from: e */
    private int f7509e;

    /* renamed from: f */
    private int f7510f;

    /* renamed from: w */
    private int f7511w;

    /* renamed from: x */
    private int f7512x;

    /* renamed from: y */
    private Drawable f7513y;

    /* renamed from: z */
    private Drawable f7514z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m32397A() {
        if (this.f7513y == null && this.f7514z == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    private boolean m32396a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7505H.get(i2).m32217c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private boolean m32395l(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View m32389r = m32389r(i - i3);
            if (m32389r != null && m32389r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m32394m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f7505H.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2689c c2689c = this.f7505H.get(i3);
            for (int i4 = 0; i4 < c2689c.f7588h; i4++) {
                int i5 = c2689c.f7595o + i4;
                View m32389r = m32389r(i5);
                if (m32389r != null && m32389r.getVisibility() != 8) {
                    C2678a c2678a = (C2678a) m32389r.getLayoutParams();
                    if (m32388s(i5, i4)) {
                        if (z) {
                            left = m32389r.getRight() + ((ViewGroup.MarginLayoutParams) c2678a).rightMargin;
                        } else {
                            left = (m32389r.getLeft() - ((ViewGroup.MarginLayoutParams) c2678a).leftMargin) - this.f7501D;
                        }
                        m32391p(canvas, left, c2689c.f7582b, c2689c.f7587g);
                    }
                    if (i4 == c2689c.f7588h - 1 && (this.f7499B & 4) > 0) {
                        if (z) {
                            right = (m32389r.getLeft() - ((ViewGroup.MarginLayoutParams) c2678a).leftMargin) - this.f7501D;
                        } else {
                            right = m32389r.getRight() + ((ViewGroup.MarginLayoutParams) c2678a).rightMargin;
                        }
                        m32391p(canvas, right, c2689c.f7582b, c2689c.f7587g);
                    }
                }
            }
            if (m32387t(i3)) {
                if (z2) {
                    i2 = c2689c.f7584d;
                } else {
                    i2 = c2689c.f7582b - this.f7500C;
                }
                m32392o(canvas, paddingLeft, i2, max);
            }
            if (m32386u(i3) && (this.f7498A & 4) > 0) {
                if (z2) {
                    i = c2689c.f7582b - this.f7500C;
                } else {
                    i = c2689c.f7584d;
                }
                m32392o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    private void m32393n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f7505H.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2689c c2689c = this.f7505H.get(i3);
            for (int i4 = 0; i4 < c2689c.f7588h; i4++) {
                int i5 = c2689c.f7595o + i4;
                View m32389r = m32389r(i5);
                if (m32389r != null && m32389r.getVisibility() != 8) {
                    C2678a c2678a = (C2678a) m32389r.getLayoutParams();
                    if (m32388s(i5, i4)) {
                        if (z2) {
                            top = m32389r.getBottom() + ((ViewGroup.MarginLayoutParams) c2678a).bottomMargin;
                        } else {
                            top = (m32389r.getTop() - ((ViewGroup.MarginLayoutParams) c2678a).topMargin) - this.f7500C;
                        }
                        m32392o(canvas, c2689c.f7581a, top, c2689c.f7587g);
                    }
                    if (i4 == c2689c.f7588h - 1 && (this.f7498A & 4) > 0) {
                        if (z2) {
                            bottom = (m32389r.getTop() - ((ViewGroup.MarginLayoutParams) c2678a).topMargin) - this.f7500C;
                        } else {
                            bottom = m32389r.getBottom() + ((ViewGroup.MarginLayoutParams) c2678a).bottomMargin;
                        }
                        m32392o(canvas, c2689c.f7581a, bottom, c2689c.f7587g);
                    }
                }
            }
            if (m32387t(i3)) {
                if (z) {
                    i2 = c2689c.f7583c;
                } else {
                    i2 = c2689c.f7581a - this.f7501D;
                }
                m32391p(canvas, i2, paddingTop, max);
            }
            if (m32386u(i3) && (this.f7499B & 4) > 0) {
                if (z) {
                    i = c2689c.f7581a - this.f7501D;
                } else {
                    i = c2689c.f7583c;
                }
                m32391p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    private void m32392o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f7513y;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f7500C + i2);
        this.f7513y.draw(canvas);
    }

    /* renamed from: p */
    private void m32391p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f7514z;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f7501D + i, i3 + i2);
        this.f7514z.draw(canvas);
    }

    /* renamed from: s */
    private boolean m32388s(int i, int i2) {
        return m32395l(i, i2) ? mo32234j() ? (this.f7499B & 1) != 0 : (this.f7498A & 1) != 0 : mo32234j() ? (this.f7499B & 2) != 0 : (this.f7498A & 2) != 0;
    }

    /* renamed from: t */
    private boolean m32387t(int i) {
        if (i < 0 || i >= this.f7505H.size()) {
            return false;
        }
        return m32396a(i) ? mo32234j() ? (this.f7498A & 1) != 0 : (this.f7499B & 1) != 0 : mo32234j() ? (this.f7498A & 2) != 0 : (this.f7499B & 2) != 0;
    }

    /* renamed from: u */
    private boolean m32386u(int i) {
        if (i < 0 || i >= this.f7505H.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f7505H.size(); i2++) {
            if (this.f7505H.get(i2).m32217c() > 0) {
                return false;
            }
        }
        return mo32234j() ? (this.f7498A & 4) != 0 : (this.f7499B & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32385v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m32385v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32384w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m32384w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    private void m32383x(int i, int i2) {
        this.f7505H.clear();
        this.f7506I.m32164a();
        this.f7504G.m32188c(this.f7506I, i, i2);
        this.f7505H = this.f7506I.f7602a;
        this.f7504G.m32175p(i, i2);
        if (this.f7510f == 3) {
            for (C2689c c2689c : this.f7505H) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < c2689c.f7588h; i4++) {
                    View m32389r = m32389r(c2689c.f7595o + i4);
                    if (m32389r != null && m32389r.getVisibility() != 8) {
                        C2678a c2678a = (C2678a) m32389r.getLayoutParams();
                        if (this.f7508d != 2) {
                            i3 = Math.max(i3, m32389r.getMeasuredHeight() + Math.max(c2689c.f7592l - m32389r.getBaseline(), ((ViewGroup.MarginLayoutParams) c2678a).topMargin) + ((ViewGroup.MarginLayoutParams) c2678a).bottomMargin);
                        } else {
                            i3 = Math.max(i3, m32389r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2678a).topMargin + Math.max((c2689c.f7592l - m32389r.getMeasuredHeight()) + m32389r.getBaseline(), ((ViewGroup.MarginLayoutParams) c2678a).bottomMargin));
                        }
                    }
                }
                c2689c.f7587g = i3;
            }
        }
        this.f7504G.m32176o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f7504G.m32193W();
        m32381z(this.f7507c, i, i2, this.f7506I.f7603b);
    }

    /* renamed from: y */
    private void m32382y(int i, int i2) {
        this.f7505H.clear();
        this.f7506I.m32164a();
        this.f7504G.m32185f(this.f7506I, i, i2);
        this.f7505H = this.f7506I.f7602a;
        this.f7504G.m32175p(i, i2);
        this.f7504G.m32176o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f7504G.m32193W();
        m32381z(this.f7507c, i, i2, this.f7506I.f7603b);
    }

    /* renamed from: z */
    private void m32381z(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i != 2 && i != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        } else {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f7503F == null) {
            this.f7503F = new SparseIntArray(getChildCount());
        }
        this.f7502E = this.f7504G.m32177n(view, i, layoutParams, this.f7503F);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: b */
    public void mo32242b(View view, int i, int i2, C2689c c2689c) {
        if (m32388s(i, i2)) {
            if (mo32234j()) {
                int i3 = c2689c.f7585e;
                int i4 = this.f7501D;
                c2689c.f7585e = i3 + i4;
                c2689c.f7586f += i4;
                return;
            }
            int i5 = c2689c.f7585e;
            int i6 = this.f7500C;
            c2689c.f7585e = i5 + i6;
            c2689c.f7586f += i6;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: c */
    public void mo32241c(C2689c c2689c) {
        if (mo32234j()) {
            if ((this.f7499B & 4) > 0) {
                int i = c2689c.f7585e;
                int i2 = this.f7501D;
                c2689c.f7585e = i + i2;
                c2689c.f7586f += i2;
            }
        } else if ((this.f7498A & 4) > 0) {
            int i3 = c2689c.f7585e;
            int i4 = this.f7500C;
            c2689c.f7585e = i3 + i4;
            c2689c.f7586f += i4;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2678a;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: d */
    public View mo32240d(int i) {
        return m32389r(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: e */
    public int mo32239e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: f */
    public void mo32238f(int i, View view) {
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: g */
    public View mo32237g(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getAlignContent() {
        return this.f7511w;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getAlignItems() {
        return this.f7510f;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f7513y;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f7514z;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexDirection() {
        return this.f7507c;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C2689c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f7505H.size());
        for (C2689c c2689c : this.f7505H) {
            if (c2689c.m32217c() != 0) {
                arrayList.add(c2689c);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public List<C2689c> getFlexLinesInternal() {
        return this.f7505H;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexWrap() {
        return this.f7508d;
    }

    public int getJustifyContent() {
        return this.f7509e;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C2689c c2689c : this.f7505H) {
            i = Math.max(i, c2689c.f7585e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getMaxLine() {
        return this.f7512x;
    }

    public int getShowDividerHorizontal() {
        return this.f7498A;
    }

    public int getShowDividerVertical() {
        return this.f7499B;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f7505H.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C2689c c2689c = this.f7505H.get(i4);
            if (m32387t(i4)) {
                if (mo32234j()) {
                    i2 = this.f7500C;
                } else {
                    i2 = this.f7501D;
                }
                i3 += i2;
            }
            if (m32386u(i4)) {
                if (mo32234j()) {
                    i = this.f7500C;
                } else {
                    i = this.f7501D;
                }
                i3 += i;
            }
            i3 += c2689c.f7587g;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: h */
    public int mo32236h(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo32234j()) {
            i3 = m32388s(i, i2) ? 0 + this.f7501D : 0;
            if ((this.f7499B & 4) <= 0) {
                return i3;
            }
            i4 = this.f7501D;
        } else {
            i3 = m32388s(i, i2) ? 0 + this.f7500C : 0;
            if ((this.f7498A & 4) <= 0) {
                return i3;
            }
            i4 = this.f7500C;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: i */
    public int mo32235i(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: j */
    public boolean mo32234j() {
        int i = this.f7507c;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: k */
    public int mo32233k(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f7514z == null && this.f7513y == null) {
            return;
        }
        if (this.f7498A == 0 && this.f7499B == 0) {
            return;
        }
        int m17563C = C7759x.m17563C(this);
        int i = this.f7507c;
        if (i == 0) {
            m32394m(canvas, m17563C == 1, this.f7508d == 2);
        } else if (i == 1) {
            m32394m(canvas, m17563C != 1, this.f7508d == 2);
        } else if (i == 2) {
            boolean z = m17563C == 1;
            if (this.f7508d == 2) {
                z = !z;
            }
            m32393n(canvas, z, false);
        } else if (i != 3) {
        } else {
            boolean z2 = m17563C == 1;
            if (this.f7508d == 2) {
                z2 = !z2;
            }
            m32393n(canvas, z2, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int m17563C = C7759x.m17563C(this);
        int i5 = this.f7507c;
        if (i5 == 0) {
            m32385v(m17563C == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            m32385v(m17563C != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = m17563C == 1;
            m32384w(this.f7508d == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = m17563C == 1;
            m32384w(this.f7508d == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f7507c);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f7503F == null) {
            this.f7503F = new SparseIntArray(getChildCount());
        }
        if (this.f7504G.m32202N(this.f7503F)) {
            this.f7502E = this.f7504G.m32178m(this.f7503F);
        }
        int i3 = this.f7507c;
        if (i3 == 0 || i3 == 1) {
            m32383x(i, i2);
        } else if (i3 != 2 && i3 != 3) {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f7507c);
        } else {
            m32382y(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public C2678a generateLayoutParams(AttributeSet attributeSet) {
        return new C2678a(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View m32389r(int i) {
        if (i >= 0) {
            int[] iArr = this.f7502E;
            if (i >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i]);
        }
        return null;
    }

    public void setAlignContent(int i) {
        if (this.f7511w != i) {
            this.f7511w = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f7510f != i) {
            this.f7510f = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f7513y) {
            return;
        }
        this.f7513y = drawable;
        if (drawable != null) {
            this.f7500C = drawable.getIntrinsicHeight();
        } else {
            this.f7500C = 0;
        }
        m32397A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f7514z) {
            return;
        }
        this.f7514z = drawable;
        if (drawable != null) {
            this.f7501D = drawable.getIntrinsicWidth();
        } else {
            this.f7501D = 0;
        }
        m32397A();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f7507c != i) {
            this.f7507c = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public void setFlexLines(List<C2689c> list) {
        this.f7505H = list;
    }

    public void setFlexWrap(int i) {
        if (this.f7508d != i) {
            this.f7508d = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f7509e != i) {
            this.f7509e = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f7512x != i) {
            this.f7512x = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f7498A) {
            this.f7498A = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f7499B) {
            this.f7499B = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7512x = -1;
        this.f7504G = new C2690d(this);
        this.f7505H = new ArrayList();
        this.f7506I = new C2690d.C2692b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2694e.FlexboxLayout, i, 0);
        this.f7507c = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_flexDirection, 0);
        this.f7508d = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_flexWrap, 0);
        this.f7509e = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_justifyContent, 0);
        this.f7510f = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_alignItems, 4);
        this.f7511w = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_alignContent, 5);
        this.f7512x = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2694e.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C2694e.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C2694e.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f7499B = i2;
            this.f7498A = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f7499B = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f7498A = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2678a) {
            return new C2678a((C2678a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2678a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2678a(layoutParams);
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayout$a */
    /* loaded from: classes2.dex */
    public static class C2678a extends ViewGroup.MarginLayoutParams implements InterfaceC2688b {
        public static final Parcelable.Creator<C2678a> CREATOR = new C2679a();

        /* renamed from: A */
        private int f7515A;

        /* renamed from: B */
        private boolean f7516B;

        /* renamed from: c */
        private int f7517c;

        /* renamed from: d */
        private float f7518d;

        /* renamed from: e */
        private float f7519e;

        /* renamed from: f */
        private int f7520f;

        /* renamed from: w */
        private float f7521w;

        /* renamed from: x */
        private int f7522x;

        /* renamed from: y */
        private int f7523y;

        /* renamed from: z */
        private int f7524z;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a */
        /* loaded from: classes2.dex */
        static class C2679a implements Parcelable.Creator<C2678a> {
            C2679a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2678a createFromParcel(Parcel parcel) {
                return new C2678a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2678a[] newArray(int i) {
                return new C2678a[i];
            }
        }

        public C2678a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7517c = 1;
            this.f7518d = 0.0f;
            this.f7519e = 1.0f;
            this.f7520f = -1;
            this.f7521w = -1.0f;
            this.f7524z = 16777215;
            this.f7515A = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2694e.FlexboxLayout_Layout);
            this.f7517c = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_Layout_layout_order, 1);
            this.f7518d = obtainStyledAttributes.getFloat(C2694e.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f7519e = obtainStyledAttributes.getFloat(C2694e.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f7520f = obtainStyledAttributes.getInt(C2694e.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f7521w = obtainStyledAttributes.getFraction(C2694e.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f7522x = obtainStyledAttributes.getDimensionPixelSize(C2694e.FlexboxLayout_Layout_layout_minWidth, 0);
            this.f7523y = obtainStyledAttributes.getDimensionPixelSize(C2694e.FlexboxLayout_Layout_layout_minHeight, 0);
            this.f7524z = obtainStyledAttributes.getDimensionPixelSize(C2694e.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f7515A = obtainStyledAttributes.getDimensionPixelSize(C2694e.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f7516B = obtainStyledAttributes.getBoolean(C2694e.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: A0 */
        public float mo32232A0() {
            return this.f7521w;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: H0 */
        public int mo32231H0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: K0 */
        public int mo32230K0() {
            return this.f7523y;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: O */
        public int mo32229O() {
            return this.f7520f;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: P */
        public float mo32228P() {
            return this.f7519e;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: P0 */
        public boolean mo32227P0() {
            return this.f7516B;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: U0 */
        public int mo32226U0() {
            return this.f7515A;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: X */
        public int mo32225X() {
            return this.f7522x;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: Z0 */
        public int mo32224Z0() {
            return this.f7524z;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: b0 */
        public int mo32223b0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: f0 */
        public int mo32222f0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getOrder() {
            return this.f7517c;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: o0 */
        public int mo32221o0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: u0 */
        public float mo32220u0() {
            return this.f7518d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7517c);
            parcel.writeFloat(this.f7518d);
            parcel.writeFloat(this.f7519e);
            parcel.writeInt(this.f7520f);
            parcel.writeFloat(this.f7521w);
            parcel.writeInt(this.f7522x);
            parcel.writeInt(this.f7523y);
            parcel.writeInt(this.f7524z);
            parcel.writeInt(this.f7515A);
            parcel.writeByte(this.f7516B ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C2678a(C2678a c2678a) {
            super((ViewGroup.MarginLayoutParams) c2678a);
            this.f7517c = 1;
            this.f7518d = 0.0f;
            this.f7519e = 1.0f;
            this.f7520f = -1;
            this.f7521w = -1.0f;
            this.f7524z = 16777215;
            this.f7515A = 16777215;
            this.f7517c = c2678a.f7517c;
            this.f7518d = c2678a.f7518d;
            this.f7519e = c2678a.f7519e;
            this.f7520f = c2678a.f7520f;
            this.f7521w = c2678a.f7521w;
            this.f7522x = c2678a.f7522x;
            this.f7523y = c2678a.f7523y;
            this.f7524z = c2678a.f7524z;
            this.f7515A = c2678a.f7515A;
            this.f7516B = c2678a.f7516B;
        }

        public C2678a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7517c = 1;
            this.f7518d = 0.0f;
            this.f7519e = 1.0f;
            this.f7520f = -1;
            this.f7521w = -1.0f;
            this.f7524z = 16777215;
            this.f7515A = 16777215;
        }

        public C2678a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7517c = 1;
            this.f7518d = 0.0f;
            this.f7519e = 1.0f;
            this.f7520f = -1;
            this.f7521w = -1.0f;
            this.f7524z = 16777215;
            this.f7515A = 16777215;
        }

        protected C2678a(Parcel parcel) {
            super(0, 0);
            this.f7517c = 1;
            this.f7518d = 0.0f;
            this.f7519e = 1.0f;
            this.f7520f = -1;
            this.f7521w = -1.0f;
            this.f7524z = 16777215;
            this.f7515A = 16777215;
            this.f7517c = parcel.readInt();
            this.f7518d = parcel.readFloat();
            this.f7519e = parcel.readFloat();
            this.f7520f = parcel.readInt();
            this.f7521w = parcel.readFloat();
            this.f7522x = parcel.readInt();
            this.f7523y = parcel.readInt();
            this.f7524z = parcel.readInt();
            this.f7515A = parcel.readInt();
            this.f7516B = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
