package org.org.org.org.org.jraf;

import com.smartlook.sdk.smartlook.core.bridge.BridgeInterface;
import com.smartlook.sdk.smartlook.core.bridge.WireframeDataCallback;
import com.smartlook.sdk.smartlook.core.bridge.model.WireframeData;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13288p;
import kotlin.p476c0.C11726i;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: i */
    public BridgeInterface f32833i;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:18:0x00e5 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.smartlook.sdk.smartlook.core.bridge.model.WireframeData m640a() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.jraf.Label.m640a():com.smartlook.sdk.smartlook.core.bridge.model.WireframeData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Object m638a(InterfaceC11714d interfaceC11714d) {
        InterfaceC11714d $r4;
        Object $r14;
        $r4 = C11729c.m10388c(interfaceC11714d);
        C11726i r15 = new C11726i($r4);
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.BRIDGE_WIREFRAME;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r2);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r9 = new StringBuilder();
            String $r11 = "obtainWireframeData() called with: bridgeInterface = " + this.f32833i;
            $r9.append($r11);
            $r9.append(", [logAspect: ");
            $r9.append($r6);
            $r9.append(']');
            String $r112 = $r9.toString();
            $r5.size($r6, $r2, "BridgeInterfaceHandler", $r112);
        }
        BridgeInterface $r10 = this.f32833i;
        if ($r10 != null) {
            final C11726i $r42 = r15;
            $r10.obtainWireframeData(new WireframeDataCallback() { // from class: org.org.org.org.org.jraf.NowPlayingFragment$9
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // com.smartlook.sdk.smartlook.core.bridge.WireframeDataCallback
                public void onError(String str) {
                    Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
                    System $r52 = System.f32375c;
                    LogAspect $r1 = LogAspect.BRIDGE_WIREFRAME;
                    LogSeverity $r22 = LogSeverity.DEBUG;
                    TopLevel$NativeErrors $r62 = $r52.get($r1, false, $r22);
                    int $i02 = $r62.ordinal();
                    if ($i02 == 0) {
                        StringBuilder $r72 = new StringBuilder();
                        String $r43 = "WireframeDataCallback.onError() called with: message = " + str;
                        $r72.append($r43);
                        $r72.append(", [logAspect: ");
                        $r72.append($r1);
                        $r72.append(']');
                        String $r44 = $r72.toString();
                        $r52.size($r1, $r22, "BridgeInterfaceHandler", $r44);
                    }
                    InterfaceC11714d $r8 = InterfaceC11714d.this;
                    C13288p.m5362a(null);
                    $r8.resumeWith(null);
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // com.smartlook.sdk.smartlook.core.bridge.WireframeDataCallback
                public void onSuccess(WireframeData wireframeData) {
                    Log_OC.getArray(wireframeData, "wireframeData");
                    System $r43 = System.f32375c;
                    LogAspect $r22 = LogAspect.BRIDGE_WIREFRAME;
                    LogSeverity $r3 = LogSeverity.DEBUG;
                    TopLevel$NativeErrors $r52 = $r43.get($r22, false, $r3);
                    int $i02 = $r52.ordinal();
                    if ($i02 == 0) {
                        String $r72 = "WireframeDataCallback.onSuccess() called, [logAspect: " + $r22 + ']';
                        $r43.size($r22, $r3, "BridgeInterfaceHandler", $r72);
                    }
                    InterfaceC11714d $r8 = InterfaceC11714d.this;
                    C13288p.m5362a(wireframeData);
                    $r8.resumeWith(wireframeData);
                }
            });
        }
        Object $r13 = r15.m10395c();
        $r14 = C11734d.m10387d();
        if ($r13 == $r14) {
            C11741h.m10374c(interfaceC11714d);
        }
        return $r13;
    }

    /* renamed from: a */
    public final void m639a(BridgeInterface bridgeInterface) {
        Log_OC.getArray(bridgeInterface, "bridgeInterface");
        this.f32833i = bridgeInterface;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean equals() {
        BridgeInterface $r1 = this.f32833i;
        return $r1 != null;
    }
}
