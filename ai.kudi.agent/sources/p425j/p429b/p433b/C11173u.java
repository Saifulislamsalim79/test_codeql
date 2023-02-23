package p425j.p429b.p433b;

import java.nio.charset.Charset;
/* compiled from: Util.java */
/* renamed from: j.b.b.u */
/* loaded from: classes3.dex */
final class C11173u {

    /* renamed from: a */
    public static final Charset f25255a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m11455a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m11454b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: c */
    public static int m11453c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static short m11452d(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: e */
    public static void m11451e(Throwable th) {
        m11450f(th);
        throw null;
    }

    /* renamed from: f */
    private static <T extends Throwable> void m11450f(Throwable th) throws Throwable {
        throw th;
    }
}
