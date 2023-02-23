package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes2.dex */
public final class C4169c extends AbstractC2916a {
    public static final Parcelable.Creator<C4169c> CREATOR = new C4181d();

    /* renamed from: A */
    public C4379u f10074A;

    /* renamed from: B */
    public final long f10075B;

    /* renamed from: C */
    public final C4379u f10076C;

    /* renamed from: c */
    public String f10077c;

    /* renamed from: d */
    public String f10078d;

    /* renamed from: e */
    public C4203ea f10079e;

    /* renamed from: f */
    public long f10080f;

    /* renamed from: w */
    public boolean f10081w;

    /* renamed from: x */
    public String f10082x;

    /* renamed from: y */
    public final C4379u f10083y;

    /* renamed from: z */
    public long f10084z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4169c(C4169c c4169c) {
        com.google.android.gms.common.internal.s.j(c4169c);
        this.f10077c = c4169c.f10077c;
        this.f10078d = c4169c.f10078d;
        this.f10079e = c4169c.f10079e;
        this.f10080f = c4169c.f10080f;
        this.f10081w = c4169c.f10081w;
        this.f10082x = c4169c.f10082x;
        this.f10083y = c4169c.f10083y;
        this.f10084z = c4169c.f10084z;
        this.f10074A = c4169c.f10074A;
        this.f10075B = c4169c.f10075B;
        this.f10076C = c4169c.f10076C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f10077c, false);
        C2917b.m31651o(parcel, 3, this.f10078d, false);
        C2917b.m31652n(parcel, 4, this.f10079e, i, false);
        C2917b.m31654l(parcel, 5, this.f10080f);
        C2917b.m31663c(parcel, 6, this.f10081w);
        C2917b.m31651o(parcel, 7, this.f10082x, false);
        C2917b.m31652n(parcel, 8, this.f10083y, i, false);
        C2917b.m31654l(parcel, 9, this.f10084z);
        C2917b.m31652n(parcel, 10, this.f10074A, i, false);
        C2917b.m31654l(parcel, 11, this.f10075B);
        C2917b.m31652n(parcel, 12, this.f10076C, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4169c(String str, String str2, C4203ea c4203ea, long j, boolean z, String str3, C4379u c4379u, long j2, C4379u c4379u2, long j3, C4379u c4379u3) {
        this.f10077c = str;
        this.f10078d = str2;
        this.f10079e = c4203ea;
        this.f10080f = j;
        this.f10081w = z;
        this.f10082x = str3;
        this.f10083y = c4379u;
        this.f10084z = j2;
        this.f10074A = c4379u2;
        this.f10075B = j3;
        this.f10076C = c4379u3;
    }
}
