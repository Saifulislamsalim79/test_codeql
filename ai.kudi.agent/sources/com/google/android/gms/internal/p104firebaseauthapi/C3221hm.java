package com.google.android.gms.internal.p104firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hm */
/* loaded from: classes2.dex */
public final class C3221hm {

    /* renamed from: a */
    private Long f8552a;

    /* renamed from: b */
    private Long f8553b;

    /* renamed from: a */
    public static C3221hm m31043a(String str) throws UnsupportedEncodingException {
        try {
            C3221hm c3221hm = new C3221hm();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            c3221hm.f8552a = Long.valueOf(jSONObject.optLong("iat"));
            c3221hm.f8553b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return c3221hm;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Failed to read JwtToken from JSONObject. ");
                sb.append(valueOf);
                Log.d("JwtToken", sb.toString());
            }
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("Failed to read JwtToken from JSONObject. ");
            sb2.append(valueOf2);
            throw new UnsupportedEncodingException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final Long m31042b() {
        return this.f8553b;
    }

    /* renamed from: c */
    public final Long m31041c() {
        return this.f8552a;
    }
}
