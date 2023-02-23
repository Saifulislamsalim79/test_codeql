package org.org.org.org.org.asm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import org.org.org.org.android.util.C14559f;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.C14591b;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.C14599g;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.util.Iterator;
import org.org.org.org.org.common.Buffer;
import org.org.org.org.org.common.C14642f;
import org.org.org.org.org.core.internal.asm.C14671f;
import org.org.org.org.org.initializer.C14708f;
/* renamed from: org.org.org.org.org.asm.f */
/* loaded from: classes.dex */
public final class C14635f {

    /* renamed from: a */
    public final AtomicBoolean f32501a;

    /* renamed from: b */
    public final C14632c f32502b;

    /* renamed from: c */
    public List<String> f32503c;

    /* renamed from: f */
    public final InterfaceC11824h f32504f;

    /* renamed from: q */
    public List<Future<?>> f32505q;

    /* renamed from: r */
    public ScheduledThreadPoolExecutor f32506r;

    /* renamed from: t */
    public final AtomicBoolean f32507t;

    /* renamed from: v */
    public WeakReference<Activity> f32508v;

    /* renamed from: x */
    public int f32509x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14635f(C14632c c14632c) {
        InterfaceC11824h $r1;
        Log_OC.getArray(c14632c, "callbackHandler");
        this.f32502b = c14632c;
        ArrayList $r3 = new ArrayList();
        this.f32505q = $r3;
        ArrayList $r32 = new ArrayList();
        this.f32503c = $r32;
        AtomicBoolean $r4 = new AtomicBoolean(false);
        this.f32507t = $r4;
        AtomicBoolean $r42 = new AtomicBoolean(false);
        this.f32501a = $r42;
        Label $r5 = new Label(this);
        $r1 = C13218k.m5625b($r5);
        this.f32504f = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C13666w m969a(Activity activity) {
        C14599g $r1 = C14599g.f32352a;
        C14631b $r2 = new C14631b(this, activity);
        Object $r3 = $r1.m1107a($r2);
        C13666w $r5 = (C13666w) $r3;
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r16 != false) goto L8;
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x008d */
    /* JADX WARN: Incorrect condition in loop: B:36:0x018c */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m967a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.C14635f.m967a(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007e, code lost:
        if (r15 != false) goto L8;
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x008b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.C14635f.add(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final ByteVector m963b() {
        InterfaceC11824h $r2 = this.f32504f;
        Object $r1 = $r2.getValue();
        ByteVector $r3 = (ByteVector) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(Activity activity) {
        AtomicBoolean $r2 = this.f32501a;
        boolean $z0 = $r2.get();
        if ($z0) {
            return;
        }
        org.org.org.org.asm.p598ec.ClassWriter $r3 = org.org.org.org.asm.p598ec.ClassWriter.f32349b;
        $r3.init(activity);
        AtomicBoolean $r22 = this.f32501a;
        $r22.set(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m962d() {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.LIFECYCLE;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            String $r8 = "letApplicationSettle(): application is going to settle, [logAspect: " + $r4 + ']';
            $r3.size($r4, $r5, "SDKLifecycleHandler", $r8);
        }
        C14632c $r1 = this.f32502b;
        Attribute $r2 = Attribute.f32480a;
        C14632c.m978a($r1, null, null, $r2, 3, null);
        if (this.f32506r == null) {
            AtomicBoolean $r10 = this.f32507t;
            boolean $z0 = $r10.get();
            if ($z0) {
                Runnable runnable = new Runnable() { // from class: org.org.org.org.org.asm.MonthByWeekFragment$2
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        List $r9;
                        System $r12 = System.f32375c;
                        LogAspect $r22 = LogAspect.LIFECYCLE;
                        LogSeverity $r32 = LogSeverity.DEBUG;
                        TopLevel$NativeErrors $r42 = $r12.get($r22, false, $r32);
                        int $i02 = $r42.ordinal();
                        if ($i02 == 0) {
                            String $r62 = "letApplicationSettle(): application is settled and its closed, [logAspect: " + $r22 + ']';
                            $r12.size($r22, $r32, "SDKLifecycleHandler", $r62);
                        }
                        C14635f $r7 = C14635f.this;
                        C14632c $r82 = $r7.f32502b;
                        $r9 = C13724q.m3901b(e.a.a.a.c.m.c.class);
                        d$g$a $r102 = d$g$a.f32496d;
                        C14632c.m978a($r82, null, $r9, $r102, 1, null);
                    }
                };
                Settings $r12 = Settings.this$0;
                ScheduledThreadPoolExecutor $r9 = $r12.get(2, "settle");
                TimeUnit $r13 = TimeUnit.MILLISECONDS;
                ScheduledFuture $r14 = $r9.schedule(runnable, 1000L, $r13);
                List $r15 = this.f32505q;
                Log_OC.loadImage($r14, "it");
                $r15.add($r14);
                this.f32506r = $r9;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    private final void m957i() {
        this.f32509x = 0;
        List $r1 = this.f32503c;
        $r1.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m970a() {
        List $r13;
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "startRecording() called, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r7);
        }
        WeakReference $r8 = this.f32508v;
        if ($r8 != null) {
            Object $r9 = $r8.get();
            Activity activity = (Activity) $r9;
            if (activity != null) {
                Log_OC.loadImage(activity, "it");
                String $r72 = Iterator.m1049d(activity);
                m967a($r72);
            }
        }
        AtomicBoolean $r11 = this.f32507t;
        $r11.set(true);
        C14632c $r12 = this.f32502b;
        $r13 = C13724q.m3901b(e.a.a.a.c.m.c.class);
        ClassWriter $r1 = ClassWriter.f32483b;
        C14632c.m978a($r12, $r13, null, $r1, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m968a(SetupOptions setupOptions) {
        List $r12;
        List $r122;
        List $r123;
        Log_OC.getArray(setupOptions, "setupOptions");
        C14632c $r3 = this.f32502b;
        C14708f $r5 = C14708f.f32807a;
        Buffer $r6 = $r5.get();
        C14637i $r7 = $r5.m642p();
        C14559f $r8 = $r5.getValue();
        C14642f $r9 = $r5.add();
        C14671f $r10 = $r5.m648f();
        org.org.org.org.org.core.Buffer $r11 = $r5.getItem();
        InterfaceC14636g[] $r4 = {$r6, $r7, $r8, $r9, $r10, $r11};
        $r12 = C13726r.m3888h($r4);
        $r3.m980a($r12);
        C14632c $r32 = this.f32502b;
        $r122 = C13724q.m3901b(e.a.a.a.c.m.c.class);
        C14634e $r1 = new C14634e(setupOptions);
        C14632c.m978a($r32, $r122, null, $r1, 2, null);
        C14598f $r13 = C14598f.f32351c;
        Context $r14 = $r13.getContext();
        if ($r14 == null) {
            NullPointerException $r29 = new NullPointerException("null cannot be cast to non-null type android.app.Application");
            throw $r29;
        }
        Application $r15 = (Application) $r14;
        ActivityLifecycleCallbacksWrapper $r16 = new ActivityLifecycleCallbacksWrapper(this);
        $r15.registerActivityLifecycleCallbacks($r16);
        Activity $r17 = setupOptions.getActivity();
        Activity $r18 = $r17;
        if ($r17 == null) {
            C14591b $r19 = C14591b.f32344c;
            $r18 = $r19.m1117a();
        }
        if ($r18 != null) {
            System $r20 = System.f32375c;
            LogAspect $r21 = LogAspect.LIFECYCLE;
            LogSeverity $r22 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r23 = $r20.get($r21, false, $r22);
            int $i0 = $r23.ordinal();
            if ($i0 == 0) {
                StringBuilder $r24 = new StringBuilder();
                StringBuilder $r25 = new StringBuilder();
                $r25.append("setup(): irregular setup called: activity = ");
                String $r26 = Log.get($r18, false, 2, null);
                $r25.append($r26);
                String $r262 = $r25.toString();
                $r24.append($r262);
                $r24.append(", [logAspect: ");
                $r24.append($r21);
                $r24.append(']');
                String $r263 = $r24.toString();
                $r20.size($r21, $r22, "SDKLifecycleHandler", $r263);
            }
            clear($r18);
            String $r264 = Iterator.m1049d($r18);
            m967a($r264);
            WeakReference $r27 = new WeakReference($r18);
            this.f32508v = $r27;
            C14632c $r33 = this.f32502b;
            $r123 = C13724q.m3901b(e.a.a.a.c.m.c.class);
            ArraysKt___ArraysKt$withIndex$6 $r28 = new ArraysKt___ArraysKt$withIndex$6($r18);
            C14632c.m978a($r33, $r123, null, $r28, 2, null);
            m969a($r18);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        List $r10;
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.LIFECYCLE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "stopRecording() called, [logAspect: " + $r1 + ']';
            $r4.size($r1, $r2, "SDKLifecycleHandler", $r7);
        }
        m957i();
        AtomicBoolean $r8 = this.f32507t;
        $r8.set(false);
        C14632c $r9 = this.f32502b;
        $r10 = C13724q.m3901b(e.a.a.a.c.m.c.class);
        Level $r3 = Level.f32487D;
        C14632c.m978a($r9, null, $r10, $r3, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close(Throwable th) {
        List $r11;
        Log_OC.getArray(th, "cause");
        System $r5 = System.f32375c;
        LogAspect $r2 = LogAspect.LIFECYCLE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r2, false, $r3);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("applicationCrash() called with: cause = ");
            String $r9 = Log.get(th, false, 2, null);
            $r8.append($r9);
            String $r92 = $r8.toString();
            $r7.append($r92);
            $r7.append(", [logAspect: ");
            $r7.append($r2);
            $r7.append(']');
            String $r93 = $r7.toString();
            $r5.size($r2, $r3, "SDKLifecycleHandler", $r93);
        }
        C14632c $r10 = this.f32502b;
        $r11 = C13724q.m3901b(e.a.a.a.c.m.c.class);
        RestAdapter$RestHandler $r4 = new RestAdapter$RestHandler(th);
        C14632c.m978a($r10, null, $r11, $r4, 1, null);
    }
}
