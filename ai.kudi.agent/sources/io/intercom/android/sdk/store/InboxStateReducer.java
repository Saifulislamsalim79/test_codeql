package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.HomeCardsResponse;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.ReplyPart;
import io.intercom.android.sdk.store.Store;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class InboxStateReducer implements Store.Reducer<InboxState> {
    static final InboxState INITIAL_STATE = InboxState.create(Collections.emptyList(), InboxState.Status.INITIAL, true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.InboxStateReducer$2 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104172 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.FETCH_INBOX_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_BEFORE_DATE_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_MARKED_AS_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_REPLY_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_CONVERSATION_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_CONVERSATION_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_HOME_CARDS_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SOFT_RESET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void addConversationAtTop(List<Conversation> list, Conversation conversation) {
        list.add(0, conversation);
    }

    private void markConversationAsRead(String str, List<Conversation> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Conversation conversation = list.get(i);
            if (str.equals(conversation.getId())) {
                list.set(i, conversation.withRead(true));
            }
        }
    }

    private List<Conversation> mergeConversationLists(List<Conversation> list, List<Conversation> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        HashSet hashSet = new HashSet(list2.size());
        for (Conversation conversation : list2) {
            hashSet.add(conversation.getId());
            arrayList.add(conversation);
        }
        for (Conversation conversation2 : list) {
            if (!hashSet.contains(conversation2.getId())) {
                arrayList.add(conversation2);
            }
        }
        return arrayList;
    }

    private void sortByLastPartDate(List<Conversation> list) {
        Collections.sort(list, new Comparator<Conversation>() { // from class: io.intercom.android.sdk.store.InboxStateReducer.1
            @Override // java.util.Comparator
            public int compare(Conversation conversation, Conversation conversation2) {
                return (int) (conversation2.getLastPart().getCreatedAt() - conversation.getLastPart().getCreatedAt());
            }
        });
    }

    private void updateOrAddConversation(Conversation conversation, List<Conversation> list) {
        for (int i = 0; i < list.size(); i++) {
            Conversation conversation2 = list.get(i);
            String id = conversation.getId();
            if (id != null && id.equals(conversation2.getId())) {
                list.set(i, conversation);
                return;
            }
        }
        addConversationAtTop(list, conversation);
    }

    private void updateRepliedConversationAndMoveToTop(ReplyPart replyPart, List<Conversation> list) {
        for (int i = 0; i < list.size(); i++) {
            Conversation conversation = list.get(i);
            if (replyPart.getConversationId().equals(conversation.getId())) {
                conversation.getParts().add(replyPart.getPart());
                list.remove(conversation);
                addConversationAtTop(list, conversation);
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ InboxState reduce(Action action, InboxState inboxState) {
        return reduce2((Action<?>) action, inboxState);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public InboxState reduce2(Action<?> action, InboxState inboxState) {
        switch (C104172.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()]) {
            case 1:
            case 2:
                return inboxState.status() == InboxState.Status.LOADING ? inboxState : InboxState.create(inboxState.conversations(), InboxState.Status.LOADING, inboxState.hasMorePages());
            case 3:
                ConversationsResponse conversationsResponse = (ConversationsResponse) action.value();
                List<Conversation> mergeConversationLists = mergeConversationLists(inboxState.conversations(), conversationsResponse.getConversationPage().getConversations());
                sortByLastPartDate(mergeConversationLists);
                return InboxState.create(mergeConversationLists, InboxState.Status.SUCCESS, conversationsResponse.getConversationPage().hasMorePages());
            case 4:
                return InboxState.create(inboxState.conversations(), InboxState.Status.FAILED, inboxState.hasMorePages());
            case 5:
                ArrayList arrayList = new ArrayList(inboxState.conversations());
                markConversationAsRead((String) action.value(), arrayList);
                return InboxState.create(arrayList, InboxState.Status.SUCCESS, inboxState.hasMorePages());
            case 6:
                ArrayList arrayList2 = new ArrayList(inboxState.conversations());
                updateRepliedConversationAndMoveToTop((ReplyPart) action.value(), arrayList2);
                return InboxState.create(arrayList2, InboxState.Status.SUCCESS, inboxState.hasMorePages());
            case 7:
                ArrayList arrayList3 = new ArrayList(inboxState.conversations());
                updateOrAddConversation((Conversation) action.value(), arrayList3);
                sortByLastPartDate(arrayList3);
                return InboxState.create(arrayList3, InboxState.Status.SUCCESS, inboxState.hasMorePages());
            case 8:
                ArrayList arrayList4 = new ArrayList(inboxState.conversations());
                updateOrAddConversation((Conversation) action.value(), arrayList4);
                return InboxState.create(arrayList4, InboxState.Status.SUCCESS, inboxState.hasMorePages());
            case 9:
                List<Conversation> mergeConversationLists2 = mergeConversationLists(inboxState.conversations(), ((HomeCardsResponse) action.value()).getConversations());
                sortByLastPartDate(mergeConversationLists2);
                return InboxState.create(mergeConversationLists2, InboxState.Status.SUCCESS, inboxState.hasMorePages());
            case 10:
            case 11:
                return INITIAL_STATE;
            default:
                return inboxState;
        }
    }
}
