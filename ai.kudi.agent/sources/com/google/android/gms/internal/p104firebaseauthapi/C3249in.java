package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.in */
/* loaded from: classes2.dex */
public final class C3249in implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8609c;

    /* renamed from: d */
    private final String f8610d;

    public C3249in(String str, String str2) {
        s.f(str);
        this.f8609c = str;
        this.f8610d = str2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f8609c);
        jSONObject.put("returnSecureToken", true);
        String str = this.f8610d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
