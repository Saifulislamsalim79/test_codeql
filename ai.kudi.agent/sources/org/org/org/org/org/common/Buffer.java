package org.org.org.org.org.common;

import android.app.Activity;
import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import com.smartlook.sdk.smartlook.integration.IntegrationListener;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.c.m.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.Attribute;
import org.org.org.org.android.model.Log;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.app.C14581f;
import org.org.org.org.asm.Type;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.cryptopro.C14595b;
import org.org.org.org.asm.graph.C14601i;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.util.Iterator;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.asm.InterfaceC14636g;
import org.org.org.org.org.asm.commons.JSONObject;
import org.org.org.org.org.common.data.ByteBufferList;
import org.org.org.org.org.common.p599io.Element;
import org.org.org.org.org.common.telemetry.C14647a;
import org.org.org.org.org.common.telemetry.C14649i;
import org.org.org.org.org.common.telemetry.Item;
import org.org.org.org.org.core.p600xy.C14687f;
import org.org.org.org.org.core.session.EnumC14680c;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.data.p601xy.C14699a;
import org.org.org.org.org.data.p601xy.C14701f;
import org.org.org.org.org.data.p601xy.EnumC14700c;
import org.org.org.org.org.digests.C14704f;
import org.org.org.org.org.menu.InterfaceC14715i;
/* loaded from: classes.dex */
public final class Buffer implements InterfaceC14636g {

    /* renamed from: a */
    public final String[] f32510a;
    public final ByteBufferList attributes;

    /* renamed from: b */
    public ByteVector f32511b;
    public final C14704f buf;
    public final AtomicBoolean buffer;

    /* renamed from: c */
    public final HashMap<String, d> f32512c;

    /* renamed from: d */
    public final HashMap<String, e.a.a.a.c.o.b.a> f32513d;

    /* renamed from: f */
    public IntegrationListener f32514f;
    public final InterfaceC11824h head;
    public final String[] header;
    public final AtomicBoolean index;
    public final Attribute next;

    /* renamed from: r */
    public final Label f32515r;

    /* renamed from: s */
    public WeakReference<Activity> f32516s;
    public final C14581f size;
    public final Element this$0;
    public final Log value;

    /* renamed from: w */
    public final InterfaceC14715i f32517w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Buffer(ByteBufferList byteBufferList, Log log, Attribute attribute, C14581f c14581f, C14704f c14704f, Label label, InterfaceC14715i interfaceC14715i, Element element) {
        InterfaceC11824h $r13;
        Log_OC.getArray(byteBufferList, "recordNormalizationHandler");
        Log_OC.getArray(log, "trackingHandler");
        Log_OC.getArray(attribute, "httpClient");
        Log_OC.getArray(c14581f, "autoIntegrationHandler");
        Log_OC.getArray(c14704f, "recordHandler");
        Log_OC.getArray(label, "configurationHandler");
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(element, "visitorHandler");
        this.attributes = byteBufferList;
        this.value = log;
        this.next = attribute;
        this.size = c14581f;
        this.buf = c14704f;
        this.f32515r = label;
        this.f32517w = interfaceC14715i;
        this.this$0 = element;
        HashMap $r9 = new HashMap();
        this.f32512c = $r9;
        HashMap $r92 = new HashMap();
        this.f32513d = $r92;
        String[] $r10 = {null, null};
        this.header = $r10;
        String[] $r102 = {null, null};
        this.f32510a = $r102;
        AtomicBoolean $r11 = new AtomicBoolean(false);
        this.index = $r11;
        AtomicBoolean $r112 = new AtomicBoolean(false);
        this.buffer = $r112;
        C14639b $r12 = C14639b.f32526a;
        $r13 = C13218k.m5625b($r12);
        this.head = $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ String m946a(Buffer buffer, C14699a $r1, boolean $z0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            Label $r3 = buffer.f32515r;
            $r1 = $r3.getValue();
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        String $r4 = buffer.read($r1, $z0);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ ByteVector m947a(Buffer buffer, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = null;
        }
        ByteVector $r1 = buffer.m945b($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Item m950a(Activity activity, int i, long j) {
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
        int $i3 = $r6.ordinal();
        if ($i3 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r4 = new StringBuilder();
            $r4.append("createInitialRecord() called with: ");
            $r4.append("activity = ");
            String $r8 = org.org.org.org.asm.parser.Log.get(activity, false, 2, null);
            $r4.append($r8);
            $r4.append(", ");
            $r4.append("recordIndex = ");
            $r4.append(i);
            $r4.append(", ");
            $r4.append("sessionStartTimestamp = ");
            $r4.append(j);
            String $r82 = $r4.toString();
            $r7.append($r82);
            $r7.append(", [logAspect: ");
            $r7.append($r2);
            $r7.append(']');
            String $r83 = $r7.toString();
            $r5.size($r2, $r3, "SessionHandler", $r83);
        }
        C14649i $r9 = Item.f32545b;
        Label $r10 = this.f32515r;
        int $i32 = $r10.getColor();
        long $l2 = $i32;
        Label $r102 = this.f32515r;
        int $i33 = $r102.read();
        Type $r11 = Type.f32312c;
        String $r84 = $r11.getType(activity);
        EnumC14571f $r12 = Iterator.m1050a(activity);
        EnumC14571f $r13 = $r12;
        if ($r12 == null) {
            $r13 = EnumC14571f.f32271a;
        }
        C14595b $r14 = C14595b.f32346c;
        String $r15 = $r14.getType();
        Label $r103 = this.f32515r;
        String $r16 = $r103.get();
        Label $r104 = this.f32515r;
        List $r17 = $r104.m737c();
        String $r18 = $r17.toString();
        Label $r105 = this.f32515r;
        WebGLRecordingMode $r19 = $r105.getString();
        Item $r20 = $r9.add(i, j, $l2, $i33, $r84, $r13, $r15, $r16, $r18, $r19);
        return $r20;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final org.org.org.org.org.common.telemetry.Label m951a() {
        C14705f $r2 = C14705f.f32765a;
        C14647a $r3 = org.org.org.org.org.common.telemetry.Label.f32558b;
        Object $r4 = $r2.add("session_continuation_bundle", $r3);
        org.org.org.org.org.common.telemetry.Label $r5 = (org.org.org.org.org.common.telemetry.Label) $r4;
        if ($r5 == null) {
            System $r6 = System.f32375c;
            LogAspect $r7 = LogAspect.SESSION;
            LogSeverity $r8 = LogSeverity.INFO;
            TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
            int $i0 = $r9.ordinal();
            if ($i0 != 0) {
                return $r5;
            }
            String $r10 = "loadSessionContinuationBundle() could not be loaded, [logAspect: " + $r7 + ']';
            $r6.size($r7, $r8, "SessionHandler", $r10);
            return $r5;
        }
        System $r62 = System.f32375c;
        LogAspect $r72 = LogAspect.SESSION;
        LogSeverity $r82 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r92 = $r62.get($r72, false, $r82);
        int $i02 = $r92.ordinal();
        if ($i02 != 0) {
            return $r5;
        }
        StringBuilder $r11 = new StringBuilder();
        StringBuilder $r1 = new StringBuilder();
        $r1.append("loadSessionContinuationBundle() loaded: ");
        $r1.append("sessionContinuationBundle = ");
        String $r102 = org.org.org.org.asm.parser.Log.get($r5, false, 2, null);
        $r1.append($r102);
        String $r103 = $r1.toString();
        $r11.append($r103);
        $r11.append(", [logAspect: ");
        $r11.append($r72);
        $r11.append(']');
        String $r104 = $r11.toString();
        $r62.size($r72, $r82, "SessionHandler", $r104);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m948a(String str, EnumC14700c enumC14700c, InterfaceC11767l interfaceC11767l, InterfaceC11771p interfaceC11771p) {
        IntegrationListener $r13;
        String[] $r5 = this.header;
        int $i0 = enumC14700c.m706a();
        String $r6 = $r5[$i0];
        boolean $z0 = Log_OC.append(str, $r6);
        if (!$z0) {
            System $r7 = System.f32375c;
            LogAspect $r8 = LogAspect.SESSION;
            LogSeverity $r9 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
            int $i02 = $r10.ordinal();
            if ($i02 == 0) {
                StringBuilder $r11 = new StringBuilder();
                String $r62 = "handleUrl() notify Url change: url = " + str + ", urlType = " + enumC14700c;
                $r11.append($r62);
                $r11.append(", [logAspect: ");
                $r11.append($r8);
                $r11.append(']');
                String $r63 = $r11.toString();
                $r7.size($r8, $r9, "SessionHandler", $r63);
            }
            interfaceC11767l.invoke(str);
        }
        String[] $r52 = this.f32510a;
        int $i03 = enumC14700c.m706a();
        String $r64 = $r52[$i03];
        boolean $z02 = Log_OC.append(str, $r64);
        if (!(!$z02) || ($r13 = this.f32514f) == null) {
            return;
        }
        System $r72 = System.f32375c;
        LogAspect $r82 = LogAspect.SESSION;
        LogSeverity $r92 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r102 = $r72.get($r82, false, $r92);
        int $i04 = $r102.ordinal();
        if ($i04 == 0) {
            StringBuilder $r112 = new StringBuilder();
            String $r65 = "handleUrl() notify integration listener: url = " + str + ", urlType = " + enumC14700c;
            $r112.append($r65);
            $r112.append(", [logAspect: ");
            $r112.append($r82);
            $r112.append(']');
            String $r66 = $r112.toString();
            $r72.size($r82, $r92, "SessionHandler", $r66);
        }
        interfaceC11771p.invoke($r13, str);
        String[] $r53 = this.f32510a;
        int $i05 = enumC14700c.m706a();
        $r53[$i05] = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.core.util.Type add(Method method) {
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.SESSION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("calculateAndStoreVideoSize() called with: screenSize = ");
            String $r8 = org.org.org.org.asm.parser.Log.get(method, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r1);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r1, $r2, "SessionHandler", $r83);
        }
        C14687f $r9 = C14687f.f32709d;
        org.org.org.org.org.core.util.Type $r10 = $r9.add(method);
        TopLevel$NativeErrors $r52 = $r4.get($r1, false, $r2);
        int $i02 = $r52.ordinal();
        if ($i02 == 0) {
            StringBuilder $r62 = new StringBuilder();
            StringBuilder $r72 = new StringBuilder();
            $r72.append("calculateAndStoreVideoSize() calculated: videoSize = ");
            String $r84 = org.org.org.org.asm.parser.Log.get($r10, false, 2, null);
            $r72.append($r84);
            String $r85 = $r72.toString();
            $r62.append($r85);
            $r62.append(", [logAspect: ");
            $r62.append($r1);
            $r62.append(']');
            String $r86 = $r62.toString();
            $r4.size($r1, $r2, "SessionHandler", $r86);
        }
        Label $r11 = this.f32515r;
        $r11.add($r10);
        return $r10;
    }

    public final void buffer() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        C14705f $r1 = C14705f.f32765a;
        $r1.remove("session_continuation_bundle");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(Activity activity) {
        org.org.org.org.org.common.telemetry.Label $r2 = m951a();
        if ($r2 != null) {
            long $l0 = org.org.org.org.org.common.telemetry.Label.get($r2, 0L, 1, null);
            Label $r3 = this.f32515r;
            long $l1 = $r3.init();
            if ($l0 <= $l1) {
                System $r4 = System.f32375c;
                LogAspect $r5 = LogAspect.SESSION;
                LogSeverity $r6 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
                int $i3 = $r7.ordinal();
                if ($i3 == 0) {
                    StringBuilder $r8 = new StringBuilder();
                    StringBuilder $r9 = new StringBuilder();
                    $r9.append("setupNewOrContinueWithSession() continue with session: ");
                    $r9.append("sessionId = ");
                    String $r10 = $r2.m907a();
                    $r9.append($r10);
                    $r9.append(", ");
                    $r9.append("recordIndex = ");
                    int $i32 = $r2.getCount();
                    $r9.append($i32);
                    String $r102 = $r9.toString();
                    $r8.append($r102);
                    $r8.append(", [logAspect: ");
                    $r8.append($r5);
                    $r8.append(']');
                    String $r103 = $r8.toString();
                    $r4.size($r5, $r6, "SessionHandler", $r103);
                }
                String $r104 = $r2.m907a();
                int $i33 = $r2.getCount();
                long $l02 = $r2.m906b();
                write(activity, $r104, $i33, $l02);
                return;
            }
        }
        System $r42 = System.f32375c;
        LogAspect $r52 = LogAspect.SESSION;
        LogSeverity $r62 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r72 = $r42.get($r52, false, $r62);
        int $i34 = $r72.ordinal();
        if ($i34 == 0) {
            String $r105 = "setupNewOrContinueWithSession() create new session, [logAspect: " + $r52 + ']';
            $r42.size($r52, $r62, "SessionHandler", $r105);
        }
        C14601i $r11 = C14601i.f32355b;
        String $r106 = $r11.m1102c();
        long $l03 = System.currentTimeMillis();
        write(activity, $r106, 0, $l03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(org.org.org.org.org.common.telemetry.Label label) {
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.SESSION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r3 = new StringBuilder();
            $r3.append("saveSessionContinuationBundle() called with: bundle = ");
            String $r8 = org.org.org.org.asm.parser.Log.get(label, false, 2, null);
            $r3.append($r8);
            String $r82 = $r3.toString();
            $r7.append($r82);
            $r7.append(", [logAspect: ");
            $r7.append($r5);
            $r7.append(']');
            String $r83 = $r7.toString();
            $r4.size($r5, $r2, "SessionHandler", $r83);
        }
        C14705f $r9 = C14705f.f32765a;
        $r9.add(label, "session_continuation_bundle");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m944d(String str) {
        EnumC14700c $r2 = EnumC14700c.f32747c;
        ObjectContainerBase$3 $r3 = new ObjectContainerBase$3(this);
        C14640c $r4 = C14640c.f32527d;
        m948a(str, $r2, $r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m943d(String str, String str2) {
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.SESSION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            String $r9 = "setupIntegrationUrlListeners() called with: currentSessionId = " + str + ", currentVisitorId = " + str2;
            $r7.append($r9);
            $r7.append(", [logAspect: ");
            $r7.append($r1);
            $r7.append(']');
            String $r92 = $r7.toString();
            $r5.size($r1, $r2, "SessionHandler", $r92);
        }
        Label $r10 = this.f32515r;
        C14699a $r11 = $r10.getValue();
        if ($r11 != null) {
            String $r3 = $r11.m707a(str, str2);
            m944d($r3);
        }
        Label $r102 = this.f32515r;
        C14701f $r12 = $r102.m742a();
        if ($r12 != null) {
            String $r32 = $r12.m705a(str2);
            write($r32);
        }
        Label $r103 = this.f32515r;
        C14650x $r13 = new C14650x(this);
        $r103.m746b($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void encode(Buffer buffer, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "recordingStopped";
        }
        buffer.request($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void execute(Activity activity) {
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r4 = new StringBuilder();
            $r4.append("processNewActivity() called with: activity = ");
            String $r8 = org.org.org.org.asm.parser.Log.get(activity, false, 2, null);
            $r4.append($r8);
            String $r82 = $r4.toString();
            $r7.append($r82);
            $r7.append(", [logAspect: ");
            $r7.append($r2);
            $r7.append(']');
            String $r83 = $r7.toString();
            $r5.size($r2, $r3, "SessionHandler", $r83);
        }
        ByteVector $r9 = this.f32511b;
        if ($r9 == null) {
            close(activity);
        }
        History $r10 = new History(this, activity);
        Iterator.show(activity, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ Item get(Buffer buffer, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = null;
        }
        Item $r1 = buffer.get($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ Integer lookup(Buffer buffer, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = null;
        }
        Integer $r1 = buffer.create($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String next(Buffer buffer, C14701f $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            Label $r3 = buffer.f32515r;
            $r2 = $r3.m742a();
        }
        String $r4 = buffer.add($r2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read() {
        System $r2 = System.f32375c;
        LogAspect $r1 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r2.get($r1, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "startSession() called, [logAspect: " + $r1 + ']';
            $r2.size($r1, $r3, "SessionHandler", $r6);
        }
        AtomicBoolean $r7 = this.index;
        $r7.set(true);
        WeakReference $r8 = this.f32516s;
        if ($r8 != null) {
            Object $r9 = $r8.get();
            Activity $r10 = (Activity) $r9;
            if ($r10 != null) {
                ByteVector $r11 = this.f32511b;
                if ($r11 == null) {
                    Log_OC.loadImage($r10, "it");
                    read($r10);
                    return;
                }
                return;
            }
        }
        LogSeverity $r32 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r42 = $r2.get($r1, false, $r32);
        int $i02 = $r42.ordinal();
        if ($i02 != 0) {
            return;
        }
        String $r62 = "startSession() called before activity is available, [logAspect: " + $r1 + ']';
        $r2.size($r1, $r32, "SessionHandler", $r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void request(String str) {
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "stopSession() called with: reason = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "SessionHandler", $r82);
        }
        AtomicBoolean $r9 = this.buffer;
        $r9.set(false);
        AtomicBoolean $r92 = this.index;
        $r92.set(false);
        read(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean value(String str) {
        boolean $z0 = Log_OC.append(str, "sessionReset");
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ EnumC14680c write(Buffer buffer, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = null;
        }
        EnumC14680c $r1 = buffer.m949a($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write() {
        String $r6;
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            $r1.size($r2, $r3, "SessionHandler", "invalidateActiveSessionInstance() called, [logAspect: " + $r2 + ']');
        }
        d dVar = this.f32511b;
        if (dVar == null || ($r6 = dVar.m942a()) == null) {
            return;
        }
        HashMap $r8 = this.f32512c;
        $r8.put($r6, dVar);
        this.f32511b = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(Activity activity, String str, int i, long j) {
        System $r6 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r6.get($r2, false, $r3);
        int $i2 = $r7.ordinal();
        if ($i2 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("setupSession() called with: activity = " + org.org.org.org.asm.parser.Log.get(activity, false, 2, null) + ", sessionId = " + str + ", recordIndex = " + i + ", startTimestamp = " + j);
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r6.size($r2, $r3, "SessionHandler", $r8.toString());
        }
        Item $r11 = m950a(activity, i, j);
        ByteVector $r10 = new ByteVector(str, $r11, j);
        this.f32511b = $r10;
        Element $r12 = this.this$0;
        String $r9 = $r12.mo914d(str);
        if (i == 0) {
            Label $r13 = this.f32515r;
            $r13.set(str, $r9);
        }
        m943d(str, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str) {
        EnumC14700c $r2 = EnumC14700c.f32746b;
        ClassMarshaller$1 $r3 = new ClassMarshaller$1(this);
        Function $r4 = Function.f32522N;
        m948a(str, $r2, $r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(String str, Item item, boolean z) {
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.SESSION;
        LogSeverity $r6 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r5.get($r2, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r3 = new StringBuilder();
            $r3.append("closeAndStoreRecord() called with: ");
            $r3.append("sessionId = ");
            $r3.append(str);
            $r3.append(", ");
            $r3.append("recordToStore = ");
            String $r9 = org.org.org.org.asm.parser.Log.get(item, false, 2, null);
            $r3.append($r9);
            $r3.append(", ");
            $r3.append("closingSession = ");
            $r3.append(z);
            String $r92 = $r3.toString();
            $r8.append($r92);
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            String $r93 = $r8.toString();
            $r5.size($r2, $r6, "SessionHandler", $r93);
        }
        long $l1 = System.currentTimeMillis();
        Log $r10 = this.value;
        ArrayList $r11 = $r10.initialize();
        item.set(z, $l1, $r11);
        ByteBufferList $r12 = this.attributes;
        $r12.add(item);
        InterfaceC14715i $r13 = this.f32517w;
        $r13.mo553a(item, str);
        int $i02 = item.getType();
        if ($i02 == 0) {
            Label $r14 = this.f32515r;
            $r14.add(str);
        }
        C14704f $r15 = this.buf;
        int $i03 = item.getType();
        $r15.add(str, $i03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.core.Buffer writeTo() {
        InterfaceC11824h $r2 = this.head;
        Object $r1 = $r2.getValue();
        org.org.org.org.org.core.Buffer $r3 = (org.org.org.org.org.core.Buffer) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.org.org.org.org.core.session.EnumC14680c m949a(java.lang.String r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.HashMap<java.lang.String, e.a.a.a.c.o.b.a> r2 = r0.f32513d
            r0 = r21
            java.lang.Object r3 = r2.get(r0)
            r5 = r3
            org.org.org.org.org.core.session.c r5 = (org.org.org.org.org.core.session.EnumC14680c) r5
            r4 = r5
            r0 = r20
            r1 = r21
            org.org.org.org.org.common.telemetry.Item r6 = r0.get(r1)
            if (r6 == 0) goto L2d
            java.util.List r7 = r6.get()
            if (r7 == 0) goto L2d
            java.lang.Object r3 = kotlin.p557z.C13722p.m3940e0(r7)
            r9 = r3
            org.org.org.org.android.util.asm.Type r9 = (org.org.org.org.android.util.asm.Type) r9
            r8 = r9
            if (r8 == 0) goto L2d
            org.org.org.org.android.util.menu.f r10 = r8.getValue()
            goto L2e
        L2d:
            r10 = 0
        L2e:
            if (r10 == 0) goto L37
            org.org.org.org.android.util.menu.i r11 = org.org.org.org.android.util.menu.EnumC14571f.f32274l
            org.org.org.org.org.core.session.c r4 = r11.m1198a(r10)
            return r4
        L37:
            org.org.org.org.asm.parser.System r12 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r13 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.SESSION
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r14 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.INFO
            r16 = 0
            r0 = r16
            org.org.org.org.asm.parser.TopLevel$NativeErrors r15 = r12.get(r13, r0, r14)
            int r17 = r15.ordinal()
            if (r17 == 0) goto L4c
            goto L82
        L4c:
            java.lang.StringBuilder r18 = new java.lang.StringBuilder
            r0 = r18
            r0.<init>()
            java.lang.String r19 = "getFrameRotation() had to fallback to cache"
            r0 = r18
            r1 = r19
            r0.append(r1)
            java.lang.String r19 = ", [logAspect: "
            r0 = r18
            r1 = r19
            r0.append(r1)
            r0 = r18
            r0.append(r13)
            r16 = 93
            r0 = r18
            r1 = r16
            r0.append(r1)
            r0 = r18
            java.lang.String r21 = r0.toString()
            java.lang.String r19 = "SessionHandler"
            r0 = r19
            r1 = r21
            r12.size(r13, r14, r0, r1)
        L82:
            if (r4 == 0) goto L85
            return r4
        L85:
            org.org.org.org.org.core.session.c r4 = org.org.org.org.org.core.session.EnumC14680c.f32695d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.Buffer.m949a(java.lang.String):org.org.org.org.org.core.session.c");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String add() {
        ByteVector $r1 = m947a(this, (String) null, 1, (Object) null);
        if ($r1 != null) {
            String $r2 = $r1.m942a();
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String add(C14701f c14701f) {
        String $r3 = add();
        if ($r3 != null) {
            Element $r2 = this.this$0;
            String $r32 = $r2.toString($r3);
            if ($r32 == null || c14701f == null) {
                return null;
            }
            return c14701f.m705a($r32);
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(org.org.org.org.org.p602ui.asm.Item item) {
        Item $r2;
        if (item == null || ($r2 = get(this, null, 1, null)) == null) {
            return;
        }
        $r2.remove(item);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final ByteVector m945b(String str) {
        ByteVector $r2 = this.f32511b;
        String $r3 = $r2 != null ? $r2.m942a() : null;
        boolean $z0 = Log_OC.append(str, $r3);
        if (!$z0 && str != null) {
            HashMap $r4 = this.f32512c;
            Object $r5 = $r4.get(str);
            return (ByteVector) $r5;
        }
        return this.f32511b;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public JSONObject mo814c() {
        return new JSONObject() { // from class: org.org.org.org.org.common.DfsInserter$PackStream
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void close() {
                System $r2 = System.f32375c;
                LogAspect $r3 = LogAspect.SESSION;
                LogSeverity $r1 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r4 = $r2.get($r3, false, $r1);
                int $i0 = $r4.ordinal();
                if ($i0 == 0) {
                    String $r6 = "onApplicationSettle() called, [logAspect: " + $r3 + ']';
                    $r2.size($r3, $r1, "SessionHandler", $r6);
                }
                Buffer $r7 = Buffer.this;
                $r7.read("applicationClosed");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void close(Activity activity) {
                Log_OC.getArray(activity, "activity");
                System $r5 = System.f32375c;
                LogAspect $r2 = LogAspect.SESSION;
                LogSeverity $r3 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
                int $i0 = $r6.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r7 = new StringBuilder();
                    StringBuilder $r4 = new StringBuilder();
                    $r4.append("onIrregularSetup() called with: activity = ");
                    String $r8 = org.org.org.org.asm.parser.Log.get(activity, false, 2, null);
                    $r4.append($r8);
                    String $r82 = $r4.toString();
                    $r7.append($r82);
                    $r7.append(", [logAspect: ");
                    $r7.append($r2);
                    $r7.append(']');
                    String $r83 = $r7.toString();
                    $r5.size($r2, $r3, "SessionHandler", $r83);
                }
                Buffer $r9 = Buffer.this;
                $r9.read(activity);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void close(Throwable th) {
                Log_OC.getArray(th, "cause");
                System $r5 = System.f32375c;
                LogAspect $r1 = LogAspect.SESSION;
                LogSeverity $r2 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
                int $i0 = $r6.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r7 = new StringBuilder();
                    StringBuilder $r3 = new StringBuilder();
                    $r3.append("onApplicationCrash() called with: cause = ");
                    String $r8 = org.org.org.org.asm.parser.Log.get(th, false, 2, null);
                    $r3.append($r8);
                    String $r82 = $r3.toString();
                    $r7.append($r82);
                    $r7.append(", [logAspect: ");
                    $r7.append($r1);
                    $r7.append(']');
                    String $r83 = $r7.toString();
                    $r5.size($r1, $r2, "SessionHandler", $r83);
                }
                Buffer $r9 = Buffer.this;
                $r9.read("crash");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void read() {
                System $r1 = System.f32375c;
                LogAspect $r2 = LogAspect.SESSION;
                LogSeverity $r3 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
                int $i0 = $r4.ordinal();
                if ($i0 == 0) {
                    String $r6 = "onStopRecording() called, [logAspect: " + $r2 + ']';
                    $r1.size($r2, $r3, "SessionHandler", $r6);
                }
                Buffer $r7 = Buffer.this;
                Buffer.encode($r7, null, 1, null);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void read(Activity activity) {
                Log_OC.getArray(activity, "activity");
                System $r4 = System.f32375c;
                LogAspect $r2 = LogAspect.SESSION;
                LogSeverity $r3 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
                int $i0 = $r5.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r6 = new StringBuilder();
                    StringBuilder $r7 = new StringBuilder();
                    $r7.append("onActivityStarted() called with: activity = ");
                    String $r8 = org.org.org.org.asm.parser.Log.get(activity, false, 2, null);
                    $r7.append($r8);
                    String $r82 = $r7.toString();
                    $r6.append($r82);
                    $r6.append(", [logAspect: ");
                    $r6.append($r2);
                    $r6.append(']');
                    String $r83 = $r6.toString();
                    $r4.size($r2, $r3, "SessionHandler", $r83);
                }
                Buffer $r9 = Buffer.this;
                AtomicBoolean $r10 = $r9.buffer;
                $r10.set(false);
                Buffer $r92 = Buffer.this;
                $r92.read(activity);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void read(SetupOptions setupOptions) {
                Log_OC.getArray(setupOptions, "setupOptions");
                System $r4 = System.f32375c;
                LogAspect $r1 = LogAspect.SESSION;
                LogSeverity $r2 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
                int $i0 = $r5.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r6 = new StringBuilder();
                    StringBuilder $r7 = new StringBuilder();
                    $r7.append("onSetup() called with: setupOptions = ");
                    String $r8 = org.org.org.org.asm.parser.Log.get(setupOptions, false, 2, null);
                    $r7.append($r8);
                    String $r82 = $r7.toString();
                    $r6.append($r82);
                    $r6.append(", [logAspect: ");
                    $r6.append($r1);
                    $r6.append(']');
                    String $r83 = $r6.toString();
                    $r4.size($r1, $r2, "SessionHandler", $r83);
                }
                Buffer $r9 = Buffer.this;
                AtomicBoolean $r10 = $r9.index;
                $r10.set(false);
                boolean $z0 = setupOptions.isStartNewSession();
                if ($z0) {
                    Buffer $r92 = Buffer.this;
                    $r92.close();
                }
                boolean $z02 = setupOptions.isStartNewSessionAndUser();
                if ($z02) {
                    Buffer $r93 = Buffer.this;
                    $r93.close();
                    Buffer $r94 = Buffer.this;
                    Element $r11 = $r94.this$0;
                    $r11.close();
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void run() {
                System $r3 = System.f32375c;
                LogAspect $r1 = LogAspect.SESSION;
                LogSeverity $r2 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r4 = $r3.get($r1, false, $r2);
                int $i0 = $r4.ordinal();
                if ($i0 == 0) {
                    String $r6 = "onStartRecording() called, [logAspect: " + $r1 + ']';
                    $r3.size($r1, $r2, "SessionHandler", $r6);
                }
                Buffer $r7 = Buffer.this;
                $r7.read();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.org.asm.commons.JSONObject
            public void write() {
                System $r3 = System.f32375c;
                LogAspect $r1 = LogAspect.SESSION;
                LogSeverity $r2 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r4 = $r3.get($r1, false, $r2);
                int $i0 = $r4.ordinal();
                if ($i0 == 0) {
                    String $r6 = "onApplicationProbablyClosed() called, [logAspect: " + $r1 + ']';
                    $r3.size($r1, $r2, "SessionHandler", $r6);
                }
                Buffer $r7 = Buffer.this;
                $r7.buffer();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean clear() {
        AtomicBoolean $r1 = this.index;
        boolean $z0 = $r1.get();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer create(String str) {
        Item $r2 = get(str);
        if ($r2 != null) {
            int $i0 = $r2.getType();
            Integer $r3 = Integer.valueOf($i0);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.c.m.c.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean equals() {
        ByteVector $r1 = this.f32511b;
        if ($r1 == null) {
            return false;
        }
        long $l1 = $r1.get();
        Label $r2 = this.f32515r;
        int $i2 = $r2.m728f();
        long $l3 = $i2;
        return $l1 >= $l3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item get(String str) {
        ByteVector $r2 = m945b(str);
        if ($r2 != null) {
            Item $r3 = $r2.getSize();
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Activity getString() {
        WeakReference $r2 = this.f32516s;
        if ($r2 != null) {
            Object $r1 = $r2.get();
            Activity $r3 = (Activity) $r1;
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String read(C14699a c14699a, boolean z) {
        String $r2;
        String $r22 = add();
        Long $r3 = null;
        if ($r22 != null) {
            Element $r4 = this.this$0;
            String $r5 = $r4.toString($r22);
            if ($r5 == null || c14699a == null || ($r2 = c14699a.m707a($r22, $r5)) == null) {
                return null;
            }
            if (z) {
                Item $r6 = get(this, null, 1, null);
                if ($r6 != null) {
                    long $l0 = $r6.set();
                    $r3 = Long.valueOf($l0);
                }
                if ($r3 == null) {
                    return $r2;
                }
                StringBuilder $r7 = new StringBuilder();
                $r7.append($r2);
                $r7.append("?time=");
                long $l02 = System.currentTimeMillis();
                long $l1 = $r3.longValue();
                $r7.append($l02 - $l1);
                return $r7.toString();
            }
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.SESSION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r3 = new StringBuilder();
            $r3.append("tryToProcessNewActivity() called with: activity = ");
            String $r8 = org.org.org.org.asm.parser.Log.get(activity, false, 2, null);
            $r3.append($r8);
            String $r82 = $r3.toString();
            $r7.append($r82);
            $r7.append(", [logAspect: ");
            $r7.append($r5);
            $r7.append(']');
            String $r83 = $r7.toString();
            $r4.size($r5, $r2, "SessionHandler", $r83);
        }
        WeakReference $r9 = new WeakReference(activity);
        this.f32516s = $r9;
        AtomicBoolean $r10 = this.index;
        boolean $z0 = $r10.get();
        if ($z0) {
            AtomicBoolean $r102 = this.buffer;
            boolean $z02 = $r102.get();
            if ($z02) {
                return;
            }
            AtomicBoolean $r103 = this.buffer;
            $r103.set(true);
            execute(activity);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(String str) {
        int $i0;
        Log_OC.getArray(str, "reason");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.SESSION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i02 = $r5.ordinal();
        if ($i02 == 0) {
            StringBuilder $r6 = new StringBuilder();
            $r6.append("closeSession() called with: reason = " + str);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            $r2.size($r3, $r4, "SessionHandler", $r6.toString());
        }
        ByteVector $r9 = this.f32511b;
        if ($r9 == null) {
            LogSeverity $r42 = LogSeverity.WARN;
            TopLevel$NativeErrors $r52 = $r2.get($r3, false, $r42);
            int $i03 = $r52.ordinal();
            if ($i03 != 0) {
                return;
            }
            String $r1 = "closeSession() no active session!, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r42, "SessionHandler", $r1);
            return;
        }
        String $r8 = $r9.m942a();
        Integer $r10 = $r9.getValue();
        long $l1 = $r9.length();
        write();
        Log $r11 = this.value;
        $r11.write(str);
        org.org.org.org.org.core.Buffer $r12 = writeTo();
        boolean $z0 = value(str);
        $r12.write($r8, $z0, true);
        org.org.org.org.org.core.Buffer $r122 = writeTo();
        $r122.write();
        Attribute $r13 = this.next;
        $r13.read();
        C14581f $r14 = this.size;
        $r14.close();
        boolean $z02 = Log_OC.append(str, "sessionReset");
        if (!(!$z02)) {
            close();
            return;
        }
        if ($r10 != null) {
            int $i04 = $r10.intValue();
            $i0 = $i04 + 1;
        } else {
            $i0 = 0;
        }
        long $l2 = System.currentTimeMillis();
        org.org.org.org.org.common.telemetry.Label $r15 = new org.org.org.org.org.common.telemetry.Label($r8, $i0, $l1, $l2, str);
        close($r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(IntegrationListener integrationListener) {
        String[] $r2 = this.f32510a;
        EnumC14700c $r3 = EnumC14700c.f32747c;
        int $i0 = $r3.m706a();
        $r2[$i0] = null;
        String[] $r22 = this.f32510a;
        EnumC14700c $r4 = EnumC14700c.f32746b;
        int $i02 = $r4.m706a();
        $r22[$i02] = null;
        this.f32514f = integrationListener;
        if (integrationListener != null) {
            String $r5 = m946a(this, null, false, 3, null);
            String $r6 = next(this, null, 1, null);
            if ($r5 != null) {
                integrationListener.onSessionReady($r5);
                String[] $r23 = this.f32510a;
                int $i03 = $r3.m706a();
                $r23[$i03] = $r5;
            }
            if ($r6 != null) {
                integrationListener.onVisitorReady($r6);
                String[] $r24 = this.f32510a;
                int $i04 = $r4.m706a();
                $r24[$i04] = $r6;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str, boolean z, boolean z2) {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.SESSION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "storeAndCreateRecordIfNeeded() called with: sessionId = " + str + ", closingSession = " + z + ", lastRecord = " + z2;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r2.size($r3, $r4, "SessionHandler", $r82);
        }
        ByteVector $r9 = m945b(str);
        Item $r10 = $r9 != null ? $r9.getSize() : null;
        Integer $r11 = $r9 != null ? $r9.getValue() : null;
        if ($r9 == null || $r10 == null || $r11 == null) {
            LogSeverity $r42 = LogSeverity.WARN;
            TopLevel$NativeErrors $r52 = $r2.get($r3, false, $r42);
            int $i02 = $r52.ordinal();
            if ($i02 != 0) {
                return;
            }
            String $r1 = "storeAndCreateNewRecord() cannot obtain session data!, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r42, "SessionHandler", $r1);
            return;
        }
        if (z2) {
            $r9.m940a((Item) null);
        } else {
            int $i03 = $r11.intValue();
            Integer $r112 = Integer.valueOf($i03 + 1);
            $r9.m941a($r112);
            C14649i $r12 = Item.f32545b;
            int $i04 = $r112.intValue();
            Label $r13 = this.f32515r;
            int $i1 = $r13.getColor();
            long $l2 = $i1;
            Label $r132 = this.f32515r;
            int $i12 = $r132.read();
            Item $r14 = $r12.add($i04, $l2, $i12, $r10);
            $r9.m940a($r14);
        }
        String $r15 = $r9.m942a();
        write($r15, $r10, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(boolean z) {
        System $r2 = System.f32375c;
        LogAspect $r1 = LogAspect.SESSION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r2.get($r1, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            StringBuilder $r5 = new StringBuilder();
            String $r7 = "resetSession() called with: resetUser = " + z;
            $r5.append($r7);
            $r5.append(", [logAspect: ");
            $r5.append($r1);
            $r5.append(']');
            String $r72 = $r5.toString();
            $r2.size($r1, $r3, "SessionHandler", $r72);
        }
        AtomicBoolean $r8 = this.index;
        boolean $z1 = $r8.get();
        if (!$z1) {
            LogSeverity $r32 = LogSeverity.INFO;
            TopLevel$NativeErrors $r42 = $r2.get($r1, false, $r32);
            int $i02 = $r42.ordinal();
            if ($i02 != 0) {
                return;
            }
            String $r73 = "resetSession() cannot proceed with reset, there is no active session, [logAspect: " + $r1 + ']';
            $r2.size($r1, $r32, "SessionHandler", $r73);
            return;
        }
        TopLevel$NativeErrors $r43 = $r2.get($r1, false, $r3);
        int $i03 = $r43.ordinal();
        if ($i03 == 0) {
            StringBuilder $r52 = new StringBuilder();
            StringBuilder $r6 = new StringBuilder();
            $r6.append("resetSession() running session is going to be closed and new session will be started: ");
            $r6.append("resetUser = ");
            $r6.append(z);
            $r6.append(", ");
            $r6.append("currentSessionId = ");
            ByteVector $r9 = this.f32511b;
            String $r74 = $r9 != null ? $r9.m942a() : null;
            $r6.append($r74);
            String $r75 = $r6.toString();
            $r52.append($r75);
            $r52.append(", [logAspect: ");
            $r52.append($r1);
            $r52.append(']');
            String $r76 = $r52.toString();
            $r2.size($r1, $r3, "SessionHandler", $r76);
        }
        request("sessionReset");
        if (z) {
            Element $r10 = this.this$0;
            $r10.close();
        }
        read();
    }
}
