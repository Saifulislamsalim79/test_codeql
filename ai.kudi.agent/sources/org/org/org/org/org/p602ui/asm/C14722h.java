package org.org.org.org.org.p602ui.asm;

import e.a.a.a.c.l.e.e;
import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Item;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.org.ui.asm.h */
/* loaded from: classes.dex */
public final class C14722h implements b<e> {
    private C14722h() {
    }

    public /* synthetic */ C14722h(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m509a(JSONObject jSONObject) {
        Attribute $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Attribute m510a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Attribute $r3 = (Attribute) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m508b(String str) {
        Attribute $r1 = m510a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Attribute toString(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("rendering_mode");
        Log_OC.loadImage($r3, "json.getString(\"rendering_mode\")");
        Log $r4 = Item.f32102a;
        Item $r5 = $r4.get(jSONObject);
        Attribute $r2 = new Attribute($r3, $r5);
        return $r2;
    }
}
