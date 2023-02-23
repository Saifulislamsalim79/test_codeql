package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pm */
/* loaded from: classes2.dex */
public final class C3433pm implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8860c;

    /* renamed from: d */
    private final String f8861d;

    /* renamed from: e */
    private final String f8862e;

    public C3433pm(String str, String str2, String str3) {
        s.f(str);
        this.f8860c = str;
        this.f8861d = str2;
        this.f8862e = str3;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f8860c);
        String str = this.f8861d;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f8862e;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
