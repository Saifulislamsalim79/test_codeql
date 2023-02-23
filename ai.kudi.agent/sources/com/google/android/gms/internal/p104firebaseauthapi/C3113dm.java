package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dm */
/* loaded from: classes2.dex */
public final class C3113dm implements InterfaceC3030ak<C3113dm> {

    /* renamed from: d */
    private static final String f8404d = "dm";

    /* renamed from: c */
    private List<String> f8405c;

    /* renamed from: a */
    public final C3113dm m31232a(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8405c = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f8405c.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw C3512sn.m30265a(e, f8404d, str);
        }
    }

    /* renamed from: b */
    public final List<String> m31231b() {
        return this.f8405c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3113dm mo29936e(String str) throws zzpz {
        m31232a(str);
        return this;
    }
}
