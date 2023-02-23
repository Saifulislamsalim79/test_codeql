package org.org.org.org.asm;

import android.app.Application;
import android.content.Context;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* renamed from: org.org.org.org.asm.f */
/* loaded from: classes.dex */
public final class C14598f {

    /* renamed from: c */
    public static final C14598f f32351c;
    public static Application context;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Application application;
        C14598f $r1 = new C14598f();
        f32351c = $r1;
        ClassWriter $r2 = ClassWriter.f32305c;
        try {
            Object $r3 = ClassWriter.put($r2, "android.app.ActivityThread", "currentApplication", Application.class, null, null, 24, null);
            application = (Application) $r3;
        } catch (Exception e) {
            application = null;
        }
        context = application;
        if (application == null) {
            System $r5 = System.f32375c;
            LogAspect $r6 = LogAspect.SESSION;
            LogSeverity $r7 = LogSeverity.WARN;
            TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
            int $i0 = $r8.ordinal();
            if ($i0 != 0) {
                return;
            }
            String $r10 = "init() cannot obtain application context!, [logAspect: " + $r6 + ']';
            $r5.size($r6, $r7, "ContextExtractor", $r10);
            return;
        }
        System $r52 = System.f32375c;
        LogAspect $r62 = LogAspect.SESSION;
        LogSeverity $r72 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r82 = $r52.get($r62, false, $r72);
        int $i02 = $r82.ordinal();
        if ($i02 != 0) {
            return;
        }
        String $r102 = "init() application context obtained, [logAspect: " + $r62 + ']';
        $r52.size($r62, $r72, "ContextExtractor", $r102);
    }

    private C14598f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Application $r2 = context;
        Log_OC.append($r2);
        Context $r1 = $r2.getApplicationContext();
        Log_OC.loadImage($r1, "application!!.applicationContext");
        return $r1;
    }
}
