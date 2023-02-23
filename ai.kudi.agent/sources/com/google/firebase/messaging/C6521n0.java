package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.n0 */
/* loaded from: classes2.dex */
public class C6521n0 implements Parcelable.Creator<C6519m0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m21720c(C6519m0 c6519m0, Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31661e(parcel, 2, c6519m0.f15744c, false);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public C6519m0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                bundle = SafeParcelReader.m31689a(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C6519m0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public C6519m0[] newArray(int i) {
        return new C6519m0[i];
    }
}
