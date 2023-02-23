package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: Personalization.java */
/* renamed from: com.google.firebase.remoteconfig.internal.s */
/* loaded from: classes2.dex */
public class C6768s {

    /* renamed from: a */
    private final InterfaceC6560b<InterfaceC5174a> f16294a;

    /* renamed from: b */
    private final Map<String, String> f16295b = Collections.synchronizedMap(new HashMap());

    public C6768s(InterfaceC6560b<InterfaceC5174a> interfaceC6560b) {
        this.f16294a = interfaceC6560b;
    }

    /* renamed from: a */
    public void m20801a(String str, C6754k c6754k) {
        JSONObject optJSONObject;
        InterfaceC5174a interfaceC5174a = this.f16294a.get();
        if (interfaceC5174a == null) {
            return;
        }
        JSONObject m20874f = c6754k.m20874f();
        if (m20874f.length() < 1) {
            return;
        }
        JSONObject m20876d = c6754k.m20876d();
        if (m20876d.length() >= 1 && (optJSONObject = m20874f.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f16295b) {
                if (optString.equals(this.f16295b.get(str))) {
                    return;
                }
                this.f16295b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", m20876d.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                interfaceC5174a.mo22587c("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                interfaceC5174a.mo22587c("fp", "_fpc", bundle2);
            }
        }
    }
}
