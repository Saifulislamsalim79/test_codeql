package org.org.org.org.org.p602ui.asm;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import e.a.a.a.c.l.e.c;
import e.a.a.a.f.z.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.org.ui.asm.ByteVector */
/* loaded from: classes.dex */
public final class ByteVector implements b<c> {
    private ByteVector() {
    }

    public /* synthetic */ ByteVector(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m529a(JSONObject jSONObject) {
        C14719b $r1 = onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public C14719b m530a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14719b $r3 = (C14719b) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m528b(String str) {
        C14719b $r1 = m530a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14719b onCreateView(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        double $d0 = jSONObject.getDouble("dim_amount");
        float $f0 = (float) $d0;
        int $i0 = jSONObject.getInt("x");
        int $i1 = jSONObject.getInt("y");
        int $i2 = jSONObject.getInt("w");
        int $i3 = jSONObject.getInt("h");
        JSONArray $r3 = jSONObject.getJSONArray(TransactionBreakDownItemType.DATA);
        c$a$a $r4 = c$a$a.f32890l;
        List $r5 = Collection.m1056a($r3, $r4);
        C14719b $r2 = new C14719b($f0, $i0, $i1, $i2, $i3, $r5);
        return $r2;
    }
}
