package io.intercom.android.sdk.models;

import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
public abstract class ConversationList {

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Conversation.Builder> conversations;
        boolean more_pages_available;
        List<String> unread_conversation_ids;

        public ConversationList build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.conversations));
            List<Conversation.Builder> list = this.conversations;
            if (list != null) {
                for (Conversation.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            HashSet hashSet = new HashSet(CollectionUtils.capacityFor(this.unread_conversation_ids));
            List<String> list2 = this.unread_conversation_ids;
            if (list2 != null) {
                for (String str : list2) {
                    if (str != null) {
                        hashSet.add(str);
                    }
                }
            }
            return ConversationList.create(arrayList, hashSet, this.more_pages_available);
        }
    }

    public static ConversationList create(List<Conversation> list, Set<String> set, boolean z) {
        return new AutoValue_ConversationList(list, set, z);
    }

    public abstract List<Conversation> getConversations();

    public abstract Set<String> getUnreadConversationIds();

    public abstract boolean hasMorePages();
}
