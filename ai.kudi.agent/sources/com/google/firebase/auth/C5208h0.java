package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.h0 */
/* loaded from: classes2.dex */
public final class C5208h0 implements Parcelable.Creator<C5206g0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5206g0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C3168fn c3168fn = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 4:
                    c3168fn = (C3168fn) SafeParcelReader.m31687c(parcel, m31675o, C3168fn.CREATOR);
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
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5206g0(str, str2, str3, c3168fn, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5206g0[] newArray(int i) {
        return new C5206g0[i];
    }
}
