package org.org.org.org.org.digests;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.e.d.b.a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import lombok.org.asm.Number;
import lombok.org.asm.signature.C14308x;
import lombok.org.asm.signature.Item;
import org.org.org.org.asm.ByteVector;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.signature.InterfaceC14613a;
import org.org.org.org.org.common.p599io.Element;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.org.core.internal.C14677b;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.data.asm.Attribute;
import org.org.org.org.org.menu.C14711c;
import org.org.org.org.org.menu.InterfaceC14715i;
import org.org.org.org.xml.Node;
import org.org.org.org.xml.core.util.C14738c;
import org.org.org.org.xml.core.util.Context;
/* renamed from: org.org.org.org.org.digests.f */
/* loaded from: classes.dex */
public final class C14704f implements Number {

    /* renamed from: a */
    public final HashMap<String, List<a>> f32755a;

    /* renamed from: b */
    public final InterfaceC14715i f32756b;

    /* renamed from: c */
    public final Label f32757c;

    /* renamed from: f */
    public final C14711c f32758f;

    /* renamed from: g */
    public final Element f32759g;

    /* renamed from: j */
    public final InterfaceC14645a f32760j;

    /* renamed from: l */
    public final InterfaceC11824h f32761l;

    /* renamed from: n */
    public final InterfaceC14613a f32762n;

    /* renamed from: p */
    public AtomicBoolean f32763p;

    /* renamed from: r */
    public final ReentrantLock f32764r;
    public final Node this$0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14704f(Node node, InterfaceC14613a interfaceC14613a, Label label, Element element, InterfaceC14715i interfaceC14715i, C14711c c14711c, InterfaceC14645a interfaceC14645a) {
        InterfaceC11824h $r9;
        Log_OC.getArray(node, "jobManager");
        Log_OC.getArray(interfaceC14613a, "dispatcher");
        Log_OC.getArray(label, "configurationHandler");
        Log_OC.getArray(element, "visitorHandler");
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(c14711c, "frameStorageHandler");
        Log_OC.getArray(interfaceC14645a, "sessionStorage");
        this.this$0 = node;
        this.f32762n = interfaceC14613a;
        this.f32757c = label;
        this.f32759g = element;
        this.f32756b = interfaceC14715i;
        this.f32758f = c14711c;
        this.f32760j = interfaceC14645a;
        C14703b $r8 = new C14703b(this);
        $r9 = C13218k.m5625b($r8);
        this.f32761l = $r9;
        HashMap $r10 = new HashMap();
        this.f32755a = $r10;
        AtomicBoolean $r11 = new AtomicBoolean(false);
        this.f32763p = $r11;
        ReentrantLock $r12 = new ReentrantLock();
        this.f32764r = $r12;
        C14677b $r13 = m696b();
        Item $r14 = $r13.m792a();
        AbstractAQuery $r15 = new AbstractAQuery(this, null);
        C14308x.m2174a(C14308x.m2175a($r14, $r15), this);
        Item $r142 = label.m748b();
        Rule $r16 = new Rule(this, null);
        C14308x.m2174a(C14308x.m2175a($r142, $r16), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:20:0x00e1 */
    /* JADX WARN: Incorrect condition in loop: B:29:0x0123 */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0063 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m701a() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.digests.C14704f.m701a():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m697a(Context context) {
        List $r10;
        Label $r2 = this.f32757c;
        boolean $z0 = $r2.m724s();
        Label $r22 = this.f32757c;
        String $r3 = context.getName();
        String $r4 = context.getId();
        Attribute $r5 = $r22.add($r3, $r4);
        org.org.org.org.org.data.asm.Label $r6 = $r5.m721a();
        if ($r6 != null) {
            add(context, $r6, $z0);
            return;
        }
        ReentrantLock $r7 = this.f32764r;
        $r7.lock();
        try {
            HashMap $r8 = this.f32755a;
            String $r32 = context.getName();
            boolean $z02 = $r8.containsKey($r32);
            if ($z02) {
                HashMap $r82 = this.f32755a;
                String $r33 = context.getName();
                Object $r9 = $r82.get($r33);
                List $r102 = (List) $r9;
                if ($r102 != null) {
                    $r102.add(context);
                }
            } else {
                HashMap $r83 = this.f32755a;
                String $r34 = context.getName();
                Context[] $r11 = {context};
                $r10 = C13726r.m3885k($r11);
                $r83.put($r34, $r10);
            }
        } finally {
            $r7.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final boolean m700a(String str, int i) {
        ByteVector $r1 = ByteVector.f32302a;
        InterfaceC14715i $r2 = this.f32756b;
        File $r4 = $r2.add(false, str, i);
        boolean $z0 = $r1.write($r4);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void add(Context context, org.org.org.org.org.data.asm.Label label, boolean z) {
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.RECORD_STORAGE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r4.get($r5, true, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("scheduleRecordForUpload() called with: ");
            $r8.append("data = ");
            String $r9 = Log.get(context, false, 2, null);
            $r8.append($r9);
            $r8.append(", ");
            $r8.append("setupConfiguration = ");
            String $r92 = Log.get(label, false, 2, null);
            $r8.append($r92);
            $r8.append(", ");
            $r8.append("mobileData = ");
            $r8.append(z);
            String $r93 = $r8.toString();
            $r7.append($r93);
            $r7.append(", [logAspect: ");
            $r7.append($r5);
            $r7.append(']');
            String $r94 = $r7.toString();
            $r4.size($r5, $r2, "RecordHandler", $r94);
        }
        Node $r10 = this.this$0;
        org.org.org.org.xml.core.util.Label $r12 = C14738c.m444a(context, label, z);
        org.org.org.org.xml.core.Attribute $r11 = new org.org.org.org.xml.core.Attribute($r12);
        $r10.write($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final C14677b m696b() {
        InterfaceC11824h $r2 = this.f32761l;
        Object $r1 = $r2.getValue();
        C14677b $r3 = (C14677b) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m694d(Context context) {
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.RECORD_STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, true, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("renderVideo(): called with: data = ");
            String $r8 = Log.get(context, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r2, $r3, "RecordHandler", $r83);
        }
        C14677b $r9 = m696b();
        $r9.write(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m693e(boolean z, Context context) {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.RECORD_STORAGE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onVideoRendered() called with: ");
            $r7.append("success = ");
            $r7.append(z);
            $r7.append(", ");
            $r7.append("sessionId = ");
            String $r8 = context.getName();
            $r7.append($r8);
            $r7.append(", ");
            $r7.append("recordIndex = ");
            int $i02 = context.m449a();
            $r7.append($i02);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r3.size($r4, $r2, "RecordHandler", $r83);
        }
        if (z) {
            m697a(context);
            return;
        }
        TopLevel$NativeErrors $r52 = $r3.get($r4, false, $r2);
        int $i03 = $r52.ordinal();
        if ($i03 == 0) {
            StringBuilder $r62 = new StringBuilder();
            StringBuilder $r72 = new StringBuilder();
            $r72.append("onVideoRendered() deleting record: ");
            $r72.append("success = ");
            $r72.append(z);
            $r72.append(", ");
            $r72.append("sessionId = ");
            String $r84 = context.getName();
            $r72.append($r84);
            $r72.append(", ");
            $r72.append("recordIndex = ");
            int $i04 = context.m449a();
            $r72.append($i04);
            String $r85 = $r72.toString();
            $r62.append($r85);
            $r62.append(", [logAspect: ");
            $r62.append($r4);
            $r62.append(']');
            String $r86 = $r62.toString();
            $r3.size($r4, $r2, "RecordHandler", $r86);
        }
        InterfaceC14645a $r9 = this.f32760j;
        String $r87 = context.getName();
        int $i05 = context.m449a();
        $r9.mo913a($r87, $i05);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0042 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void execute() {
        /*
            r18 = this;
            org.org.org.org.asm.parser.System r1 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r2 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.RECORD_STORAGE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r3 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r5 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r4 = r1.get(r2, r5, r3)
            int r6 = r4.ordinal()
            if (r6 == 0) goto L12
            goto L32
        L12:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "loadLocalSessions() called"
            r7.append(r8)
            java.lang.String r8 = ", [logAspect: "
            r7.append(r8)
            r7.append(r2)
            r5 = 93
            r7.append(r5)
            java.lang.String r9 = r7.toString()
            java.lang.String r8 = "RecordHandler"
            r1.size(r2, r3, r8, r9)
        L32:
            r0 = r18
            org.org.org.org.org.menu.i r10 = r0.f32756b
            java.util.List r11 = r10.get()
            java.util.Iterator r12 = r11.iterator()
        L3e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L9f
            java.lang.Object r14 = r12.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            r9 = r15
            org.org.org.org.asm.parser.System r1 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r2 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.RECORD_STORAGE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r3 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r5 = 1
            org.org.org.org.asm.parser.TopLevel$NativeErrors r4 = r1.get(r2, r5, r3)
            int r6 = r4.ordinal()
            if (r6 == 0) goto L5e
            goto L99
        L5e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r16 = new java.lang.StringBuilder
            r0 = r16
            r0.<init>()
            java.lang.String r8 = "loadLocalSessions() looking at: sessionId = "
            r0 = r16
            r0.append(r8)
            r0 = r16
            r0.append(r9)
            r0 = r16
            java.lang.String r17 = r0.toString()
            r0 = r17
            r7.append(r0)
            java.lang.String r8 = ", [logAspect: "
            r7.append(r8)
            r7.append(r2)
            r5 = 93
            r7.append(r5)
            java.lang.String r17 = r7.toString()
            java.lang.String r8 = "RecordHandler"
            r0 = r17
            r1.size(r2, r3, r8, r0)
        L99:
            r0 = r18
            r0.write(r9)
            goto L3e
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.digests.C14704f.execute():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    private final void m692i(String str) {
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.RECORD_STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, true, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "processLocalSession() deleting session with sessionId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "RecordHandler", $r82);
        }
        InterfaceC14645a $r9 = this.f32760j;
        $r9.add(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:18:0x00ba */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void write(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.digests.C14704f.write(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, int i) {
        Log_OC.getArray(str, "sessionID");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.RECORD_STORAGE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r2);
        int $i1 = $r5.ordinal();
        if ($i1 == 0) {
            StringBuilder $r6 = new StringBuilder();
            $r6.append("processRecord(): called with: sessionId = " + str + ", recordIndex = " + i);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            $r3.size($r4, $r2, "RecordHandler", $r6.toString());
        }
        AtomicBoolean $r9 = this.f32763p;
        boolean $z0 = $r9.getAndSet(true);
        if (!$z0) {
            execute();
            return;
        }
        Element $r10 = this.f32759g;
        String $r8 = $r10.toString(str);
        if ($r8 != null) {
            Context $r11 = new Context(str, i, $r8);
            m694d($r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Number
    /* renamed from: e */
    public InterfaceC11719g mo474e() {
        InterfaceC14613a $r2 = this.f32762n;
        InterfaceC11719g $r1 = $r2.mo1060a();
        InterfaceC11719g r3 = $r1;
        return r3;
    }
}
