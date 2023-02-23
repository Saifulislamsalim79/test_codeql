package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ee */
/* loaded from: classes2.dex */
public final class C3132ee extends AbstractC2916a {
    public static final Parcelable.Creator<C3132ee> CREATOR = new C3159fe();

    /* renamed from: c */
    private final String f8427c;

    public C3132ee(String str) {
        this.f8427c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8427c, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f8427c;
    }
}
