package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qn */
/* loaded from: classes2.dex */
public final class C3460qn implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8901c;

    /* renamed from: d */
    private final String f8902d;

    public C3460qn(String str, String str2) {
        s.f(str);
        this.f8901c = str;
        s.f(str2);
        this.f8902d = str2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f8901c);
        jSONObject.put("mfaEnrollmentId", this.f8902d);
        return jSONObject.toString();
    }
}
