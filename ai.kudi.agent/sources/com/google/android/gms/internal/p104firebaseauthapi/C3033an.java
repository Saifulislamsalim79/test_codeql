package com.google.android.gms.internal.p104firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.an */
/* loaded from: classes2.dex */
public final class C3033an implements InterfaceC3030ak<C3033an> {

    /* renamed from: d */
    private static final String f8212d = "an";

    /* renamed from: c */
    private String f8213c;

    /* renamed from: a */
    public final String m31415a() {
        return this.f8213c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3033an mo29936e(String str) throws zzpz {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.f8213c = C3516t1.m30222a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8212d, str);
        }
    }
}
