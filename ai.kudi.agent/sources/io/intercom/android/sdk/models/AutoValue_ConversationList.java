package io.intercom.android.sdk.models;

import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
final class AutoValue_ConversationList extends ConversationList {
    private final List<Conversation> getConversations;
    private final Set<String> getUnreadConversationIds;
    private final boolean hasMorePages;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ConversationList(List<Conversation> list, Set<String> set, boolean z) {
        if (list != null) {
            this.getConversations = list;
            if (set != null) {
                this.getUnreadConversationIds = set;
                this.hasMorePages = z;
                return;
            }
            throw new NullPointerException("Null getUnreadConversationIds");
        }
        throw new NullPointerException("Null getConversations");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationList) {
            ConversationList conversationList = (ConversationList) obj;
            return this.getConversations.equals(conversationList.getConversations()) && this.getUnreadConversationIds.equals(conversationList.getUnreadConversationIds()) && this.hasMorePages == conversationList.hasMorePages();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public List<Conversation> getConversations() {
        return this.getConversations;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public Set<String> getUnreadConversationIds() {
        return this.getUnreadConversationIds;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        return ((((this.getConversations.hashCode() ^ 1000003) * 1000003) ^ this.getUnreadConversationIds.hashCode()) * 1000003) ^ (this.hasMorePages ? 1231 : 1237);
    }

    public String toString() {
        return "ConversationList{getConversations=" + this.getConversations + ", getUnreadConversationIds=" + this.getUnreadConversationIds + ", hasMorePages=" + this.hasMorePages + "}";
    }
}
