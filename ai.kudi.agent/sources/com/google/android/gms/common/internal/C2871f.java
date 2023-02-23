package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes2.dex */
public class C2871f extends AbstractC2916a {
    public static final Parcelable.Creator<C2871f> CREATOR = new C2909q1();

    /* renamed from: c */
    private final C2923u f7982c;

    /* renamed from: d */
    private final boolean f7983d;

    /* renamed from: e */
    private final boolean f7984e;

    /* renamed from: f */
    private final int[] f7985f;

    /* renamed from: w */
    private final int f7986w;

    /* renamed from: x */
    private final int[] f7987x;

    public C2871f(C2923u c2923u, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f7982c = c2923u;
        this.f7983d = z;
        this.f7984e = z2;
        this.f7985f = iArr;
        this.f7986w = i;
        this.f7987x = iArr2;
    }

    /* renamed from: f */
    public int m31749f() {
        return this.f7986w;
    }

    /* renamed from: h */
    public int[] m31748h() {
        return this.f7985f;
    }

    /* renamed from: k */
    public int[] m31747k() {
        return this.f7987x;
    }

    /* renamed from: l */
    public boolean m31746l() {
        return this.f7983d;
    }

    /* renamed from: s */
    public boolean m31745s() {
        return this.f7984e;
    }

    /* renamed from: u */
    public final C2923u m31744u() {
        return this.f7982c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f7982c, i, false);
        C2917b.m31663c(parcel, 2, m31746l());
        C2917b.m31663c(parcel, 3, m31745s());
        C2917b.m31655k(parcel, 4, m31748h(), false);
        C2917b.m31656j(parcel, 5, m31749f());
        C2917b.m31655k(parcel, 6, m31747k(), false);
        C2917b.m31664b(parcel, m31665a);
    }
}
