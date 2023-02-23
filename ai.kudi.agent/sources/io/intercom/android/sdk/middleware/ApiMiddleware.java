package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class ApiMiddleware implements Store.Middleware<State> {
    private final Provider<Api> apiProvider;

    /* renamed from: io.intercom.android.sdk.middleware.ApiMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103091 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.CONVERSATION_MARKED_AS_DISMISSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_MARKED_AS_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_INBOX_BEFORE_DATE_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_COMMENT_EVENT_RECEIVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ApiMiddleware(Provider<Api> provider) {
        this.apiProvider = provider;
    }

    private Api api() {
        return this.apiProvider.get();
    }

    private void fetchDataForCurrentScreen(Store<State> store, String str) {
        if (((OverlayState) store.select(Selectors.OVERLAY)).resumedHostActivity() == null && !((Boolean) store.select(Selectors.APP_IS_BACKGROUNDED)).booleanValue()) {
            api().getConversation(str, store.state().activeConversationState().getClientAssignedUuid());
        } else {
            api().getUnreadConversations();
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        int i = C103091.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            api().markConversationAsDismissed(((Conversation) action.value()).getId());
        } else if (i == 2) {
            int size = ((OverlayState) store.select(Selectors.OVERLAY)).conversations().size();
            if (size != 1 || ((Integer) store.select(Selectors.UNREAD_COUNT)).intValue() <= size) {
                return;
            }
            api().getUnreadConversations();
        } else if (i == 3) {
            api().getInbox();
        } else if (i == 4) {
            api().getInboxBefore(((Long) action.value()).longValue());
        } else if (i != 5) {
        } else {
            fetchDataForCurrentScreen(store, (String) action.value());
        }
    }
}
