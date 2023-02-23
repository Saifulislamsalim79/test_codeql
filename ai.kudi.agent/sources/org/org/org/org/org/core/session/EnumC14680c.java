package org.org.org.org.org.core.session;

import e.a.a.a.c.o.b.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: org.org.org.org.org.core.session.c */
/* loaded from: classes.dex */
public final class EnumC14680c {

    /* renamed from: b */
    public static final EnumC14680c f32693b;

    /* renamed from: c */
    public static final EnumC14680c f32694c;

    /* renamed from: d */
    public static final EnumC14680c f32695d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC14680c[] f32696e;

    /* renamed from: a */
    public final int f32697a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EnumC14680c $r1 = new EnumC14680c("DEGREES_0", 0, 0);
        f32695d = $r1;
        EnumC14680c $r12 = new EnumC14680c("DEGREES_90", 1, 90);
        f32694c = $r12;
        EnumC14680c $r13 = new EnumC14680c("DEGREES_270", 3, 270);
        f32693b = $r13;
        EnumC14680c[] $r0 = {$r1, $r12, new EnumC14680c("DEGREES_180", 2, 180), $r13};
        f32696e = $r0;
    }

    private EnumC14680c(String str, int i, int i2) {
        this.f32697a = i2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14680c valueOf(String str) {
        Enum $r0 = Enum.valueOf(a.class, str);
        EnumC14680c $r2 = (EnumC14680c) $r0;
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
    public static EnumC14680c[] values() {
        EnumC14680c[] $r1 = f32696e;
        Object $r0 = $r1.clone();
        EnumC14680c[] $r12 = (EnumC14680c[]) $r0;
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
    public final int m780a() {
        int i0 = this.f32697a;
        return i0;
    }
}
