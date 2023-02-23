package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5271s;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ef */
/* loaded from: classes2.dex */
public final class C3133ef implements Parcelable.Creator<C3106df> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3106df createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C5271s c5271s = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    c5271s = (C5271s) SafeParcelReader.m31687c(parcel, m31675o, C5271s.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 3:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 4:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 5:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 6:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 7:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    str4 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 9:
                    z3 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3106df(c5271s, str, str2, j, z, z2, str3, str4, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3106df[] newArray(int i) {
        return new C3106df[i];
    }
}
