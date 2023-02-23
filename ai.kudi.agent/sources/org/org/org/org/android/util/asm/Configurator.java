package org.org.org.org.android.util.asm;

import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
/* loaded from: classes.dex */
public final class Configurator implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.h> {
    private Configurator() {
    }

    public /* synthetic */ Configurator(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1342a(JSONObject jSONObject) {
        Location $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1341b(String str) {
        Location $r1 = m1340c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Location m1340c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Location $r3 = (Location) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Location toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        JSONArray $r3 = jSONObject.getJSONArray("touches");
        h$a$a $r4 = h$a$a.f32145o;
        List $r5 = Collection.m1056a($r3, $r4);
        Log $r6 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r7 = $r6.get(jSONObject);
        Location $r2 = new Location($r5, $r7);
        return $r2;
    }
}
