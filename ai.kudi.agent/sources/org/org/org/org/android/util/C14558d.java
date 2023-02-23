package org.org.org.org.android.util;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.Item;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.android.util.lib.InterfaceC14568i;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.Logger;
/* renamed from: org.org.org.org.android.util.d */
/* loaded from: classes.dex */
public final class C14558d implements InterfaceC14568i {

    /* renamed from: c */
    public final /* synthetic */ C14559f f32189c;

    public C14558d(C14559f c14559f) {
        this.f32189c = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.InterfaceC14568i
    /* renamed from: d */
    public void mo1205d(Item item) {
        if (item != null) {
            System $r5 = System.f32375c;
            LogAspect $r2 = LogAspect.AUTOMATIC_EVENT_DETECTION;
            LogSeverity $r3 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
            int $i0 = $r6.ordinal();
            if ($i0 == 0) {
                StringBuilder $r7 = new StringBuilder();
                StringBuilder $r4 = new StringBuilder();
                $r4.append("onClick() called with: selector = ");
                String $r8 = Log.get(item, false, 2, null);
                $r4.append($r8);
                String $r82 = $r4.toString();
                $r7.append($r82);
                $r7.append(", [logAspect: ");
                $r7.append($r2);
                $r7.append(']');
                String $r83 = $r7.toString();
                $r5.size($r2, $r3, "AutomaticEventDetectionHandler", $r83);
            }
            C14559f $r9 = this.f32189c;
            Logger $r10 = $r9.f32202v;
            $r10.get(item);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.InterfaceC14568i
    /* renamed from: d */
    public void mo1204d(Node node) {
        Log_OC.getArray(node, "rageClick");
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.AUTOMATIC_EVENT_DETECTION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r4 = new StringBuilder();
            $r4.append("onRageClick() called with: rageClick = ");
            String $r8 = Log.get(node, false, 2, null);
            $r4.append($r8);
            String $r82 = $r4.toString();
            $r7.append($r82);
            $r7.append(", [logAspect: ");
            $r7.append($r2);
            $r7.append(']');
            String $r83 = $r7.toString();
            $r5.size($r2, $r3, "AutomaticEventDetectionHandler", $r83);
        }
        C14559f $r9 = this.f32189c;
        Logger $r10 = $r9.f32202v;
        $r10.remove(node);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.InterfaceC14568i
    /* renamed from: d */
    public void mo1203d(C14547m c14547m) {
        Log_OC.getArray(c14547m, "gesture");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.AUTOMATIC_EVENT_DETECTION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, true, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onGesture() called with: gesture = ");
            String $r8 = Log.get(c14547m, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r2, $r3, "AutomaticEventDetectionHandler", $r83);
        }
        C14559f $r9 = this.f32189c;
        Logger $r10 = $r9.f32202v;
        $r10.m939d(c14547m);
    }
}
