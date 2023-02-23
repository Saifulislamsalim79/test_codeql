package org.org.org.org.asm.asm;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ByteVector extends AbstractC11802m implements InterfaceC11772q<String, Object, Boolean, C13666w> {
    public final /* synthetic */ JSONObject content;
    public final /* synthetic */ JSONObject data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteVector(JSONObject jSONObject, JSONObject jSONObject2) {
        super(3);
        this.content = jSONObject;
        this.data = jSONObject2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, Object obj, boolean z) {
        Log_OC.getArray(str, "key");
        if (!z) {
            JSONObject $r3 = this.content;
            $r3.put(str, obj);
            return;
        }
        JSONObject $r32 = this.data;
        boolean $z0 = $r32.has(str);
        if ($z0) {
            return;
        }
        JSONObject $r33 = this.data;
        $r33.put(str, obj);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Object obj, Boolean bool) {
        String $r4 = str;
        Boolean $r5 = bool;
        boolean $z0 = $r5.booleanValue();
        add($r4, obj, $z0);
        C13666w r6 = C13666w.f30112a;
        return r6;
    }
}
