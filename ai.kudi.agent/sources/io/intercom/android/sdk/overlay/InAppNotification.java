package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.utilities.Phrase;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* loaded from: classes3.dex */
abstract class InAppNotification implements View.OnTouchListener {
    private static final int ANIMATE_OFFSCREEN_OFFSET = 200;
    private static final int BASE_MARGIN_DP = 16;
    private static final int DISMISS_DISTANCE_DP = 80;
    protected static final int MARGIN_OFFSET_DP = 8;
    private static final float RESISTANCE = 2.0f;
    protected static final float SCALE_OFFSET = 0.05f;
    protected final Provider<AppConfig> appConfigProvider;
    protected int bottomPadding = 0;
    protected Conversation conversation;
    private float initialTouchX;
    private float initialViewX;
    final Listener listener;
    protected final Context localisedContext;
    protected ViewGroup overlayRoot;
    protected int position;
    protected final int screenHeight;

    /* loaded from: classes3.dex */
    interface Listener {
        void onInAppNotificationDismiss(InAppNotification inAppNotification);

        void onInAppNotificationTap(Conversation conversation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InAppNotification(Context context, Conversation conversation, int i, int i2, Listener listener, Provider<AppConfig> provider) {
        this.conversation = conversation;
        this.listener = listener;
        this.position = i;
        this.screenHeight = i2;
        this.localisedContext = context;
        this.appConfigProvider = provider;
    }

    private void animateOffScreen(View view) {
        int width;
        int dpToPx = ScreenUtils.dpToPx(200.0f, view.getContext());
        if (view.getX() > this.initialViewX) {
            width = getParentOrScreenWidth(view) + dpToPx;
        } else {
            width = (view.getWidth() * (-1)) - dpToPx;
        }
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX(width).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.listener.onInAppNotificationDismiss(inAppNotification);
            }
        }).start();
    }

    private void animateToOriginalPosition(View view) {
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX(0.0f).setDuration(300L).start();
    }

    private int getParentOrScreenWidth(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return ((View) parent).getWidth();
        }
        return view.getResources().getDisplayMetrics().widthPixels;
    }

    protected void animateToBackOfStack(Context context) {
        Resources resources = context.getResources();
        int dimension = this.screenHeight - (((((int) resources.getDimension(C10110R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((this.position * 8) + 16, context)) + resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding)) + this.bottomPadding);
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, PropertyValuesHolder.ofFloat(View.Y, ScreenUtils.dpToPx(8.0f, context) + dimension, dimension), PropertyValuesHolder.ofFloat(View.ALPHA, this.overlayRoot.getAlpha(), 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.85f, 1.0f - (this.position * SCALE_OFFSET))).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void animateToPosition(Context context) {
        Resources resources = context.getResources();
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, PropertyValuesHolder.ofFloat("y", this.overlayRoot.getY(), this.screenHeight - (((((int) resources.getDimension(C10110R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((this.position * 8) + 16, context)) + resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding)) + this.bottomPadding)), PropertyValuesHolder.ofFloat("scaleX", this.overlayRoot.getScaleX(), 1.0f - (this.position * SCALE_OFFSET))).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void beginListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener(this);
    }

    public abstract void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, int i);

    public void display(ViewGroup viewGroup, Conversation conversation, LayoutInflater layoutInflater, boolean z, int i) {
        this.conversation = conversation;
        display(viewGroup, layoutInflater, z, i);
    }

    public Conversation getConversation() {
        return this.conversation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CharSequence getHeaderText() {
        if (this.conversation.isAdminReply()) {
            return Phrase.from(this.localisedContext, C10110R.string.intercom_reply_from_admin).putOptional("name", this.conversation.getLastAdmin().getForename()).format();
        }
        return Phrase.from(this.localisedContext, C10110R.string.intercom_teammate_from_company).putOptional("name", this.conversation.getLastAdmin().getForename()).putOptional("company", this.appConfigProvider.get().getName()).format();
    }

    public int getPosition() {
        return this.position;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View getRootView() {
        return this.overlayRoot;
    }

    public boolean isAttached() {
        return this.overlayRoot.getParent() != null;
    }

    public void moveBackward(ViewGroup viewGroup) {
        moveBackward(viewGroup, new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.4
        });
    }

    public abstract void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter);

    public void moveForward(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = this.position - 1;
        this.position = i;
        if (i < 0) {
            ViewGroup viewGroup2 = this.overlayRoot;
            if (viewGroup2 == null || !(viewGroup2.getParent() instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) this.overlayRoot.getParent()).removeView(this.overlayRoot);
        } else if (i == 0) {
            animateToPosition(viewGroup.getContext());
            beginListeningForTouchEvents();
        } else if (i == 1) {
            animateToPosition(viewGroup.getContext());
        } else if (i == 2) {
            display(viewGroup, layoutInflater, false, this.bottomPadding);
            animateToBackOfStack(viewGroup.getContext());
        }
    }

    protected abstract void onNotificationPressed(View view);

    protected abstract void onNotificationReleased(View view);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = (motionEvent.getRawX() - this.initialTouchX) / RESISTANCE;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.initialViewX = view.getX();
            this.initialTouchX = motionEvent.getRawX();
            onNotificationPressed(getRootView());
        } else if (action == 1) {
            float abs = Math.abs(rawX);
            if (abs < 5.0f) {
                this.listener.onInAppNotificationTap(this.conversation);
            } else if (abs > ScreenUtils.dpToPx(80.0f, this.localisedContext)) {
                stopListeningForTouchEvents();
                animateOffScreen(view);
            } else {
                onNotificationReleased(getRootView());
                animateToOriginalPosition(view);
            }
        } else if (action == 2) {
            view.setX(rawX + this.initialViewX);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void performReplyPulse(View view, final View view2, final Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 1.05f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 1.05f)).setDuration(150L);
        duration.setRepeatCount(1);
        duration.setRepeatMode(2);
        duration.start();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f, 0.0f).setDuration(200L);
        duration2.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.updateViewDataDuringReplyPulse(inAppNotification.bottomPadding);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f, 1.0f).setDuration(200L);
                duration3.setStartDelay(100L);
                duration3.start();
                duration3.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.3.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        runnable.run();
                    }
                });
            }
        });
        duration2.start();
    }

    public void removeView() {
        View rootView = getRootView();
        if (rootView == null || rootView.getParent() == null) {
            return;
        }
        ((ViewGroup) rootView.getParent()).removeView(rootView);
    }

    public void setPosition(int i) {
        this.position = i;
    }

    protected void stopListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener(null);
    }

    public abstract void update(Conversation conversation, Runnable runnable);

    public void updateBottomPadding(Context context, int i) {
        if (this.bottomPadding == i || this.overlayRoot == null) {
            return;
        }
        this.bottomPadding = i;
        int dpToPx = ScreenUtils.dpToPx((this.position * 8) + 16, context) + context.getResources().getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding) + i;
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams.bottomMargin, dpToPx);
        ofInt.setDuration((long) IjkMediaCodecInfo.RANK_SECURE);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.InAppNotification.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                InAppNotification.this.overlayRoot.setLayoutParams(layoutParams);
            }
        });
        ofInt.start();
    }

    protected abstract void updateViewDataDuringReplyPulse(int i);
}
