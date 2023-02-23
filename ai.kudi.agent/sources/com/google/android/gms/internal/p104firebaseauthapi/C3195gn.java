package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gn */
/* loaded from: classes2.dex */
public final class C3195gn implements Parcelable.Creator<C3168fn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3168fn createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 2:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 3:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 4:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    str4 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 6:
                    str5 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    str6 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    str7 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 9:
                    str8 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 10:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 11:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 12:
                    str9 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 13:
                    str10 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 14:
                    str11 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 15:
                    str12 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 16:
                    z3 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 17:
                    str13 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3168fn(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3168fn[] newArray(int i) {
        return new C3168fn[i];
    }
}
