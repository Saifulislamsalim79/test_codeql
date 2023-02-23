package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ym */
/* loaded from: classes2.dex */
public final class C3667ym implements InterfaceC3030ak<C3667ym> {

    /* renamed from: f */
    private static final String f9131f = "ym";

    /* renamed from: c */
    private String f9132c;

    /* renamed from: d */
    private String f9133d;

    /* renamed from: e */
    private long f9134e;

    /* renamed from: a */
    public final long m29939a() {
        return this.f9134e;
    }

    /* renamed from: b */
    public final String m29938b() {
        return this.f9132c;
    }

    /* renamed from: c */
    public final String m29937c() {
        return this.f9133d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3667ym mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9132c = n.a(jSONObject.optString("idToken", null));
            n.a(jSONObject.optString("displayName", null));
            n.a(jSONObject.optString("email", null));
            this.f9133d = n.a(jSONObject.optString("refreshToken", null));
            this.f9134e = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f9131f, str);
        }
    }
}
