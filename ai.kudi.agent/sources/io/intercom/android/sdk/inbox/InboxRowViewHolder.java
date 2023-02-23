package io.intercom.android.sdk.inbox;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.InboxRowLayout;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
class InboxRowViewHolder extends RecyclerView.AbstractC1620e0 implements View.OnClickListener {
    private final ConversationClickListener conversationClickListener;
    private final InboxRowLayout inboxRowLayout;
    private final C10486i requestManager;
    private final TimeFormatter timeFormatter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InboxRowViewHolder(InboxRowLayout inboxRowLayout, ConversationClickListener conversationClickListener, TimeFormatter timeFormatter, C10486i c10486i) {
        super(inboxRowLayout);
        this.conversationClickListener = conversationClickListener;
        this.timeFormatter = timeFormatter;
        this.requestManager = c10486i;
        inboxRowLayout.setOnClickListener(this);
        this.inboxRowLayout = inboxRowLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bindData(Conversation conversation, UserIdentity userIdentity, AppConfig appConfig, TeamPresence teamPresence) {
        this.inboxRowLayout.updateConversation(conversation, userIdentity, appConfig, teamPresence, this.requestManager, this.timeFormatter);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        if (adapterPosition != -1) {
            this.conversationClickListener.onConversationClicked(adapterPosition);
        }
    }
}
