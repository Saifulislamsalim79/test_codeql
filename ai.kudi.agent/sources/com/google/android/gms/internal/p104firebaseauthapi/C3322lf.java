package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5275w;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lf */
/* loaded from: classes2.dex */
public final class C3322lf extends AbstractC2916a {
    public static final Parcelable.Creator<C3322lf> CREATOR = new C3348mf();

    /* renamed from: c */
    private final C5275w f8702c;

    /* renamed from: d */
    private final String f8703d;

    public C3322lf(C5275w c5275w, String str) {
        this.f8702c = c5275w;
        this.f8703d = str;
    }

    /* renamed from: f */
    public final C5275w m30769f() {
        return this.f8702c;
    }

    /* renamed from: h */
    public final String m30768h() {
        return this.f8703d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8702c, i, false);
        C2917b.m31651o(parcel, 2, this.f8703d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
