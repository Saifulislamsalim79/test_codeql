package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14549q;
import org.org.org.org.android.util.asm.Plot;
/* loaded from: classes.dex */
public final class b$a$i extends AbstractC11802m implements InterfaceC11767l<JSONObject, e.a.a.a.a.b.f.a> {

    /* renamed from: o */
    public static final b$a$i f32572o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$i $r0 = new b$a$i();
        f32572o = $r0;
    }

    public b$a$i() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e.a.a.a.a.b.f.a invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Plot $r1 = remove($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Plot remove(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14549q $r3 = Plot.f32129a;
        Plot $r1 = $r3.update(jSONObject);
        return $r1;
    }
}
