package io.intercom.android.sdk.state;
/* loaded from: classes3.dex */
public abstract class HostAppState {
    public static HostAppState create(boolean z, boolean z2, long j) {
        return new AutoValue_HostAppState(z, z2, j);
    }

    public abstract long backgroundedTimestamp();

    public abstract boolean isBackgrounded();

    public abstract boolean sessionStartedSinceLastBackgrounded();
}
