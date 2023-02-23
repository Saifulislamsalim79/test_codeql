package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.InterfaceC5205g;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.q0 */
/* loaded from: classes2.dex */
public final class C5244q0 implements InterfaceC5205g {
    public static final Parcelable.Creator<C5244q0> CREATOR = new C5215c();

    /* renamed from: c */
    private final long f13047c;

    /* renamed from: d */
    private final long f13048d;

    public C5244q0(long j, long j2) {
        this.f13047c = j;
        this.f13048d = j2;
    }

    /* renamed from: a */
    public final JSONObject m25283a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f13047c);
            jSONObject.put("creationTimestamp", this.f13048d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31654l(parcel, 1, this.f13047c);
        C2917b.m31654l(parcel, 2, this.f13048d);
        C2917b.m31664b(parcel, m31665a);
    }
}
