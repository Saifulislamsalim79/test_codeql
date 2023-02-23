package org.org.org.org.asm.util;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class Collection {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0022 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m1057a(org.json.JSONArray r13) {
        /*
            if (r13 != 0) goto L7
            java.util.List r0 = kotlin.p557z.C13722p.m3941e()
            return r0
        L7:
            int r1 = r13.length()
            r3 = 0
            kotlin.i0.e r2 = kotlin.p491i0.C11839f.m10272j(r3, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r4
            r4.<init>()
            r7 = r2
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r6 = r7
            java.util.Iterator r8 = r6.iterator()
        L1e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L36
            r11 = r8
            kotlin.z.l0 r11 = (kotlin.p557z.AbstractC13711l0) r11
            r10 = r11
            int r1 = r10.mo4069b()
            java.lang.String r12 = r13.optString(r1)
            if (r12 == 0) goto L1e
            r5.add(r12)
            goto L1e
        L36:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.m1057a(org.json.JSONArray):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001c */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m1056a(org.json.JSONArray r10, kotlin.p483e0.p484c.InterfaceC11767l r11) {
        /*
            java.lang.String r0 = "transform"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.util.List r1 = read(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L18:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2e
            java.lang.Object r7 = r5.next()
            r9 = r7
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            r8 = r9
            java.lang.Object r7 = r11.invoke(r8)
            r2.add(r7)
            goto L18
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.m1056a(org.json.JSONArray, kotlin.e0.c.l):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONArray add(java.util.List r8) {
        /*
            java.lang.String r0 = "$this$toJSONArray"
            kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r4 = r2.next()
            boolean r3 = r4 instanceof org.org.org.org.asm.menu.Object
            if (r3 == 0) goto L28
            r6 = r4
            org.org.org.org.asm.menu.Object r6 = (org.org.org.org.asm.menu.Object) r6
            r5 = r6
            org.json.JSONObject r7 = r5.equals()
            r1.put(r7)
            goto Le
        L28:
            r1.put(r4)
            goto Le
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.add(java.util.List):org.json.JSONArray");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List get(org.json.JSONArray r10, kotlin.p483e0.p484c.InterfaceC11767l r11) {
        /*
            java.lang.String r0 = "transform"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.util.List r1 = read(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L18:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2e
            java.lang.Object r7 = r5.next()
            r9 = r7
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            r8 = r9
            java.lang.Object r7 = r11.invoke(r8)
            r2.add(r7)
            goto L18
        L2e:
            java.util.List r1 = kotlin.p557z.C13722p.m3970D0(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.get(org.json.JSONArray, kotlin.e0.c.l):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String getString(JSONObject jSONObject, String str) {
        Log_OC.getArray(jSONObject, "$this$optStringNull");
        Log_OC.getArray(str, "name");
        String $r0 = jSONObject.optString(str, null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List read(org.json.JSONArray r13) {
        /*
            if (r13 != 0) goto L7
            java.util.List r0 = kotlin.p557z.C13722p.m3941e()
            return r0
        L7:
            int r1 = r13.length()
            r3 = 0
            kotlin.i0.e r2 = kotlin.p491i0.C11839f.m10272j(r3, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r4
            r4.<init>()
            r7 = r2
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r6 = r7
            java.util.Iterator r8 = r6.iterator()
        L1e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L36
            r11 = r8
            kotlin.z.l0 r11 = (kotlin.p557z.AbstractC13711l0) r11
            r10 = r11
            int r1 = r10.mo4069b()
            org.json.JSONObject r12 = r13.optJSONObject(r1)
            if (r12 == 0) goto L1e
            r5.add(r12)
            goto L1e
        L36:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.read(org.json.JSONArray):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List read(org.json.JSONArray r8, kotlin.p483e0.p484c.InterfaceC11767l r9) {
        /*
            java.lang.String r0 = "transform"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            java.util.List r1 = read(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r5 = r3.next()
            r7 = r5
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r6 = r7
            java.lang.Object r5 = r9.invoke(r6)
            if (r5 == 0) goto L12
            r2.add(r5)
            goto L12
        L2a:
            java.util.List r1 = kotlin.p557z.C13722p.m3970D0(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Collection.read(org.json.JSONArray, kotlin.e0.c.l):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Long set(JSONObject jSONObject, String str) {
        Log_OC.getArray(jSONObject, "$this$optLongNull");
        Log_OC.getArray(str, "name");
        Float $r2 = update(jSONObject, str);
        if ($r2 != null) {
            float $f0 = $r2.floatValue();
            long $l0 = $f0;
            Long $r3 = Long.valueOf($l0);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Float update(JSONObject jSONObject, String str) {
        Log_OC.getArray(jSONObject, "$this$optFloatNull");
        Log_OC.getArray(str, "name");
        double $d0 = jSONObject.optDouble(str);
        boolean $z0 = Double.isNaN($d0);
        if ($z0) {
            return null;
        }
        float $f0 = (float) $d0;
        Float $r2 = Float.valueOf($f0);
        return $r2;
    }
}
