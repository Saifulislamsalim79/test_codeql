package org.org.org.org.xml.core.util;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Label implements Object {

    /* renamed from: k */
    public static final C14739e f32951k;

    /* renamed from: a */
    public final String f32952a;

    /* renamed from: b */
    public final String f32953b;

    /* renamed from: c */
    public final String f32954c;

    /* renamed from: f */
    public final boolean f32955f;

    /* renamed from: g */
    public final int f32956g;

    /* renamed from: h */
    public final String f32957h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14739e $r0 = new C14739e(null);
        f32951k = $r0;
    }

    public Label(String str, int i, boolean z, String str2, String str3, String str4) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "visitorId");
        Log_OC.getArray(str3, "writerHost");
        Log_OC.getArray(str4, "group");
        this.f32957h = str;
        this.f32956g = i;
        this.f32955f = z;
        this.f32953b = str2;
        this.f32954c = str3;
        this.f32952a = str4;
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
    public final String m448a() {
        String r1 = this.f32957h;
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
    public final String m447b() {
        String r1 = this.f32953b;
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
    public final int m446c() {
        int i0 = this.f32956g;
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
    /* renamed from: d */
    public final boolean m445d() {
        boolean z0 = this.f32955f;
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
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32957h;
        $r1.put("SESSION_ID", $r2);
        int $i0 = this.f32956g;
        $r1.put("RECORD_INDEX", $i0);
        String $r22 = this.f32953b;
        $r1.put("VISITOR_ID", $r22);
        boolean $z0 = this.f32955f;
        $r1.put("MOBILE_DATA", $z0);
        String $r23 = this.f32954c;
        $r1.put("WRITER_HOST", $r23);
        String $r24 = this.f32952a;
        $r1.put("GROUP", $r24);
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
                String $r3 = this.f32957h;
                String $r4 = $r2.f32957h;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    int $i0 = this.f32956g;
                    int $i1 = $r2.f32956g;
                    if ($i0 == $i1) {
                        boolean $z03 = this.f32955f;
                        boolean $z1 = $r2.f32955f;
                        if ($z03 == $z1) {
                            String $r32 = this.f32953b;
                            String $r42 = $r2.f32953b;
                            boolean $z04 = Log_OC.append($r32, $r42);
                            if ($z04) {
                                String $r33 = this.f32954c;
                                String $r43 = $r2.f32954c;
                                boolean $z05 = Log_OC.append($r33, $r43);
                                if ($z05) {
                                    String $r34 = this.f32952a;
                                    String $r44 = $r2.f32952a;
                                    boolean $z06 = Log_OC.append($r34, $r44);
                                    return $z06;
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
    public final String getColor() {
        String r1 = this.f32952a;
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
    public final String getName() {
        String r1 = this.f32954c;
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
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.f32957h;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i2 = this.f32956g;
        int $i12 = (($i1 * 31) + $i2) * 31;
        boolean $z0 = this.f32955f;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i22 = i;
        int $i13 = ($i12 + $i22) * 31;
        String $r12 = this.f32953b;
        int $i23 = $r12 != null ? $r12.hashCode() : 0;
        int $i14 = ($i13 + $i23) * 31;
        String $r13 = this.f32954c;
        int $i24 = $r13 != null ? $r13.hashCode() : 0;
        int $i15 = ($i14 + $i24) * 31;
        String $r14 = this.f32952a;
        int $i0 = $r14 != null ? $r14.hashCode() : 0;
        return $i15 + $i0;
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
        $r2.append("RecordJobData(sessionId=");
        String $r1 = this.f32957h;
        $r2.append($r1);
        $r2.append(", recordIndex=");
        int $i0 = this.f32956g;
        $r2.append($i0);
        $r2.append(", mobileData=");
        boolean $z0 = this.f32955f;
        $r2.append($z0);
        $r2.append(", visitorId=");
        String $r12 = this.f32953b;
        $r2.append($r12);
        $r2.append(", writerHost=");
        String $r13 = this.f32954c;
        $r2.append($r13);
        $r2.append(", group=");
        String $r14 = this.f32952a;
        $r2.append($r14);
        $r2.append(")");
        String $r15 = $r2.toString();
        return $r15;
    }
}
