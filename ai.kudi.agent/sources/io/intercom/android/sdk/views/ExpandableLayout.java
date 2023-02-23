package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.C10110R;
/* loaded from: classes3.dex */
public class ExpandableLayout extends LinearLayout {
    private static final long ANIMATION_DURATION = 100;
    private boolean attachedToWindow;
    private ObjectAnimator expandAnimator;
    private ObjectAnimator fadeAnimator;
    private boolean firstLayout;
    private int heightMeasureSpec;
    private boolean inLayout;
    private int widthMeasureSpec;

    public ExpandableLayout(Context context) {
        super(context);
        this.firstLayout = true;
    }

    private boolean collapse(View view, boolean z) {
        if (checkExpandableView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!this.firstLayout && this.attachedToWindow && z) {
                if (!layoutParams.isExpanded || layoutParams.isExpanding) {
                    return false;
                }
                playCollapseAnimation(view);
                return true;
            }
            layoutParams.isExpanded = false;
            layoutParams.isExpanding = false;
            ((LinearLayout.LayoutParams) layoutParams).height = layoutParams.originalHeight;
            view.setVisibility(8);
            return true;
        }
        throw new IllegalArgumentException("collapse(), View is not expandableView");
    }

    private boolean expand(View view, boolean z) {
        if (checkExpandableView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!this.firstLayout && this.attachedToWindow && z) {
                if (layoutParams.isExpanded || layoutParams.isExpanding) {
                    return false;
                }
                playExpandAnimation(view);
                return true;
            }
            layoutParams.isExpanded = true;
            layoutParams.isExpanding = false;
            ((LinearLayout.LayoutParams) layoutParams).height = layoutParams.originalHeight;
            view.setVisibility(0);
            return true;
        }
        throw new IllegalArgumentException("expand(), View is not expandableView");
    }

    private void playCollapseAnimation(final View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.isExpanding) {
            return;
        }
        view.setVisibility(0);
        layoutParams.isExpanding = true;
        measure(this.widthMeasureSpec, this.heightMeasureSpec);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(layoutParams, "height", view.getMeasuredHeight(), 0);
        this.expandAnimator = ofInt;
        ofInt.setDuration(ANIMATION_DURATION);
        this.expandAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.requestLayout();
            }
        });
        this.expandAnimator.addListener(new AnimatorEndListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableLayout.this.performToggleState(view);
            }
        });
        view.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        this.fadeAnimator = ofFloat;
        ofFloat.setDuration(ANIMATION_DURATION);
        this.fadeAnimator.addListener(new AnimatorEndListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.6
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(0.0f);
            }
        });
        this.expandAnimator.setStartDelay(200L);
        this.fadeAnimator.start();
        this.expandAnimator.start();
    }

    private void playExpandAnimation(final View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.isExpanding) {
            return;
        }
        view.setVisibility(0);
        layoutParams.isExpanding = true;
        measure(this.widthMeasureSpec, this.heightMeasureSpec);
        int measuredHeight = view.getMeasuredHeight();
        ((LinearLayout.LayoutParams) layoutParams).height = 0;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(layoutParams, "height", 0, measuredHeight);
        this.expandAnimator = ofInt;
        ofInt.setDuration(ANIMATION_DURATION);
        this.expandAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.requestLayout();
            }
        });
        this.expandAnimator.addListener(new AnimatorEndListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableLayout.this.performToggleState(view);
            }
        });
        view.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
        this.fadeAnimator = ofFloat;
        ofFloat.setDuration(ANIMATION_DURATION);
        this.fadeAnimator.addListener(new AnimatorEndListener() { // from class: io.intercom.android.sdk.views.ExpandableLayout.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(1.0f);
            }
        });
        this.fadeAnimator.setStartDelay(200L);
        this.expandAnimator.start();
        this.fadeAnimator.start();
    }

    private void safeReleaseAnimator(ObjectAnimator objectAnimator) {
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        objectAnimator.end();
    }

    boolean checkExpandableView(View view) {
        return ((LayoutParams) view.getLayoutParams()).canExpand;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public View findExpandableView() {
        for (int i = 0; i < getChildCount(); i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).canExpand) {
                return getChildAt(i);
            }
        }
        return null;
    }

    public boolean isExpanded() {
        View findExpandableView = findExpandableView();
        return findExpandableView != null && ((LayoutParams) findExpandableView.getLayoutParams()).isExpanded;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        View findExpandableView = findExpandableView();
        safeReleaseAnimator(this.expandAnimator);
        safeReleaseAnimator(this.fadeAnimator);
        if (findExpandableView != null) {
            LayoutParams layoutParams = (LayoutParams) findExpandableView.getLayoutParams();
            if (layoutParams.isExpanded) {
                ((LinearLayout.LayoutParams) layoutParams).height = layoutParams.originalHeight;
                findExpandableView.setVisibility(0);
            } else {
                ((LinearLayout.LayoutParams) layoutParams).height = layoutParams.originalHeight;
                findExpandableView.setVisibility(8);
            }
            layoutParams.isExpanding = false;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.inLayout = true;
        super.onLayout(z, i, i2, i3, i4);
        this.inLayout = false;
        this.firstLayout = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.widthMeasureSpec = i;
        this.heightMeasureSpec = i2;
        View findExpandableView = findExpandableView();
        if (findExpandableView != null) {
            LayoutParams layoutParams = (LayoutParams) findExpandableView.getLayoutParams();
            if (((LinearLayout.LayoutParams) layoutParams).weight == 0.0f) {
                if (!layoutParams.isExpanded && !layoutParams.isExpanding) {
                    findExpandableView.setVisibility(8);
                } else {
                    findExpandableView.setVisibility(0);
                }
            } else {
                throw new IllegalArgumentException("ExpandableView can't use weight");
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.isExpanded || findExpandableView() == null) {
            return;
        }
        setExpanded(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (isExpanded()) {
            savedState.isExpanded = true;
        }
        return savedState;
    }

    void performToggleState(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.isExpanded) {
            layoutParams.isExpanded = false;
            view.setVisibility(8);
            ((LinearLayout.LayoutParams) layoutParams).height = layoutParams.originalHeight;
        } else {
            layoutParams.isExpanded = true;
        }
        layoutParams.isExpanding = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    public boolean setExpanded(boolean z) {
        return setExpanded(z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: io.intercom.android.sdk.views.ExpandableLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean isExpanded;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.isExpanded = parcel.readInt() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isExpanded ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public boolean setExpanded(boolean z, boolean z2) {
        boolean z3;
        View findExpandableView = findExpandableView();
        if (findExpandableView == null || z == isExpanded()) {
            z3 = false;
        } else if (z) {
            z3 = expand(findExpandableView, z2);
        } else {
            z3 = collapse(findExpandableView, z2);
        }
        requestLayout();
        return z3;
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.firstLayout = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.firstLayout = true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        private static final int NO_MEASURED_HEIGHT = -10;
        boolean canExpand;
        boolean isExpanded;
        boolean isExpanding;
        int originalHeight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.originalHeight = NO_MEASURED_HEIGHT;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10110R.styleable.ExpandableLayout);
            this.canExpand = obtainStyledAttributes.getBoolean(C10110R.styleable.ExpandableLayout_intercomCanExpand, false);
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
            obtainStyledAttributes.recycle();
        }

        public void setHeight(int i) {
            ((LinearLayout.LayoutParams) this).height = i;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.originalHeight = NO_MEASURED_HEIGHT;
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.originalHeight = NO_MEASURED_HEIGHT;
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.originalHeight = NO_MEASURED_HEIGHT;
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.originalHeight = NO_MEASURED_HEIGHT;
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.originalHeight = NO_MEASURED_HEIGHT;
            this.originalHeight = ((LinearLayout.LayoutParams) this).height;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
