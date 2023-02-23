package org.org.org.org.android.model.data;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
import org.org.org.org.org.common.data.Entity;
/* loaded from: classes.dex */
public class Item implements Object, Entity {

    /* renamed from: a */
    public static final Log f32102a;

    /* renamed from: c */
    public long f32103c;

    /* renamed from: i */
    public final JSONObject f32104i;

    /* renamed from: j */
    public final JSONObject f32105j;
    public final String text;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Log $r0 = new Log(null);
        f32102a = $r0;
    }

    public Item() {
        this(null, 0L, null, null, 15, null);
    }

    public Item(String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        Log_OC.getArray(str, "id");
        this.text = str;
        this.f32103c = j;
        this.f32105j = jSONObject;
        this.f32104i = jSONObject2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Item(java.lang.String r3, long r4, org.json.JSONObject r6, org.json.JSONObject r7, int r8, kotlin.p483e0.p485d.DBUtils$1 r9) {
        /*
            r2 = this;
            r0 = r8 & 1
            if (r0 == 0) goto La
            org.org.org.org.asm.graph.i r1 = org.org.org.org.asm.graph.C14601i.f32355b
            java.lang.String r3 = r1.m1100f()
        La:
            r0 = r8 & 2
            if (r0 == 0) goto L12
            long r4 = java.lang.System.currentTimeMillis()
        L12:
            r0 = r8 & 4
            if (r0 == 0) goto L18
            r6 = 0
            goto L18
        L18:
            r8 = r8 & 8
            if (r8 == 0) goto L1e
            r7 = 0
            goto L1e
        L1e:
            r2.<init>(r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.model.data.Item.<init>(java.lang.String, long, org.json.JSONObject, org.json.JSONObject, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Item(org.org.org.org.android.model.data.Item r13) {
        /*
            r12 = this;
            java.lang.String r6 = "eventBase"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r6)
            java.lang.String r7 = r13.text
            long r8 = r13.f32103c
            org.json.JSONObject r10 = r13.f32105j
            org.json.JSONObject r11 = r13.f32104i
            r0 = r12
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.model.data.Item.<init>(org.org.org.org.android.model.data.Item):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        update($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getName() {
        long l0 = this.f32103c;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.data.Entity
    public void set(long j) {
        long $l1 = this.f32103c;
        long $l0 = $l1 - j;
        this.f32103c = $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toXML() {
        String r1 = this.text;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void update(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "jsonObject");
        String $r2 = this.text;
        jSONObject.put("id", $r2);
        long $l0 = this.f32103c;
        jSONObject.put(TransactionField.TIME, $l0);
        JSONObject $r3 = this.f32105j;
        if ($r3 != null) {
            jSONObject.put("props", $r3);
        }
        JSONObject $r32 = this.f32104i;
        if ($r32 != null) {
            jSONObject.put("internalProps", $r32);
        }
    }
}
