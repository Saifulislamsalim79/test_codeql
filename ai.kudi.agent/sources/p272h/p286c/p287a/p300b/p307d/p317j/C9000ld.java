package p272h.p286c.p287a.p300b.p307d.p317j;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.ld */
/* loaded from: classes2.dex */
public final class C9000ld implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                pointF = (PointF) SafeParcelReader.m31687c(parcel, m31675o, PointF.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8985kd(i, pointF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C8985kd[i];
    }
}
