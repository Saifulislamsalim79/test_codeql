package com.google.android.gms.internal.p104firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pl */
/* loaded from: classes2.dex */
public final class C3432pl implements InterfaceC3030ak<C3432pl> {

    /* renamed from: e */
    private static final String f8857e = "pl";

    /* renamed from: c */
    private String f8858c;

    /* renamed from: d */
    private String f8859d;

    /* renamed from: a */
    public final String m30460a() {
        return this.f8858c;
    }

    /* renamed from: b */
    public final String m30459b() {
        return this.f8859d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3432pl mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8858c = jSONObject.optString("idToken", null);
            this.f8859d = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8857e, str);
        }
    }
}
