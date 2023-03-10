package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import io.intercom.android.sdk.C10110R;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class AdminIsTypingView extends LinearLayout {
    private static final int ANIMATION_DELAY_MS = 100;
    private static final int ANIMATION_DURATION_MS = 200;
    private static final float FADED_ALPHA = 0.7f;
    private static final int IS_TYPING_DURATION_SECONDS = 10;
    private static final float SMALL_SCALE = 0.4f;
    final Runnable animateDots;
    boolean animating;
    final ImageView[] dots;
    final Animator[] dotsAnimations;
    final Runnable endAnimation;
    private Listener listener;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onAdminTypingAnimationEnded(AdminIsTypingView adminIsTypingView);
    }

    public AdminIsTypingView(Context context) {
        this(context, null);
    }

    private void setupEndCondition() {
        postDelayed(this.endAnimation, TimeUnit.SECONDS.toMillis(10L));
    }

    public void beginAnimation() {
        if (this.animating) {
            return;
        }
        this.animating = true;
        this.animateDots.run();
    }

    public void cancelTypingAnimation() {
        this.endAnimation.run();
    }

    public void renewTypingAnimation() {
        removeCallbacks(this.endAnimation);
        setupEndCondition();
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public AdminIsTypingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dots = new ImageView[3];
        this.dotsAnimations = new Animator[3];
        this.animating = false;
        this.animateDots = new Runnable() { // from class: io.intercom.android.sdk.views.AdminIsTypingView.1
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    AdminIsTypingView adminIsTypingView = AdminIsTypingView.this;
                    if (i < adminIsTypingView.dots.length) {
                        adminIsTypingView.dotsAnimations[i].start();
                        i++;
                    } else {
                        adminIsTypingView.postDelayed(adminIsTypingView.animateDots, TimeUnit.SECONDS.toMillis(1L));
                        return;
                    }
                }
            }
        };
        this.endAnimation = new Runnable() { // from class: io.intercom.android.sdk.views.AdminIsTypingView.2
            @Override // java.lang.Runnable
            public void run() {
                AdminIsTypingView adminIsTypingView = AdminIsTypingView.this;
                adminIsTypingView.animating = false;
                adminIsTypingView.removeCallbacks(adminIsTypingView.animateDots);
                AdminIsTypingView adminIsTypingView2 = AdminIsTypingView.this;
                adminIsTypingView2.removeCallbacks(adminIsTypingView2.endAnimation);
                if (AdminIsTypingView.this.listener != null) {
                    AdminIsTypingView.this.listener.onAdminTypingAnimationEnded(AdminIsTypingView.this);
                }
                for (Animator animator : AdminIsTypingView.this.dotsAnimations) {
                    animator.cancel();
                }
            }
        };
        LinearLayout.inflate(getContext(), C10110R.C10113layout.intercom_admin_is_typing, this);
        this.dots[0] = (ImageView) findViewById(C10110R.C10112id.dot1);
        this.dots[1] = (ImageView) findViewById(C10110R.C10112id.dot2);
        this.dots[2] = (ImageView) findViewById(C10110R.C10112id.dot3);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, SMALL_SCALE, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, SMALL_SCALE, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.ALPHA, FADED_ALPHA, 1.0f);
        for (int i = 0; i < this.dotsAnimations.length; i++) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.dots[i], ofFloat3, ofFloat, ofFloat2);
            ofPropertyValuesHolder.setRepeatCount(1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.setStartDelay(i * 100);
            this.dotsAnimations[i] = ofPropertyValuesHolder;
        }
        setupEndCondition();
    }
}
