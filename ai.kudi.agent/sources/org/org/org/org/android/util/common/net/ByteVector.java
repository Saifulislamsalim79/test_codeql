package org.org.org.org.android.util.common.net;

import android.app.Activity;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import org.org.org.org.android.util.asm.C14539c;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.Buffer;
/* loaded from: classes.dex */
public final class ByteVector implements Target {

    /* renamed from: a */
    public final /* synthetic */ C14557h f32177a;

    public ByteVector(C14557h c14557h) {
        this.f32177a = c14557h;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.common.net.Target
    public void write() {
        Class $r11;
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.CRASH_TRACKING;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r2.get($r3, true, $r1);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "onAppNotResponding() called, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r1, "ANRTrackingHandler", $r6);
        }
        C14557h $r8 = this.f32177a;
        String $r62 = $r8.m1263e();
        C14557h $r82 = this.f32177a;
        Buffer $r9 = $r82.f32187f;
        Activity $r10 = $r9.getString();
        String $r12 = ($r10 == null || ($r11 = $r10.getClass()) == null) ? "unknown" : $r11.getSimpleName();
        C14539c $r7 = new C14539c($r62, $r12, null, 4, null);
        C14557h $r83 = this.f32177a;
        org.org.org.org.org.common.Logger $r13 = $r83.f32188r;
        $r13.remove($r7);
    }
}
