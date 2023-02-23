package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.C2832e;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2734d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C2778j;
import com.google.android.gms.common.internal.C2894m0;
import com.google.android.gms.common.internal.p098a0.C2847e;
import com.google.android.gms.tasks.C4465k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p201g.p218e.C7521a;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public final class C2772h<O extends C2730a.InterfaceC2734d> implements AbstractC2743d.a, AbstractC2743d.b {

    /* renamed from: a */
    private final C2754b<O> f7777a;
    @NotOnlyInitialized

    /* renamed from: b */
    private final C2730a.InterfaceC2739f f7778b;

    /* renamed from: c */
    private final List<C2770g0> f7779c;

    /* renamed from: e */
    private int f7780e;

    /* renamed from: f */
    private final BinderC2816w0 f7781f;

    /* renamed from: g */
    private final int f7782g;

    /* renamed from: k */
    private C2826b f7783k;

    /* renamed from: l */
    private final Map<C2778j.C2779a<?>, C2807s0> f7784l;

    /* renamed from: m */
    private final Set<C2774h1> f7785m;

    /* renamed from: o */
    private final C2811u f7786o;

    /* renamed from: p */
    final /* synthetic */ C2766f f7787p;

    /* renamed from: q */
    private final Queue<AbstractC2771g1> f7788q;

    /* renamed from: s */
    private boolean f7789s;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public C2772h(C2766f c2766f, AbstractC2743d abstractC2743d) {
        this.f7787p = c2766f;
        LinkedList $r3 = new LinkedList();
        this.f7788q = $r3;
        HashSet $r4 = new HashSet();
        this.f7785m = $r4;
        HashMap $r5 = new HashMap();
        this.f7784l = $r5;
        ArrayList $r6 = new ArrayList();
        this.f7779c = $r6;
        this.f7783k = null;
        this.f7780e = 0;
        Handler $r7 = C2766f.m32031a(c2766f);
        Looper $r8 = $r7.getLooper();
        C2730a.InterfaceC2739f $r9 = abstractC2743d.m32079a($r8, this);
        this.f7778b = $r9;
        C2754b $r10 = abstractC2743d.getString();
        this.f7777a = $r10;
        C2811u $r11 = new C2811u();
        this.f7786o = $r11;
        int $i0 = abstractC2743d.m32072l();
        this.f7782g = $i0;
        C2730a.InterfaceC2739f $r92 = this.f7778b;
        boolean $z0 = $r92.mo15467n();
        if (!$z0) {
            this.f7781f = null;
            return;
        }
        Context $r12 = C2766f.m32024b(c2766f);
        Handler $r72 = C2766f.m32031a(c2766f);
        BinderC2816w0 $r13 = abstractC2743d.m32080a($r12, $r72);
        this.f7781f = $r13;
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
    /* renamed from: a */
    private final C2830d m31997a(C2830d[] c2830dArr) {
        if (c2830dArr != null) {
            int $i1 = c2830dArr.length;
            if ($i1 == 0) {
                return null;
            }
            C2730a.InterfaceC2739f $r3 = this.f7778b;
            C2830d[] $r4 = $r3.mo31962l();
            C2830d[] $r5 = $r4;
            if ($r4 == null) {
                $r5 = new C2830d[0];
            }
            int $i2 = $r5.length;
            Map r10 = new C7521a($i2);
            for (C2830d $r6 : $r5) {
                String $r7 = $r6.m31869f();
                long $l4 = $r6.m31868h();
                Map r11 = r10;
                r11.put($r7, Long.valueOf($l4));
            }
            for (C2830d $r62 : c2830dArr) {
                Object $r72 = $r62.m31869f();
                Map r112 = r10;
                Object $r9 = r112.get($r72);
                Long $r8 = (Long) $r9;
                if ($r8 == null) {
                    return $r62;
                }
                long $l42 = $r8.longValue();
                long $l5 = $r62.m31868h();
                if ($l42 < $l5) {
                    return $r62;
                }
            }
            return null;
        }
        return null;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0021 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32008a() {
        /*
            r18 = this;
            r0 = r18
            r0.m31982e()
            com.google.android.gms.common.b r1 = com.google.android.gms.common.C2826b.f7892w
            r0 = r18
            r0.m31993b(r1)
            r0 = r18
            r0.setEnabled()
            r0 = r18
            java.util.Map<com.google.android.gms.common.api.internal.j$a<?>, com.google.android.gms.common.api.internal.s0> r2 = r0.f7784l
            java.util.Collection r3 = r2.values()
            java.util.Iterator r4 = r3.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r6 = r4.next()
            r8 = r6
            com.google.android.gms.common.api.internal.s0 r8 = (com.google.android.gms.common.api.internal.C2807s0) r8
            r7 = r8
            com.google.android.gms.common.api.internal.m<com.google.android.gms.common.api.a$b, ?> r9 = r7.f7862a
            com.google.android.gms.common.d[] r10 = r9.m31942b()
            r0 = r18
            com.google.android.gms.common.d r11 = r0.m31997a(r10)
            if (r11 == 0) goto L3d
            r4.remove()
            goto L1d
        L3d:
            com.google.android.gms.common.api.internal.m<com.google.android.gms.common.api.a$b, ?> r9 = r7.f7862a
            r0 = r18
            com.google.android.gms.common.api.a$f r12 = r0.f7778b
            com.google.android.gms.tasks.k r13 = new com.google.android.gms.tasks.k
            r13.<init>()     // Catch: android.os.DeadObjectException -> L6a android.os.RemoteException -> L6c
            r9.m31941c(r12, r13)     // Catch: android.os.DeadObjectException -> L6a android.os.RemoteException -> L6c
            goto L1d
        L4c:
            r4.remove()
            goto L1d
        L50:
            r14 = 3
            r0 = r18
            r0.m31990c(r14)
            r0 = r18
            com.google.android.gms.common.api.a$f r12 = r0.f7778b
            java.lang.String r15 = "DeadObjectException thrown while calling register listener method."
            r12.mo31967c(r15)
        L5f:
            r0 = r18
            r0.m31996b()
            r0 = r18
            r0.close()
            return
        L6a:
            r16 = move-exception
            goto L50
        L6c:
            r17 = move-exception
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2772h.m32008a():void");
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0078 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32007a(int r22) {
        /*
            r21 = this;
            r0 = r21
            r0.m31982e()
            r1 = 1
            r0 = r21
            r0.f7789s = r1
            r0 = r21
            com.google.android.gms.common.api.internal.u r2 = r0.f7786o
            r0 = r21
            com.google.android.gms.common.api.a$f r3 = r0.f7778b
            java.lang.String r4 = r3.mo31961m()
            r0 = r22
            r2.m31910e(r0, r4)
            r0 = r21
            com.google.android.gms.common.api.internal.f r5 = r0.f7787p
            android.os.Handler r6 = com.google.android.gms.common.api.internal.C2766f.m32031a(r5)
            android.os.Handler r7 = com.google.android.gms.common.api.internal.C2766f.m32031a(r5)
            r0 = r21
            com.google.android.gms.common.api.internal.b<O extends com.google.android.gms.common.api.a$d> r8 = r0.f7777a
            r1 = 9
            android.os.Message r9 = android.os.Message.obtain(r7, r1, r8)
            r0 = r21
            com.google.android.gms.common.api.internal.f r5 = r0.f7787p
            long r10 = com.google.android.gms.common.api.internal.C2766f.expandItemActionView(r5)
            r6.sendMessageDelayed(r9, r10)
            r0 = r21
            com.google.android.gms.common.api.internal.f r5 = r0.f7787p
            android.os.Handler r6 = com.google.android.gms.common.api.internal.C2766f.m32031a(r5)
            android.os.Handler r7 = com.google.android.gms.common.api.internal.C2766f.m32031a(r5)
            r0 = r21
            com.google.android.gms.common.api.internal.b<O extends com.google.android.gms.common.api.a$d> r8 = r0.f7777a
            r1 = 11
            android.os.Message r9 = android.os.Message.obtain(r7, r1, r8)
            r0 = r21
            com.google.android.gms.common.api.internal.f r5 = r0.f7787p
            long r10 = com.google.android.gms.common.api.internal.C2766f.dispatchMenuItemSelected(r5)
            r6.sendMessageDelayed(r9, r10)
            r0 = r21
            com.google.android.gms.common.api.internal.f r5 = r0.f7787p
            com.google.android.gms.common.internal.m0 r12 = com.google.android.gms.common.api.internal.C2766f.size(r5)
            r12.m31705c()
            r0 = r21
            java.util.Map<com.google.android.gms.common.api.internal.j$a<?>, com.google.android.gms.common.api.internal.s0> r13 = r0.f7784l
            java.util.Collection r14 = r13.values()
            java.util.Iterator r15 = r14.iterator()
        L74:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L8e
            java.lang.Object r17 = r15.next()
            r19 = r17
            com.google.android.gms.common.api.internal.s0 r19 = (com.google.android.gms.common.api.internal.C2807s0) r19
            r18 = r19
            r0 = r18
            java.lang.Runnable r0 = r0.f7864c
            r20 = r0
            r0.run()
            goto L74
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2772h.m32007a(int):void");
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
    /* renamed from: a */
    public final void m32005a(Status status) {
        C2766f $r3 = this.f7787p;
        Handler $r2 = C2766f.m32031a($r3);
        com.google.android.gms.common.internal.List.get($r2);
        m32004a(status, null, false);
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
    /* JADX WARN: Incorrect condition in loop: B:12:0x001f */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m32004a(com.google.android.gms.common.api.Status r14, java.lang.Exception r15, boolean r16) {
        /*
            r13 = this;
            com.google.android.gms.common.api.internal.f r0 = r13.f7787p
            android.os.Handler r1 = com.google.android.gms.common.api.internal.C2766f.m32031a(r0)
            com.google.android.gms.common.internal.List.get(r1)
            r2 = 0
            if (r14 == 0) goto Le
            r3 = 0
            goto Lf
        Le:
            r3 = 1
        Lf:
            if (r15 == 0) goto L12
            goto L13
        L12:
            r2 = 1
        L13:
            if (r3 == r2) goto L3e
            java.util.Queue<com.google.android.gms.common.api.internal.g1> r4 = r13.f7788q
            java.util.Iterator r5 = r4.iterator()
        L1b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r6 = r5.next()
            r8 = r6
            com.google.android.gms.common.api.internal.g1 r8 = (com.google.android.gms.common.api.internal.AbstractC2771g1) r8
            r7 = r8
            if (r16 == 0) goto L30
            int r9 = r7.f7776a
            r10 = 2
            if (r9 != r10) goto L1b
        L30:
            if (r14 == 0) goto L36
            r7.mo31887a(r14)
            goto L39
        L36:
            r7.mo31886b(r15)
        L39:
            r5.remove()
            goto L1b
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Status XOR exception should be null"
            r11.<init>(r12)
            goto L46
        L46:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2772h.m32004a(com.google.android.gms.common.api.Status, java.lang.Exception, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* JADX WARN: Incorrect condition in loop: B:6:0x004c */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void m32001a(com.google.android.gms.common.api.internal.C2772h r23, com.google.android.gms.common.api.internal.C2770g0 r24) {
        /*
            r0 = r23
            java.util.List<com.google.android.gms.common.api.internal.g0> r1 = r0.f7779c
            r23 = r0
            r0 = r24
            boolean r2 = r1.remove(r0)
            if (r2 == 0) goto La6
            r0 = r23
            com.google.android.gms.common.api.internal.f r3 = r0.f7787p
            android.os.Handler r4 = com.google.android.gms.common.api.internal.C2766f.m32031a(r3)
            r5 = 15
            r0 = r24
            r4.removeMessages(r5, r0)
            r0 = r23
            com.google.android.gms.common.api.internal.f r3 = r0.f7787p
            android.os.Handler r4 = com.google.android.gms.common.api.internal.C2766f.m32031a(r3)
            r5 = 16
            r0 = r24
            r4.removeMessages(r5, r0)
            r0 = r24
            com.google.android.gms.common.d r6 = com.google.android.gms.common.api.internal.C2770g0.m32012a(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = r7
            r0 = r23
            java.util.Queue<com.google.android.gms.common.api.internal.g1> r9 = r0.f7788q
            int r10 = r9.size()
            r7.<init>(r10)
            r0 = r23
            java.util.Queue<com.google.android.gms.common.api.internal.g1> r9 = r0.f7788q
            java.util.Iterator r11 = r9.iterator()
        L48:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r12 = r11.next()
            r14 = r12
            com.google.android.gms.common.api.internal.g1 r14 = (com.google.android.gms.common.api.internal.AbstractC2771g1) r14
            r13 = r14
            boolean r2 = r13 instanceof com.google.android.gms.common.api.internal.AbstractC2788m0
            if (r2 == 0) goto L48
            r16 = r13
            com.google.android.gms.common.api.internal.m0 r16 = (com.google.android.gms.common.api.internal.AbstractC2788m0) r16
            r15 = r16
            r0 = r23
            com.google.android.gms.common.d[] r17 = r15.g(r0)
            if (r17 == 0) goto L48
            r0 = r17
            boolean r2 = com.google.android.gms.common.util.C2964b.m31542c(r0, r6)
            if (r2 == 0) goto L48
            r8.add(r13)
            goto L48
        L74:
            int r10 = r8.size()
            r18 = 0
        L7a:
            r0 = r18
            if (r0 >= r10) goto La6
            r0 = r18
            java.lang.Object r12 = r8.get(r0)
            r19 = r12
            com.google.android.gms.common.api.internal.g1 r19 = (com.google.android.gms.common.api.internal.AbstractC2771g1) r19
            r13 = r19
            r0 = r23
            java.util.Queue<com.google.android.gms.common.api.internal.g1> r9 = r0.f7788q
            r9.remove(r13)
            com.google.android.gms.common.api.UnsupportedApiCallException r20 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r0 = r20
            r0.<init>(r6)
            r22 = r20
            java.lang.Exception r22 = (java.lang.Exception) r22
            r21 = r22
            r0 = r21
            r13.mo31886b(r0)
            int r18 = r18 + 1
            goto L7a
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2772h.m32001a(com.google.android.gms.common.api.internal.h, com.google.android.gms.common.api.internal.g0):void");
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
    /* renamed from: a */
    private final boolean m32003a(AbstractC2771g1 abstractC2771g1) {
        boolean $z0 = abstractC2771g1 instanceof AbstractC2788m0;
        if (!$z0) {
            m31989c(abstractC2771g1);
            return true;
        }
        AbstractC2788m0 $r3 = (AbstractC2788m0) abstractC2771g1;
        C2830d[] $r4 = $r3.g(this);
        C2830d $r5 = m31997a($r4);
        if ($r5 == null) {
            m31989c(abstractC2771g1);
            return true;
        }
        C2730a.InterfaceC2739f $r6 = this.f7778b;
        Class $r7 = $r6.getClass();
        String $r8 = $r7.getName();
        String $r9 = $r5.m31869f();
        long $l0 = $r5.m31868h();
        String $r10 = String.valueOf($r8);
        int $i1 = $r10.length();
        String $r102 = String.valueOf($r9);
        StringBuilder r21 = new StringBuilder($i1 + 77 + $r102.length());
        r21.append($r8);
        r21.append(" could not execute call because it requires feature (");
        r21.append($r9);
        r21.append(", ");
        r21.append($l0);
        r21.append(").");
        Log.w("GoogleApiManager", r21.toString());
        boolean $z02 = C2766f.m32023c(this.f7787p);
        if ($z02) {
            boolean $z03 = $r3.f(this);
            if ($z03) {
                C2754b $r13 = this.f7777a;
                C2770g0 r22 = new C2770g0($r13, $r5, null);
                List $r14 = this.f7779c;
                int $i2 = $r14.indexOf(r22);
                if ($i2 >= 0) {
                    List $r142 = this.f7779c;
                    Object $r15 = $r142.get($i2);
                    C2770g0 $r12 = (C2770g0) $r15;
                    Handler $r16 = C2766f.m32031a(this.f7787p);
                    $r16.removeMessages(15, $r12);
                    C2766f $r11 = this.f7787p;
                    Handler $r162 = C2766f.m32031a($r11);
                    Handler $r17 = C2766f.m32031a($r11);
                    Message $r18 = Message.obtain($r17, 15, $r12);
                    long $l02 = C2766f.expandItemActionView(this.f7787p);
                    $r162.sendMessageDelayed($r18, $l02);
                    return false;
                }
                List $r143 = this.f7779c;
                $r143.add(r22);
                C2766f $r112 = this.f7787p;
                Handler $r163 = C2766f.m32031a($r112);
                Handler $r172 = C2766f.m32031a($r112);
                Message $r182 = Message.obtain($r172, 15, r22);
                long $l03 = C2766f.expandItemActionView(this.f7787p);
                $r163.sendMessageDelayed($r182, $l03);
                C2766f $r113 = this.f7787p;
                Handler $r164 = C2766f.m32031a($r113);
                Handler $r173 = C2766f.m32031a($r113);
                Message $r183 = Message.obtain($r173, 16, r22);
                long $l04 = C2766f.dispatchMenuItemSelected(this.f7787p);
                $r164.sendMessageDelayed($r183, $l04);
                C2826b r23 = new C2826b(2, null);
                boolean $z04 = m31999a(r23);
                if ($z04) {
                    return false;
                }
                this.f7787p.add(r23, this.f7782g);
                return false;
            }
        }
        Exception r24 = new UnsupportedApiCallException($r5);
        Exception r25 = r24;
        $r3.mo31886b(r25);
        return true;
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
    private final boolean m31999a(C2826b c2826b) {
        Object $r2 = C2766f.m32025b();
        synchronized ($r2) {
            C2766f $r3 = this.f7787p;
            C2813v $r4 = C2766f.m32020d($r3);
            if ($r4 != null) {
                Set $r5 = C2766f.m32016l($r3);
                C2754b $r6 = this.f7777a;
                boolean $z0 = $r5.contains($r6);
                if ($z0) {
                    C2813v $r42 = C2766f.m32020d(this.f7787p);
                    int $i0 = this.f7782g;
                    $r42.m31944s(c2826b, $i0);
                    return true;
                }
            }
            return false;
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
    public final void m31996b() {
        Queue $r2 = this.f7788q;
        ArrayList $r1 = new ArrayList($r2);
        int $i0 = $r1.size();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            Object $r3 = $r1.get($i1);
            AbstractC2771g1 $r4 = (AbstractC2771g1) $r3;
            C2730a.InterfaceC2739f $r5 = this.f7778b;
            boolean $z0 = $r5.isConnected();
            if (!$z0) {
                return;
            }
            boolean $z02 = m32003a($r4);
            if ($z02) {
                Queue $r22 = this.f7788q;
                $r22.remove($r4);
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m31993b(com.google.android.gms.common.C2826b r11) {
        /*
            r10 = this;
            java.util.Set<com.google.android.gms.common.api.internal.h1> r0 = r10.f7785m
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.google.android.gms.common.api.internal.h1 r5 = (com.google.android.gms.common.api.internal.C2774h1) r5
            r4 = r5
            com.google.android.gms.common.b r6 = com.google.android.gms.common.C2826b.f7892w
            boolean r2 = com.google.android.gms.common.internal.C2906q.m31701a(r11, r6)
            if (r2 == 0) goto L23
            com.google.android.gms.common.api.a$f r7 = r10.f7778b
            java.lang.String r8 = r7.mo31965f()
            goto L24
        L23:
            r8 = 0
        L24:
            com.google.android.gms.common.api.internal.b<O extends com.google.android.gms.common.api.a$d> r9 = r10.f7777a
            r4.m31977b(r9, r11, r8)
            goto L6
        L2a:
            java.util.Set<com.google.android.gms.common.api.internal.h1> r0 = r10.f7785m
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2772h.m31993b(com.google.android.gms.common.b):void");
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
    /* renamed from: b */
    public final boolean m31992b(boolean z) {
        C2766f $r1 = this.f7787p;
        Handler $r2 = C2766f.m32031a($r1);
        com.google.android.gms.common.internal.List.get($r2);
        C2730a.InterfaceC2739f $r3 = this.f7778b;
        boolean $z1 = $r3.isConnected();
        if ($z1) {
            Map $r4 = this.f7784l;
            int $i0 = $r4.size();
            if ($i0 == 0) {
                C2811u $r5 = this.f7786o;
                boolean $z12 = $r5.m31908g();
                if (!$z12) {
                    C2730a.InterfaceC2739f $r32 = this.f7778b;
                    $r32.mo31967c("Timing out service connection.");
                    return true;
                } else if (z) {
                    close();
                    return false;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: c */
    private final void m31989c(AbstractC2771g1 abstractC2771g1) {
        C2811u $r3 = this.f7786o;
        boolean $z0 = hasSubMenu();
        abstractC2771g1.mo32010d($r3, $z0);
        try {
            abstractC2771g1.c(this);
        } catch (DeadObjectException e) {
            m31990c(1);
            C2730a.InterfaceC2739f $r4 = this.f7778b;
            $r4.mo31967c("DeadObjectException thrown while running ApiCallRunner.");
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
    private final void close() {
        Handler $r3 = C2766f.m32031a(this.f7787p);
        C2754b $r1 = this.f7777a;
        $r3.removeMessages(12, $r1);
        C2766f $r2 = this.f7787p;
        Handler $r32 = C2766f.m32031a($r2);
        Handler $r4 = C2766f.m32031a($r2);
        C2754b $r12 = this.f7777a;
        Message $r5 = $r4.obtainMessage(12, $r12);
        long $l0 = C2766f.add(this.f7787p);
        $r32.sendMessageDelayed($r5, $l0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m31984d(C2772h c2772h, C2770g0 c2770g0) {
        List $r1 = c2772h.f7779c;
        boolean $z0 = $r1.contains(c2770g0);
        if ($z0) {
            boolean $z02 = c2772h.f7789s;
            if ($z02) {
                return;
            }
            C2730a.InterfaceC2739f $r3 = c2772h.f7778b;
            boolean $z03 = $r3.isConnected();
            if ($z03) {
                c2772h.m31996b();
            } else {
                c2772h.m31986d();
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
    private final void setEnabled() {
        boolean $z0 = this.f7789s;
        if ($z0) {
            C2766f $r1 = this.f7787p;
            Handler $r2 = C2766f.m32031a($r1);
            C2754b $r3 = this.f7777a;
            $r2.removeMessages(11, $r3);
            C2766f $r12 = this.f7787p;
            Handler $r22 = C2766f.m32031a($r12);
            C2754b $r32 = this.f7777a;
            $r22.removeMessages(9, $r32);
            this.f7789s = false;
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
    public final void m32006a(Bundle bundle) {
        Looper $r2 = Looper.myLooper();
        C2766f $r3 = this.f7787p;
        Handler $r4 = C2766f.m32031a($r3);
        Looper $r5 = $r4.getLooper();
        if ($r2 == $r5) {
            m32008a();
            return;
        }
        C2766f $r32 = this.f7787p;
        Handler $r42 = C2766f.m32031a($r32);
        Runnable r7 = new RunnableC2752a0(this);
        Runnable r8 = r7;
        $r42.post(r8);
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
    /* renamed from: a */
    public final void m31998a(C2826b c2826b, Exception exc) {
        C2766f $r3 = this.f7787p;
        Handler $r4 = C2766f.m32031a($r3);
        com.google.android.gms.common.internal.List.get($r4);
        BinderC2816w0 $r5 = this.f7781f;
        if ($r5 != null) {
            $r5.m31888t1();
        }
        m31982e();
        C2766f $r32 = this.f7787p;
        C2894m0 $r6 = C2766f.size($r32);
        $r6.m31705c();
        m31993b(c2826b);
        C2730a.InterfaceC2739f $r7 = this.f7778b;
        boolean $z0 = $r7 instanceof C2847e;
        if ($z0) {
            int $i0 = c2826b.m31883f();
            if ($i0 != 24) {
                C2766f $r33 = this.f7787p;
                C2766f.m32030a($r33, true);
                C2766f $r34 = this.f7787p;
                Handler $r42 = C2766f.m32031a($r34);
                Handler $r8 = C2766f.m32031a($r34);
                Message $r9 = $r8.obtainMessage(19);
                $r42.sendMessageDelayed($r9, 300000L);
            }
        }
        int $i02 = c2826b.m31883f();
        if ($i02 == 4) {
            Status $r10 = C2766f.m32015r();
            m32005a($r10);
            return;
        }
        Queue $r11 = this.f7788q;
        boolean $z02 = $r11.isEmpty();
        if ($z02) {
            this.f7783k = c2826b;
        } else if (exc != null) {
            C2766f $r35 = this.f7787p;
            Handler $r43 = C2766f.m32031a($r35);
            com.google.android.gms.common.internal.List.get($r43);
            m32004a(null, exc, false);
        } else {
            C2766f $r36 = this.f7787p;
            boolean $z03 = C2766f.m32023c($r36);
            if (!$z03) {
                C2754b $r12 = this.f7777a;
                Status $r102 = C2766f.m32021d($r12, c2826b);
                m32005a($r102);
                return;
            }
            C2754b $r122 = this.f7777a;
            Status $r103 = C2766f.m32021d($r122, c2826b);
            m32004a($r103, null, true);
            Queue $r112 = this.f7788q;
            boolean $z04 = $r112.isEmpty();
            if ($z04) {
                return;
            }
            boolean $z05 = m31999a(c2826b);
            if ($z05) {
                return;
            }
            C2766f $r37 = this.f7787p;
            int $i03 = this.f7782g;
            boolean $z06 = $r37.add(c2826b, $i03);
            if ($z06) {
                return;
            }
            int $i04 = c2826b.m31883f();
            if ($i04 == 18) {
                this.f7789s = true;
            }
            boolean $z07 = this.f7789s;
            if (!$z07) {
                C2754b $r123 = this.f7777a;
                Status $r104 = C2766f.m32021d($r123, c2826b);
                m32005a($r104);
                return;
            }
            C2766f $r38 = this.f7787p;
            Handler $r44 = C2766f.m32031a($r38);
            Handler $r82 = C2766f.m32031a($r38);
            C2754b $r124 = this.f7777a;
            Message $r92 = Message.obtain($r82, 9, $r124);
            C2766f $r39 = this.f7787p;
            long $l1 = C2766f.expandItemActionView($r39);
            $r44.sendMessageDelayed($r92, $l1);
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
    /* renamed from: b */
    public final void m31995b(AbstractC2771g1 abstractC2771g1) {
        C2766f $r2 = this.f7787p;
        Handler $r3 = C2766f.m32031a($r2);
        com.google.android.gms.common.internal.List.get($r3);
        C2730a.InterfaceC2739f $r4 = this.f7778b;
        boolean $z0 = $r4.isConnected();
        if ($z0) {
            boolean $z02 = m32003a(abstractC2771g1);
            if ($z02) {
                close();
                return;
            }
            Queue $r5 = this.f7788q;
            $r5.add(abstractC2771g1);
            return;
        }
        Queue $r52 = this.f7788q;
        $r52.add(abstractC2771g1);
        C2826b $r6 = this.f7783k;
        if ($r6 != null) {
            boolean $z03 = $r6.m31880l();
            if ($z03) {
                m31998a(this.f7783k, (Exception) null);
                return;
            }
        }
        m31986d();
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
    /* renamed from: c */
    public final void m31991c() {
        C2766f $r4 = this.f7787p;
        Handler $r5 = C2766f.m32031a($r4);
        com.google.android.gms.common.internal.List.get($r5);
        Status $r6 = C2766f.f7756C;
        m32005a($r6);
        C2811u $r7 = this.f7786o;
        $r7.m31909f();
        Map $r8 = this.f7784l;
        Set $r9 = $r8.keySet();
        Object[] $r11 = $r9.toArray(new C2778j.C2779a[0]);
        C2778j.C2779a[] $r10 = (C2778j.C2779a[]) $r11;
        for (C2778j.C2779a $r1 : $r10) {
            C4465k $r3 = new C4465k();
            C2768f1 $r2 = new C2768f1($r1, $r3);
            m31995b($r2);
        }
        C2826b $r12 = new C2826b(4);
        m31993b($r12);
        C2730a.InterfaceC2739f $r13 = this.f7778b;
        boolean $z0 = $r13.isConnected();
        if ($z0) {
            C2730a.InterfaceC2739f $r132 = this.f7778b;
            C2762d0 $r14 = new C2762d0(this);
            $r132.mo31963h($r14);
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
    /* renamed from: c */
    public final void m31990c(int i) {
        Looper $r1 = Looper.myLooper();
        C2766f $r2 = this.f7787p;
        Handler $r3 = C2766f.m32031a($r2);
        Looper $r4 = $r3.getLooper();
        if ($r1 == $r4) {
            m32007a(i);
            return;
        }
        C2766f $r22 = this.f7787p;
        Handler $r32 = C2766f.m32031a($r22);
        Runnable r6 = new RunnableC2755b0(this, i);
        Runnable r7 = r6;
        $r32.post(r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: d */
    public final void m31986d() {
        Handler $r2 = C2766f.m32031a(this.f7787p);
        com.google.android.gms.common.internal.List.get($r2);
        C2730a.InterfaceC2739f $r3 = this.f7778b;
        boolean $z0 = $r3.isConnected();
        if ($z0) {
            return;
        }
        C2730a.InterfaceC2739f $r32 = this.f7778b;
        boolean $z02 = $r32.mo31966d();
        if ($z02) {
            return;
        }
        C2766f $r1 = this.f7787p;
        try {
            C2894m0 $r4 = C2766f.size($r1);
            Context $r5 = C2766f.m32024b($r1);
            C2730a.InterfaceC2739f $r33 = this.f7778b;
            int $i0 = $r4.m31706b($r5, $r33);
            if ($i0 != 0) {
                C2826b $r6 = new C2826b($i0, null);
                C2730a.InterfaceC2739f $r34 = this.f7778b;
                Class $r7 = $r34.getClass();
                String $r8 = $r7.getName();
                String $r9 = $r6.toString();
                String $r10 = String.valueOf($r8);
                int $i02 = $r10.length() + 35;
                int $i1 = $r9.length();
                StringBuilder $r11 = new StringBuilder($i02 + $i1);
                $r11.append("The service for ");
                $r11.append($r8);
                $r11.append(" is not available: ");
                $r11.append($r9);
                Log.w("GoogleApiManager", $r11.toString());
                m31998a($r6, (Exception) null);
                return;
            }
            C2766f $r12 = this.f7787p;
            C2730a.InterfaceC2739f $r35 = this.f7778b;
            C2754b $r13 = this.f7777a;
            C2776i0 $r122 = new C2776i0($r12, $r35, $r13);
            boolean $z03 = $r35.mo15467n();
            if ($z03) {
                BinderC2816w0 $r14 = this.f7781f;
                com.google.android.gms.common.internal.List.m31820a($r14);
                $r14.m31889s1($r122);
            }
            C2730a.InterfaceC2739f $r36 = this.f7778b;
            try {
                $r36.mo31964g($r122);
            } catch (SecurityException $r15) {
                C2826b $r62 = new C2826b(10);
                m31998a($r62, $r15);
            }
        } catch (IllegalStateException $r16) {
            C2826b $r63 = new C2826b(10);
            m31998a($r63, $r16);
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
    /* renamed from: d */
    public final void m31983d(C2826b c2826b) {
        C2766f $r3 = this.f7787p;
        Handler $r4 = C2766f.m32031a($r3);
        com.google.android.gms.common.internal.List.get($r4);
        C2730a.InterfaceC2739f $r5 = this.f7778b;
        Class $r6 = $r5.getClass();
        String $r7 = $r6.getName();
        String $r8 = String.valueOf(c2826b);
        String $r9 = String.valueOf($r7);
        int $i0 = $r9.length();
        String $r92 = String.valueOf($r8);
        int $i1 = $r92.length();
        StringBuilder $r2 = new StringBuilder($i0 + 25 + $i1);
        $r2.append("onSignInFailed for ");
        $r2.append($r7);
        $r2.append(" with ");
        $r2.append($r8);
        $r5.mo31967c($r2.toString());
        m31998a(c2826b, (Exception) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: e */
    public final void m31982e() {
        C2766f $r2 = this.f7787p;
        Handler $r1 = C2766f.m32031a($r2);
        com.google.android.gms.common.internal.List.get($r1);
        this.f7783k = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: f */
    public final void m31981f() {
        Handler $r2 = C2766f.m32031a(this.f7787p);
        com.google.android.gms.common.internal.List.get($r2);
        boolean $z0 = this.f7789s;
        if ($z0) {
            setEnabled();
            C2766f $r1 = this.f7787p;
            C2832e $r3 = C2766f.m32017i($r1);
            Context $r4 = C2766f.m32024b($r1);
            int $i0 = $r3.mo31846g($r4);
            Status $r5 = $i0 == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.");
            m32005a($r5);
            C2730a.InterfaceC2739f $r6 = this.f7778b;
            $r6.mo31967c("Timing out connection while resuming.");
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
    public final C2730a.InterfaceC2739f getCount() {
        C2730a.InterfaceC2739f r1 = this.f7778b;
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
    public final int getIntent() {
        int i0 = this.f7782g;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    final int getTitle() {
        int i0 = this.f7780e;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean hasSubMenu() {
        C2730a.InterfaceC2739f $r1 = this.f7778b;
        boolean $z0 = $r1.mo15467n();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: i */
    public final C2826b m31980i() {
        C2766f $r2 = this.f7787p;
        Handler $r1 = C2766f.m32031a($r2);
        com.google.android.gms.common.internal.List.get($r1);
        C2826b r3 = this.f7783k;
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isVisible() {
        C2730a.InterfaceC2739f $r1 = this.f7778b;
        boolean $z0 = $r1.isConnected();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: n */
    public final Map m31979n() {
        Map r1 = this.f7784l;
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
    public final void onClick() {
        C2766f $r2 = this.f7787p;
        Handler $r1 = C2766f.m32031a($r2);
        com.google.android.gms.common.internal.List.get($r1);
        boolean $z0 = this.f7789s;
        if ($z0) {
            m31986d();
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
    final void setTitle() {
        int $i0 = this.f7780e;
        this.f7780e = $i0 + 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void setTitle(C2774h1 c2774h1) {
        C2766f $r3 = this.f7787p;
        Handler $r2 = C2766f.m32031a($r3);
        com.google.android.gms.common.internal.List.get($r2);
        Set $r4 = this.f7785m;
        $r4.add(c2774h1);
    }

    public final void setTitle(C2826b c2826b) {
        m31998a(c2826b, (Exception) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean supportRequestWindowFeature() {
        boolean $z0 = m31992b(true);
        return $z0;
    }
}
