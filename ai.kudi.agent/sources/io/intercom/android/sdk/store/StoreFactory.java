package io.intercom.android.sdk.store;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.UserUpdateBatcher;
import io.intercom.android.sdk.conversation.SoundPlayer;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.middleware.ApiMiddleware;
import io.intercom.android.sdk.middleware.AppConfigMiddleware;
import io.intercom.android.sdk.middleware.AudioMiddleware;
import io.intercom.android.sdk.middleware.FirstMessageMiddleware;
import io.intercom.android.sdk.middleware.LoggerMiddleware;
import io.intercom.android.sdk.middleware.MetricTrackerMiddleware;
import io.intercom.android.sdk.middleware.NexusClientMiddleware;
import io.intercom.android.sdk.middleware.OperatorClientConditionsMiddleware;
import io.intercom.android.sdk.middleware.OverlayPresenterMiddleware;
import io.intercom.android.sdk.middleware.UserIdentityMiddleware;
import io.intercom.android.sdk.middleware.UserUpdateBatcherMiddleware;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.twig.Twig;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes3.dex */
public class StoreFactory {
    public static Store<State> createStore(Provider<Api> provider, Provider<AppConfig> provider2, Provider<NexusClient> provider3, Provider<OverlayPresenter> provider4, Provider<UserUpdateBatcher> provider5, SoundPlayer soundPlayer, Provider<UserIdentity> provider6, Context context, Twig twig, C11129b c11129b, Provider<MetricTracker> provider7) {
        return new Store<>(new StateReducer(new HasConversationsReducer(), new LastViewReducer(), new TeamPresenceReducer(), new UnreadConversationsReducer(), new InboxStateReducer(), new HostAppStateReducer(), new OverlayStateReducer(), new ActiveConversationStateReducer(), new ComposerSuggestionsReducer()), State.create(false, LastViewReducer.INITIAL_STATE, TeamPresenceReducer.INITIAL_STATE, UnreadConversationsReducer.INITIAL_STATE, InboxStateReducer.INITIAL_STATE, HostAppStateReducer.INITIAL_STATE, OverlayStateReducer.INITIAL_STATE, ActiveConversationStateReducer.INITIAL_STATE, ComposerSuggestionsReducer.INITIAL_STATE), new LoggerMiddleware(twig), new ApiMiddleware(provider), new UserUpdateBatcherMiddleware(provider5, provider2, provider6), new NexusClientMiddleware(provider3, provider2, new Handler(Looper.getMainLooper())), new OverlayPresenterMiddleware(provider4), new AudioMiddleware(soundPlayer, provider6), new FirstMessageMiddleware(twig, context), new UserIdentityMiddleware(provider6), new AppConfigMiddleware(provider2, c11129b), new MetricTrackerMiddleware(provider7), new OperatorClientConditionsMiddleware(provider, new Handler(Looper.getMainLooper())));
    }
}
