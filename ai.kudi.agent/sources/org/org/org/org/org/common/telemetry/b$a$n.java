package org.org.org.org.org.common.telemetry;

import e.a.a.a.c.l.e.e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.org.p602ui.asm.Attribute;
import org.org.org.org.org.p602ui.asm.C14722h;
/* loaded from: classes.dex */
public final class b$a$n extends AbstractC11802m implements InterfaceC11767l<JSONObject, e> {

    /* renamed from: o */
    public static final b$a$n f32577o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$n $r0 = new b$a$n();
        f32577o = $r0;
    }

    public b$a$n() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Attribute $r1 = toString($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Attribute toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14722h $r3 = Attribute.f32864b;
        Attribute $r1 = $r3.toString(jSONObject);
        return $r1;
    }
}
