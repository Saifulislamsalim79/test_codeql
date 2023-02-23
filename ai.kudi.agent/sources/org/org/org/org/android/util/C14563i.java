package org.org.org.org.android.util;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.android.util.asm.C14550x;
import org.org.org.org.android.util.common.InterfaceC14553d;
import org.org.org.org.asm.parser.Attribute;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.Logger;
/* renamed from: org.org.org.org.android.util.i */
/* loaded from: classes.dex */
public final class C14563i implements InterfaceC14553d {

    /* renamed from: c */
    public final /* synthetic */ C14559f f32253c;

    public C14563i(C14559f c14559f) {
        this.f32253c = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.common.InterfaceC14553d
    /* renamed from: d */
    public void mo1210d(String str, C14544h c14544h) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(c14544h, "viewFrame");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.AUTOMATIC_EVENT_DETECTION;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, true, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("onVisibilityChanged() called with: ");
            $r8.append("type = ");
            Attribute $r9 = Attribute.f32368a;
            String $r10 = $r9.execute(str);
            $r8.append($r10);
            $r8.append(", ");
            $r8.append("viewFrame = ");
            String $r102 = Log.get(c14544h, false, 2, null);
            $r8.append($r102);
            String $r103 = $r8.toString();
            $r7.append($r103);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r104 = $r7.toString();
            $r3.size($r4, $r5, "AutomaticEventDetectionHandler", $r104);
        }
        C14559f $r11 = this.f32253c;
        Logger $r12 = $r11.f32202v;
        C14550x $r13 = new C14550x(str, c14544h, null, 4, null);
        $r12.remove($r13);
    }
}
