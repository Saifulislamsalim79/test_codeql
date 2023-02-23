package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.fa */
/* loaded from: classes2.dex */
public final class C4214fa implements Parcelable.Creator<C4203ea> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m28268a(C4203ea c4203ea, Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, c4203ea.f10244c);
        C2917b.m31651o(parcel, 2, c4203ea.f10245d, false);
        C2917b.m31654l(parcel, 3, c4203ea.f10246e);
        C2917b.m31653m(parcel, 4, c4203ea.f10247f, false);
        C2917b.m31658h(parcel, 5, null, false);
        C2917b.m31651o(parcel, 6, c4203ea.f10248w, false);
        C2917b.m31651o(parcel, 7, c4203ea.f10249x, false);
        C2917b.m31660f(parcel, 8, c4203ea.f10250y, false);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C4203ea createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
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
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 4:
                    l = SafeParcelReader.m31671s(parcel, m31675o);
                    break;
                case 5:
                    f = SafeParcelReader.m31676n(parcel, m31675o);
                    break;
                case 6:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    d = SafeParcelReader.m31678l(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4203ea(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4203ea[] newArray(int i) {
        return new C4203ea[i];
    }
}
