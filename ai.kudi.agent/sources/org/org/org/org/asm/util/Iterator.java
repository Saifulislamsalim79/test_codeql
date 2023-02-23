package org.org.org.org.asm.util;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.menu.C14572i;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.asm.Method;
/* loaded from: classes.dex */
public final class Iterator {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final EnumC14571f m1050a(Activity activity) {
        Log_OC.getArray(activity, "$this$currentOrientation");
        Display $r1 = show(activity);
        if ($r1 != null) {
            C14572i $r2 = EnumC14571f.f32274l;
            int $i0 = $r1.getRotation();
            EnumC14571f $r3 = $r2.m1197b($i0);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static final String m1049d(Activity activity) {
        Log_OC.getArray(activity, "$this$name");
        Class $r1 = activity.getClass();
        String $r2 = $r1.getSimpleName();
        Log_OC.loadImage($r2, "this.javaClass.simpleName");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Method getView(Activity activity) {
        Log_OC.getArray(activity, "$this$decorViewSize");
        Window $r2 = activity.getWindow();
        Log_OC.loadImage($r2, "window");
        View $r3 = $r2.getDecorView();
        Log_OC.loadImage($r3, "window.decorView");
        int $i0 = $r3.getWidth();
        Window $r22 = activity.getWindow();
        Log_OC.loadImage($r22, "window");
        View $r32 = $r22.getDecorView();
        Log_OC.loadImage($r32, "window.decorView");
        int $i1 = $r32.getHeight();
        Method $r1 = new Method($i0, $i1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Display show(Activity activity) {
        Log_OC.getArray(activity, "$this$displayCompat");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 30) {
            Display $r1 = activity.getDisplay();
            return $r1;
        }
        WindowManager $r2 = activity.getWindowManager();
        Log_OC.loadImage($r2, "windowManager");
        Display $r12 = $r2.getDefaultDisplay();
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void show(final Activity activity, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(activity, "$this$runWhenActivityIsMeasuredAndAttachedToWindow");
        Log_OC.getArray(interfaceC11767l, "toRun");
        Window $r2 = activity.getWindow();
        Log_OC.loadImage($r2, "this.window");
        View $r3 = $r2.getDecorView();
        $r3.post(new Runnable() { // from class: org.org.org.org.asm.util.AssociationsDialog$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC11767l $r1 = interfaceC11767l;
                Activity $r22 = activity;
                $r1.invoke($r22);
            }
        });
    }
}
