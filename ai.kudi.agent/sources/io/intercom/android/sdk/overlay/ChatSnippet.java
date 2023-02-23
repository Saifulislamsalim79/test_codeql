package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChatSnippet extends ChatNotification {
    private TextView contentBody;
    private final C10486i requestManager;

    public ChatSnippet(Context context, Conversation conversation, int i, int i2, InAppNotification.Listener listener, Provider<AppConfig> provider, C10486i c10486i) {
        super(context, conversation, i, i2, listener, provider, c10486i);
        this.requestManager = c10486i;
    }

    private void setBodyText(Part part) {
        if (part.getSummary().isEmpty()) {
            this.contentBody.setText(this.localisedContext.getString(C10110R.string.intercom_image_attached));
        } else {
            this.contentBody.setText(part.getSummary());
        }
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected View getContentContainer() {
        return this.overlayRoot.findViewById(C10110R.C10112id.chathead_text_body);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C10110R.C10113layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        this.contentBody = (TextView) layoutInflater.inflate(C10110R.C10113layout.intercom_preview_chat_snippet_body, viewGroup2, false);
        ((ViewGroup) viewGroup2.findViewById(C10110R.C10112id.chathead_text_container)).addView(this.contentBody);
        return viewGroup2;
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        View findViewById = this.overlayRoot.findViewById(C10110R.C10112id.chathead_text_body);
        View findViewById2 = this.overlayRoot.findViewById(C10110R.C10112id.chathead_text_container);
        findViewById2.setPivotX(0.0f);
        performReplyPulse(findViewById2, findViewById, runnable);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected void updateContentContainer(Part part) {
        setBodyText(part);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification, io.intercom.android.sdk.overlay.InAppNotification
    protected void updateViewDataDuringReplyPulse(int i) {
        AvatarUtils.loadAvatarIntoView(this.conversation.getLastAdmin().getAvatar(), (ImageView) this.overlayRoot.findViewById(C10110R.C10112id.chathead_avatar), this.appConfigProvider.get(), this.requestManager);
        ((TextView) this.overlayRoot.findViewById(C10110R.C10112id.chathead_text_header)).setText(getHeaderText());
        setBodyText(this.conversation.getLastPart());
    }
}
