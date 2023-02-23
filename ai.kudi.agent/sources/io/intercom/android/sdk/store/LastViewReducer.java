package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.UiState;
import io.intercom.android.sdk.store.Store;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class LastViewReducer implements Store.Reducer<UiState> {
    static final UiState INITIAL_STATE = UiState.create(UiState.Screen.NONE, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.LastViewReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104181 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.HOME_OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.INBOX_OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_CONVERSATION_SCREEN_OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.CONVERSATION_OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_CONVERSATION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SOFT_RESET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ UiState reduce(Action action, UiState uiState) {
        return reduce2((Action<?>) action, uiState);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public UiState reduce2(Action<?> action, UiState uiState) {
        switch (C104181.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()]) {
            case 1:
                return UiState.create(UiState.Screen.HOME, null);
            case 2:
                return UiState.create(UiState.Screen.INBOX, null);
            case 3:
                return UiState.create(UiState.Screen.COMPOSER, null);
            case 4:
                return UiState.create(UiState.Screen.CONVERSATION, (String) action.value());
            case 5:
                return UiState.create(UiState.Screen.CONVERSATION, ((Conversation) action.value()).getId());
            case 6:
            case 7:
                return UiState.create(UiState.Screen.NONE, null);
            default:
                return uiState;
        }
    }
}
