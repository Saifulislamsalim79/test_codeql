package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C4657a;
import com.google.android.material.internal.C4661c;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import p201g.p202a.C7460i;
import p201g.p227h.p233h.C7628a;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7752q;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: P */
    private static final int f10971P = C9276k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    private int f10972A;

    /* renamed from: B */
    private final Rect f10973B;

    /* renamed from: C */
    final C4657a f10974C;

    /* renamed from: D */
    private boolean f10975D;

    /* renamed from: E */
    private boolean f10976E;

    /* renamed from: F */
    private Drawable f10977F;

    /* renamed from: G */
    Drawable f10978G;

    /* renamed from: H */
    private int f10979H;

    /* renamed from: I */
    private boolean f10980I;

    /* renamed from: J */
    private ValueAnimator f10981J;

    /* renamed from: K */
    private long f10982K;

    /* renamed from: L */
    private int f10983L;

    /* renamed from: M */
    private AppBarLayout.InterfaceC4496e f10984M;

    /* renamed from: N */
    int f10985N;

    /* renamed from: O */
    C7698g0 f10986O;

    /* renamed from: c */
    private boolean f10987c;

    /* renamed from: d */
    private int f10988d;

    /* renamed from: e */
    private ViewGroup f10989e;

    /* renamed from: f */
    private View f10990f;

    /* renamed from: w */
    private View f10991w;

    /* renamed from: x */
    private int f10992x;

    /* renamed from: y */
    private int f10993y;

    /* renamed from: z */
    private int f10994z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    /* loaded from: classes2.dex */
    class C4497a implements InterfaceC7752q {
        C4497a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            return CollapsingToolbarLayout.this.m27640l(c7698g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes2.dex */
    public class C4498b implements ValueAnimator.AnimatorUpdateListener {
        C4498b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    /* loaded from: classes2.dex */
    private class C4500d implements AppBarLayout.InterfaceC4496e {
        C4500d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f10985N = i;
            C7698g0 c7698g0 = collapsingToolbarLayout.f10986O;
            int m17782l = c7698g0 != null ? c7698g0.m17782l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                C4499c c4499c = (C4499c) childAt.getLayoutParams();
                C4505d m27643i = CollapsingToolbarLayout.m27643i(childAt);
                int i3 = c4499c.f10997a;
                if (i3 == 1) {
                    m27643i.m27603f(C7628a.m17971b(-i, 0, CollapsingToolbarLayout.this.m27645g(childAt)));
                } else if (i3 == 2) {
                    m27643i.m27603f(Math.round((-i) * c4499c.f10998b));
                }
            }
            CollapsingToolbarLayout.this.m27635q();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f10978G != null && m17782l > 0) {
                C7759x.m17516g0(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f10974C.m26818d0(Math.abs(i) / ((CollapsingToolbarLayout.this.getHeight() - C7759x.m17561D(CollapsingToolbarLayout.this)) - m17782l));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.collapsingToolbarLayoutStyle);
    }

    /* renamed from: a */
    private void m27651a(int i) {
        m27650b();
        ValueAnimator valueAnimator = this.f10981J;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f10981J = valueAnimator2;
            valueAnimator2.setDuration(this.f10982K);
            this.f10981J.setInterpolator(i > this.f10979H ? C9278a.f21808c : C9278a.f21809d);
            this.f10981J.addUpdateListener(new C4498b());
        } else if (valueAnimator.isRunning()) {
            this.f10981J.cancel();
        }
        this.f10981J.setIntValues(this.f10979H, i);
        this.f10981J.start();
    }

    /* renamed from: b */
    private void m27650b() {
        if (this.f10987c) {
            ViewGroup viewGroup = null;
            this.f10989e = null;
            this.f10990f = null;
            int i = this.f10988d;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f10989e = viewGroup2;
                if (viewGroup2 != null) {
                    this.f10990f = m27649c(viewGroup2);
                }
            }
            if (this.f10989e == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (m27642j(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.f10989e = viewGroup;
            }
            m27636p();
            this.f10987c = false;
        }
    }

    /* renamed from: c */
    private View m27649c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    /* renamed from: f */
    private static int m27646f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: h */
    private static CharSequence m27644h(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (Build.VERSION.SDK_INT < 21 || !(view instanceof android.widget.Toolbar)) {
            return null;
        }
        return ((android.widget.Toolbar) view).getTitle();
    }

    /* renamed from: i */
    static C4505d m27643i(View view) {
        C4505d c4505d = (C4505d) view.getTag(C9271f.view_offset_helper);
        if (c4505d == null) {
            C4505d c4505d2 = new C4505d(view);
            view.setTag(C9271f.view_offset_helper, c4505d2);
            return c4505d2;
        }
        return c4505d;
    }

    /* renamed from: j */
    private static boolean m27642j(View view) {
        return (view instanceof Toolbar) || (Build.VERSION.SDK_INT >= 21 && (view instanceof android.widget.Toolbar));
    }

    /* renamed from: k */
    private boolean m27641k(View view) {
        View view2 = this.f10990f;
        if (view2 == null || view2 == this) {
            if (view == this.f10989e) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m27638n(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f10990f;
        if (view == null) {
            view = this.f10989e;
        }
        int m27645g = m27645g(view);
        C4661c.m26786a(this, this.f10991w, this.f10973B);
        ViewGroup viewGroup = this.f10989e;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i3 = toolbar.getTitleMarginTop();
            i = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i3 = toolbar2.getTitleMarginTop();
            i = toolbar2.getTitleMarginBottom();
        }
        C4657a c4657a = this.f10974C;
        int i5 = this.f10973B.left + (z ? i2 : i4);
        Rect rect = this.f10973B;
        int i6 = rect.top + m27645g + i3;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        c4657a.m26839M(i5, i6, i7 - i4, (this.f10973B.bottom + m27645g) - i);
    }

    /* renamed from: o */
    private void m27637o() {
        setContentDescription(getTitle());
    }

    /* renamed from: p */
    private void m27636p() {
        View view;
        if (!this.f10975D && (view = this.f10991w) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f10991w);
            }
        }
        if (!this.f10975D || this.f10989e == null) {
            return;
        }
        if (this.f10991w == null) {
            this.f10991w = new View(getContext());
        }
        if (this.f10991w.getParent() == null) {
            this.f10989e.addView(this.f10991w, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4499c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d */
    public C4499c generateDefaultLayoutParams() {
        return new C4499c(-1, -1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m27650b();
        if (this.f10989e == null && (drawable = this.f10977F) != null && this.f10979H > 0) {
            drawable.mutate().setAlpha(this.f10979H);
            this.f10977F.draw(canvas);
        }
        if (this.f10975D && this.f10976E) {
            this.f10974C.m26807j(canvas);
        }
        if (this.f10978G == null || this.f10979H <= 0) {
            return;
        }
        C7698g0 c7698g0 = this.f10986O;
        int m17782l = c7698g0 != null ? c7698g0.m17782l() : 0;
        if (m17782l > 0) {
            this.f10978G.setBounds(0, -this.f10985N, getWidth(), m17782l - this.f10985N);
            this.f10978G.mutate().setAlpha(this.f10979H);
            this.f10978G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f10977F == null || this.f10979H <= 0 || !m27641k(view)) {
            z = false;
        } else {
            this.f10977F.mutate().setAlpha(this.f10979H);
            this.f10977F.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10978G;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f10977F;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C4657a c4657a = this.f10974C;
        if (c4657a != null) {
            z |= c4657a.m26810h0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4499c(layoutParams);
    }

    /* renamed from: g */
    final int m27645g(View view) {
        return ((getHeight() - m27643i(view).m27607b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((C4499c) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f10974C.m26799o();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f10974C.m26795s();
    }

    public Drawable getContentScrim() {
        return this.f10977F;
    }

    public int getExpandedTitleGravity() {
        return this.f10974C.m26791w();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f10972A;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f10994z;
    }

    public int getExpandedTitleMarginStart() {
        return this.f10992x;
    }

    public int getExpandedTitleMarginTop() {
        return this.f10993y;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f10974C.m26789y();
    }

    public int getMaxLines() {
        return this.f10974C.m26851A();
    }

    int getScrimAlpha() {
        return this.f10979H;
    }

    public long getScrimAnimationDuration() {
        return this.f10982K;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f10983L;
        if (i >= 0) {
            return i;
        }
        C7698g0 c7698g0 = this.f10986O;
        int m17782l = c7698g0 != null ? c7698g0.m17782l() : 0;
        int m17561D = C7759x.m17561D(this);
        if (m17561D > 0) {
            return Math.min((m17561D * 2) + m17782l, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f10978G;
    }

    public CharSequence getTitle() {
        if (this.f10975D) {
            return this.f10974C.m26850B();
        }
        return null;
    }

    /* renamed from: l */
    C7698g0 m27640l(C7698g0 c7698g0) {
        C7698g0 c7698g02 = C7759x.m17479z(this) ? c7698g0 : null;
        if (!C7670c.m17875a(this.f10986O, c7698g02)) {
            this.f10986O = c7698g02;
            requestLayout();
        }
        return c7698g0.m17791c();
    }

    /* renamed from: m */
    public void m27639m(boolean z, boolean z2) {
        if (this.f10980I != z) {
            if (z2) {
                m27651a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f10980I = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C7759x.m17482x0(this, C7759x.m17479z((View) parent));
            if (this.f10984M == null) {
                this.f10984M = new C4500d();
            }
            ((AppBarLayout) parent).m27717b(this.f10984M);
            C7759x.m17504m0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC4496e interfaceC4496e = this.f10984M;
        if (interfaceC4496e != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m27703p(interfaceC4496e);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C7698g0 c7698g0 = this.f10986O;
        if (c7698g0 != null) {
            int m17782l = c7698g0.m17782l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C7759x.m17479z(childAt) && childAt.getTop() < m17782l) {
                    C7759x.m17528a0(childAt, m17782l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m27643i(getChildAt(i6)).m27605d();
        }
        if (this.f10975D && (view = this.f10991w) != null) {
            boolean z2 = C7759x.m17536T(view) && this.f10991w.getVisibility() == 0;
            this.f10976E = z2;
            if (z2) {
                boolean z3 = C7759x.m17563C(this) == 1;
                m27638n(z3);
                this.f10974C.m26831U(z3 ? this.f10994z : this.f10992x, this.f10973B.top + this.f10993y, (i3 - i) - (z3 ? this.f10992x : this.f10994z), (i4 - i2) - this.f10972A);
                this.f10974C.m26841K();
            }
        }
        if (this.f10989e != null && this.f10975D && TextUtils.isEmpty(this.f10974C.m26850B())) {
            setTitle(m27644h(this.f10989e));
        }
        m27635q();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m27643i(getChildAt(i7)).m27608a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m27650b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C7698g0 c7698g0 = this.f10986O;
        int m17782l = c7698g0 != null ? c7698g0.m17782l() : 0;
        if (mode == 0 && m17782l > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m17782l, 1073741824));
        }
        if (this.f10989e != null) {
            View view = this.f10990f;
            if (view != null && view != this) {
                setMinimumHeight(m27646f(view));
            } else {
                setMinimumHeight(m27646f(this.f10989e));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f10977F;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: q */
    final void m27635q() {
        if (this.f10977F == null && this.f10978G == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f10985N < getScrimVisibleHeightTrigger());
    }

    public void setCollapsedTitleGravity(int i) {
        this.f10974C.m26834R(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f10974C.m26837O(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f10974C.m26833S(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f10977F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f10977F = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.f10977F.setCallback(this);
                this.f10977F.setAlpha(this.f10979H);
            }
            C7759x.m17516g0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C1335a.m36322f(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f10974C.m26826Z(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f10972A = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f10994z = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f10992x = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f10993y = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f10974C.m26829W(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f10974C.m26827Y(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f10974C.m26822b0(typeface);
    }

    public void setMaxLines(int i) {
        this.f10974C.m26814f0(i);
    }

    void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f10979H) {
            if (this.f10977F != null && (viewGroup = this.f10989e) != null) {
                C7759x.m17516g0(viewGroup);
            }
            this.f10979H = i;
            C7759x.m17516g0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f10982K = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f10983L != i) {
            this.f10983L = i;
            m27635q();
        }
    }

    public void setScrimsShown(boolean z) {
        m27639m(z, C7759x.m17535U(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f10978G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f10978G = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f10978G.setState(getDrawableState());
                }
                C1365a.m36189m(this.f10978G, C7759x.m17563C(this));
                this.f10978G.setVisible(getVisibility() == 0, false);
                this.f10978G.setCallback(this);
                this.f10978G.setAlpha(this.f10979H);
            }
            C7759x.m17516g0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C1335a.m36322f(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f10974C.m26808i0(charSequence);
        m27637o();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f10975D) {
            this.f10975D = z;
            m27637o();
            m27636p();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f10978G;
        if (drawable != null && drawable.isVisible() != z) {
            this.f10978G.setVisible(z, false);
        }
        Drawable drawable2 = this.f10977F;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f10977F.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10977F || drawable == this.f10978G;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f10971P), attributeSet, i);
        this.f10987c = true;
        this.f10973B = new Rect();
        this.f10983L = -1;
        Context context2 = getContext();
        C4657a c4657a = new C4657a(this);
        this.f10974C = c4657a;
        c4657a.m26806j0(C9278a.f21810e);
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.CollapsingToolbarLayout, i, f10971P, new int[0]);
        this.f10974C.m26826Z(m26690h.getInt(C9277l.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f10974C.m26834R(m26690h.getInt(C9277l.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f10972A = dimensionPixelSize;
        this.f10994z = dimensionPixelSize;
        this.f10993y = dimensionPixelSize;
        this.f10992x = dimensionPixelSize;
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f10992x = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f10994z = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f10993y = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f10972A = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f10975D = m26690h.getBoolean(C9277l.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(m26690h.getText(C9277l.CollapsingToolbarLayout_title));
        this.f10974C.m26829W(C9276k.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f10974C.m26837O(C7460i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f10974C.m26829W(m26690h.getResourceId(C9277l.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f10974C.m26837O(m26690h.getResourceId(C9277l.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f10983L = m26690h.getDimensionPixelSize(C9277l.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (m26690h.hasValue(C9277l.CollapsingToolbarLayout_maxLines)) {
            this.f10974C.m26814f0(m26690h.getInt(C9277l.CollapsingToolbarLayout_maxLines, 1));
        }
        this.f10982K = m26690h.getInt(C9277l.CollapsingToolbarLayout_scrimAnimationDuration, IjkMediaCodecInfo.RANK_LAST_CHANCE);
        setContentScrim(m26690h.getDrawable(C9277l.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(m26690h.getDrawable(C9277l.CollapsingToolbarLayout_statusBarScrim));
        this.f10988d = m26690h.getResourceId(C9277l.CollapsingToolbarLayout_toolbarId, -1);
        m26690h.recycle();
        setWillNotDraw(false);
        C7759x.m17562C0(this, new C4497a());
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f10974C.m26835Q(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4499c(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes2.dex */
    public static class C4499c extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f10997a;

        /* renamed from: b */
        float f10998b;

        public C4499c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10997a = 0;
            this.f10998b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.CollapsingToolbarLayout_Layout);
            this.f10997a = obtainStyledAttributes.getInt(C9277l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m27634a(obtainStyledAttributes.getFloat(C9277l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m27634a(float f) {
            this.f10998b = f;
        }

        public C4499c(int i, int i2) {
            super(i, i2);
            this.f10997a = 0;
            this.f10998b = 0.5f;
        }

        public C4499c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10997a = 0;
            this.f10998b = 0.5f;
        }
    }
}
