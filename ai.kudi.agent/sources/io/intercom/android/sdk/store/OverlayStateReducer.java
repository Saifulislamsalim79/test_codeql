package io.intercom.android.sdk.store;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.ActivityUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class OverlayStateReducer implements Store.Reducer<OverlayState> {
    static final OverlayState INITIAL_STATE = OverlayState.create(Collections.emptyList(), Collections.emptySet(), Intercom.Visibility.VISIBLE, Intercom.Visibility.GONE, null, null, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.OverlayStateReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104191 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.SET_IN_APP_NOTIFICATION_VISIBILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SET_LAUNCHER_VISIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SET_BOTTOM_PADDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_MARKED_AS_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_MARKED_AS_DISMISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.UNREAD_CONVERSATIONS_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_READY_FOR_VIEW_ATTACHMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_PAUSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_STOPPED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.APP_ENTERED_BACKGROUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static OverlayState newStateIfNewHostActivity(OverlayState overlayState, Activity activity, Activity activity2) {
        return (overlayState.resumedHostActivity() == activity && overlayState.pausedHostActivity() == activity2) ? overlayState : overlayState.toBuilder().resumedHostActivity(activity).pausedHostActivity(activity2).build();
    }

    private static void removeBadgeConversations(List<Conversation> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).getLastPart().getDeliveryOption() == Part.DeliveryOption.BADGE) {
                list.remove(size);
            }
        }
    }

    private static void removeConversationWithId(List<Conversation> list, String str) {
        for (Conversation conversation : list) {
            if (conversation.getId().equals(str)) {
                list.remove(conversation);
                return;
            }
        }
    }

    private static void removeDismissedConversations(List<Conversation> list, Set<String> set) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (set.contains(list.get(size).getLastPart().getId())) {
                list.remove(size);
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ OverlayState reduce(Action action, OverlayState overlayState) {
        return reduce2((Action<?>) action, overlayState);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public OverlayState reduce2(Action<?> action, OverlayState overlayState) {
        switch (C104191.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()]) {
            case 1:
                return overlayState.toBuilder().notificationVisibility((Intercom.Visibility) action.value()).build();
            case 2:
                return overlayState.toBuilder().launcherVisibility((Intercom.Visibility) action.value()).build();
            case 3:
                return overlayState.toBuilder().bottomPadding(((Integer) action.value()).intValue()).build();
            case 4:
                return overlayState.toBuilder().conversations(Collections.emptyList()).dismissedPartIds(Collections.emptySet()).build();
            case 5:
                ArrayList arrayList = new ArrayList(overlayState.conversations());
                removeConversationWithId(arrayList, (String) action.value());
                return overlayState.toBuilder().conversations(arrayList).build();
            case 6:
                ArrayList arrayList2 = new ArrayList(overlayState.conversations());
                HashSet hashSet = new HashSet(overlayState.dismissedPartIds());
                hashSet.add(((Conversation) action.value()).getLastPart().getId());
                removeDismissedConversations(arrayList2, hashSet);
                return overlayState.toBuilder().conversations(arrayList2).dismissedPartIds(hashSet).build();
            case 7:
                ArrayList arrayList3 = new ArrayList(((UsersResponse) action.value()).getUnreadConversations().getConversations());
                removeDismissedConversations(arrayList3, overlayState.dismissedPartIds());
                removeBadgeConversations(arrayList3);
                return overlayState.toBuilder().conversations(arrayList3).build();
            case 8:
                Activity activity = (Activity) action.value();
                if (!ActivityUtils.isHostActivity(activity) && !ActivityUtils.isFullScreenHelpCenter(activity)) {
                    activity = null;
                }
                return newStateIfNewHostActivity(overlayState, activity, null);
            case 9:
                return newStateIfNewHostActivity(overlayState, null, (Activity) action.value());
            case 10:
                return newStateIfNewHostActivity(overlayState, overlayState.resumedHostActivity(), ((Activity) action.value()) != overlayState.pausedHostActivity() ? overlayState.pausedHostActivity() : null);
            case 11:
                return newStateIfNewHostActivity(overlayState, null, null);
            default:
                return overlayState;
        }
    }
}
