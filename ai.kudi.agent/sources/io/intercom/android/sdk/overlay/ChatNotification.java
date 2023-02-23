package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
abstract class ChatNotification extends InAppNotification {
    private static final int ANIMATION_DURATION = 170;
    private static final int GROWTH_WIDTH = 355;
    private final C10486i requestManager;

    /* JADX INFO: Access modifiers changed from: protected */
    public ChatNotification(Context context, Conversation conversation, int i, int i2, InAppNotification.Listener listener, Provider<AppConfig> provider, C10486i c10486i) {
        super(context, conversation, i, i2, listener, provider);
        this.requestManager = c10486i;
    }

    private void expandChat(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C10110R.C10112id.chathead_text_container);
        if (viewGroup2 == null) {
            return;
        }
        View contentContainer = getContentContainer();
        View findViewById = viewGroup.findViewById(C10110R.C10112id.chat_avatar_container);
        float translationX = findViewById.getTranslationX();
        float translationY = findViewById.getTranslationY();
        ObjectAnimator.ofPropertyValuesHolder(findViewById, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.8f), PropertyValuesHolder.ofFloat("translationX", translationX, translationX + 100.0f), PropertyValuesHolder.ofFloat("translationY", translationY, translationY - 40.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.8f)).setDuration(170L).start();
        ObjectAnimator.ofFloat((TextView) viewGroup.findViewById(C10110R.C10112id.chathead_text_header), View.ALPHA, 1.0f, 0.0f).setDuration(170L).start();
        ObjectAnimator.ofFloat(contentContainer, View.ALPHA, 1.0f, 0.0f).setDuration(170L).start();
        getWidthAnimator(viewGroup2, animatorListenerAdapter).start();
        getWidthAnimator(this.overlayRoot).start();
        getMarginAnimator(viewGroup2, (FrameLayout.LayoutParams) viewGroup2.getLayoutParams()).start();
    }

    private Animator getMarginAnimator(final ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams) {
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams.leftMargin, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams2.leftMargin = intValue;
                viewGroup.setLayoutParams(layoutParams2);
            }
        });
        ofInt.setDuration(170L);
        return ofInt;
    }

    private Animator getWidthAnimator(ViewGroup viewGroup, final Animator.AnimatorListener animatorListener) {
        final int abs = Math.abs(viewGroup.getMeasuredWidth() - ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ValueAnimator widthAnimator = getWidthAnimator(viewGroup);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.4
            boolean hasSentUpdate = false;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = abs;
                if ((i > 0 ? (intValue / i) * 100 : 100) <= 80 || this.hasSentUpdate) {
                    return;
                }
                this.hasSentUpdate = true;
                animatorListener.onAnimationEnd(null);
            }
        });
        return widthAnimator;
    }

    private void performEntranceAnimation() {
        View findViewById = this.overlayRoot.findViewById(C10110R.C10112id.chat_avatar_container);
        final ViewGroup viewGroup = (ViewGroup) this.overlayRoot.findViewById(C10110R.C10112id.chat_full_body);
        viewGroup.setVisibility(4);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(findViewById, PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.ChatNotification.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ChatNotification.this.animateTextContainer(viewGroup);
            }
        });
        duration.start();
    }

    private void populateViewsWithData(C10486i c10486i) {
        View findViewById = this.overlayRoot.findViewById(C10110R.C10112id.chathead_root);
        TextView textView = (TextView) findViewById.findViewById(C10110R.C10112id.chathead_text_header);
        ColorUtils.setTextColorPrimaryOrDark(textView, this.appConfigProvider.get());
        FontUtils.setRobotoMediumTypeface(textView);
        AvatarUtils.loadAvatarIntoView(this.conversation.getLastAdmin().getAvatar(), (ImageView) findViewById.findViewById(C10110R.C10112id.chathead_avatar), this.appConfigProvider.get(), c10486i);
        textView.setText(getHeaderText());
        updateContentContainer(this.conversation.getLastPart());
    }

    void animateTextContainer(ViewGroup viewGroup) {
        viewGroup.setScaleX(0.8f);
        viewGroup.setScaleY(0.8f);
        viewGroup.setAlpha(0.8f);
        viewGroup.setX(((int) viewGroup.getX()) - 150);
        viewGroup.setVisibility(0);
        viewGroup.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).alphaBy(1.0f).translationX((int) viewGroup.getX()).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.ChatNotification.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ChatNotification.this.beginListeningForTouchEvents();
            }
        }).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, int i) {
        if (this.overlayRoot == null) {
            this.overlayRoot = inflateChatRootView(viewGroup, layoutInflater);
        }
        if (!isAttached()) {
            viewGroup.addView(this.overlayRoot, 0);
        }
        if (this.bottomPadding != i) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin + this.overlayRoot.getResources().getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding) + i);
            this.overlayRoot.setLayoutParams(layoutParams);
            this.bottomPadding = i;
        }
        populateViewsWithData(this.requestManager);
        if (z) {
            performEntranceAnimation();
            return;
        }
        this.overlayRoot.setVisibility(0);
        beginListeningForTouchEvents();
    }

    protected abstract View getContentContainer();

    protected abstract ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater);

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
        expandChat(viewGroup, animatorListenerAdapter);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationPressed(View view) {
        view.animate().scaleX(0.9f).scaleY(0.9f).alpha(0.9f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(50L).start();
    }

    protected abstract void updateContentContainer(Part part);

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected abstract void updateViewDataDuringReplyPulse(int i);

    private ValueAnimator getWidthAnimator(final ViewGroup viewGroup) {
        ValueAnimator ofInt = ValueAnimator.ofInt(viewGroup.getMeasuredWidth(), ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.width = intValue;
                viewGroup.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(170L);
        return ofInt;
    }
}
