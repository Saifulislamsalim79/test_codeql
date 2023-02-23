package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.store.Store;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class HasConversationsReducer implements Store.Reducer<Boolean> {
    static final boolean INITIAL_STATE = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.HasConversationsReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104141 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.BASE_RESPONSE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ Boolean reduce(Action action, Boolean bool) {
        return reduce2((Action<?>) action, bool);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public Boolean reduce2(Action<?> action, Boolean bool) {
        int i = C104141.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i != 1) {
            return i != 2 ? bool : Boolean.FALSE;
        }
        return Boolean.valueOf(((BaseResponse) action.value()).hasConversations());
    }
}
