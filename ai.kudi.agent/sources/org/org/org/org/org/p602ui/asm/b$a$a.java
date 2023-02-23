package org.org.org.org.org.p602ui.asm;

import e.a.a.a.c.l.e.c;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.org.ui.asm.b$a$a */
/* loaded from: classes.dex */
public final class b$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, c> {

    /* renamed from: m */
    public static final b$a$a f32889m;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$a $r0 = new b$a$a();
        f32889m = $r0;
    }

    public b$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ c invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14719b $r1 = onCreateView($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14719b onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        ByteVector $r3 = C14719b.f32882l;
        C14719b $r1 = $r3.onCreateView(jSONObject);
        return $r1;
    }
}
