package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jd */
/* loaded from: classes2.dex */
public final class C3266jd extends AbstractC2916a {
    public static final Parcelable.Creator<C3266jd> CREATOR = new C3293kd();

    /* renamed from: c */
    private final String f8627c;

    /* renamed from: d */
    private final String f8628d;

    /* renamed from: e */
    private final String f8629e;

    public C3266jd(String str, String str2, String str3) {
        this.f8627c = str;
        this.f8628d = str2;
        this.f8629e = str3;
    }

    /* renamed from: f */
    public final String m30899f() {
        return this.f8628d;
    }

    /* renamed from: h */
    public final String m30898h() {
        return this.f8629e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8627c, false);
        C2917b.m31651o(parcel, 2, this.f8628d, false);
        C2917b.m31651o(parcel, 3, this.f8629e, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8627c;
    }
}
