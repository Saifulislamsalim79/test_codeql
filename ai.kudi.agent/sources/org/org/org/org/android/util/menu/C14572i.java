package org.org.org.org.android.util.menu;

import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.core.session.EnumC14680c;
/* renamed from: org.org.org.org.android.util.menu.i */
/* loaded from: classes.dex */
public final class C14572i {
    private C14572i() {
    }

    public /* synthetic */ C14572i(DBUtils$1 dBUtils$1) {
        this();
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
    public final EnumC14571f m1199a(int i) {
        if (i >= 0 && 45 >= i) {
            EnumC14571f r1 = EnumC14571f.f32271a;
            return r1;
        } else if (46 <= i && 135 >= i) {
            EnumC14571f r12 = EnumC14571f.f32272b;
            return r12;
        } else if (136 <= i && 225 >= i) {
            EnumC14571f r13 = EnumC14571f.f32271a;
            return r13;
        } else if (226 <= i && 315 >= i) {
            EnumC14571f r14 = EnumC14571f.f32273c;
            return r14;
        } else {
            EnumC14571f r15 = EnumC14571f.f32271a;
            return r15;
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
    public final EnumC14680c m1198a(EnumC14571f enumC14571f) {
        Log_OC.getArray(enumC14571f, "sessionOrientation");
        int $i0 = enumC14571f.ordinal();
        if ($i0 == 0) {
            EnumC14680c r3 = EnumC14680c.f32695d;
            return r3;
        } else if ($i0 == 1) {
            EnumC14680c r32 = EnumC14680c.f32694c;
            return r32;
        } else if ($i0 == 2) {
            EnumC14680c r33 = EnumC14680c.f32693b;
            return r33;
        } else {
            Throwable r4 = new NoWhenBranchMatchedException();
            Throwable r5 = r4;
            throw r5;
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
    public final EnumC14571f m1197b(int i) {
        if (i != 0) {
            if (i == 1) {
                EnumC14571f r1 = EnumC14571f.f32273c;
                return r1;
            } else if (i != 2) {
                if (i != 3) {
                    EnumC14571f r12 = EnumC14571f.f32271a;
                    return r12;
                }
                EnumC14571f r13 = EnumC14571f.f32272b;
                return r13;
            }
        }
        EnumC14571f r14 = EnumC14571f.f32271a;
        return r14;
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
    public final EnumC14571f m1196c(int i) {
        EnumC14571f $r1 = EnumC14571f.f32271a;
        int $i1 = $r1.m1200a();
        if (i == $i1) {
            return $r1;
        }
        EnumC14571f $r2 = EnumC14571f.f32273c;
        int $i12 = $r2.m1200a();
        if (i != $i12) {
            $r2 = EnumC14571f.f32272b;
            int $i13 = $r2.m1200a();
            if (i != $i13) {
                return $r1;
            }
        }
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
    /* renamed from: d */
    public final EnumC14570c m1195d(EnumC14571f enumC14571f) {
        Log_OC.getArray(enumC14571f, "sessionOrientation");
        EnumC14571f $r2 = EnumC14571f.f32271a;
        if (enumC14571f == $r2) {
            EnumC14570c r3 = EnumC14570c.f32268a;
            return r3;
        }
        EnumC14570c r32 = EnumC14570c.f32270f;
        return r32;
    }
}
