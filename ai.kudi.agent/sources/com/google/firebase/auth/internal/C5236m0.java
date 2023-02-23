package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.m0 */
/* loaded from: classes2.dex */
public final class C5236m0 implements Parcelable.Creator<C5234l0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5234l0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 2:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 3:
                    str5 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 4:
                    str4 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 6:
                    str6 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 8:
                    str7 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5234l0(str, str2, str3, str4, str5, str6, z, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5234l0[] newArray(int i) {
        return new C5234l0[i];
    }
}
