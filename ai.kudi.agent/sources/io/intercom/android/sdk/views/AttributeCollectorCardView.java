package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.C10110R;
import p201g.p227h.p238l.C7713h;
/* loaded from: classes3.dex */
public class AttributeCollectorCardView extends LinearLayout {
    private static final long ANIMATE_DURATION = 400;
    private final int expandedLeftMargin;
    private final int expandedPadding;
    private final int expandedShadowSize;
    private ValueAnimator.AnimatorUpdateListener heightAnimateListener;
    private final int originalBottomMargin;
    private final int originalLeftMargin;
    private final int originalPadding;
    private final int originalShadowSize;
    private ValueAnimator.AnimatorUpdateListener shadowAnimateListener;
    private final int shadowSizeDiff;
    private ValueAnimator.AnimatorUpdateListener verticalMarginAnimateListener;
    private ValueAnimator.AnimatorUpdateListener widthAnimateListener;

    public AttributeCollectorCardView(Context context) {
        this(context, null);
    }

    public void animateBack(Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.expandedLeftMargin, this.originalLeftMargin);
        ofInt.addUpdateListener(this.widthAnimateListener);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.expandedPadding, this.originalPadding);
        ofInt2.addUpdateListener(this.heightAnimateListener);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.expandedShadowSize, this.originalShadowSize);
        ofInt3.addUpdateListener(this.shadowAnimateListener);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(this.shadowSizeDiff, 0);
        ofInt4.addUpdateListener(this.verticalMarginAnimateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(ANIMATE_DURATION);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(ofInt, ofInt2, ofInt3, ofInt4);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }

    public void animateToExpand() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.originalLeftMargin, this.expandedLeftMargin);
        ofInt.addUpdateListener(this.widthAnimateListener);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.originalPadding, this.expandedPadding);
        ofInt2.addUpdateListener(this.heightAnimateListener);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.originalShadowSize, this.expandedShadowSize);
        ofInt3.addUpdateListener(this.shadowAnimateListener);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(0, this.shadowSizeDiff);
        ofInt4.addUpdateListener(this.verticalMarginAnimateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(ANIMATE_DURATION);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ofInt, ofInt2, ofInt3, ofInt4);
        animatorSet.start();
    }

    public boolean isExpanded() {
        return C7713h.m17730b((FrameLayout.LayoutParams) getLayoutParams()) < this.originalLeftMargin;
    }

    public AttributeCollectorCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.widthAnimateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.AttributeCollectorCardView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AttributeCollectorCardView.this.getLayoutParams();
                C7713h.m17728d(layoutParams, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                AttributeCollectorCardView.this.setLayoutParams(layoutParams);
            }
        };
        this.heightAnimateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.AttributeCollectorCardView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = AttributeCollectorCardView.this.originalPadding;
                AttributeCollectorCardView.this.setPadding(i, intValue, i, intValue);
            }
        };
        this.shadowAnimateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.AttributeCollectorCardView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (Build.VERSION.SDK_INT >= 21) {
                    AttributeCollectorCardView.this.setElevation(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        };
        this.verticalMarginAnimateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.views.AttributeCollectorCardView.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AttributeCollectorCardView.this.getLayoutParams();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.topMargin = intValue;
                layoutParams.bottomMargin = intValue + AttributeCollectorCardView.this.originalBottomMargin;
                AttributeCollectorCardView.this.setLayoutParams(layoutParams);
            }
        };
        Resources resources = context.getResources();
        this.originalPadding = resources.getDimensionPixelSize(C10110R.dimen.intercom_container_cell_padding);
        this.originalLeftMargin = resources.getDimensionPixelSize(C10110R.dimen.intercom_attribute_part_left_margin);
        this.expandedLeftMargin = resources.getDimensionPixelSize(C10110R.dimen.intercom_cell_horizontal_padding);
        this.expandedPadding = resources.getDimensionPixelSize(C10110R.dimen.intercom_attribute_part_expanded_vertical_padding);
        this.originalShadowSize = resources.getDimensionPixelSize(C10110R.dimen.intercom_card_shadow_size);
        this.expandedShadowSize = resources.getDimensionPixelSize(C10110R.dimen.intercom_attribute_card_expanded_shadow_size);
        this.originalBottomMargin = resources.getDimensionPixelSize(C10110R.dimen.intercom_card_bottom_margin);
        this.shadowSizeDiff = this.expandedShadowSize - this.originalShadowSize;
    }
}
