package io.intercom.android.sdk.utilities;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import io.intercom.android.sdk.C10110R;
/* loaded from: classes3.dex */
public class BackgroundUtils {
    public static void animateBackground(int i, int i2, int i3, final View view, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(i3);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.utilities.BackgroundUtils.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        if (animatorListener != null) {
            ofObject.addListener(animatorListener);
        }
        ofObject.start();
    }

    public static void setBackground(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void setRippleButtonBackgroundColor(Drawable drawable, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((GradientDrawable) ((RippleDrawable) drawable).findDrawableByLayerId(i)).setColor(i2);
        } else {
            ((GradientDrawable) ((LayerDrawable) drawable).findDrawableByLayerId(i)).setColor(i2);
        }
    }

    public static void setRippleButtonStroke(Context context, Drawable drawable, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            updateStroke((GradientDrawable) ((RippleDrawable) drawable).findDrawableByLayerId(i), context, i2);
        } else {
            updateStroke((GradientDrawable) ((LayerDrawable) drawable).findDrawableByLayerId(i), context, i2);
        }
    }

    private static void updateStroke(GradientDrawable gradientDrawable, Context context, int i) {
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(C10110R.dimen.intercom_home_button_stroke_size), i);
    }
}
