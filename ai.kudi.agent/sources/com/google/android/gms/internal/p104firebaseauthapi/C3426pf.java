package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5206g0;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pf */
/* loaded from: classes2.dex */
public final class C3426pf extends AbstractC2916a {
    public static final Parcelable.Creator<C3426pf> CREATOR = new C3452qf();

    /* renamed from: c */
    private final Status f8849c;

    /* renamed from: d */
    private final C5206g0 f8850d;

    /* renamed from: e */
    private final String f8851e;

    /* renamed from: f */
    private final String f8852f;

    public C3426pf(Status status, C5206g0 c5206g0, String str, String str2) {
        this.f8849c = status;
        this.f8850d = c5206g0;
        this.f8851e = str;
        this.f8852f = str2;
    }

    /* renamed from: f */
    public final Status m30465f() {
        return this.f8849c;
    }

    /* renamed from: h */
    public final C5206g0 m30464h() {
        return this.f8850d;
    }

    /* renamed from: k */
    public final String m30463k() {
        return this.f8851e;
    }

    /* renamed from: l */
    public final String m30462l() {
        return this.f8852f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8849c, i, false);
        C2917b.m31652n(parcel, 2, this.f8850d, i, false);
        C2917b.m31651o(parcel, 3, this.f8851e, false);
        C2917b.m31651o(parcel, 4, this.f8852f, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
