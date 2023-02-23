package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ze */
/* loaded from: classes2.dex */
public final class C3685ze extends AbstractC2916a {
    public static final Parcelable.Creator<C3685ze> CREATOR = new C3025af();

    /* renamed from: c */
    private final C5266p f9143c;

    /* renamed from: d */
    private final String f9144d;

    public C3685ze(C5266p c5266p, String str) {
        this.f9143c = c5266p;
        this.f9144d = str;
    }

    /* renamed from: f */
    public final C5266p m29887f() {
        return this.f9143c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f9143c, i, false);
        C2917b.m31651o(parcel, 2, this.f9144d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
