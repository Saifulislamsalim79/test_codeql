package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ll */
/* loaded from: classes2.dex */
public final class C3328ll implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8708c;

    public C3328ll(String str) {
        s.f(str);
        this.f8708c = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f8708c);
        return jSONObject.toString();
    }
}
