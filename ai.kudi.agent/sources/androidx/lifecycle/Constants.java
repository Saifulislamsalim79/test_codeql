package androidx.lifecycle;
/* compiled from: Lifecycle.java */
/* loaded from: classes.dex */
/* synthetic */ class Constants {

    /* renamed from: M */
    static final /* synthetic */ int[] f4693M;

    /* renamed from: c */
    static final /* synthetic */ int[] f4694c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Scope[] $r12 = Scope.values();
        int $i0 = $r12.length;
        int[] $r13 = new int[$i0];
        f4693M = $r13;
        try {
            Scope $r14 = Scope.ON_CREATE;
            int $i02 = $r14.ordinal();
            $r13[$i02] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            int[] $r132 = f4693M;
            Scope $r142 = Scope.ON_STOP;
            int $i03 = $r142.ordinal();
            $r132[$i03] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            int[] $r133 = f4693M;
            Scope $r143 = Scope.ON_START;
            int $i04 = $r143.ordinal();
            $r133[$i04] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            int[] $r134 = f4693M;
            Scope $r144 = Scope.ON_PAUSE;
            int $i05 = $r144.ordinal();
            $r134[$i05] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            int[] $r135 = f4693M;
            Scope $r145 = Scope.ON_RESUME;
            int $i06 = $r145.ordinal();
            $r135[$i06] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            int[] $r136 = f4693M;
            Scope $r146 = Scope.ON_DESTROY;
            int $i07 = $r146.ordinal();
            $r136[$i07] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            int[] $r137 = f4693M;
            Scope $r147 = Scope.ON_ANY;
            int $i08 = $r147.ordinal();
            $r137[$i08] = 7;
        } catch (NoSuchFieldError e7) {
        }
        Priority[] $r15 = Priority.values();
        int $i09 = $r15.length;
        int[] $r138 = new int[$i09];
        f4694c = $r138;
        try {
            Priority $r16 = Priority.f4721I;
            int $i010 = $r16.ordinal();
            $r138[$i010] = 1;
        } catch (NoSuchFieldError e8) {
        }
        try {
            int[] $r139 = f4694c;
            Priority $r162 = Priority.f4718F;
            int $i011 = $r162.ordinal();
            $r139[$i011] = 2;
        } catch (NoSuchFieldError e9) {
        }
        try {
            int[] $r1310 = f4694c;
            Priority $r163 = Priority.f4719G;
            int $i012 = $r163.ordinal();
            $r1310[$i012] = 3;
        } catch (NoSuchFieldError e10) {
        }
        try {
            int[] $r1311 = f4694c;
            Priority $r164 = Priority.f4717C;
            int $i013 = $r164.ordinal();
            $r1311[$i013] = 4;
        } catch (NoSuchFieldError e11) {
        }
        try {
            int[] $r1312 = f4694c;
            Priority $r165 = Priority.f4720H;
            int $i014 = $r165.ordinal();
            $r1312[$i014] = 5;
        } catch (NoSuchFieldError e12) {
        }
    }
}
