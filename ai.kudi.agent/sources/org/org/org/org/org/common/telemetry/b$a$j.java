package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.MethodWriter;
import org.org.org.org.android.util.asm.Type;
/* loaded from: classes.dex */
public final class b$a$j extends AbstractC11802m implements InterfaceC11767l<JSONObject, e.a.a.a.a.b.f.i> {

    /* renamed from: o */
    public static final b$a$j f32573o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$j $r0 = new b$a$j();
        f32573o = $r0;
    }

    public b$a$j() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e.a.a.a.a.b.f.i invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Type $r1 = parse($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Type parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        MethodWriter $r3 = Type.f32134a;
        Type $r1 = $r3.m1327d(jSONObject);
        return $r1;
    }
}
