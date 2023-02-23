package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.i */
/* loaded from: classes2.dex */
public final class C9215i implements Parcelable.Creator<C9214h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9214h createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                arrayList = SafeParcelReader.m31685e(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C9214h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9214h[] newArray(int i) {
        return new C9214h[i];
    }
}
