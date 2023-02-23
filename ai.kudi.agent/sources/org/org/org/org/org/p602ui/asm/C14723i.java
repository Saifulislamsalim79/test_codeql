package org.org.org.org.org.p602ui.asm;

import e.a.a.a.c.l.e.f;
import e.a.a.a.f.z.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14540d;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.org.ui.asm.i */
/* loaded from: classes.dex */
public final class C14723i implements b<f> {
    private C14723i() {
    }

    public /* synthetic */ C14723i(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m506a(JSONObject jSONObject) {
        C14721f $r1 = onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public C14721f m507a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14721f $r3 = (C14721f) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m505b(String str) {
        C14721f $r1 = m507a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14721f onCreateView(JSONObject jSONObject) {
        C14544h $r10;
        Log_OC.getArray(jSONObject, "json");
        JSONObject $r3 = jSONObject.optJSONObject("full_view_rect");
        String $r4 = jSONObject.getString("id");
        Log_OC.loadImage($r4, "json.getString(\"id\")");
        String $r5 = jSONObject.getString("hash");
        Log_OC.loadImage($r5, "json.getString(\"hash\")");
        String $r6 = jSONObject.getString("scrollable_parent_hash");
        Log_OC.loadImage($r6, "json.getString(\"scrollable_parent_hash\")");
        boolean $z0 = jSONObject.getBoolean("is_recycler_view_item");
        String $r7 = jSONObject.getString("kind");
        Log_OC.loadImage($r7, "json.getString(\"kind\")");
        String $r8 = jSONObject.getString("vc");
        Log_OC.loadImage($r8, "json.getString(\"vc\")");
        String $r9 = jSONObject.getString("visibility");
        Log_OC.loadImage($r9, "json.getString(\"visibility\")");
        double $d0 = jSONObject.getDouble("alpha");
        float $f0 = (float) $d0;
        int $i0 = jSONObject.getInt("tree_depth");
        int $i1 = jSONObject.getInt("x");
        int $i2 = jSONObject.getInt("y");
        int $i3 = jSONObject.getInt("w");
        int $i4 = jSONObject.getInt("h");
        if ($r3 == null) {
            $r10 = null;
        } else {
            C14540d $r11 = C14544h.f32140b;
            $r10 = $r11.m1313c($r3);
        }
        JSONArray $r12 = jSONObject.getJSONArray("color_rectangles");
        f$a$a $r13 = f$a$a.f32911l;
        List $r14 = Collection.m1056a($r12, $r13);
        C14721f $r2 = new C14721f($r4, $r5, $r6, $z0, $r7, $r8, $r9, $f0, $i0, $i1, $i2, $i3, $i4, $r10, $r14);
        return $r2;
    }
}
