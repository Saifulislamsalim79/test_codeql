package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import io.intercom.android.sdk.views.holder.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zm */
/* loaded from: classes2.dex */
public final class C3693zm implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f9159c;

    /* renamed from: d */
    private final String f9160d;

    /* renamed from: e */
    private final String f9161e;

    /* renamed from: f */
    private final String f9162f;

    /* renamed from: w */
    private final String f9163w;

    /* renamed from: x */
    private final String f9164x;

    /* renamed from: y */
    private C3193gl f9165y;

    private C3693zm(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(str);
        this.f9159c = str;
        s.f(AttributeType.PHONE);
        this.f9160d = AttributeType.PHONE;
        this.f9161e = str3;
        this.f9162f = str4;
        this.f9163w = str5;
        this.f9164x = str6;
    }

    /* renamed from: a */
    public static C3693zm m29882a(String str, String str2, String str3, String str4, String str5) {
        s.f(str2);
        return new C3693zm(str, AttributeType.PHONE, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public final String m29881b() {
        return this.f9162f;
    }

    /* renamed from: c */
    public final void m29880c(C3193gl c3193gl) {
        this.f9165y = c3193gl;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f9159c);
        this.f9160d.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f9161e != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f9161e);
            if (!TextUtils.isEmpty(this.f9163w)) {
                jSONObject2.put("recaptchaToken", this.f9163w);
            }
            if (!TextUtils.isEmpty(this.f9164x)) {
                jSONObject2.put("safetyNetToken", this.f9164x);
            }
            C3193gl c3193gl = this.f9165y;
            if (c3193gl != null) {
                jSONObject2.put("autoRetrievalInfo", c3193gl.m31092a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
