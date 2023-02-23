package lombok.org.asm.asm;

import a.a.a.u0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.AbstractC14271h;
import lombok.org.asm.AbstractC14272i;
import lombok.org.asm.AnnotationVisitor;
import lombok.org.asm.C14269f;
import lombok.org.asm.C14300r;
import lombok.org.asm.C14312w;
import lombok.org.asm.Edit;
import lombok.org.asm.InterfaceC14270g;
import lombok.org.asm.Item;
/* renamed from: lombok.org.asm.asm.f */
/* loaded from: classes.dex */
public final class C14255f<T> extends u0<T> implements InterfaceC11739e, InterfaceC11714d<T> {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f31346c;

    /* renamed from: a */
    public final InterfaceC11714d<T> f31347a;

    /* renamed from: b */
    private volatile Object f31348b;

    /* renamed from: d */
    public final AbstractC14272i f31349d;

    /* renamed from: e */
    public final Object f31350e;

    /* renamed from: f */
    public Object f31351f;

    /* renamed from: k */
    public final InterfaceC11739e f31352k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(a.a.a.c2.k.class, Object.class, "y");
        f31346c = $r0;
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
    public C14255f(AbstractC14272i abstractC14272i, InterfaceC11714d $r2) {
        super(-1);
        this.f31349d = abstractC14272i;
        this.f31347a = $r2;
        Paint $r3 = C14256g.f31354f;
        this.f31351f = $r3;
        boolean $z0 = $r2 instanceof InterfaceC11739e;
        InterfaceC11739e $r4 = (InterfaceC11739e) ($z0 ? $r2 : null);
        this.f31352k = $r4;
        InterfaceC11719g $r5 = getContext();
        Object $r6 = C14258i.m2319a($r5);
        this.f31350e = $r6;
        this.f31348b = null;
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
    public final Throwable m2327a(InterfaceC14270g interfaceC14270g) {
        boolean $z0;
        do {
            Object $r2 = this.f31348b;
            Paint $r3 = C14256g.f31353c;
            if ($r2 != $r3) {
                if ($r2 == null) {
                    return null;
                }
                boolean $z02 = $r2 instanceof Throwable;
                if (!$z02) {
                    String $r7 = "Inconsistent state " + $r2;
                    IllegalStateException $r9 = new IllegalStateException($r7.toString());
                    throw $r9;
                }
                AtomicReferenceFieldUpdater $r4 = f31346c;
                boolean $z03 = $r4.compareAndSet(this, $r2, null);
                if ($z03) {
                    Throwable $r5 = (Throwable) $r2;
                    return $r5;
                }
                String $r72 = "Failed requirement.".toString();
                IllegalArgumentException $r6 = new IllegalArgumentException($r72);
                throw $r6;
            }
            AtomicReferenceFieldUpdater $r42 = f31346c;
            $z0 = $r42.compareAndSet(this, $r3, interfaceC14270g);
        } while (!$z0);
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
    /* renamed from: a */
    public final C14269f m2330a() {
        Object $r1;
        boolean $z0;
        do {
            $r1 = this.f31348b;
            if ($r1 == null) {
                Paint $r2 = C14256g.f31353c;
                this.f31348b = $r2;
                return null;
            }
            boolean $z02 = $r1 instanceof C14269f;
            if (!$z02) {
                String $r6 = "Inconsistent state " + $r1;
                IllegalStateException $r7 = new IllegalStateException($r6.toString());
                throw $r7;
            }
            AtomicReferenceFieldUpdater $r3 = f31346c;
            Paint $r22 = C14256g.f31353c;
            $z0 = $r3.compareAndSet(this, $r1, $r22);
        } while (!$z0);
        C14269f $r4 = (C14269f) $r1;
        return $r4;
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
    public void m2329a(Object obj, Throwable th) {
        boolean $z0 = obj instanceof Edit;
        if ($z0) {
            Edit $r3 = (Edit) obj;
            InterfaceC11767l $r4 = $r3.f31277b;
            $r4.invoke(th);
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
    public final boolean m2328a(C14269f c14269f) {
        Object $r2 = this.f31348b;
        if ($r2 != null) {
            boolean $z0 = $r2 instanceof C14269f;
            return !$z0 || $r2 == c14269f;
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
    /* renamed from: b */
    public final boolean m2326b(Throwable th) {
        while (true) {
            Object $r2 = this.f31348b;
            Paint $r3 = C14256g.f31353c;
            boolean $z0 = Log_OC.append($r2, $r3);
            if ($z0) {
                AtomicReferenceFieldUpdater $r4 = f31346c;
                boolean $z02 = $r4.compareAndSet(this, $r3, th);
                if ($z02) {
                    return true;
                }
            } else {
                boolean $z03 = $r2 instanceof Throwable;
                if ($z03) {
                    return true;
                }
                AtomicReferenceFieldUpdater $r42 = f31346c;
                boolean $z04 = $r42.compareAndSet(this, $r2, null);
                if ($z04) {
                    return false;
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
    /* renamed from: c */
    public Object m2325c() {
        Object $r1 = this.f31351f;
        boolean $z0 = Item.f31289c;
        if ($z0) {
            Paint $r2 = C14256g.f31354f;
            boolean $z02 = $r1 != $r2;
            if (!$z02) {
                AssertionError $r3 = new AssertionError();
                throw $r3;
            }
        }
        Paint $r22 = C14256g.f31354f;
        this.f31351f = $r22;
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
    /* renamed from: e */
    public final C14269f m2324e() {
        Object $r1 = this.f31348b;
        boolean $z0 = $r1 instanceof C14269f;
        if (!$z0) {
            $r1 = null;
        }
        C14269f $r2 = (C14269f) $r1;
        return $r2;
    }

    /* renamed from: g */
    public InterfaceC11714d m2323g() {
        return this;
    }

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
        InterfaceC11739e r1 = this.f31352k;
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
    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        InterfaceC11714d $r2 = this.f31347a;
        InterfaceC11719g $r1 = $r2.getContext();
        return $r1;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
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
    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        boolean $z0;
        InterfaceC11714d $r1 = this.f31347a;
        InterfaceC11719g $r3 = $r1.getContext();
        Object $r4 = AnnotationVisitor.m2405a(obj, null);
        AbstractC14272i $r5 = this.f31349d;
        boolean $z02 = $r5.mo2264a($r3);
        if ($z02) {
            this.f31351f = $r4;
            this.f31384c = 0;
            AbstractC14272i $r52 = this.f31349d;
            $r52.mo2139a($r3, this);
            return;
        }
        boolean $z03 = Item.f31289c;
        C14312w $r6 = C14312w.f31491a;
        AbstractC14271h $r7 = $r6.m2168a();
        boolean $z04 = $r7.m2273l();
        if ($z04) {
            this.f31351f = $r4;
            this.f31384c = 0;
            $r7.m2278b(this);
            return;
        }
        $r7.m2275c(true);
        try {
            InterfaceC11714d $r12 = this.f31347a;
            InterfaceC11719g $r32 = $r12.getContext();
            Object $r42 = C14258i.m2317b($r32, this.f31350e);
            InterfaceC11714d $r13 = this.f31347a;
            $r13.resumeWith(obj);
            C14258i.m2318a($r32, $r42);
            do {
                $z0 = $r7.m2276c();
            } while ($z0);
        } catch (Throwable $r9) {
            try {
                m2308a($r9, (Throwable) null);
            } finally {
                $r7.m2279a(true);
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
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("DispatchedContinuation[");
        AbstractC14272i $r2 = this.f31349d;
        $r1.append($r2);
        $r1.append(", ");
        InterfaceC11714d $r3 = this.f31347a;
        String $r4 = C14300r.m2186a($r3);
        $r1.append($r4);
        $r1.append(']');
        String $r42 = $r1.toString();
        return $r42;
    }
}
