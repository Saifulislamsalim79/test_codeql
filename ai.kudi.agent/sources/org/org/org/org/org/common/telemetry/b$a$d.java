package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.C14535h;
import org.org.org.org.android.model.data.Location;
/* loaded from: classes.dex */
public final class b$a$d extends AbstractC11802m implements InterfaceC11767l<JSONObject, e.a.a.a.a.d.b.a> {

    /* renamed from: o */
    public static final b$a$d f32567o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$d $r0 = new b$a$d();
        f32567o = $r0;
    }

    public b$a$d() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e.a.a.a.a.d.b.a invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Location $r1 = parse($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Location parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14535h $r3 = Location.url;
        Location $r1 = $r3.toString(jSONObject);
        return $r1;
    }
}
