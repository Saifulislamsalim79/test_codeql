package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes2.dex */
public class C2923u extends AbstractC2916a {
    public static final Parcelable.Creator<C2923u> CREATOR = new C2873f1();

    /* renamed from: c */
    private final int f8078c;

    /* renamed from: d */
    private final boolean f8079d;

    /* renamed from: e */
    private final boolean f8080e;

    /* renamed from: f */
    private final int f8081f;

    /* renamed from: w */
    private final int f8082w;

    public C2923u(int i, boolean z, boolean z2, int i2, int i3) {
        this.f8078c = i;
        this.f8079d = z;
        this.f8080e = z2;
        this.f8081f = i2;
        this.f8082w = i3;
    }

    /* renamed from: f */
    public int m31625f() {
        return this.f8081f;
    }

    /* renamed from: h */
    public int m31624h() {
        return this.f8082w;
    }

    /* renamed from: k */
    public boolean m31623k() {
        return this.f8079d;
    }

    /* renamed from: l */
    public boolean m31622l() {
        return this.f8080e;
    }

    /* renamed from: s */
    public int m31621s() {
        return this.f8078c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, m31621s());
        C2917b.m31663c(parcel, 2, m31623k());
        C2917b.m31663c(parcel, 3, m31622l());
        C2917b.m31656j(parcel, 4, m31625f());
        C2917b.m31656j(parcel, 5, m31624h());
        C2917b.m31664b(parcel, m31665a);
    }
}
