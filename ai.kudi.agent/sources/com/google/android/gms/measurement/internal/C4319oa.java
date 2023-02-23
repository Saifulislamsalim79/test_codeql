package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.oa */
/* loaded from: classes2.dex */
public final class C4319oa implements Parcelable.Creator<C4307na> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C4307na createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
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
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 7:
                    j2 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 8:
                    str5 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 9:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 10:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 11:
                    j6 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 12:
                    str6 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 13:
                    j3 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 14:
                    j4 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 15:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 16:
                    z3 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
                case 18:
                    z4 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 19:
                    str7 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 21:
                    bool = SafeParcelReader.m31679k(parcel, m31675o);
                    break;
                case 22:
                    j5 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m31685e(parcel, m31675o);
                    break;
                case 24:
                    str8 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 25:
                    str9 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4307na(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, str7, bool, j5, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4307na[] newArray(int i) {
        return new C4307na[i];
    }
}
