package org.org.org.org.org.asm;

import android.app.Activity;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import org.org.org.org.asm.C14599g;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.util.Iterator;
import org.org.org.org.org.asm.commons.MainApp$1;
import org.org.org.org.org.core.internal.C14679f;
/* loaded from: classes.dex */
public final class ActivityLifecycleCallbacksWrapper extends MainApp$1 {

    /* renamed from: x */
    public final /* synthetic */ C14635f f32479x;

    public ActivityLifecycleCallbacksWrapper(C14635f c14635f) {
        this.f32479x = c14635f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log_OC.getArray(activity, "activity");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onActivityPaused() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r83);
        }
        C14635f $r9 = this.f32479x;
        C14632c $r10 = $r9.f32502b;
        d$i$a $r11 = new d$i$a(activity);
        C14632c.m978a($r10, null, null, $r11, 3, null);
        C14679f $r12 = C14679f.f32684b;
        $r12.m782b(activity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log_OC.getArray(activity, "activity");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onActivityResumed() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r83);
        }
        C14635f $r9 = this.f32479x;
        C14632c $r10 = $r9.f32502b;
        d$i$b $r11 = new d$i$b(activity);
        C14632c.m978a($r10, null, null, $r11, 3, null);
        C14679f $r12 = C14679f.f32684b;
        $r12.m788a(activity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        List $r12;
        Log_OC.getArray(activity, "activity");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onActivityStarted() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r83);
        }
        C14635f $r9 = this.f32479x;
        $r9.clear(activity);
        C14635f $r92 = this.f32479x;
        WeakReference $r10 = new WeakReference(activity);
        $r92.f32508v = $r10;
        C14635f $r93 = this.f32479x;
        C14632c $r11 = $r93.f32502b;
        $r12 = C13724q.m3901b(e.a.a.a.c.m.c.class);
        d$i$c $r13 = new d$i$c(activity);
        C14632c.m978a($r11, $r12, null, $r13, 2, null);
        C14635f $r94 = this.f32479x;
        AtomicBoolean $r14 = $r94.f32507t;
        boolean $z0 = $r14.get();
        if ($z0) {
            C14635f $r95 = this.f32479x;
            String $r84 = Iterator.m1049d(activity);
            $r95.m967a($r84);
        }
        C14635f $r96 = this.f32479x;
        $r96.m969a(activity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Log_OC.getArray(activity, "activity");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onActivityStopped() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r83);
        }
        C14635f $r9 = this.f32479x;
        C14632c $r10 = $r9.f32502b;
        d$i$d $r11 = new d$i$d(activity);
        C14632c.m978a($r10, null, null, $r11, 3, null);
        C14635f $r92 = this.f32479x;
        AtomicBoolean $r12 = $r92.f32507t;
        boolean $z0 = $r12.get();
        if ($z0) {
            C14635f $r93 = this.f32479x;
            String $r84 = Iterator.m1049d(activity);
            $r93.add($r84);
        }
        C14599g $r13 = C14599g.f32352a;
        d$i$e $r14 = new d$i$e(this, activity);
        $r13.m1107a($r14);
    }
}
