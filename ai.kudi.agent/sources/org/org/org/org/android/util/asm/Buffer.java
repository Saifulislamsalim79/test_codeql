package org.org.org.org.android.util.asm;

import e.a.a.a.f.u.n;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.asm.Text;
import org.org.org.org.asm.menu.C14607f;
/* loaded from: classes.dex */
public final class Buffer extends e.a.a.a.a.d.b.b implements n<String, e.a.a.a.a.b.f.d> {
    public static final C14546l head;

    /* renamed from: s */
    public final String f32116s;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14546l $r0 = new C14546l(null);
        head = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Buffer(java.lang.String r16, long r17) {
        /*
            r15 = this;
            java.lang.String r8 = "eventTrackingModes"
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
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.Buffer.<init>(java.lang.String, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Buffer(String str, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(str, "eventTrackingModes");
        Log_OC.getArray(item, "eventBase");
        this.f32116s = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object add() {
        String $r1 = getValue();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Text add(long j) {
        Buffer $r0 = write(j);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32116s;
        $r1.put("event_tracking_modes", $r2);
        update($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getValue() {
        String r1 = this.f32116s;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Buffer write(long j) {
        String $r2 = this.f32116s;
        Buffer $r1 = new Buffer($r2, j);
        return $r1;
    }
}
