package p272h.p286c.p287a.p300b.p307d.p317j;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.fd */
/* loaded from: classes2.dex */
public final class C8910fd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Rect rect = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.m31687c(parcel, m31675o, Rect.CREATOR);
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
                    f7 = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m31683g(parcel, m31675o, C8985kd.CREATOR);
                    break;
                case 11:
                    arrayList2 = SafeParcelReader.m31683g(parcel, m31675o, C8835ad.CREATOR);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8895ed(i, rect, f, f2, f3, f4, f5, f6, f7, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C8895ed[i];
    }
}
