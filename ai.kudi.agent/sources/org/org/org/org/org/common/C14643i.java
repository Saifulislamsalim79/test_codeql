package org.org.org.org.org.common;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.telemetry.C14648h;
import org.org.org.org.org.menu.InterfaceC14715i;
/* renamed from: org.org.org.org.org.common.i */
/* loaded from: classes.dex */
public final class C14643i {

    /* renamed from: b */
    public final /* synthetic */ C14642f f32534b;

    /* renamed from: c */
    public final HashMap<String, e.a.a.a.c.m.e.a> f32535c;

    /* renamed from: f */
    public final Set<String> f32536f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14643i(C14642f c14642f) {
        this.f32534b = c14642f;
        LinkedHashSet $r2 = new LinkedHashSet();
        this.f32536f = $r2;
        HashMap $r3 = new HashMap();
        this.f32535c = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m920d() {
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.IDENTIFICATION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "storeAllModifiedAfterDelay() called, [logAspect: " + $r2 + ']';
            $r1.size($r2, $r3, "IdentificationHandler", $r6);
        }
        C14642f $r7 = this.f32534b;
        org.org.org.org.asm.tree.ByteVector $r8 = $r7.f32532e;
        $r8.mo1059a();
        C14642f $r72 = this.f32534b;
        org.org.org.org.asm.tree.ByteVector $r82 = $r72.f32532e;
        $r82.mo1058a(new Runnable() { // from class: org.org.org.org.org.common.a$a$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C14643i $r12 = C14643i.this;
                $r12.m923a();
            }
        }, 500L);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14648h m922a(String str) {
        C14648h $r11;
        Log_OC.getArray(str, "visitorId");
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.IDENTIFICATION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "getIdentification() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r1);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r1, $r2, "IdentificationHandler", $r82);
        }
        boolean $z0 = Log_OC.append(str, "");
        if ($z0) {
            HashMap $r9 = this.f32535c;
            Object $r10 = $r9.get(str);
            $r11 = (C14648h) $r10;
        } else {
            HashMap $r92 = this.f32535c;
            Object $r102 = $r92.get(str);
            $r11 = (C14648h) $r102;
            if ($r11 == null) {
                C14642f $r12 = this.f32534b;
                InterfaceC14715i $r13 = $r12.f32530a;
                C14648h $r14 = $r13.mo550c(str);
                $r11 = $r14;
                if ($r14 != null) {
                    HashMap $r93 = this.f32535c;
                    $r93.put(str, $r14);
                } else {
                    $r11 = null;
                }
            }
        }
        TopLevel$NativeErrors $r52 = $r4.get($r1, false, $r2);
        int $i02 = $r52.ordinal();
        if ($i02 != 0) {
            return $r11;
        }
        StringBuilder $r62 = new StringBuilder();
        StringBuilder $r7 = new StringBuilder();
        $r7.append("getIdentification(): identification = ");
        String $r3 = Log.get($r11, false, 2, null);
        $r7.append($r3);
        String $r32 = $r7.toString();
        $r62.append($r32);
        $r62.append(", [logAspect: ");
        $r62.append($r1);
        $r62.append(']');
        String $r33 = $r62.toString();
        $r4.size($r1, $r2, "IdentificationHandler", $r33);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:17:0x0088 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x004e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m923a() {
        /*
            r27 = this;
            org.org.org.org.asm.parser.System r2 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r3 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.IDENTIFICATION
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r4 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r6 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r5 = r2.get(r3, r6, r4)
            int r7 = r5.ordinal()
            if (r7 == 0) goto L12
            goto L32
        L12:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "storeAllModified() called"
            r8.append(r9)
            java.lang.String r9 = ", [logAspect: "
            r8.append(r9)
            r8.append(r3)
            r6 = 93
            r8.append(r6)
            java.lang.String r10 = r8.toString()
            java.lang.String r9 = "IdentificationHandler"
            r2.size(r3, r4, r9, r10)
        L32:
            r0 = r27
            org.org.org.org.org.common.f r11 = r0.f32534b
            org.org.org.org.asm.tree.ByteVector r12 = org.org.org.org.org.common.C14642f.m931b(r11)
            r12.mo1059a()
            r0 = r27
            java.util.Set<java.lang.String> r13 = r0.f32536f
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r13.iterator()
        L4a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L80
            java.lang.Object r17 = r15.next()
            r18 = r17
            java.lang.String r18 = (java.lang.String) r18
            r10 = r18
            r0 = r27
            java.util.HashMap<java.lang.String, e.a.a.a.c.m.e.a> r0 = r0.f32535c
            r19 = r0
            java.lang.Object r17 = r0.get(r10)
            r21 = r17
            org.org.org.org.org.common.telemetry.h r21 = (org.org.org.org.org.common.telemetry.C14648h) r21
            r20 = r21
            if (r20 != 0) goto L6f
            r22 = 0
            goto L78
        L6f:
            kotlin.o r22 = new kotlin.o
            r0 = r22
            r1 = r20
            r0.<init>(r1, r10)
        L78:
            if (r22 == 0) goto L4a
            r0 = r22
            r14.add(r0)
            goto L4a
        L80:
            java.util.Iterator r15 = r14.iterator()
        L84:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto Lbc
            java.lang.Object r17 = r15.next()
            r23 = r17
            kotlin.o r23 = (kotlin.C13287o) r23
            r22 = r23
            r0 = r27
            org.org.org.org.org.common.f r11 = r0.f32534b
            org.org.org.org.org.menu.i r24 = org.org.org.org.org.common.C14642f.m933a(r11)
            r0 = r22
            java.lang.Object r17 = r0.m5364c()
            r25 = r17
            org.org.org.org.org.common.telemetry.h r25 = (org.org.org.org.org.common.telemetry.C14648h) r25
            r20 = r25
            r0 = r22
            java.lang.Object r17 = r0.m5363d()
            r26 = r17
            java.lang.String r26 = (java.lang.String) r26
            r10 = r26
            r0 = r24
            r1 = r20
            r0.mo544d(r1, r10)
            goto L84
        Lbc:
            r0 = r27
            java.util.Set<java.lang.String> r13 = r0.f32536f
            r13.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.C14643i.m923a():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m921a(String str, C14648h c14648h) {
        Log_OC.getArray(str, "visitorId");
        Log_OC.getArray(c14648h, "identification");
        System $r6 = System.f32375c;
        LogAspect $r3 = LogAspect.IDENTIFICATION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r6.get($r3, false, $r4);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r5 = new StringBuilder();
            $r5.append("setIdentification() called with: ");
            $r5.append("visitorId = ");
            $r5.append(str);
            $r5.append(", ");
            $r5.append("identification = ");
            String $r9 = Log.get(c14648h, false, 2, null);
            $r5.append($r9);
            String $r92 = $r5.toString();
            $r8.append($r92);
            $r8.append(", [logAspect: ");
            $r8.append($r3);
            $r8.append(']');
            String $r93 = $r8.toString();
            $r6.size($r3, $r4, "IdentificationHandler", $r93);
        }
        boolean $z0 = Log_OC.append(str, "");
        if (!$z0) {
            Set $r10 = this.f32536f;
            $r10.add(str);
        }
        HashMap $r11 = this.f32535c;
        $r11.put(str, c14648h);
        m920d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str) {
        Log_OC.getArray(str, "visitorId");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.IDENTIFICATION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "invalidateIdentification() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "IdentificationHandler", $r82);
        }
        HashMap $r9 = this.f32535c;
        $r9.remove(str);
        C14642f $r10 = this.f32534b;
        InterfaceC14715i $r11 = $r10.f32530a;
        $r11.mo542i(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m919d(String str) {
        Log_OC.getArray(str, "visitorId");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.IDENTIFICATION;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r1);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "resolveUnknownVidIdentification() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r3.size($r4, $r1, "IdentificationHandler", $r82);
        }
        HashMap $r9 = this.f32535c;
        Object $r10 = $r9.get("");
        C14648h $r11 = (C14648h) $r10;
        if ($r11 != null) {
            m921a(str, $r11);
        }
        HashMap $r92 = this.f32535c;
        $r92.remove("");
    }
}
