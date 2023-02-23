package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: h.c.a.b.d.g.e0 */
/* loaded from: classes2.dex */
public final class C8463e0 implements Parcelable.Creator<C8461d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8461d0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C8457b0 c8457b0 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                c8457b0 = (C8457b0) SafeParcelReader.m31687c(parcel, m31675o, C8457b0.CREATOR);
            } else if (m31681i == 3) {
                iBinder = SafeParcelReader.m31674p(parcel, m31675o);
            } else if (m31681i != 4) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                iBinder2 = SafeParcelReader.m31674p(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8461d0(i, c8457b0, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8461d0[] newArray(int i) {
        return new C8461d0[i];
    }
}
