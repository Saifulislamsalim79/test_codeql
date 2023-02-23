package p272h.p375g.p376a.p379i;

import java.math.BigInteger;
/* compiled from: Bcd.java */
/* renamed from: h.g.a.i.a */
/* loaded from: classes2.dex */
public final class C9449a {
    /* renamed from: a */
    public static BigInteger m14708a(byte[] bArr, int i, int i2) throws IndexOutOfBoundsException {
        char[] cArr = new char[i2];
        int i3 = 0;
        for (int i4 = i; i4 < (i2 / 2) + i + (i2 % 2); i4++) {
            int i5 = i3 + 1;
            cArr[i3] = (char) (((bArr[i4] & 240) >> 4) + 48);
            i3 = i5 + 1;
            cArr[i5] = (char) ((bArr[i4] & 15) + 48);
        }
        return new BigInteger(new String(cArr));
    }

    /* renamed from: b */
    public static long m14707b(byte[] bArr, int i, int i2) throws IndexOutOfBoundsException {
        if (i2 <= 18) {
            long j = 0;
            long j2 = 1;
            for (int i3 = (((i2 / 2) + i) + (i2 % 2)) - 1; i3 >= i; i3--) {
                long j3 = j2 * 10;
                j = j + ((bArr[i3] & 15) * j2) + (((bArr[i3] & 240) >> 4) * j3);
                j2 = j3 * 10;
            }
            return j;
        }
        throw new IndexOutOfBoundsException("Buffer too big to decode as long");
    }

    /* renamed from: c */
    public static void m14706c(String str, byte[] bArr) {
        int i;
        int i2 = 0;
        if (str.length() % 2 == 1) {
            bArr[0] = (byte) (str.charAt(0) - '0');
            i = 1;
            i2 = 1;
        } else {
            i = 0;
        }
        while (i2 < str.length()) {
            bArr[i] = (byte) (((str.charAt(i2) - '0') << 4) | (str.charAt(i2 + 1) - '0'));
            i2 += 2;
            i++;
        }
    }
}
