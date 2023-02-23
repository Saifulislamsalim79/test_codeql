package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes2.dex */
public class C2903p extends AbstractC2916a {
    public static final Parcelable.Creator<C2903p> CREATOR = new C2898n0();

    /* renamed from: A */
    private final int f8042A;

    /* renamed from: c */
    private final int f8043c;

    /* renamed from: d */
    private final int f8044d;

    /* renamed from: e */
    private final int f8045e;

    /* renamed from: f */
    private final long f8046f;

    /* renamed from: w */
    private final long f8047w;

    /* renamed from: x */
    private final String f8048x;

    /* renamed from: y */
    private final String f8049y;

    /* renamed from: z */
    private final int f8050z;

    @Deprecated
    public C2903p(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f8043c);
        C2917b.m31656j(parcel, 2, this.f8044d);
        C2917b.m31656j(parcel, 3, this.f8045e);
        C2917b.m31654l(parcel, 4, this.f8046f);
        C2917b.m31654l(parcel, 5, this.f8047w);
        C2917b.m31651o(parcel, 6, this.f8048x, false);
        C2917b.m31651o(parcel, 7, this.f8049y, false);
        C2917b.m31656j(parcel, 8, this.f8050z);
        C2917b.m31656j(parcel, 9, this.f8042A);
        C2917b.m31664b(parcel, m31665a);
    }

    public C2903p(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f8043c = i;
        this.f8044d = i2;
        this.f8045e = i3;
        this.f8046f = j;
        this.f8047w = j2;
        this.f8048x = str;
        this.f8049y = str2;
        this.f8050z = i4;
        this.f8042A = i5;
    }
}
