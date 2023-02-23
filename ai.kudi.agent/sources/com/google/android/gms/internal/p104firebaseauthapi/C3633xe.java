package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5199d;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xe */
/* loaded from: classes2.dex */
public final class C3633xe extends AbstractC2916a {
    public static final Parcelable.Creator<C3633xe> CREATOR = new C3659ye();

    /* renamed from: c */
    private final C5199d f9084c;

    public C3633xe(C5199d c5199d) {
        this.f9084c = c5199d;
    }

    /* renamed from: f */
    public final C5199d m30023f() {
        return this.f9084c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f9084c, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
