package org.org.org.org.android.util.common.net;

import android.app.Activity;
import android.util.Log;
import com.smartlook.sdk.smartlook.core.api.annotation.CrashTrackingMode;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.Thread;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14539c;
import org.org.org.org.asm.asm.ZipInputStream;
import org.org.org.org.asm.nonstiff.C14611b;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.asm.C14635f;
import org.org.org.org.org.asm.C14637i;
import org.org.org.org.org.asm.Permissions;
import org.org.org.org.org.common.Buffer;
import org.org.org.org.org.menu.InterfaceC14715i;
/* loaded from: classes.dex */
public final class Attribute {
    public static final Logger logger;

    /* renamed from: a */
    public final InterfaceC14715i f32175a;

    /* renamed from: b */
    public final C14637i f32176b;
    public final org.org.org.org.org.common.Logger buffer;
    public final C14635f name;
    public final Buffer parent;
    public Thread.UncaughtExceptionHandler value;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Logger $r1 = new Logger(null);
        logger = $r1;
        String[] $r0 = {"com.bugsnag.android.Bugsnag", "com.google.firebase.crashlytics.FirebaseCrashlytics", "com.instabug.library.Instabug", "com.bugsee.library.Bugsee", "io.sentry.core.Sentry", "com.facebook.unity.FB", "com.facebook.android.FB"};
        C13726r.m3888h($r0);
    }

    public Attribute(C14635f c14635f, Buffer buffer, org.org.org.org.org.common.Logger logger2, C14637i c14637i, InterfaceC14715i interfaceC14715i) {
        Log_OC.getArray(c14635f, "sdkLifecycleHandler");
        Log_OC.getArray(buffer, "sessionHandler");
        Log_OC.getArray(logger2, "sessionEventHandler");
        Log_OC.getArray(c14637i, "timeInfoHandler");
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        this.name = c14635f;
        this.parent = buffer;
        this.buffer = logger2;
        this.f32176b = c14637i;
        this.f32175a = interfaceC14715i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final JSONObject m1270a() {
        Long $r7;
        C14637i $r2 = this.f32176b;
        Permissions $r3 = $r2.getIcon();
        C14611b $r4 = C14611b.f32367c;
        ZipInputStream $r5 = $r4.doInBackground();
        JSONObject $r1 = new JSONObject();
        Long $r6 = null;
        if ($r3 != null) {
            long $l0 = $r3.getId();
            $r7 = Long.valueOf($l0);
        } else {
            $r7 = null;
        }
        $r1.put("duration", $r7);
        if ($r3 != null) {
            long $l02 = $r3.equals();
            $r6 = Long.valueOf($l02);
        }
        $r1.put("duration_in_foreground", $r6);
        boolean $z0 = $r5.available();
        $r1.put("low_memory", $z0);
        long $l03 = $r5.get();
        $r1.put("free_memory", $l03);
        long $l04 = $r5.m1140a();
        $r1.put("free_heap_memory", $l04);
        InterfaceC14715i $r8 = this.f32175a;
        long $l05 = $r8.write();
        $r1.put("free_disk", $l05);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(Thread thread, Throwable th) {
        Class $r9;
        org.org.org.org.asm.parser.Attribute $r3 = org.org.org.org.asm.parser.Attribute.f32368a;
        LogAspect $r4 = LogAspect.CRASH_TRACKING;
        $r3.m1069e($r4, true, "CrashTrackingHandler", th);
        String $r6 = Log.getStackTraceString(th);
        Log_OC.loadImage($r6, "Log.getStackTraceString(throwable)");
        Buffer $r7 = this.parent;
        Activity $r8 = $r7.getString();
        String $r10 = ($r8 == null || ($r9 = $r8.getClass()) == null) ? "unknown" : $r9.getSimpleName();
        JSONObject $r11 = m1270a();
        C14539c $r5 = new C14539c($r6, $r10, $r11);
        org.org.org.org.org.common.Logger $r12 = this.buffer;
        $r12.remove($r5);
        C14635f $r13 = this.name;
        $r13.close(th);
        Thread.UncaughtExceptionHandler $r14 = this.value;
        if ($r14 != null) {
            $r14.uncaughtException(thread, th);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CrashTrackingMode add() {
        C14705f $r1 = C14705f.f32765a;
        Integer $r2 = $r1.get("CRASH_TRACKING_MODE");
        if ($r2 == null) {
            CrashTrackingMode $r4 = CrashTrackingMode.DEFAULT;
            return $r4;
        }
        CrashTrackingMode.C7228a $r3 = CrashTrackingMode.Companion;
        int $i0 = $r2.intValue();
        CrashTrackingMode $r42 = $r3.m19096a($i0);
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        System $r3 = System.f32375c;
        LogAspect $r1 = LogAspect.CRASH_TRACKING;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r3.get($r1, true, $r2);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "register() called, [logAspect: " + $r1 + ']';
            $r3.size($r1, $r2, "CrashTrackingHandler", $r6);
        }
        Thread.UncaughtExceptionHandler $r7 = Thread.getDefaultUncaughtExceptionHandler();
        this.value = $r7;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.org.org.org.android.util.common.net.UncaughtExceptionHandlers$Exiter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Attribute $r32 = Attribute.this;
                Log_OC.loadImage(thread, "thread");
                Log_OC.loadImage(th, "throwable");
                $r32.write(thread, th);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read() {
        System $r3 = System.f32375c;
        LogAspect $r1 = LogAspect.CRASH_TRACKING;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r3.get($r1, true, $r2);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "unregister() called, [logAspect: " + $r1 + ']';
            $r3.size($r1, $r2, "CrashTrackingHandler", $r6);
        }
        Thread.UncaughtExceptionHandler $r7 = this.value;
        if ($r7 != null) {
            Thread.setDefaultUncaughtExceptionHandler($r7);
        }
        this.value = null;
    }
}
