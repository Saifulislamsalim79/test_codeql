package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.b1 */
/* loaded from: classes2.dex */
public final class C8838b1 {
    static {
        C8838b1.class.getClassLoader();
    }

    private C8838b1() {
    }

    /* renamed from: a */
    public static void m15812a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m15811b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
