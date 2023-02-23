package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wd */
/* loaded from: classes2.dex */
public final class C3606wd extends AbstractC2916a {
    public static final Parcelable.Creator<C3606wd> CREATOR = new C3632xd();

    /* renamed from: c */
    private final String f9049c;

    /* renamed from: d */
    private final String f9050d;

    public C3606wd(String str, String str2) {
        this.f9049c = str;
        this.f9050d = str2;
    }

    /* renamed from: f */
    public final String m30083f() {
        return this.f9050d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f9049c, false);
        C2917b.m31651o(parcel, 2, this.f9050d, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f9049c;
    }
}
