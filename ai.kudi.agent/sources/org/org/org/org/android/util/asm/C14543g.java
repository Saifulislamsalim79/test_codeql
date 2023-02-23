package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.util.asm.g */
/* loaded from: classes.dex */
public final class C14543g implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.l> {
    private C14543g() {
    }

    public /* synthetic */ C14543g(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1308a(JSONObject jSONObject) {
        Item $r1 = m1305c(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1307b(String str) {
        Item $r1 = m1306c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Item m1306c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Item $r3 = (Item) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Item m1305c(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        C14540d $r3 = C14544h.f32140b;
        JSONObject $r4 = jSONObject.getJSONObject("view_frame");
        Log_OC.loadImage($r4, "json.getJSONObject(\"view_frame\")");
        C14544h $r5 = $r3.m1313c($r4);
        String $r6 = jSONObject.getString("selector_name");
        Log_OC.loadImage($r6, "json.getString(\"selector_name\")");
        String $r7 = jSONObject.getString("vc_class_name");
        Log_OC.loadImage($r7, "json.getString(\"vc_class_name\")");
        String $r8 = jSONObject.getString("instance_class_name");
        Log_OC.loadImage($r8, "json.getString(\"instance_class_name\")");
        String $r9 = jSONObject.getString("type");
        Log_OC.loadImage($r9, "json.getString(\"type\")");
        long $l0 = jSONObject.getLong("duration");
        Log $r10 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r11 = $r10.get(jSONObject);
        Item $r2 = new Item($r5, $r6, $r7, $r8, $r9, $l0, $r11);
        return $r2;
    }
}
