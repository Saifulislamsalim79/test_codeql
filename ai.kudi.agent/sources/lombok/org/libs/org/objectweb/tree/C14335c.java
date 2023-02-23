package lombok.org.libs.org.objectweb.tree;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.menu.C14608i;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.internal.InterfaceC14622a;
import org.org.org.org.internal.app.api.Widget;
/* renamed from: lombok.org.libs.org.objectweb.tree.c */
/* loaded from: classes.dex */
public final class C14335c {

    /* renamed from: c */
    public final InterfaceC14622a f31605c;

    public C14335c(InterfaceC14622a interfaceC14622a) {
        Log_OC.getArray(interfaceC14622a, "restHandler");
        this.f31605c = interfaceC14622a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2090a(String str, String str2, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "visitorId");
        Log_OC.getArray(interfaceC11767l, "result");
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.REST;
        LogSeverity $r6 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            String $r9 = "getRecordingConfiguration(): called, [logAspect: " + $r5 + ']';
            $r4.size($r5, $r6, "CheckRecordingConfigApiHandler", $r9);
        }
        Widget $r10 = new Widget(str, str2, null, null, null, null, null, null, 252, null);
        InterfaceC14622a $r11 = this.f31605c;
        C14608i $r12 = C14608i.f32364b;
        String $r1 = $r12.get($r10);
        ArraysKt___ArraysKt$withIndex$6 $r13 = new ArraysKt___ArraysKt$withIndex$6(interfaceC11767l);
        $r11.mo1023a($r1, $r13);
    }
}
