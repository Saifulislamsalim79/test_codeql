package p576m;

import java.nio.charset.Charset;
/* compiled from: Util.java */
/* renamed from: m.u */
/* loaded from: classes3.dex */
final class C14368u {

    /* renamed from: a */
    public static final Charset f31667a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m1945a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m1944b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: c */
    public static int m1943c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static short m1942d(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: e */
    public static void m1941e(Throwable th) {
        m1940f(th);
        throw null;
    }

    /* renamed from: f */
    private static <T extends Throwable> void m1940f(Throwable th) throws Throwable {
        throw th;
    }
}
