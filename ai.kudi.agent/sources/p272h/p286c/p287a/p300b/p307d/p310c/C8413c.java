package p272h.p286c.p287a.p300b.p307d.p310c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.d.c.c */
/* loaded from: classes2.dex */
public final class C8413c {
    static {
        C8413c.class.getClassLoader();
    }

    private C8413c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16121a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m16120b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m16119c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
