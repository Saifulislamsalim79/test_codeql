package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bf */
/* loaded from: classes2.dex */
public final class C3052bf extends AbstractC2916a {
    public static final Parcelable.Creator<C3052bf> CREATOR = new C3079cf();

    /* renamed from: A */
    private final boolean f8234A;

    /* renamed from: c */
    private final String f8235c;

    /* renamed from: d */
    private final String f8236d;

    /* renamed from: e */
    private final String f8237e;

    /* renamed from: f */
    private final long f8238f;

    /* renamed from: w */
    private final boolean f8239w;

    /* renamed from: x */
    private final boolean f8240x;

    /* renamed from: y */
    private final String f8241y;

    /* renamed from: z */
    private final String f8242z;

    public C3052bf(String str, String str2, String str3, long j, boolean z, boolean z2, String str4, String str5, boolean z3) {
        this.f8235c = str;
        this.f8236d = str2;
        this.f8237e = str3;
        this.f8238f = j;
        this.f8239w = z;
        this.f8240x = z2;
        this.f8241y = str4;
        this.f8242z = str5;
        this.f8234A = z3;
    }

    /* renamed from: E */
    public final boolean m31401E() {
        return this.f8239w;
    }

    /* renamed from: d0 */
    public final boolean m31400d0() {
        return this.f8234A;
    }

    /* renamed from: f */
    public final long m31399f() {
        return this.f8238f;
    }

    /* renamed from: h */
    public final String m31398h() {
        return this.f8235c;
    }

    /* renamed from: k */
    public final String m31397k() {
        return this.f8237e;
    }

    /* renamed from: l */
    public final String m31396l() {
        return this.f8236d;
    }

    /* renamed from: s */
    public final String m31395s() {
        return this.f8242z;
    }

    /* renamed from: u */
    public final String m31394u() {
        return this.f8241y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8235c, false);
        C2917b.m31651o(parcel, 2, this.f8236d, false);
        C2917b.m31651o(parcel, 3, this.f8237e, false);
        C2917b.m31654l(parcel, 4, this.f8238f);
        C2917b.m31663c(parcel, 5, this.f8239w);
        C2917b.m31663c(parcel, 6, this.f8240x);
        C2917b.m31651o(parcel, 7, this.f8241y, false);
        C2917b.m31651o(parcel, 8, this.f8242z, false);
        C2917b.m31663c(parcel, 9, this.f8234A);
        C2917b.m31664b(parcel, m31665a);
    }
}
