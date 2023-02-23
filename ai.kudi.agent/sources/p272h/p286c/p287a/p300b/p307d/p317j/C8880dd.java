package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.dd */
/* loaded from: classes2.dex */
public final class C8880dd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        float f = 0.0f;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    i2 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 3:
                    i3 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 4:
                    i4 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 5:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 6:
                    f = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8865cd(i, i2, i3, i4, z, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C8865cd[i];
    }
}
