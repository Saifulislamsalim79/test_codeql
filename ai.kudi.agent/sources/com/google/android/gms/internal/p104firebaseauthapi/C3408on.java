package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.on */
/* loaded from: classes2.dex */
public final class C3408on implements InterfaceC3030ak<C3408on> {

    /* renamed from: y */
    private static final String f8808y = "on";

    /* renamed from: c */
    private String f8809c;

    /* renamed from: d */
    private String f8810d;

    /* renamed from: e */
    private long f8811e;

    /* renamed from: f */
    private boolean f8812f;

    /* renamed from: w */
    private String f8813w;

    /* renamed from: x */
    private String f8814x;

    /* renamed from: a */
    public final long m30491a() {
        return this.f8811e;
    }

    /* renamed from: b */
    public final String m30490b() {
        return this.f8809c;
    }

    /* renamed from: c */
    public final String m30489c() {
        return this.f8814x;
    }

    /* renamed from: d */
    public final String m30488d() {
        return this.f8810d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3408on mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8809c = n.a(jSONObject.optString("idToken", null));
            this.f8810d = n.a(jSONObject.optString("refreshToken", null));
            this.f8811e = jSONObject.optLong("expiresIn", 0L);
            n.a(jSONObject.optString("localId", null));
            this.f8812f = jSONObject.optBoolean("isNewUser", false);
            this.f8813w = n.a(jSONObject.optString("temporaryProof", null));
            this.f8814x = n.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8808y, str);
        }
    }

    /* renamed from: f */
    public final String m30487f() {
        return this.f8813w;
    }

    /* renamed from: g */
    public final boolean m30486g() {
        return this.f8812f;
    }
}
