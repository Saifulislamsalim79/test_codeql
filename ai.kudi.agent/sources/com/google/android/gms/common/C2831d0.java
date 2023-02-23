package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.d0 */
/* loaded from: classes2.dex */
public final class C2831d0 implements Parcelable.Creator<C2829c0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2829c0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 3) {
                z2 = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 4) {
                iBinder = SafeParcelReader.m31674p(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                z3 = SafeParcelReader.m31680j(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2829c0(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2829c0[] newArray(int i) {
        return new C2829c0[i];
    }
}
