package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.a */
/* loaded from: classes2.dex */
public final class C2697a extends AbstractC2916a {
    public static final Parcelable.Creator<C2697a> CREATOR = new C2706e();

    /* renamed from: c */
    Intent f7623c;

    public C2697a(Intent intent) {
        this.f7623c = intent;
    }

    /* renamed from: f */
    public Intent m32146f() {
        return this.f7623c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f7623c, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
