package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5206g0;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yl */
/* loaded from: classes2.dex */
public final class C3666yl implements Parcelable.Creator<C3640xl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3640xl createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C3355mm c3355mm = null;
        String str5 = null;
        String str6 = null;
        C5206g0 c5206g0 = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
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
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 5:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 6:
                    str4 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    c3355mm = (C3355mm) SafeParcelReader.m31687c(parcel, m31675o, C3355mm.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 9:
                    str6 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 10:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 11:
                    j2 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 12:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 13:
                    c5206g0 = (C5206g0) SafeParcelReader.m31687c(parcel, m31675o, C5206g0.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m31683g(parcel, m31675o, C3248im.CREATOR);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3640xl(str, str2, z, str3, str4, c3355mm, str5, str6, j, j2, z2, c5206g0, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3640xl[] newArray(int i) {
        return new C3640xl[i];
    }
}
