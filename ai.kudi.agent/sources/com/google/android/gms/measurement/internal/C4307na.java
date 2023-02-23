package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.na */
/* loaded from: classes2.dex */
public final class C4307na extends AbstractC2916a {
    public static final Parcelable.Creator<C4307na> CREATOR = new C4319oa();

    /* renamed from: A */
    public final boolean f10515A;

    /* renamed from: B */
    public final long f10516B;

    /* renamed from: C */
    public final String f10517C;

    /* renamed from: D */
    public final long f10518D;

    /* renamed from: E */
    public final long f10519E;

    /* renamed from: F */
    public final int f10520F;

    /* renamed from: G */
    public final boolean f10521G;

    /* renamed from: H */
    public final boolean f10522H;

    /* renamed from: I */
    public final String f10523I;

    /* renamed from: J */
    public final Boolean f10524J;

    /* renamed from: K */
    public final long f10525K;

    /* renamed from: L */
    public final List<String> f10526L;

    /* renamed from: M */
    public final String f10527M;

    /* renamed from: N */
    public final String f10528N;

    /* renamed from: c */
    public final String f10529c;

    /* renamed from: d */
    public final String f10530d;

    /* renamed from: e */
    public final String f10531e;

    /* renamed from: f */
    public final String f10532f;

    /* renamed from: w */
    public final long f10533w;

    /* renamed from: x */
    public final long f10534x;

    /* renamed from: y */
    public final String f10535y;

    /* renamed from: z */
    public final boolean f10536z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4307na(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        com.google.android.gms.common.internal.s.f(str);
        this.f10529c = str;
        this.f10530d = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f10531e = str3;
        this.f10516B = j;
        this.f10532f = str4;
        this.f10533w = j2;
        this.f10534x = j3;
        this.f10535y = str5;
        this.f10536z = z;
        this.f10515A = z2;
        this.f10517C = str6;
        this.f10518D = j4;
        this.f10519E = j5;
        this.f10520F = i;
        this.f10521G = z3;
        this.f10522H = z4;
        this.f10523I = str7;
        this.f10524J = bool;
        this.f10525K = j6;
        this.f10526L = list;
        this.f10527M = str8;
        this.f10528N = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f10529c, false);
        C2917b.m31651o(parcel, 3, this.f10530d, false);
        C2917b.m31651o(parcel, 4, this.f10531e, false);
        C2917b.m31651o(parcel, 5, this.f10532f, false);
        C2917b.m31654l(parcel, 6, this.f10533w);
        C2917b.m31654l(parcel, 7, this.f10534x);
        C2917b.m31651o(parcel, 8, this.f10535y, false);
        C2917b.m31663c(parcel, 9, this.f10536z);
        C2917b.m31663c(parcel, 10, this.f10515A);
        C2917b.m31654l(parcel, 11, this.f10516B);
        C2917b.m31651o(parcel, 12, this.f10517C, false);
        C2917b.m31654l(parcel, 13, this.f10518D);
        C2917b.m31654l(parcel, 14, this.f10519E);
        C2917b.m31656j(parcel, 15, this.f10520F);
        C2917b.m31663c(parcel, 16, this.f10521G);
        C2917b.m31663c(parcel, 18, this.f10522H);
        C2917b.m31651o(parcel, 19, this.f10523I, false);
        C2917b.m31662d(parcel, 21, this.f10524J, false);
        C2917b.m31654l(parcel, 22, this.f10525K);
        C2917b.m31650p(parcel, 23, this.f10526L, false);
        C2917b.m31651o(parcel, 24, this.f10527M, false);
        C2917b.m31651o(parcel, 25, this.f10528N, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4307na(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        this.f10529c = str;
        this.f10530d = str2;
        this.f10531e = str3;
        this.f10516B = j3;
        this.f10532f = str4;
        this.f10533w = j;
        this.f10534x = j2;
        this.f10535y = str5;
        this.f10536z = z;
        this.f10515A = z2;
        this.f10517C = str6;
        this.f10518D = j4;
        this.f10519E = j5;
        this.f10520F = i;
        this.f10521G = z3;
        this.f10522H = z4;
        this.f10523I = str7;
        this.f10524J = bool;
        this.f10525K = j6;
        this.f10526L = list;
        this.f10527M = str8;
        this.f10528N = str9;
    }
}
