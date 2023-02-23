package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.zzll;
import io.intercom.android.sdk.views.holder.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.s */
/* loaded from: classes2.dex */
public class C5271s extends AbstractC5258l {
    public static final Parcelable.Creator<C5271s> CREATOR = new C5278z();

    /* renamed from: c */
    private final String f13080c;

    /* renamed from: d */
    private final String f13081d;

    /* renamed from: e */
    private final long f13082e;

    /* renamed from: f */
    private final String f13083f;

    public C5271s(String str, String str2, long j, String str3) {
        com.google.android.gms.common.internal.s.f(str);
        this.f13080c = str;
        this.f13081d = str2;
        this.f13082e = j;
        com.google.android.gms.common.internal.s.f(str3);
        this.f13083f = str3;
    }

    @Override // com.google.firebase.auth.AbstractC5258l
    /* renamed from: f */
    public JSONObject mo25243f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", AttributeType.PHONE);
            jSONObject.putOpt("uid", this.f13080c);
            jSONObject.putOpt("displayName", this.f13081d);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f13082e));
            jSONObject.putOpt("phoneNumber", this.f13083f);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzll(e);
        }
    }

    /* renamed from: h */
    public String m25242h() {
        return this.f13081d;
    }

    /* renamed from: k */
    public long m25241k() {
        return this.f13082e;
    }

    /* renamed from: l */
    public String m25240l() {
        return this.f13083f;
    }

    /* renamed from: s */
    public String m25239s() {
        return this.f13080c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, m25239s(), false);
        C2917b.m31651o(parcel, 2, m25242h(), false);
        C2917b.m31654l(parcel, 3, m25241k());
        C2917b.m31651o(parcel, 4, m25240l(), false);
        C2917b.m31664b(parcel, m31665a);
    }
}
