package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p233h.C7628a;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7746k;
import p201g.p227h.p238l.InterfaceC7752q;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9272g;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC1279b {

    /* renamed from: J */
    private static final int f10928J = C9276k.Widget_Design_AppBarLayout;

    /* renamed from: A */
    private boolean f10929A;

    /* renamed from: B */
    private boolean f10930B;

    /* renamed from: C */
    private boolean f10931C;

    /* renamed from: D */
    private boolean f10932D;

    /* renamed from: E */
    private int f10933E;

    /* renamed from: F */
    private WeakReference<View> f10934F;

    /* renamed from: G */
    private ValueAnimator f10935G;

    /* renamed from: H */
    private int[] f10936H;

    /* renamed from: I */
    private Drawable f10937I;

    /* renamed from: c */
    private int f10938c;

    /* renamed from: d */
    private int f10939d;

    /* renamed from: e */
    private int f10940e;

    /* renamed from: f */
    private int f10941f;

    /* renamed from: w */
    private boolean f10942w;

    /* renamed from: x */
    private int f10943x;

    /* renamed from: y */
    private C7698g0 f10944y;

    /* renamed from: z */
    private List<InterfaceC4494c> f10945z;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends AbstractC4503b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m27659R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC1280c m36505f = ((CoordinatorLayout.C1283f) appBarLayout.getLayoutParams()).m36505f();
            if (m36505f instanceof BaseBehavior) {
                return ((BaseBehavior) m36505f).mo27626M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m27658S(View view, View view2) {
            CoordinatorLayout.AbstractC1280c m36505f = ((CoordinatorLayout.C1283f) view2.getLayoutParams()).m36505f();
            if (m36505f instanceof BaseBehavior) {
                C7759x.m17528a0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m36505f).f10946k) + m27616M()) - m27620I(view2));
            }
        }

        /* renamed from: T */
        private void m27657T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m27707l()) {
                    appBarLayout.m27698u(appBarLayout.m27696w(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4503b
        /* renamed from: J */
        float mo27619J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m27659R = m27659R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m27659R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m27659R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC4503b
        /* renamed from: L */
        int mo27617L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo27617L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4503b
        /* renamed from: Q */
        public AppBarLayout mo27621H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: e */
        public boolean mo26179e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: h */
        public boolean mo26207h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m27658S(view, view2);
            m27657T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: i */
        public void mo27656i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C7759x.m17510j0(coordinatorLayout, C7716c.C7717a.f18477h.m17641b());
                C7759x.m17510j0(coordinatorLayout, C7716c.C7717a.f18478i.m17641b());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: w */
        public boolean mo27655w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo27621H = mo27621H(coordinatorLayout.m36537l(view));
            if (mo27621H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f11012d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo27621H.m27701r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ScrollingViewBehavior_Layout);
            m27614O(obtainStyledAttributes.getDimensionPixelSize(C9277l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes2.dex */
    class C4492a implements InterfaceC7752q {
        C4492a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            AppBarLayout.this.m27705n(c7698g0);
            return c7698g0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes2.dex */
    public class C4493b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ C9243g f10968c;

        C4493b(AppBarLayout appBarLayout, C9243g c9243g) {
            this.f10968c = c9243g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10968c.m15410W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4494c<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4496e extends InterfaceC4494c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.appBarLayoutStyle);
    }

    /* renamed from: c */
    private void m27716c() {
        WeakReference<View> weakReference = this.f10934F;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10934F = null;
    }

    /* renamed from: d */
    private View m27715d(View view) {
        int i;
        if (this.f10934F == null && (i = this.f10933E) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f10933E);
            }
            if (findViewById != null) {
                this.f10934F = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f10934F;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m27710i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4495d) getChildAt(i).getLayoutParams()).m27652c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m27708k() {
        this.f10939d = -1;
        this.f10940e = -1;
        this.f10941f = -1;
    }

    /* renamed from: s */
    private void m27700s(boolean z, boolean z2, boolean z3) {
        this.f10943x = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: t */
    private boolean m27699t(boolean z) {
        if (this.f10930B != z) {
            this.f10930B = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private boolean m27697v() {
        return this.f10937I != null && getTopInset() > 0;
    }

    /* renamed from: x */
    private boolean m27695x() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || C7759x.m17479z(childAt)) ? false : true;
        }
        return false;
    }

    /* renamed from: y */
    private void m27694y(C9243g c9243g, boolean z) {
        float dimension = getResources().getDimension(C9267d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f10935G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f10935G = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C9272g.app_bar_elevation_anim_duration));
        this.f10935G.setInterpolator(C9278a.f21806a);
        this.f10935G.addUpdateListener(new C4493b(this, c9243g));
        this.f10935G.start();
    }

    /* renamed from: z */
    private void m27693z() {
        setWillNotDraw(!m27697v());
    }

    /* renamed from: a */
    public void m27718a(InterfaceC4494c interfaceC4494c) {
        if (this.f10945z == null) {
            this.f10945z = new ArrayList();
        }
        if (interfaceC4494c == null || this.f10945z.contains(interfaceC4494c)) {
            return;
        }
        this.f10945z.add(interfaceC4494c);
    }

    /* renamed from: b */
    public void m27717b(InterfaceC4496e interfaceC4496e) {
        m27718a(interfaceC4496e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4495d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m27697v()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f10938c);
            this.f10937I.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10937I;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public C4495d generateDefaultLayoutParams() {
        return new C4495d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public C4495d generateLayoutParams(AttributeSet attributeSet) {
        return new C4495d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public C4495d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C4495d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4495d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4495d(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1279b
    public CoordinatorLayout.AbstractC1280c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int i;
        int m17561D;
        int i2 = this.f10940e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C4495d c4495d = (C4495d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4495d.f10969a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c4495d).topMargin + ((LinearLayout.LayoutParams) c4495d).bottomMargin;
                if ((i4 & 8) != 0) {
                    m17561D = C7759x.m17561D(childAt);
                } else if ((i4 & 2) != 0) {
                    m17561D = measuredHeight - C7759x.m17561D(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C7759x.m17479z(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + m17561D;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f10940e = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f10941f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4495d c4495d = (C4495d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c4495d).topMargin + ((LinearLayout.LayoutParams) c4495d).bottomMargin;
            int i4 = c4495d.f10969a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C7759x.m17561D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10941f = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f10933E;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m17561D = C7759x.m17561D(this);
        if (m17561D == 0) {
            int childCount = getChildCount();
            m17561D = childCount >= 1 ? C7759x.m17561D(getChildAt(childCount - 1)) : 0;
            if (m17561D == 0) {
                return getHeight() / 3;
            }
        }
        return (m17561D * 2) + topInset;
    }

    int getPendingAction() {
        return this.f10943x;
    }

    public Drawable getStatusBarForeground() {
        return this.f10937I;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C7698g0 c7698g0 = this.f10944y;
        if (c7698g0 != null) {
            return c7698g0.m17782l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f10939d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4495d c4495d = (C4495d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4495d.f10969a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c4495d).topMargin + ((LinearLayout.LayoutParams) c4495d).bottomMargin;
            if (i2 == 0 && C7759x.m17479z(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C7759x.m17561D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10939d = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m27711h() {
        return this.f10942w;
    }

    /* renamed from: j */
    boolean m27709j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean m27707l() {
        return this.f10932D;
    }

    /* renamed from: m */
    void m27706m(int i) {
        this.f10938c = i;
        if (!willNotDraw()) {
            C7759x.m17516g0(this);
        }
        List<InterfaceC4494c> list = this.f10945z;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4494c interfaceC4494c = this.f10945z.get(i2);
                if (interfaceC4494c != null) {
                    interfaceC4494c.onOffsetChanged(this, i);
                }
            }
        }
    }

    /* renamed from: n */
    C7698g0 m27705n(C7698g0 c7698g0) {
        C7698g0 c7698g02 = C7759x.m17479z(this) ? c7698g0 : null;
        if (!C7670c.m17875a(this.f10944y, c7698g02)) {
            this.f10944y = c7698g02;
            m27693z();
            requestLayout();
        }
        return c7698g0;
    }

    /* renamed from: o */
    public void m27704o(InterfaceC4494c interfaceC4494c) {
        List<InterfaceC4494c> list = this.f10945z;
        if (list == null || interfaceC4494c == null) {
            return;
        }
        list.remove(interfaceC4494c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15367e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f10936H == null) {
            this.f10936H = new int[4];
        }
        int[] iArr = this.f10936H;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f10930B ? C9233b.state_liftable : -C9233b.state_liftable;
        iArr[1] = (this.f10930B && this.f10931C) ? C9233b.state_lifted : -C9233b.state_lifted;
        iArr[2] = this.f10930B ? C9233b.state_collapsible : -C9233b.state_collapsible;
        iArr[3] = (this.f10930B && this.f10931C) ? C9233b.state_collapsed : -C9233b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m27716c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C7759x.m17479z(this) && m27695x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C7759x.m17528a0(getChildAt(childCount), topInset);
            }
        }
        m27708k();
        this.f10942w = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C4495d) getChildAt(i5).getLayoutParams()).m27653b() != null) {
                this.f10942w = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f10937I;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f10929A) {
            return;
        }
        if (!this.f10932D && !m27710i()) {
            z2 = false;
        }
        m27699t(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C7759x.m17479z(this) && m27695x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C7628a.m17971b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m27708k();
    }

    /* renamed from: p */
    public void m27703p(InterfaceC4496e interfaceC4496e) {
        m27704o(interfaceC4496e);
    }

    /* renamed from: q */
    void m27702q() {
        this.f10943x = 0;
    }

    /* renamed from: r */
    public void m27701r(boolean z, boolean z2) {
        m27700s(z, z2, true);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C9247h.m15368d(this, f);
    }

    public void setExpanded(boolean z) {
        m27701r(z, C7759x.m17535U(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f10932D = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f10933E = i;
        m27716c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f10937I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f10937I = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f10937I.setState(getDrawableState());
                }
                C1365a.m36189m(this.f10937I, C7759x.m17563C(this));
                this.f10937I.setVisible(getVisibility() == 0, false);
                this.f10937I.setCallback(this);
            }
            m27693z();
            C7759x.m17516g0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C7462a.m18690d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4506e.m27601b(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f10937I;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: u */
    boolean m27698u(boolean z) {
        if (this.f10931C != z) {
            this.f10931C = z;
            refreshDrawableState();
            if (this.f10932D && (getBackground() instanceof C9243g)) {
                m27694y((C9243g) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10937I;
    }

    /* renamed from: w */
    boolean m27696w(View view) {
        View m27715d = m27715d(view);
        if (m27715d != null) {
            view = m27715d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC4501a<T> {

        /* renamed from: k */
        private int f10946k;

        /* renamed from: l */
        private int f10947l;

        /* renamed from: m */
        private ValueAnimator f10948m;

        /* renamed from: n */
        private int f10949n;

        /* renamed from: o */
        private boolean f10950o;

        /* renamed from: p */
        private float f10951p;

        /* renamed from: q */
        private WeakReference<View> f10952q;

        /* renamed from: r */
        private AbstractC4489d f10953r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes2.dex */
        public class C4486a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: c */
            final /* synthetic */ CoordinatorLayout f10954c;

            /* renamed from: d */
            final /* synthetic */ AppBarLayout f10955d;

            C4486a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f10954c = coordinatorLayout;
                this.f10955d = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m27623P(this.f10954c, this.f10955d, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes2.dex */
        public class C4487b implements InterfaceC7725f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f10957a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f10958b;

            /* renamed from: c */
            final /* synthetic */ View f10959c;

            /* renamed from: d */
            final /* synthetic */ int f10960d;

            C4487b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f10957a = coordinatorLayout;
                this.f10958b = appBarLayout;
                this.f10959c = view;
                this.f10960d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
            /* renamed from: a */
            public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
                BaseBehavior.this.mo27438q(this.f10957a, this.f10958b, this.f10959c, 0, this.f10960d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes2.dex */
        public class C4488c implements InterfaceC7725f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f10962a;

            /* renamed from: b */
            final /* synthetic */ boolean f10963b;

            C4488c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.f10962a = appBarLayout;
                this.f10963b = z;
            }

            @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
            /* renamed from: a */
            public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
                this.f10962a.setExpanded(this.f10963b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        /* loaded from: classes2.dex */
        public static abstract class AbstractC4489d<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m27664a(T t);
        }

        public BaseBehavior() {
            this.f10949n = -1;
        }

        /* renamed from: S */
        private void m27691S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo27626M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m27690T(coordinatorLayout, t, C7716c.C7717a.f18477h, false);
            }
            if (mo27626M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C7759x.m17506l0(coordinatorLayout, C7716c.C7717a.f18478i, null, new C4487b(coordinatorLayout, t, view, i));
                        return;
                    }
                    return;
                }
                m27690T(coordinatorLayout, t, C7716c.C7717a.f18478i, true);
            }
        }

        /* renamed from: T */
        private void m27690T(CoordinatorLayout coordinatorLayout, T t, C7716c.C7717a c7717a, boolean z) {
            C7759x.m17506l0(coordinatorLayout, c7717a, null, new C4488c(this, t, z));
        }

        /* renamed from: U */
        private void m27689U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = Math.abs(mo27626M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            m27688V(coordinatorLayout, t, i, height);
        }

        /* renamed from: V */
        private void m27688V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo27626M = mo27626M();
            if (mo27626M == i) {
                ValueAnimator valueAnimator = this.f10948m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f10948m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f10948m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f10948m = valueAnimator3;
                valueAnimator3.setInterpolator(C9278a.f21810e);
                this.f10948m.addUpdateListener(new C4486a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f10948m.setDuration(Math.min(i2, (int) IjkMediaCodecInfo.RANK_LAST_CHANCE));
            this.f10948m.setIntValues(mo27626M, i);
            this.f10948m.start();
        }

        /* renamed from: X */
        private boolean m27686X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m27709j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m27685Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m27684Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC7746k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m27683a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m27682b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4495d c4495d = (C4495d) childAt.getLayoutParams();
                if (m27685Y(c4495d.m27654a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c4495d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c4495d).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m27679e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C4495d c4495d = (C4495d) childAt.getLayoutParams();
                Interpolator m27653b = c4495d.m27653b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (m27653b != null) {
                    int m27654a = c4495d.m27654a();
                    if ((m27654a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c4495d).topMargin + ((LinearLayout.LayoutParams) c4495d).bottomMargin;
                        if ((m27654a & 2) != 0) {
                            i2 -= C7759x.m17561D(childAt);
                        }
                    }
                    if (C7759x.m17479z(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * m27653b.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m27668p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m36536m = coordinatorLayout.m36536m(t);
            int size = m36536m.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC1280c m36505f = ((CoordinatorLayout.C1283f) m36536m.get(i).getLayoutParams()).m36505f();
                if (m36505f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m36505f).m27618K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m27667q0(CoordinatorLayout coordinatorLayout, T t) {
            int mo27626M = mo27626M();
            int m27682b0 = m27682b0(t, mo27626M);
            if (m27682b0 >= 0) {
                View childAt = t.getChildAt(m27682b0);
                C4495d c4495d = (C4495d) childAt.getLayoutParams();
                int m27654a = c4495d.m27654a();
                if ((m27654a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m27682b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m27685Y(m27654a, 2)) {
                        i2 += C7759x.m17561D(childAt);
                    } else if (m27685Y(m27654a, 5)) {
                        int m17561D = C7759x.m17561D(childAt) + i2;
                        if (mo27626M < m17561D) {
                            i = m17561D;
                        } else {
                            i2 = m17561D;
                        }
                    }
                    if (m27685Y(m27654a, 32)) {
                        i += ((LinearLayout.LayoutParams) c4495d).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c4495d).bottomMargin;
                    }
                    if (mo27626M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m27689U(coordinatorLayout, t, C7628a.m17971b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m27666r0(CoordinatorLayout coordinatorLayout, T t) {
            C7759x.m17510j0(coordinatorLayout, C7716c.C7717a.f18477h.m17641b());
            C7759x.m17510j0(coordinatorLayout, C7716c.C7717a.f18478i.m17641b());
            View m27684Z = m27684Z(coordinatorLayout);
            if (m27684Z == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C1283f) m27684Z.getLayoutParams()).m36505f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m27691S(coordinatorLayout, t, m27684Z);
        }

        /* renamed from: s0 */
        private void m27665s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m27683a0 = m27683a0(t, i);
            if (m27683a0 != null) {
                int m27654a = ((C4495d) m27683a0.getLayoutParams()).m27654a();
                boolean z2 = false;
                if ((m27654a & 1) != 0) {
                    int m17561D = C7759x.m17561D(m27683a0);
                    if (i2 <= 0 || (m27654a & 12) == 0 ? !((m27654a & 2) == 0 || (-i) < (m27683a0.getBottom() - m17561D) - t.getTopInset()) : (-i) >= (m27683a0.getBottom() - m17561D) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.m27707l()) {
                    z2 = t.m27696w(m27684Z(coordinatorLayout));
                }
                boolean m27698u = t.m27698u(z2);
                if (z || (m27698u && m27668p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: M */
        int mo27626M() {
            return m27611E() + this.f10946k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: W */
        public boolean mo27631H(T t) {
            AbstractC4489d abstractC4489d = this.f10953r;
            if (abstractC4489d != null) {
                return abstractC4489d.m27664a(t);
            }
            WeakReference<View> weakReference = this.f10952q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: c0 */
        public int mo27628K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: d0 */
        public int mo27627L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: f0 */
        public void mo27625N(CoordinatorLayout coordinatorLayout, T t) {
            m27667q0(coordinatorLayout, t);
            if (t.m27707l()) {
                t.m27698u(t.m27696w(m27684Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C4504c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: g0 */
        public boolean mo26206l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean mo26206l = super.mo26206l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f10949n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.f10950o) {
                    round = C7759x.m17561D(childAt) + t.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f10951p);
                }
                m27623P(coordinatorLayout, t, i3 + round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m27689U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        m27623P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m27689U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m27623P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m27702q();
            this.f10949n = -1;
            m27609G(C7628a.m17971b(m27611E(), -t.getTotalScrollRange(), 0));
            m27665s0(coordinatorLayout, t, m27611E(), 0, true);
            t.m27706m(m27611E());
            m27666r0(coordinatorLayout, t);
            return mo26206l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: h0 */
        public boolean mo27612m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1283f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.m36563D(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo27612m(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: i0 */
        public void mo27438q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = m27624O(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.m27707l()) {
                t.m27698u(t.m27696w(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: j0 */
        public void mo27434t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m27624O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m27666r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: k0 */
        public void mo27429x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C4490e) {
                C4490e c4490e = (C4490e) parcelable;
                super.mo27429x(coordinatorLayout, t, c4490e.m17424a());
                this.f10949n = c4490e.f10964e;
                this.f10951p = c4490e.f10965f;
                this.f10950o = c4490e.f10966w;
                return;
            }
            super.mo27429x(coordinatorLayout, t, parcelable);
            this.f10949n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: l0 */
        public Parcelable mo27427y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo27427y = super.mo27427y(coordinatorLayout, t);
            int m27611E = m27611E();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + m27611E;
                if (childAt.getTop() + m27611E <= 0 && bottom >= 0) {
                    C4490e c4490e = new C4490e(mo27427y);
                    c4490e.f10964e = i;
                    c4490e.f10966w = bottom == C7759x.m17561D(childAt) + t.getTopInset();
                    c4490e.f10965f = bottom / childAt.getHeight();
                    return c4490e;
                }
            }
            return mo27427y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: m0 */
        public boolean mo27481A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m27707l() || m27686X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f10948m) != null) {
                valueAnimator.cancel();
            }
            this.f10952q = null;
            this.f10947l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: n0 */
        public void mo27479C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f10947l == 0 || i == 1) {
                m27667q0(coordinatorLayout, t);
                if (t.m27707l()) {
                    t.m27698u(t.m27696w(view));
                }
            }
            this.f10952q = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4501a
        /* renamed from: o0 */
        public int mo27622Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mo27626M = mo27626M();
            int i4 = 0;
            if (i2 != 0 && mo27626M >= i2 && mo27626M <= i3) {
                int m17971b = C7628a.m17971b(i, i2, i3);
                if (mo27626M != m17971b) {
                    int m27679e0 = t.m27711h() ? m27679e0(t, m17971b) : m17971b;
                    boolean m27609G = m27609G(m27679e0);
                    i4 = mo27626M - m17971b;
                    this.f10946k = m17971b - m27679e0;
                    if (!m27609G && t.m27711h()) {
                        coordinatorLayout.m36543f(t);
                    }
                    t.m27706m(m27611E());
                    m27665s0(coordinatorLayout, t, m17971b, m17971b < mo27626M ? -1 : 1, false);
                }
            } else {
                this.f10946k = 0;
            }
            m27666r0(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10949n = -1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        /* loaded from: classes2.dex */
        public static class C4490e extends AbstractC7781a {
            public static final Parcelable.Creator<C4490e> CREATOR = new C4491a();

            /* renamed from: e */
            int f10964e;

            /* renamed from: f */
            float f10965f;

            /* renamed from: w */
            boolean f10966w;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            /* loaded from: classes2.dex */
            static class C4491a implements Parcelable.ClassLoaderCreator<C4490e> {
                C4491a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C4490e createFromParcel(Parcel parcel) {
                    return new C4490e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public C4490e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C4490e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public C4490e[] newArray(int i) {
                    return new C4490e[i];
                }
            }

            public C4490e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f10964e = parcel.readInt();
                this.f10965f = parcel.readFloat();
                this.f10966w = parcel.readByte() != 0;
            }

            @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f10964e);
                parcel.writeFloat(this.f10965f);
                parcel.writeByte(this.f10966w ? (byte) 1 : (byte) 0);
            }

            public C4490e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f10928J), attributeSet, i);
        this.f10939d = -1;
        this.f10940e = -1;
        this.f10941f = -1;
        this.f10943x = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C4506e.m27602a(this);
            C4506e.m27600c(this, attributeSet, i, f10928J);
        }
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.AppBarLayout, i, f10928J, new int[0]);
        C7759x.m17492s0(this, m26690h.getDrawable(C9277l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            C9243g c9243g = new C9243g();
            c9243g.m15409X(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            c9243g.m15420M(context2);
            C7759x.m17492s0(this, c9243g);
        }
        if (m26690h.hasValue(C9277l.AppBarLayout_expanded)) {
            m27700s(m26690h.getBoolean(C9277l.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && m26690h.hasValue(C9277l.AppBarLayout_elevation)) {
            C4506e.m27601b(this, m26690h.getDimensionPixelSize(C9277l.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (m26690h.hasValue(C9277l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(m26690h.getBoolean(C9277l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (m26690h.hasValue(C9277l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(m26690h.getBoolean(C9277l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f10932D = m26690h.getBoolean(C9277l.AppBarLayout_liftOnScroll, false);
        this.f10933E = m26690h.getResourceId(C9277l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(m26690h.getDrawable(C9277l.AppBarLayout_statusBarForeground));
        m26690h.recycle();
        C7759x.m17562C0(this, new C4492a());
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes2.dex */
    public static class C4495d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f10969a;

        /* renamed from: b */
        Interpolator f10970b;

        public C4495d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10969a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.AppBarLayout_Layout);
            this.f10969a = obtainStyledAttributes.getInt(C9277l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C9277l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f10970b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C9277l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m27654a() {
            return this.f10969a;
        }

        /* renamed from: b */
        public Interpolator m27653b() {
            return this.f10970b;
        }

        /* renamed from: c */
        boolean m27652c() {
            int i = this.f10969a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C4495d(int i, int i2) {
            super(i, i2);
            this.f10969a = 1;
        }

        public C4495d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10969a = 1;
        }

        public C4495d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10969a = 1;
        }

        public C4495d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10969a = 1;
        }
    }
}
