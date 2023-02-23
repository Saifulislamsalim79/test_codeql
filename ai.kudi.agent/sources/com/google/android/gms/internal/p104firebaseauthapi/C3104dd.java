package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dd */
/* loaded from: classes2.dex */
public final class C3104dd extends AbstractC2916a {
    public static final Parcelable.Creator<C3104dd> CREATOR = new C3131ed();

    /* renamed from: c */
    private final String f8381c;

    /* renamed from: d */
    private final String f8382d;

    public C3104dd(String str, String str2) {
        this.f8381c = str;
        this.f8382d = str2;
    }

    /* renamed from: f */
    public final String m31249f() {
        return this.f8382d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8381c, false);
        C2917b.m31651o(parcel, 2, this.f8382d, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8381c;
    }
}
