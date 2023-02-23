package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.firebase.auth.C5206g0;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.p0 */
/* loaded from: classes2.dex */
public final class C5242p0 implements Parcelable.Creator<C5240o0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5240o0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C3140em c3140em = null;
        C5234l0 c5234l0 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C5244q0 c5244q0 = null;
        C5206g0 c5206g0 = null;
        C5245r c5245r = null;
        boolean z = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    c3140em = (C3140em) SafeParcelReader.m31687c(parcel, m31675o, C3140em.CREATOR);
                    break;
                case 2:
                    c5234l0 = (C5234l0) SafeParcelReader.m31687c(parcel, m31675o, C5234l0.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 4:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m31683g(parcel, m31675o, C5234l0.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.m31685e(parcel, m31675o);
                    break;
                case 7:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    bool = SafeParcelReader.m31679k(parcel, m31675o);
                    break;
                case 9:
                    c5244q0 = (C5244q0) SafeParcelReader.m31687c(parcel, m31675o, C5244q0.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 11:
                    c5206g0 = (C5206g0) SafeParcelReader.m31687c(parcel, m31675o, C5206g0.CREATOR);
                    break;
                case 12:
                    c5245r = (C5245r) SafeParcelReader.m31687c(parcel, m31675o, C5245r.CREATOR);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5240o0(c3140em, c5234l0, str, str2, arrayList, arrayList2, str3, bool, c5244q0, z, c5206g0, c5245r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5240o0[] newArray(int i) {
        return new C5240o0[i];
    }
}
