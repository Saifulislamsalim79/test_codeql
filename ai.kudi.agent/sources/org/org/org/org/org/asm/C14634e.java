package org.org.org.org.org.asm;

import com.smartlook.sdk.smartlook.SetupOptions;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.asm.e */
/* loaded from: classes.dex */
public final class C14634e extends AbstractC11802m implements InterfaceC11767l<e.a.a.a.c.i.e.b, C13666w> {

    /* renamed from: i */
    public final /* synthetic */ SetupOptions f32500i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14634e(SetupOptions setupOptions) {
        super(1);
        this.f32500i = setupOptions;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void parse(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        SetupOptions $r2 = this.f32500i;
        jSONObject.read($r2);
    }
}
