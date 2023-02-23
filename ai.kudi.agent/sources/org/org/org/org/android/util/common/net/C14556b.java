package org.org.org.org.android.util.common.net;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.android.util.common.net.b */
/* loaded from: classes.dex */
public final class C14556b extends Thread {

    /* renamed from: d */
    public static final long f32179d;

    /* renamed from: g */
    public static final Shell f32180g;

    /* renamed from: a */
    public final Target f32181a;

    /* renamed from: b */
    public volatile long f32182b;

    /* renamed from: c */
    public volatile boolean f32183c;

    /* renamed from: h */
    public Shell f32184h;
    public final Handler handler;

    /* renamed from: i */
    public final long f32185i;

    /* renamed from: l */
    public boolean f32186l;
    public final Runnable updateResults;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        TimeUnit $r0 = TimeUnit.SECONDS;
        long $l0 = $r0.toMillis(5L);
        f32179d = $l0;
        Transport $r1 = new Transport();
        f32180g = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public C14556b(Target target, long j) {
        Log_OC.getArray(target, "anrListener");
        this.f32181a = target;
        this.f32185i = j;
        Shell $r3 = f32180g;
        this.f32184h = $r3;
        Looper $r1 = Looper.getMainLooper();
        Handler $r4 = new Handler($r1);
        this.handler = $r4;
        MoveListener $r5 = new MoveListener(this);
        this.updateResults = $r5;
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
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14556b(org.org.org.org.android.util.common.net.Target r1, long r2, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = org.org.org.org.android.util.common.net.C14556b.f32179d
        L6:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.common.net.C14556b.<init>(org.org.org.org.android.util.common.net.Target, long, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* renamed from: a */
    public final void m1267a(boolean z) {
        this.f32186l = z;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r17 = this;
            java.lang.String r1 = "|Smartlook_ANR_WatchDog|"
            r0 = r17
            r0.setName(r1)
            r0 = r17
            long r2 = r0.f32185i
        Lb:
            r0 = r17
            boolean r4 = r0.isInterrupted()
            if (r4 != 0) goto L83
            r0 = r17
            long r5 = r0.f32182b
            r8 = 0
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 != 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            r0 = r17
            long r5 = r0.f32182b
            long r5 = r5 + r2
            r0 = r17
            r0.f32182b = r5
            if (r4 == 0) goto L36
            r0 = r17
            android.os.Handler r10 = r0.handler
            r0 = r17
            java.lang.Runnable r11 = r0.updateResults
            r10.post(r11)
        L36:
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L79
            r0 = r17
            long r5 = r0.f32182b
            r8 = 0
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto Lb
            r0 = r17
            boolean r4 = r0.f32183c
            if (r4 != 0) goto Lb
            r0 = r17
            boolean r4 = r0.f32186l
            if (r4 != 0) goto L68
            boolean r4 = android.os.Debug.isDebuggerConnected()
            if (r4 != 0) goto L5b
            boolean r4 = android.os.Debug.waitingForDebugger()
            if (r4 == 0) goto L68
        L5b:
            java.lang.String r1 = "ANRWatchdog"
            java.lang.String r12 = "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))"
            android.util.Log.w(r1, r12)
            r13 = 1
            r0 = r17
            r0.f32183c = r13
            goto Lb
        L68:
            r0 = r17
            org.org.org.org.android.util.common.net.Target r14 = r0.f32181a
            r14.write()
            r0 = r17
            long r2 = r0.f32185i
            r13 = 1
            r0 = r17
            r0.f32183c = r13
            goto Lb
        L79:
            r15 = move-exception
            r0 = r17
            org.org.org.org.android.util.common.net.Shell r0 = r0.f32184h
            r16 = r0
            r0.sendMessage(r15)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.common.net.C14556b.run():void");
    }
}
