package io.intercom.android.sdk.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.Blocks;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.com.bumptech.glide.C10486i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChatFull extends ChatNotification {
    private final Activity activity;
    private final MetricTracker metricTracker;
    private final C10486i requestManager;

    /* loaded from: classes3.dex */
    private static class ChatFullButtonClickListener implements ButtonClickListener {
        private ChatFullButtonClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public void onButtonClicked(View view, String str) {
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public boolean shouldHandleClicks() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private static class ChatFullImageClickListener implements ImageClickListener {
        private ChatFullImageClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ImageClickListener
        public void onImageClicked(String str, String str2, ImageView imageView, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatFull(Context context, Conversation conversation, int i, int i2, InAppNotification.Listener listener, MetricTracker metricTracker, Provider<AppConfig> provider, C10486i c10486i, Activity activity) {
        super(context, conversation, i, i2, listener, provider, c10486i);
        this.metricTracker = metricTracker;
        this.requestManager = c10486i;
        this.activity = activity;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected View getContentContainer() {
        return ((ViewGroup) this.overlayRoot.findViewById(C10110R.C10112id.chathead_text_container)).getChildAt(1);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        final ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C10110R.C10113layout.intercom_preview_chat_full_overlay, viewGroup, false);
        Blocks blocks = new Blocks(this.localisedContext, LumberMill.getBlocksTwig());
        Injector injector = Injector.get();
        Api api = injector.getApi();
        LinearLayout createBlocks = blocks.createBlocks(this.conversation.getLastPart().getBlocks(), new ViewHolderGenerator(new UploadingImageCache(), api, this.appConfigProvider, this.conversation.getId(), new ChatFullImageClickListener(), new ChatFullButtonClickListener(), this.requestManager, injector.getGson(), injector.getBus(), this.metricTracker, this.activity).getChatFullHolder());
        final ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C10110R.C10112id.chathead_text_container);
        viewGroup3.addView(createBlocks);
        viewGroup3.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: io.intercom.android.sdk.overlay.ChatFull.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
                int measuredHeight = viewGroup3.getMeasuredHeight();
                int i = ((ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams()).bottomMargin;
                Resources resources = ChatFull.this.localisedContext.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C10110R.dimen.intercom_chat_full_top_margin);
                if (measuredHeight >= ((ChatFull.this.screenHeight - dimensionPixelSize) - i) - resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding)) {
                    viewGroup2.findViewById(C10110R.C10112id.chat_overlay_overflow_fade).setVisibility(0);
                    return false;
                }
                return true;
            }
        });
        api.markConversationAsRead(this.conversation.getId());
        this.metricTracker.viewedInApp(this.conversation.getId(), this.conversation.getLastPart().getId(), 1);
        return viewGroup2;
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected void updateContentContainer(Part part) {
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification, io.intercom.android.sdk.overlay.InAppNotification
    protected void updateViewDataDuringReplyPulse(int i) {
    }
}
