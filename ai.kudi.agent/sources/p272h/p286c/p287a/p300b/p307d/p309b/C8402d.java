package p272h.p286c.p287a.p300b.p307d.p309b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.d.b.d */
/* loaded from: classes2.dex */
public class C8402d {
    static {
        C8402d.class.getClassLoader();
    }

    private C8402d() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16132a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m16131b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
