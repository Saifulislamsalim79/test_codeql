package org.org.org.org.asm.asm;

import e.a.a.a.f.u.o;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, o> {
    public static final o$a$a RELATIVE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        o$a$a $r0 = new o$a$a();
        RELATIVE = $r0;
    }

    public o$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ o invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14586c $r1 = onCreateView($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14586c onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14584a $r3 = C14586c.f32334c;
        C14586c $r1 = $r3.onCreateView(jSONObject);
        return $r1;
    }
}
