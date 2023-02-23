package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ld */
/* loaded from: classes2.dex */
public final class C3320ld extends AbstractC2916a {
    public static final Parcelable.Creator<C3320ld> CREATOR = new C3346md();

    /* renamed from: c */
    private final String f8699c;

    /* renamed from: d */
    private final String f8700d;

    /* renamed from: e */
    private final String f8701e;

    public C3320ld(String str, String str2, String str3) {
        this.f8699c = str;
        this.f8700d = str2;
        this.f8701e = str3;
    }

    /* renamed from: f */
    public final String m30771f() {
        return this.f8700d;
    }

    /* renamed from: h */
    public final String m30770h() {
        return this.f8701e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8699c, false);
        C2917b.m31651o(parcel, 2, this.f8700d, false);
        C2917b.m31651o(parcel, 3, this.f8701e, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8699c;
    }
}
