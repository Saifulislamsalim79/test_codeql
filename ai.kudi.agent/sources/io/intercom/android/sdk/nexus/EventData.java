package io.intercom.android.sdk.nexus;

import java.util.HashMap;
/* loaded from: classes3.dex */
public class EventData extends HashMap<String, Object> {
    public EventData() {
    }

    public long optLong(String str) {
        return optLong(str, -1L);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public EventData(int i) {
        super(i);
    }

    public long optLong(String str, long j) {
        Object obj = get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public String optString(String str, String str2) {
        Object obj = get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
