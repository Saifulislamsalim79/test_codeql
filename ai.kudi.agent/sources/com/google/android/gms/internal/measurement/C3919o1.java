package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* loaded from: classes2.dex */
public final class C3919o1 extends AbstractC2916a {
    public static final Parcelable.Creator<C3919o1> CREATOR = new C3934p1();

    /* renamed from: c */
    public final long f9583c;

    /* renamed from: d */
    public final long f9584d;

    /* renamed from: e */
    public final boolean f9585e;

    /* renamed from: f */
    public final String f9586f;

    /* renamed from: w */
    public final String f9587w;

    /* renamed from: x */
    public final String f9588x;

    /* renamed from: y */
    public final Bundle f9589y;

    /* renamed from: z */
    public final String f9590z;

    public C3919o1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f9583c = j;
        this.f9584d = j2;
        this.f9585e = z;
        this.f9586f = str;
        this.f9587w = str2;
        this.f9588x = str3;
        this.f9589y = bundle;
        this.f9590z = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31654l(parcel, 1, this.f9583c);
        C2917b.m31654l(parcel, 2, this.f9584d);
        C2917b.m31663c(parcel, 3, this.f9585e);
        C2917b.m31651o(parcel, 4, this.f9586f, false);
        C2917b.m31651o(parcel, 5, this.f9587w, false);
        C2917b.m31651o(parcel, 6, this.f9588x, false);
        C2917b.m31661e(parcel, 7, this.f9589y, false);
        C2917b.m31651o(parcel, 8, this.f9590z, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
