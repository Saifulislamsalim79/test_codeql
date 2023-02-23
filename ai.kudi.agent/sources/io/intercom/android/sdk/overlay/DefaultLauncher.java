package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
/* loaded from: classes3.dex */
class DefaultLauncher implements View.OnTouchListener {
    private static final int ANIMATION_DURATION_MS = 300;
    private final ImageButton badge;
    private final TextView badgeCount;
    final View launcherRoot;
    final Listener listener;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onLauncherClicked(Context context);
    }

    public DefaultLauncher(ViewGroup viewGroup, LayoutInflater layoutInflater, Listener listener, int i) {
        this.listener = listener;
        layoutInflater.inflate(C10110R.C10113layout.intercom_default_launcher, viewGroup, true);
        View findViewById = viewGroup.findViewById(C10110R.C10112id.launcher_root);
        this.launcherRoot = findViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.launcherRoot.setLayoutParams(marginLayoutParams);
        this.badge = (ImageButton) this.launcherRoot.findViewById(C10110R.C10112id.launcher_icon);
        this.badgeCount = (TextView) this.launcherRoot.findViewById(C10110R.C10112id.launcher_badge_count);
        this.launcherRoot.setOnTouchListener(this);
    }

    private void callListenerWithFadeOut() {
        this.launcherRoot.setAlpha(1.0f);
        this.launcherRoot.animate().alpha(0.0f).setDuration(50L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DefaultLauncher defaultLauncher = DefaultLauncher.this;
                defaultLauncher.listener.onLauncherClicked(defaultLauncher.launcherRoot.getContext());
            }
        }).start();
    }

    public void fadeOffScreen(Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().alpha(0.0f).setDuration(100L).setListener(animatorListener).start();
    }

    public void fadeOnScreen() {
        this.launcherRoot.setAlpha(0.0f);
        this.launcherRoot.animate().alpha(1.0f).setDuration(100L).start();
    }

    public void hideBadgeCount() {
        this.badgeCount.setVisibility(8);
    }

    public boolean isAttachedToRoot(ViewGroup viewGroup) {
        return this.launcherRoot.getParent() == viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (action == 1) {
            callListenerWithFadeOut();
        }
        return true;
    }

    public void pulseForTransformation(final Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animatorListener.onAnimationEnd(animator);
                DefaultLauncher.this.launcherRoot.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        }).start();
    }

    public void removeView() {
        if (this.launcherRoot.getParent() != null) {
            ((ViewGroup) this.launcherRoot.getParent()).removeView(this.launcherRoot);
        }
    }

    public void setBadgeCount(String str) {
        this.badgeCount.setVisibility(0);
        this.badgeCount.setText(str);
    }

    public void setLauncherColor(AppConfig appConfig, int i) {
        Context context = this.badge.getContext();
        Drawable m36322f = C1335a.m36322f(context, C10110R.C10111drawable.intercom_solid_circle);
        m36322f.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        Drawable newDrawable = m36322f.getConstantState().newDrawable();
        newDrawable.setColorFilter(C1335a.m36324d(context, C10110R.color.intercom_inbox_count_background), PorterDuff.Mode.SRC_IN);
        BackgroundUtils.setBackground(this.badgeCount, newDrawable);
        BackgroundUtils.setBackground(this.badge, m36322f);
        ColorUtils.setImageSrcColorWhiteOrDark(this.badge, appConfig.primaryColorRenderDarkText());
    }

    public void updateBottomPadding(int i) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.launcherRoot.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(marginLayoutParams.bottomMargin, i);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                DefaultLauncher.this.launcherRoot.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.start();
    }
}
