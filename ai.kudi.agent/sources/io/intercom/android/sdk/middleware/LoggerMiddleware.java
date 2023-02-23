package io.intercom.android.sdk.middleware;

import android.app.Activity;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class LoggerMiddleware<S> implements Store.Middleware<S> {
    private final Twig twig;

    /* renamed from: io.intercom.android.sdk.middleware.LoggerMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103131 {
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
        }
    }

    public LoggerMiddleware(Twig twig) {
        this.twig = twig;
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<S> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        Twig twig = this.twig;
        twig.m13065i("Dispatched Action: " + action.toString(), new Object[0]);
        int i = C103131.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1) {
            Twig twig2 = this.twig;
            twig2.m13065i("Ready to show in-app messages in " + ((Activity) action.value()), new Object[0]);
        } else if (i != 2) {
        } else {
            Twig twig3 = this.twig;
            twig3.m13065i(((Activity) action.value()) + " was paused", new Object[0]);
        }
    }
}
