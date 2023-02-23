package lombok.org.asm;

import a.a.a.f0;
import a.a.a.i0;
import a.a.a.u0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13288p;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import lombok.org.asm.asm.C14255f;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.f */
/* loaded from: classes.dex */
public class C14269f<T> extends u0<T> implements f0<T>, InterfaceC11739e {

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f31386g;

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f31387h;

    /* renamed from: a */
    public volatile java.lang.Object f31388a;

    /* renamed from: b */
    public final InterfaceC11714d<T> f31389b;

    /* renamed from: c */
    private volatile java.lang.Object f31390c;

    /* renamed from: d */
    public final InterfaceC11719g f31391d;

    /* renamed from: e */
    private volatile int f31392e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicIntegerFieldUpdater $r0 = AtomicIntegerFieldUpdater.newUpdater(i0.class, "w");
        f31387h = $r0;
        AtomicReferenceFieldUpdater $r1 = AtomicReferenceFieldUpdater.newUpdater(i0.class, java.lang.Object.class, "x");
        f31386g = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public C14269f(InterfaceC11714d interfaceC11714d, int i) {
        super(i);
        this.f31389b = interfaceC11714d;
        boolean $z0 = Item.m2375a();
        if ($z0) {
            boolean $z02 = i != -1;
            if (!$z02) {
                AssertionError $r2 = new AssertionError();
                throw $r2;
            }
        }
        InterfaceC11719g $r3 = interfaceC11714d.getContext();
        this.f31391d = $r3;
        this.f31392e = 0;
        Edge $r4 = Edge.f31275c;
        this.f31390c = $r4;
        this.f31388a = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        return kotlin.p476c0.p477j.C11728b.m10391d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r10 = r22.f31390c;
        r3 = r10 instanceof lombok.org.asm.C14264b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        r12 = (lombok.org.asm.C14264b) r10;
        r13 = r12.f31379a;
        r3 = lombok.org.asm.Item.f31288b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw lombok.org.asm.asm.ClassWriter.m2345e(r13, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        r3 = lombok.org.asm.Card.m2383a(r22.f31384c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r3 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r14 = r22.f31391d;
        r15 = lombok.org.asm.Label.f31291c;
        r16 = r14.get(r15);
        r18 = (lombok.org.asm.Label) r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r18 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        r3 = r18.put();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r19 = r18.getValue();
        r20 = r19;
        m2298a(r10, r19);
        r3 = lombok.org.asm.Item.f31288b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r20 = lombok.org.asm.asm.ClassWriter.m2345e(r19, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
        throw r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        return m2301a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        throw r13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2303a() {
        /*
            r22 = this;
            r0 = r22
            r0.m2287d()
        L5:
            r0 = r22
            int r2 = r0.f31392e
            r3 = 1
            if (r2 == 0) goto L1d
            r4 = 2
            if (r2 != r4) goto L11
            r3 = 0
            goto L29
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already suspended"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L1d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = lombok.org.asm.C14269f.f31387h
            r4 = 0
            r9 = 1
            r0 = r22
            boolean r8 = r7.compareAndSet(r0, r4, r9)
            if (r8 == 0) goto L5
        L29:
            if (r3 == 0) goto L30
            java.lang.Object r10 = kotlin.p476c0.p477j.C11728b.m10391d()
            return r10
        L30:
            r0 = r22
            java.lang.Object r10 = r0.f31390c
            boolean r3 = r10 instanceof lombok.org.asm.C14264b
            if (r3 == 0) goto L49
            r12 = r10
            lombok.org.asm.b r12 = (lombok.org.asm.C14264b) r12
            r11 = r12
            java.lang.Throwable r13 = r11.f31379a
            boolean r3 = lombok.org.asm.Item.f31288b
            if (r3 == 0) goto L48
            r0 = r22
            java.lang.Throwable r13 = lombok.org.asm.asm.ClassWriter.m2345e(r13, r0)
        L48:
            throw r13
        L49:
            r0 = r22
            int r2 = r0.f31384c
            boolean r3 = lombok.org.asm.Card.m2383a(r2)
            if (r3 == 0) goto L8f
            r0 = r22
            kotlin.c0.g r14 = r0.f31391d
            lombok.org.asm.Token r15 = lombok.org.asm.Label.f31291c
            kotlin.c0.g$b r16 = r14.get(r15)
            r18 = r16
            lombok.org.asm.Label r18 = (lombok.org.asm.Label) r18
            r17 = r18
            if (r17 == 0) goto L8f
            r0 = r17
            boolean r3 = r0.put()
            if (r3 != 0) goto L8f
            r0 = r17
            java.util.concurrent.CancellationException r19 = r0.getValue()
            r20 = r19
            r0 = r22
            r1 = r19
            r0.m2298a(r10, r1)
            boolean r3 = lombok.org.asm.Item.f31288b
            if (r3 == 0) goto L88
            r0 = r19
            r1 = r22
            java.lang.Throwable r20 = lombok.org.asm.asm.ClassWriter.m2345e(r0, r1)
        L88:
            r21 = r20
            java.lang.Throwable r21 = (java.lang.Throwable) r21
            r13 = r21
            throw r13
        L8f:
            r0 = r22
            java.lang.Object r10 = r0.m2301a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14269f.m2303a():java.lang.Object");
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
    public java.lang.Object m2301a(java.lang.Object $r1) {
        boolean $z0 = $r1 instanceof Type;
        if ($z0) {
            Type $r2 = (Type) $r1;
            return $r2.f31315d;
        }
        return $r1;
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
    public java.lang.Object m2299a(java.lang.Object obj, java.lang.Object obj2, InterfaceC11767l interfaceC11767l) {
        boolean $z0;
        do {
            java.lang.Object $r3 = this.f31390c;
            boolean $z02 = $r3 instanceof SupportMenuItem;
            if (!$z02) {
                return null;
            }
            SupportMenuItem $r4 = (SupportMenuItem) $r3;
            int $i0 = this.f31384c;
            java.lang.Object $r5 = m2293a($r4, obj, $i0, interfaceC11767l, null);
            AtomicReferenceFieldUpdater $r6 = f31386g;
            $z0 = $r6.compareAndSet(this, $r3, $r5);
        } while (!$z0);
        clear();
        Paint r7 = PositionMetric$a.f31306a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        if (r23 != null) goto L30;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2293a(lombok.org.asm.SupportMenuItem r19, java.lang.Object r20, int r21, kotlin.p483e0.p484c.InterfaceC11767l r22, java.lang.Object r23) {
        /*
            r18 = this;
            r0 = r20
            boolean r8 = r0 instanceof lombok.org.asm.C14264b
            if (r8 == 0) goto L28
            boolean r8 = lombok.org.asm.Item.f31289c
            r9 = 1
            if (r8 == 0) goto L19
            if (r23 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = 0
        L10:
            if (r10 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        L19:
            if (r8 == 0) goto L68
            if (r22 != 0) goto L1e
            goto L1f
        L1e:
            r9 = 0
        L1f:
            if (r9 == 0) goto L22
            return r20
        L22:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        L28:
            r0 = r21
            boolean r8 = lombok.org.asm.Card.m2383a(r0)
            if (r8 != 0) goto L33
            if (r23 != 0) goto L33
            return r20
        L33:
            if (r22 != 0) goto L43
            r0 = r19
            boolean r8 = r0 instanceof lombok.org.asm.AbstractC14297o
            if (r8 == 0) goto L41
            r0 = r19
            boolean r8 = r0 instanceof lombok.org.asm.AbstractC14311u
            if (r8 == 0) goto L43
        L41:
            if (r23 == 0) goto L68
        L43:
            lombok.org.asm.Type r12 = new lombok.org.asm.Type
            r0 = r19
            boolean r8 = r0 instanceof lombok.org.asm.AbstractC14297o
            if (r8 != 0) goto L4d
            r19 = 0
        L4d:
            r14 = r19
            lombok.org.asm.o r14 = (lombok.org.asm.AbstractC14297o) r14
            r13 = r14
            r15 = 0
            r16 = 16
            r17 = 0
            r0 = r12
            r1 = r20
            r2 = r13
            r3 = r22
            r4 = r23
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L68:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14269f.m2293a(lombok.org.asm.SupportMenuItem, java.lang.Object, int, kotlin.e0.c.l, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        r6 = lombok.org.asm.Item.f31289c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r24 == (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r6 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r11 = new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        r12 = m2284g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r24 != 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        r6 = r12 instanceof lombok.org.asm.asm.C14255f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
        r6 = lombok.org.asm.Card.m2383a(r24);
        r0 = r23.f31384c;
        r13 = lombok.org.asm.Card.m2383a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r6 != r13) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        r15 = (lombok.org.asm.asm.C14255f) r12;
        r0 = r15.f31349d;
        r17 = r12.getContext();
        r4 = r0.mo2264a(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r0.mo2139a(r17, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        r18 = lombok.org.asm.C14312w.f31491a;
        r19 = r18.m2168a();
        r4 = r19.m2273l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        r19.m2278b(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        r19.m2275c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
        lombok.org.asm.Card.m2382a(r23, m2284g(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r4 = r19.m2276c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r20 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
        m2308a(r20, (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        r22 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r19.m2279a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
        throw r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        lombok.org.asm.Card.m2382a(r23, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2302a(int r24) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14269f.m2302a(int):void");
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
    public final void m2300a(java.lang.Object obj, int i, InterfaceC11767l interfaceC11767l) {
        boolean $z0;
        do {
            java.lang.Object $r3 = this.f31390c;
            boolean $z02 = $r3 instanceof SupportMenuItem;
            if (!$z02) {
                boolean $z03 = $r3 instanceof Handle;
                if ($z03) {
                    Handle $r7 = (Handle) $r3;
                    $r7.getClass();
                    AtomicIntegerFieldUpdater $r8 = Handle.f31282c;
                    boolean $z04 = $r8.compareAndSet($r7, 0, 1);
                    if ($z04) {
                        if (interfaceC11767l != null) {
                            Throwable $r9 = $r7.f31379a;
                            m2290b(interfaceC11767l, $r9);
                            return;
                        }
                        return;
                    }
                }
                String $r11 = "Already resumed, but proposed with update " + obj;
                IllegalStateException $r12 = new IllegalStateException($r11.toString());
                throw $r12;
            }
            SupportMenuItem $r4 = (SupportMenuItem) $r3;
            java.lang.Object $r5 = m2293a($r4, obj, i, interfaceC11767l, null);
            AtomicReferenceFieldUpdater $r6 = f31386g;
            $z0 = $r6.compareAndSet(this, $r3, $r5);
        } while (!$z0);
        clear();
        m2302a(i);
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
    public void m2298a(java.lang.Object obj, Throwable th) {
        while (true) {
            java.lang.Object $r2 = this.f31390c;
            boolean $z0 = $r2 instanceof SupportMenuItem;
            if ($z0) {
                String $r10 = "Not completed".toString();
                IllegalStateException $r9 = new IllegalStateException($r10);
                throw $r9;
            }
            boolean $z02 = $r2 instanceof C14264b;
            if ($z02) {
                return;
            }
            boolean $z03 = $r2 instanceof Type;
            if ($z03) {
                Type $r1 = (Type) $r2;
                Throwable $r4 = $r1.f31316g;
                boolean $z04 = $r4 != null;
                if (!(!$z04)) {
                    String $r102 = "Must be called at most once".toString();
                    IllegalStateException $r92 = new IllegalStateException($r102);
                    throw $r92;
                }
                Type $r5 = Type.m2353a($r1, null, null, null, null, th, 15, null);
                AtomicReferenceFieldUpdater $r6 = f31386g;
                boolean $z05 = $r6.compareAndSet(this, $r2, $r5);
                if ($z05) {
                    AbstractC14297o $r7 = $r1.f31312a;
                    if ($r7 != null) {
                        m2289b($r7, th);
                    }
                    InterfaceC11767l $r8 = $r1.f31314c;
                    if ($r8 != null) {
                        m2290b($r8, th);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater $r62 = f31386g;
                boolean $z06 = $r62.compareAndSet(this, $r2, new Type($r2, null, null, null, th, 14, null));
                if ($z06) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
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
    public void m2296a(InterfaceC11767l interfaceC11767l) {
        AbstractC14297o $r3 = (AbstractC14297o) interfaceC11767l;
        while (true) {
            java.lang.Object $r4 = this.f31390c;
            boolean $z0 = $r4 instanceof Edge;
            if ($z0) {
                AtomicReferenceFieldUpdater $r5 = f31386g;
                boolean $z02 = $r5.compareAndSet(this, $r4, $r3);
                if ($z02) {
                    return;
                }
            } else {
                boolean $z03 = $r4 instanceof AbstractC14297o;
                if ($z03) {
                    m2295a(interfaceC11767l, $r4);
                    NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r10;
                }
                boolean $z04 = $r4 instanceof C14264b;
                if ($z04) {
                    C14264b c14264b = (C14264b) $r4;
                    c14264b.getClass();
                    AtomicIntegerFieldUpdater $r8 = C14264b.f31378c;
                    boolean $z1 = $r8.compareAndSet(c14264b, 0, 1);
                    if (!$z1) {
                        m2295a(interfaceC11767l, $r4);
                        NullPointerException r102 = new NullPointerException("Null throw statement replaced by Soot");
                        throw r102;
                    }
                    boolean $z12 = $r4 instanceof Handle;
                    if ($z12) {
                        if (!$z04) {
                            $r4 = null;
                        }
                        C14264b c14264b2 = (C14264b) $r4;
                        m2294a(interfaceC11767l, c14264b2 != null ? c14264b2.f31379a : null);
                        return;
                    }
                    return;
                }
                boolean $z05 = $r4 instanceof Type;
                if ($z05) {
                    Type $r2 = (Type) $r4;
                    AbstractC14297o $r9 = $r2.f31312a;
                    if ($r9 != null) {
                        m2295a(interfaceC11767l, $r4);
                        NullPointerException r103 = new NullPointerException("Null throw statement replaced by Soot");
                        throw r103;
                    }
                    boolean $z06 = $r3 instanceof AbstractC14311u;
                    if ($z06) {
                        return;
                    }
                    Throwable $r6 = $r2.f31316g;
                    boolean $z13 = $r6 != null;
                    if ($z13) {
                        m2294a(interfaceC11767l, $r6);
                        return;
                    }
                    Type $r22 = Type.m2353a($r2, null, $r3, null, null, null, 29, null);
                    AtomicReferenceFieldUpdater $r52 = f31386g;
                    boolean $z07 = $r52.compareAndSet(this, $r4, $r22);
                    if ($z07) {
                        return;
                    }
                } else {
                    boolean $z08 = $r3 instanceof AbstractC14311u;
                    if ($z08) {
                        return;
                    }
                    Type $r23 = new Type($r4, $r3, null, null, null, 28, null);
                    AtomicReferenceFieldUpdater $r53 = f31386g;
                    boolean $z09 = $r53.compareAndSet(this, $r4, $r23);
                    if ($z09) {
                        return;
                    }
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
    public final void m2295a(InterfaceC11767l interfaceC11767l, java.lang.Object obj) {
        String $r4 = "It's prohibited to register multiple handlers, tried to register " + interfaceC11767l + ", already has " + obj;
        IllegalStateException $r5 = new IllegalStateException($r4.toString());
        throw $r5;
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
    public final void m2294a(InterfaceC11767l interfaceC11767l, Throwable th) {
        try {
            interfaceC11767l.invoke(th);
        } catch (Throwable $r5) {
            InterfaceC11719g $r6 = this.f31391d;
            String $r2 = "Exception in invokeOnCancellation handler for " + this;
            IOException $r1 = new IOException($r2, $r5);
            ClassReader.m2380a($r6, $r1);
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
    public boolean m2297a(Throwable th) {
        java.lang.Object $r3;
        boolean $z0;
        boolean $z1;
        do {
            $r3 = this.f31390c;
            if (!($r3 instanceof SupportMenuItem)) {
                return false;
            }
            $z0 = $r3 instanceof AbstractC14297o;
            Handle $r4 = new Handle(this, th, $z0);
            AtomicReferenceFieldUpdater $r1 = f31386g;
            $z1 = $r1.compareAndSet(this, $r3, $r4);
        } while (!$z1);
        if (!$z0) {
            $r3 = null;
        }
        AbstractC14297o $r5 = (AbstractC14297o) $r3;
        if ($r5 != null) {
            m2289b($r5, th);
        }
        clear();
        int $i0 = this.f31384c;
        m2302a($i0);
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
    /* renamed from: b */
    public Throwable m2291b(java.lang.Object obj) {
        Throwable $r2 = super.m2307b(obj);
        if ($r2 != null) {
            InterfaceC11714d $r3 = this.f31389b;
            boolean $z0 = Item.f31288b;
            if ($z0) {
                boolean $z02 = $r3 instanceof InterfaceC11739e;
                if ($z02) {
                    InterfaceC11739e $r4 = (InterfaceC11739e) $r3;
                    return lombok.org.asm.asm.ClassWriter.m2345e($r2, $r4);
                }
                return $r2;
            }
            return $r2;
        }
        return null;
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
    public final void m2290b(InterfaceC11767l interfaceC11767l, Throwable th) {
        try {
            interfaceC11767l.invoke(th);
        } catch (Throwable $r5) {
            InterfaceC11719g $r6 = this.f31391d;
            String $r2 = "Exception in resume onCancellation handler for " + this;
            IOException $r1 = new IOException($r2, $r5);
            ClassReader.m2380a($r6, $r1);
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
    public final void m2289b(AbstractC14297o abstractC14297o, Throwable th) {
        try {
            abstractC14297o.mo2257a(th);
        } catch (Throwable $r5) {
            InterfaceC11719g $r6 = this.f31391d;
            String $r2 = "Exception in invokeOnCancellation handler for " + this;
            IOException $r1 = new IOException($r2, $r5);
            ClassReader.m2380a($r6, $r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
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
    public final boolean m2292b() {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            int $i0 = this.f31384c;
            boolean $z1 = $i0 == 2;
            if (!$z1) {
                AssertionError $r1 = new AssertionError();
                throw $r1;
            }
        }
        if ($z0) {
            Object $r3 = (Object) this.f31388a;
            ClassWriter $r4 = ClassWriter.f31272b;
            boolean $z12 = $r3 != $r4;
            if (!$z12) {
                AssertionError $r12 = new AssertionError();
                throw $r12;
            }
        }
        java.lang.Object $r2 = this.f31390c;
        if ($z0 && !(!($r2 instanceof SupportMenuItem))) {
            AssertionError $r13 = new AssertionError();
            throw $r13;
        }
        if ($r2 instanceof Type) {
            Type $r5 = (Type) $r2;
            if ($r5.f31313b != null) {
                close();
                return false;
            }
        }
        this.f31392e = 0;
        Edge $r6 = Edge.f31275c;
        this.f31390c = $r6;
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
    /* renamed from: c */
    public java.lang.Object m2288c() {
        java.lang.Object r1 = this.f31390c;
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
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r4 = this;
            kotlin.c0.d<T> r0 = r4.f31389b
            boolean r1 = r0 instanceof lombok.org.asm.asm.C14255f
            if (r1 == 0) goto L12
            r3 = r0
            lombok.org.asm.asm.f r3 = (lombok.org.asm.asm.C14255f) r3
            r2 = r3
            boolean r1 = r2.m2328a(r4)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L18
            r4.close()
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14269f.clear():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void close() {
        java.lang.Object $r1 = this.f31388a;
        Object $r2 = (Object) $r1;
        if ($r2 != null) {
            $r2.mo2359c();
        }
        ClassWriter $r3 = ClassWriter.f31272b;
        this.f31388a = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r21 != false) goto L16;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2287d() {
        /*
            r25 = this;
            r0 = r25
            boolean r6 = r0.m2285f()
            if (r6 == 0) goto L9
            return
        L9:
            r0 = r25
            java.lang.Object r7 = r0.f31388a
            r9 = r7
            lombok.org.asm.Object r9 = (lombok.org.asm.Object) r9
            r8 = r9
            if (r8 == 0) goto L14
            return
        L14:
            r0 = r25
            kotlin.c0.d<T> r10 = r0.f31389b
            kotlin.c0.g r11 = r10.getContext()
            lombok.org.asm.Token r12 = lombok.org.asm.Label.f31291c
            kotlin.c0.g$b r13 = r11.get(r12)
            r15 = r13
            lombok.org.asm.Label r15 = (lombok.org.asm.Label) r15
            r14 = r15
            if (r14 == 0) goto L89
            lombok.org.asm.FieldWriter r16 = new lombok.org.asm.FieldWriter
            r0 = r16
            r1 = r25
            r0.<init>(r14, r1)
            r6 = 1
            r17 = 1
            r18 = 0
            r19 = 2
            r20 = 0
            r0 = r14
            r1 = r17
            r2 = r18
            r3 = r16
            r4 = r19
            r5 = r20
            lombok.org.asm.Object r8 = lombok.org.asm.C14314x.m2167a(r0, r1, r2, r3, r4, r5)
            r0 = r25
            r0.f31388a = r8
            r0 = r25
            java.lang.Object r7 = r0.f31390c
            boolean r0 = r7 instanceof lombok.org.asm.SupportMenuItem
            r21 = r0
            r17 = 1
            r0 = r21
            r1 = r17
            r0 = r0 ^ r1
            r21 = r0
            if (r21 == 0) goto L89
            r0 = r25
            kotlin.c0.d<T> r10 = r0.f31389b
            boolean r0 = r10 instanceof lombok.org.asm.asm.C14255f
            r21 = r0
            if (r21 == 0) goto L7b
            r23 = r10
            lombok.org.asm.asm.f r23 = (lombok.org.asm.asm.C14255f) r23
            r22 = r23
            r0 = r22
            r1 = r25
            boolean r21 = r0.m2328a(r1)
            if (r21 == 0) goto L7b
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r6 != 0) goto L89
            r8.mo2359c()
            lombok.org.asm.ClassWriter r24 = lombok.org.asm.ClassWriter.f31272b
            r0 = r24
            r1 = r25
            r1.f31388a = r0
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14269f.m2287d():void");
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
    public void m2286d(java.lang.Object obj) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            Paint $r2 = PositionMetric$a.f31306a;
            boolean $z02 = obj == $r2;
            if (!$z02) {
                AssertionError $r3 = new AssertionError();
                throw $r3;
            }
        }
        int $i0 = this.f31384c;
        m2302a($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: f */
    public final boolean m2285f() {
        Throwable $r1;
        java.lang.Object $r2 = this.f31390c;
        boolean $z0 = !($r2 instanceof SupportMenuItem);
        int $i0 = this.f31384c;
        boolean $z1 = $i0 == 2;
        if ($z1) {
            InterfaceC11714d<T> interfaceC11714d = this.f31389b;
            boolean $z12 = interfaceC11714d instanceof C14255f;
            if (!$z12) {
                interfaceC11714d = null;
            }
            C14255f $r4 = (C14255f) interfaceC11714d;
            if ($r4 == null || ($r1 = $r4.m2327a((InterfaceC14270g) this)) == null) {
                return $z0;
            }
            if ($z0) {
                return true;
            }
            m2297a($r1);
            return true;
        }
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
    /* renamed from: g */
    public final InterfaceC11714d m2284g() {
        InterfaceC11714d r1 = this.f31389b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f31389b;
        boolean $z0 = interfaceC11714d instanceof InterfaceC11739e;
        if (!$z0) {
            interfaceC11714d = null;
        }
        InterfaceC11739e $r2 = (InterfaceC11739e) interfaceC11714d;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public InterfaceC11719g getContext() {
        InterfaceC11719g r1 = this.f31391d;
        return r1;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void resumeWith(java.lang.Object $r1) {
        C14264b r4;
        Throwable $r2 = C13288p.m5361b($r1);
        Throwable $r3 = $r2;
        if ($r2 != null) {
            $r1 = r4;
            boolean $z0 = Item.f31288b;
            if ($z0) {
                $r3 = lombok.org.asm.asm.ClassWriter.m2345e($r2, this);
            }
            r4 = new C14264b($r3, false);
        }
        int $i0 = this.f31384c;
        m2300a($r1, $i0, (InterfaceC11767l) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("CancellableContinuation");
        $r1.append('(');
        InterfaceC11714d $r2 = this.f31389b;
        String $r3 = C14300r.m2186a($r2);
        $r1.append($r3);
        $r1.append("){");
        java.lang.Object $r4 = this.f31390c;
        $r1.append($r4);
        $r1.append("}@");
        int $i0 = System.identityHashCode(this);
        String $r32 = Integer.toHexString($i0);
        $r1.append($r32);
        String $r33 = $r1.toString();
        return $r33;
    }
}
