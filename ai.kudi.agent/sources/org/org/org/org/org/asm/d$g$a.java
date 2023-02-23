package org.org.org.org.org.asm;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* loaded from: classes.dex */
public final class d$g$a extends AbstractC11802m implements InterfaceC11767l<e.a.a.a.c.i.e.b, C13666w> {

    /* renamed from: d */
    public static final d$g$a f32496d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        d$g$a $r0 = new d$g$a();
        f32496d = $r0;
    }

    public d$g$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(e.a.a.a.c.i.e.b bVar) {
        JSONObject $r2 = (JSONObject) bVar;
        parse($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    public final void parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        jSONObject.close();
    }
}
