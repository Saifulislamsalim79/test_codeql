package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cn */
/* loaded from: classes2.dex */
public final class C3087cn implements InterfaceC3030ak<C3087cn> {

    /* renamed from: d */
    private static final String f8316d = "cn";

    /* renamed from: c */
    private String f8317c;

    /* renamed from: a */
    public final String m31278a() {
        return this.f8317c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3087cn mo29936e(String str) throws zzpz {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f8317c = n.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8316d, str);
        }
    }
}
