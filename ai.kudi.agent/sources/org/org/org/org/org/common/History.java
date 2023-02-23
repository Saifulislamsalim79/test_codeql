package org.org.org.org.org.common;

import android.app.Activity;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.util.Iterator;
import org.org.org.org.org.common.telemetry.Item;
import org.org.org.org.org.core.util.Type;
/* loaded from: classes.dex */
public final class History extends AbstractC11802m implements InterfaceC11767l<Activity, C13666w> {
    public final /* synthetic */ Activity context;
    public final /* synthetic */ Buffer url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public History(Buffer buffer, Activity activity) {
        super(1);
        this.url = buffer;
        this.context = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Activity activity) {
        Activity $r2 = activity;
        parse($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void parse(Activity activity) {
        Log_OC.getArray(activity, "it");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.SESSION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "processNewActivity() activity is attached to a window and measured, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r4, "SessionHandler", $r7);
        }
        Activity $r1 = this.context;
        Method $r8 = Iterator.getView($r1);
        Buffer $r9 = this.url;
        Type $r10 = $r9.add($r8);
        Buffer $r92 = this.url;
        Item $r11 = Buffer.get($r92, null, 1, null);
        if ($r11 != null) {
            $r11.add($r8, $r10);
        }
        Buffer $r93 = this.url;
        org.org.org.org.org.core.Buffer $r12 = $r93.writeTo();
        $r12.init();
    }
}
