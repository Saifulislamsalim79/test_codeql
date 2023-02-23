package org.org.org.org.android.util.asm;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import e.a.a.a.f.u.n;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.asm.Text;
import org.org.org.org.asm.menu.C14607f;
/* loaded from: classes.dex */
public final class Plot extends e.a.a.a.a.d.b.b implements n<String, e.a.a.a.a.b.f.a> {

    /* renamed from: a */
    public static final C14549q f32129a;

    /* renamed from: c */
    public final String f32130c;

    /* renamed from: d */
    public final long f32131d;

    /* renamed from: q */
    public final ViewState f32132q;

    /* renamed from: r */
    public final ViewType f32133r;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14549q $r0 = new C14549q(null);
        f32129a = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Plot(java.lang.String r16, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType r17, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState r18, long r19, long r21) {
        /*
            r15 = this;
            java.lang.String r8 = "name"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.lang.String r8 = "type"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.lang.String r8 = "state"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            org.org.org.org.android.model.data.Item r9 = new org.org.org.org.android.model.data.Item
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 13
            r14 = 0
            r0 = r9
            r1 = r10
            r2 = r21
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.Plot.<init>(java.lang.String, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState, long, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plot(String str, ViewType viewType, ViewState viewState, long j, org.org.org.org.android.model.data.Item item) {
        super(item);
        Log_OC.getArray(str, "name");
        Log_OC.getArray(viewType, "type");
        Log_OC.getArray(viewState, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(item, "eventBase");
        this.f32130c = str;
        this.f32133r = viewType;
        this.f32132q = viewState;
        this.f32131d = j;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Plot(java.lang.String r16, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType r17, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState r18, long r19, org.org.org.org.android.model.data.Item r21, int r22, kotlin.p483e0.p485d.DBUtils$1 r23) {
        /*
            r15 = this;
            r22 = r22 & 16
            if (r22 == 0) goto L1a
            org.org.org.org.android.model.data.Item r21 = new org.org.org.org.android.model.data.Item
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 15
            r14 = 0
            r0 = r21
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7)
            goto L1a
        L1a:
            r15.<init>(r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.Plot.<init>(java.lang.String, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType, com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState, long, org.org.org.org.android.model.data.Item, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public String m1326a() {
        StringBuilder $r1 = new StringBuilder();
        String $r2 = this.f32130c;
        $r1.append($r2);
        ViewType $r3 = this.f32133r;
        String $r22 = $r3.getCode();
        $r1.append($r22);
        ViewState $r4 = this.f32132q;
        String $r23 = $r4.getCode();
        $r1.append($r23);
        String $r24 = $r1.toString();
        return $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Plot m1325a(long j) {
        String $r1 = this.f32130c;
        ViewType $r2 = this.f32133r;
        ViewState $r3 = this.f32132q;
        long $l1 = this.f32131d;
        Plot $r4 = new Plot($r1, $r2, $r3, $l1, j);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object add() {
        String $r1 = m1326a();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Text add(long j) {
        Plot $r0 = m1325a(j);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32130c;
        $r1.put("vc_class_name", $r2);
        ViewType $r3 = this.f32133r;
        String $r22 = $r3.getCode();
        $r1.put("type", $r22);
        ViewState $r4 = this.f32132q;
        String $r23 = $r4.getCode();
        $r1.put(SendReceiptToTerminalConfirmationBottomSheet.STATE, $r23);
        long $l0 = this.f32131d;
        $r1.put("duration", $l0);
        update($r1);
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
