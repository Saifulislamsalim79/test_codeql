package org.org.org.org.android.http.util;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import e.a.a.a.f.z.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Item;
import org.org.org.org.android.model.data.Log;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* renamed from: org.org.org.org.android.http.util.a */
/* loaded from: classes.dex */
public final class C14533a implements b<e.a.a.a.a.c.b.b> {
    private C14533a() {
    }

    public /* synthetic */ C14533a(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1377a(JSONObject jSONObject) {
        Label $r1 = run(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Label m1378a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Label $r3 = (Label) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1376b(String str) {
        Label $r1 = m1378a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label run(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Log_OC.loadImage($r3, "json.getString(\"url\")");
        String $r4 = jSONObject.getString("method");
        Log_OC.loadImage($r4, "json.getString(\"method\")");
        JSONArray $r5 = jSONObject.getJSONArray("request_headers");
        b$a$a $r6 = b$a$a.f32095o;
        List $r7 = Collection.m1056a($r5, $r6);
        JSONArray $r52 = jSONObject.getJSONArray("response_headers");
        b$a$b $r8 = b$a$b.f32096o;
        List $r9 = Collection.m1056a($r52, $r8);
        String $r10 = jSONObject.getString("protocol");
        Log_OC.loadImage($r10, "json.getString(\"protocol\")");
        String $r11 = jSONObject.getString("initiator");
        Log_OC.loadImage($r11, "json.getString(\"initiator\")");
        long $l0 = jSONObject.getLong("duration");
        String $r12 = jSONObject.getString(TransactionField.STATUS);
        Log_OC.loadImage($r12, "json.getString(\"status\")");
        int $i1 = jSONObject.getInt("statusCode");
        boolean $z0 = jSONObject.getBoolean("cached");
        Log $r13 = Item.f32102a;
        Item $r14 = $r13.get(jSONObject);
        Label $r2 = new Label($r3, $r4, $r7, $r9, $r10, $r11, $l0, $r12, $i1, $z0, $r14);
        return $r2;
    }
}
