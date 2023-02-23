package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sm */
/* loaded from: classes2.dex */
public final class C3511sm extends AbstractC2916a implements InterfaceC3690zj {
    public static final Parcelable.Creator<C3511sm> CREATOR = new C3537tm();

    /* renamed from: A */
    private C3193gl f8955A;

    /* renamed from: c */
    private final String f8956c;

    /* renamed from: d */
    private final long f8957d;

    /* renamed from: e */
    private final boolean f8958e;

    /* renamed from: f */
    private final String f8959f;

    /* renamed from: w */
    private final String f8960w;

    /* renamed from: x */
    private final String f8961x;

    /* renamed from: y */
    private final boolean f8962y;

    /* renamed from: z */
    private final String f8963z;

    public C3511sm(String str, long j, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        s.f(str);
        this.f8956c = str;
        this.f8957d = j;
        this.f8958e = z;
        this.f8959f = str2;
        this.f8960w = str3;
        this.f8961x = str4;
        this.f8962y = z2;
        this.f8963z = str5;
    }

    /* renamed from: f */
    public final long m30271f() {
        return this.f8957d;
    }

    /* renamed from: h */
    public final String m30270h() {
        return this.f8959f;
    }

    /* renamed from: k */
    public final String m30269k() {
        return this.f8956c;
    }

    /* renamed from: l */
    public final void m30268l(C3193gl c3193gl) {
        this.f8955A = c3193gl;
    }

    /* renamed from: s */
    public final boolean m30267s() {
        return this.f8958e;
    }

    /* renamed from: u */
    public final boolean m30266u() {
        return this.f8962y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8956c, false);
        C2917b.m31654l(parcel, 2, this.f8957d);
        C2917b.m31663c(parcel, 3, this.f8958e);
        C2917b.m31651o(parcel, 4, this.f8959f, false);
        C2917b.m31651o(parcel, 5, this.f8960w, false);
        C2917b.m31651o(parcel, 6, this.f8961x, false);
        C2917b.m31663c(parcel, 7, this.f8962y);
        C2917b.m31651o(parcel, 8, this.f8963z, false);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f8956c);
        String str = this.f8960w;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f8961x;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        C3193gl c3193gl = this.f8955A;
        if (c3193gl != null) {
            jSONObject.put("autoRetrievalInfo", c3193gl.m31092a());
        }
        String str3 = this.f8963z;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }
}
