package org.org.org.org.android.http.util;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b$a$b extends AbstractC11802m implements InterfaceC11767l<JSONObject, e.a.a.a.a.c.b.a> {

    /* renamed from: o */
    public static final b$a$b f32096o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$b $r0 = new b$a$b();
        f32096o = $r0;
    }

    public b$a$b() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ e.a.a.a.a.c.b.a invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Element $r1 = invoke2($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Element invoke2(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14534h $r3 = Element.object;
        Element $r1 = $r3.toString(jSONObject);
        return $r1;
    }
}
