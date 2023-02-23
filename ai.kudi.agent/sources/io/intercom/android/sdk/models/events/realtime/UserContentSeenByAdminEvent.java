package io.intercom.android.sdk.models.events.realtime;
/* loaded from: classes3.dex */
public class UserContentSeenByAdminEvent {
    private final String conversationId;

    public UserContentSeenByAdminEvent(String str) {
        this.conversationId = str;
    }

    public String getConversationId() {
        return this.conversationId;
    }
}
