package org.org.org.org.android.util.asm;

import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.android.util.asm.m */
/* loaded from: classes.dex */
public final class C14547m extends org.org.org.org.android.model.data.Item implements org.org.org.org.org.common.data.Item {

    /* renamed from: d */
    public static final ByteVector f32147d;

    /* renamed from: a */
    public final String f32148a;

    /* renamed from: b */
    public final C14544h f32149b;

    /* renamed from: c */
    public final C14545i f32150c;

    /* renamed from: e */
    public final String f32151e;

    /* renamed from: f */
    public final boolean f32152f;

    /* renamed from: g */
    public final String f32153g;

    /* renamed from: h */
    public final String f32154h;

    /* renamed from: i */
    public final int f32155i;

    /* renamed from: k */
    public final Float f32156k;

    /* renamed from: l */
    public final List<String> f32157l;

    /* renamed from: q */
    public final String f32158q;

    /* renamed from: s */
    public final Float f32159s;

    /* renamed from: u */
    public final C14542f f32160u;

    /* renamed from: x */
    public final Float f32161x;

    /* renamed from: y */
    public final Float f32162y;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        ByteVector $r0 = new ByteVector(null);
        f32147d = $r0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14547m(String str, boolean z, C14544h c14544h, C14542f c14542f, List list, String str2, int i, String str3, Float f, C14545i c14545i, Float f2, Float f3, String str4, Float f4, String str5, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(str, "type");
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        Log_OC.getArray(str2, "gestureId");
        Log_OC.getArray(item, "eventBase");
        this.f32151e = str;
        this.f32152f = z;
        this.f32149b = c14544h;
        this.f32160u = c14542f;
        this.f32157l = list;
        this.f32153g = str2;
        this.f32155i = i;
        this.f32158q = str3;
        this.f32159s = f;
        this.f32150c = c14545i;
        this.f32161x = f2;
        this.f32162y = f3;
        this.f32154h = str4;
        this.f32156k = f4;
        this.f32148a = str5;
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
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14547m(java.lang.String r18, boolean r19, org.org.org.org.android.util.asm.C14544h r20, org.org.org.org.android.util.asm.C14542f r21, java.util.List r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.Float r26, org.org.org.org.android.util.asm.C14545i r27, java.lang.Float r28, java.lang.Float r29, java.lang.String r30, java.lang.Float r31, java.lang.String r32, org.org.org.org.android.model.data.Item r33, int r34, kotlin.p483e0.p485d.DBUtils$1 r35) {
        /*
            r17 = this;
            r8 = r34 & 32
            if (r8 == 0) goto Lb
            org.org.org.org.asm.graph.i r9 = org.org.org.org.asm.graph.C14601i.f32355b
            java.lang.String r23 = r9.m1104a()
            goto Lb
        Lb:
            r8 = r34 & 64
            if (r8 == 0) goto L12
            r24 = 1
            goto L12
        L12:
            r0 = r34
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L1b
            r25 = 0
            goto L1b
        L1b:
            r0 = r34
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L24
            r26 = 0
            goto L24
        L24:
            r0 = r34
            r8 = r0 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L2d
            r27 = 0
            goto L2d
        L2d:
            r0 = r34
            r8 = r0 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L36
            r28 = 0
            goto L36
        L36:
            r0 = r34
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L3f
            r29 = 0
            goto L3f
        L3f:
            r0 = r34
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L48
            r30 = 0
            goto L48
        L48:
            r0 = r34
            r8 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L51
            r31 = 0
            goto L51
        L51:
            r0 = r34
            r8 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L5a
            r32 = 0
            goto L5a
        L5a:
            r10 = 32768(0x8000, float:4.5918E-41)
            r0 = r34
            r0 = r0 & r10
            r34 = r0
            if (r34 == 0) goto L7c
            org.org.org.org.android.model.data.Item r33 = new org.org.org.org.android.model.data.Item
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = 15
            r16 = 0
            r0 = r33
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r10
            r7 = r16
            r0.<init>(r1, r2, r4, r5, r6, r7)
            goto L7c
        L7c:
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.C14547m.<init>(java.lang.String, boolean, org.org.org.org.android.util.asm.h, org.org.org.org.android.util.asm.f, java.util.List, java.lang.String, int, java.lang.String, java.lang.Float, org.org.org.org.android.util.asm.i, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Float, java.lang.String, org.org.org.org.android.model.data.Item, int, kotlin.e0.d.DBUtils$1):void");
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
    public final C14545i m1297a() {
        C14545i r1 = this.f32150c;
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
    @Override // org.org.org.org.org.common.data.Item
    /* renamed from: a */
    public void mo936a(double d, double d2) {
        C14544h $r1 = this.f32149b;
        $r1.m1303a(d, d2);
        C14542f $r2 = this.f32160u;
        $r2.m1309a(d, d2);
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
    public final int m1296b() {
        int i0 = this.f32155i;
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
    /* renamed from: c */
    public final C14544h m1295c() {
        C14544h r1 = this.f32149b;
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
    /* renamed from: d */
    public final Float m1294d() {
        Float r1 = this.f32159s;
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
    /* renamed from: e */
    public final String m1293e() {
        String r1 = this.f32153g;
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
    @Override // org.org.org.org.android.model.data.Item, org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32153g;
        $r1.put("gesture_id", $r2);
        String $r22 = this.f32151e;
        $r1.put("type", $r22);
        String $r23 = this.f32158q;
        $r1.put("name", $r23);
        boolean $z0 = this.f32152f;
        $r1.put("is_final", $z0);
        C14544h $r3 = this.f32149b;
        JSONObject $r4 = $r3.equals();
        $r1.put("frame", $r4);
        C14542f $r5 = this.f32160u;
        JSONObject $r42 = $r5.equals();
        $r1.put("location", $r42);
        int $i0 = this.f32155i;
        $r1.put("taps", $i0);
        List $r6 = this.f32157l;
        JSONArray $r7 = Collection.add($r6);
        $r1.put("touches", $r7);
        Float $r8 = this.f32159s;
        $r1.put("velocity", $r8);
        C14545i $r9 = this.f32150c;
        JSONObject $r43 = $r9 != null ? $r9.equals() : null;
        $r1.put("velocity_vector", $r43);
        Float $r82 = this.f32161x;
        $r1.put("init_rotation", $r82);
        Float $r83 = this.f32162y;
        $r1.put("rotation", $r83);
        String $r24 = this.f32154h;
        $r1.put("direction", $r24);
        Float $r84 = this.f32156k;
        $r1.put("scale", $r84);
        String $r25 = this.f32148a;
        $r1.put("edge", $r25);
        update($r1);
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
    /* renamed from: f */
    public final C14542f m1292f() {
        C14542f r1 = this.f32160u;
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
    @Override // org.org.org.org.org.common.data.Item
    public long getId() {
        long $l0 = getName();
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTitle() {
        String r1 = this.f32151e;
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
    public final Float getY() {
        Float r1 = this.f32162y;
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
    /* renamed from: i */
    public final Float m1291i() {
        Float r1 = this.f32156k;
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
    public final Float isVisible() {
        Float r1 = this.f32161x;
        return r1;
    }
}
