package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gl */
/* loaded from: classes2.dex */
public final class C3193gl {

    /* renamed from: a */
    private final String f8519a;

    public C3193gl(String str) {
        s.f(str);
        this.f8519a = str;
    }

    /* renamed from: a */
    public final JSONObject m31092a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f8519a);
        return jSONObject;
    }
}
