package io.intercom.android.sdk.middleware;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class FirstMessageMiddleware implements Store.Middleware<State> {
    private final Context context;
    private final Twig twig;

    /* renamed from: io.intercom.android.sdk.middleware.FirstMessageMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103121 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.BASE_RESPONSE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public FirstMessageMiddleware(Twig twig, Context context) {
        this.twig = twig;
        this.context = context;
    }

    private void showFirstMessageToast() {
        View inflate = LayoutInflater.from(this.context).inflate(C10110R.C10113layout.intercom_onboarding_layout, (ViewGroup) null);
        Toast toast = new Toast(this.context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(inflate);
        toast.show();
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        if (C103121.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()] == 1 && ((BaseResponse) action.value()).getConfig().isFirstRequest()) {
            this.twig.m13065i(this.context.getString(C10110R.string.intercom_android_activated_message), new Object[0]);
            try {
                showFirstMessageToast();
            } catch (Exception e) {
                Twig twig = this.twig;
                twig.internal("Couldn't show first message toast: " + e.getMessage());
            }
        }
    }
}
