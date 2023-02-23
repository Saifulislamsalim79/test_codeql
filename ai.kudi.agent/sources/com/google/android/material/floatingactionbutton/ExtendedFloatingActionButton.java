package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4661c;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p328m.C9285h;
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC1279b {

    /* renamed from: K */
    private int f11506K;

    /* renamed from: L */
    private final InterfaceC4652d f11507L;

    /* renamed from: M */
    private final InterfaceC4652d f11508M;

    /* renamed from: N */
    private final InterfaceC4652d f11509N;

    /* renamed from: O */
    private final InterfaceC4652d f11510O;

    /* renamed from: P */
    private final int f11511P;

    /* renamed from: Q */
    private final CoordinatorLayout.AbstractC1280c<ExtendedFloatingActionButton> f11512Q;

    /* renamed from: R */
    private boolean f11513R;

    /* renamed from: S */
    private boolean f11514S;

    /* renamed from: T */
    private boolean f11515T;

    /* renamed from: U */
    protected ColorStateList f11516U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes2.dex */
    public class C4624a extends AnimatorListenerAdapter {

        /* renamed from: c */
        private boolean f11522c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC4652d f11523d;

        /* renamed from: e */
        final /* synthetic */ AbstractC4629f f11524e;

        C4624a(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC4652d interfaceC4652d, AbstractC4629f abstractC4629f) {
            this.f11523d = interfaceC4652d;
            this.f11524e = abstractC4629f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11522c = true;
            this.f11523d.m26872a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11523d.m26868e();
            if (this.f11522c) {
                return;
            }
            this.f11523d.m26864i(this.f11524e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11523d.onAnimationStart(animator);
            this.f11522c = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes2.dex */
    static class C4625b extends Property<View, Float> {
        C4625b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes2.dex */
    static class C4626c extends Property<View, Float> {
        C4626c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes2.dex */
    static class C4627d extends Property<View, Float> {
        C4627d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C7759x.m17551I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C7759x.m17560D0(view, f.intValue(), view.getPaddingTop(), C7759x.m17553H(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes2.dex */
    static class C4628e extends Property<View, Float> {
        C4628e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C7759x.m17553H(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C7759x.m17560D0(view, C7759x.m17551I(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4629f {
    }

    static {
        new C4625b(Float.class, "width");
        new C4626c(Float.class, "height");
        new C4627d(Float.class, "paddingStart");
        new C4628e(Float.class, "paddingEnd");
    }

    /* renamed from: q */
    private boolean m26999q() {
        return getVisibility() != 0 ? this.f11506K == 2 : this.f11506K != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m26998r(InterfaceC4652d interfaceC4652d, AbstractC4629f abstractC4629f) {
        if (interfaceC4652d.m26869d()) {
            return;
        }
        if (!m26996t()) {
            interfaceC4652d.m26871b();
            interfaceC4652d.m26864i(abstractC4629f);
            return;
        }
        measure(0, 0);
        AnimatorSet m26866g = interfaceC4652d.m26866g();
        m26866g.addListener(new C4624a(this, interfaceC4652d, abstractC4629f));
        for (Animator.AnimatorListener animatorListener : interfaceC4652d.m26865h()) {
            m26866g.addListener(animatorListener);
        }
        m26866g.start();
    }

    /* renamed from: s */
    private void m26997s() {
        this.f11516U = getTextColors();
    }

    /* renamed from: t */
    private boolean m26996t() {
        return (C7759x.m17535U(this) || (!m26999q() && this.f11515T)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1279b
    public CoordinatorLayout.AbstractC1280c<ExtendedFloatingActionButton> getBehavior() {
        return this.f11512Q;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i = this.f11511P;
        return i < 0 ? (Math.min(C7759x.m17551I(this), C7759x.m17553H(this)) * 2) + getIconSize() : i;
    }

    public C9285h getExtendMotionSpec() {
        return this.f11508M.m26870c();
    }

    public C9285h getHideMotionSpec() {
        return this.f11510O.m26870c();
    }

    public C9285h getShowMotionSpec() {
        return this.f11509N.m26870c();
    }

    public C9285h getShrinkMotionSpec() {
        return this.f11507L.m26870c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11513R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f11513R = false;
            this.f11507L.m26871b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f11515T = z;
    }

    public void setExtendMotionSpec(C9285h c9285h) {
        this.f11508M.m26867f(c9285h);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C9285h.m15223c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f11513R == z) {
            return;
        }
        InterfaceC4652d interfaceC4652d = z ? this.f11508M : this.f11507L;
        if (interfaceC4652d.m26869d()) {
            return;
        }
        interfaceC4652d.m26871b();
    }

    public void setHideMotionSpec(C9285h c9285h) {
        this.f11510O.m26867f(c9285h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C9285h.m15223c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f11513R || this.f11514S) {
            return;
        }
        C7759x.m17551I(this);
        C7759x.m17553H(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f11513R) {
            boolean z = this.f11514S;
        }
    }

    public void setShowMotionSpec(C9285h c9285h) {
        this.f11509N.m26867f(c9285h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C9285h.m15223c(getContext(), i));
    }

    public void setShrinkMotionSpec(C9285h c9285h) {
        this.f11507L.m26867f(c9285h);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C9285h.m15223c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m26997s();
    }

    /* loaded from: classes2.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC1280c<T> {

        /* renamed from: a */
        private Rect f11517a;

        /* renamed from: b */
        private AbstractC4629f f11518b;

        /* renamed from: c */
        private AbstractC4629f f11519c;

        /* renamed from: d */
        private boolean f11520d;

        /* renamed from: e */
        private boolean f11521e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f11520d = false;
            this.f11521e = true;
        }

        /* renamed from: G */
        private static boolean m26993G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1283f) {
                return ((CoordinatorLayout.C1283f) layoutParams).m36505f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m26990J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f11520d || this.f11521e) && ((CoordinatorLayout.C1283f) extendedFloatingActionButton.getLayoutParams()).m36506e() == view.getId();
        }

        /* renamed from: L */
        private boolean m26988L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m26990J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f11517a == null) {
                    this.f11517a = new Rect();
                }
                Rect rect = this.f11517a;
                C4661c.m26786a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    m26989K(extendedFloatingActionButton);
                    return true;
                }
                m26995E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: M */
        private boolean m26987M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m26990J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1283f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    m26989K(extendedFloatingActionButton);
                    return true;
                }
                m26995E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: E */
        protected void m26995E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m26998r(this.f11521e ? extendedFloatingActionButton.f11508M : extendedFloatingActionButton.f11509N, this.f11521e ? this.f11519c : this.f11518b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: F */
        public boolean mo26949b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo26949b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: H */
        public boolean mo26207h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m26988L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m26993G(view)) {
                m26987M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: I */
        public boolean mo26206l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> m36537l = coordinatorLayout.m36537l(extendedFloatingActionButton);
            int size = m36537l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m36537l.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m26988L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m26993G(view) && m26987M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m36564C(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: K */
        protected void m26989K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m26998r(this.f11521e ? extendedFloatingActionButton.f11507L : extendedFloatingActionButton.f11510O, this.f11521e ? this.f11519c : this.f11518b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: g */
        public void mo26183g(CoordinatorLayout.C1283f c1283f) {
            if (c1283f.f4031h == 0) {
                c1283f.f4031h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f11520d = obtainStyledAttributes.getBoolean(C9277l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f11521e = obtainStyledAttributes.getBoolean(C9277l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m26997s();
    }
}
