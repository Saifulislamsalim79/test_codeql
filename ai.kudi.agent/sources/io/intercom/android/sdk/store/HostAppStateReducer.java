package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.state.HostAppState;
import io.intercom.android.sdk.store.Store;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class HostAppStateReducer implements Store.Reducer<HostAppState> {
    static final HostAppState INITIAL_STATE = HostAppState.create(true, false, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.HostAppStateReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104151 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.APP_ENTERED_FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.APP_ENTERED_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ HostAppState reduce(Action action, HostAppState hostAppState) {
        return reduce2((Action<?>) action, hostAppState);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public HostAppState reduce2(Action<?> action, HostAppState hostAppState) {
        int i = C104151.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? hostAppState : HostAppState.create(hostAppState.isBackgrounded(), false, hostAppState.backgroundedTimestamp());
                }
                return HostAppState.create(hostAppState.isBackgrounded(), true, hostAppState.backgroundedTimestamp());
            }
            return HostAppState.create(true, hostAppState.sessionStartedSinceLastBackgrounded(), ((Long) action.value()).longValue());
        }
        return HostAppState.create(false, false, hostAppState.backgroundedTimestamp());
    }
}
