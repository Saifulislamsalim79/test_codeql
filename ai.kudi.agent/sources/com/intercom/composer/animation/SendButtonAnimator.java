package com.intercom.composer.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class SendButtonAnimator {
    private static final String ALPHA = "alpha";
    private static final long SEND_BUTTON_ANIMATION_MS = 100;
    AnimatorSet animatorSet;
    final View background;
    final ValueAnimator.AnimatorUpdateListener backgroundListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.intercom.composer.animation.SendButtonAnimator.1
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SendButtonAnimator.this.background.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };
    final ImageView button;
    private ObjectAnimator hideSendAnimator;
    private final HideSendButtonAnimatorListener hideSendButtonAnimatorListener;
    private ObjectAnimator showSendAnimator;
    private final ShowSendButtonAnimatorListener showSendButtonAnimatorListener;

    public SendButtonAnimator(View view, ImageView imageView, ShowSendButtonAnimatorListener showSendButtonAnimatorListener, HideSendButtonAnimatorListener hideSendButtonAnimatorListener) {
        this.background = view;
        this.button = imageView;
        this.showSendButtonAnimatorListener = showSendButtonAnimatorListener;
        this.hideSendButtonAnimatorListener = hideSendButtonAnimatorListener;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.6f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.6f, 1.0f));
        this.showSendAnimator = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setStartDelay(50L);
        this.hideSendAnimator = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.6f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.6f));
    }

    public void animateButtonVisibility(boolean z, AnimationStatus animationStatus) {
        boolean z2;
        if (z && (animationStatus == AnimationStatus.HIDING || animationStatus == AnimationStatus.HIDDEN || animationStatus == AnimationStatus.UNKNOWN)) {
            z2 = true;
        } else if (z) {
            return;
        } else {
            if (animationStatus != AnimationStatus.SHOWING && animationStatus != AnimationStatus.SHOWN && animationStatus != AnimationStatus.UNKNOWN) {
                return;
            }
            z2 = false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.background, ALPHA, z2 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(this.backgroundListener);
        AnimatorSet animatorSet2 = this.animatorSet;
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ofFloat;
        animatorArr[1] = z2 ? this.showSendAnimator : this.hideSendAnimator;
        animatorSet2.playTogether(animatorArr);
        this.animatorSet.setDuration(SEND_BUTTON_ANIMATION_MS);
        this.animatorSet.addListener(z ? this.showSendButtonAnimatorListener : this.hideSendButtonAnimatorListener);
        this.animatorSet.start();
    }
}
