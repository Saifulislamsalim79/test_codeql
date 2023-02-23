package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.InterfaceC2889l;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.u0 */
/* loaded from: classes2.dex */
public final class C2924u0 extends AbstractC2916a {
    public static final Parcelable.Creator<C2924u0> CREATOR = new C2927v0();

    /* renamed from: c */
    final int f8083c;

    /* renamed from: d */
    final IBinder f8084d;

    /* renamed from: e */
    private final C2826b f8085e;

    /* renamed from: f */
    private final boolean f8086f;

    /* renamed from: w */
    private final boolean f8087w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2924u0(int i, IBinder iBinder, C2826b c2826b, boolean z, boolean z2) {
        this.f8083c = i;
        this.f8084d = iBinder;
        this.f8085e = c2826b;
        this.f8086f = z;
        this.f8087w = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2924u0) {
            C2924u0 c2924u0 = (C2924u0) obj;
            return this.f8085e.equals(c2924u0.f8085e) && C2906q.m31701a(m31619h(), c2924u0.m31619h());
        }
        return false;
    }

    /* renamed from: f */
    public final C2826b m31620f() {
        return this.f8085e;
    }

    /* renamed from: h */
    public final InterfaceC2889l m31619h() {
        IBinder iBinder = this.f8084d;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC2889l.AbstractBinderC2890a.m31708n(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f8083c);
        C2917b.m31657i(parcel, 2, this.f8084d, false);
        C2917b.m31652n(parcel, 3, this.f8085e, i, false);
        C2917b.m31663c(parcel, 4, this.f8086f);
        C2917b.m31663c(parcel, 5, this.f8087w);
        C2917b.m31664b(parcel, m31665a);
    }
}
