package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.C2924u0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.m */
/* loaded from: classes2.dex */
public final class C9219m implements Parcelable.Creator<C9218l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9218l createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C2826b c2826b = null;
        C2924u0 c2924u0 = null;
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                c2826b = (C2826b) SafeParcelReader.m31687c(parcel, m31675o, C2826b.CREATOR);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c2924u0 = (C2924u0) SafeParcelReader.m31687c(parcel, m31675o, C2924u0.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C9218l(i, c2826b, c2924u0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9218l[] newArray(int i) {
        return new C9218l[i];
    }
}
