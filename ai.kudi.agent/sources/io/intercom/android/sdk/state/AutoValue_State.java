package io.intercom.android.sdk.state;

import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.TeamPresence;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_State extends State {
    private final ActiveConversationState activeConversationState;
    private final ComposerSuggestions composerSuggestions;
    private final boolean hasConversations;
    private final HostAppState hostAppState;
    private final InboxState inboxState;
    private final OverlayState overlayState;
    private final TeamPresence teamPresence;
    private final UiState uiState;
    private final Set<String> unreadConversationIds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_State(boolean z, UiState uiState, TeamPresence teamPresence, Set<String> set, InboxState inboxState, HostAppState hostAppState, OverlayState overlayState, ActiveConversationState activeConversationState, ComposerSuggestions composerSuggestions) {
        this.hasConversations = z;
        if (uiState != null) {
            this.uiState = uiState;
            if (teamPresence != null) {
                this.teamPresence = teamPresence;
                if (set != null) {
                    this.unreadConversationIds = set;
                    if (inboxState != null) {
                        this.inboxState = inboxState;
                        if (hostAppState != null) {
                            this.hostAppState = hostAppState;
                            if (overlayState != null) {
                                this.overlayState = overlayState;
                                if (activeConversationState != null) {
                                    this.activeConversationState = activeConversationState;
                                    if (composerSuggestions != null) {
                                        this.composerSuggestions = composerSuggestions;
                                        return;
                                    }
                                    throw new NullPointerException("Null composerSuggestions");
                                }
                                throw new NullPointerException("Null activeConversationState");
                            }
                            throw new NullPointerException("Null overlayState");
                        }
                        throw new NullPointerException("Null hostAppState");
                    }
                    throw new NullPointerException("Null inboxState");
                }
                throw new NullPointerException("Null unreadConversationIds");
            }
            throw new NullPointerException("Null teamPresence");
        }
        throw new NullPointerException("Null uiState");
    }

    @Override // io.intercom.android.sdk.state.State
    public ActiveConversationState activeConversationState() {
        return this.activeConversationState;
    }

    @Override // io.intercom.android.sdk.state.State
    public ComposerSuggestions composerSuggestions() {
        return this.composerSuggestions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof State) {
            State state = (State) obj;
            return this.hasConversations == state.hasConversations() && this.uiState.equals(state.uiState()) && this.teamPresence.equals(state.teamPresence()) && this.unreadConversationIds.equals(state.unreadConversationIds()) && this.inboxState.equals(state.inboxState()) && this.hostAppState.equals(state.hostAppState()) && this.overlayState.equals(state.overlayState()) && this.activeConversationState.equals(state.activeConversationState()) && this.composerSuggestions.equals(state.composerSuggestions());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.state.State
    public boolean hasConversations() {
        return this.hasConversations;
    }

    public int hashCode() {
        return (((((((((((((((((this.hasConversations ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.uiState.hashCode()) * 1000003) ^ this.teamPresence.hashCode()) * 1000003) ^ this.unreadConversationIds.hashCode()) * 1000003) ^ this.inboxState.hashCode()) * 1000003) ^ this.hostAppState.hashCode()) * 1000003) ^ this.overlayState.hashCode()) * 1000003) ^ this.activeConversationState.hashCode()) * 1000003) ^ this.composerSuggestions.hashCode();
    }

    @Override // io.intercom.android.sdk.state.State
    public HostAppState hostAppState() {
        return this.hostAppState;
    }

    @Override // io.intercom.android.sdk.state.State
    public InboxState inboxState() {
        return this.inboxState;
    }

    @Override // io.intercom.android.sdk.state.State
    public OverlayState overlayState() {
        return this.overlayState;
    }

    @Override // io.intercom.android.sdk.state.State
    public TeamPresence teamPresence() {
        return this.teamPresence;
    }

    public String toString() {
        return "State{hasConversations=" + this.hasConversations + ", uiState=" + this.uiState + ", teamPresence=" + this.teamPresence + ", unreadConversationIds=" + this.unreadConversationIds + ", inboxState=" + this.inboxState + ", hostAppState=" + this.hostAppState + ", overlayState=" + this.overlayState + ", activeConversationState=" + this.activeConversationState + ", composerSuggestions=" + this.composerSuggestions + "}";
    }

    @Override // io.intercom.android.sdk.state.State
    public UiState uiState() {
        return this.uiState;
    }

    @Override // io.intercom.android.sdk.state.State
    public Set<String> unreadConversationIds() {
        return this.unreadConversationIds;
    }
}
