package org.org.org.org.org.core.internal;

import android.view.FrameMetrics;
import android.view.Window;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.org.core.internal.c */
/* loaded from: classes.dex */
public final class Window$OnFrameMetricsAvailableListenerC14678c implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: d */
    public static final Window$OnFrameMetricsAvailableListenerC14678c f32682d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Window$OnFrameMetricsAvailableListenerC14678c $r0 = new Window$OnFrameMetricsAvailableListenerC14678c();
        f32682d = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C14679f $r4 = C14679f.f32684b;
        FrameMetrics $r2 = new FrameMetrics(frameMetrics);
        $r4.m781b($r2);
        Log_OC.loadImage(window, "window");
        $r4.create(window);
    }
}
