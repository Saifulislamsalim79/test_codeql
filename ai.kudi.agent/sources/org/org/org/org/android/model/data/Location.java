package org.org.org.org.android.model.data;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class Location extends Item {
    public static final C14535h url;

    /* renamed from: id */
    public long f32106id;
    public String path;
    public String value;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14535h $r0 = new C14535h(null);
        url = $r0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Location(String str, long j, String str2, Item item) {
        super(item);
        Log_OC.getArray(str, "name");
        Log_OC.getArray(item, "eventBase");
        this.value = str;
        this.f32106id = j;
        this.path = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Location(java.lang.String r17, org.json.JSONObject r18, long r19, java.lang.String r21) {
        /*
            r16 = this;
            java.lang.String r8 = "name"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            org.org.org.org.android.model.data.Item r9 = new org.org.org.org.android.model.data.Item
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 11
            r15 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r18
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r16
            r1 = r17
            r2 = r19
            r4 = r21
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.model.data.Location.<init>(java.lang.String, org.json.JSONObject, long, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Location(java.lang.String r2, org.json.JSONObject r3, long r4, java.lang.String r6, int r7, kotlin.p483e0.p485d.DBUtils$1 r8) {
        /*
            r1 = this;
            r0 = r7 & 4
            if (r0 == 0) goto L6
            r4 = -1
        L6:
            r7 = r7 & 8
            if (r7 == 0) goto Lc
            java.lang.String r6 = ""
        Lc:
            r1.<init>(r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.model.data.Location.<init>(java.lang.String, org.json.JSONObject, long, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.model.data.Item, org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.value;
        $r1.put("name", $r2);
        long $l0 = this.f32106id;
        $r1.put("duration", $l0);
        String $r22 = this.path;
        $r1.put("reason", $r22);
        update($r1);
        return $r1;
    }
}
