package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.HomeCard;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class HomeCardsResponse extends BaseResponse {
    private final List<HomeCard> cards;
    private final List<Conversation> conversations;
    private final boolean hasMoreConversations;

    /* loaded from: classes3.dex */
    public static class Builder extends BaseResponse.Builder {
        List<HomeCard.Builder> cards;
        List<Conversation.Builder> conversations;
        boolean has_more_conversations;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public HomeCardsResponse build() {
            return new HomeCardsResponse(this);
        }
    }

    HomeCardsResponse(Builder builder) {
        super(builder);
        this.conversations = new ArrayList();
        List<Conversation.Builder> list = builder.conversations;
        if (list != null) {
            for (Conversation.Builder builder2 : list) {
                this.conversations.add(builder2.build());
            }
        }
        this.cards = new ArrayList();
        List<HomeCard.Builder> list2 = builder.cards;
        if (list2 != null) {
            for (HomeCard.Builder builder3 : list2) {
                this.cards.add(builder3.build());
            }
        }
        this.hasMoreConversations = builder.has_more_conversations;
    }

    public List<HomeCard> getCards() {
        return this.cards;
    }

    public List<Conversation> getConversations() {
        return this.conversations;
    }

    public boolean hasMoreConversations() {
        return this.hasMoreConversations;
    }
}
