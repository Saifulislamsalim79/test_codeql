package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5192a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ie */
/* loaded from: classes2.dex */
public final class C3240ie extends AbstractC2916a {
    public static final Parcelable.Creator<C3240ie> CREATOR = new C3267je();

    /* renamed from: c */
    private final String f8590c;

    /* renamed from: d */
    private final C5192a f8591d;

    /* renamed from: e */
    private final String f8592e;

    public C3240ie(String str, C5192a c5192a, String str2) {
        this.f8590c = str;
        this.f8591d = c5192a;
        this.f8592e = str2;
    }

    /* renamed from: f */
    public final C5192a m30964f() {
        return this.f8591d;
    }

    /* renamed from: h */
    public final String m30963h() {
        return this.f8590c;
    }

    /* renamed from: k */
    public final String m30962k() {
        return this.f8592e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8590c, false);
        C2917b.m31652n(parcel, 2, this.f8591d, i, false);
        C2917b.m31651o(parcel, 3, this.f8592e, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
