package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes3.dex */
public class AppConfigMiddleware implements Store.Middleware<State> {
    private final Provider<AppConfig> appConfigProvider;
    private final C11129b bus;

    /* renamed from: io.intercom.android.sdk.middleware.AppConfigMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103101 {
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

    public AppConfigMiddleware(Provider<AppConfig> provider, C11129b c11129b) {
        this.appConfigProvider = provider;
        this.bus = c11129b;
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        int i = C103101.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            this.appConfigProvider.get().update(((BaseResponse) action.value()).getConfig(), this.bus);
        } else if (i != 2) {
        } else {
            this.appConfigProvider.get().resetRealTimeConfig();
        }
    }
}
