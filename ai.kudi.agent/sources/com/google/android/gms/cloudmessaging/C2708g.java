package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.g */
/* loaded from: classes2.dex */
final class C2708g implements Parcelable.Creator<C2710i> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2710i createFromParcel(Parcel parcel) {
        return new C2710i(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2710i[] newArray(int i) {
        return new C2710i[i];
    }
}
