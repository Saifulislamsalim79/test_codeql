package io.intercom.android.sdk.state;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_ActiveConversationState extends ActiveConversationState {
    private final String getClientAssignedUuid;
    private final String getConversationId;
    private final boolean hasSwitchedInputType;
    private final boolean hasTextInComposer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ActiveConversationState(String str, boolean z, boolean z2, String str2) {
        if (str != null) {
            this.getConversationId = str;
            this.hasSwitchedInputType = z;
            this.hasTextInComposer = z2;
            if (str2 != null) {
                this.getClientAssignedUuid = str2;
                return;
            }
            throw new NullPointerException("Null getClientAssignedUuid");
        }
        throw new NullPointerException("Null getConversationId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActiveConversationState) {
            ActiveConversationState activeConversationState = (ActiveConversationState) obj;
            return this.getConversationId.equals(activeConversationState.getConversationId()) && this.hasSwitchedInputType == activeConversationState.hasSwitchedInputType() && this.hasTextInComposer == activeConversationState.hasTextInComposer() && this.getClientAssignedUuid.equals(activeConversationState.getClientAssignedUuid());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.state.ActiveConversationState
    public String getClientAssignedUuid() {
        return this.getClientAssignedUuid;
    }

    @Override // io.intercom.android.sdk.state.ActiveConversationState
    public String getConversationId() {
        return this.getConversationId;
    }

    @Override // io.intercom.android.sdk.state.ActiveConversationState
    public boolean hasSwitchedInputType() {
        return this.hasSwitchedInputType;
    }

    @Override // io.intercom.android.sdk.state.ActiveConversationState
    public boolean hasTextInComposer() {
        return this.hasTextInComposer;
    }

    public int hashCode() {
        return ((((((this.getConversationId.hashCode() ^ 1000003) * 1000003) ^ (this.hasSwitchedInputType ? 1231 : 1237)) * 1000003) ^ (this.hasTextInComposer ? 1231 : 1237)) * 1000003) ^ this.getClientAssignedUuid.hashCode();
    }

    public String toString() {
        return "ActiveConversationState{getConversationId=" + this.getConversationId + ", hasSwitchedInputType=" + this.hasSwitchedInputType + ", hasTextInComposer=" + this.hasTextInComposer + ", getClientAssignedUuid=" + this.getClientAssignedUuid + "}";
    }
}
