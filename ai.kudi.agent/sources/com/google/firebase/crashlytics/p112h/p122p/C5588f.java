package com.google.firebase.crashlytics.p112h.p122p;

import com.google.firebase.crashlytics.p112h.p115j.InterfaceC5405v;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5595e;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsJsonParser.java */
/* renamed from: com.google.firebase.crashlytics.h.p.f */
/* loaded from: classes2.dex */
public class C5588f {

    /* renamed from: a */
    private final InterfaceC5405v f13785a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5588f(InterfaceC5405v interfaceC5405v) {
        this.f13785a = interfaceC5405v;
    }

    /* renamed from: a */
    private static InterfaceC5589g m24371a(int i) {
        if (i != 3) {
            return new C5583b();
        }
        return new C5590h();
    }

    /* renamed from: b */
    public C5595e m24370b(JSONObject jSONObject) throws JSONException {
        return m24371a(jSONObject.getInt("settings_version")).mo24369a(this.f13785a, jSONObject);
    }
}
