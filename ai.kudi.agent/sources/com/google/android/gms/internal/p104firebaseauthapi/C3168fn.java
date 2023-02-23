package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.internal.C5220e0;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fn */
/* loaded from: classes2.dex */
public final class C3168fn extends AbstractC2916a implements InterfaceC3690zj {
    public static final Parcelable.Creator<C3168fn> CREATOR = new C3195gn();

    /* renamed from: A */
    private boolean f8478A;

    /* renamed from: B */
    private boolean f8479B;

    /* renamed from: C */
    private String f8480C;

    /* renamed from: D */
    private String f8481D;

    /* renamed from: E */
    private String f8482E;

    /* renamed from: F */
    private String f8483F;

    /* renamed from: G */
    private boolean f8484G;

    /* renamed from: H */
    private String f8485H;

    /* renamed from: c */
    private String f8486c;

    /* renamed from: d */
    private String f8487d;

    /* renamed from: e */
    private String f8488e;

    /* renamed from: f */
    private String f8489f;

    /* renamed from: w */
    private String f8490w;

    /* renamed from: x */
    private String f8491x;

    /* renamed from: y */
    private String f8492y;

    /* renamed from: z */
    private String f8493z;

    public C3168fn() {
        this.f8478A = true;
        this.f8479B = true;
    }

    /* renamed from: f */
    public final C3168fn m31133f(boolean z) {
        this.f8479B = false;
        return this;
    }

    /* renamed from: h */
    public final C3168fn m31132h(String str) {
        s.f(str);
        this.f8487d = str;
        return this;
    }

    /* renamed from: k */
    public final C3168fn m31131k(boolean z) {
        this.f8484G = true;
        return this;
    }

    /* renamed from: l */
    public final C3168fn m31130l(String str) {
        this.f8483F = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8486c, false);
        C2917b.m31651o(parcel, 3, this.f8487d, false);
        C2917b.m31651o(parcel, 4, this.f8488e, false);
        C2917b.m31651o(parcel, 5, this.f8489f, false);
        C2917b.m31651o(parcel, 6, this.f8490w, false);
        C2917b.m31651o(parcel, 7, this.f8491x, false);
        C2917b.m31651o(parcel, 8, this.f8492y, false);
        C2917b.m31651o(parcel, 9, this.f8493z, false);
        C2917b.m31663c(parcel, 10, this.f8478A);
        C2917b.m31663c(parcel, 11, this.f8479B);
        C2917b.m31651o(parcel, 12, this.f8480C, false);
        C2917b.m31651o(parcel, 13, this.f8481D, false);
        C2917b.m31651o(parcel, 14, this.f8482E, false);
        C2917b.m31651o(parcel, 15, this.f8483F, false);
        C2917b.m31663c(parcel, 16, this.f8484G);
        C2917b.m31651o(parcel, 17, this.f8485H, false);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f8479B);
        jSONObject.put("returnSecureToken", this.f8478A);
        String str = this.f8487d;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f8492y;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f8483F;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f8485H;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.f8481D)) {
            jSONObject.put("sessionId", this.f8481D);
        }
        if (!TextUtils.isEmpty(this.f8482E)) {
            jSONObject.put("requestUri", this.f8482E);
        } else {
            String str5 = this.f8486c;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.f8484G);
        return jSONObject.toString();
    }

    public C3168fn(C5220e0 c5220e0, String str) {
        s.j(c5220e0);
        String m25336d = c5220e0.m25336d();
        s.f(m25336d);
        this.f8481D = m25336d;
        s.f(str);
        this.f8482E = str;
        String m25337c = c5220e0.m25337c();
        s.f(m25337c);
        this.f8490w = m25337c;
        this.f8478A = true;
        this.f8492y = "providerId=" + this.f8490w;
    }

    public C3168fn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f8486c = "http://localhost";
        this.f8488e = str;
        this.f8489f = str2;
        this.f8493z = str5;
        this.f8480C = str6;
        this.f8483F = str7;
        this.f8485H = str8;
        this.f8478A = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f8489f) && TextUtils.isEmpty(this.f8480C)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        s.f(str3);
        this.f8490w = str3;
        this.f8491x = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f8488e)) {
            sb.append("id_token=");
            sb.append(this.f8488e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f8489f)) {
            sb.append("access_token=");
            sb.append(this.f8489f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f8491x)) {
            sb.append("identifier=");
            sb.append(this.f8491x);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f8493z)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f8493z);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f8480C)) {
            sb.append("code=");
            sb.append(this.f8480C);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.f8490w);
        this.f8492y = sb.toString();
        this.f8479B = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3168fn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f8486c = str;
        this.f8487d = str2;
        this.f8488e = str3;
        this.f8489f = str4;
        this.f8490w = str5;
        this.f8491x = str6;
        this.f8492y = str7;
        this.f8493z = str8;
        this.f8478A = z;
        this.f8479B = z2;
        this.f8480C = str9;
        this.f8481D = str10;
        this.f8482E = str11;
        this.f8483F = str12;
        this.f8484G = z3;
        this.f8485H = str13;
    }
}
