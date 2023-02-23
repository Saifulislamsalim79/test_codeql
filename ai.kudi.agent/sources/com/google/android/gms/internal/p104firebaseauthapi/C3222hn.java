package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.n;
import com.google.firebase.auth.C5206g0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hn */
/* loaded from: classes2.dex */
public final class C3222hn implements InterfaceC3030ak<C3222hn> {

    /* renamed from: I */
    private static final String f8554I = "hn";

    /* renamed from: A */
    private String f8555A;

    /* renamed from: B */
    private String f8556B;

    /* renamed from: C */
    private String f8557C;

    /* renamed from: D */
    private String f8558D;

    /* renamed from: E */
    private String f8559E;

    /* renamed from: F */
    private String f8560F;

    /* renamed from: G */
    private List<C3248im> f8561G;

    /* renamed from: H */
    private String f8562H;

    /* renamed from: c */
    private boolean f8563c;

    /* renamed from: d */
    private String f8564d;

    /* renamed from: e */
    private String f8565e;

    /* renamed from: f */
    private long f8566f;

    /* renamed from: w */
    private String f8567w;

    /* renamed from: x */
    private String f8568x;

    /* renamed from: y */
    private String f8569y;

    /* renamed from: z */
    private boolean f8570z;

    /* renamed from: a */
    public final long m31040a() {
        return this.f8566f;
    }

    /* renamed from: b */
    public final C5206g0 m31039b() {
        if (TextUtils.isEmpty(this.f8555A) && TextUtils.isEmpty(this.f8556B)) {
            return null;
        }
        return C5206g0.m25363l(this.f8568x, this.f8556B, this.f8555A, this.f8559E, this.f8557C);
    }

    /* renamed from: c */
    public final String m31038c() {
        return this.f8567w;
    }

    /* renamed from: d */
    public final String m31037d() {
        return this.f8558D;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3222hn mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8563c = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f8564d = n.a(jSONObject.optString("idToken", null));
            this.f8565e = n.a(jSONObject.optString("refreshToken", null));
            this.f8566f = jSONObject.optLong("expiresIn", 0L);
            n.a(jSONObject.optString("localId", null));
            this.f8567w = n.a(jSONObject.optString("email", null));
            n.a(jSONObject.optString("displayName", null));
            n.a(jSONObject.optString("photoUrl", null));
            this.f8568x = n.a(jSONObject.optString("providerId", null));
            this.f8569y = n.a(jSONObject.optString("rawUserInfo", null));
            this.f8570z = jSONObject.optBoolean("isNewUser", false);
            this.f8555A = jSONObject.optString("oauthAccessToken", null);
            this.f8556B = jSONObject.optString("oauthIdToken", null);
            this.f8558D = n.a(jSONObject.optString("errorMessage", null));
            this.f8559E = n.a(jSONObject.optString("pendingToken", null));
            this.f8560F = n.a(jSONObject.optString("tenantId", null));
            this.f8561G = C3248im.m30955u(jSONObject.optJSONArray("mfaInfo"));
            this.f8562H = n.a(jSONObject.optString("mfaPendingCredential", null));
            this.f8557C = n.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8554I, str);
        }
    }

    /* renamed from: f */
    public final String m31036f() {
        return this.f8564d;
    }

    /* renamed from: g */
    public final String m31035g() {
        return this.f8562H;
    }

    /* renamed from: h */
    public final String m31034h() {
        return this.f8568x;
    }

    /* renamed from: i */
    public final String m31033i() {
        return this.f8569y;
    }

    /* renamed from: j */
    public final String m31032j() {
        return this.f8565e;
    }

    /* renamed from: k */
    public final String m31031k() {
        return this.f8560F;
    }

    /* renamed from: l */
    public final List<C3248im> m31030l() {
        return this.f8561G;
    }

    /* renamed from: m */
    public final boolean m31029m() {
        return !TextUtils.isEmpty(this.f8562H);
    }

    /* renamed from: n */
    public final boolean m31028n() {
        return this.f8563c;
    }

    /* renamed from: o */
    public final boolean m31027o() {
        return this.f8570z;
    }

    /* renamed from: p */
    public final boolean m31026p() {
        return this.f8563c || !TextUtils.isEmpty(this.f8558D);
    }
}
