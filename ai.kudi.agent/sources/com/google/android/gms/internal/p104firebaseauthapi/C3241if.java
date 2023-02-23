package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.if */
/* loaded from: classes2.dex */
public final class C3241if implements Parcelable.Creator<C3214hf> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3214hf createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3214hf(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3214hf[] newArray(int i) {
        return new C3214hf[i];
    }
}
