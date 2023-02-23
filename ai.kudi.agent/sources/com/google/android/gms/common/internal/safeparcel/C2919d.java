package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2965c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.safeparcel.d */
/* loaded from: classes2.dex */
public final class C2919d {
    /* renamed from: a */
    public static <T extends InterfaceC2918c> T m31643a(byte[] bArr, Parcelable.Creator<T> creator) {
        s.j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: b */
    public static <T extends InterfaceC2918c> T m31642b(String str, Parcelable.Creator<T> creator) {
        return (T) m31643a(C2965c.m31541a(str), creator);
    }

    /* renamed from: c */
    public static <T extends InterfaceC2918c> byte[] m31641c(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: d */
    public static <T extends InterfaceC2918c> void m31640d(T t, Intent intent, String str) {
        intent.putExtra(str, m31641c(t));
    }

    /* renamed from: e */
    public static <T extends InterfaceC2918c> String m31639e(T t) {
        return C2965c.d(m31641c(t));
    }
}
