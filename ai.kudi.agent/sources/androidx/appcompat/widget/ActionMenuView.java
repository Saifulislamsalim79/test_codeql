package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements C0999g.InterfaceC1001b, InterfaceC1016n {

    /* renamed from: H */
    private C0999g f3034H;

    /* renamed from: I */
    private Context f3035I;

    /* renamed from: J */
    private int f3036J;

    /* renamed from: K */
    private boolean f3037K;

    /* renamed from: L */
    private C1073c f3038L;

    /* renamed from: M */
    private InterfaceC1014m.InterfaceC1015a f3039M;

    /* renamed from: N */
    C0999g.InterfaceC1000a f3040N;

    /* renamed from: O */
    private boolean f3041O;

    /* renamed from: P */
    private int f3042P;

    /* renamed from: Q */
    private int f3043Q;

    /* renamed from: R */
    private int f3044R;

    /* renamed from: S */
    InterfaceC1035e f3045S;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1031a {
        /* renamed from: a */
        boolean mo37240a();

        /* renamed from: b */
        boolean mo37239b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes2.dex */
    public static class C1032b implements InterfaceC1014m.InterfaceC1015a {
        C1032b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: a */
        public void mo37237a(C0999g c0999g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: b */
        public boolean mo37236b(C0999g c0999g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes2.dex */
    public static class C1033c extends LinearLayoutCompat.C1037a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f3046a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f3047b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f3048c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f3049d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f3050e;

        /* renamed from: f */
        boolean f3051f;

        public C1033c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1033c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1033c(C1033c c1033c) {
            super(c1033c);
            this.f3046a = c1033c.f3046a;
        }

        public C1033c(int i, int i2) {
            super(i, i2);
            this.f3046a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes2.dex */
    public class C1034d implements C0999g.InterfaceC1000a {
        C1034d() {
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: a */
        public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
            InterfaceC1035e interfaceC1035e = ActionMenuView.this.f3045S;
            return interfaceC1035e != null && interfaceC1035e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: b */
        public void mo18591b(C0999g c0999g) {
            C0999g.InterfaceC1000a interfaceC1000a = ActionMenuView.this.f3040N;
            if (interfaceC1000a != null) {
                interfaceC1000a.mo18591b(c0999g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC1035e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m37401L(View view, int i, int i2, int i3, int i4) {
        C1033c c1033c = (C1033c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m37595c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        c1033c.f3049d = (c1033c.f3046a || !z2) ? false : false;
        c1033c.f3047b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: M */
    private void m37400M(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f3043Q;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.f3044R;
                    i6 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r14 = 0;
                }
                C1033c c1033c = (C1033c) childAt.getLayoutParams();
                c1033c.f3051f = r14;
                c1033c.f3048c = r14;
                c1033c.f3047b = r14;
                c1033c.f3049d = r14;
                ((LinearLayout.LayoutParams) c1033c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c1033c).rightMargin = r14;
                c1033c.f3050e = z5 && ((ActionMenuItemView) childAt).m37595c();
                int m37401L = m37401L(childAt, i11, c1033c.f3046a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, m37401L);
                if (c1033c.f3049d) {
                    i16++;
                }
                if (c1033c.f3046a) {
                    z4 = true;
                }
                i9 -= m37401L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (m37401L == 1) {
                    j |= 1 << i13;
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i9 > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = Integer.MAX_VALUE;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C1033c c1033c2 = (C1033c) getChildAt(i22).getLayoutParams();
                int i24 = i12;
                if (c1033c2.f3049d) {
                    int i25 = c1033c2.f3047b;
                    if (i25 < i23) {
                        j2 = 1 << i22;
                        i23 = i25;
                        i21 = 1;
                    } else if (i25 == i23) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                i12 = i24;
                z7 = z8;
            }
            z = z7;
            i5 = i12;
            j |= j2;
            if (i21 > i9) {
                i3 = mode;
                i4 = i7;
                break;
            }
            int i26 = i23 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                C1033c c1033c3 = (C1033c) childAt2.getLayoutParams();
                int i28 = i7;
                int i29 = mode;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (c1033c3.f3047b == i26) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c1033c3.f3050e && i9 == 1) {
                        int i30 = this.f3044R;
                        z3 = z6;
                        childAt2.setPadding(i30 + i11, 0, i30, 0);
                    } else {
                        z3 = z6;
                    }
                    c1033c3.f3047b++;
                    c1033c3.f3051f = true;
                    i9--;
                }
                i27++;
                mode = i29;
                i7 = i28;
                z6 = z3;
            }
            i12 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i7;
        z = z7;
        i5 = i12;
        boolean z9 = !z4 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C1033c) getChildAt(0).getLayoutParams()).f3050e) {
                    bitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j & (1 << i31)) != 0 && !((C1033c) getChildAt(i31).getLayoutParams()).f3050e) {
                    bitCount -= 0.5f;
                }
            }
            int i32 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
            z2 = z;
            for (int i33 = 0; i33 < childCount; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C1033c c1033c4 = (C1033c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1033c4.f3048c = i32;
                        c1033c4.f3051f = true;
                        if (i33 == 0 && !c1033c4.f3050e) {
                            ((LinearLayout.LayoutParams) c1033c4).leftMargin = (-i32) / 2;
                        }
                    } else if (c1033c4.f3046a) {
                        c1033c4.f3048c = i32;
                        c1033c4.f3051f = true;
                        ((LinearLayout.LayoutParams) c1033c4).rightMargin = (-i32) / 2;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c1033c4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c1033c4).rightMargin = i32 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                C1033c c1033c5 = (C1033c) childAt4.getLayoutParams();
                if (c1033c5.f3051f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1033c5.f3047b * i11) + c1033c5.f3048c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i20);
    }

    /* renamed from: B */
    public void m37411B() {
        C1073c c1073c = this.f3038L;
        if (c1073c != null) {
            c1073c.m37265B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C */
    public C1033c mo37379m() {
        C1033c c1033c = new C1033c(-2, -2);
        ((LinearLayout.LayoutParams) c1033c).gravity = 16;
        return c1033c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: D */
    public C1033c mo37378n(AttributeSet attributeSet) {
        return new C1033c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E */
    public C1033c mo37377o(ViewGroup.LayoutParams layoutParams) {
        C1033c c1033c;
        if (layoutParams != null) {
            if (layoutParams instanceof C1033c) {
                c1033c = new C1033c((C1033c) layoutParams);
            } else {
                c1033c = new C1033c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c1033c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c1033c).gravity = 16;
            }
            return c1033c;
        }
        return mo37379m();
    }

    /* renamed from: F */
    public C1033c m37407F() {
        C1033c mo37379m = mo37379m();
        mo37379m.f3046a = true;
        return mo37379m;
    }

    /* renamed from: G */
    protected boolean m37406G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1031a)) {
            z = false | ((InterfaceC1031a) childAt).mo37240a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1031a)) ? z : z | ((InterfaceC1031a) childAt2).mo37239b();
    }

    /* renamed from: H */
    public boolean m37405H() {
        C1073c c1073c = this.f3038L;
        return c1073c != null && c1073c.m37262E();
    }

    /* renamed from: I */
    public boolean m37404I() {
        C1073c c1073c = this.f3038L;
        return c1073c != null && c1073c.m37260G();
    }

    /* renamed from: J */
    public boolean m37403J() {
        C1073c c1073c = this.f3038L;
        return c1073c != null && c1073c.m37259H();
    }

    /* renamed from: K */
    public boolean m37402K() {
        return this.f3037K;
    }

    /* renamed from: N */
    public C0999g m37399N() {
        return this.f3034H;
    }

    /* renamed from: O */
    public void m37398O(InterfaceC1014m.InterfaceC1015a interfaceC1015a, C0999g.InterfaceC1000a interfaceC1000a) {
        this.f3039M = interfaceC1015a;
        this.f3040N = interfaceC1000a;
    }

    /* renamed from: P */
    public boolean m37397P() {
        C1073c c1073c = this.f3038L;
        return c1073c != null && c1073c.m37253N();
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1001b
    /* renamed from: a */
    public boolean mo37396a(C1003i c1003i) {
        return this.f3034H.m37547N(c1003i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n
    /* renamed from: b */
    public void mo26852b(C0999g c0999g) {
        this.f3034H = c0999g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1033c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f3034H == null) {
            Context context = getContext();
            C0999g c0999g = new C0999g(context);
            this.f3034H = c0999g;
            c0999g.mo37444V(new C1034d());
            C1073c c1073c = new C1073c(context);
            this.f3038L = c1073c;
            c1073c.m37254M(true);
            C1073c c1073c2 = this.f3038L;
            InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f3039M;
            if (interfaceC1015a == null) {
                interfaceC1015a = new C1032b();
            }
            c1073c2.mo26754m(interfaceC1015a);
            this.f3034H.m37532c(this.f3038L, this.f3035I);
            this.f3038L.m37256K(this);
        }
        return this.f3034H;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3038L.m37263D();
    }

    public int getPopupTheme() {
        return this.f3036J;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1073c c1073c = this.f3038L;
        if (c1073c != null) {
            c1073c.mo26758i(false);
            if (this.f3038L.m37259H()) {
                this.f3038L.m37262E();
                this.f3038L.m37253N();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m37411B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f3041O) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m36903b = C1170x0.m36903b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1033c c1033c = (C1033c) childAt.getLayoutParams();
                if (c1033c.f3046a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m37406G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m36903b) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1033c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1033c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1033c).leftMargin) + ((LinearLayout.LayoutParams) c1033c).rightMargin;
                    m37406G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m36903b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C1033c c1033c2 = (C1033c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1033c2.f3046a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c1033c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1033c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C1033c c1033c3 = (C1033c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1033c3.f3046a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c1033c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) c1033c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        C0999g c0999g;
        boolean z = this.f3041O;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f3041O = z2;
        if (z != z2) {
            this.f3042P = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f3041O && (c0999g = this.f3034H) != null && size != this.f3042P) {
            this.f3042P = size;
            c0999g.mo26725M(true);
        }
        int childCount = getChildCount();
        if (this.f3041O && childCount > 0) {
            m37400M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C1033c c1033c = (C1033c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) c1033c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c1033c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f3038L.m37257J(z);
    }

    public void setOnMenuItemClickListener(InterfaceC1035e interfaceC1035e) {
        this.f3045S = interfaceC1035e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f3038L.m37255L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f3037K = z;
    }

    public void setPopupTheme(int i) {
        if (this.f3036J != i) {
            this.f3036J = i;
            if (i == 0) {
                this.f3035I = getContext();
            } else {
                this.f3035I = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1073c c1073c) {
        this.f3038L = c1073c;
        c1073c.m37256K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3043Q = (int) (56.0f * f);
        this.f3044R = (int) (f * 4.0f);
        this.f3035I = context;
        this.f3036J = 0;
    }
}
