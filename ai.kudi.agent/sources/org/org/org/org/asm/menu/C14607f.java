package org.org.org.org.asm.menu;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: org.org.org.org.asm.menu.f */
/* loaded from: classes.dex */
public final class C14607f {

    /* renamed from: c */
    public static final C14607f f32363c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14607f $r0 = new C14607f();
        f32363c = $r0;
    }

    private C14607f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0029 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONArray m1085a(java.lang.Object r21) throws org.json.JSONException {
        /*
            r20 = this;
            r0 = r21
            java.lang.Class r2 = r0.getClass()
            boolean r3 = r2.isArray()
            if (r3 == 0) goto L46
            org.json.JSONArray r4 = new org.json.JSONArray
            r5 = r4
            r4.<init>()
            r0 = r21
            int r6 = java.lang.reflect.Array.getLength(r0)
            r8 = 0
            kotlin.i0.e r7 = kotlin.p491i0.C11839f.m10272j(r8, r6)
            r10 = r7
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r9 = r10
            java.util.Iterator r11 = r9.iterator()
        L25:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L45
            r13 = r11
            kotlin.z.l0 r13 = (kotlin.p557z.AbstractC13711l0) r13
            r12 = r13
            int r6 = r12.mo4069b()
            org.org.org.org.asm.menu.f r20 = org.org.org.org.asm.menu.C14607f.f32363c
            r0 = r21
            java.lang.Object r14 = java.lang.reflect.Array.get(r0, r6)
            r0 = r20
            java.lang.Object r14 = r0.get(r14)
            r5.put(r14)
            goto L25
        L45:
            return r5
        L46:
            org.json.JSONException r15 = new org.json.JSONException
            java.lang.StringBuilder r16 = new java.lang.StringBuilder
            r17 = r16
            r0 = r16
            r0.<init>()
            java.lang.String r18 = "Not a primitive array: "
            r0 = r17
            r1 = r18
            r0.append(r1)
            r0 = r21
            java.lang.Class r2 = r0.getClass()
            r0 = r17
            r0.append(r2)
            r0 = r17
            java.lang.String r19 = r0.toString()
            r0 = r19
            r15.<init>(r0)
            goto L71
        L71:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.menu.C14607f.m1085a(java.lang.Object):org.json.JSONArray");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final java.lang.Object get(java.lang.Object $r2) {
        boolean $z0;
        java.lang.Object r10;
        java.lang.Object $r3;
        java.lang.Object $r6;
        if ($r2 == null) {
            return JSONObject.NULL;
        }
        boolean $z02 = $r2 instanceof JSONArray;
        if ($z02) {
            return $r2;
        }
        boolean $z03 = $r2 instanceof JSONObject;
        if ($z03) {
            return $r2;
        }
        java.lang.Object $r32 = JSONObject.NULL;
        try {
            boolean $z04 = Log_OC.append($r2, $r32);
            if ($z04) {
                return $r2;
            }
            boolean $z05 = $r2 instanceof Collection;
            if ($z05) {
                $r3 = $r6;
                Collection $r4 = (Collection) $r2;
                $r6 = new JSONArray($r4);
            } else {
                Class $r5 = $r2.getClass();
                boolean $z06 = $r5.isArray();
                if ($z06) {
                    JSONArray $r62 = m1085a($r2);
                    return $r62;
                }
                boolean $z07 = $r2 instanceof Map;
                if (!$z07) {
                    boolean $z08 = $r2 instanceof Boolean;
                    if ($z08) {
                        return $r2;
                    }
                    boolean $z09 = $r2 instanceof Byte;
                    if ($z09) {
                        return $r2;
                    }
                    boolean $z010 = $r2 instanceof Character;
                    if ($z010) {
                        return $r2;
                    }
                    boolean $z011 = $r2 instanceof Double;
                    if ($z011) {
                        return $r2;
                    }
                    boolean $z012 = $r2 instanceof Float;
                    if ($z012) {
                        return $r2;
                    }
                    boolean $z013 = $r2 instanceof Integer;
                    if ($z013) {
                        return $r2;
                    }
                    boolean $z014 = $r2 instanceof Long;
                    if ($z014) {
                        return $r2;
                    }
                    boolean $z015 = $r2 instanceof Short;
                    if ($z015) {
                        return $r2;
                    }
                    boolean $z016 = $r2 instanceof String;
                    if ($z016) {
                        return $r2;
                    }
                    Class $r52 = $r2.getClass();
                    Package $r8 = $r52.getPackage();
                    Log_OC.append($r8);
                    String $r9 = $r8.getName();
                    Log_OC.loadImage($r9, "any.javaClass.getPackage()!!.name");
                    $z0 = C13276s.m5447E($r9, "java.", false, 2, null);
                    if ($z0) {
                        return $r2.toString();
                    }
                    return null;
                }
                $r3 = r10;
                Map $r7 = (Map) $r2;
                r10 = new JSONObject($r7);
            }
            return $r3;
        } catch (Exception e) {
            return null;
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
    /* JADX WARN: Incorrect condition in loop: B:5:0x001a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m1086a(android.os.Bundle r22) {
        /*
            r21 = this;
            if (r22 == 0) goto L9d
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0 = r22
            java.util.Set r3 = r0.keySet()
            java.lang.String r4 = "bundle.keySet()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r3, r4)
            java.util.Iterator r5 = r3.iterator()
        L16:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9c
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            r8 = r9
            org.org.org.org.asm.menu.f r21 = org.org.org.org.asm.menu.C14607f.f32363c
            r0 = r22
            java.lang.Object r7 = r0.get(r8)     // Catch: org.json.JSONException -> L36
            r0 = r21
            java.lang.Object r7 = r0.get(r7)     // Catch: org.json.JSONException -> L36
            r2.put(r8, r7)     // Catch: org.json.JSONException -> L36
            goto L16
        L36:
            r10 = move-exception
            org.org.org.org.asm.parser.System r11 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r12 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.JSON
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r13 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.WARN
            r15 = 1
            org.org.org.org.asm.parser.TopLevel$NativeErrors r14 = r11.get(r12, r15, r13)
            int r16 = r14.ordinal()
            if (r16 == 0) goto L49
            goto L16
        L49:
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r0 = r17
            r0.<init>()
            java.lang.StringBuilder r18 = new java.lang.StringBuilder
            r0 = r18
            r0.<init>()
            java.lang.String r4 = "bundleToJson(): exception = "
            r0 = r18
            r0.append(r4)
            r15 = 0
            r19 = 2
            r20 = 0
            r0 = r19
            r1 = r20
            java.lang.String r8 = org.org.org.org.asm.parser.Log.get(r10, r15, r0, r1)
            r0 = r18
            r0.append(r8)
            r0 = r18
            java.lang.String r8 = r0.toString()
            r0 = r17
            r0.append(r8)
            java.lang.String r4 = ", [logAspect: "
            r0 = r17
            r0.append(r4)
            r0 = r17
            r0.append(r12)
            r15 = 93
            r0 = r17
            r0.append(r15)
            r0 = r17
            java.lang.String r8 = r0.toString()
            java.lang.String r4 = "JsonUtil"
            r11.size(r12, r13, r4, r8)
            goto L16
        L9c:
            return r2
        L9d:
            r20 = 0
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.menu.C14607f.m1086a(android.os.Bundle):org.json.JSONObject");
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
    /* JADX WARN: Incorrect condition in loop: B:10:0x0064 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0037 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m1084a(java.util.List r28, boolean r29) {
        /*
            r27 = this;
            java.lang.String r4 = "objects"
            r0 = r28
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r4)
            r0 = r28
            int r5 = r0.size()
            r6 = 2
            if (r5 < r6) goto L8c
            r0 = r28
            int r5 = r0.size()
            r6 = 1
            kotlin.i0.e r7 = kotlin.p491i0.C11839f.m10272j(r6, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = r8
            r11 = r7
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r10 = r11
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r10, r6)
            r8.<init>(r5)
            r12 = r7
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            r10 = r12
            java.util.Iterator r13 = r10.iterator()
        L33:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L55
            r16 = r13
            kotlin.z.l0 r16 = (kotlin.p557z.AbstractC13711l0) r16
            r15 = r16
            int r5 = r15.mo4069b()
            r0 = r28
            java.lang.Object r17 = r0.get(r5)
            r19 = r17
            org.json.JSONObject r19 = (org.json.JSONObject) r19
            r18 = r19
            r0 = r18
            r9.add(r0)
            goto L33
        L55:
            r6 = 0
            r0 = r28
            java.lang.Object r17 = r0.get(r6)
            java.util.Iterator r13 = r9.iterator()
        L60:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L85
            java.lang.Object r20 = r13.next()
            r21 = r20
            org.json.JSONObject r21 = (org.json.JSONObject) r21
            r18 = r21
            r23 = r17
            org.json.JSONObject r23 = (org.json.JSONObject) r23
            r22 = r23
            org.org.org.org.asm.menu.f r27 = org.org.org.org.asm.menu.C14607f.f32363c
            r0 = r27
            r1 = r22
            r2 = r18
            r3 = r29
            org.json.JSONObject r17 = r0.toString(r1, r2, r3)
            goto L60
        L85:
            r24 = r17
            org.json.JSONObject r24 = (org.json.JSONObject) r24
            r18 = r24
            return r18
        L8c:
            r0 = r28
            boolean r29 = r0.isEmpty()
            r6 = 1
            r0 = r29
            r0 = r0 ^ r6
            r29 = r0
            if (r29 == 0) goto La8
            r6 = 0
            r0 = r28
            java.lang.Object r17 = r0.get(r6)
            r25 = r17
            org.json.JSONObject r25 = (org.json.JSONObject) r25
            r18 = r25
            return r18
        La8:
            r26 = 0
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.menu.C14607f.m1084a(java.util.List, boolean):org.json.JSONObject");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final JSONObject add(List list, boolean z) {
        Log_OC.getArray(list, "objects");
        JSONObject $r1 = m1084a(list, z);
        if ($r1 != null) {
            C14607f $r0 = f32363c;
            $r0.doInBackground($r1);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:30:0x0142 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject doInBackground(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.menu.C14607f.doInBackground(org.json.JSONObject):org.json.JSONObject");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final JSONObject get(String str) {
        Log_OC.getArray(str, "jsonString");
        try {
            JSONObject $r3 = new JSONObject(str);
            return $r3;
        } catch (Exception e) {
            return null;
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
    public final JSONObject getEntry(Map map) {
        Log_OC.getArray(map, "map");
        try {
            JSONObject $r3 = new JSONObject(map);
            return $r3;
        } catch (Exception e) {
            return null;
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
    public final String getTime(JSONObject jSONObject) {
        if (jSONObject != null) {
            String $r1 = jSONObject.toString(4);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject toString(org.json.JSONObject r11, org.json.JSONObject r12, boolean r13) throws org.json.JSONException {
        /*
            r10 = this;
            if (r11 != 0) goto L6
            if (r12 != 0) goto L6
            r0 = 0
            return r0
        L6:
            if (r11 != 0) goto L9
            return r12
        L9:
            if (r12 != 0) goto Lc
            return r11
        Lc:
            java.util.Iterator r1 = r12.keys()
            java.lang.String r2 = "with.keys()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r1, r2)
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r4 = r1.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            java.lang.Object r4 = r12.get(r5)
            boolean r3 = r11.has(r5)
            if (r3 != 0) goto L31
            r11.put(r5, r4)
            goto L15
        L31:
            boolean r3 = r4 instanceof org.json.JSONObject
            if (r3 == 0) goto L41
            org.json.JSONObject r7 = r11.getJSONObject(r5)
            r9 = r4
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            r8 = r9
            r10.toString(r7, r8, r13)
            goto L15
        L41:
            if (r13 != 0) goto L15
            r11.put(r5, r4)
            goto L15
        L47:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.menu.C14607f.toString(org.json.JSONObject, org.json.JSONObject, boolean):org.json.JSONObject");
    }
}
