package p272h.p286c.p287a.p300b.p320f.p321b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.c */
/* loaded from: classes2.dex */
public final class C9209c implements Parcelable.Creator<C9208b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9208b createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                intent = (Intent) SafeParcelReader.m31687c(parcel, m31675o, Intent.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C9208b(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9208b[] newArray(int i) {
        return new C9208b[i];
    }
}
