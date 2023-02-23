package org.org.org.org.org.util;

import a.a.a.w;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.Number;
import org.org.org.org.asm.ByteVector;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
@f(c = "com.smartlook.sdk.smartlook.core.consistency.ConsistencyHandler$wipeAllSDKData$2", f = "ConsistencyHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Pair extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super C13666w>, Object> {
    public Pair(InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        InterfaceC11714d r4 = new Pair(interfaceC11714d);
        Number number = (Number) obj;
        InterfaceC11714d $r1 = r4;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(w wVar, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r3 = interfaceC11714d;
        Pair $r0 = (Pair) create(wVar, $r3);
        C13666w $r4 = C13666w.f30112a;
        Object $r1 = $r0.invokeSuspend($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        C11734d.m10387d();
        C13291q.m5357b(obj);
        ByteVector $r2 = ByteVector.f32302a;
        C14728c $r4 = BigReal.f32922d;
        String $r5 = $r4.m477a();
        File $r3 = new File($r5);
        $r2.get($r3);
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.CONSISTENCY;
        LogSeverity $r8 = LogSeverity.INFO;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 == 0) {
            String $r52 = "wipeAllSDKData() all legacy files removed async, [logAspect: " + $r7 + ']';
            $r6.size($r7, $r8, "ConsistencyHandler", $r52);
        }
        C13666w r11 = C13666w.f30112a;
        return r11;
    }
}
