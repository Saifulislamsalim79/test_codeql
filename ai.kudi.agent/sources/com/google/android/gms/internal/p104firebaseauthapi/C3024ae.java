package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ae */
/* loaded from: classes2.dex */
public final class C3024ae extends AbstractC2916a {
    public static final Parcelable.Creator<C3024ae> CREATOR = new C3051be();

    /* renamed from: c */
    private final String f8191c;

    /* renamed from: d */
    private final C3168fn f8192d;

    public C3024ae(String str, C3168fn c3168fn) {
        this.f8191c = str;
        this.f8192d = c3168fn;
    }

    /* renamed from: f */
    public final C3168fn m31419f() {
        return this.f8192d;
    }

    /* renamed from: h */
    public final String m31418h() {
        return this.f8191c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8191c, false);
        C2917b.m31652n(parcel, 2, this.f8192d, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
