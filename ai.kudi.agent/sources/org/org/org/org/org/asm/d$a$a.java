package org.org.org.org.org.asm;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* loaded from: classes.dex */
public final class d$a$a extends AbstractC11802m implements InterfaceC11767l<e.a.a.a.c.i.e.b, C13666w> {
    public final /* synthetic */ Fragment parent;
    public final /* synthetic */ FragmentManager value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$a$a(FragmentManager fragmentManager, Fragment fragment) {
        super(1);
        this.value = fragmentManager;
        this.parent = fragment;
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
        FragmentManager $r3 = this.value;
        Fragment $r2 = this.parent;
        jSONObject.add($r3, $r2);
    }
}
