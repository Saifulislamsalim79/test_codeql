package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9273h;
/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: z */
    private static final int[] f11853z = {C9233b.snackbarButtonStyle, C9233b.snackbarTextViewStyle};

    /* renamed from: x */
    private final AccessibilityManager f11854x;

    /* renamed from: y */
    private boolean f11855y;

    /* loaded from: classes2.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.C4729v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4729v, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4729v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4729v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4729v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4729v, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4731a implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ View.OnClickListener f11856c;

        View$OnClickListenerC4731a(View.OnClickListener onClickListener) {
            this.f11856c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f11856c.onClick(view);
            Snackbar.this.m26629t(1);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, InterfaceC4732a interfaceC4732a) {
        super(context, viewGroup, view, interfaceC4732a);
        this.f11854x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: V */
    private static ViewGroup m26609V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: W */
    private static boolean m26608W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f11853z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* renamed from: X */
    public static Snackbar m26607X(View view, int i, int i2) {
        return m26606Y(view, view.getResources().getText(i), i2);
    }

    /* renamed from: Y */
    public static Snackbar m26606Y(View view, CharSequence charSequence, int i) {
        return m26605Z(null, view, charSequence, i);
    }

    /* renamed from: Z */
    private static Snackbar m26605Z(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup m26609V = m26609V(view);
        if (m26609V != null) {
            if (context == null) {
                context = m26609V.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m26608W(context) ? C9273h.mtrl_layout_snackbar_include : C9273h.design_layout_snackbar_include, m26609V, false);
            Snackbar snackbar = new Snackbar(context, m26609V, snackbarContentLayout, snackbarContentLayout);
            snackbar.m26601d0(charSequence);
            snackbar.m26658J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: N */
    public void mo26610N() {
        super.mo26610N();
    }

    /* renamed from: a0 */
    public Snackbar m26604a0(int i, View.OnClickListener onClickListener) {
        m26603b0(m26627v().getText(i), onClickListener);
        return this;
    }

    /* renamed from: b0 */
    public Snackbar m26603b0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f11804c.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f11855y = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View$OnClickListenerC4731a(onClickListener));
        } else {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f11855y = false;
        }
        return this;
    }

    /* renamed from: c0 */
    public Snackbar m26602c0(int i) {
        ((SnackbarContentLayout) this.f11804c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    /* renamed from: d0 */
    public Snackbar m26601d0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f11804c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: s */
    public void mo26600s() {
        super.mo26600s();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: w */
    public int mo26599w() {
        int mo26599w = super.mo26599w();
        if (mo26599w == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f11854x.getRecommendedTimeoutMillis(mo26599w, (this.f11855y ? 4 : 0) | 1 | 2);
        } else if (this.f11855y && this.f11854x.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return mo26599w;
        }
    }
}
