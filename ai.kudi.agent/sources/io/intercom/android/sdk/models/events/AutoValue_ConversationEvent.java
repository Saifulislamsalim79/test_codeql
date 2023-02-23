package io.intercom.android.sdk.models.events;

import io.intercom.android.sdk.models.Conversation;
/* loaded from: classes3.dex */
final class AutoValue_ConversationEvent extends ConversationEvent {
    private final boolean attributeUpdated;
    private final Conversation response;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ConversationEvent(Conversation conversation, boolean z) {
        if (conversation != null) {
            this.response = conversation;
            this.attributeUpdated = z;
            return;
        }
        throw new NullPointerException("Null response");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationEvent) {
            ConversationEvent conversationEvent = (ConversationEvent) obj;
            return this.response.equals(conversationEvent.getResponse()) && this.attributeUpdated == conversationEvent.isAttributeUpdated();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.events.ConversationEvent
    public Conversation getResponse() {
        return this.response;
    }

    public int hashCode() {
        return ((this.response.hashCode() ^ 1000003) * 1000003) ^ (this.attributeUpdated ? 1231 : 1237);
    }

    @Override // io.intercom.android.sdk.models.events.ConversationEvent
    public boolean isAttributeUpdated() {
        return this.attributeUpdated;
    }

    public String toString() {
        return "ConversationEvent{response=" + this.response + ", attributeUpdated=" + this.attributeUpdated + "}";
    }
}
