package org.org.org.org.asm.parser;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.session.model.UserProperties;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMaskElement;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.SmartlookSensitivity;
import com.smartlook.sdk.smartlook.integration.model.Integration;
import com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import io.intercom.android.sdk.annotations.SeenState;
import java.io.File;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14542f;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.android.util.asm.C14545i;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.Item;
import org.org.org.org.android.util.asm.Key;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.asm.Type;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.asm.Expression;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.asm.MutableMapWithDefaultImpl;
import org.org.org.org.asm.util.C14619f;
import org.org.org.org.xml.core.util.Context;
/* loaded from: classes.dex */
public final class Attribute {

    /* renamed from: a */
    public static final Attribute f32368a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Attribute $r0 = new Attribute();
        f32368a = $r0;
    }

    private Attribute() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m1078a(View view) {
        String $r1 = C14619f.show(view);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:42:0x00b6 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m1077a(android.view.View r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Attribute.m1077a(android.view.View, int, int):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ String m1072a(Attribute attribute, long j, boolean $z0, int i, java.lang.Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $z0 = true;
        }
        String $r1 = attribute.format(j, $z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m1071a(Attribute attribute, View view, LogSeverity $r2, boolean $z0, int i, java.lang.Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r2 = LogSeverity.VERBOSE;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        attribute.put(view, $r2, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String apply(View view) {
        int $i0 = view.getWidth();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = view.getHeight();
        Integer $r32 = Integer.valueOf($i02);
        float $f0 = view.getX();
        Float $r4 = Float.valueOf($f0);
        float $f02 = view.getY();
        Float $r42 = Float.valueOf($f02);
        java.lang.Object[] $r1 = {$r3, $r32, $r4, $r42};
        String $r5 = String.format("width=[%d] height=[%d] x=[%.2f] y=[%.2f]", Arrays.copyOf($r1, 4));
        Log_OC.loadImage($r5, "java.lang.String.format(format, *args)");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(View view, LogSeverity logSeverity, int i) {
        boolean $z0 = view instanceof ViewGroup;
        if (!$z0) {
            System $r3 = System.f32375c;
            LogAspect $r4 = LogAspect.LAYOUT;
            String $r5 = m1077a(view, 2, i);
            $r3.size($r4, logSeverity, "ViewHierarchy", $r5);
            return;
        }
        System $r32 = System.f32375c;
        LogAspect $r42 = LogAspect.LAYOUT;
        String $r52 = m1077a(view, 0, i);
        $r32.size($r42, logSeverity, "ViewHierarchy", $r52);
        ViewGroup $r6 = (ViewGroup) view;
        int $i2 = $r6.getChildCount();
        for (int $i1 = 0; $i1 < $i2; $i1++) {
            View $r7 = $r6.getChildAt($i1);
            Log_OC.loadImage($r7, "view.getChildAt(i)");
            int $i3 = i + 4;
            close($r7, logSeverity, $i3);
        }
        System $r33 = System.f32375c;
        LogAspect $r43 = LogAspect.LAYOUT;
        String $r53 = m1077a(view, 1, i);
        $r33.size($r43, logSeverity, "ViewHierarchy", $r53);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String format(View view) {
        float $f0 = view.getAlpha();
        Float $r3 = Float.valueOf($f0);
        java.lang.Object[] $r1 = {$r3};
        String $r4 = String.format("%.2f", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String get(Integration integration) {
        Log_OC.getArray(integration, "integration");
        String $r2 = integration.printName();
        String $r22 = integration.hash();
        java.lang.Object[] $r0 = {$r2, $r22};
        String $r23 = String.format("Integration[name = %s, hash = %s]", Arrays.copyOf($r0, 2));
        Log_OC.loadImage($r23, "java.lang.String.format(format, *args)");
        return $r23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String getData(SetupOptions setupOptions) {
        Log_OC.getArray(setupOptions, "setupOptions");
        Activity $r3 = setupOptions.getActivity();
        boolean $z0 = setupOptions.isExperimental();
        Boolean $r4 = Boolean.valueOf($z0);
        Integer $r5 = setupOptions.getFps();
        RenderingMode $r6 = setupOptions.getRenderingMode();
        RenderingModeOption $r7 = setupOptions.getRenderingModeOption();
        java.lang.Object[] $r0 = {setupOptions.getSmartlookAPIKey(), $r3, $r4, $r5, $r6, $r7};
        String $r2 = String.format("SetupOptions[smartlookAPIKey = %s, activity = %s, experimental = %s, fps = %s, renderingMode = %s, renderingModeOption = %s]", Arrays.copyOf($r0, 6));
        Log_OC.loadImage($r2, "java.lang.String.format(format, *args)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getValue(View view) {
        float $f0 = view.getTranslationX();
        Float $r3 = Float.valueOf($f0);
        float $f02 = view.getTranslationY();
        Float $r32 = Float.valueOf($f02);
        float $f03 = C14619f.insert(view);
        Float $r33 = Float.valueOf($f03);
        java.lang.Object[] $r1 = {$r3, $r32, $r33};
        String $r4 = String.format("translationX=[%.2f] translationY=[%.2f] translationZ=[%.2f]", Arrays.copyOf($r1, 3));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String name(int i) {
        switch (i) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MOVE";
            case 3:
                return "ACTION_CANCEL";
            case 4:
                return "ACTION_OUTSIDE";
            case 5:
                return "ACTION_POINTER_DOWN";
            case 6:
                return "ACTION_POINTER_UP";
            default:
                String $r1 = String.valueOf(i);
                return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String onCreateView(View view) {
        float $f0 = C14619f.onCreateView(view);
        Float $r3 = Float.valueOf($f0);
        java.lang.Object[] $r1 = {$r3};
        String $r4 = String.format("%.2f", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String write(Throwable th) {
        Log_OC.getArray(th, "throwable");
        java.lang.Object[] $r0 = new java.lang.Object[3];
        Class $r2 = th.getClass();
        $r0[0] = $r2.getSimpleName();
        String $r3 = th.getMessage();
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "no messsage";
        }
        $r0[1] = $r4;
        $r0[2] = android.util.Log.getStackTraceString(th);
        String $r32 = String.format("Throwable[class = %s, message = %s, trace = %s]", Arrays.copyOf($r0, 3));
        Log_OC.loadImage($r32, "java.lang.String.format(format, *args)");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(StringBuilder sb, int i) {
        int $i0 = i + 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            sb.append(" ");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(StringBuilder sb, int i, String str, String str2) {
        sb.append("\n");
        int $i0 = i + 2;
        write(sb, $i0);
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
    }

    /* renamed from: a */
    public final String m1079a(int i) {
        return i != 0 ? i != 1 ? "FAILED (Unknown error)" : "FAILED (Activity null)" : "SUCCESSFUL";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1075a(C14544h c14544h) {
        Log_OC.getArray(c14544h, "viewFrame");
        int $i0 = c14544h.m1302b();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = c14544h.m1301n();
        Integer $r32 = Integer.valueOf($i02);
        int $i03 = c14544h.getItemId();
        Integer $r33 = Integer.valueOf($i03);
        int $i04 = c14544h.m1304a();
        Integer $r34 = Integer.valueOf($i04);
        java.lang.Object[] $r1 = {$r3, $r32, $r33, $r34};
        String $r4 = String.format("ViewFrame[x = %d, y = %d, width = %d, height = %d]", Arrays.copyOf($r1, 4));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1074a(C14547m c14547m) {
        String $r2;
        Log_OC.getArray(c14547m, "gesture");
        String $r22 = c14547m.getTitle();
        int $i0 = $r22.hashCode();
        switch ($i0) {
            case 78973:
                boolean $z0 = $r22.equals("PAN");
                if ($z0) {
                    java.lang.Object[] $r3 = new java.lang.Object[7];
                    $r3[0] = c14547m.m1293e();
                    $r3[1] = c14547m.getTitle();
                    C14542f $r4 = c14547m.m1292f();
                    $r3[2] = get($r4);
                    C14544h $r5 = c14547m.m1295c();
                    $r3[3] = m1075a($r5);
                    int $i02 = c14547m.m1296b();
                    Integer $r6 = Integer.valueOf($i02);
                    $r3[4] = $r6;
                    Float $r7 = c14547m.m1294d();
                    $r3[5] = $r7;
                    C14545i $r8 = c14547m.m1297a();
                    if ($r8 != null) {
                        Attribute $r0 = f32368a;
                        $r2 = $r0.get($r8);
                    } else {
                        $r2 = null;
                    }
                    $r3[6] = $r2;
                    String $r23 = String.format("Gesture[id = %s, type = %s, location = %s, frame = %s, taps = %d, velocity = %.2f, velocityVector = %s]", Arrays.copyOf($r3, 7));
                    Log_OC.loadImage($r23, "java.lang.String.format(format, *args)");
                    return $r23;
                }
                return "Unsupported gesture!";
            case 76133530:
                boolean $z02 = $r22.equals("PINCH");
                if ($z02) {
                    C14542f $r42 = c14547m.m1292f();
                    C14544h $r52 = c14547m.m1295c();
                    int $i03 = c14547m.m1296b();
                    Integer $r62 = Integer.valueOf($i03);
                    Float $r72 = c14547m.m1291i();
                    String $r24 = String.format("Gesture[id = %s, type = %s, location = %s, frame = %s, taps = %d, scale = %.2f]", Arrays.copyOf(new java.lang.Object[]{c14547m.m1293e(), c14547m.getTitle(), get($r42), m1075a($r52), $r62, $r72}, 6));
                    Log_OC.loadImage($r24, "java.lang.String.format(format, *args)");
                    return $r24;
                }
                return "Unsupported gesture!";
            case 742326142:
                boolean $z03 = $r22.equals("ROTATION");
                if ($z03) {
                    C14542f $r43 = c14547m.m1292f();
                    C14544h $r53 = c14547m.m1295c();
                    int $i04 = c14547m.m1296b();
                    Integer $r63 = Integer.valueOf($i04);
                    Float $r73 = c14547m.isVisible();
                    Float $r74 = c14547m.getY();
                    String $r25 = String.format("Gesture[id = %s, type = %s, location = %s, frame = %s, taps = %d, initRotation = %.2f, rotation = %.2f]", Arrays.copyOf(new java.lang.Object[]{c14547m.m1293e(), c14547m.getTitle(), get($r43), m1075a($r53), $r63, $r73, $r74}, 7));
                    Log_OC.loadImage($r25, "java.lang.String.format(format, *args)");
                    return $r25;
                }
                return "Unsupported gesture!";
            case 1074528416:
                boolean $z04 = $r22.equals("LONG_PRESS");
                if (!$z04) {
                    return "Unsupported gesture!";
                }
                break;
            case 1265144341:
                boolean $z05 = $r22.equals("DOUBLE_TAP");
                if (!$z05) {
                    return "Unsupported gesture!";
                }
                break;
            default:
                return "Unsupported gesture!";
        }
        C14542f $r44 = c14547m.m1292f();
        C14544h $r54 = c14547m.m1295c();
        int $i05 = c14547m.m1296b();
        Integer $r64 = Integer.valueOf($i05);
        String $r26 = String.format("Gesture[id = %s, type = %s, location = %s, frame = %s, taps = %d]", Arrays.copyOf(new java.lang.Object[]{c14547m.m1293e(), c14547m.getTitle(), get($r44), m1075a($r54), $r64}, 5));
        Log_OC.loadImage($r26, "java.lang.String.format(format, *args)");
        return $r26;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1073a(C14590m c14590m) {
        Log_OC.getArray(c14590m, "root");
        View $r3 = c14590m.getName();
        String $r4 = get($r3);
        java.lang.Object $r5 = c14590m.m1120c();
        String $r42 = Log.get($r5, false, 2, null);
        Rect $r6 = c14590m.m1119d();
        String $r43 = get($r6);
        boolean $z0 = c14590m.isEnabled();
        Boolean $r7 = Boolean.valueOf($z0);
        boolean $z02 = c14590m.m1122a();
        Boolean $r72 = Boolean.valueOf($z02);
        java.lang.Object[] $r1 = {$r4, $r42, $r43, $r7, $r72};
        String $r44 = String.format("Root[view = %s, window = %s, rect = %s, isActivityType = %s, isDialogType = %s]", Arrays.copyOf($r1, 5));
        Log_OC.loadImage($r44, "java.lang.String.format(format, *args)");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1070a(org.org.org.org.org.common.telemetry.Label label) {
        Log_OC.getArray(label, "bundle");
        String $r3 = label.m907a();
        int $i0 = label.getCount();
        Integer $r4 = Integer.valueOf($i0);
        long $l1 = label.m906b();
        Long $r5 = Long.valueOf($l1);
        long $l12 = label.getFirst();
        Long $r52 = Long.valueOf($l12);
        String $r32 = label.m905c();
        java.lang.Object[] $r1 = {$r3, $r4, $r5, $r52, $r32};
        String $r33 = String.format("SessionContinuationBundle[sessionId = %s, recordIndex = %s, startTimestamp = %s, lastRunEndTimestamp = %s, reason = %s]", Arrays.copyOf($r1, 5));
        Log_OC.loadImage($r33, "java.lang.String.format(format, *args)");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:17:0x0021 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1076a(com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r27) {
        /*
            r26 = this;
            java.lang.String r6 = "severity"
            r0 = r27
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            org.org.org.org.org.initializer.f r7 = org.org.org.org.org.initializer.C14708f.f32807a
            org.org.org.org.org.common.Buffer r8 = r7.get()
            android.app.Activity r9 = r8.getString()
            if (r9 == 0) goto L99
            org.org.org.org.asm.Type r10 = org.org.org.org.asm.Type.f32312c
            java.util.List r11 = r10.m1154a(r9)
            java.util.Iterator r12 = r11.iterator()
        L1d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L99
            java.lang.Object r14 = r12.next()
            r16 = r14
            org.org.org.org.asm.asm.m r16 = (org.org.org.org.asm.asm.C14590m) r16
            r15 = r16
            org.org.org.org.asm.parser.System r17 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r18 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.LAYOUT
            java.lang.String r6 = "ViewHierarchy"
            java.lang.String r19 = "----"
            r0 = r17
            r1 = r18
            r2 = r27
            r3 = r19
            r0.size(r1, r2, r6, r3)
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            r0 = r20
            r0.<init>()
            java.lang.String r6 = "Logging view hierarchy for: "
            r0 = r20
            r0.append(r6)
            org.org.org.org.asm.parser.Attribute r26 = org.org.org.org.asm.parser.Attribute.f32368a
            r0 = r26
            java.lang.String r21 = r0.m1073a(r15)
            r0 = r20
            r1 = r21
            r0.append(r1)
            r0 = r20
            java.lang.String r21 = r0.toString()
            java.lang.String r6 = "ViewHierarchy"
            r0 = r17
            r1 = r18
            r2 = r27
            r3 = r21
            r0.size(r1, r2, r6, r3)
            java.lang.String r6 = "ViewHierarchy"
            java.lang.String r19 = "----"
            r0 = r17
            r1 = r18
            r2 = r27
            r3 = r19
            r0.size(r1, r2, r6, r3)
            android.view.View r22 = r15.getName()
            r23 = 0
            r24 = 4
            r25 = 0
            r0 = r26
            r1 = r22
            r2 = r27
            r3 = r23
            r4 = r24
            r5 = r25
            m1071a(r0, r1, r2, r3, r4, r5)
            goto L1d
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Attribute.m1076a(com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String apply(Activity activity) {
        Log_OC.getArray(activity, "activity");
        Class $r3 = activity.getClass();
        CharSequence $r5 = activity.getTitle();
        java.lang.Object[] $r1 = {$r3.getSimpleName(), $r5};
        String $r4 = String.format("Activity[class = %s, title = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m1069e(LogAspect logAspect, boolean z, String str, Throwable th) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(th, "exception");
        System $r5 = System.f32375c;
        LogSeverity $r3 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r5.get(logAspect, z, $r3);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r8 = android.util.Log.getStackTraceString(th);
        Log_OC.loadImage($r8, "Log.getStackTraceString(exception)");
        $r7.append($r8);
        $r7.append(", [logAspect: ");
        $r7.append(logAspect);
        $r7.append(']');
        $r5.size(logAspect, $r3, str, $r7.toString());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String execute(String str) {
        Log_OC.getArray(str, "type");
        int $i0 = str.hashCode();
        if ($i0 == -1361636432) {
            boolean $z0 = str.equals("change");
            return $z0 ? "changed" : "unknown";
        } else if ($i0 == 3202370) {
            boolean $z02 = str.equals(SeenState.HIDE);
            return $z02 ? "hidden" : "unknown";
        } else if ($i0 != 3529469) {
            return "unknown";
        } else {
            boolean $z03 = str.equals("show");
            return $z03 ? "visible" : "unknown";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String format(long j, boolean z) {
        double $d0 = z ? 1000.0d : 1024.0d;
        double $d1 = j;
        if ($d1 < $d0) {
            String $r3 = j + " B";
            return $r3;
        }
        double $d2 = Math.log($d1);
        double $d3 = Math.log($d0);
        double $d22 = $d2 / $d3;
        String $r32 = z ? "kMGTPE" : "KMGTPE";
        int $i2 = (int) $d22;
        char $c3 = $r32.charAt($i2 - 1);
        String $r33 = z ? "" : "i";
        StringBuilder $r2 = new StringBuilder();
        String $r4 = String.valueOf($c3);
        $r2.append($r4);
        $r2.append($r33);
        String $r34 = $r2.toString();
        Locale $r5 = Locale.ROOT;
        double $d02 = Math.pow($d0, $d22);
        Double.isNaN($d1);
        Double $r6 = Double.valueOf($d1 / $d02);
        java.lang.Object[] $r1 = {$r6, $r34};
        String $r35 = String.format($r5, "%.1f %sB", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r35, "java.lang.String.format(locale, format, *args)");
        return $r35;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(Rect rect) {
        Log_OC.getArray(rect, "rect");
        int $i0 = rect.left;
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = rect.top;
        Integer $r32 = Integer.valueOf($i02);
        int $i03 = rect.right;
        Integer $r33 = Integer.valueOf($i03);
        int $i04 = rect.bottom;
        Integer $r34 = Integer.valueOf($i04);
        java.lang.Object[] $r1 = {$r3, $r32, $r33, $r34};
        String $r4 = String.format("Rect[left = %s, top = %s, right = %s, bottom = %s]", Arrays.copyOf($r1, 4));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(View view) {
        Log_OC.getArray(view, "view");
        Class $r3 = view.getClass();
        String $r4 = $r3.getSimpleName();
        Type $r5 = Type.f32312c;
        String $r42 = $r5.create(view);
        java.lang.Object[] $r1 = {$r4, $r42};
        String $r43 = String.format("View[class = %s, resourceName = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r43, "java.lang.String.format(format, *args)");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(RecordingMask recordingMask) {
        Log_OC.getArray(recordingMask, "mask");
        List $r3 = recordingMask.getElements();
        java.lang.Object[] $r1 = {Log.toString($r3, false, false, 6, (java.lang.Object) null)};
        String $r4 = String.format("RecordingMask[elements = %s]", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(File file) {
        Log_OC.getArray(file, "file");
        String $r1 = file.getPath();
        Log_OC.loadImage($r1, "file.path");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(Item item) {
        Log_OC.getArray(item, "selector");
        String $r3 = item.getType();
        String $r32 = item.toXML();
        String $r33 = item.getTitle();
        C14544h $r4 = item.m1333a();
        String $r34 = m1075a($r4);
        java.lang.Object[] $r1 = {$r3, $r32, $r33, $r34};
        String $r35 = String.format("Selector[type = %s, id = %s, view = %s, viewFrame = %s]", Arrays.copyOf($r1, 4));
        Log_OC.loadImage($r35, "java.lang.String.format(format, *args)");
        return $r35;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(C14542f c14542f) {
        Log_OC.getArray(c14542f, "location");
        float $f0 = c14542f.get();
        Float $r3 = Float.valueOf($f0);
        float $f02 = c14542f.getValue();
        Float $r32 = Float.valueOf($f02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("GestureLocation[x = %.2f, y = %.2f]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(C14545i c14545i) {
        Log_OC.getArray(c14545i, "velocityVector");
        float $f0 = c14545i.get();
        Float $r3 = Float.valueOf($f0);
        float $f02 = c14545i.getValue();
        Float $r32 = Float.valueOf($f02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("VelocityVector[x = %.2f, y = %.2f]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get(org.org.org.org.org.common.telemetry.Item item, boolean z) {
        Log_OC.getArray(item, "record");
        if (!z) {
            JSONObject $r5 = item.equals();
            String $r3 = $r5.toString();
            Log_OC.loadImage($r3, "record.toJson().toString()");
            return $r3;
        }
        int $i0 = item.getType();
        Integer $r4 = Integer.valueOf($i0);
        java.lang.Object[] $r2 = {item.getId(), $r4};
        String $r32 = String.format("Record[id = %s, index = %s]", Arrays.copyOf($r2, 2));
        Log_OC.loadImage($r32, "java.lang.String.format(format, *args)");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getName(Class cls) {
        Log_OC.getArray(cls, "clazz");
        Class $r1 = cls.getClass();
        String $r2 = $r1.getSimpleName();
        Log_OC.loadImage($r2, "clazz.javaClass.simpleName");
        return $r2;
    }

    public final String getString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNUSPORTED_VIEW" : "UNSUPPORTED VIEW" : "REGISTER FAILED" : "ALREADY REGISTERED" : "REGISTERED SUCCESSFULLY";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Drawable drawable) {
        Log_OC.getArray(drawable, "drawable");
        Class $r3 = drawable.getClass();
        String $r4 = $r3.getSimpleName();
        Rect $r5 = drawable.getBounds();
        Log_OC.loadImage($r5, "drawable.bounds");
        String $r42 = get($r5);
        java.lang.Object[] $r1 = {$r4, $r42};
        String $r43 = String.format("Drawable[type = %s bounds = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r43, "java.lang.String.format(format, *args)");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Bundle bundle) {
        Log_OC.getArray(bundle, "bundle");
        String $r1 = bundle.toString();
        Log_OC.loadImage($r1, "bundle.toString()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Window window) {
        Log_OC.getArray(window, "window");
        String $r1 = window.toString();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(PopupWindow popupWindow) {
        Log_OC.getArray(popupWindow, "popupWindow");
        String $r1 = popupWindow.toString();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Fragment fragment) {
        Log_OC.getArray(fragment, "fragment");
        Class $r3 = fragment.getClass();
        int $i0 = fragment.getId();
        Integer $r5 = Integer.valueOf($i0);
        java.lang.Object[] $r1 = {$r3.getSimpleName(), $r5};
        String $r4 = String.format("Fragment[class = %s, id = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(FragmentManager fragmentManager) {
        Log_OC.getArray(fragmentManager, "fragmentManager");
        Class $r3 = fragmentManager.getClass();
        java.lang.Object[] $r1 = {$r3.getSimpleName()};
        String $r4 = String.format("FragmentManager[class = %s]", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(ViewType viewType) {
        Log_OC.getArray(viewType, "viewType");
        String $r1 = viewType.getCode();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Method method) {
        Log_OC.getArray(method, "size");
        int $i0 = method.getValue();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = method.getName();
        Integer $r32 = Integer.valueOf($i02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("Size[width = %d height = %d]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString(Context context) {
        Log_OC.getArray(context, "recordData");
        String $r3 = context.getName();
        int $i0 = context.m449a();
        Integer $r4 = Integer.valueOf($i0);
        String $r32 = context.getId();
        java.lang.Object[] $r1 = {$r3, $r4, $r32};
        String $r33 = String.format("RecordData[sessionId = %s, recordIndex = %s, visitorId = %s]", Arrays.copyOf($r1, 3));
        Log_OC.loadImage($r33, "java.lang.String.format(format, *args)");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String next(Bitmap bitmap) {
        Log_OC.getArray(bitmap, "bitmap");
        int $i0 = bitmap.getWidth();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = bitmap.getHeight();
        Integer $r32 = Integer.valueOf($i02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("Bitmap[width = %s, height = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String process(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "motionEvent");
        StringWriter $r3 = new StringWriter();
        int $i0 = motionEvent.getPointerCount();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = motionEvent.getPointerId($i1);
            Integer $r4 = Integer.valueOf($i2);
            float $f0 = motionEvent.getX($i1);
            Float $r5 = Float.valueOf($f0);
            float $f02 = motionEvent.getY($i1);
            Float $r52 = Float.valueOf($f02);
            java.lang.Object[] $r1 = {$r4, $r5, $r52};
            String $r6 = String.format("MotionEventPointer[id = %s, x = %-9s, y = %-9s]", Arrays.copyOf($r1, 3));
            Log_OC.loadImage($r6, "java.lang.String.format(format, *args)");
            $r3.append((CharSequence) $r6);
            int $i22 = motionEvent.getPointerCount();
            if ($i1 != $i22 - 1) {
                $r3.append((CharSequence) ", ");
            }
        }
        String $r62 = $r3.toString();
        Log_OC.loadImage($r62, "StringWriter().apply {\n …   }\n        }.toString()");
        int $i02 = motionEvent.getActionMasked();
        String $r7 = name($i02);
        java.lang.Object[] $r12 = {$r7, $r62};
        String $r63 = String.format("MotionEvent[action = %-19s pointers = %s]", Arrays.copyOf($r12, 2));
        Log_OC.loadImage($r63, "java.lang.String.format(format, *args)");
        return $r63;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void put(View view, LogSeverity logSeverity, boolean z) {
        Log_OC.getArray(view, "view");
        Log_OC.getArray(logSeverity, "severity");
        if (!z) {
            System $r4 = System.f32375c;
            LogAspect $r5 = LogAspect.LAYOUT;
            TopLevel$NativeErrors $r3 = $r4.get($r5, false, logSeverity);
            TopLevel$NativeErrors $r6 = TopLevel$NativeErrors.f32378m;
            if ($r3 != $r6) {
                return;
            }
        }
        close(view, logSeverity, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(DisplayMetrics displayMetrics) {
        Log_OC.getArray(displayMetrics, "metrics");
        int $i0 = displayMetrics.widthPixels;
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = displayMetrics.heightPixels;
        Integer $r32 = Integer.valueOf($i02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("DisplayMetrics[width = %s, height = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(EventTrackingMode eventTrackingMode) {
        Log_OC.getArray(eventTrackingMode, "eventTrackingMode");
        EventTrackingMode r4 = eventTrackingMode;
        int $i0 = r4.ordinal();
        if ($i0 != 0) {
            if ($i0 != 1) {
                if ($i0 != 2) {
                    if ($i0 != 3) {
                        if ($i0 == 4) {
                            return "no_tracking";
                        }
                        Throwable r3 = new NoWhenBranchMatchedException();
                        Throwable r5 = r3;
                        throw r5;
                    }
                    return "ignore_rage_clicks";
                }
                return "ignore_navigation_interaction";
            }
            return "ignore_user_interaction";
        }
        return "full_tracking";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(ViewState viewState) {
        Log_OC.getArray(viewState, "viewState");
        String $r1 = viewState.getCode();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(RenderingMode renderingMode) {
        Log_OC.getArray(renderingMode, "renderingMode");
        String $r1 = renderingMode.getCode();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(RenderingModeOption renderingModeOption) {
        Log_OC.getArray(renderingModeOption, "renderingModeOption");
        String $r1 = renderingModeOption.getCode();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(UserProperties userProperties) {
        Log_OC.getArray(userProperties, "userProperties");
        MutableMapWithDefaultImpl r6 = (MutableMapWithDefaultImpl) userProperties;
        Expression $r3 = r6.toJSONObjectPair();
        JSONObject $r4 = $r3.getValue();
        String $r5 = $r4.toString();
        JSONObject $r42 = $r3.toJSON();
        String $r52 = $r42.toString();
        java.lang.Object[] $r1 = {$r5, $r52};
        String $r53 = String.format("UserProperties[mutable = %s, immutable = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r53, "java.lang.String.format(format, *args)");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(RecordingMaskElement recordingMaskElement) {
        Log_OC.getArray(recordingMaskElement, "recordingMaskElement");
        Rect $r3 = recordingMaskElement.getRect();
        String $r4 = get($r3);
        Enum $r5 = recordingMaskElement.getType();
        Enum r6 = $r5;
        String $r42 = r6.name();
        java.lang.Object[] $r1 = {$r4, $r42};
        String $r43 = String.format("RecordingMaskElement[rect = %s, type = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r43, "java.lang.String.format(format, *args)");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(SmartlookSensitivity smartlookSensitivity) {
        Log_OC.getArray(smartlookSensitivity, "smartlookSensitivity");
        SmartlookSensitivity r3 = smartlookSensitivity;
        String $r1 = r3.name();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(SegmentMiddlewareOption segmentMiddlewareOption) {
        Log_OC.getArray(segmentMiddlewareOption, "segmentMiddlewareOption");
        SegmentMiddlewareOption r4 = segmentMiddlewareOption;
        int $i0 = r4.ordinal();
        switch ($i0) {
            case 0:
                return "alias";
            case 1:
                return "custom_events";
            case 2:
                return "screen_events";
            case 3:
                return "identify";
            case 4:
                return "reset";
            case 5:
                return "all";
            case 6:
                return "default";
            default:
                Throwable r3 = new NoWhenBranchMatchedException();
                Throwable r5 = r3;
                throw r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(Key key) {
        Log_OC.getArray(key, "touch");
        int $i0 = key.getHeight();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = key.getX();
        Integer $r32 = Integer.valueOf($i02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("Touch[x = %s, y = %s]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(Location location) {
        Log_OC.getArray(location, "multitouch");
        String $r3 = location.toXML();
        long $l0 = location.getName();
        Long $r4 = Long.valueOf($l0);
        List $r5 = location.getPath();
        String $r32 = Log.toString($r5, false, false, 6, (java.lang.Object) null);
        java.lang.Object[] $r1 = {$r3, $r4, $r32};
        String $r33 = String.format("Multitouch[id = %s, time = %s, touches = %s]", Arrays.copyOf($r1, 3));
        Log_OC.loadImage($r33, "java.lang.String.format(format, *args)");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(Node node) {
        Log_OC.getArray(node, "rageClick");
        String $r3 = node.toXML();
        long $l0 = node.getName();
        Long $r4 = Long.valueOf($l0);
        String $r32 = node.getValue();
        java.lang.Object[] $r1 = {$r3, $r4, $r32};
        String $r33 = String.format("RageClick[id = %s, time = %s, activity = %s]", Arrays.copyOf($r1, 3));
        Log_OC.loadImage($r33, "java.lang.String.format(format, *args)");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String write(org.org.org.org.android.util.asm.Label label) {
        Log_OC.getArray(label, "pointerTouch");
        int $i0 = label.getColor();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = label.m1332a();
        Integer $r32 = Integer.valueOf($i02);
        int $i03 = label.getOffset();
        Integer $r33 = Integer.valueOf($i03);
        java.lang.Object[] $r1 = {$r3, $r32, $r33};
        String $r4 = String.format("PointerTouch[id = %s, x = %s, y = %s]", Arrays.copyOf($r1, 3));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String write(org.org.org.org.org.core.util.Type type) {
        Log_OC.getArray(type, "videoSize");
        int $i0 = type.getValue();
        Integer $r3 = Integer.valueOf($i0);
        int $i02 = type.m779a();
        Integer $r32 = Integer.valueOf($i02);
        java.lang.Object[] $r1 = {$r3, $r32};
        String $r4 = String.format("VideoSize[width = %d height = %d]", Arrays.copyOf($r1, 2));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        return $r4;
    }
}
