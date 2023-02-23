package io.intercom.android.sdk.state;

import io.intercom.android.sdk.state.UiState;
/* loaded from: classes3.dex */
final class AutoValue_UiState extends UiState {
    private final String conversationId;
    private final UiState.Screen screen;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiState(UiState.Screen screen, String str) {
        if (screen != null) {
            this.screen = screen;
            this.conversationId = str;
            return;
        }
        throw new NullPointerException("Null screen");
    }

    @Override // io.intercom.android.sdk.state.UiState
    public String conversationId() {
        return this.conversationId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiState) {
            UiState uiState = (UiState) obj;
            if (this.screen.equals(uiState.screen())) {
                String str = this.conversationId;
                if (str == null) {
                    if (uiState.conversationId() == null) {
                        return true;
                    }
                } else if (str.equals(uiState.conversationId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.screen.hashCode() ^ 1000003) * 1000003;
        String str = this.conversationId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // io.intercom.android.sdk.state.UiState
    public UiState.Screen screen() {
        return this.screen;
    }

    public String toString() {
        return "UiState{screen=" + this.screen + ", conversationId=" + this.conversationId + "}";
    }
}
