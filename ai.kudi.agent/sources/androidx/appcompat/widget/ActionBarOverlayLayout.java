package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC1014m;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p227h.p228e.C7604b;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7751p;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7748m;
import p201g.p227h.p238l.InterfaceC7749n;
import p201g.p227h.p238l.InterfaceC7750o;
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1171y, InterfaceC7750o, InterfaceC7748m, InterfaceC7749n {

    /* renamed from: a0 */
    static final int[] f2999a0 = {C7452a.actionBarSize, 16842841};

    /* renamed from: A */
    private boolean f3000A;

    /* renamed from: B */
    private boolean f3001B;

    /* renamed from: C */
    boolean f3002C;

    /* renamed from: D */
    private int f3003D;

    /* renamed from: E */
    private int f3004E;

    /* renamed from: F */
    private final Rect f3005F;

    /* renamed from: G */
    private final Rect f3006G;

    /* renamed from: H */
    private final Rect f3007H;

    /* renamed from: I */
    private final Rect f3008I;

    /* renamed from: J */
    private final Rect f3009J;

    /* renamed from: K */
    private final Rect f3010K;

    /* renamed from: L */
    private final Rect f3011L;

    /* renamed from: M */
    private C7698g0 f3012M;

    /* renamed from: N */
    private C7698g0 f3013N;

    /* renamed from: O */
    private C7698g0 f3014O;

    /* renamed from: P */
    private C7698g0 f3015P;

    /* renamed from: Q */
    private InterfaceC1029d f3016Q;

    /* renamed from: R */
    private OverScroller f3017R;

    /* renamed from: S */
    ViewPropertyAnimator f3018S;

    /* renamed from: T */
    final AnimatorListenerAdapter f3019T;

    /* renamed from: U */
    private final Runnable f3020U;

    /* renamed from: V */
    private final Runnable f3021V;

    /* renamed from: W */
    private final C7751p f3022W;

    /* renamed from: c */
    private int f3023c;

    /* renamed from: d */
    private int f3024d;

    /* renamed from: e */
    private ContentFrameLayout f3025e;

    /* renamed from: f */
    ActionBarContainer f3026f;

    /* renamed from: w */
    private InterfaceC1173z f3027w;

    /* renamed from: x */
    private Drawable f3028x;

    /* renamed from: y */
    private boolean f3029y;

    /* renamed from: z */
    private boolean f3030z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes2.dex */
    class C1026a extends AnimatorListenerAdapter {
        C1026a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3018S = null;
            actionBarOverlayLayout.f3002C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3018S = null;
            actionBarOverlayLayout.f3002C = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes2.dex */
    class RunnableC1027b implements Runnable {
        RunnableC1027b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m37425o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3018S = actionBarOverlayLayout.f3026f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f3019T);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes2.dex */
    class RunnableC1028c implements Runnable {
        RunnableC1028c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m37425o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3018S = actionBarOverlayLayout.f3026f.animate().translationY(-ActionBarOverlayLayout.this.f3026f.getHeight()).setListener(ActionBarOverlayLayout.this.f3019T);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1029d {
        /* renamed from: a */
        void mo37417a();

        /* renamed from: b */
        void mo37416b();

        /* renamed from: c */
        void mo37415c(boolean z);

        /* renamed from: d */
        void mo37414d();

        /* renamed from: e */
        void mo37413e();

        /* renamed from: f */
        void mo37412f(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes2.dex */
    public static class C1030e extends ViewGroup.MarginLayoutParams {
        public C1030e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1030e(int i, int i2) {
            super(i, i2);
        }

        public C1030e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3024d = 0;
        this.f3005F = new Rect();
        this.f3006G = new Rect();
        this.f3007H = new Rect();
        this.f3008I = new Rect();
        this.f3009J = new Rect();
        this.f3010K = new Rect();
        this.f3011L = new Rect();
        C7698g0 c7698g0 = C7698g0.f18433b;
        this.f3012M = c7698g0;
        this.f3013N = c7698g0;
        this.f3014O = c7698g0;
        this.f3015P = c7698g0;
        this.f3019T = new C1026a();
        this.f3020U = new RunnableC1027b();
        this.f3021V = new RunnableC1028c();
        m37424p(context);
        this.f3022W = new C7751p(this);
    }

    /* renamed from: a */
    private void m37430a() {
        m37425o();
        this.f3021V.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m37429k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C1030e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m37429k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: n */
    private InterfaceC1173z m37426n(View view) {
        if (view instanceof InterfaceC1173z) {
            return (InterfaceC1173z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m37424p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2999a0);
        this.f3023c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3028x = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3029y = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3017R = new OverScroller(context);
    }

    /* renamed from: r */
    private void m37422r() {
        m37425o();
        postDelayed(this.f3021V, 600L);
    }

    /* renamed from: s */
    private void m37421s() {
        m37425o();
        postDelayed(this.f3020U, 600L);
    }

    /* renamed from: u */
    private void m37419u() {
        m37425o();
        this.f3020U.run();
    }

    /* renamed from: v */
    private boolean m37418v(float f) {
        this.f3017R.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f3017R.getFinalY() > this.f3026f.getHeight();
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: b */
    public void mo36901b(Menu menu, InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        m37420t();
        this.f3027w.mo36889b(menu, interfaceC1015a);
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: c */
    public boolean mo36900c() {
        m37420t();
        return this.f3027w.mo36888c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1030e;
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: d */
    public void mo36899d() {
        m37420t();
        this.f3027w.mo36887d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3028x == null || this.f3029y) {
            return;
        }
        int bottom = this.f3026f.getVisibility() == 0 ? (int) (this.f3026f.getBottom() + this.f3026f.getTranslationY() + 0.5f) : 0;
        this.f3028x.setBounds(0, bottom, getWidth(), this.f3028x.getIntrinsicHeight() + bottom);
        this.f3028x.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: e */
    public boolean mo36898e() {
        m37420t();
        return this.f3027w.mo36886e();
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: f */
    public boolean mo36897f() {
        m37420t();
        return this.f3027w.mo36885f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m37420t();
        boolean m37429k = m37429k(this.f3026f, rect, true, true, false, true);
        this.f3008I.set(rect);
        C1170x0.m36904a(this, this.f3008I, this.f3005F);
        if (!this.f3009J.equals(this.f3008I)) {
            this.f3009J.set(this.f3008I);
            m37429k = true;
        }
        if (!this.f3006G.equals(this.f3005F)) {
            this.f3006G.set(this.f3005F);
            m37429k = true;
        }
        if (m37429k) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: g */
    public boolean mo36896g() {
        m37420t();
        return this.f3027w.mo36884g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3026f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3022W.m17578a();
    }

    public CharSequence getTitle() {
        m37420t();
        return this.f3027w.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: h */
    public boolean mo36895h() {
        m37420t();
        return this.f3027w.mo36883h();
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: i */
    public void mo36894i(int i) {
        m37420t();
        if (i == 2) {
            this.f3027w.mo36867x();
        } else if (i == 5) {
            this.f3027w.mo36866y();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    /* renamed from: j */
    public void mo36893j() {
        m37420t();
        this.f3027w.mo36882i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C1030e generateDefaultLayoutParams() {
        return new C1030e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C1030e generateLayoutParams(AttributeSet attributeSet) {
        return new C1030e(getContext(), attributeSet);
    }

    /* renamed from: o */
    void m37425o() {
        removeCallbacks(this.f3020U);
        removeCallbacks(this.f3021V);
        ViewPropertyAnimator viewPropertyAnimator = this.f3018S;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m37420t();
        C7698g0 m17770x = C7698g0.m17770x(windowInsets, this);
        boolean m37429k = m37429k(this.f3026f, new Rect(m17770x.m17784j(), m17770x.m17782l(), m17770x.m17783k(), m17770x.m17785i()), true, true, false, true);
        C7759x.m17517g(this, m17770x, this.f3005F);
        Rect rect = this.f3005F;
        C7698g0 m17780n = m17770x.m17780n(rect.left, rect.top, rect.right, rect.bottom);
        this.f3012M = m17780n;
        boolean z = true;
        if (!this.f3013N.equals(m17780n)) {
            this.f3013N = this.f3012M;
            m37429k = true;
        }
        if (this.f3006G.equals(this.f3005F)) {
            z = m37429k;
        } else {
            this.f3006G.set(this.f3005F);
        }
        if (z) {
            requestLayout();
        }
        return m17770x.m17793a().m17791c().m17792b().m17772v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m37424p(getContext());
        C7759x.m17504m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m37425o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1030e c1030e = (C1030e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1030e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1030e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m37420t();
        measureChildWithMargins(this.f3026f, i, 0, i2, 0);
        C1030e c1030e = (C1030e) this.f3026f.getLayoutParams();
        int max = Math.max(0, this.f3026f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1030e).leftMargin + ((ViewGroup.MarginLayoutParams) c1030e).rightMargin);
        int max2 = Math.max(0, this.f3026f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1030e).topMargin + ((ViewGroup.MarginLayoutParams) c1030e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3026f.getMeasuredState());
        boolean z = (C7759x.m17542N(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f3023c;
            if (this.f3000A && this.f3026f.getTabContainer() != null) {
                measuredHeight += this.f3023c;
            }
        } else {
            measuredHeight = this.f3026f.getVisibility() != 8 ? this.f3026f.getMeasuredHeight() : 0;
        }
        this.f3007H.set(this.f3005F);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3014O = this.f3012M;
        } else {
            this.f3010K.set(this.f3008I);
        }
        if (!this.f3030z && !z) {
            Rect rect = this.f3007H;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f3014O = this.f3014O.m17780n(0, measuredHeight, 0, 0);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            C7604b m18064b = C7604b.m18064b(this.f3014O.m17784j(), this.f3014O.m17782l() + measuredHeight, this.f3014O.m17783k(), this.f3014O.m17785i() + 0);
            C7698g0.C7700b c7700b = new C7698g0.C7700b(this.f3014O);
            c7700b.m17766c(m18064b);
            this.f3014O = c7700b.m17768a();
        } else {
            Rect rect2 = this.f3010K;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m37429k(this.f3025e, this.f3007H, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.f3015P.equals(this.f3014O)) {
            C7698g0 c7698g0 = this.f3014O;
            this.f3015P = c7698g0;
            C7759x.m17515h(this.f3025e, c7698g0);
        } else if (Build.VERSION.SDK_INT < 21 && !this.f3011L.equals(this.f3010K)) {
            this.f3011L.set(this.f3010K);
            this.f3025e.m37389a(this.f3010K);
        }
        measureChildWithMargins(this.f3025e, i, 0, i2, 0);
        C1030e c1030e2 = (C1030e) this.f3025e.getLayoutParams();
        int max3 = Math.max(max, this.f3025e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1030e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1030e2).rightMargin);
        int max4 = Math.max(max2, this.f3025e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1030e2).topMargin + ((ViewGroup.MarginLayoutParams) c1030e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3025e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f3001B && z) {
            if (m37418v(f2)) {
                m37430a();
            } else {
                m37419u();
            }
            this.f3002C = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7749n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m37420t();
        int i2 = this.f3004E ^ i;
        this.f3004E = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1029d interfaceC1029d = this.f3016Q;
        if (interfaceC1029d != null) {
            interfaceC1029d.mo37415c(!z2);
            if (!z && z2) {
                this.f3016Q.mo37414d();
            } else {
                this.f3016Q.mo37417a();
            }
        }
        if ((i2 & 256) == 0 || this.f3016Q == null) {
            return;
        }
        C7759x.m17504m0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f3024d = i;
        InterfaceC1029d interfaceC1029d = this.f3016Q;
        if (interfaceC1029d != null) {
            interfaceC1029d.mo37412f(i);
        }
    }

    /* renamed from: q */
    public boolean m37423q() {
        return this.f3030z;
    }

    public void setActionBarHideOffset(int i) {
        m37425o();
        this.f3026f.setTranslationY(-Math.max(0, Math.min(i, this.f3026f.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1029d interfaceC1029d) {
        this.f3016Q = interfaceC1029d;
        if (getWindowToken() != null) {
            this.f3016Q.mo37412f(this.f3024d);
            int i = this.f3004E;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C7759x.m17504m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f3000A = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f3001B) {
            this.f3001B = z;
            if (z) {
                return;
            }
            m37425o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m37420t();
        this.f3027w.setIcon(i);
    }

    public void setLogo(int i) {
        m37420t();
        this.f3027w.mo36877n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f3030z = z;
        this.f3029y = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    public void setWindowCallback(Window.Callback callback) {
        m37420t();
        this.f3027w.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC1171y
    public void setWindowTitle(CharSequence charSequence) {
        m37420t();
        this.f3027w.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    void m37420t() {
        if (this.f3025e == null) {
            this.f3025e = (ContentFrameLayout) findViewById(C7457f.action_bar_activity_content);
            this.f3026f = (ActionBarContainer) findViewById(C7457f.action_bar_container);
            this.f3027w = m37426n(findViewById(C7457f.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1030e(layoutParams);
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3022W.m17577b(view, view2, i);
        this.f3003D = getActionBarHideOffset();
        m37425o();
        InterfaceC1029d interfaceC1029d = this.f3016Q;
        if (interfaceC1029d != null) {
            interfaceC1029d.mo37413e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f3026f.getVisibility() != 0) {
            return false;
        }
        return this.f3001B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onStopNestedScroll(View view) {
        if (this.f3001B && !this.f3002C) {
            if (this.f3003D <= this.f3026f.getHeight()) {
                m37421s();
            } else {
                m37422r();
            }
        }
        InterfaceC1029d interfaceC1029d = this.f3016Q;
        if (interfaceC1029d != null) {
            interfaceC1029d.mo37416b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f3003D + i2;
        this.f3003D = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        m37420t();
        this.f3027w.setIcon(drawable);
    }
}
