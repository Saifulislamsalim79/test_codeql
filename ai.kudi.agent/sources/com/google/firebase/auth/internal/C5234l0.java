package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3302km;
import com.google.android.gms.internal.p104firebaseauthapi.C3640xl;
import com.google.android.gms.internal.p104firebaseauthapi.zzll;
import com.google.firebase.auth.InterfaceC5274v;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.l0 */
/* loaded from: classes2.dex */
public final class C5234l0 extends AbstractC2916a implements InterfaceC5274v {
    public static final Parcelable.Creator<C5234l0> CREATOR = new C5236m0();

    /* renamed from: A */
    private final String f13023A;

    /* renamed from: c */
    private final String f13024c;

    /* renamed from: d */
    private final String f13025d;

    /* renamed from: e */
    private final String f13026e;

    /* renamed from: f */
    private String f13027f;

    /* renamed from: w */
    private Uri f13028w;

    /* renamed from: x */
    private final String f13029x;

    /* renamed from: y */
    private final String f13030y;

    /* renamed from: z */
    private final boolean f13031z;

    public C5234l0(C3640xl c3640xl, String str) {
        com.google.android.gms.common.internal.s.j(c3640xl);
        com.google.android.gms.common.internal.s.f("firebase");
        String m30009p0 = c3640xl.m30009p0();
        com.google.android.gms.common.internal.s.f(m30009p0);
        this.f13024c = m30009p0;
        this.f13025d = "firebase";
        this.f13029x = c3640xl.m30010n0();
        this.f13026e = c3640xl.m30011m0();
        Uri m30014k = c3640xl.m30014k();
        if (m30014k != null) {
            this.f13027f = m30014k.toString();
            this.f13028w = m30014k;
        }
        this.f13031z = c3640xl.m30004t0();
        this.f13023A = null;
        this.f13030y = c3640xl.m30008q0();
    }

    @Override // com.google.firebase.auth.InterfaceC5274v
    /* renamed from: d */
    public final String mo25234d() {
        return this.f13025d;
    }

    /* renamed from: f */
    public final String m25317f() {
        return this.f13024c;
    }

    /* renamed from: h */
    public final String m25316h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f13024c);
            jSONObject.putOpt("providerId", this.f13025d);
            jSONObject.putOpt("displayName", this.f13026e);
            jSONObject.putOpt("photoUrl", this.f13027f);
            jSONObject.putOpt("email", this.f13029x);
            jSONObject.putOpt("phoneNumber", this.f13030y);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f13031z));
            jSONObject.putOpt("rawUserInfo", this.f13023A);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzll(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13024c, false);
        C2917b.m31651o(parcel, 2, this.f13025d, false);
        C2917b.m31651o(parcel, 3, this.f13026e, false);
        C2917b.m31651o(parcel, 4, this.f13027f, false);
        C2917b.m31651o(parcel, 5, this.f13029x, false);
        C2917b.m31651o(parcel, 6, this.f13030y, false);
        C2917b.m31663c(parcel, 7, this.f13031z);
        C2917b.m31651o(parcel, 8, this.f13023A, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f13023A;
    }

    public C5234l0(C3302km c3302km) {
        com.google.android.gms.common.internal.s.j(c3302km);
        this.f13024c = c3302km.m30832l();
        String m30830u = c3302km.m30830u();
        com.google.android.gms.common.internal.s.f(m30830u);
        this.f13025d = m30830u;
        this.f13026e = c3302km.m30834h();
        Uri m30835f = c3302km.m30835f();
        if (m30835f != null) {
            this.f13027f = m30835f.toString();
            this.f13028w = m30835f;
        }
        this.f13029x = c3302km.m30833k();
        this.f13030y = c3302km.m30831s();
        this.f13031z = false;
        this.f13023A = c3302km.m30837E();
    }

    public C5234l0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f13024c = str;
        this.f13025d = str2;
        this.f13029x = str3;
        this.f13030y = str4;
        this.f13026e = str5;
        this.f13027f = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f13028w = Uri.parse(this.f13027f);
        }
        this.f13031z = z;
        this.f13023A = str7;
    }
}
