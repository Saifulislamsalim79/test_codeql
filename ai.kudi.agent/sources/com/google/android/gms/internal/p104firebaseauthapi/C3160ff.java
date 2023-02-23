package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ff */
/* loaded from: classes2.dex */
public final class C3160ff extends AbstractC2916a {
    public static final Parcelable.Creator<C3160ff> CREATOR = new C3187gf();

    /* renamed from: c */
    private final String f8466c;

    /* renamed from: d */
    private final String f8467d;

    public C3160ff(String str, String str2) {
        this.f8466c = str;
        this.f8467d = str2;
    }

    /* renamed from: f */
    public final String m31143f() {
        return this.f8467d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8466c, false);
        C2917b.m31651o(parcel, 2, this.f8467d, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8466c;
    }
}
