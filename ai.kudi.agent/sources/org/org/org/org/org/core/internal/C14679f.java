package org.org.org.org.org.core.internal;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.FrameMetrics;
import android.view.Window;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14599g;
import org.org.org.org.org.ClassWriter;
/* renamed from: org.org.org.org.org.core.internal.f */
/* loaded from: classes.dex */
public final class C14679f {

    /* renamed from: a */
    public static WeakHashMap<Window, Window.OnFrameMetricsAvailableListener> f32683a;

    /* renamed from: b */
    public static final C14679f f32684b;

    /* renamed from: c */
    public static WeakHashMap<Window, Long> f32685c;

    /* renamed from: d */
    public static float f32686d;

    /* renamed from: e */
    public static float f32687e;

    /* renamed from: f */
    public static float f32688f;

    /* renamed from: u */
    public static int f32689u;

    /* renamed from: v */
    public static int f32690v;

    /* renamed from: w */
    public static float f32691w;

    /* renamed from: x */
    public static float f32692x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14679f $r0 = new C14679f();
        f32684b = $r0;
    }

    private C14679f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    private final float m787a(FrameMetrics frameMetrics, int i) {
        long $l1 = frameMetrics.getMetric(i);
        double $d0 = $l1;
        Double.isNaN($d0);
        float $f0 = (float) ($d0 * 1.0E-6d);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    private final Window.OnFrameMetricsAvailableListener m789a() {
        Window$OnFrameMetricsAvailableListenerC14678c r1 = Window$OnFrameMetricsAvailableListenerC14678c.f32682d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void add(Window window) {
        Window.OnFrameMetricsAvailableListener $r3 = m789a();
        create(window);
        try {
            Looper $r5 = Looper.getMainLooper();
            Handler $r4 = new Handler($r5);
            window.addOnFrameMetricsAvailableListener($r3, $r4);
            WeakHashMap $r6 = f32683a;
            if ($r6 != null) {
                Object $r7 = $r6.put(window, $r3);
                Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = (Window.OnFrameMetricsAvailableListener) $r7;
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: b */
    public final void m781b(FrameMetrics frameMetrics) {
        int $i0 = f32689u;
        f32689u = $i0 + 1;
        float $f0 = m787a(frameMetrics, 8);
        if ($f0 > 17.0f) {
            int $i02 = f32690v;
            f32690v = $i02 + 1;
        }
        float $f1 = f32691w;
        f32691w = $f1 + $f0;
        float $f02 = f32692x;
        float $f12 = m787a(frameMetrics, 3);
        f32692x = $f02 + $f12;
        float $f03 = f32686d;
        float $f13 = m787a(frameMetrics, 4);
        f32686d = $f03 + $f13;
        float $f04 = f32687e;
        float $f14 = m787a(frameMetrics, 6);
        f32687e = $f04 + $f14;
        float $f05 = f32688f;
        float $f15 = m787a(frameMetrics, 2);
        f32688f = $f05 + $f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void create(Window window) {
        WeakHashMap $r1 = f32685c;
        if ($r1 != null) {
            long $l0 = System.currentTimeMillis();
            Long $r3 = Long.valueOf($l0);
            Object $r4 = $r1.put(window, $r3);
            Long l = (Long) $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m788a(Activity activity) {
        Log_OC.getArray(activity, "activity");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            C14599g $r3 = C14599g.f32352a;
            ClassWriter $r4 = ClassWriter.f32463b;
            List $r5 = $r4.values();
            boolean $z0 = $r3.remove($r5);
            if ($z0) {
                WeakHashMap $r6 = new WeakHashMap();
                f32683a = $r6;
                WeakHashMap $r62 = new WeakHashMap();
                f32685c = $r62;
                Window.OnFrameMetricsAvailableListener $r7 = m789a();
                Window $r8 = activity.getWindow();
                Log_OC.loadImage($r8, "activity.window");
                create($r8);
                try {
                    Window $r82 = activity.getWindow();
                    Handler $r9 = new Handler();
                    $r82.addOnFrameMetricsAvailableListener($r7, $r9);
                    WeakHashMap $r63 = f32683a;
                    if ($r63 != null) {
                        Object $r10 = $r63.put(activity.getWindow(), $r7);
                        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = (Window.OnFrameMetricsAvailableListener) $r10;
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m786a(Window window) {
        WeakHashMap $r4;
        Log_OC.getArray(window, "window");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 24 || ($r4 = f32683a) == null) {
            return;
        }
        Object $r2 = $r4.remove(window);
        Window.OnFrameMetricsAvailableListener $r5 = (Window.OnFrameMetricsAvailableListener) $r2;
        if ($r5 != null) {
            try {
                window.removeOnFrameMetricsAvailableListener($r5);
            } catch (Exception e) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:14:0x003e */
    /* JADX WARN: Incorrect condition in loop: B:26:0x006b */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m785a(java.util.List r18) {
        /*
            r17 = this;
            java.lang.String r1 = "windows"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L7f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = r18
            java.util.Iterator r5 = r0.iterator()
        L18:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L31
            java.lang.Object r8 = r5.next()
            boolean r6 = r8 instanceof android.view.Window
            if (r6 == 0) goto L2b
            r9 = r8
            android.view.Window r9 = (android.view.Window) r9
            r7 = r9
        L2b:
            if (r7 == 0) goto L18
            r4.add(r7)
            goto L18
        L31:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r5 = r4.iterator()
        L3a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L63
            java.lang.Object r8 = r5.next()
            r11 = r8
            android.view.Window r11 = (android.view.Window) r11
            r7 = r11
            java.util.WeakHashMap<android.view.Window, android.view.Window$OnFrameMetricsAvailableListener> r12 = org.org.org.org.org.core.internal.C14679f.f32683a
            if (r12 == 0) goto L57
            java.lang.Object r13 = r12.get(r7)
            r15 = r13
            android.view.Window$OnFrameMetricsAvailableListener r15 = (android.view.Window.OnFrameMetricsAvailableListener) r15
            r14 = r15
            goto L58
        L57:
            r14 = 0
        L58:
            if (r14 != 0) goto L5c
            r6 = 1
            goto L5d
        L5c:
            r6 = 0
        L5d:
            if (r6 == 0) goto L3a
            r10.add(r8)
            goto L3a
        L63:
            java.util.Iterator r5 = r10.iterator()
        L67:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r8 = r5.next()
            r16 = r8
            android.view.Window r16 = (android.view.Window) r16
            r7 = r16
            org.org.org.org.org.core.internal.f r17 = org.org.org.org.org.core.internal.C14679f.f32684b
            r0 = r17
            r0.add(r7)
            goto L67
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.C14679f.m785a(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: b */
    public final void m782b(Activity activity) {
        Log_OC.getArray(activity, "activity");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            C14599g $r3 = C14599g.f32352a;
            ClassWriter $r4 = ClassWriter.f32463b;
            List $r5 = $r4.values();
            boolean $z0 = $r3.remove($r5);
            if ($z0) {
                WeakHashMap $r6 = f32683a;
                if ($r6 != null) {
                    Window $r7 = activity.getWindow();
                    Object $r8 = $r6.get($r7);
                    Window.OnFrameMetricsAvailableListener $r9 = (Window.OnFrameMetricsAvailableListener) $r8;
                    if ($r9 != null) {
                        try {
                            Window $r72 = activity.getWindow();
                            $r72.removeOnFrameMetricsAvailableListener($r9);
                        } catch (Exception e) {
                        }
                    }
                }
                f32683a = null;
                f32685c = null;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Long size(Window window) {
        WeakHashMap $r1;
        if (window == null || ($r1 = f32685c) == null) {
            return null;
        }
        Object $r2 = $r1.get(window);
        Long $r4 = (Long) $r2;
        return $r4;
    }
}
