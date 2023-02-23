package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.InterfaceC2918c;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.h0 */
/* loaded from: classes2.dex */
public final class C5226h0 implements InterfaceC2918c {
    public static final Parcelable.Creator<C5226h0> CREATOR = new C5228i0();

    /* renamed from: c */
    private final String f13006c;

    /* renamed from: d */
    private final String f13007d;

    /* renamed from: e */
    private final boolean f13008e;

    public C5226h0(String str, String str2, boolean z) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        this.f13006c = str;
        this.f13007d = str2;
        C5241p.m25287c(str2);
        this.f13008e = z;
    }

    public C5226h0(boolean z) {
        this.f13008e = z;
        this.f13007d = null;
        this.f13006c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13006c, false);
        C2917b.m31651o(parcel, 2, this.f13007d, false);
        C2917b.m31663c(parcel, 3, this.f13008e);
        C2917b.m31664b(parcel, m31665a);
    }
}
