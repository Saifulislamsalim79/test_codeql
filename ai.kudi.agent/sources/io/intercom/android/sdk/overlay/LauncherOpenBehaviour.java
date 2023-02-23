package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.text.TextUtils;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomMessengerActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.state.UiState;
import io.intercom.android.sdk.store.Store;
import java.util.Set;
/* loaded from: classes3.dex */
public class LauncherOpenBehaviour {
    private final AppConfig appConfig;
    private final LauncherType launcherType;
    private final MetricTracker metricTracker;
    private final Store<State> store;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.overlay.LauncherOpenBehaviour$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C103821 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$state$UiState$Screen;

        static {
            int[] iArr = new int[UiState.Screen.values().length];
            $SwitchMap$io$intercom$android$sdk$state$UiState$Screen = iArr;
            try {
                iArr[UiState.Screen.CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$state$UiState$Screen[UiState.Screen.COMPOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$state$UiState$Screen[UiState.Screen.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum LauncherType {
        DEFAULT,
        CUSTOM
    }

    public LauncherOpenBehaviour(Store<State> store, LauncherType launcherType, MetricTracker metricTracker, Provider<AppConfig> provider) {
        this.store = store;
        this.launcherType = launcherType;
        this.metricTracker = metricTracker;
        this.appConfig = provider.get();
    }

    private void openLastOrDefaultState(Context context) {
        UiState uiState = this.store.state().uiState();
        int i = C103821.$SwitchMap$io$intercom$android$sdk$state$UiState$Screen[uiState.screen().ordinal()];
        if (i != 1) {
            if (i != 2) {
                presentHome(context);
                return;
            } else {
                presentComposer(context);
                return;
            }
        }
        String conversationId = uiState.conversationId();
        if (TextUtils.isEmpty(conversationId)) {
            presentHome(context);
        } else {
            presentConversation(context, conversationId);
        }
    }

    private void presentComposer(Context context) {
        this.metricTracker.openedMessengerNewConversation(this.launcherType);
        context.startActivity(IntercomMessengerActivity.openComposer(context, ""));
    }

    private void presentConversation(Context context, String str) {
        this.metricTracker.openedMessengerConversation(str, this.launcherType);
        context.startActivity(IntercomMessengerActivity.openConversation(context, str, LastParticipatingAdmin.NULL));
    }

    private void presentHome(Context context) {
        this.metricTracker.openedHomeScreen(this.launcherType);
        context.startActivity(IntercomMessengerActivity.openHomeScreen(context));
    }

    public void openMessenger(Context context) {
        Set<String> unreadConversationIds = this.store.state().unreadConversationIds();
        if (unreadConversationIds.size() == 1) {
            presentConversation(context, unreadConversationIds.iterator().next());
        } else if (this.appConfig.isInboundMessages() && !this.store.state().hasConversations() && this.appConfig.getHomeScreenCardCount() == 0) {
            presentComposer(context);
        } else {
            openLastOrDefaultState(context);
        }
    }
}
