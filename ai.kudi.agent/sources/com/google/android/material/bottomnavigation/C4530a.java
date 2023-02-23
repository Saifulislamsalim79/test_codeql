package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.C1155t0;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import p201g.p227h.p238l.C7756u;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.p329n.C9289a;
import p272h.p286c.p287a.p323c.p329n.C9293b;
/* compiled from: BottomNavigationItemView.java */
/* renamed from: com.google.android.material.bottomnavigation.a */
/* loaded from: classes2.dex */
public class C4530a extends FrameLayout implements InterfaceC1016n.InterfaceC1017a {

    /* renamed from: I */
    private static final int[] f11104I = {16842912};

    /* renamed from: A */
    private final TextView f11105A;

    /* renamed from: B */
    private final TextView f11106B;

    /* renamed from: C */
    private int f11107C;

    /* renamed from: D */
    private C1003i f11108D;

    /* renamed from: E */
    private ColorStateList f11109E;

    /* renamed from: F */
    private Drawable f11110F;

    /* renamed from: G */
    private Drawable f11111G;

    /* renamed from: H */
    private C9289a f11112H;

    /* renamed from: c */
    private final int f11113c;

    /* renamed from: d */
    private float f11114d;

    /* renamed from: e */
    private float f11115e;

    /* renamed from: f */
    private float f11116f;

    /* renamed from: w */
    private int f11117w;

    /* renamed from: x */
    private boolean f11118x;

    /* renamed from: y */
    private ImageView f11119y;

    /* renamed from: z */
    private final ViewGroup f11120z;

    /* compiled from: BottomNavigationItemView.java */
    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    /* loaded from: classes2.dex */
    class View$OnLayoutChangeListenerC4531a implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC4531a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C4530a.this.f11119y.getVisibility() == 0) {
                C4530a c4530a = C4530a.this;
                c4530a.m27503m(c4530a.f11119y);
            }
        }
    }

    public C4530a(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m27511c(float f, float f2) {
        this.f11114d = f - f2;
        this.f11115e = (f2 * 1.0f) / f;
        this.f11116f = (f * 1.0f) / f2;
    }

    /* renamed from: f */
    private FrameLayout m27510f(View view) {
        ImageView imageView = this.f11119y;
        if (view == imageView && C9293b.f21862a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m27509g() {
        return this.f11112H != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C4530a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    private static void m27507i(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private static void m27506j(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: k */
    private void m27505k(View view) {
        if (m27509g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C9293b.m15151a(this.f11112H, view, m27510f(view));
        }
    }

    /* renamed from: l */
    private void m27504l(View view) {
        if (m27509g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C9293b.m15148d(this.f11112H, view);
            }
            this.f11112H = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m27503m(View view) {
        if (m27509g()) {
            C9293b.m15147e(this.f11112H, view, m27510f(view));
        }
    }

    /* renamed from: n */
    private static void m27502n(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: d */
    public boolean mo26854d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: e */
    public void mo26853e(C1003i c1003i, int i) {
        CharSequence title;
        this.f11108D = c1003i;
        setCheckable(c1003i.isCheckable());
        setChecked(c1003i.isChecked());
        setEnabled(c1003i.isEnabled());
        setIcon(c1003i.getIcon());
        setTitle(c1003i.getTitle());
        setId(c1003i.getItemId());
        if (!TextUtils.isEmpty(c1003i.getContentDescription())) {
            setContentDescription(c1003i.getContentDescription());
        }
        if (!TextUtils.isEmpty(c1003i.getTooltipText())) {
            title = c1003i.getTooltipText();
        } else {
            title = c1003i.getTitle();
        }
        C1155t0.m36986a(this, title);
        setVisibility(c1003i.isVisible() ? 0 : 8);
    }

    C9289a getBadge() {
        return this.f11112H;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    public C1003i getItemData() {
        return this.f11108D;
    }

    public int getItemPosition() {
        return this.f11107C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m27508h() {
        m27504l(this.f11119y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1003i c1003i = this.f11108D;
        if (c1003i != null && c1003i.isCheckable() && this.f11108D.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f11104I);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C9289a c9289a = this.f11112H;
        if (c9289a != null && c9289a.isVisible()) {
            CharSequence title = this.f11108D.getTitle();
            if (!TextUtils.isEmpty(this.f11108D.getContentDescription())) {
                title = this.f11108D.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f11112H.m15192i()));
        }
        C7716c m17716E0 = C7716c.m17716E0(accessibilityNodeInfo);
        m17716E0.m17687d0(C7716c.C7719c.m17636a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            m17716E0.m17691b0(false);
            m17716E0.m17702S(C7716c.C7717a.f18476g);
        }
        m17716E0.m17657s0(getResources().getString(C9275j.item_view_role_description));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(C9289a c9289a) {
        this.f11112H = c9289a;
        ImageView imageView = this.f11119y;
        if (imageView != null) {
            m27505k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f11106B;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f11106B;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f11105A;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f11105A;
        textView4.setPivotY(textView4.getBaseline());
        int i = this.f11117w;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m27507i(this.f11119y, this.f11113c, 49);
                    ViewGroup viewGroup = this.f11120z;
                    m27502n(viewGroup, ((Integer) viewGroup.getTag(C9271f.mtrl_view_tag_bottom_padding)).intValue());
                    this.f11106B.setVisibility(0);
                } else {
                    m27507i(this.f11119y, this.f11113c, 17);
                    m27502n(this.f11120z, 0);
                    this.f11106B.setVisibility(4);
                }
                this.f11105A.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup2 = this.f11120z;
                m27502n(viewGroup2, ((Integer) viewGroup2.getTag(C9271f.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    m27507i(this.f11119y, (int) (this.f11113c + this.f11114d), 49);
                    m27506j(this.f11106B, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f11105A;
                    float f = this.f11115e;
                    m27506j(textView5, f, f, 4);
                } else {
                    m27507i(this.f11119y, this.f11113c, 49);
                    TextView textView6 = this.f11106B;
                    float f2 = this.f11116f;
                    m27506j(textView6, f2, f2, 4);
                    m27506j(this.f11105A, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m27507i(this.f11119y, this.f11113c, 17);
                this.f11106B.setVisibility(8);
                this.f11105A.setVisibility(8);
            }
        } else if (this.f11118x) {
            if (z) {
                m27507i(this.f11119y, this.f11113c, 49);
                ViewGroup viewGroup3 = this.f11120z;
                m27502n(viewGroup3, ((Integer) viewGroup3.getTag(C9271f.mtrl_view_tag_bottom_padding)).intValue());
                this.f11106B.setVisibility(0);
            } else {
                m27507i(this.f11119y, this.f11113c, 17);
                m27502n(this.f11120z, 0);
                this.f11106B.setVisibility(4);
            }
            this.f11105A.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f11120z;
            m27502n(viewGroup4, ((Integer) viewGroup4.getTag(C9271f.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                m27507i(this.f11119y, (int) (this.f11113c + this.f11114d), 49);
                m27506j(this.f11106B, 1.0f, 1.0f, 0);
                TextView textView7 = this.f11105A;
                float f3 = this.f11115e;
                m27506j(textView7, f3, f3, 4);
            } else {
                m27507i(this.f11119y, this.f11113c, 49);
                TextView textView8 = this.f11106B;
                float f4 = this.f11116f;
                m27506j(textView8, f4, f4, 4);
                m27506j(this.f11105A, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f11105A.setEnabled(z);
        this.f11106B.setEnabled(z);
        this.f11119y.setEnabled(z);
        if (z) {
            C7759x.m17558E0(this, C7756u.m17568b(getContext(), 1002));
        } else {
            C7759x.m17558E0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f11110F) {
            return;
        }
        this.f11110F = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C1365a.m36184r(drawable).mutate();
            this.f11111G = drawable;
            ColorStateList colorStateList = this.f11109E;
            if (colorStateList != null) {
                C1365a.m36187o(drawable, colorStateList);
            }
        }
        this.f11119y.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11119y.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f11119y.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f11109E = colorStateList;
        if (this.f11108D == null || (drawable = this.f11111G) == null) {
            return;
        }
        C1365a.m36187o(drawable, colorStateList);
        this.f11111G.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C1335a.m36322f(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f11107C = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f11117w != i) {
            this.f11117w = i;
            if (this.f11108D != null) {
                setChecked(this.f11108D.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f11118x != z) {
            this.f11118x = z;
            if (this.f11108D != null) {
                setChecked(this.f11108D.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C1398i.m36089q(this.f11106B, i);
        m27511c(this.f11105A.getTextSize(), this.f11106B.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C1398i.m36089q(this.f11105A, i);
        m27511c(this.f11105A.getTextSize(), this.f11106B.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f11105A.setTextColor(colorStateList);
            this.f11106B.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f11105A.setText(charSequence);
        this.f11106B.setText(charSequence);
        C1003i c1003i = this.f11108D;
        if (c1003i == null || TextUtils.isEmpty(c1003i.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C1003i c1003i2 = this.f11108D;
        if (c1003i2 != null && !TextUtils.isEmpty(c1003i2.getTooltipText())) {
            charSequence = this.f11108D.getTooltipText();
        }
        C1155t0.m36986a(this, charSequence);
    }

    public C4530a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4530a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11107C = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C9273h.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C9270e.design_bottom_navigation_item_background);
        this.f11113c = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_margin);
        this.f11119y = (ImageView) findViewById(C9271f.icon);
        this.f11120z = (ViewGroup) findViewById(C9271f.labelGroup);
        this.f11105A = (TextView) findViewById(C9271f.smallLabel);
        this.f11106B = (TextView) findViewById(C9271f.largeLabel);
        ViewGroup viewGroup = this.f11120z;
        viewGroup.setTag(C9271f.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        C7759x.m17478z0(this.f11105A, 2);
        C7759x.m17478z0(this.f11106B, 2);
        setFocusable(true);
        m27511c(this.f11105A.getTextSize(), this.f11106B.getTextSize());
        ImageView imageView = this.f11119y;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC4531a());
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C7759x.m17492s0(this, drawable);
    }
}
