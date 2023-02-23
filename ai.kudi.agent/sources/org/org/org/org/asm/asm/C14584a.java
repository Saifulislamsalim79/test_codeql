package org.org.org.org.asm.asm;

import e.a.a.a.f.u.o;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.asm.asm.a */
/* loaded from: classes.dex */
public final class C14584a implements e.a.a.a.f.z.b<o> {
    private C14584a() {
    }

    public /* synthetic */ C14584a(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1135a(JSONObject jSONObject) {
        C14586c $r1 = onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final List m1136a(JSONArray jSONArray) {
        Log_OC.getArray(jSONArray, "json");
        o$a$a $r3 = o$a$a.RELATIVE;
        List $r1 = Collection.m1056a(jSONArray, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public C14586c m1137a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14586c $r3 = (C14586c) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1134b(String str) {
        C14586c $r1 = m1137a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14586c onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("fileName");
        Log_OC.loadImage($r3, "json.getString(\"fileName\")");
        long $l0 = jSONObject.getLong("duration");
        long $l1 = jSONObject.getLong("generalTime");
        C14586c $r2 = new C14586c($r3, $l0, $l1);
        return $r2;
    }
}
