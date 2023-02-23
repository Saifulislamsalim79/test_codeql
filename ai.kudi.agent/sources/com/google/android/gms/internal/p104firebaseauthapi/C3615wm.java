package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.util.n;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wm */
/* loaded from: classes2.dex */
public final class C3615wm implements InterfaceC3030ak<C3615wm> {

    /* renamed from: x */
    private static final String f9062x = "wm";

    /* renamed from: c */
    private String f9063c;

    /* renamed from: d */
    private C3355mm f9064d;

    /* renamed from: e */
    private String f9065e;

    /* renamed from: f */
    private String f9066f;

    /* renamed from: w */
    private long f9067w;

    /* renamed from: a */
    public final long m30078a() {
        return this.f9067w;
    }

    /* renamed from: b */
    public final String m30077b() {
        return this.f9063c;
    }

    /* renamed from: c */
    public final String m30076c() {
        return this.f9065e;
    }

    /* renamed from: d */
    public final String m30075d() {
        return this.f9066f;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3615wm mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9063c = n.a(jSONObject.optString("email", null));
            n.a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            n.a(jSONObject.optString("displayName", null));
            n.a(jSONObject.optString("photoUrl", null));
            this.f9064d = C3355mm.m30657f(jSONObject.optJSONArray("providerUserInfo"));
            this.f9065e = n.a(jSONObject.optString("idToken", null));
            this.f9066f = n.a(jSONObject.optString("refreshToken", null));
            this.f9067w = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f9062x, str);
        }
    }

    /* renamed from: f */
    public final List<C3302km> m30074f() {
        C3355mm c3355mm = this.f9064d;
        if (c3355mm != null) {
            return c3355mm.m30655k();
        }
        return null;
    }
}
