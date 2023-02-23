package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.f0 */
/* loaded from: classes2.dex */
public final class C2835f0 extends AbstractC2916a {
    public static final Parcelable.Creator<C2835f0> CREATOR = new C2837g0();

    /* renamed from: c */
    private final boolean f7918c;

    /* renamed from: d */
    private final String f7919d;

    /* renamed from: e */
    private final int f7920e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2835f0(boolean z, String str, int i) {
        this.f7918c = z;
        this.f7919d = str;
        this.f7920e = C2833e0.m31853a(i) - 1;
    }

    /* renamed from: f */
    public final boolean m31841f() {
        return this.f7918c;
    }

    /* renamed from: h */
    public final int m31840h() {
        return C2833e0.m31853a(this.f7920e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31663c(parcel, 1, this.f7918c);
        C2917b.m31651o(parcel, 2, this.f7919d, false);
        C2917b.m31656j(parcel, 3, this.f7920e);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f7919d;
    }
}
