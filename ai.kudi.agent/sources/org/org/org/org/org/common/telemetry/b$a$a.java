package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Buffer;
import org.org.org.org.android.util.asm.C14546l;
/* loaded from: classes.dex */
public final class b$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, d> {

    /* renamed from: o */
    public static final b$a$a f32564o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$a $r0 = new b$a$a();
        f32564o = $r0;
    }

    public b$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ d invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Buffer $r1 = toString($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Buffer toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14546l $r3 = Buffer.head;
        Buffer $r1 = $r3.toString(jSONObject);
        return $r1;
    }
}
