package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.c.b.b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.http.util.C14533a;
/* loaded from: classes.dex */
public final class b$a$l extends AbstractC11802m implements InterfaceC11767l<JSONObject, b> {

    /* renamed from: o */
    public static final b$a$l f32575o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$l $r0 = new b$a$l();
        f32575o = $r0;
    }

    public b$a$l() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.android.http.util.Label call(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14533a $r3 = org.org.org.org.android.http.util.Label.f32086i;
        org.org.org.org.android.http.util.Label $r1 = $r3.run(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ b invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        org.org.org.org.android.http.util.Label $r1 = call($r3);
        return $r1;
    }
}
