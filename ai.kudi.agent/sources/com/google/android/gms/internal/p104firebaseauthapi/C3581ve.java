package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ve */
/* loaded from: classes2.dex */
public final class C3581ve extends AbstractC2916a {
    public static final Parcelable.Creator<C3581ve> CREATOR = new C3607we();

    /* renamed from: c */
    private final String f9024c;

    /* renamed from: d */
    private final String f9025d;

    /* renamed from: e */
    private final String f9026e;

    public C3581ve(String str, String str2, String str3) {
        this.f9024c = str;
        this.f9025d = str2;
        this.f9026e = str3;
    }

    /* renamed from: f */
    public final String m30125f() {
        return this.f9025d;
    }

    /* renamed from: h */
    public final String m30124h() {
        return this.f9026e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f9024c, false);
        C2917b.m31651o(parcel, 2, this.f9025d, false);
        C2917b.m31651o(parcel, 3, this.f9026e, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f9024c;
    }
}
