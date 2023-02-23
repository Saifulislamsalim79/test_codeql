package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class ClassWriter implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.b> {
    private ClassWriter() {
    }

    public /* synthetic */ ClassWriter(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1344a(JSONObject jSONObject) {
        Attribute $r1 = get(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Attribute m1345a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Attribute $r3 = (Attribute) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1343b(String str) {
        Attribute $r1 = m1345a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Attribute get(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("connection");
        Log_OC.loadImage($r3, "json.getString(\"connection\")");
        Log $r4 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r5 = $r4.get(jSONObject);
        Attribute $r2 = new Attribute($r3, $r5);
        return $r2;
    }
}
