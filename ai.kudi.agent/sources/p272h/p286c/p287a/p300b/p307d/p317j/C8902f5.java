package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.f5 */
/* loaded from: classes2.dex */
public final class C8902f5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C9014mc[] c9014mcArr = null;
        C8854c2[] c8854c2Arr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
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
                    f = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 4:
                    f2 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 5:
                    f3 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 6:
                    f4 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 7:
                    f5 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 8:
                    f6 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 9:
                    c9014mcArr = (C9014mc[]) SafeParcelReader.m31684f(parcel, m31675o, C9014mc.CREATOR);
                    break;
                case 10:
                    f8 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 11:
                    f9 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 12:
                    f10 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 13:
                    c8854c2Arr = (C8854c2[]) SafeParcelReader.m31684f(parcel, m31675o, C8854c2.CREATOR);
                    break;
                case 14:
                    f7 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 15:
                    f11 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8886e4(i, i2, f, f2, f3, f4, f5, f6, f7, c9014mcArr, f8, f9, f10, c8854c2Arr, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C8886e4[i];
    }
}
