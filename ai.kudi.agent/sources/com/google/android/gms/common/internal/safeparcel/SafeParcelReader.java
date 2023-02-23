package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m31689a(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m31670t);
        return readBundle;
    }

    /* renamed from: b */
    public static int[] m31688b(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m31670t);
        return createIntArray;
    }

    /* renamed from: c */
    public static <T extends Parcelable> T m31687c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m31670t);
        return createFromParcel;
    }

    /* renamed from: d */
    public static String m31686d(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m31670t);
        return readString;
    }

    /* renamed from: e */
    public static ArrayList<String> m31685e(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m31670t);
        return createStringArrayList;
    }

    /* renamed from: f */
    public static <T> T[] m31684f(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m31670t);
        return tArr;
    }

    /* renamed from: g */
    public static <T> ArrayList<T> m31683g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m31670t);
        return createTypedArrayList;
    }

    /* renamed from: h */
    public static void m31682h(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: i */
    public static int m31681i(int i) {
        return (char) i;
    }

    /* renamed from: j */
    public static boolean m31680j(Parcel parcel, int i) {
        m31666x(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: k */
    public static Boolean m31679k(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        if (m31670t == 0) {
            return null;
        }
        m31667w(parcel, i, m31670t, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: l */
    public static Double m31678l(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        if (m31670t == 0) {
            return null;
        }
        m31667w(parcel, i, m31670t, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: m */
    public static float m31677m(Parcel parcel, int i) {
        m31666x(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: n */
    public static Float m31676n(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        if (m31670t == 0) {
            return null;
        }
        m31667w(parcel, i, m31670t, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: o */
    public static int m31675o(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: p */
    public static IBinder m31674p(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m31670t == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m31670t);
        return readStrongBinder;
    }

    /* renamed from: q */
    public static int m31673q(Parcel parcel, int i) {
        m31666x(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: r */
    public static long m31672r(Parcel parcel, int i) {
        m31666x(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: s */
    public static Long m31671s(Parcel parcel, int i) {
        int m31670t = m31670t(parcel, i);
        if (m31670t == 0) {
            return null;
        }
        m31667w(parcel, i, m31670t, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: t */
    public static int m31670t(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: u */
    public static void m31669u(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m31670t(parcel, i));
    }

    /* renamed from: v */
    public static int m31668v(Parcel parcel) {
        int m31675o = m31675o(parcel);
        int m31670t = m31670t(parcel, m31675o);
        int dataPosition = parcel.dataPosition();
        if (m31681i(m31675o) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m31675o));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = m31670t + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
        return i;
    }

    /* renamed from: w */
    private static void m31667w(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: x */
    private static void m31666x(Parcel parcel, int i, int i2) {
        int m31670t = m31670t(parcel, i);
        if (m31670t == i2) {
            return;
        }
        String hexString = Integer.toHexString(m31670t);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(m31670t);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }
}
