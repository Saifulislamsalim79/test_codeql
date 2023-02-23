package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.il */
/* loaded from: classes2.dex */
public final class C3247il implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8602c;

    /* renamed from: d */
    private final String f8603d;

    /* renamed from: e */
    private final String f8604e;

    public C3247il(String str, String str2) {
        s.f(str);
        this.f8602c = str;
        this.f8603d = "http://localhost";
        this.f8604e = str2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f8602c);
        jSONObject.put("continueUri", this.f8603d);
        String str = this.f8604e;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
