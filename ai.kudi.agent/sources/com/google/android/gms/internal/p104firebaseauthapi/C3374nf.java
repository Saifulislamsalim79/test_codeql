package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5192a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nf */
/* loaded from: classes2.dex */
public final class C3374nf extends AbstractC2916a {
    public static final Parcelable.Creator<C3374nf> CREATOR = new C3400of();

    /* renamed from: c */
    private final String f8753c;

    /* renamed from: d */
    private final String f8754d;

    /* renamed from: e */
    private final C5192a f8755e;

    public C3374nf(String str, String str2, C5192a c5192a) {
        this.f8753c = str;
        this.f8754d = str2;
        this.f8755e = c5192a;
    }

    /* renamed from: f */
    public final C5192a m30564f() {
        return this.f8755e;
    }

    /* renamed from: h */
    public final String m30563h() {
        return this.f8753c;
    }

    /* renamed from: k */
    public final String m30562k() {
        return this.f8754d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8753c, false);
        C2917b.m31651o(parcel, 2, this.f8754d, false);
        C2917b.m31652n(parcel, 3, this.f8755e, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
