package org.org.org.org.org.p602ui.asm;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import e.a.a.a.c.l.e.c;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.menu.Object;
import org.org.org.org.asm.util.Collection;
import org.org.org.org.org.common.data.Entity;
/* renamed from: org.org.org.org.org.ui.asm.Item */
/* loaded from: classes.dex */
public final class Item implements Object, Entity {

    /* renamed from: b */
    public static final ClassWriter f32867b;

    /* renamed from: a */
    public final List<c> f32868a;

    /* renamed from: d */
    public long f32869d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter(null);
        f32867b = $r0;
    }

    public Item(long j, List list) {
        Log_OC.getArray(list, "windows");
        this.f32869d = j;
        this.f32868a = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Item(java.util.List r4) {
        /*
            r3 = this;
            java.lang.String r0 = "windows"
            kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
            long r1 = java.lang.System.currentTimeMillis()
            r3.<init>(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.asm.Item.<init>(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        long $l0 = this.f32869d;
        $r1.put(TransactionField.TIME, $l0);
        List $r3 = this.f32868a;
        JSONArray $r2 = Collection.add($r3);
        $r1.put("windows", $r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.data.Entity
    public void set(long j) {
        long $l1 = this.f32869d;
        long $l0 = $l1 - j;
        this.f32869d = $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        C14607f $r1 = C14607f.f32363c;
        JSONObject $r2 = equals();
        String $r3 = $r1.getTime($r2);
        return $r3 != null ? $r3 : "undefined";
    }
}
