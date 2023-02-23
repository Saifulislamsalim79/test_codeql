package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import io.intercom.android.sdk.views.holder.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ol */
/* loaded from: classes2.dex */
public final class C3406ol implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8803c;

    /* renamed from: d */
    private String f8804d;

    /* renamed from: e */
    private final String f8805e;

    /* renamed from: f */
    private final String f8806f;

    /* renamed from: w */
    private final String f8807w;

    C3406ol(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.f(AttributeType.PHONE);
        this.f8803c = AttributeType.PHONE;
        s.f(str2);
        this.f8804d = str2;
        this.f8805e = str3;
        this.f8807w = str4;
        this.f8806f = str7;
    }

    /* renamed from: a */
    public static C3406ol m30496a(String str, String str2, String str3, String str4) {
        s.f(str3);
        s.f(str2);
        return new C3406ol(AttributeType.PHONE, str, str2, str3, null, null, str4);
    }

    /* renamed from: b */
    public final C3406ol m30495b(String str) {
        this.f8804d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f8804d);
        this.f8803c.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f8806f;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f8805e;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f8807w;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
