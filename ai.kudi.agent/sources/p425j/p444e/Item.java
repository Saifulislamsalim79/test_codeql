package p425j.p444e;

import java.util.concurrent.TimeUnit;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.showcaseview.C11693h;
/* compiled from: Scheduler.java */
/* renamed from: j.e.Item */
/* loaded from: classes.dex */
public abstract class Item {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        TimeUnit $r0 = TimeUnit.MINUTES;
        Long $r1 = Long.getLong("rx2.scheduler.drift-tolerance", 15L);
        long $l0 = $r1.longValue();
        $r0.toNanos($l0);
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
    public FavoritesArrayAdapter m11249a(Runnable runnable, long j, TimeUnit timeUnit) {
        v$b $r4 = m11250a();
        Runnable $r3 = C11693h.m10460a(runnable);
        Runnable r5 = new v$a($r3, $r4);
        Runnable $r32 = r5;
        $r4.mo10447c($r32, j, timeUnit);
        FavoritesArrayAdapter r6 = (FavoritesArrayAdapter) r5;
        return r6;
    }

    /* renamed from: a */
    public abstract v$b m11250a();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public FavoritesArrayAdapter toString(Runnable runnable) {
        TimeUnit $r1 = TimeUnit.NANOSECONDS;
        FavoritesArrayAdapter $r2 = m11249a(runnable, 0L, $r1);
        return $r2;
    }
}
