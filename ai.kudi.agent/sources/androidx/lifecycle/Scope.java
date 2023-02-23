package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lifecycle.java */
/* loaded from: classes.dex */
public final class Scope {
    private static final /* synthetic */ Scope[] $VALUES;
    public static final Scope ON_ANY;
    public static final Scope ON_CREATE;
    public static final Scope ON_DESTROY;
    public static final Scope ON_PAUSE;
    public static final Scope ON_RESUME;
    public static final Scope ON_START;
    public static final Scope ON_STOP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Scope $r1 = new Scope("ON_CREATE", 0);
        ON_CREATE = $r1;
        Scope $r12 = new Scope("ON_START", 1);
        ON_START = $r12;
        Scope $r13 = new Scope("ON_RESUME", 2);
        ON_RESUME = $r13;
        Scope $r14 = new Scope("ON_PAUSE", 3);
        ON_PAUSE = $r14;
        Scope $r15 = new Scope("ON_STOP", 4);
        ON_STOP = $r15;
        Scope $r16 = new Scope("ON_DESTROY", 5);
        ON_DESTROY = $r16;
        Scope $r17 = new Scope("ON_ANY", 6);
        ON_ANY = $r17;
        Scope $r0 = ON_CREATE;
        Scope $r02 = ON_START;
        Scope $r03 = ON_RESUME;
        Scope $r04 = ON_PAUSE;
        Scope $r05 = ON_STOP;
        Scope $r06 = ON_DESTROY;
        Scope[] $r2 = {$r0, $r02, $r03, $r04, $r05, $r06, $r17};
        $VALUES = $r2;
    }

    private Scope(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Scope create(Priority priority) {
        int[] $r1 = Constants.f4694c;
        int $i0 = $r1[priority.ordinal()];
        if ($i0 == 1) {
            Scope r2 = ON_START;
            return r2;
        } else if ($i0 == 2) {
            Scope r22 = ON_RESUME;
            return r22;
        } else if ($i0 != 5) {
            return null;
        } else {
            Scope r23 = ON_CREATE;
            return r23;
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
    public static Scope getParent(Priority priority) {
        int[] $r1 = Constants.f4694c;
        int $i0 = $r1[priority.ordinal()];
        if ($i0 == 1) {
            Scope r2 = ON_DESTROY;
            return r2;
        } else if ($i0 == 2) {
            Scope r22 = ON_STOP;
            return r22;
        } else if ($i0 != 3) {
            return null;
        } else {
            Scope r23 = ON_PAUSE;
            return r23;
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
    public static Scope valueOf(Priority priority) {
        int[] $r1 = Constants.f4694c;
        int $i0 = $r1[priority.ordinal()];
        if ($i0 == 1) {
            Scope r2 = ON_CREATE;
            return r2;
        } else if ($i0 == 2) {
            Scope r22 = ON_START;
            return r22;
        } else if ($i0 != 3) {
            return null;
        } else {
            Scope r23 = ON_RESUME;
            return r23;
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
    public static Scope valueOf(String str) {
        Enum $r0 = Enum.valueOf(AbstractC1565i.b.class, str);
        Scope $r2 = (Scope) $r0;
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
    public static Scope[] values() {
        Scope[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        Scope[] $r12 = (Scope[]) $r0;
        return $r12;
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
    public Priority m35568b() {
        int[] $r1 = Constants.f4693M;
        int $i0 = ordinal();
        switch ($r1[$i0]) {
            case 1:
            case 2:
                Priority r5 = Priority.f4721I;
                return r5;
            case 3:
            case 4:
                Priority r52 = Priority.f4718F;
                return r52;
            case 5:
                Priority r53 = Priority.f4719G;
                return r53;
            case 6:
                Priority r54 = Priority.f4717C;
                return r54;
            default:
                String $r4 = this + " has no target state";
                IllegalArgumentException $r2 = new IllegalArgumentException($r4);
                throw $r2;
        }
    }
}
