package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;
/* loaded from: classes3.dex */
public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;

    /* loaded from: classes3.dex */
    public static class Builder extends BaseResponse.Builder {
        ConversationList.Builder unread_conversations;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public UsersResponse build() {
            return new UsersResponse(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UsersResponse(Builder builder) {
        super(builder);
        ConversationList build;
        ConversationList.Builder builder2 = builder.unread_conversations;
        if (builder2 == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder2.build();
        }
        this.unreadConversations = build;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }
}
