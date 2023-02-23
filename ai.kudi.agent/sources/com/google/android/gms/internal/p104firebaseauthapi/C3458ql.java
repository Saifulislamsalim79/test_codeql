package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import io.intercom.android.sdk.views.holder.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ql */
/* loaded from: classes2.dex */
public final class C3458ql implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8892c;

    /* renamed from: d */
    private final String f8893d;

    /* renamed from: e */
    private final String f8894e;

    /* renamed from: f */
    private final String f8895f;

    C3458ql(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(AttributeType.PHONE);
        this.f8892c = AttributeType.PHONE;
        s.f(str2);
        this.f8893d = str2;
        this.f8894e = str3;
        this.f8895f = str4;
    }

    /* renamed from: a */
    public static C3458ql m30403a(String str, String str2, String str3) {
        s.f(str3);
        s.f(str2);
        return new C3458ql(AttributeType.PHONE, str, str2, str3, null, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f8892c.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f8893d);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f8894e;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f8895f;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
