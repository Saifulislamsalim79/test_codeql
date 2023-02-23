package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2863d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
/* renamed from: h.c.a.b.d.g.s */
/* loaded from: classes2.dex */
public final class C8477s implements Parcelable.Creator<C8476r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8476r createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        List<C2863d> list = C8476r.f20176z;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i != 1) {
                switch (m31681i) {
                    case 5:
                        list = SafeParcelReader.m31683g(parcel, m31675o, C2863d.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.m31686d(parcel, m31675o);
                        continue;
                    case 7:
                        z = SafeParcelReader.m31680j(parcel, m31675o);
                        continue;
                    case 8:
                        z2 = SafeParcelReader.m31680j(parcel, m31675o);
                        continue;
                    case 9:
                        z3 = SafeParcelReader.m31680j(parcel, m31675o);
                        continue;
                    case 10:
                        str2 = SafeParcelReader.m31686d(parcel, m31675o);
                        continue;
                    default:
                        SafeParcelReader.m31669u(parcel, m31675o);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m31687c(parcel, m31675o, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8476r(locationRequest, list, str, z, z2, z3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8476r[] newArray(int i) {
        return new C8476r[i];
    }
}
