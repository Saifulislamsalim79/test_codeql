package io.intercom.android.sdk.overlay;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StackableSnippet extends InAppNotification implements View.OnTouchListener {
    private static final int BASE_ELEVATION = 18;
    private static final int BASE_MARGIN_DP = 16;
    private static final int ELEVATION_STEP = 3;
    private final Handler handler;
    private final C10486i requestManager;

    public StackableSnippet(Context context, Conversation conversation, int i, Handler handler, int i2, InAppNotification.Listener listener, Provider<AppConfig> provider, C10486i c10486i) {
        super(context, conversation, i, i2, listener, provider);
        this.handler = handler;
        this.requestManager = c10486i;
    }

    private void animateOnScreen() {
        this.handler.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.overlay.StackableSnippet.1
            @Override // java.lang.Runnable
            public void run() {
                StackableSnippet.this.overlayRoot.setVisibility(0);
                StackableSnippet stackableSnippet = StackableSnippet.this;
                stackableSnippet.overlayRoot.setY(stackableSnippet.screenHeight);
                StackableSnippet.this.overlayRoot.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
            }
        }, this.position * 70);
    }

    private void setViewData(int i) {
        Context context = this.overlayRoot.getContext();
        AppConfig appConfig = this.appConfigProvider.get();
        TextView textView = (TextView) this.overlayRoot.findViewById(C10110R.C10112id.preview_name);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setTextColor(appConfig.getPrimaryColor());
        textView.setText(getHeaderText());
        ((TextView) this.overlayRoot.findViewById(C10110R.C10112id.preview_summary)).setText(this.conversation.getLastPart().getSummary());
        AvatarUtils.loadAvatarIntoView(this.conversation.getLastAdmin().getAvatar(), (ImageView) this.overlayRoot.findViewById(C10110R.C10112id.preview_avatar), appConfig, this.requestManager);
        ((FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams()).bottomMargin = ScreenUtils.dpToPx((this.position * 8) + 16, context) + context.getResources().getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding) + i;
        if (Build.VERSION.SDK_INT >= 21) {
            this.overlayRoot.setElevation(18 - (this.position * 3));
        }
        this.overlayRoot.setScaleX(1.0f - (this.position * 0.05f));
        if (this.position == 0) {
            beginListeningForTouchEvents();
        }
    }

    private void setupView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.overlayRoot == null) {
            this.overlayRoot = (LinearLayout) layoutInflater.inflate(C10110R.C10113layout.intercom_preview_notification, viewGroup, false);
        }
        if (isAttached()) {
            return;
        }
        viewGroup.addView(this.overlayRoot, 0);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, int i) {
        setupView(viewGroup, layoutInflater);
        setViewData(i);
        if (z) {
            animateOnScreen();
        } else {
            this.overlayRoot.setVisibility(0);
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationPressed(View view) {
        view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        performReplyPulse(this.overlayRoot.findViewById(C10110R.C10112id.notification_root), this.overlayRoot.findViewById(C10110R.C10112id.preview_summary), runnable);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void updateViewDataDuringReplyPulse(int i) {
        setViewData(i);
    }
}
