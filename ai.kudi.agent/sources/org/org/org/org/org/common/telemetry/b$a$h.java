package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Edge;
import org.org.org.org.android.util.asm.Node;
/* loaded from: classes.dex */
public final class b$a$h extends AbstractC11802m implements InterfaceC11767l<JSONObject, k> {

    /* renamed from: o */
    public static final b$a$h f32571o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$a$h $r0 = new b$a$h();
        f32571o = $r0;
    }

    public b$a$h() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ k invoke(JSONObject jSONObject) {
        JSONObject $r3 = jSONObject;
        Node $r1 = remove($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Node remove(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "it");
        Edge $r3 = Node.next;
        Node $r1 = $r3.remove(jSONObject);
        return $r1;
    }
}
