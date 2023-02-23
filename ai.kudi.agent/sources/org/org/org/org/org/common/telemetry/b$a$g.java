package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14543g;
/* loaded from: classes.dex */
public final class b$a$g extends AbstractC11802m implements InterfaceC11767l<JSONObject, l> {

    /* renamed from: o */
    public static final b$a$g f32570o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$g $r0 = new b$a$g();
        f32570o = $r0;
    }

    public b$a$g() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final org.org.org.org.android.util.asm.Item m901b(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14543g $r3 = org.org.org.org.android.util.asm.Item.f32117d;
        org.org.org.org.android.util.asm.Item $r1 = $r3.m1305c(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ l invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        org.org.org.org.android.util.asm.Item $r1 = m901b($r3);
        return $r1;
    }
}
