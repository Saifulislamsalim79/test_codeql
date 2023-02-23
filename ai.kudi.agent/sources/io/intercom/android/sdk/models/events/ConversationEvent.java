package io.intercom.android.sdk.models.events;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class ConversationEvent {

    /* loaded from: classes3.dex */
    public static final class Builder {
        private final Conversation conversation;
        private Boolean isAttributeUpdated;

        public Builder(Conversation conversation) {
            this.conversation = conversation;
        }

        public ConversationEvent build() {
            Conversation conversation = this.conversation;
            if (conversation == null) {
                conversation = new Conversation();
            }
            return new AutoValue_ConversationEvent(conversation, NullSafety.valueOrDefault(this.isAttributeUpdated, false));
        }

        public Builder isAttributeUpdated(boolean z) {
            this.isAttributeUpdated = Boolean.valueOf(z);
            return this;
        }
    }

    public abstract Conversation getResponse();

    public abstract boolean isAttributeUpdated();
}
