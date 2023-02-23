package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.n;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mn */
/* loaded from: classes2.dex */
public final class C3356mn implements InterfaceC3030ak<C3356mn> {

    /* renamed from: x */
    private static final String f8735x = "mn";

    /* renamed from: c */
    private String f8736c;

    /* renamed from: d */
    private String f8737d;

    /* renamed from: e */
    private long f8738e;

    /* renamed from: f */
    private List<C3248im> f8739f;

    /* renamed from: w */
    private String f8740w;

    /* renamed from: a */
    public final long m30654a() {
        return this.f8738e;
    }

    /* renamed from: b */
    public final String m30653b() {
        return this.f8736c;
    }

    /* renamed from: c */
    public final String m30652c() {
        return this.f8740w;
    }

    /* renamed from: d */
    public final String m30651d() {
        return this.f8737d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3356mn mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            n.a(jSONObject.optString("localId", null));
            n.a(jSONObject.optString("email", null));
            n.a(jSONObject.optString("displayName", null));
            this.f8736c = n.a(jSONObject.optString("idToken", null));
            n.a(jSONObject.optString("photoUrl", null));
            this.f8737d = n.a(jSONObject.optString("refreshToken", null));
            this.f8738e = jSONObject.optLong("expiresIn", 0L);
            this.f8739f = C3248im.m30955u(jSONObject.optJSONArray("mfaInfo"));
            this.f8740w = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8735x, str);
        }
    }

    /* renamed from: f */
    public final List<C3248im> m30650f() {
        return this.f8739f;
    }

    /* renamed from: g */
    public final boolean m30649g() {
        return !TextUtils.isEmpty(this.f8740w);
    }
}
