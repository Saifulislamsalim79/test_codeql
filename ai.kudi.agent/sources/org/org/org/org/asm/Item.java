package org.org.org.org.asm;

import android.app.Activity;
import android.view.View;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.ref.WeakReference;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* loaded from: classes.dex */
public final class Item {

    /* renamed from: h */
    public static final Item f32307h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Item $r0 = new Item();
        f32307h = $r0;
    }

    private Item() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final org.org.org.org.android.util.asm.Item m1156a(WeakReference weakReference, View view, String str, Long l) {
        if (weakReference != null) {
            Object $r6 = weakReference.get();
            Activity $r7 = (Activity) $r6;
            if ($r7 != null) {
                Log_OC.loadImage($r7, "weakActivity?.get() ?: return null");
                org.org.org.org.android.util.asm.Item $r8 = m1159a($r7, view, str, l);
                System $r9 = System.f32375c;
                LogAspect $r10 = LogAspect.AUTOMATIC_EVENT_DETECTION;
                LogSeverity $r11 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r12 = $r9.get($r10, false, $r11);
                int $i0 = $r12.ordinal();
                if ($i0 != 0) {
                    return $r8;
                }
                StringBuilder $r13 = new StringBuilder();
                StringBuilder $r1 = new StringBuilder();
                $r1.append("obtainSelectorForFocusedView(): selector = ");
                String $r4 = Log.get($r8, false, 2, null);
                $r1.append($r4);
                String $r42 = $r1.toString();
                $r13.append($r42);
                $r13.append(", [logAspect: ");
                $r13.append($r10);
                $r13.append(']');
                String $r43 = $r13.toString();
                $r9.size($r10, $r11, "SelectorUtil", $r43);
                return $r8;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final org.org.org.org.android.util.asm.Item m1159a(Activity activity, View view, String str, Long l) {
        Log_OC.getArray(activity, "activity");
        Log_OC.getArray(view, "view");
        Log_OC.getArray(str, "type");
        Type $r6 = Type.f32312c;
        C14544h $r7 = $r6.onSaveInstanceState(view);
        String $r8 = Type.m1148a($r6, view, false, 2, null);
        Class $r9 = activity.getClass();
        String $r10 = $r9.getSimpleName();
        Log_OC.loadImage($r10, "activity.javaClass.simpleName");
        Class $r92 = view.getClass();
        String $r11 = $r92.getSimpleName();
        Log_OC.loadImage($r11, "view.javaClass.simpleName");
        Log_OC.append(l);
        long $l0 = l.longValue();
        org.org.org.org.android.util.asm.Item $r5 = new org.org.org.org.android.util.asm.Item($r7, $r8, $r10, $r11, str, $l0, null, 64, null);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final org.org.org.org.android.util.asm.Item m1158a(View view, WeakReference weakReference) {
        Log_OC.getArray(view, "focusedView");
        org.org.org.org.android.util.asm.Item $r4 = m1156a(weakReference, view, "focus_start", (Long) (-1L));
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final org.org.org.org.android.util.asm.Item m1157a(View view, WeakReference weakReference, Long l) {
        long $l0;
        Log_OC.getArray(view, "focusedView");
        if (l == null) {
            $l0 = -1;
        } else {
            long $l02 = System.currentTimeMillis();
            long $l1 = l.longValue();
            $l0 = $l02 - $l1;
        }
        Long $r3 = Long.valueOf($l0);
        org.org.org.org.android.util.asm.Item $r4 = m1156a(weakReference, view, "focus_exit", $r3);
        return $r4;
    }
}
