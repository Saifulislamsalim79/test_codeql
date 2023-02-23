package org.org.org.org.org.p602ui.asm;

import e.a.a.a.c.l.e.f;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.org.ui.asm.c$a$a */
/* loaded from: classes.dex */
public final class c$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, f> {

    /* renamed from: l */
    public static final c$a$a f32890l;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        c$a$a $r0 = new c$a$a();
        f32890l = $r0;
    }

    public c$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final C14721f m515e(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14723i $r3 = C14721f.f32895l;
        C14721f $r1 = $r3.onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ f invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14721f $r1 = m515e($r3);
        return $r1;
    }
}
