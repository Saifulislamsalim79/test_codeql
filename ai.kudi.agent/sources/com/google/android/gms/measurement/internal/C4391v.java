package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes2.dex */
public final class C4391v implements Parcelable.Creator<C4379u> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27921a(C4379u c4379u, Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, c4379u.f10698c, false);
        C2917b.m31652n(parcel, 3, c4379u.f10699d, i, false);
        C2917b.m31651o(parcel, 4, c4379u.f10700e, false);
        C2917b.m31654l(parcel, 5, c4379u.f10701f);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C4379u createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        C4355s c4355s = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                c4355s = (C4355s) SafeParcelReader.m31687c(parcel, m31675o, C4355s.CREATOR);
            } else if (m31681i == 4) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4379u(str, c4355s, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4379u[] newArray(int i) {
        return new C4379u[i];
    }
}
