package org.org.org.org.org.common.telemetry;

import e.a.a.a.c.l.e.b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b$a$e extends AbstractC11802m implements InterfaceC11767l<JSONObject, b> {

    /* renamed from: o */
    public static final b$a$e f32568o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$e $r0 = new b$a$e();
        f32568o = $r0;
    }

    public b$a$e() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ b invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        org.org.org.org.org.p602ui.asm.Item $r1 = remove($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.p602ui.asm.Item remove(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        org.org.org.org.org.p602ui.asm.ClassWriter $r3 = org.org.org.org.org.p602ui.asm.Item.f32867b;
        org.org.org.org.org.p602ui.asm.Item $r1 = $r3.get(jSONObject);
        return $r1;
    }
}
