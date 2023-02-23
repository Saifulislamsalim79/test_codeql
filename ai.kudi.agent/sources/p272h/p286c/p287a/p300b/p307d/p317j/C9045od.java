package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.od */
/* loaded from: classes2.dex */
public final class C9045od implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 2) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 3) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 4) {
                i3 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 5) {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i != 6) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i4 = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C9030nd(i, i2, i3, j, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C9030nd[i];
    }
}
