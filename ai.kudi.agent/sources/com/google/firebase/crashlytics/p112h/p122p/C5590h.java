package com.google.firebase.crashlytics.p112h.p122p;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.firebase.crashlytics.p112h.p115j.InterfaceC5405v;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5591a;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5592b;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5593c;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5595e;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsV3JsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.p.h */
/* loaded from: classes2.dex */
class C5590h implements InterfaceC5589g {
    /* renamed from: b */
    private static C5591a m24368b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString(TransactionField.STATUS);
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        return new C5591a(string, equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2), String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, jSONObject.getString("org_id"), jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    /* renamed from: c */
    private static C5592b m24367c(JSONObject jSONObject) {
        return new C5592b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C5593c m24366d() {
        return new C5593c(8, 4);
    }

    /* renamed from: e */
    private static long m24365e(InterfaceC5405v interfaceC5405v, long j, JSONObject jSONObject) {
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
        return new C5595e(m24365e(interfaceC5405v, optInt2, jSONObject), m24368b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), m24366d(), m24367c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
