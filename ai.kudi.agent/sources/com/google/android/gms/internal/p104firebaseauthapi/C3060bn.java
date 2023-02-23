package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import io.intercom.android.sdk.views.holder.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bn */
/* loaded from: classes2.dex */
public final class C3060bn implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8260c;

    /* renamed from: d */
    private final String f8261d;

    /* renamed from: e */
    private final String f8262e;

    /* renamed from: f */
    private final String f8263f;

    /* renamed from: w */
    private final String f8264w;

    /* renamed from: x */
    private final String f8265x;

    /* renamed from: y */
    private final String f8266y;

    /* renamed from: z */
    private C3193gl f8267z;

    private C3060bn(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.f(AttributeType.PHONE);
        this.f8260c = AttributeType.PHONE;
        s.f(str2);
        this.f8261d = str2;
        s.f(str3);
        this.f8262e = str3;
        this.f8264w = str4;
        this.f8263f = str5;
        this.f8265x = str6;
        this.f8266y = str7;
    }

    /* renamed from: a */
    public static C3060bn m31356a(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(str3);
        return new C3060bn(AttributeType.PHONE, str, str2, str3, str4, str5, str6);
    }

    /* renamed from: b */
    public final String m31355b() {
        return this.f8263f;
    }

    /* renamed from: c */
    public final void m31354c(C3193gl c3193gl) {
        this.f8267z = c3193gl;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f8261d);
        jSONObject.put("mfaEnrollmentId", this.f8262e);
        this.f8260c.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f8264w != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f8264w);
            if (!TextUtils.isEmpty(this.f8265x)) {
                jSONObject2.put("recaptchaToken", this.f8265x);
            }
            if (!TextUtils.isEmpty(this.f8266y)) {
                jSONObject2.put("safetyNetToken", this.f8266y);
            }
            C3193gl c3193gl = this.f8267z;
            if (c3193gl != null) {
                jSONObject2.put("autoRetrievalInfo", c3193gl.m31092a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
