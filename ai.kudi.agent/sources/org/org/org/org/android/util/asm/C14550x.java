package org.org.org.org.android.util.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.android.util.asm.x */
/* loaded from: classes.dex */
public final class C14550x extends org.org.org.org.android.model.data.Item implements org.org.org.org.org.common.data.Item {

    /* renamed from: b */
    public static final C14548o f32163b;

    /* renamed from: a */
    public C14544h f32164a;

    /* renamed from: c */
    public String f32165c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14548o $r0 = new C14548o(null);
        f32163b = $r0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14550x(String str, C14544h c14544h, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(str, "type");
        Log_OC.getArray(c14544h, "viewFrame");
        Log_OC.getArray(item, "eventBase");
        this.f32165c = str;
        this.f32164a = c14544h;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14550x(java.lang.String r16, org.org.org.org.android.util.asm.C14544h r17, org.org.org.org.android.model.data.Item r18, int r19, kotlin.p483e0.p485d.DBUtils$1 r20) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.C14550x.<init>(java.lang.String, org.org.org.org.android.util.asm.h, org.org.org.org.android.model.data.Item, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.data.Item
    /* renamed from: a */
    public void mo936a(double d, double d2) {
        C14544h $r1 = this.f32164a;
        $r1.m1303a(d, d2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.model.data.Item, org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r3 = this.f32165c;
        $r1.put("type", $r3);
        C14544h $r4 = this.f32164a;
        JSONObject $r2 = $r4.equals();
        $r1.put("frame", $r2);
        update($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.data.Item
    public long getId() {
        long $l0 = getName();
        return $l0;
    }
}
