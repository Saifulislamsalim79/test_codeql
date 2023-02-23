package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.state.ActiveConversationState;
import io.intercom.android.sdk.state.HostAppState;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.state.UiState;
import io.intercom.android.sdk.store.Store;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StateReducer implements Store.Reducer<State> {
    private final Store.Reducer<ActiveConversationState> activeConversationStateReducer;
    private final Store.Reducer<ComposerSuggestions> composerSuggestionsReducer;
    private final Store.Reducer<Boolean> hasConversationsReducer;
    private final Store.Reducer<HostAppState> hostAppStateReducer;
    private final Store.Reducer<InboxState> inboxStateReducer;
    private final Store.Reducer<OverlayState> overlayStateReducer;
    private final Store.Reducer<TeamPresence> teamPresenceReducer;
    private final Store.Reducer<UiState> uiStateReducer;
    private final Store.Reducer<Set<String>> unreadConversationIdsReducer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StateReducer(Store.Reducer<Boolean> reducer, Store.Reducer<UiState> reducer2, Store.Reducer<TeamPresence> reducer3, Store.Reducer<Set<String>> reducer4, Store.Reducer<InboxState> reducer5, Store.Reducer<HostAppState> reducer6, Store.Reducer<OverlayState> reducer7, Store.Reducer<ActiveConversationState> reducer8, Store.Reducer<ComposerSuggestions> reducer9) {
        this.hasConversationsReducer = reducer;
        this.uiStateReducer = reducer2;
        this.teamPresenceReducer = reducer3;
        this.unreadConversationIdsReducer = reducer4;
        this.inboxStateReducer = reducer5;
        this.hostAppStateReducer = reducer6;
        this.overlayStateReducer = reducer7;
        this.activeConversationStateReducer = reducer8;
        this.composerSuggestionsReducer = reducer9;
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ State reduce(Action action, State state) {
        return reduce2((Action<?>) action, state);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public State reduce2(Action<?> action, State state) {
        return State.create(this.hasConversationsReducer.reduce(action, Boolean.valueOf(state.hasConversations())).booleanValue(), this.uiStateReducer.reduce(action, state.uiState()), this.teamPresenceReducer.reduce(action, state.teamPresence()), this.unreadConversationIdsReducer.reduce(action, state.unreadConversationIds()), this.inboxStateReducer.reduce(action, state.inboxState()), this.hostAppStateReducer.reduce(action, state.hostAppState()), this.overlayStateReducer.reduce(action, state.overlayState()), this.activeConversationStateReducer.reduce(action, state.activeConversationState()), this.composerSuggestionsReducer.reduce(action, state.composerSuggestions()));
    }
}
