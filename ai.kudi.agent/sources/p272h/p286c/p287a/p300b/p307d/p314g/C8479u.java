package p272h.p286c.p287a.p300b.p307d.p314g;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: h.c.a.b.d.g.u */
/* loaded from: classes2.dex */
public final class C8479u implements Parcelable.Creator<C8478t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8478t createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C8476r c8476r = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    c8476r = (C8476r) SafeParcelReader.m31687c(parcel, m31675o, C8476r.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m31674p(parcel, m31675o);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m31687c(parcel, m31675o, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m31674p(parcel, m31675o);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m31674p(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C8478t(i, c8476r, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8478t[] newArray(int i) {
        return new C8478t[i];
    }
}
