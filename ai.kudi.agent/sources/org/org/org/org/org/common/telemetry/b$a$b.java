package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.c;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14539c;
import org.org.org.org.android.util.asm.C14541e;
/* loaded from: classes.dex */
public final class b$a$b extends AbstractC11802m implements InterfaceC11767l<JSONObject, c> {

    /* renamed from: o */
    public static final b$a$b f32565o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$b $r0 = new b$a$b();
        f32565o = $r0;
    }

    public b$a$b() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ c invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        C14539c $r1 = onCreateView($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14539c onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        C14541e $r3 = C14539c.f32136k;
        C14539c $r1 = $r3.onCreateView(jSONObject);
        return $r1;
    }
}
