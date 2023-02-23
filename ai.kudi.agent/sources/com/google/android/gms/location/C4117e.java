package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* renamed from: com.google.android.gms.location.e */
/* loaded from: classes2.dex */
public final class C4117e extends AbstractC2916a implements InterfaceC2748h {
    public static final Parcelable.Creator<C4117e> CREATOR = new C4129p();

    /* renamed from: c */
    private final Status f9909c;

    /* renamed from: d */
    private final C4119f f9910d;

    public C4117e(Status status) {
        this(status, null);
    }

    public C4117e(Status status, C4119f c4119f) {
        this.f9909c = status;
        this.f9910d = c4119f;
    }

    /* renamed from: f */
    public final C4119f m28497f() {
        return this.f9910d;
    }

    @Override // com.google.android.gms.common.api.InterfaceC2748h
    public final Status getStatus() {
        return this.f9909c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, getStatus(), i, false);
        C2917b.m31652n(parcel, 2, m28497f(), i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
