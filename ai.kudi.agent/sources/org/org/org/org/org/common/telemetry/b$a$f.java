package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Configurator;
import org.org.org.org.android.util.asm.Location;
/* loaded from: classes.dex */
public final class b$a$f extends AbstractC11802m implements InterfaceC11767l<JSONObject, e.a.a.a.a.b.f.h> {

    /* renamed from: o */
    public static final b$a$f f32569o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$f $r0 = new b$a$f();
        f32569o = $r0;
    }

    public b$a$f() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e.a.a.a.a.b.f.h invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Location $r1 = parse($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Location parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        Configurator $r3 = Location.url;
        Location $r1 = $r3.toString(jSONObject);
        return $r1;
    }
}
