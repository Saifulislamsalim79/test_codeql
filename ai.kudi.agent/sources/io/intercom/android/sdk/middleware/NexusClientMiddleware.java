package io.intercom.android.sdk.middleware;

import android.os.Handler;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusConfig;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class NexusClientMiddleware implements Store.Middleware<State> {
    private final Provider<AppConfig> appConfigProvider;
    private final Runnable disconnectRunnable = new Runnable() { // from class: io.intercom.android.sdk.middleware.NexusClientMiddleware.1
        @Override // java.lang.Runnable
        public void run() {
            NexusClientMiddleware.this.client().disconnect();
        }
    };
    private final Handler handler;
    private final Provider<NexusClient> nexusClient;

    /* renamed from: io.intercom.android.sdk.middleware.NexusClientMiddleware$2 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103162 {
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
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SOFT_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.BASE_RESPONSE_RECEIVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public NexusClientMiddleware(Provider<NexusClient> provider, Provider<AppConfig> provider2, Handler handler) {
        this.nexusClient = provider;
        this.appConfigProvider = provider2;
        this.handler = handler;
    }

    private void connectWithConfig(NexusConfig nexusConfig) {
        this.handler.removeCallbacks(this.disconnectRunnable);
        client().connect(nexusConfig, true);
    }

    private void disconnectImmediately() {
        this.handler.removeCallbacks(this.disconnectRunnable);
        client().disconnect();
    }

    private void scheduleDisconnect() {
        this.handler.removeCallbacks(this.disconnectRunnable);
        this.handler.postDelayed(this.disconnectRunnable, this.appConfigProvider.get().getNewSessionThresholdMs());
    }

    NexusClient client() {
        return this.nexusClient.get();
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        int i = C103162.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            connectWithConfig(this.appConfigProvider.get().getRealTimeConfig());
        } else if (i == 2) {
            scheduleDisconnect();
        } else if (i == 3) {
            disconnectImmediately();
        } else if (i != 4) {
        } else {
            NexusConfig realTimeConfig = ((BaseResponse) action.value()).getConfig().getRealTimeConfig();
            if (realTimeConfig.getEndpoints().isEmpty()) {
                disconnectImmediately();
            } else if (((Boolean) store.select(Selectors.APP_IS_BACKGROUNDED)).booleanValue()) {
            } else {
                connectWithConfig(realTimeConfig);
            }
        }
    }
}
