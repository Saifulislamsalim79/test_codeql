package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2863d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.C4133t;
import java.util.List;
/* renamed from: h.c.a.b.d.g.c0 */
/* loaded from: classes2.dex */
public final class C8459c0 implements Parcelable.Creator<C8457b0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8457b0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C4133t c4133t = C8457b0.f20157w;
        List<C2863d> list = C8457b0.f20156f;
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                c4133t = (C4133t) SafeParcelReader.m31687c(parcel, m31675o, C4133t.CREATOR);
            } else if (m31681i == 2) {
                list = SafeParcelReader.m31683g(parcel, m31675o, C2863d.CREATOR);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8457b0(c4133t, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8457b0[] newArray(int i) {
        return new C8457b0[i];
    }
}
