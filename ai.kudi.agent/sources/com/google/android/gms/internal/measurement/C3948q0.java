package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* loaded from: classes2.dex */
public final class C3948q0 {

    /* renamed from: a */
    private static final ClassLoader f9620a = C3948q0.class.getClassLoader();

    private C3948q0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m29090a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m29089b(Parcel parcel) {
        return parcel.readHashMap(f9620a);
    }

    /* renamed from: c */
    public static void m29088c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m29087d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m29086e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m29085f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
