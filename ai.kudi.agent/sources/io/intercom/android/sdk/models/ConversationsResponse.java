package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;
/* loaded from: classes3.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    /* loaded from: classes3.dex */
    public static final class Builder extends BaseResponse.Builder {
        ConversationList.Builder conversation_page;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }
    }

    ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList build;
        ConversationList.Builder builder2 = builder.conversation_page;
        if (builder2 == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder2.build();
        }
        this.conversationPage = build;
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }
}
