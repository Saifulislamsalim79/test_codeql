package io.intercom.android.sdk.state;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.InboxState;
import java.util.List;
/* loaded from: classes3.dex */
final class AutoValue_InboxState extends InboxState {
    private final List<Conversation> conversations;
    private final boolean hasMorePages;
    private final InboxState.Status status;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InboxState(List<Conversation> list, InboxState.Status status, boolean z) {
        if (list != null) {
            this.conversations = list;
            if (status != null) {
                this.status = status;
                this.hasMorePages = z;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null conversations");
    }

    @Override // io.intercom.android.sdk.state.InboxState
    public List<Conversation> conversations() {
        return this.conversations;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InboxState) {
            InboxState inboxState = (InboxState) obj;
            return this.conversations.equals(inboxState.conversations()) && this.status.equals(inboxState.status()) && this.hasMorePages == inboxState.hasMorePages();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.state.InboxState
    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        return ((((this.conversations.hashCode() ^ 1000003) * 1000003) ^ this.status.hashCode()) * 1000003) ^ (this.hasMorePages ? 1231 : 1237);
    }

    @Override // io.intercom.android.sdk.state.InboxState
    public InboxState.Status status() {
        return this.status;
    }

    public String toString() {
        return "InboxState{conversations=" + this.conversations + ", status=" + this.status + ", hasMorePages=" + this.hasMorePages + "}";
    }
}
