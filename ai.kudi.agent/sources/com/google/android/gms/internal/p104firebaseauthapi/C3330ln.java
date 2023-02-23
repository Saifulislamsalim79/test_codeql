package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ln */
/* loaded from: classes2.dex */
public final class C3330ln implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8709c;

    /* renamed from: d */
    private final String f8710d;

    /* renamed from: e */
    private final String f8711e;

    public C3330ln(String str, String str2, String str3) {
        s.f(str);
        this.f8709c = str;
        s.f(str2);
        this.f8710d = str2;
        this.f8711e = str3;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f8709c);
        jSONObject.put("password", this.f8710d);
        jSONObject.put("returnSecureToken", true);
        String str = this.f8711e;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
