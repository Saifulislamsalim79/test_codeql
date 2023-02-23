package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.um */
/* loaded from: classes2.dex */
public final class C3563um implements InterfaceC3030ak<C3563um> {

    /* renamed from: d */
    private static final String f9007d = "um";

    /* renamed from: c */
    private String f9008c;

    /* renamed from: a */
    public final String m30164a() {
        return this.f9008c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3563um mo29936e(String str) throws zzpz {
        try {
            this.f9008c = n.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f9007d, str);
        }
    }
}
