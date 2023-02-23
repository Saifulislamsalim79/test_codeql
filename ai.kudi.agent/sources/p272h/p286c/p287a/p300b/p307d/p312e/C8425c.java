package p272h.p286c.p287a.p300b.p307d.p312e;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: h.c.a.b.d.e.c */
/* loaded from: classes2.dex */
public final class C8425c {
    static {
        C8425c.class.getClassLoader();
    }

    private C8425c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16111a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m16110b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m16109c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m16108d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: e */
    public static boolean m16107e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
