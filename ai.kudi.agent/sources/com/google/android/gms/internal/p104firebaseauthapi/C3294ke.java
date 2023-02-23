package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ke */
/* loaded from: classes2.dex */
public final class C3294ke extends AbstractC2916a {
    public static final Parcelable.Creator<C3294ke> CREATOR = new C3321le();

    /* renamed from: c */
    private final C3511sm f8677c;

    public C3294ke(C3511sm c3511sm) {
        this.f8677c = c3511sm;
    }

    /* renamed from: f */
    public final C3511sm m30841f() {
        return this.f8677c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8677c, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
