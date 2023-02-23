package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* renamed from: com.google.android.gms.location.m */
/* loaded from: classes2.dex */
public final class C4126m extends AbstractC2916a {
    public static final Parcelable.Creator<C4126m> CREATOR = new C4127n();

    /* renamed from: c */
    private final String f9917c;

    /* renamed from: d */
    private final String f9918d;

    /* renamed from: e */
    private final String f9919e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4126m(String str, String str2, String str3) {
        this.f9919e = str;
        this.f9917c = str2;
        this.f9918d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f9917c, false);
        C2917b.m31651o(parcel, 2, this.f9918d, false);
        C2917b.m31651o(parcel, 5, this.f9919e, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
