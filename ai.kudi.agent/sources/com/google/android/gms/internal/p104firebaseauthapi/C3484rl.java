package com.google.android.gms.internal.p104firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rl */
/* loaded from: classes2.dex */
public final class C3484rl implements InterfaceC3030ak<C3484rl> {

    /* renamed from: e */
    private static final String f8918e = "rl";

    /* renamed from: c */
    private String f8919c;

    /* renamed from: d */
    private String f8920d;

    /* renamed from: a */
    public final String m30340a() {
        return this.f8919c;
    }

    /* renamed from: b */
    public final String m30339b() {
        return this.f8920d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3484rl mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8919c = jSONObject.optString("idToken", null);
            this.f8920d = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8918e, str);
        }
    }
}
