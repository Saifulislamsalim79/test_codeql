package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.util.asm.o */
/* loaded from: classes.dex */
public final class C14548o implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.g> {
    private C14548o() {
    }

    public /* synthetic */ C14548o(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1290a(JSONObject jSONObject) {
        C14550x $r1 = m1287c(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1289b(String str) {
        C14550x $r1 = m1288c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public C14550x m1288c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14550x $r3 = (C14550x) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public C14550x m1287c(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("type");
        Log_OC.loadImage($r3, "json.getString(\"type\")");
        C14540d $r4 = C14544h.f32140b;
        JSONObject $r5 = jSONObject.getJSONObject("frame");
        Log_OC.loadImage($r5, "json.getJSONObject(\"frame\")");
        C14544h $r6 = $r4.m1313c($r5);
        Log $r7 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r8 = $r7.get(jSONObject);
        C14550x $r2 = new C14550x($r3, $r6, $r8);
        return $r2;
    }
}
