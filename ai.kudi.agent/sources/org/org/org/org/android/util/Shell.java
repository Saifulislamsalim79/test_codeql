package org.org.org.org.android.util;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.lib.InterfaceC14567f;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.Logger;
/* loaded from: classes.dex */
public final class Shell implements InterfaceC14567f {
    public final /* synthetic */ C14559f mContext;

    public Shell(C14559f c14559f) {
        this.mContext = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.InterfaceC14567f
    public void add(String str, Location location) {
        Log_OC.getArray(str, "action");
        Log_OC.getArray(location, "multitouch");
        System $r6 = System.f32375c;
        LogAspect $r2 = LogAspect.AUTOMATIC_EVENT_DETECTION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r6.get($r2, false, $r3);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r4 = new StringBuilder();
            $r4.append("onMultitouch() called with: action = ");
            $r4.append(str);
            $r4.append(", multitouch = ");
            String $r5 = Log.get(location, false, 2, null);
            $r4.append($r5);
            String $r52 = $r4.toString();
            $r8.append($r52);
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            String $r53 = $r8.toString();
            $r6.size($r2, $r3, "AutomaticEventDetectionHandler", $r53);
        }
        C14559f $r9 = this.mContext;
        Logger $r10 = $r9.f32202v;
        $r10.add(location);
    }
}
