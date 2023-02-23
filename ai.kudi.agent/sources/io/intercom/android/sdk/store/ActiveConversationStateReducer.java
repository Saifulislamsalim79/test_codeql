package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.ActiveConversationState;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class ActiveConversationStateReducer implements Store.Reducer<ActiveConversationState> {
    public static final ActiveConversationState INITIAL_STATE = ActiveConversationState.create("", false, false, "");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.ActiveConversationStateReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104111 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.COMPOSER_TYPED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_CLEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_INPUT_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_SEND_BUTTON_PRESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_CONVERSATION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_CONVERSATION_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_SUGGESTION_SELECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_OPENED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_CLOSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ ActiveConversationState reduce(Action action, ActiveConversationState activeConversationState) {
        return reduce2((Action<?>) action, activeConversationState);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public ActiveConversationState reduce2(Action<?> action, ActiveConversationState activeConversationState) {
        switch (C104111.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()]) {
            case 1:
                return ActiveConversationState.create(activeConversationState.getConversationId(), activeConversationState.hasSwitchedInputType(), true, "");
            case 2:
                return ActiveConversationState.create(activeConversationState.getConversationId(), activeConversationState.hasSwitchedInputType(), false, "");
            case 3:
                return ActiveConversationState.create(activeConversationState.getConversationId(), true, activeConversationState.hasTextInComposer(), "");
            case 4:
                return ActiveConversationState.create(activeConversationState.getConversationId(), INITIAL_STATE.hasSwitchedInputType(), INITIAL_STATE.hasTextInComposer(), "");
            case 5:
            case 6:
                return ActiveConversationState.create(((Conversation) action.value()).getId(), activeConversationState.hasSwitchedInputType(), activeConversationState.hasTextInComposer(), "");
            case 7:
                return ActiveConversationState.create(activeConversationState.getConversationId(), activeConversationState.hasSwitchedInputType(), activeConversationState.hasTextInComposer(), String.valueOf(action.value()));
            case 8:
                return ActiveConversationState.create((String) action.value(), activeConversationState.hasSwitchedInputType(), activeConversationState.hasTextInComposer(), "");
            case 9:
                return INITIAL_STATE;
            default:
                return activeConversationState;
        }
    }
}
