package io.intercom.android.sdk.state;
/* loaded from: classes3.dex */
final class AutoValue_HostAppState extends HostAppState {
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_HostAppState(boolean z, boolean z2, long j) {
        this.isBackgrounded = z;
        this.sessionStartedSinceLastBackgrounded = z2;
        this.backgroundedTimestamp = j;
    }

    @Override // io.intercom.android.sdk.state.HostAppState
    public long backgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HostAppState) {
            HostAppState hostAppState = (HostAppState) obj;
            return this.isBackgrounded == hostAppState.isBackgrounded() && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded() && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp();
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.isBackgrounded ? 1231 : 1237) ^ 1000003) * 1000003;
        int i2 = this.sessionStartedSinceLastBackgrounded ? 1231 : 1237;
        long j = this.backgroundedTimestamp;
        return ((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // io.intercom.android.sdk.state.HostAppState
    public boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    @Override // io.intercom.android.sdk.state.HostAppState
    public boolean sessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public String toString() {
        return "HostAppState{isBackgrounded=" + this.isBackgrounded + ", sessionStartedSinceLastBackgrounded=" + this.sessionStartedSinceLastBackgrounded + ", backgroundedTimestamp=" + this.backgroundedTimestamp + "}";
    }
}
