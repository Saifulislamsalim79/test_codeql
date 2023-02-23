package io.intercom.android.sdk.middleware;

import android.app.Activity;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class OverlayPresenterMiddleware implements Store.Middleware<State> {
    private final Provider<OverlayPresenter> presenterProvider;

    /* renamed from: io.intercom.android.sdk.middleware.OverlayPresenterMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103181 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.ACTIVITY_READY_FOR_VIEW_ATTACHMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.APP_ENTERED_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public OverlayPresenterMiddleware(Provider<OverlayPresenter> provider) {
        this.presenterProvider = provider;
    }

    private OverlayPresenter presenter() {
        return this.presenterProvider.get();
    }

    private void removeOverlays(Activity activity) {
        if (activity != null) {
            presenter().removeOverlaysIfPresent(activity);
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        OverlayState overlayState = (OverlayState) store.select(Selectors.OVERLAY);
        Activity pausedHostActivity = overlayState.pausedHostActivity();
        Activity resumedHostActivity = overlayState.resumedHostActivity();
        int i = C103181.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i != 1) {
            if (i == 2) {
                removeOverlays(pausedHostActivity);
            } else if (i != 3) {
                if (i == 4) {
                    presenter().cancelAnimations();
                    removeOverlays(pausedHostActivity);
                    removeOverlays(resumedHostActivity);
                }
            } else if (((Activity) action.value()) == pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else if (((Activity) action.value()) != pausedHostActivity) {
            removeOverlays(pausedHostActivity);
        }
        nextDispatcher.dispatch(action);
    }
}
