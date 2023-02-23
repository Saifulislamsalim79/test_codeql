package com.smartlook.sdk.smartlook.util.logging.annotation;

import java.security.InvalidParameterException;
import kotlin.Metadata;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/util/logging/annotation/LogSeverity;", "Ljava/lang/Enum;", "", "string", "()Ljava/lang/String;", "", "code", "I", "getCode", "()I", "<init>", "(Ljava/lang/String;II)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public enum LogSeverity {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6);
    
    private final int code;

    LogSeverity(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String string() {
        int i = this.code;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            return IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
                        }
                        throw new InvalidParameterException("Invalid LogLevel value!");
                    }
                    return "warn";
                }
                return "info";
            }
            return "debug";
        }
        return "verbose";
    }
}
