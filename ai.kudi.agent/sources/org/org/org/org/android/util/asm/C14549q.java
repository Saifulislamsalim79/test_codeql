package org.org.org.org.android.util.asm;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
/* renamed from: org.org.org.org.android.util.asm.q */
/* loaded from: classes.dex */
public final class C14549q implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.a> {
    private C14549q() {
    }

    public /* synthetic */ C14549q(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1286a(JSONObject jSONObject) {
        Plot $r1 = update(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1285b(String str) {
        Plot $r1 = m1284c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Plot m1284c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Plot $r3 = (Plot) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Plot update(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("vc_class_name");
        Log_OC.loadImage($r3, "json.getString(\"vc_class_name\")");
        ViewType.C7217a $r4 = ViewType.Companion;
        ViewType $r6 = ViewType.C7217a.m19118a($r4, jSONObject.getString("type"), null, 2, null);
        ViewState.C7216a $r7 = ViewState.Companion;
        String $r5 = jSONObject.getString(SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.loadImage($r5, "json.getString(\"state\")");
        ViewState $r8 = ViewState.C7216a.m19120a($r7, $r5, null, 2, null);
        long $l0 = jSONObject.getLong("duration");
        Log $r9 = org.org.org.org.android.model.data.Item.f32102a;
        org.org.org.org.android.model.data.Item $r10 = $r9.get(jSONObject);
        Plot $r2 = new Plot($r3, $r6, $r8, $l0, $r10);
        return $r2;
    }
}
