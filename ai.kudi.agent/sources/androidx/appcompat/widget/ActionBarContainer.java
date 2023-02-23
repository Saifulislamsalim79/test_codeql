package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p201g.p202a.C7457f;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A */
    boolean f2976A;

    /* renamed from: B */
    private int f2977B;

    /* renamed from: c */
    private boolean f2978c;

    /* renamed from: d */
    private View f2979d;

    /* renamed from: e */
    private View f2980e;

    /* renamed from: f */
    private View f2981f;

    /* renamed from: w */
    Drawable f2982w;

    /* renamed from: x */
    Drawable f2983x;

    /* renamed from: y */
    Drawable f2984y;

    /* renamed from: z */
    boolean f2985z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7759x.m17492s0(this, new C1069b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ActionBar);
        this.f2982w = obtainStyledAttributes.getDrawable(C7461j.ActionBar_background);
        this.f2983x = obtainStyledAttributes.getDrawable(C7461j.ActionBar_backgroundStacked);
        this.f2977B = obtainStyledAttributes.getDimensionPixelSize(C7461j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C7457f.split_action_bar) {
            this.f2985z = true;
            this.f2984y = obtainStyledAttributes.getDrawable(C7461j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2985z ? this.f2982w != null || this.f2983x != null : this.f2984y != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m37438a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m37437b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2982w;
        if (drawable != null && drawable.isStateful()) {
            this.f2982w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2983x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2983x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2984y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2984y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2979d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2982w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2983x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2984y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2980e = findViewById(C7457f.action_bar);
        this.f2981f = findViewById(C7457f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2978c || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f2979d;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f2985z) {
            Drawable drawable2 = this.f2984y;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f2982w != null) {
                if (this.f2980e.getVisibility() == 0) {
                    this.f2982w.setBounds(this.f2980e.getLeft(), this.f2980e.getTop(), this.f2980e.getRight(), this.f2980e.getBottom());
                } else {
                    View view2 = this.f2981f;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f2982w.setBounds(this.f2981f.getLeft(), this.f2981f.getTop(), this.f2981f.getRight(), this.f2981f.getBottom());
                    } else {
                        this.f2982w.setBounds(0, 0, 0, 0);
                    }
                }
                z3 = true;
            }
            this.f2976A = z4;
            if (!z4 || (drawable = this.f2983x) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int m37438a;
        int i3;
        if (this.f2980e == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f2977B) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2980e == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f2979d;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!m37437b(this.f2980e)) {
            m37438a = m37438a(this.f2980e);
        } else {
            m37438a = !m37437b(this.f2981f) ? m37438a(this.f2981f) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m37438a + m37438a(this.f2979d), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2982w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2982w);
        }
        this.f2982w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2980e;
            if (view != null) {
                this.f2982w.setBounds(view.getLeft(), this.f2980e.getTop(), this.f2980e.getRight(), this.f2980e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2985z ? this.f2982w != null || this.f2983x != null : this.f2984y != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2984y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2984y);
        }
        this.f2984y = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2985z && (drawable2 = this.f2984y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2985z ? !(this.f2982w != null || this.f2983x != null) : this.f2984y == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2983x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2983x);
        }
        this.f2983x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2976A && (drawable2 = this.f2983x) != null) {
                drawable2.setBounds(this.f2979d.getLeft(), this.f2979d.getTop(), this.f2979d.getRight(), this.f2979d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2985z ? this.f2982w != null || this.f2983x != null : this.f2984y != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C1117k0 c1117k0) {
        View view = this.f2979d;
        if (view != null) {
            removeView(view);
        }
        this.f2979d = c1117k0;
        if (c1117k0 != null) {
            addView(c1117k0);
            ViewGroup.LayoutParams layoutParams = c1117k0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c1117k0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2978c = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2982w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2983x;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2984y;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2982w && !this.f2985z) || (drawable == this.f2983x && this.f2976A) || ((drawable == this.f2984y && this.f2985z) || super.verifyDrawable(drawable));
    }
}
