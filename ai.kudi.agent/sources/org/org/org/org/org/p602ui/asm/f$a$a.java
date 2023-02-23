package org.org.org.org.org.p602ui.asm;

import e.a.a.a.c.l.e.a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.org.ui.asm.f$a$a */
/* loaded from: classes.dex */
public final class f$a$a extends AbstractC11802m implements InterfaceC11767l<JSONObject, a> {

    /* renamed from: l */
    public static final f$a$a f32911l;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        f$a$a $r0 = new f$a$a();
        f32911l = $r0;
    }

    public f$a$a() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ a invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Type $r1 = parse($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Type parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14718a $r3 = Type.SST;
        Type $r1 = $r3.read(jSONObject);
        return $r1;
    }
}
