package org.org.org.org.org.core;

import android.graphics.Bitmap;
import android.os.Build;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.f.u.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import org.org.org.org.android.util.C14559f;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.C14599g;
import org.org.org.org.asm.asm.C14586c;
import org.org.org.org.asm.asm.Face;
import org.org.org.org.asm.parser.C14612c;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.ClassWriter;
import org.org.org.org.org.asm.InterfaceC14636g;
import org.org.org.org.org.asm.commons.JSONObject;
import org.org.org.org.org.common.ByteVector;
import org.org.org.org.org.core.internal.asm.C14671f;
import org.org.org.org.org.core.session.EnumC14680c;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.menu.C14711c;
import org.org.org.org.org.menu.InterfaceC14715i;
import org.org.org.org.org.p602ui.asm.Item;
/* loaded from: classes.dex */
public final class Buffer implements InterfaceC14636g {
    public static final long mask;

    /* renamed from: a */
    public final InterfaceC14715i f32583a;
    public ArrayList<o> buffer;

    /* renamed from: c */
    public final C14711c f32584c;
    public HashMap<String, List<o>> data;
    public ScheduledThreadPoolExecutor executor;

    /* renamed from: f */
    public final C14671f f32585f;

    /* renamed from: id */
    public AtomicInteger f32586id;
    public AtomicLong index;
    public final Object left;
    public ArrayList<Future<?>> listeners;
    public AtomicInteger lock;
    public ScheduledThreadPoolExecutor next;

    /* renamed from: s */
    public final AtomicInteger f32587s;
    public final C14559f size;
    public final AtomicBoolean state;
    public final Label this$0;
    public AtomicLong title;
    public final InterfaceC11824h value;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        TimeUnit $r0 = TimeUnit.SECONDS;
        long $l0 = $r0.toMillis(3L);
        mask = $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Buffer(InterfaceC14715i interfaceC14715i, C14711c c14711c, C14671f c14671f, Label label, C14559f c14559f) {
        InterfaceC11824h $r7;
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(c14711c, "frameStorageHandler");
        Log_OC.getArray(c14671f, "screenshotHandler");
        Log_OC.getArray(label, "configurationHandler");
        Log_OC.getArray(c14559f, "automaticEventDetectionHandler");
        this.f32583a = interfaceC14715i;
        this.f32584c = c14711c;
        this.f32585f = c14671f;
        this.this$0 = label;
        this.size = c14559f;
        C14664b $r6 = C14664b.f32621e;
        $r7 = C13218k.m5625b($r6);
        this.value = $r7;
        Settings $r8 = Settings.this$0;
        ScheduledThreadPoolExecutor $r9 = $r8.get(2, "vcapture");
        this.executor = $r9;
        ScheduledThreadPoolExecutor $r92 = $r8.get(2, "vsave");
        this.next = $r92;
        AtomicBoolean $r10 = new AtomicBoolean(false);
        this.state = $r10;
        AtomicInteger $r11 = new AtomicInteger(0);
        this.f32586id = $r11;
        AtomicLong $r12 = new AtomicLong(0L);
        this.index = $r12;
        ArrayList $r13 = new ArrayList();
        this.buffer = $r13;
        HashMap $r14 = new HashMap();
        this.data = $r14;
        ArrayList $r132 = new ArrayList();
        this.listeners = $r132;
        AtomicInteger $r112 = new AtomicInteger(0);
        this.lock = $r112;
        AtomicLong $r122 = new AtomicLong(0L);
        this.title = $r122;
        AtomicInteger $r113 = new AtomicInteger(0);
        this.f32587s = $r113;
        Object $r15 = new Object();
        this.left = $r15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m888a(java.util.List r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.asm.asm.m r5 = (org.org.org.org.asm.asm.C14590m) r5
            r4 = r5
            org.org.org.org.asm.Attribute r6 = org.org.org.org.asm.Attribute.f32301a
            android.view.View r7 = r4.getName()
            android.view.Window r8 = r6.m1168a(r7)
            if (r8 == 0) goto L27
            r0.add(r8)
            goto L9
        L27:
            r9 = 0
            r0.add(r9)
            goto L9
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.Buffer.m888a(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0041 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0027 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m887a(java.util.List r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            java.util.HashMap<java.lang.String, java.util.List<e.a.a.a.f.u.o>> r2 = r0.data
            r0 = r20
            java.lang.Object r3 = r2.get(r0)
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            r4 = r5
            if (r4 == 0) goto L6d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = r19
            java.util.Iterator r8 = r0.iterator()
        L23:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L60
            java.lang.Object r3 = r8.next()
            r11 = r3
            org.org.org.org.asm.asm.c r11 = (org.org.org.org.asm.asm.C14586c) r11
            r10 = r11
            boolean r12 = r4.isEmpty()
            r9 = 1
            if (r12 == 0) goto L39
            goto L59
        L39:
            java.util.Iterator r13 = r4.iterator()
        L3d:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L59
            java.lang.Object r14 = r13.next()
            r16 = r14
            org.org.org.org.asm.asm.c r16 = (org.org.org.org.asm.asm.C14586c) r16
            r15 = r16
            boolean r12 = kotlin.p483e0.p485d.Log_OC.append(r15, r10)
            r17 = 1
            r0 = r17
            r12 = r12 ^ r0
            if (r12 == 0) goto L3d
            goto L5a
        L59:
            r9 = 0
        L5a:
            if (r9 == 0) goto L23
            r7.add(r3)
            goto L23
        L60:
            r6.addAll(r7)
            r0 = r18
            java.util.HashMap<java.lang.String, java.util.List<e.a.a.a.f.u.o>> r2 = r0.data
            r0 = r20
            r2.put(r0, r6)
            return r6
        L6d:
            r0 = r18
            java.util.HashMap<java.lang.String, java.util.List<e.a.a.a.f.u.o>> r2 = r0.data
            r0 = r20
            r1 = r19
            r2.put(r0, r1)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.Buffer.m887a(java.util.List, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m889a() {
        C14599g $r1 = C14599g.f32352a;
        ClassWriter $r2 = ClassWriter.f32463b;
        List $r3 = $r2.values();
        boolean $z0 = $r1.remove($r3);
        if ($z0) {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 24) {
                Label $r4 = this.this$0;
                boolean $z02 = $r4.close();
                return $z02;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(List list, boolean[] zArr) throws Exception {
        org.org.org.org.org.common.Buffer $r3 = getValue();
        String $r4 = $r3.add();
        org.org.org.org.org.common.Buffer $r32 = getValue();
        Integer $r5 = org.org.org.org.org.common.Buffer.lookup($r32, null, 1, null);
        if ($r4 == null || $r5 == null) {
            IllegalArgumentException $r13 = new IllegalArgumentException("Cannot obtain sessionID or recordNumber!");
            throw $r13;
        }
        C14671f $r6 = this.f32585f;
        org.org.org.org.org.common.Buffer $r33 = getValue();
        EnumC14680c $r7 = org.org.org.org.org.common.Buffer.write($r33, (String) null, 1, (Object) null);
        Face $r8 = $r6.add(list, zArr, $r7);
        org.org.org.org.org.common.Buffer $r34 = getValue();
        Item $r9 = $r8.getY();
        $r34.add($r9);
        C14711c $r10 = this.f32584c;
        int $i0 = $r5.intValue();
        AtomicInteger $r11 = this.f32586id;
        int $i1 = $r11.get();
        Bitmap $r12 = $r8.getX();
        $r10.add($r4, $i0, $i1, $r12, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean call() {
        long $l1 = System.currentTimeMillis();
        AtomicLong $r1 = this.index;
        long $l2 = $r1.get();
        long $l12 = $l1 - $l2;
        Label $r2 = this.this$0;
        long $l22 = $r2.put();
        return $l12 > $l22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void execute() {
        org.org.org.org.org.common.Buffer $r3 = getValue();
        boolean $z0 = $r3.equals();
        if (!$z0) {
            boolean $z02 = put();
            if ($z02) {
                init();
                return;
            }
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r2 = LogSeverity.INFO;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "finishBatchIfAboveUpperTimeLimit() session limit exceeded!, [logAspect: " + $r1 + ']';
            $r4.size($r1, $r2, "VideoCaptureHandler", $r7);
        }
        org.org.org.org.org.common.Buffer $r32 = getValue();
        $r32.write(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void format(Buffer buffer, String str, boolean $z0, boolean $z1, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = false;
        }
        buffer.write(str, $z0, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean getIndex() {
        AtomicLong $r3 = this.index;
        long $l0 = $r3.get();
        boolean $z0 = $l0 == 0;
        System $r1 = System.f32375c;
        LogAspect $r4 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r1.get($r4, false, $r2);
        int $i2 = $r5.ordinal();
        if ($i2 != 0) {
            return $z0;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r8 = "isFirstBatch(): isFirstBatch = " + $z0;
        $r6.append($r8);
        $r6.append(", [logAspect: ");
        $r6.append($r4);
        $r6.append(']');
        String $r82 = $r6.toString();
        $r1.size($r4, $r2, "VideoCaptureHandler", $r82);
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.common.Buffer getValue() {
        InterfaceC11824h $r2 = this.value;
        Object $r1 = $r2.getValue();
        org.org.org.org.org.common.Buffer $r3 = (org.org.org.org.org.common.Buffer) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean put() {
        long $l1 = System.currentTimeMillis();
        AtomicLong $r1 = this.index;
        long $l2 = $r1.get();
        long $l12 = $l1 - $l2;
        Label $r2 = this.this$0;
        int $i3 = $r2.getSize();
        long $l22 = $i3;
        return $l12 > $l22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void read(boolean z) {
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            StringBuilder $r5 = new StringBuilder();
            $r5.append("setupNewBatch() called with: isFirstBatch = " + z);
            $r5.append(", [logAspect: ");
            $r5.append($r2);
            $r5.append(']');
            $r1.size($r2, $r3, "VideoCaptureHandler", $r5.toString());
        }
        AtomicBoolean $r8 = this.state;
        $r8.set(false);
        long $l1 = System.currentTimeMillis();
        AtomicInteger $r9 = this.f32586id;
        $r9.set(0);
        AtomicLong $r10 = this.index;
        $r10.set($l1);
        if (!z) {
            TopLevel$NativeErrors $r42 = $r1.get($r2, false, $r3);
            int $i02 = $r42.ordinal();
            if ($i02 == 0) {
                $r1.size($r2, $r3, "VideoCaptureHandler", "setupNewBatch() stop video capture and create video, [logAspect: " + $r2 + ']');
            }
            org.org.org.org.org.common.Buffer $r11 = getValue();
            String $r7 = $r11.add();
            if ($r7 != null) {
                format(this, $r7, false, false, 6, null);
            } else {
                LogSeverity $r32 = LogSeverity.ERROR;
                TopLevel$NativeErrors $r43 = $r1.get($r2, false, $r32);
                int $i03 = $r43.ordinal();
                if ($i03 == 0) {
                    $r1.size($r2, $r32, "VideoCaptureHandler", "setupNewBatch() cannot store video batch: sessionId = null, [logAspect: " + $r2 + ']');
                }
            }
        }
        ArrayList $r12 = new ArrayList();
        this.buffer = $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final long readAll() {
        Label $r1 = this.this$0;
        int $i0 = $r1.read();
        long $l1 = $i0;
        return 1000 / $l1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set() {
        int $i3;
        long $l0 = System.currentTimeMillis();
        ArrayList $r1 = this.buffer;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            AtomicInteger $r3 = this.f32586id;
            int $i1 = $r3.get();
            AtomicLong $r4 = this.index;
            long $l2 = $r4.get();
            C14586c $r2 = new C14586c($i1, $l0 - $l2, $l0);
            $r1.add($r2);
        } else {
            AtomicInteger $r32 = this.f32586id;
            int $i12 = $r32.get();
            $i3 = C13726r.m3889g($r1);
            Object $r5 = $r1.get($i3);
            long $l22 = ((C14586c) $r5).getValue();
            C14586c $r22 = new C14586c($i12, $l0 - $l22, $l0);
            $r1.add($r22);
        }
        AtomicInteger $r33 = this.f32586id;
        $r33.incrementAndGet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void start() {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            $r2.size($r3, $r4, "VideoCaptureHandler", "captureVideoSequenceIfPossible() called, [logAspect: " + $r3 + ']');
        }
        org.org.org.org.org.common.Buffer $r8 = getValue();
        String $r7 = $r8.add();
        AtomicBoolean $r9 = this.state;
        boolean $z0 = $r9.get();
        if ($z0) {
            return;
        }
        if ($r7 != null) {
            Label $r10 = this.this$0;
            boolean $z02 = $r10.m758a($r7);
            if (!$z02) {
                return;
            }
        }
        AtomicBoolean $r92 = this.state;
        $r92.set(true);
        ScheduledThreadPoolExecutor $r11 = this.executor;
        boolean $z03 = $r11.isShutdown();
        if ($z03) {
            Settings $r12 = Settings.this$0;
            ScheduledThreadPoolExecutor $r112 = $r12.get(2, "vcapture");
            this.executor = $r112;
        }
        AtomicInteger $r13 = this.lock;
        $r13.incrementAndGet();
        ArrayList $r14 = this.listeners;
        ScheduledThreadPoolExecutor $r113 = this.executor;
        Runnable $r15 = wrapTask();
        long $l1 = readAll();
        TimeUnit $r1 = TimeUnit.MILLISECONDS;
        ScheduledFuture $r16 = $r113.scheduleAtFixedRate($r15, 0L, $l1, $r1);
        $r14.add($r16);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Runnable wrapTask() {
        return new Runnable() { // from class: org.org.org.org.org.core.WrappingExecutorService$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:19:0x005d */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 705
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.WrappingExecutorService$1.run():void");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] write(java.util.List r21) {
        /*
            r20 = this;
            long r1 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            r0 = r21
            int r4 = kotlin.p557z.C13722p.m3921o(r0, r5)
            r3.<init>(r4)
            r0 = r21
            java.util.Iterator r6 = r0.iterator()
        L17:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L47
            java.lang.Object r8 = r6.next()
            r10 = r8
            android.view.Window r10 = (android.view.Window) r10
            r9 = r10
            org.org.org.org.org.core.internal.f r11 = org.org.org.org.org.core.internal.C14679f.f32684b
            java.lang.Long r12 = r11.size(r9)
            if (r12 == 0) goto L3c
            long r13 = r12.longValue()
            long r15 = r1 - r13
            long r13 = org.org.org.org.org.core.Buffer.mask
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 >= 0) goto L3a
            goto L3c
        L3a:
            r7 = 0
            goto L3d
        L3c:
            r7 = 1
        L3d:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r7)
            r0 = r18
            r3.add(r0)
            goto L17
        L47:
            boolean[] r19 = kotlin.p557z.C13722p.m3907x0(r3)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.Buffer.write(java.util.List):boolean[]");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public JSONObject mo814c() {
        C14651a $r1 = new C14651a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0051 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r25 = this;
            org.org.org.org.asm.parser.System r4 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r5 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_CAPTURE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r6 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r8 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r7 = r4.get(r5, r8, r6)
            int r9 = r7.ordinal()
            if (r9 == 0) goto L12
            goto L32
        L12:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "cancelVideoCapture() called"
            r10.append(r11)
            java.lang.String r11 = ", [logAspect: "
            r10.append(r11)
            r10.append(r5)
            r8 = 93
            r10.append(r8)
            java.lang.String r12 = r10.toString()
            java.lang.String r11 = "VideoCaptureHandler"
            r4.size(r5, r6, r11, r12)
        L32:
            r0 = r25
            java.util.concurrent.ScheduledThreadPoolExecutor r13 = r0.executor
            boolean r14 = r13.isShutdown()
            if (r14 != 0) goto L7b
            r0 = r25
            java.util.concurrent.ScheduledThreadPoolExecutor r13 = r0.executor
            r13.shutdownNow()
            r0 = r25
            java.util.ArrayList<java.util.concurrent.Future<?>> r15 = r0.listeners
            java.util.Iterator r16 = r15.iterator()
        L4b:
            r0 = r16
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L66
            r0 = r16
            java.lang.Object r17 = r0.next()
            r19 = r17
            java.util.concurrent.Future r19 = (java.util.concurrent.Future) r19
            r18 = r19
            r8 = 1
            r0 = r18
            r0.cancel(r8)
            goto L4b
        L66:
            r0 = r25
            java.util.concurrent.atomic.AtomicInteger r0 = r0.lock
            r20 = r0
            r8 = 0
            r0 = r20
            r0.set(r8)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r0 = r25
            r0.listeners = r15
        L7b:
            r0 = r25
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.state
            r21 = r0
            r8 = 0
            r0 = r21
            r0.set(r8)
            r0 = r25
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f32586id
            r20 = r0
            r8 = 0
            r0 = r20
            r0.set(r8)
            r0 = r25
            java.util.concurrent.atomic.AtomicLong r0 = r0.index
            r22 = r0
            long r23 = java.lang.System.currentTimeMillis()
            r0 = r22
            r1 = r23
            r0.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.Buffer.close():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.c.o.a.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void init() {
        ScheduledThreadPoolExecutor $r1 = this.next;
        $r1.execute(new Runnable() { // from class: org.org.org.org.org.core.ConnectionsManager$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Buffer $r12 = Buffer.this;
                $r12.read();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read() {
        Object $r1 = this.left;
        synchronized ($r1) {
            System $r3 = System.f32375c;
            LogAspect $r4 = LogAspect.VIDEO_CAPTURE;
            LogSeverity $r2 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r2);
            int $i0 = $r5.ordinal();
            if ($i0 == 0) {
                String $r7 = "startNewRecording() called, [logAspect: " + $r4 + ']';
                $r3.size($r4, $r2, "VideoCaptureHandler", $r7);
            }
            boolean $z0 = getIndex();
            if ($z0) {
                AtomicLong $r8 = this.index;
                long $l1 = System.currentTimeMillis();
                $r8.set($l1);
            } else if (!$z0) {
                boolean $z1 = put();
                if (!$z1) {
                    return;
                }
            }
            read($z0);
            start();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write() {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r2.get($r3, false, $r1);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "invalidateLastBatchTimestamp() called, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r1, "VideoCaptureHandler", $r6);
        }
        AtomicLong $r7 = this.index;
        $r7.set(0L);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0097 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.Buffer.write(java.lang.String, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str, boolean z, boolean z2) {
        Log_OC.getArray(str, "sessionId");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "stopVideoCaptureAndCreateVideo() called with: sessionId = " + str + ", closingSession = " + z + ", lastRecord = " + z2;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r3.size($r4, $r2, "VideoCaptureHandler", $r82);
        }
        C14612c $r9 = C14612c.f32380c;
        $r9.m1062a();
        close();
        org.org.org.org.org.common.Buffer $r10 = getValue();
        ByteVector $r11 = $r10.m945b(str);
        Integer $r12 = $r11 != null ? $r11.getValue() : null;
        if ($r11 != null && $r12 != null) {
            Label $r13 = this.this$0;
            boolean $z2 = $r13.m758a(str);
            if ($z2) {
                int $i02 = $r12.intValue();
                write(str, $i02);
                org.org.org.org.org.common.Buffer $r102 = getValue();
                $r102.write(str, z, z2);
                return;
            }
        }
        InterfaceC14715i $r14 = this.f32583a;
        $r14.mo543e(str);
    }
}
