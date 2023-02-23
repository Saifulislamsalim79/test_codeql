package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tl */
/* loaded from: classes2.dex */
public final class C3536tl implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8986c = EnumC3510sl.REFRESH_TOKEN.toString();

    /* renamed from: d */
    private final String f8987d;

    public C3536tl(String str) {
        s.f(str);
        this.f8987d = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f8986c);
        jSONObject.put("refreshToken", this.f8987d);
        return jSONObject.toString();
    }
}
