package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class UserIdentityMiddleware implements Store.Middleware<State> {
    private final Provider<UserIdentity> userIdentityProvider;

    /* renamed from: io.intercom.android.sdk.middleware.UserIdentityMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103191 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.BASE_RESPONSE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SOFT_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UserIdentityMiddleware(Provider<UserIdentity> provider) {
        this.userIdentityProvider = provider;
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        int i = C103191.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            this.userIdentityProvider.get().update(((BaseResponse) action.value()).getUser());
        } else if (i == 2) {
            this.userIdentityProvider.get().softReset();
        } else if (i != 3) {
        } else {
            this.userIdentityProvider.get().hardReset();
        }
    }
}
