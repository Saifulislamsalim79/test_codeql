package org.org.org.org.org.data.asm;

import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.org.data.asm.h */
/* loaded from: classes.dex */
public final class C14695h implements b<e.a.a.a.c.f.d.a> {
    private C14695h() {
    }

    public /* synthetic */ C14695h(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m713a(JSONObject jSONObject) {
        Attribute $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Attribute m714a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Attribute $r3 = (Attribute) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m712b(String str) {
        Attribute $r1 = m714a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Attribute toString(JSONObject jSONObject) {
        Label $r4;
        Log_OC.getArray(jSONObject, "json");
        JSONObject $r2 = jSONObject.optJSONObject("setupConfiguration");
        boolean $z0 = jSONObject.getBoolean("allowedRecording");
        if ($r2 != null) {
            C14696i $r3 = Label.f32738d;
            $r4 = $r3.add($r2);
        } else {
            $r4 = null;
        }
        Attribute $r5 = new Attribute($z0, $r4);
        return $r5;
    }
}
