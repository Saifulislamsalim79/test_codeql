package org.org.org.org.org.common.p599io;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.Map;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13727r0;
import org.org.org.org.asm.graph.C14601i;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.Context;
import org.org.org.org.org.common.C14642f;
/* renamed from: org.org.org.org.org.common.io.b */
/* loaded from: classes.dex */
public final class C14644b implements Element {

    /* renamed from: a */
    public final InterfaceC11824h f32538a;

    /* renamed from: b */
    public final C14642f f32539b;

    /* renamed from: c */
    public final Context f32540c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14644b(C14642f c14642f, Context context) {
        InterfaceC11824h $r2;
        Log_OC.getArray(c14642f, "identificationHandler");
        Log_OC.getArray(context, "preferences");
        this.f32539b = c14642f;
        this.f32540c = context;
        CacheDataSource $r4 = new CacheDataSource(this);
        $r2 = C13218k.m5625b($r4);
        this.f32538a = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m918a() {
        boolean $z0;
        $z0 = C13276s.m5440u("");
        if (!$z0) {
            return "";
        }
        C14601i $r1 = C14601i.f32355b;
        String $r2 = $r1.m1103b();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m917a(String str) {
        Context $r2 = this.f32540c;
        $r2.remove(str, "last_visitor_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Map m915b() {
        Map $r2;
        Context $r1 = this.f32540c;
        Map $r22 = $r1.load("session_to_visitor_map");
        if ($r22 != null) {
            $r2 = C13727r0.m3868x($r22);
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Map get() {
        InterfaceC11824h $r2 = this.f32538a;
        Object $r1 = $r2.getValue();
        Map $r3 = (Map) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String write() {
        Context $r2 = this.f32540c;
        String $r1 = $r2.toString("last_visitor_id");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(String str, String str2) {
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.VISITOR;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            String $r9 = "storeVisitorIdForSession() called with: visitorId = " + str + ", sessionId = " + str2;
            $r7.append($r9);
            $r7.append(", [logAspect: ");
            $r7.append($r2);
            $r7.append(']');
            String $r92 = $r7.toString();
            $r5.size($r2, $r3, "VisitorHandler", $r92);
        }
        Map $r10 = get();
        $r10.put(str2, str);
        Map $r102 = get();
        write($r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(Map map) {
        Context $r2 = this.f32540c;
        $r2.add(map, "session_to_visitor_map");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.p599io.Element
    public void close() {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.VISITOR;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r2.get($r3, false, $r1);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "invalidateLastVisitorId() called, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r1, "VisitorHandler", $r6);
        }
        Context $r7 = this.f32540c;
        $r7.remove("last_visitor_id");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.p599io.Element
    /* renamed from: d */
    public String mo914d(String str) {
        Log_OC.getArray(str, "sessionId");
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.VISITOR;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "setupVisitorIdForSession() called with: sessionId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r1);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r1, $r2, "VisitorHandler", $r82);
        }
        String $r9 = toString(str);
        String $r83 = $r9;
        if ($r9 == null) {
            TopLevel$NativeErrors $r52 = $r4.get($r1, false, $r2);
            int $i02 = $r52.ordinal();
            if ($i02 == 0) {
                StringBuilder $r62 = new StringBuilder();
                String $r84 = "generateAndStoreVid() no visitor id: sessionId = " + str;
                $r62.append($r84);
                $r62.append(", [logAspect: ");
                $r62.append($r1);
                $r62.append(']');
                String $r85 = $r62.toString();
                $r4.size($r1, $r2, "VisitorHandler", $r85);
            }
            String $r92 = write();
            $r83 = $r92;
            if ($r92 == null) {
                String $r93 = m918a();
                $r83 = $r93;
                TopLevel$NativeErrors $r53 = $r4.get($r1, false, $r2);
                int $i03 = $r53.ordinal();
                if ($i03 == 0) {
                    StringBuilder $r63 = new StringBuilder();
                    String $r10 = "generateAndStoreVid() no last visitor id generating new visitorId: visitorId=[" + $r93 + ']';
                    $r63.append($r10);
                    $r63.append(", [logAspect: ");
                    $r63.append($r1);
                    $r63.append(']');
                    String $r102 = $r63.toString();
                    $r4.size($r1, $r2, "VisitorHandler", $r102);
                }
                m917a($r93);
                write($r93, str);
            } else {
                TopLevel$NativeErrors $r54 = $r4.get($r1, false, $r2);
                int $i04 = $r54.ordinal();
                if ($i04 == 0) {
                    StringBuilder $r64 = new StringBuilder();
                    String $r103 = "generateAndStoreVid() found last visitorId and storing it: visitorId = " + $r92;
                    $r64.append($r103);
                    $r64.append(", [logAspect: ");
                    $r64.append($r1);
                    $r64.append(']');
                    String $r104 = $r64.toString();
                    $r4.size($r1, $r2, "VisitorHandler", $r104);
                }
                write($r92, str);
            }
        }
        C14642f $r11 = this.f32539b;
        $r11.m928d($r83);
        return $r83;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.p599io.Element
    public String toString(String str) {
        Log_OC.getArray(str, "sessionId");
        Map $r2 = get();
        Object $r3 = $r2.get(str);
        String $r1 = (String) $r3;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (r16 != false) goto L10;
     */
    /* JADX WARN: Incorrect condition in loop: B:15:0x0089 */
    @Override // org.org.org.org.org.common.p599io.Element
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(java.lang.String r21) {
        /*
            r20 = this;
            java.lang.String r1 = "sessionId"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            org.org.org.org.asm.parser.System r2 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r3 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VISITOR
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r4 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r5 = 0
            r7 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r6 = r2.get(r3, r7, r4)
            int r8 = r6.ordinal()
            if (r8 == 0) goto L1a
            goto L4b
        L1a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "invalidateVisitorIdForSession() called with: sessionId = "
            r10.append(r1)
            r0 = r21
            r10.append(r0)
            java.lang.String r11 = r10.toString()
            r9.append(r11)
            java.lang.String r1 = ", [logAspect: "
            r9.append(r1)
            r9.append(r3)
            r7 = 93
            r9.append(r7)
            java.lang.String r11 = r9.toString()
            java.lang.String r1 = "VisitorHandler"
            r2.size(r3, r4, r1, r11)
        L4b:
            r0 = r20
            java.util.Map r12 = r0.get()
            r0 = r21
            java.lang.Object r13 = r12.get(r0)
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            r11 = r14
            if (r11 == 0) goto Lb7
            r0 = r20
            java.util.Map r12 = r0.get()
            r0 = r21
            r12.remove(r0)
            r0 = r20
            java.util.Map r12 = r0.get()
            java.util.Collection r15 = r12.values()
            boolean r0 = r15 instanceof java.util.Collection
            r16 = r0
            if (r16 == 0) goto L7f
            boolean r16 = r15.isEmpty()
            if (r16 == 0) goto L7f
            goto La0
        L7f:
            java.util.Iterator r17 = r15.iterator()
        L83:
            r0 = r17
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto La0
            r0 = r17
            java.lang.Object r13 = r0.next()
            r18 = r13
            java.lang.String r18 = (java.lang.String) r18
            r21 = r18
            r0 = r21
            boolean r16 = kotlin.p483e0.p485d.Log_OC.append(r0, r11)
            if (r16 == 0) goto L83
            goto La1
        La0:
            r5 = 1
        La1:
            if (r5 == 0) goto Lac
            r0 = r20
            org.org.org.org.org.common.f r0 = r0.f32539b
            r19 = r0
            r0.m924i(r11)
        Lac:
            r0 = r20
            java.util.Map r12 = r0.get()
            r0 = r20
            r0.write(r12)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.p599io.C14644b.write(java.lang.String):void");
    }
}
