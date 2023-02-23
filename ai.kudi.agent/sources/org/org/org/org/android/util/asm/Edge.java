package org.org.org.org.android.util.asm;

import e.a.a.a.a.b.f.k;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class Edge implements e.a.a.a.f.z.b<k> {
    private Edge() {
    }

    public /* synthetic */ Edge(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1339a(JSONObject jSONObject) {
        Node $r1 = remove(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1338b(String str) {
        Node $r1 = m1337c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Node m1337c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Node $r3 = (Node) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Node remove(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("vc_class_name");
        Log_OC.loadImage($r3, "json.getString(\"vc_class_name\")");
        Log $r4 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r5 = $r4.get(jSONObject);
        Node $r2 = new Node($r3, $r5);
        return $r2;
    }
}
