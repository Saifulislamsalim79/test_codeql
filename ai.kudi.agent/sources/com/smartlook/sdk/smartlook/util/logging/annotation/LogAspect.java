package com.smartlook.sdk.smartlook.util.logging.annotation;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/util/logging/annotation/LogAspect;", "Ljava/lang/Enum;", "", "string", "()Ljava/lang/String;", "", "code", "I", "getCode", "()I", "<init>", "(Ljava/lang/String;II)V", "MANDATORY", "ALL", "REST", "LAYOUT", "SDK_METHODS", "VIDEO_CAPTURE", "LIFECYCLE", "AUTOMATIC_EVENT_DETECTION", "VIDEO_ENCODING", "NETWORK_INTERCEPTING", "AUTO_INTEGRATION", "ORIENTATION_CHANGES", "RENDERING_HISTOGRAM", "SESSION", "VISITOR", "IDENTIFICATION", "RECORD", "STORAGE", "CRASH_TRACKING", "CUSTOM_EVENTS", "SCREEN_CAPTURE", "BLACKLISTING", "JSON", "CONSISTENCY", "RECORD_STORAGE", "BRIDGE_WIREFRAME", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public enum LogAspect {
    MANDATORY(-1),
    ALL(0),
    REST(1),
    LAYOUT(2),
    SDK_METHODS(3),
    VIDEO_CAPTURE(4),
    LIFECYCLE(5),
    AUTOMATIC_EVENT_DETECTION(6),
    VIDEO_ENCODING(7),
    NETWORK_INTERCEPTING(8),
    AUTO_INTEGRATION(9),
    ORIENTATION_CHANGES(10),
    RENDERING_HISTOGRAM(11),
    SESSION(12),
    VISITOR(13),
    IDENTIFICATION(14),
    RECORD(15),
    STORAGE(16),
    CRASH_TRACKING(17),
    CUSTOM_EVENTS(18),
    SCREEN_CAPTURE(19),
    BLACKLISTING(20),
    JSON(21),
    CONSISTENCY(22),
    RECORD_STORAGE(23),
    BRIDGE_WIREFRAME(24);
    
    private final int code;

    LogAspect(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String string() {
        String name = name();
        Locale locale = Locale.ROOT;
        l.e(locale, "Locale.ROOT");
        if (name != null) {
            String lowerCase = name.toLowerCase(locale);
            l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
