package org.org.org.org.org.p602ui.asm;

import android.graphics.Rect;
import android.view.View;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.org.ui.asm.Label */
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: a */
    public final String f32870a;

    /* renamed from: b */
    public final String f32871b;

    /* renamed from: c */
    public final View f32872c;

    /* renamed from: f */
    public final Rect f32873f;

    /* renamed from: g */
    public final String f32874g;

    /* renamed from: h */
    public final Rect f32875h;

    /* renamed from: j */
    public final int f32876j;

    /* renamed from: k */
    public final boolean f32877k;

    public Label(Rect rect, Rect rect2, int i, View view, String str, String str2, String str3, boolean z) {
        Log_OC.getArray(rect, "fullViewRect");
        Log_OC.getArray(rect2, "visibleViewRect");
        Log_OC.getArray(view, "view");
        Log_OC.getArray(str, "hash");
        Log_OC.getArray(str3, "scrollableParentHash");
        this.f32873f = rect;
        this.f32875h = rect2;
        this.f32876j = i;
        this.f32872c = view;
        this.f32871b = str;
        this.f32874g = str2;
        this.f32870a = str3;
        this.f32877k = z;
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
    public final Rect m522a() {
        Rect r1 = this.f32875h;
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
    /* renamed from: b */
    public final String m521b() {
        String r1 = this.f32874g;
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
    /* renamed from: c */
    public final String m520c() {
        String r1 = this.f32871b;
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
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Label;
            if ($z0) {
                Label $r2 = (Label) obj;
                Rect $r3 = this.f32873f;
                Rect $r4 = $r2.f32873f;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    Rect $r32 = this.f32875h;
                    Rect $r42 = $r2.f32875h;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        int $i0 = this.f32876j;
                        int $i1 = $r2.f32876j;
                        if ($i0 == $i1) {
                            View $r5 = this.f32872c;
                            View $r6 = $r2.f32872c;
                            boolean $z04 = Log_OC.append($r5, $r6);
                            if ($z04) {
                                String $r7 = this.f32871b;
                                String $r8 = $r2.f32871b;
                                boolean $z05 = Log_OC.append($r7, $r8);
                                if ($z05) {
                                    String $r72 = this.f32874g;
                                    String $r82 = $r2.f32874g;
                                    boolean $z06 = Log_OC.append($r72, $r82);
                                    if ($z06) {
                                        String $r73 = this.f32870a;
                                        String $r83 = $r2.f32870a;
                                        boolean $z07 = Log_OC.append($r73, $r83);
                                        if ($z07) {
                                            boolean $z08 = this.f32877k;
                                            boolean $z1 = $r2.f32877k;
                                            return $z08 == $z1;
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
    public final String getCount() {
        String r1 = this.f32870a;
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
    public final int getIcon() {
        int i0 = this.f32876j;
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
    public final View getName() {
        View r1 = this.f32872c;
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
    public final Rect getValue() {
        Rect r1 = this.f32873f;
        return r1;
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
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Rect $r1 = this.f32873f;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        Rect $r12 = this.f32875h;
        int $i2 = $r12 != null ? $r12.hashCode() : 0;
        int $i22 = this.f32876j;
        int $i13 = ((($i12 + $i2) * 31) + $i22) * 31;
        View $r2 = this.f32872c;
        int $i23 = $r2 != null ? $r2.hashCode() : 0;
        int $i14 = ($i13 + $i23) * 31;
        String $r3 = this.f32871b;
        int $i24 = $r3 != null ? $r3.hashCode() : 0;
        int $i15 = ($i14 + $i24) * 31;
        String $r32 = this.f32874g;
        int $i25 = $r32 != null ? $r32.hashCode() : 0;
        int $i16 = ($i15 + $i25) * 31;
        String $r33 = this.f32870a;
        int $i0 = $r33 != null ? $r33.hashCode() : 0;
        int $i02 = ($i16 + $i0) * 31;
        boolean $z0 = this.f32877k;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i17 = i;
        return $i02 + $i17;
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
    public final boolean m519i() {
        boolean z0 = this.f32877k;
        return z0;
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
        $r2.append("RenderingItem(fullViewRect=");
        Rect $r3 = this.f32873f;
        $r2.append($r3);
        $r2.append(", visibleViewRect=");
        Rect $r32 = this.f32875h;
        $r2.append($r32);
        $r2.append(", treeDepth=");
        int $i0 = this.f32876j;
        $r2.append($i0);
        $r2.append(", view=");
        View $r4 = this.f32872c;
        $r2.append($r4);
        $r2.append(", hash=");
        String $r1 = this.f32871b;
        $r2.append($r1);
        $r2.append(", parentHash=");
        String $r12 = this.f32874g;
        $r2.append($r12);
        $r2.append(", scrollableParentHash=");
        String $r13 = this.f32870a;
        $r2.append($r13);
        $r2.append(", isRecyclerViewItem=");
        boolean $z0 = this.f32877k;
        $r2.append($z0);
        $r2.append(")");
        String $r14 = $r2.toString();
        return $r14;
    }
}
