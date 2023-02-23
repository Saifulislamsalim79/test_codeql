package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Attribute;
/* loaded from: classes.dex */
public final class b$a$m extends AbstractC11802m implements InterfaceC11767l<JSONObject, b> {

    /* renamed from: o */
    public static final b$a$m f32576o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$m $r0 = new b$a$m();
        f32576o = $r0;
    }

    public b$a$m() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ b invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Attribute $r1 = remove($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Attribute remove(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        org.org.org.org.android.util.asm.ClassWriter $r3 = Attribute.f32114b;
        Attribute $r1 = $r3.get(jSONObject);
        return $r1;
    }
}
