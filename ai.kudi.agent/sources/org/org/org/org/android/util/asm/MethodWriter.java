package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.android.util.menu.C14572i;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class MethodWriter implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.i> {
    private MethodWriter() {
    }

    public /* synthetic */ MethodWriter(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1329a(JSONObject jSONObject) {
        Type $r1 = m1327d(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Type m1330a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Type $r3 = (Type) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1328b(String str) {
        Type $r1 = m1330a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public Type m1327d(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        C14572i $r3 = EnumC14571f.f32274l;
        int $i0 = jSONObject.getInt("orientation");
        EnumC14571f $r4 = $r3.m1196c($i0);
        Log $r5 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r6 = $r5.get(jSONObject);
        Type $r2 = new Type($r4, $r6);
        return $r2;
    }
}
