package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.api.UserUpdateBatcher;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class UserUpdateBatcherMiddleware implements Store.Middleware<State> {
    private final Provider<AppConfig> appConfigProvider;
    private final Provider<UserIdentity> userIdentityProvider;
    private final Provider<UserUpdateBatcher> userUpdateBatcher;

    /* renamed from: io.intercom.android.sdk.middleware.UserUpdateBatcherMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103201 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.APP_ENTERED_FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public UserUpdateBatcherMiddleware(Provider<UserUpdateBatcher> provider, Provider<AppConfig> provider2, Provider<UserIdentity> provider3) {
        this.appConfigProvider = provider2;
        this.userUpdateBatcher = provider;
        this.userIdentityProvider = provider3;
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        if (C103201.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()] == 1 && ((Long) action.value()).longValue() - store.state().hostAppState().backgroundedTimestamp() > this.appConfigProvider.get().getNewSessionThresholdMs() && this.userIdentityProvider.get().identityExists() && !((Boolean) store.select(Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED)).booleanValue()) {
            this.userUpdateBatcher.get().updateUser(new UserUpdateRequest(true, ((Boolean) store.select(Selectors.APP_IS_BACKGROUNDED)).booleanValue(), true));
        }
    }
}
