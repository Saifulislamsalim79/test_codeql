package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xm */
/* loaded from: classes2.dex */
public final class C3641xm implements InterfaceC3690zj {

    /* renamed from: c */
    private String f9107c;

    /* renamed from: d */
    private String f9108d;

    /* renamed from: e */
    private final String f9109e;

    public C3641xm(String str) {
        this.f9109e = str;
    }

    public C3641xm(String str, String str2, String str3, String str4) {
        s.f(str);
        this.f9107c = str;
        s.f(str2);
        this.f9108d = str2;
        this.f9109e = str4;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f9107c;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f9108d;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f9109e;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
