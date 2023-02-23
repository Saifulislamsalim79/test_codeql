package org.org.org.org.org.p602ui.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* renamed from: org.org.org.org.org.ui.asm.Type */
/* loaded from: classes.dex */
public final class Type implements Object {
    public static final C14718a SST;

    /* renamed from: a */
    public final int f32878a;

    /* renamed from: b */
    public final String f32879b;

    /* renamed from: c */
    public final int f32880c;

    /* renamed from: d */
    public final int f32881d;
    public final int first;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14718a $r0 = new C14718a(null);
        SST = $r0;
    }

    public Type(String str, int i, int i2, int i3, int i4) {
        Log_OC.getArray(str, "color");
        this.f32879b = str;
        this.f32881d = i;
        this.f32878a = i2;
        this.f32880c = i3;
        this.first = i4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Type(java.lang.String r12, android.graphics.Rect r13) {
        /*
            r11 = this;
            java.lang.String r6 = "color"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r6)
            java.lang.String r6 = "rect"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r6)
            int r7 = r13.left
            int r8 = r13.top
            int r9 = r13.width()
            int r10 = r13.height()
            r0 = r11
            r1 = r12
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.asm.Type.<init>(java.lang.String, android.graphics.Rect):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32879b;
        $r1.put("color", $r2);
        int $i0 = this.f32881d;
        $r1.put("x", $i0);
        int $i02 = this.f32878a;
        $r1.put("y", $i02);
        int $i03 = this.f32880c;
        $r1.put("w", $i03);
        int $i04 = this.first;
        $r1.put("h", $i04);
        return $r1;
    }
}
