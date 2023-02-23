package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nl */
/* loaded from: classes2.dex */
public final class C3380nl implements InterfaceC3030ak<C3380nl> {

    /* renamed from: y */
    private static final String f8781y = "nl";

    /* renamed from: c */
    private String f8782c;

    /* renamed from: d */
    private String f8783d;

    /* renamed from: e */
    private boolean f8784e;

    /* renamed from: f */
    private long f8785f;

    /* renamed from: w */
    private List<C3248im> f8786w;

    /* renamed from: x */
    private String f8787x;

    /* renamed from: a */
    public final long m30537a() {
        return this.f8785f;
    }

    /* renamed from: b */
    public final String m30536b() {
        return this.f8782c;
    }

    /* renamed from: c */
    public final String m30535c() {
        return this.f8787x;
    }

    /* renamed from: d */
    public final String m30534d() {
        return this.f8783d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3380nl mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.f8782c = jSONObject.optString("idToken", null);
            this.f8783d = jSONObject.optString("refreshToken", null);
            this.f8784e = jSONObject.optBoolean("isNewUser", false);
            this.f8785f = jSONObject.optLong("expiresIn", 0L);
            this.f8786w = C3248im.m30955u(jSONObject.optJSONArray("mfaInfo"));
            this.f8787x = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8781y, str);
        }
    }

    /* renamed from: f */
    public final List<C3248im> m30533f() {
        return this.f8786w;
    }

    /* renamed from: g */
    public final boolean m30532g() {
        return !TextUtils.isEmpty(this.f8787x);
    }

    /* renamed from: h */
    public final boolean m30531h() {
        return this.f8784e;
    }
}
