package io.intercom.android.sdk.state;

import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.TeamPresence;
import java.util.Set;
/* loaded from: classes3.dex */
public abstract class State {
    public static State create(boolean z, UiState uiState, TeamPresence teamPresence, Set<String> set, InboxState inboxState, HostAppState hostAppState, OverlayState overlayState, ActiveConversationState activeConversationState, ComposerSuggestions composerSuggestions) {
        return new AutoValue_State(z, uiState, teamPresence, set, inboxState, hostAppState, overlayState, activeConversationState, composerSuggestions);
    }

    public abstract ActiveConversationState activeConversationState();

    public abstract ComposerSuggestions composerSuggestions();

    public abstract boolean hasConversations();

    public abstract HostAppState hostAppState();

    public abstract InboxState inboxState();

    public abstract OverlayState overlayState();

    public abstract TeamPresence teamPresence();

    public abstract UiState uiState();

    public abstract Set<String> unreadConversationIds();
}
