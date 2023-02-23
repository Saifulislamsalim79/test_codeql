package org.org.org.org.android.util.menu;

import e.a.a.a.a.b.b.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: org.org.org.org.android.util.menu.f */
/* loaded from: classes.dex */
public final class EnumC14571f {

    /* renamed from: a */
    public static final EnumC14571f f32271a;

    /* renamed from: b */
    public static final EnumC14571f f32272b;

    /* renamed from: c */
    public static final EnumC14571f f32273c;

    /* renamed from: l */
    public static final C14572i f32274l;

    /* renamed from: p */
    public static final /* synthetic */ EnumC14571f[] f32275p;

    /* renamed from: r */
    public final int f32276r;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EnumC14571f $r1 = new EnumC14571f("PORTRAIT", 0, 0);
        f32271a = $r1;
        EnumC14571f $r12 = new EnumC14571f("LANDSCAPE_90", 1, 1);
        f32273c = $r12;
        EnumC14571f $r13 = new EnumC14571f("LANDSCAPE_270", 2, 3);
        f32272b = $r13;
        EnumC14571f[] $r0 = {$r1, $r12, $r13};
        f32275p = $r0;
        C14572i $r2 = new C14572i(null);
        f32274l = $r2;
    }

    private EnumC14571f(String str, int i, int i2) {
        this.f32276r = i2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14571f valueOf(String str) {
        Enum $r0 = Enum.valueOf(a.class, str);
        EnumC14571f $r2 = (EnumC14571f) $r0;
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
    public static EnumC14571f[] values() {
        EnumC14571f[] $r1 = f32275p;
        Object $r0 = $r1.clone();
        EnumC14571f[] $r12 = (EnumC14571f[]) $r0;
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
    /* renamed from: a */
    public final int m1200a() {
        int i0 = this.f32276r;
        return i0;
    }
}
