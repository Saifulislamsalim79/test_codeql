package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qd */
/* loaded from: classes2.dex */
public final class C3450qd extends AbstractC2916a {
    public static final Parcelable.Creator<C3450qd> CREATOR = new C3476rd();

    /* renamed from: c */
    private final C5266p f8885c;

    /* renamed from: d */
    private final String f8886d;

    /* renamed from: e */
    private final String f8887e;

    public C3450qd(C5266p c5266p, String str, String str2) {
        this.f8885c = c5266p;
        this.f8886d = str;
        this.f8887e = str2;
    }

    /* renamed from: f */
    public final C5266p m30428f() {
        return this.f8885c;
    }

    /* renamed from: h */
    public final String m30427h() {
        return this.f8886d;
    }

    /* renamed from: k */
    public final String m30426k() {
        return this.f8887e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8885c, i, false);
        C2917b.m31651o(parcel, 2, this.f8886d, false);
        C2917b.m31651o(parcel, 3, this.f8887e, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
