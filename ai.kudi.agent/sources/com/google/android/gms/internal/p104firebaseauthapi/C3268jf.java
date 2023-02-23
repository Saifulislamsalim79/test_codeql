package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jf */
/* loaded from: classes2.dex */
public final class C3268jf extends AbstractC2916a {
    public static final Parcelable.Creator<C3268jf> CREATOR = new C3295kf();

    /* renamed from: c */
    private final String f8630c;

    /* renamed from: d */
    private final String f8631d;

    public C3268jf(String str, String str2) {
        this.f8630c = str;
        this.f8631d = str2;
    }

    /* renamed from: f */
    public final String m30897f() {
        return this.f8630c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8630c, false);
        C2917b.m31651o(parcel, 2, this.f8631d, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8631d;
    }
}
