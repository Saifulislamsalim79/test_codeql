package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.im */
/* loaded from: classes2.dex */
public final class C3248im extends AbstractC2916a {
    public static final Parcelable.Creator<C3248im> CREATOR = new C3275jm();

    /* renamed from: c */
    private final String f8605c;

    /* renamed from: d */
    private final String f8606d;

    /* renamed from: e */
    private final String f8607e;

    /* renamed from: f */
    private final long f8608f;

    public C3248im(String str, String str2, String str3, long j) {
        this.f8605c = str;
        s.f(str2);
        this.f8606d = str2;
        this.f8607e = str3;
        this.f8608f = j;
    }

    /* renamed from: h */
    public static C3248im m30959h(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", null);
        String optString3 = jSONObject.optString("displayName", null);
        long j = 0;
        if (jSONObject != null && jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j = optJSONObject.optLong("seconds", 0L);
        }
        C3248im c3248im = new C3248im(optString, optString2, optString3, j);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return c3248im;
    }

    /* renamed from: u */
    public static List<C3248im> m30955u(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(m30959h(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: f */
    public final long m30960f() {
        return this.f8608f;
    }

    /* renamed from: k */
    public final String m30958k() {
        return this.f8607e;
    }

    /* renamed from: l */
    public final String m30957l() {
        return this.f8606d;
    }

    /* renamed from: s */
    public final String m30956s() {
        return this.f8605c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8605c, false);
        C2917b.m31651o(parcel, 2, this.f8606d, false);
        C2917b.m31651o(parcel, 3, this.f8607e, false);
        C2917b.m31654l(parcel, 4, this.f8608f);
        C2917b.m31664b(parcel, m31665a);
    }
}
