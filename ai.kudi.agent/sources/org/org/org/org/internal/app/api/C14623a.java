package org.org.org.org.internal.app.api;

import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
import org.org.org.org.internal.app.C14625h;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* renamed from: org.org.org.org.internal.app.api.a */
/* loaded from: classes.dex */
public final class C14623a implements b<e.a.a.a.b.d.b.b> {
    private C14623a() {
    }

    public /* synthetic */ C14623a(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1016a(JSONObject jSONObject) {
        Label $r1 = toString(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Label m1017a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Label $r3 = (Label) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1015b(String str) {
        Label $r1 = m1017a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label toString(JSONObject jSONObject) {
        C14624h $r9;
        Message $r11;
        Log_OC.getArray(jSONObject, "json");
        JSONObject $r2 = jSONObject.optJSONObject("recording");
        JSONObject $r3 = jSONObject.optJSONObject("consent");
        JSONObject $r4 = jSONObject.optJSONObject(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        boolean $z0 = jSONObject.getBoolean("recordingAllowed");
        String $r5 = jSONObject.optString("visitorUrlPattern");
        String $r6 = jSONObject.optString("sessionUrlPattern");
        org.org.org.org.internal.app.Label $r7 = null;
        if ($r2 != null) {
            b$c$a $r8 = C14624h.f32426m;
            $r9 = $r8.get($r2);
        } else {
            $r9 = null;
        }
        if ($r3 != null) {
            b$b$a $r10 = Message.f32417q;
            $r11 = $r10.add($r3);
        } else {
            $r11 = null;
        }
        if ($r4 != null) {
            C14625h $r12 = org.org.org.org.internal.app.Label.f32406b;
            $r7 = $r12.toString($r4);
        }
        Label $r13 = new Label($z0, $r5, $r6, $r9, $r7, $r11);
        return $r13;
    }
}
