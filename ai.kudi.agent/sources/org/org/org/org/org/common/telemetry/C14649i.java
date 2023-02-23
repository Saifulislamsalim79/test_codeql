package org.org.org.org.org.common.telemetry;

import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import e.a.a.a.f.z.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Attribute;
import org.org.org.org.android.util.asm.Buffer;
import org.org.org.org.android.util.asm.Plot;
import org.org.org.org.android.util.asm.Type;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.Vector3;
import org.org.org.org.asm.graph.C14601i;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.asm.util.Collection;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* renamed from: org.org.org.org.org.common.telemetry.i */
/* loaded from: classes.dex */
public final class C14649i implements b<e.a.a.a.c.m.e.b> {
    private C14649i() {
    }

    public /* synthetic */ C14649i(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m892a(JSONObject jSONObject) {
        Item $r1 = m890b(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Item m893a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Item $r3 = (Item) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item add(int i, long j, int i2, Item item) {
        Log_OC.getArray(item, "lastRecord");
        long $l3 = System.currentTimeMillis();
        C14601i $r3 = C14601i.f32355b;
        String $r4 = $r3.add();
        long $l4 = item.getTitle();
        int $i5 = item.insert();
        int $i6 = item.length();
        int $i7 = item.getStatus();
        int $i8 = item.getTag();
        Item $r2 = new Item(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, $r4, i, false, $l3, 0L, $l4, null, $i5, $i6, $i7, $i8, j, i2, 2785279, null);
        Vector3 $r5 = Vector3.f32313z;
        List $r6 = item.get();
        $r2.set($r5.parse($r6, $l3));
        List $r62 = item.getHref();
        $r2.update($r5.parse($r62, $l3));
        List $r63 = item.getText();
        $r2.setData($r5.parse($r63, $l3));
        List $r64 = item.getContent();
        $r2.setContent($r5.parse($r64, $l3));
        String $r42 = item.save();
        $r2.set($r42);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item add(int i, long j, long j2, int i2, String str, EnumC14571f enumC14571f, String str2, String str3, String str4, WebGLRecordingMode webGLRecordingMode) {
        Log_OC.getArray(str, "activityName");
        Log_OC.getArray(enumC14571f, "orientation");
        Log_OC.getArray(str2, "connection");
        Log_OC.getArray(str3, "renderingMode");
        Log_OC.getArray(str4, "eventTrackingModes");
        long $l4 = System.currentTimeMillis();
        C14601i $r8 = C14601i.f32355b;
        String $r9 = $r8.add();
        Item $r7 = new Item(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, $r9, i, false, $l4, 0L, j, null, 0, 0, 0, 0, j2, i2, 65699839, null);
        Type $r10 = new Type(enumC14571f, $l4);
        $r7.toString($r10);
        Attribute $r11 = new Attribute(str2, $l4);
        $r7.set($r11);
        org.org.org.org.org.p602ui.asm.Attribute $r12 = new org.org.org.org.org.p602ui.asm.Attribute(str3, $l4);
        $r7.set($r12);
        Buffer $r13 = new Buffer(str4, $l4);
        $r7.set($r13);
        ViewType $r15 = ViewType.ACTIVITY;
        ViewState $r16 = ViewState.START;
        Plot $r14 = new Plot(str, $r15, $r16, -1L, null, 16, null);
        $r7.set($r14);
        if (webGLRecordingMode != null) {
            $r7.set("webgl");
        }
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m891b(String str) {
        Item $r1 = m893a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public Item m890b(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        JSONArray $r3 = jSONObject.getJSONArray("multi_touches");
        b$a$f $r4 = b$a$f.f32569o;
        List $r5 = Collection.get($r3, $r4);
        JSONArray $r32 = jSONObject.getJSONArray("selector_events");
        b$a$g $r6 = b$a$g.f32570o;
        List $r7 = Collection.get($r32, $r6);
        JSONArray $r33 = jSONObject.getJSONArray("rage_click_events");
        b$a$h $r8 = b$a$h.f32571o;
        List $r9 = Collection.get($r33, $r8);
        JSONArray $r34 = jSONObject.getJSONArray("vc_appear_events");
        b$a$i $r10 = b$a$i.f32572o;
        List $r11 = Collection.get($r34, $r10);
        JSONArray $r35 = jSONObject.getJSONArray("orientation_events");
        b$a$j $r12 = b$a$j.f32573o;
        List $r13 = Collection.get($r35, $r12);
        JSONArray $r36 = jSONObject.getJSONArray("keyboard_events");
        b$a$k $r14 = b$a$k.f32574o;
        List $r15 = Collection.get($r36, $r14);
        JSONArray $r37 = jSONObject.getJSONArray("requests");
        b$a$l $r16 = b$a$l.f32575o;
        List $r17 = Collection.get($r37, $r16);
        JSONArray $r38 = jSONObject.getJSONArray("connection_events");
        b$a$m $r18 = b$a$m.f32576o;
        List $r19 = Collection.get($r38, $r18);
        JSONArray $r39 = jSONObject.getJSONArray("rendering_mode_events");
        b$a$n $r20 = b$a$n.f32577o;
        List $r21 = Collection.get($r39, $r20);
        JSONArray $r310 = jSONObject.getJSONArray("event_tracking_mode_events");
        b$a$a $r22 = b$a$a.f32564o;
        List $r23 = Collection.get($r310, $r22);
        JSONArray $r311 = jSONObject.getJSONArray("crash_events");
        b$a$b $r24 = b$a$b.f32565o;
        List $r25 = Collection.get($r311, $r24);
        JSONArray $r312 = jSONObject.getJSONArray("gestures");
        b$a$c $r26 = b$a$c.f32566b;
        List $r27 = Collection.read($r312, $r26);
        JSONArray $r313 = jSONObject.getJSONArray("custom_events");
        b$a$d $r28 = b$a$d.f32567o;
        List $r29 = Collection.get($r313, $r28);
        String $r30 = Collection.getString(jSONObject, "rendering_type");
        JSONArray $r314 = jSONObject.getJSONArray("rendering_data");
        b$a$e $r31 = b$a$e.f32568o;
        List $r322 = Collection.get($r314, $r31);
        String $r332 = jSONObject.getString("rid");
        Log_OC.loadImage($r332, "json.getString(\"rid\")");
        int $i0 = jSONObject.getInt("index");
        boolean $z0 = jSONObject.getBoolean("closing_session");
        long $l1 = jSONObject.getLong("start_timestamp");
        long $l2 = jSONObject.getLong("end_timestamp");
        long $l3 = jSONObject.getLong("session_start_timestamp");
        Long $r342 = Collection.set(jSONObject, "session_end_timestamp");
        int $i4 = jSONObject.getInt("videoWidth");
        int $i5 = jSONObject.getInt("videoHeight");
        int $i6 = jSONObject.getInt("screenX");
        int $i7 = jSONObject.getInt("screenY");
        long $l8 = jSONObject.getLong(IjkMediaMeta.IJKM_KEY_BITRATE);
        int $i9 = jSONObject.getInt("framerate");
        Item $r2 = new Item($r5, $r7, $r9, $r11, $r13, $r15, $r17, $r19, $r21, $r23, $r25, $r27, $r29, $r30, $r322, $r332, $i0, $z0, $l1, $l2, $l3, $r342, $i4, $i5, $i6, $i7, $l8, $i9);
        return $r2;
    }
}
