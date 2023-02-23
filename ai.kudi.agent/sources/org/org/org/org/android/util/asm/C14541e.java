package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.util.asm.e */
/* loaded from: classes.dex */
public final class C14541e implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.c> {
    private C14541e() {
    }

    public /* synthetic */ C14541e(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1311a(JSONObject jSONObject) {
        C14539c $r1 = onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public C14539c m1312a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14539c $r3 = (C14539c) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1310b(String str) {
        C14539c $r1 = m1312a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14539c onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.optString("stack_trace");
        Log_OC.loadImage($r3, "json.optString(\"stack_trace\")");
        String $r4 = jSONObject.optString("screen_name");
        Log_OC.loadImage($r4, "json.optString(\"screen_name\")");
        Log $r5 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r6 = $r5.get(jSONObject);
        C14539c $r2 = new C14539c($r3, $r4, $r6);
        return $r2;
    }
}
