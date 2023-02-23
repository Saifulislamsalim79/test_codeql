package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kl */
/* loaded from: classes2.dex */
public final class C3301kl implements Parcelable.Creator<C3274jl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3274jl createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        C3114dn c3114dn = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 2:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 3:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 4:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 6:
                    c3114dn = (C3114dn) SafeParcelReader.m31687c(parcel, m31675o, C3114dn.CREATOR);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m31685e(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3274jl(str, z, str2, z2, c3114dn, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3274jl[] newArray(int i) {
        return new C3274jl[i];
    }
}
