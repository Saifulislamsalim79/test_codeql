package com.intercom.composer.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import p201g.p249m.p250a.p251a.C7805b;
/* loaded from: classes2.dex */
public class EditTextLayoutAnimator {
    private static final long EDIT_TEXT_ANIMATION_MS = 350;
    private ObjectAnimator animator;
    private final View editText;
    private EditTextLayoutAnimatorInternalListener editTextLayoutAnimatorListener;
    AnimationStatus animationStatus = AnimationStatus.SHOWN;
    final Animator.AnimatorListener showEditTextAnimationListener = new AnimatorListenerAdapter() { // from class: com.intercom.composer.animation.EditTextLayoutAnimator.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            EditTextLayoutAnimator editTextLayoutAnimator = EditTextLayoutAnimator.this;
            editTextLayoutAnimator.animationStatus = AnimationStatus.SHOWN;
            if (editTextLayoutAnimator.editTextLayoutAnimatorListener != null) {
                EditTextLayoutAnimator.this.editTextLayoutAnimatorListener.onEditTextLayoutAnimationEnd(AnimationStatus.SHOWN);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            EditTextLayoutAnimator.this.animationStatus = AnimationStatus.SHOWING;
        }
    };
    final Animator.AnimatorListener hideEditTextAnimationListener = new AnimatorListenerAdapter() { // from class: com.intercom.composer.animation.EditTextLayoutAnimator.2
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            EditTextLayoutAnimator editTextLayoutAnimator = EditTextLayoutAnimator.this;
            editTextLayoutAnimator.animationStatus = AnimationStatus.HIDDEN;
            if (editTextLayoutAnimator.editTextLayoutAnimatorListener != null) {
                EditTextLayoutAnimator.this.editTextLayoutAnimatorListener.onEditTextLayoutAnimationEnd(AnimationStatus.HIDDEN);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            EditTextLayoutAnimator.this.animationStatus = AnimationStatus.HIDING;
        }
    };
    final ValueAnimator.AnimatorUpdateListener animationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.intercom.composer.animation.EditTextLayoutAnimator.3
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((LinearLayout.LayoutParams) EditTextLayoutAnimator.this.editText.getLayoutParams()).bottomMargin = ((Float) valueAnimator.getAnimatedValue()).intValue();
            EditTextLayoutAnimator.this.editText.requestLayout();
        }
    };

    public EditTextLayoutAnimator(View view) {
        this.editText = view;
    }

    public void hideEditText() {
        ObjectAnimator objectAnimator;
        if (this.animationStatus == AnimationStatus.SHOWING && (objectAnimator = this.animator) != null) {
            objectAnimator.cancel();
        }
        if (this.animationStatus == AnimationStatus.SHOWN) {
            View view = this.editText;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "layout_marginBottom", 0.0f, -view.getHeight());
            this.animator = ofFloat;
            ofFloat.setDuration(EDIT_TEXT_ANIMATION_MS);
            this.animator.setInterpolator(new C7805b());
            this.animator.addUpdateListener(this.animationUpdateListener);
            this.animator.addListener(this.hideEditTextAnimationListener);
            this.animator.start();
        }
    }

    public void setEditTextLayoutAnimatorListener(EditTextLayoutAnimatorInternalListener editTextLayoutAnimatorInternalListener) {
        this.editTextLayoutAnimatorListener = editTextLayoutAnimatorInternalListener;
    }

    public void showEditText(boolean z) {
        ObjectAnimator objectAnimator;
        if (this.animationStatus == AnimationStatus.HIDING && (objectAnimator = this.animator) != null) {
            objectAnimator.cancel();
        }
        if (this.animationStatus == AnimationStatus.HIDDEN) {
            View view = this.editText;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "layout_marginBottom", -view.getHeight(), 0.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(z ? EDIT_TEXT_ANIMATION_MS : 0L);
            this.animator.setInterpolator(new C7805b());
            this.animator.addUpdateListener(this.animationUpdateListener);
            this.animator.addListener(this.showEditTextAnimationListener);
            this.animator.start();
        }
    }
}
