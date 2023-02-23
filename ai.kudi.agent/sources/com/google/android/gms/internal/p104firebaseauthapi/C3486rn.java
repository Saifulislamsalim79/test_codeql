package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rn */
/* loaded from: classes2.dex */
public final class C3486rn implements InterfaceC3030ak<C3486rn> {

    /* renamed from: e */
    private static final String f8921e = "rn";

    /* renamed from: c */
    private String f8922c;

    /* renamed from: d */
    private String f8923d;

    /* renamed from: a */
    public final String m30338a() {
        return this.f8922c;
    }

    /* renamed from: b */
    public final String m30337b() {
        return this.f8923d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3486rn mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8922c = n.a(jSONObject.optString("idToken", null));
            this.f8923d = n.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8921e, str);
        }
    }
}
