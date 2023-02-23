package io.intercom.android.sdk.models.events;

import io.intercom.android.sdk.models.Conversation;
/* loaded from: classes3.dex */
public class NewTriggerConversationEvent {
    private final Conversation conversation;
    private final String partId;

    public NewTriggerConversationEvent(Conversation conversation, String str) {
        this.conversation = conversation;
        this.partId = str;
    }

    public Conversation getConversation() {
        return this.conversation;
    }

    public String getPartId() {
        return this.partId;
    }
}
