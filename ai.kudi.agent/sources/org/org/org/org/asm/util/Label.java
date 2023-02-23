package org.org.org.org.asm.util;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: i */
    public static final Path f32386i;

    /* renamed from: a */
    public final double f32387a;

    /* renamed from: b */
    public final double f32388b;

    /* renamed from: c */
    public final double f32389c;

    /* renamed from: d */
    public final double f32390d;

    /* renamed from: g */
    public final double f32391g;

    /* renamed from: v */
    public final double f32392v;

    /* renamed from: w */
    public final double f32393w;

    /* renamed from: z */
    public final double f32394z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Path $r0 = new Path(null);
        f32386i = $r0;
    }

    public Label(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f32394z = d;
        this.f32393w = d2;
        this.f32387a = d3;
        this.f32389c = d4;
        this.f32388b = d5;
        this.f32390d = d6;
        this.f32391g = d7;
        this.f32392v = d8;
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
    public final Rect m1048a() {
        double $d0 = this.f32388b;
        int $i0 = (int) $d0;
        double $d02 = this.f32390d;
        int $i1 = (int) $d02;
        double $d03 = this.f32391g;
        int $i2 = (int) $d03;
        double $d04 = this.f32392v;
        int $i3 = (int) $d04;
        Rect $r1 = new Rect($i0, $i1, $i2, $i3);
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
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Label;
            if ($z0) {
                Label $r2 = (Label) obj;
                double $d0 = this.f32394z;
                double $d1 = $r2.f32394z;
                int $i0 = Double.compare($d0, $d1);
                if ($i0 == 0) {
                    double $d02 = this.f32393w;
                    double $d12 = $r2.f32393w;
                    int $i02 = Double.compare($d02, $d12);
                    if ($i02 == 0) {
                        double $d03 = this.f32387a;
                        double $d13 = $r2.f32387a;
                        int $i03 = Double.compare($d03, $d13);
                        if ($i03 == 0) {
                            double $d04 = this.f32389c;
                            double $d14 = $r2.f32389c;
                            int $i04 = Double.compare($d04, $d14);
                            if ($i04 == 0) {
                                double $d05 = this.f32388b;
                                double $d15 = $r2.f32388b;
                                int $i05 = Double.compare($d05, $d15);
                                if ($i05 == 0) {
                                    double $d06 = this.f32390d;
                                    double $d16 = $r2.f32390d;
                                    int $i06 = Double.compare($d06, $d16);
                                    if ($i06 == 0) {
                                        double $d07 = this.f32391g;
                                        double $d17 = $r2.f32391g;
                                        int $i07 = Double.compare($d07, $d17);
                                        if ($i07 == 0) {
                                            double $d08 = this.f32392v;
                                            double $d18 = $r2.f32392v;
                                            int $i08 = Double.compare($d08, $d18);
                                            return $i08 == 0;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
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
    public int hashCode() {
        double $d0 = this.f32394z;
        int $i0 = Tags.append($d0);
        double $d02 = this.f32393w;
        int $i1 = Tags.append($d02);
        double $d03 = this.f32387a;
        int $i12 = Tags.append($d03);
        double $d04 = this.f32389c;
        int $i13 = Tags.append($d04);
        double $d05 = this.f32388b;
        int $i14 = Tags.append($d05);
        double $d06 = this.f32390d;
        int $i15 = Tags.append($d06);
        double $d07 = this.f32391g;
        int $i16 = Tags.append($d07);
        double $d08 = this.f32392v;
        int $i17 = Tags.append($d08);
        return ((((((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17;
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
        StringBuilder $r2 = new StringBuilder();
        $r2.append("BoundingClientRect(x=");
        double $d0 = this.f32394z;
        $r2.append($d0);
        $r2.append(", y=");
        double $d02 = this.f32393w;
        $r2.append($d02);
        $r2.append(", width=");
        double $d03 = this.f32387a;
        $r2.append($d03);
        $r2.append(", height=");
        double $d04 = this.f32389c;
        $r2.append($d04);
        $r2.append(", left=");
        double $d05 = this.f32388b;
        $r2.append($d05);
        $r2.append(", top=");
        double $d06 = this.f32390d;
        $r2.append($d06);
        $r2.append(", right=");
        double $d07 = this.f32391g;
        $r2.append($d07);
        $r2.append(", bottom=");
        double $d08 = this.f32392v;
        $r2.append($d08);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
