package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2914s0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.k */
/* loaded from: classes2.dex */
public final class C9217k implements Parcelable.Creator<C9216j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9216j createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        C2914s0 c2914s0 = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c2914s0 = (C2914s0) SafeParcelReader.m31687c(parcel, m31675o, C2914s0.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C9216j(i, c2914s0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9216j[] newArray(int i) {
        return new C9216j[i];
    }
}
