package io.intercom.android.sdk.metrics.ops;
/* loaded from: classes3.dex */
public class OpsEvent {
    private final String eventType;
    private final String name;
    private final long timestamp;

    public OpsEvent(String str, String str2, long j) {
        this.eventType = str;
        this.name = str2;
        this.timestamp = j;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
