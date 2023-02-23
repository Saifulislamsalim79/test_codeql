package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.m */
/* loaded from: classes2.dex */
public final class C2825m implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C2826b c2826b = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m31687c(parcel, m31675o, PendingIntent.CREATOR);
            } else if (m31681i == 4) {
                c2826b = (C2826b) SafeParcelReader.m31687c(parcel, m31675o, C2826b.CREATOR);
            } else if (m31681i != 1000) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new Status(i, i2, str, pendingIntent, c2826b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
