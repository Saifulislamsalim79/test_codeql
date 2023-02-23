package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5271s;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.df */
/* loaded from: classes2.dex */
public final class C3106df extends AbstractC2916a {
    public static final Parcelable.Creator<C3106df> CREATOR = new C3133ef();

    /* renamed from: A */
    private final boolean f8383A;

    /* renamed from: c */
    private final C5271s f8384c;

    /* renamed from: d */
    private final String f8385d;

    /* renamed from: e */
    private final String f8386e;

    /* renamed from: f */
    private final long f8387f;

    /* renamed from: w */
    private final boolean f8388w;

    /* renamed from: x */
    private final boolean f8389x;

    /* renamed from: y */
    private final String f8390y;

    /* renamed from: z */
    private final String f8391z;

    public C3106df(C5271s c5271s, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3) {
        this.f8384c = c5271s;
        this.f8385d = str;
        this.f8386e = str2;
        this.f8387f = j;
        this.f8388w = z;
        this.f8389x = z2;
        this.f8390y = str3;
        this.f8391z = str4;
        this.f8383A = z3;
    }

    /* renamed from: E */
    public final boolean m31248E() {
        return this.f8388w;
    }

    /* renamed from: d0 */
    public final boolean m31247d0() {
        return this.f8383A;
    }

    /* renamed from: f */
    public final long m31246f() {
        return this.f8387f;
    }

    /* renamed from: h */
    public final C5271s m31245h() {
        return this.f8384c;
    }

    /* renamed from: k */
    public final String m31244k() {
        return this.f8386e;
    }

    /* renamed from: l */
    public final String m31243l() {
        return this.f8385d;
    }

    /* renamed from: s */
    public final String m31242s() {
        return this.f8391z;
    }

    /* renamed from: u */
    public final String m31241u() {
        return this.f8390y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f8384c, i, false);
        C2917b.m31651o(parcel, 2, this.f8385d, false);
        C2917b.m31651o(parcel, 3, this.f8386e, false);
        C2917b.m31654l(parcel, 4, this.f8387f);
        C2917b.m31663c(parcel, 5, this.f8388w);
        C2917b.m31663c(parcel, 6, this.f8389x);
        C2917b.m31651o(parcel, 7, this.f8390y, false);
        C2917b.m31651o(parcel, 8, this.f8391z, false);
        C2917b.m31663c(parcel, 9, this.f8383A);
        C2917b.m31664b(parcel, m31665a);
    }
}
