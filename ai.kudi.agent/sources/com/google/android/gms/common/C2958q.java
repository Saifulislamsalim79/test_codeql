package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.q */
/* loaded from: classes2.dex */
public final class C2958q implements Parcelable.Creator<C2826b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2826b createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m31687c(parcel, m31675o, PendingIntent.CREATOR);
            } else if (m31681i != 4) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2826b(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2826b[] newArray(int i) {
        return new C2826b[i];
    }
}
