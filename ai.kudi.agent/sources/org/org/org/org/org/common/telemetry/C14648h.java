package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.menu.Object;
/* renamed from: org.org.org.org.org.common.telemetry.h */
/* loaded from: classes.dex */
public final class C14648h implements Object {

    /* renamed from: b */
    public static final ClassWriter f32578b;

    /* renamed from: c */
    public String f32579c;

    /* renamed from: d */
    public JSONObject f32580d;

    /* renamed from: j */
    public JSONObject f32581j;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter(null);
        f32578b = $r0;
    }

    public C14648h() {
        this(null, null, null, 7, null);
    }

    public C14648h(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        Log_OC.getArray(jSONObject, "mutableUserProperties");
        Log_OC.getArray(jSONObject2, "immutableUserProperties");
        this.f32579c = str;
        this.f32580d = jSONObject;
        this.f32581j = jSONObject2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14648h(java.lang.String r2, org.json.JSONObject r3, org.json.JSONObject r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto Le
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L17
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L17:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.telemetry.C14648h.<init>(java.lang.String, org.json.JSONObject, org.json.JSONObject, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final JSONObject m900a() {
        C14607f $r2 = C14607f.f32363c;
        JSONObject $r3 = this.f32581j;
        JSONObject $r1 = $r2.toString($r3, this.f32580d, true);
        if ($r1 != null) {
            int $i0 = $r1.length();
            if ($i0 == 0) {
                return null;
            }
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final JSONObject m899b() {
        JSONObject r1 = this.f32580d;
        return r1;
    }

    /* renamed from: b */
    public final void m898b(String str) {
        this.f32579c = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final String m897c() {
        String r1 = this.f32579c;
        return r1;
    }

    /* renamed from: d */
    public final void m896d(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "<set-?>");
        this.f32581j = jSONObject;
    }

    /* renamed from: e */
    public final void m895e(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "<set-?>");
        this.f32580d = jSONObject;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32579c;
        $r1.put("user_id", $r2);
        JSONObject $r3 = this.f32580d;
        $r1.put("mutable_user_properties", $r3);
        JSONObject $r32 = this.f32581j;
        $r1.put("immutable_user_properties", $r32);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: h */
    public final JSONObject m894h() {
        JSONObject r1 = this.f32581j;
        return r1;
    }
}
