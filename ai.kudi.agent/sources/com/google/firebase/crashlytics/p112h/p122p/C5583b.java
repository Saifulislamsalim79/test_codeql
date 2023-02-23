package com.google.firebase.crashlytics.p112h.p122p;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.firebase.crashlytics.p112h.p115j.InterfaceC5405v;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5591a;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5592b;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5593c;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5595e;
import com.google.firebase.crashlytics.p112h.p122p.p123i.InterfaceC5594d;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: DefaultSettingsJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.p.b */
/* loaded from: classes2.dex */
class C5583b implements InterfaceC5589g {
    /* renamed from: b */
    private static C5591a m24395b(JSONObject jSONObject) throws JSONException {
        return new C5591a(jSONObject.getString(TransactionField.STATUS), jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* renamed from: c */
    private static C5592b m24394c(JSONObject jSONObject) {
        return new C5592b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C5593c m24393d(JSONObject jSONObject) {
        return new C5593c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static InterfaceC5594d m24392e(InterfaceC5405v interfaceC5405v) {
        JSONObject jSONObject = new JSONObject();
        return new C5595e(m24391f(interfaceC5405v, 3600L, jSONObject), null, m24393d(jSONObject), m24394c(jSONObject), 0, 3600);
    }

    /* renamed from: f */
    private static long m24391f(InterfaceC5405v interfaceC5405v, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + interfaceC5405v.mo24847a();
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.InterfaceC5589g
    /* renamed from: a */
    public C5595e mo24369a(InterfaceC5405v interfaceC5405v, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C5595e(m24391f(interfaceC5405v, optInt2, jSONObject), m24395b(jSONObject.getJSONObject("app")), m24393d(jSONObject.getJSONObject("session")), m24394c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
