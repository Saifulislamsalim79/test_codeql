package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.f0 */
/* loaded from: classes2.dex */
public final class C5204f0 implements Parcelable.Creator<C5268q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5268q createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            SafeParcelReader.m31681i(m31675o);
            SafeParcelReader.m31669u(parcel, m31675o);
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5268q();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5268q[] newArray(int i) {
        return new C5268q[i];
    }
}
