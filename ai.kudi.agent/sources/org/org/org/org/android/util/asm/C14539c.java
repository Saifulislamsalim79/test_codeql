package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.android.util.asm.c */
/* loaded from: classes.dex */
public final class C14539c extends org.org.org.org.android.model.data.Item {

    /* renamed from: k */
    public static final C14541e f32136k;

    /* renamed from: c */
    public String f32137c;

    /* renamed from: d */
    public String f32138d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14541e $r0 = new C14541e(null);
        f32136k = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14539c(java.lang.String r17, java.lang.String r18, org.json.JSONObject r19) {
        /*
            r16 = this;
            java.lang.String r8 = "stackTrace"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.lang.String r8 = "screenName"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.lang.String r8 = "crashProps"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            org.org.org.org.android.model.data.Item r9 = new org.org.org.org.android.model.data.Item
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r19
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.C14539c.<init>(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14539c(String str, String str2, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(str, "stackTrace");
        Log_OC.getArray(str2, "screenName");
        Log_OC.getArray(item, "eventBase");
        this.f32137c = str;
        this.f32138d = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14539c(java.lang.String r16, java.lang.String r17, org.org.org.org.android.model.data.Item r18, int r19, kotlin.p483e0.p485d.DBUtils$1 r20) {
        /*
            r15 = this;
            r19 = r19 & 4
            if (r19 == 0) goto L19
            org.org.org.org.android.model.data.Item r18 = new org.org.org.org.android.model.data.Item
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 15
            r14 = 0
            r0 = r18
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7)
        L19:
            r0 = r16
            r1 = r17
            r2 = r18
            r15.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.C14539c.<init>(java.lang.String, java.lang.String, org.org.org.org.android.model.data.Item, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.model.data.Item, org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32137c;
        $r1.put("stack_trace", $r2);
        String $r22 = this.f32138d;
        $r1.put("screen_name", $r22);
        update($r1);
        return $r1;
    }
}
