package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: h.c.a.b.d.g.y */
/* loaded from: classes2.dex */
public class C8483y {
    static {
        C8483y.class.getClassLoader();
    }

    private C8483y() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16047a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m16046b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m16045c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m16044d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
