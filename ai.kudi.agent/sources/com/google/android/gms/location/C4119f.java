package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* renamed from: com.google.android.gms.location.f */
/* loaded from: classes2.dex */
public final class C4119f extends AbstractC2916a {
    public static final Parcelable.Creator<C4119f> CREATOR = new C4130q();

    /* renamed from: c */
    private final boolean f9911c;

    /* renamed from: d */
    private final boolean f9912d;

    /* renamed from: e */
    private final boolean f9913e;

    /* renamed from: f */
    private final boolean f9914f;

    /* renamed from: w */
    private final boolean f9915w;

    /* renamed from: x */
    private final boolean f9916x;

    public C4119f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f9911c = z;
        this.f9912d = z2;
        this.f9913e = z3;
        this.f9914f = z4;
        this.f9915w = z5;
        this.f9916x = z6;
    }

    /* renamed from: f */
    public final boolean m28496f() {
        return this.f9916x;
    }

    /* renamed from: h */
    public final boolean m28495h() {
        return this.f9913e;
    }

    /* renamed from: k */
    public final boolean m28494k() {
        return this.f9914f;
    }

    /* renamed from: l */
    public final boolean m28493l() {
        return this.f9911c;
    }

    /* renamed from: s */
    public final boolean m28492s() {
        return this.f9915w;
    }

    /* renamed from: u */
    public final boolean m28491u() {
        return this.f9912d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31663c(parcel, 1, m28493l());
        C2917b.m31663c(parcel, 2, m28491u());
        C2917b.m31663c(parcel, 3, m28495h());
        C2917b.m31663c(parcel, 4, m28494k());
        C2917b.m31663c(parcel, 5, m28492s());
        C2917b.m31663c(parcel, 6, m28496f());
        C2917b.m31664b(parcel, m31665a);
    }
}
