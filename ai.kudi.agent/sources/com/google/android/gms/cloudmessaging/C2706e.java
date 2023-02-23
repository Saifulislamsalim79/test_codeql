package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.e */
/* loaded from: classes2.dex */
public final class C2706e implements Parcelable.Creator<C2697a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2697a createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                intent = (Intent) SafeParcelReader.m31687c(parcel, m31675o, Intent.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2697a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2697a[] newArray(int i) {
        return new C2697a[i];
    }
}
