package org.org.org.org.android.model.data;

import e.a.a.a.a.d.b.a;
import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.model.data.h */
/* loaded from: classes.dex */
public final class C14535h implements b<a> {
    private C14535h() {
    }

    public /* synthetic */ C14535h(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1356a(JSONObject jSONObject) {
        Location $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1355b(String str) {
        Location $r1 = getItem(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Location getItem(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Location $r3 = (Location) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Location toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("name");
        Log_OC.loadImage($r3, "json.getString(\"name\")");
        long $l0 = jSONObject.getLong("duration");
        String $r4 = jSONObject.optString("reason", null);
        Log $r5 = Item.f32102a;
        Item $r6 = $r5.get(jSONObject);
        Location $r2 = new Location($r3, $l0, $r4, $r6);
        return $r2;
    }
}
