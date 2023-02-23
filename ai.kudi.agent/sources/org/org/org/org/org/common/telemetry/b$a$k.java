package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14548o;
import org.org.org.org.android.util.asm.C14550x;
/* loaded from: classes.dex */
public final class b$a$k extends AbstractC11802m implements InterfaceC11767l<JSONObject, g> {

    /* renamed from: o */
    public static final b$a$k f32574o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$k $r0 = new b$a$k();
        f32574o = $r0;
    }

    public b$a$k() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14550x getView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14548o $r3 = C14550x.f32163b;
        C14550x $r1 = $r3.m1287c(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ g invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14550x $r1 = getView($r3);
        return $r1;
    }
}
