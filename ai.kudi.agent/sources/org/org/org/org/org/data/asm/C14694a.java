package org.org.org.org.org.data.asm;

import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.org.data.asm.a */
/* loaded from: classes.dex */
public final class C14694a implements b<e.a.a.a.c.f.d.b> {
    private C14694a() {
    }

    public /* synthetic */ C14694a(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m717a(JSONObject jSONObject) {
        Cache $r1 = write(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m716b(String str) {
        Cache $r1 = m715c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Cache m715c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Cache $r3 = (Cache) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.org.org.org.org.data.asm.Cache write(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "json"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            org.org.org.org.org.data.asm.Cache r1 = new org.org.org.org.org.data.asm.Cache
            r1.<init>()
            java.util.Iterator r2 = r13.keys()
            java.lang.String r0 = "json.keys()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r0)
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            java.lang.Object r4 = r13.get(r5)
            if (r4 == 0) goto L35
            r8 = r4
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            r7 = r8
            org.org.org.org.org.data.asm.h r9 = org.org.org.org.org.data.asm.Attribute.f32734b
            org.org.org.org.org.data.asm.Attribute r10 = r9.toString(r7)
            r1.put(r5, r10)
            goto L13
        L35:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type org.json.JSONObject"
            r11.<init>(r0)
            throw r11
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.data.asm.C14694a.write(org.json.JSONObject):org.org.org.org.org.data.asm.Cache");
    }
}
