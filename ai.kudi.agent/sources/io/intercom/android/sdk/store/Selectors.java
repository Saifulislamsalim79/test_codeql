package io.intercom.android.sdk.store;

import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class Selectors {
    public static final Store.Selector<State, Integer> UNREAD_COUNT = new Store.Selector<State, Integer>() { // from class: io.intercom.android.sdk.store.Selectors.1
        @Override // io.intercom.android.sdk.store.Store.Selector
        public Integer transform(State state) {
            return Integer.valueOf(state.unreadConversationIds().size());
        }
    };
    public static final Store.Selector<State, InboxState> INBOX = new Store.Selector<State, InboxState>() { // from class: io.intercom.android.sdk.store.Selectors.2
        @Override // io.intercom.android.sdk.store.Store.Selector
        public InboxState transform(State state) {
            return state.inboxState();
        }
    };
    public static final Store.Selector<State, Boolean> APP_IS_BACKGROUNDED = new Store.Selector<State, Boolean>() { // from class: io.intercom.android.sdk.store.Selectors.3
        @Override // io.intercom.android.sdk.store.Store.Selector
        public Boolean transform(State state) {
            return Boolean.valueOf(state.hostAppState().isBackgrounded());
        }
    };
    public static final Store.Selector<State, Boolean> SESSION_STARTED_SINCE_LAST_BACKGROUNDED = new Store.Selector<State, Boolean>() { // from class: io.intercom.android.sdk.store.Selectors.4
        @Override // io.intercom.android.sdk.store.Store.Selector
        public Boolean transform(State state) {
            return Boolean.valueOf(state.hostAppState().sessionStartedSinceLastBackgrounded());
        }
    };
    public static final Store.Selector<State, OverlayState> OVERLAY = new Store.Selector<State, OverlayState>() { // from class: io.intercom.android.sdk.store.Selectors.5
        @Override // io.intercom.android.sdk.store.Store.Selector
        public OverlayState transform(State state) {
            return state.overlayState();
        }
    };
    public static final Store.Selector<State, TeamPresence> TEAM_PRESENCE = new Store.Selector<State, TeamPresence>() { // from class: io.intercom.android.sdk.store.Selectors.6
        @Override // io.intercom.android.sdk.store.Store.Selector
        public TeamPresence transform(State state) {
            return state.teamPresence();
        }
    };
    public static final Store.Selector<State, ComposerSuggestions> COMPOSER_SUGGESTIONS = new Store.Selector<State, ComposerSuggestions>() { // from class: io.intercom.android.sdk.store.Selectors.7
        @Override // io.intercom.android.sdk.store.Store.Selector
        public ComposerSuggestions transform(State state) {
            return state.composerSuggestions();
        }
    };
}
