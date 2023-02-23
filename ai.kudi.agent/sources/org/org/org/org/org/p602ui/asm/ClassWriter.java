package org.org.org.org.org.p602ui.asm;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import e.a.a.a.f.z.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.org.ui.asm.ClassWriter */
/* loaded from: classes.dex */
public final class ClassWriter implements b<e.a.a.a.c.l.e.b> {
    private ClassWriter() {
    }

    public /* synthetic */ ClassWriter(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m526a(JSONObject jSONObject) {
        Item $r1 = get(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m525b(String str) {
        Item $r1 = m524c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Item m524c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Item $r3 = (Item) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Item get(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        long $l0 = jSONObject.getLong(TransactionField.TIME);
        JSONArray $r3 = jSONObject.getJSONArray("windows");
        b$a$a $r4 = b$a$a.f32889m;
        List $r5 = Collection.m1056a($r3, $r4);
        Item $r2 = new Item($l0, $r5);
        return $r2;
    }
}
