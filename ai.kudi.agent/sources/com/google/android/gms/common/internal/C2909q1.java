package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.q1 */
/* loaded from: classes2.dex */
public final class C2909q1 implements Parcelable.Creator<C2871f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2871f createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C2923u c2923u = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    c2923u = (C2923u) SafeParcelReader.m31687c(parcel, m31675o, C2923u.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 3:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 4:
                    iArr = SafeParcelReader.m31688b(parcel, m31675o);
                    break;
                case 5:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m31688b(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2871f(c2923u, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2871f[] newArray(int i) {
        return new C2871f[i];
    }
}
