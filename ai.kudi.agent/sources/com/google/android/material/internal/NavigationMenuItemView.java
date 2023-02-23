package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.C1155t0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.p057e.C1355f;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import p201g.p202a.C7452a;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends C4663e implements InterfaceC1016n.InterfaceC1017a {

    /* renamed from: a0 */
    private static final int[] f11629a0 = {16842912};

    /* renamed from: N */
    private int f11630N;

    /* renamed from: O */
    private boolean f11631O;

    /* renamed from: P */
    boolean f11632P;

    /* renamed from: Q */
    private final CheckedTextView f11633Q;

    /* renamed from: R */
    private FrameLayout f11634R;

    /* renamed from: S */
    private C1003i f11635S;

    /* renamed from: T */
    private ColorStateList f11636T;

    /* renamed from: U */
    private boolean f11637U;

    /* renamed from: V */
    private Drawable f11638V;

    /* renamed from: W */
    private final C7676a f11639W;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes2.dex */
    class C4656a extends C7676a {
        C4656a() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17696Y(NavigationMenuItemView.this.f11632P);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m26858B() {
        if (m26855E()) {
            this.f11633Q.setVisibility(8);
            FrameLayout frameLayout = this.f11634R;
            if (frameLayout != null) {
                LinearLayoutCompat.C1037a c1037a = (LinearLayoutCompat.C1037a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1037a).width = -1;
                this.f11634R.setLayoutParams(c1037a);
                return;
            }
            return;
        }
        this.f11633Q.setVisibility(0);
        FrameLayout frameLayout2 = this.f11634R;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C1037a c1037a2 = (LinearLayoutCompat.C1037a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1037a2).width = -2;
            this.f11634R.setLayoutParams(c1037a2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m26857C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C7452a.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f11629a0, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: E */
    private boolean m26855E() {
        return this.f11635S.getTitle() == null && this.f11635S.getIcon() == null && this.f11635S.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f11634R == null) {
                this.f11634R = (FrameLayout) ((ViewStub) findViewById(C9271f.design_menu_item_action_area_stub)).inflate();
            }
            this.f11634R.removeAllViews();
            this.f11634R.addView(view);
        }
    }

    /* renamed from: D */
    public void m26856D() {
        FrameLayout frameLayout = this.f11634R;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f11633Q.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: d */
    public boolean mo26854d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: e */
    public void mo26853e(C1003i c1003i, int i) {
        this.f11635S = c1003i;
        if (c1003i.getItemId() > 0) {
            setId(c1003i.getItemId());
        }
        setVisibility(c1003i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C7759x.m17492s0(this, m26857C());
        }
        setCheckable(c1003i.isCheckable());
        setChecked(c1003i.isChecked());
        setEnabled(c1003i.isEnabled());
        setTitle(c1003i.getTitle());
        setIcon(c1003i.getIcon());
        setActionView(c1003i.getActionView());
        setContentDescription(c1003i.getContentDescription());
        C1155t0.m36986a(this, c1003i.getTooltipText());
        m26858B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    public C1003i getItemData() {
        return this.f11635S;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1003i c1003i = this.f11635S;
        if (c1003i != null && c1003i.isCheckable() && this.f11635S.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f11629a0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f11632P != z) {
            this.f11632P = z;
            this.f11639W.mo17856l(this.f11633Q, IjkMediaMeta.FF_PROFILE_H264_INTRA);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f11633Q.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f11637U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1365a.m36184r(drawable).mutate();
                C1365a.m36187o(drawable, this.f11636T);
            }
            int i = this.f11630N;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f11631O) {
            if (this.f11638V == null) {
                Drawable m36246d = C1355f.m36246d(getResources(), C9270e.navigation_empty_icon, getContext().getTheme());
                this.f11638V = m36246d;
                if (m36246d != null) {
                    int i2 = this.f11630N;
                    m36246d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f11638V;
        }
        C1398i.m36094l(this.f11633Q, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f11633Q.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f11630N = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f11636T = colorStateList;
        this.f11637U = colorStateList != null;
        C1003i c1003i = this.f11635S;
        if (c1003i != null) {
            setIcon(c1003i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f11633Q.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f11631O = z;
    }

    public void setTextAppearance(int i) {
        C1398i.m36089q(this.f11633Q, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f11633Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11633Q.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11639W = new C4656a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C9273h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C9267d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C9271f.design_menu_item_text);
        this.f11633Q = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C7759x.m17498p0(this.f11633Q, this.f11639W);
    }
}
