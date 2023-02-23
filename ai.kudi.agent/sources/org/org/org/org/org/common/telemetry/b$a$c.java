package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.ByteVector;
import org.org.org.org.android.util.asm.C14547m;
/* loaded from: classes.dex */
public final class b$a$c extends AbstractC11802m implements InterfaceC11767l<JSONObject, e> {

    /* renamed from: b */
    public static final b$a$c f32566b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$c $r0 = new b$a$c();
        f32566b = $r0;
    }

    public b$a$c() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14547m $r1 = toString($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14547m toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        ByteVector $r3 = C14547m.f32147d;
        C14547m $r1 = $r3.onCreateView(jSONObject);
        return $r1;
    }
}
