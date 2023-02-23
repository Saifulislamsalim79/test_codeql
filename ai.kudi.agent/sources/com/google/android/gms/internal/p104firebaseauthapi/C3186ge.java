package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5192a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ge */
/* loaded from: classes2.dex */
public final class C3186ge extends AbstractC2916a {
    public static final Parcelable.Creator<C3186ge> CREATOR = new C3213he();

    /* renamed from: c */
    private final String f8510c;

    /* renamed from: d */
    private final C5192a f8511d;

    public C3186ge(String str, C5192a c5192a) {
        this.f8510c = str;
        this.f8511d = c5192a;
    }

    /* renamed from: f */
    public final C5192a m31098f() {
        return this.f8511d;
    }

    /* renamed from: h */
    public final String m31097h() {
        return this.f8510c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8510c, false);
        C2917b.m31652n(parcel, 2, this.f8511d, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
