package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0999g;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p202a.C7458g;
import p201g.p202a.C7461j;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class ActionBarContextView extends AbstractC1066a {

    /* renamed from: A */
    private CharSequence f2986A;

    /* renamed from: B */
    private CharSequence f2987B;

    /* renamed from: C */
    private View f2988C;

    /* renamed from: D */
    private View f2989D;

    /* renamed from: E */
    private View f2990E;

    /* renamed from: F */
    private LinearLayout f2991F;

    /* renamed from: G */
    private TextView f2992G;

    /* renamed from: H */
    private TextView f2993H;

    /* renamed from: I */
    private int f2994I;

    /* renamed from: J */
    private int f2995J;

    /* renamed from: K */
    private boolean f2996K;

    /* renamed from: L */
    private int f2997L;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC1025a implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ AbstractC7485b f2998c;

        View$OnClickListenerC1025a(ActionBarContextView actionBarContextView, AbstractC7485b abstractC7485b) {
            this.f2998c = abstractC7485b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f2998c.mo18590c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m37434i() {
        if (this.f2991F == null) {
            LayoutInflater.from(getContext()).inflate(C7458g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2991F = linearLayout;
            this.f2992G = (TextView) linearLayout.findViewById(C7457f.action_bar_title);
            this.f2993H = (TextView) this.f2991F.findViewById(C7457f.action_bar_subtitle);
            if (this.f2994I != 0) {
                this.f2992G.setTextAppearance(getContext(), this.f2994I);
            }
            if (this.f2995J != 0) {
                this.f2993H.setTextAppearance(getContext(), this.f2995J);
            }
        }
        this.f2992G.setText(this.f2986A);
        this.f2993H.setText(this.f2987B);
        boolean z = !TextUtils.isEmpty(this.f2986A);
        boolean z2 = !TextUtils.isEmpty(this.f2987B);
        int i = 0;
        this.f2993H.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2991F;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f2991F.getParent() == null) {
            addView(this.f2991F);
        }
    }

    /* renamed from: g */
    public void m37436g() {
        if (this.f2988C == null) {
            m37432k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1066a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1066a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2987B;
    }

    public CharSequence getTitle() {
        return this.f2986A;
    }

    /* renamed from: h */
    public void m37435h(AbstractC7485b abstractC7485b) {
        View view = this.f2988C;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f2997L, (ViewGroup) this, false);
            this.f2988C = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f2988C);
        }
        View findViewById = this.f2988C.findViewById(C7457f.action_mode_close_button);
        this.f2989D = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC1025a(this, abstractC7485b));
        C0999g c0999g = (C0999g) abstractC7485b.mo18588e();
        C1073c c1073c = this.f3224f;
        if (c1073c != null) {
            c1073c.m37265B();
        }
        C1073c c1073c2 = new C1073c(getContext());
        this.f3224f = c1073c2;
        c1073c2.m37254M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0999g.m37532c(this.f3224f, this.f3222d);
        ActionMenuView actionMenuView = (ActionMenuView) this.f3224f.mo37249p(this);
        this.f3223e = actionMenuView;
        C7759x.m17492s0(actionMenuView, null);
        addView(this.f3223e, layoutParams);
    }

    /* renamed from: j */
    public boolean m37433j() {
        return this.f2996K;
    }

    /* renamed from: k */
    public void m37432k() {
        removeAllViews();
        this.f2990E = null;
        this.f3223e = null;
        this.f3224f = null;
        View view = this.f2989D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m37431l() {
        C1073c c1073c = this.f3224f;
        if (c1073c != null) {
            return c1073c.m37253N();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1073c c1073c = this.f3224f;
        if (c1073c != null) {
            c1073c.m37262E();
            this.f3224f.m37261F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2986A);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m36903b = C1170x0.m36903b(this);
        int paddingRight = m36903b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2988C;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2988C.getLayoutParams();
            int i5 = m36903b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m36903b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m37289d = AbstractC1066a.m37289d(paddingRight, i5, m36903b);
            paddingRight = AbstractC1066a.m37289d(m37289d + m37288e(this.f2988C, m37289d, paddingTop, paddingTop2, m36903b), i6, m36903b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f2991F;
        if (linearLayout != null && this.f2990E == null && linearLayout.getVisibility() != 8) {
            i7 += m37288e(this.f2991F, i7, paddingTop, paddingTop2, m36903b);
        }
        int i8 = i7;
        View view2 = this.f2990E;
        if (view2 != null) {
            m37288e(view2, i8, paddingTop, paddingTop2, m36903b);
        }
        int paddingLeft = m36903b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3223e;
        if (actionMenuView != null) {
            m37288e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m36903b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i3 = this.f3225w;
                if (i3 <= 0) {
                    i3 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i4 = i3 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                View view = this.f2988C;
                if (view != null) {
                    int m37290c = m37290c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2988C.getLayoutParams();
                    paddingLeft = m37290c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f3223e;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m37290c(this.f3223e, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f2991F;
                if (linearLayout != null && this.f2990E == null) {
                    if (this.f2996K) {
                        this.f2991F.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f2991F.getMeasuredWidth();
                        boolean z = measuredWidth <= paddingLeft;
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        this.f2991F.setVisibility(z ? 0 : 8);
                    } else {
                        paddingLeft = m37290c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f2990E;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                    int i6 = layoutParams.width;
                    if (i6 >= 0) {
                        paddingLeft = Math.min(i6, paddingLeft);
                    }
                    int i7 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
                    int i8 = layoutParams.height;
                    if (i8 >= 0) {
                        i4 = Math.min(i8, i4);
                    }
                    this.f2990E.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i7));
                }
                if (this.f3225w <= 0) {
                    int childCount = getChildCount();
                    int i9 = 0;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i9) {
                            i9 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i9);
                    return;
                }
                setMeasuredDimension(size, i3);
                return;
            }
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC1066a
    public void setContentHeight(int i) {
        this.f3225w = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2990E;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2990E = view;
        if (view != null && (linearLayout = this.f2991F) != null) {
            removeView(linearLayout);
            this.f2991F = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2987B = charSequence;
        m37434i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2986A = charSequence;
        m37434i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2996K) {
            requestLayout();
        }
        this.f2996K = z;
    }

    @Override // androidx.appcompat.widget.AbstractC1066a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.ActionMode, i, 0);
        C7759x.m17492s0(this, m37026v.m37041g(C7461j.ActionMode_background));
        this.f2994I = m37026v.m37034n(C7461j.ActionMode_titleTextStyle, 0);
        this.f2995J = m37026v.m37034n(C7461j.ActionMode_subtitleTextStyle, 0);
        this.f3225w = m37026v.m37035m(C7461j.ActionMode_height, 0);
        this.f2997L = m37026v.m37034n(C7461j.ActionMode_closeItemLayout, C7458g.abc_action_mode_close_item_material);
        m37026v.m37025w();
    }
}
