package org.org.org.org.android.util.asm;

import e.a.a.a.f.u.n;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.asm.Text;
import org.org.org.org.asm.menu.C14607f;
/* loaded from: classes.dex */
public final class Type extends e.a.a.a.a.d.b.b implements n<Integer, e.a.a.a.a.b.f.i> {

    /* renamed from: a */
    public static final MethodWriter f32134a;

    /* renamed from: b */
    public EnumC14571f f32135b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        MethodWriter $r0 = new MethodWriter(null);
        f32134a = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Type(org.org.org.org.android.util.menu.EnumC14571f r16, long r17) {
        /*
            r15 = this;
            java.lang.String r8 = "orientation"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            org.org.org.org.android.model.data.Item r9 = new org.org.org.org.android.model.data.Item
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 13
            r14 = 0
            r0 = r9
            r1 = r10
            r2 = r17
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r16
            r15.<init>(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.Type.<init>(org.org.org.org.android.util.menu.f, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Type(EnumC14571f enumC14571f, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(enumC14571f, "orientation");
        Log_OC.getArray(item, "eventBase");
        this.f32135b = enumC14571f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Type(org.org.org.org.android.util.menu.EnumC14571f r16, org.org.org.org.android.model.data.Item r17, int r18, kotlin.p483e0.p485d.DBUtils$1 r19) {
        /*
            r15 = this;
            r18 = r18 & 2
            if (r18 == 0) goto L19
            org.org.org.org.android.model.data.Item r17 = new org.org.org.org.android.model.data.Item
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 15
            r14 = 0
            r0 = r17
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
            r15.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.Type.<init>(org.org.org.org.android.util.menu.f, org.org.org.org.android.model.data.Item, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Integer m1324a() {
        EnumC14571f $r1 = this.f32135b;
        int $i0 = $r1.m1200a();
        Integer $r2 = Integer.valueOf($i0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Type m1323a(long j) {
        EnumC14571f $r2 = this.f32135b;
        Type $r1 = new Type($r2, j);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object add() {
        Integer $r1 = m1324a();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Text add(long j) {
        Type $r0 = m1323a(j);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        EnumC14571f $r2 = this.f32135b;
        int $i0 = $r2.m1200a();
        $r1.put("orientation", $i0);
        update($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EnumC14571f getValue() {
        EnumC14571f r1 = this.f32135b;
        return r1;
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
