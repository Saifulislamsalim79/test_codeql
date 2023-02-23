package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.store.Store;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class UnreadConversationsReducer implements Store.Reducer<Set<String>> {
    static final Set<String> INITIAL_STATE = Collections.emptySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.UnreadConversationsReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104331 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.CONVERSATION_MARKED_AS_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.UNREAD_CONVERSATIONS_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_CONVERSATION_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ Set<String> reduce(Action action, Set<String> set) {
        return reduce2((Action<?>) action, set);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public Set<String> reduce2(Action<?> action, Set<String> set) {
        int i = C104331.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            HashSet hashSet = new HashSet(set);
            hashSet.remove((String) action.value());
            return hashSet;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return i != 5 ? set : INITIAL_STATE;
                }
                HashSet hashSet2 = new HashSet(set);
                Conversation conversation = (Conversation) action.value();
                if (conversation.isRead()) {
                    hashSet2.remove(conversation.getId());
                } else {
                    hashSet2.add(conversation.getId());
                }
                return hashSet2;
            }
            return new HashSet(((ConversationsResponse) action.value()).getConversationPage().getUnreadConversationIds());
        } else {
            return new HashSet(((UsersResponse) action.value()).getUnreadConversations().getUnreadConversationIds());
        }
    }
}
