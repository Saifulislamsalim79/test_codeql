package org.org.org.org.android.util.asm;

import e.a.a.a.a.b.f.j;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, j> {

    /* renamed from: o */
    public static final h$a$a f32145o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        h$a$a $r0 = new h$a$a();
        f32145o = $r0;
    }

    public h$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Label execute(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        Frame $r3 = Label.f32125h;
        Label $r1 = $r3.update(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ j invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Label $r1 = execute($r3);
        return $r1;
    }
}
