package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* loaded from: classes2.dex */
public class C2917b {
    /* renamed from: a */
    public static int m31665a(Parcel parcel) {
        return m31647s(parcel, 20293);
    }

    /* renamed from: b */
    public static void m31664b(Parcel parcel, int i) {
        m31646t(parcel, i);
    }

    /* renamed from: c */
    public static void m31663c(Parcel parcel, int i, boolean z) {
        m31645u(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m31662d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m31645u(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m31645u(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m31661e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeBundle(bundle);
        m31646t(parcel, m31647s);
    }

    /* renamed from: f */
    public static void m31660f(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m31645u(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m31645u(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m31659g(Parcel parcel, int i, float f) {
        m31645u(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: h */
    public static void m31658h(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m31645u(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m31645u(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m31657i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m31646t(parcel, m31647s);
    }

    /* renamed from: j */
    public static void m31656j(Parcel parcel, int i, int i2) {
        m31645u(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: k */
    public static void m31655k(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeIntArray(iArr);
        m31646t(parcel, m31647s);
    }

    /* renamed from: l */
    public static void m31654l(Parcel parcel, int i, long j) {
        m31645u(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: m */
    public static void m31653m(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m31645u(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m31645u(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m31652n(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m31646t(parcel, m31647s);
    }

    /* renamed from: o */
    public static void m31651o(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeString(str);
        m31646t(parcel, m31647s);
    }

    /* renamed from: p */
    public static void m31650p(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeStringList(list);
        m31646t(parcel, m31647s);
    }

    /* renamed from: q */
    public static <T extends Parcelable> void m31649q(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m31644v(parcel, t, i2);
            }
        }
        m31646t(parcel, m31647s);
    }

    /* renamed from: r */
    public static <T extends Parcelable> void m31648r(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m31645u(parcel, i, 0);
                return;
            }
            return;
        }
        int m31647s = m31647s(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m31644v(parcel, t, 0);
            }
        }
        m31646t(parcel, m31647s);
    }

    /* renamed from: s */
    private static int m31647s(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: t */
    private static void m31646t(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: u */
    private static void m31645u(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: v */
    private static <T extends Parcelable> void m31644v(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
