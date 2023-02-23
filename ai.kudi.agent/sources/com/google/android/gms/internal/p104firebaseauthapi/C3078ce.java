package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ce */
/* loaded from: classes2.dex */
public final class C3078ce extends AbstractC2916a {
    public static final Parcelable.Creator<C3078ce> CREATOR = new C3105de();

    /* renamed from: c */
    private final String f8303c;

    /* renamed from: d */
    private final C5266p f8304d;

    public C3078ce(String str, C5266p c5266p) {
        this.f8303c = str;
        this.f8304d = c5266p;
    }

    /* renamed from: f */
    public final C5266p m31284f() {
        return this.f8304d;
    }

    /* renamed from: h */
    public final String m31283h() {
        return this.f8303c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8303c, false);
        C2917b.m31652n(parcel, 2, this.f8304d, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
