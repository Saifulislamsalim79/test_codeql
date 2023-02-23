package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.re */
/* loaded from: classes2.dex */
public final class C3477re extends AbstractC2916a {
    public static final Parcelable.Creator<C3477re> CREATOR = new C3503se();

    /* renamed from: c */
    private final C3168fn f8911c;

    public C3477re(C3168fn c3168fn) {
        this.f8911c = c3168fn;
    }

    /* renamed from: f */
    public final C3168fn m30378f() {
        return this.f8911c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8911c, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
