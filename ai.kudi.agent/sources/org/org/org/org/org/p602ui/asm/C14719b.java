package org.org.org.org.org.p602ui.asm;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import e.a.a.a.c.l.e.f;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.menu.Object;
import org.org.org.org.asm.util.Collection;
/* renamed from: org.org.org.org.org.ui.asm.b */
/* loaded from: classes.dex */
public final class C14719b implements Object {

    /* renamed from: l */
    public static final ByteVector f32882l;

    /* renamed from: a */
    public int f32883a;

    /* renamed from: b */
    public final float f32884b;

    /* renamed from: c */
    public int f32885c;

    /* renamed from: d */
    public int f32886d;

    /* renamed from: f */
    public List<f> f32887f;

    /* renamed from: j */
    public int f32888j;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ByteVector $r0 = new ByteVector(null);
        f32882l = $r0;
    }

    public C14719b(float f, int i, int i2, int i3, int i4, List list) {
        Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
        this.f32884b = f;
        this.f32886d = i;
        this.f32888j = i2;
        this.f32885c = i3;
        this.f32883a = i4;
        this.f32887f = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14719b(float r13, android.graphics.Rect r14, java.util.List r15) {
        /*
            r12 = this;
            java.lang.String r7 = "rect"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r7)
            java.lang.String r7 = "data"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r7)
            int r8 = r14.left
            int r9 = r14.top
            int r10 = r14.width()
            int r11 = r14.height()
            r0 = r12
            r1 = r13
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.asm.C14719b.<init>(float, android.graphics.Rect, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        float $f0 = this.f32884b;
        Float $r2 = Float.valueOf($f0);
        $r1.put("dim_amount", $r2);
        int $i0 = this.f32886d;
        $r1.put("x", $i0);
        int $i02 = this.f32888j;
        $r1.put("y", $i02);
        int $i03 = this.f32885c;
        $r1.put("w", $i03);
        int $i04 = this.f32883a;
        $r1.put("h", $i04);
        List $r3 = this.f32887f;
        JSONArray $r4 = Collection.add($r3);
        $r1.put(TransactionBreakDownItemType.DATA, $r4);
        return $r1;
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
