package com.google.firebase.crashlytics.p112h.p113h;

import android.os.Bundle;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5343a;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5344b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* renamed from: com.google.firebase.crashlytics.h.h.d */
/* loaded from: classes2.dex */
public class C5340d implements InterfaceC5338b, InterfaceC5344b {

    /* renamed from: a */
    private InterfaceC5343a f13194a;

    /* renamed from: b */
    private static String m25089b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.p112h.p114i.InterfaceC5344b
    /* renamed from: a */
    public void mo25087a(InterfaceC5343a interfaceC5343a) {
        this.f13194a = interfaceC5343a;
        C5335f.m25102f().m25106b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.p112h.p113h.InterfaceC5338b
    public void onEvent(String str, Bundle bundle) {
        InterfaceC5343a interfaceC5343a = this.f13194a;
        if (interfaceC5343a != null) {
            try {
                interfaceC5343a.mo25074a("$A$:" + m25089b(str, bundle));
            } catch (JSONException unused) {
                C5335f.m25102f().m25097k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
