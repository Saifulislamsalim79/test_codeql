package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.util.asm.l */
/* loaded from: classes.dex */
public final class C14546l implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.d> {
    private C14546l() {
    }

    public /* synthetic */ C14546l(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1299a(JSONObject jSONObject) {
        Buffer $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Buffer m1300a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Buffer $r3 = (Buffer) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1298b(String str) {
        Buffer $r1 = m1300a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Buffer toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("event_tracking_modes");
        Log_OC.loadImage($r3, "json.getString(\"event_tracking_modes\")");
        Log $r4 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r5 = $r4.get(jSONObject);
        Buffer $r2 = new Buffer($r3, $r5);
        return $r2;
    }
}
