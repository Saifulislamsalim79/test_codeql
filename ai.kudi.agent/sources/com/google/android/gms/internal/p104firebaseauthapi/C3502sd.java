package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sd */
/* loaded from: classes2.dex */
public final class C3502sd extends AbstractC2916a {
    public static final Parcelable.Creator<C3502sd> CREATOR = new C3528td();

    /* renamed from: c */
    private final C5266p f8942c;

    /* renamed from: d */
    private final String f8943d;

    public C3502sd(C5266p c5266p, String str) {
        this.f8942c = c5266p;
        this.f8943d = str;
    }

    /* renamed from: f */
    public final C5266p m30279f() {
        return this.f8942c;
    }

    /* renamed from: h */
    public final String m30278h() {
        return this.f8943d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8942c, i, false);
        C2917b.m31651o(parcel, 2, this.f8943d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
