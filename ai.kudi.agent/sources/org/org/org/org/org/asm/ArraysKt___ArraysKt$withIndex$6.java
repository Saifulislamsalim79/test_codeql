package org.org.org.org.org.asm;

import android.app.Activity;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* loaded from: classes.dex */
public final class ArraysKt___ArraysKt$withIndex$6 extends AbstractC11802m implements InterfaceC11767l<e.a.a.a.c.i.e.b, C13666w> {
    public final /* synthetic */ Activity context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$6(Activity activity) {
        super(1);
        this.context = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(e.a.a.a.c.i.e.b bVar) {
        JSONObject $r2 = (JSONObject) bVar;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        Activity $r2 = this.context;
        jSONObject.close($r2);
    }
}
