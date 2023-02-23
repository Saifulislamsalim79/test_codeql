package org.org.org.org.android.http;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.http.filter.AbstractC14532f;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.Logger;
import org.org.org.org.org.data.Label;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Log {
    public final Logger level;
    public final Label text;

    public Log(Logger logger, Label label) {
        Log_OC.getArray(logger, "sessionEventHandler");
        Log_OC.getArray(label, "configurationHandler");
        this.level = logger;
        this.text = label;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void debug(long j, long j2, String str, AbstractC14532f abstractC14532f) {
        org.org.org.org.android.http.util.Label $r3 = new org.org.org.org.android.http.util.Label(j, j2, str, abstractC14532f);
        Logger $r4 = this.level;
        $r4.remove($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initialize(long j, long j2, AbstractC14532f abstractC14532f) {
        Log_OC.getArray(abstractC14532f, "requestParser");
        Label $r3 = this.text;
        boolean $z0 = $r3.m723w();
        if ($z0) {
            debug(j, j2, "ok", abstractC14532f);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.NETWORK_INTERCEPTING;
        LogSeverity $r5 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r1, false, $r5);
        int $i2 = $r6.ordinal();
        if ($i2 != 0) {
            return;
        }
        String $r8 = "response() cannot track intercepted response: recordNetwork=[false], [logAspect: " + $r1 + ']';
        $r4.size($r1, $r5, "InterceptHelper", $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void parse(long j, long j2, AbstractC14532f abstractC14532f) {
        Log_OC.getArray(abstractC14532f, "requestParser");
        Label $r3 = this.text;
        boolean $z0 = $r3.m723w();
        if ($z0) {
            debug(j, j2, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, abstractC14532f);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.NETWORK_INTERCEPTING;
        LogSeverity $r5 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r1, false, $r5);
        int $i2 = $r6.ordinal();
        if ($i2 != 0) {
            return;
        }
        String $r8 = "httpExchangeFailed() cannot track intercepted http failure: recordNetwork=[false], [logAspect: " + $r1 + ']';
        $r4.size($r1, $r5, "InterceptHelper", $r8);
    }
}
