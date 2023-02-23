package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.em */
/* loaded from: classes2.dex */
public final class C3140em extends AbstractC2916a implements InterfaceC3030ak<C3140em> {

    /* renamed from: c */
    private String f8433c;

    /* renamed from: d */
    private String f8434d;

    /* renamed from: e */
    private Long f8435e;

    /* renamed from: f */
    private String f8436f;

    /* renamed from: w */
    private Long f8437w;

    /* renamed from: x */
    private static final String f8432x = C3140em.class.getSimpleName();
    public static final Parcelable.Creator<C3140em> CREATOR = new C3167fm();

    public C3140em() {
        this.f8437w = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: k */
    public static C3140em m31174k(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3140em c3140em = new C3140em();
            c3140em.f8433c = jSONObject.optString("refresh_token", null);
            c3140em.f8434d = jSONObject.optString("access_token", null);
            c3140em.f8435e = Long.valueOf(jSONObject.optLong("expires_in"));
            c3140em.f8436f = jSONObject.optString("token_type", null);
            c3140em.f8437w = Long.valueOf(jSONObject.optLong("issued_at"));
            return c3140em;
        } catch (JSONException e) {
            Log.d(f8432x, "Failed to read GetTokenResponse from JSONObject");
            throw new zzll(e);
        }
    }

    /* renamed from: E */
    public final String m31179E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f8433c);
            jSONObject.put("access_token", this.f8434d);
            jSONObject.put("expires_in", this.f8435e);
            jSONObject.put("token_type", this.f8436f);
            jSONObject.put("issued_at", this.f8437w);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(f8432x, "Failed to convert GetTokenResponse to JSON");
            throw new zzll(e);
        }
    }

    /* renamed from: d0 */
    public final void m31178d0(String str) {
        s.f(str);
        this.f8433c = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3140em mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8433c = n.a(jSONObject.optString("refresh_token"));
            this.f8434d = n.a(jSONObject.optString("access_token"));
            this.f8435e = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f8436f = n.a(jSONObject.optString("token_type"));
            this.f8437w = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8432x, str);
        }
    }

    /* renamed from: e0 */
    public final boolean m31177e0() {
        return C2970h.m31533c().currentTimeMillis() + 300000 < this.f8437w.longValue() + (this.f8435e.longValue() * 1000);
    }

    /* renamed from: f */
    public final long m31176f() {
        Long l = this.f8435e;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* renamed from: h */
    public final long m31175h() {
        return this.f8437w.longValue();
    }

    /* renamed from: l */
    public final String m31173l() {
        return this.f8434d;
    }

    /* renamed from: s */
    public final String m31172s() {
        return this.f8433c;
    }

    /* renamed from: u */
    public final String m31171u() {
        return this.f8436f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8433c, false);
        C2917b.m31651o(parcel, 3, this.f8434d, false);
        C2917b.m31653m(parcel, 4, Long.valueOf(m31176f()), false);
        C2917b.m31651o(parcel, 5, this.f8436f, false);
        C2917b.m31653m(parcel, 6, Long.valueOf(this.f8437w.longValue()), false);
        C2917b.m31664b(parcel, m31665a);
    }

    public C3140em(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3140em(String str, String str2, Long l, String str3, Long l2) {
        this.f8433c = str;
        this.f8434d = str2;
        this.f8435e = l;
        this.f8436f = str3;
        this.f8437w = l2;
    }
}
