package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes2.dex */
public final class C2696b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
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
                    uri = (Uri) SafeParcelReader.m31687c(parcel, m31675o, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 9:
                    str6 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m31683g(parcel, m31675o, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 12:
                    str8 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
