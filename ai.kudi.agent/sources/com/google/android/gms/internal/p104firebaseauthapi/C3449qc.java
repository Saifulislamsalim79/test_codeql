package com.google.android.gms.internal.p104firebaseauthapi;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qc */
/* loaded from: classes2.dex */
final class C3449qc {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m30432a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long m30431b = m30431b(bArr, 0, 0);
            int i = 2;
            long m30431b2 = m30431b(bArr, 3, 2) & 67108611;
            long m30431b3 = m30431b(bArr, 6, 4) & 67092735;
            long m30431b4 = m30431b(bArr, 9, 6) & 66076671;
            long m30431b5 = m30431b(bArr, 12, 8) & 1048575;
            long j = m30431b2 * 5;
            long j2 = m30431b3 * 5;
            long j3 = m30431b4 * 5;
            long j4 = m30431b5 * 5;
            int i2 = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (true) {
                int length = bArr2.length;
                if (i3 < length) {
                    int min = Math.min(16, length - i3);
                    System.arraycopy(bArr2, i3, bArr3, 0, min);
                    bArr3[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr3, min + 1, i2, (byte) 0);
                    }
                    long m30431b6 = j9 + m30431b(bArr3, 0, 0);
                    long m30431b7 = j6 + m30431b(bArr3, 3, i);
                    long m30431b8 = j5 + m30431b(bArr3, 6, 4);
                    long m30431b9 = j7 + m30431b(bArr3, 9, 6);
                    long m30431b10 = j8 + (m30431b(bArr3, 12, 8) | (bArr3[16] << PrinterCommands.COSH));
                    long j10 = (m30431b6 * m30431b) + (m30431b7 * j4) + (m30431b8 * j3) + (m30431b9 * j2) + (m30431b10 * j);
                    long j11 = (m30431b6 * m30431b2) + (m30431b7 * m30431b) + (m30431b8 * j4) + (m30431b9 * j3) + (m30431b10 * j2) + (j10 >> 26);
                    long j12 = (m30431b6 * m30431b3) + (m30431b7 * m30431b2) + (m30431b8 * m30431b) + (m30431b9 * j4) + (m30431b10 * j3) + (j11 >> 26);
                    long j13 = (m30431b6 * m30431b4) + (m30431b7 * m30431b3) + (m30431b8 * m30431b2) + (m30431b9 * m30431b) + (m30431b10 * j4) + (j12 >> 26);
                    long j14 = (m30431b6 * m30431b5) + (m30431b7 * m30431b4) + (m30431b8 * m30431b3) + (m30431b9 * m30431b2) + (m30431b10 * m30431b) + (j13 >> 26);
                    j8 = j14 & 67108863;
                    long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                    j9 = j15 & 67108863;
                    j6 = (j11 & 67108863) + (j15 >> 26);
                    i3 += 16;
                    j7 = j13 & 67108863;
                    j5 = j12 & 67108863;
                    i2 = 17;
                    i = 2;
                } else {
                    long j16 = j5 + (j6 >> 26);
                    long j17 = j16 & 67108863;
                    long j18 = j7 + (j16 >> 26);
                    long j19 = j18 & 67108863;
                    long j20 = j8 + (j18 >> 26);
                    long j21 = j20 & 67108863;
                    long j22 = j9 + ((j20 >> 26) * 5);
                    long j23 = j22 & 67108863;
                    long j24 = (j6 & 67108863) + (j22 >> 26);
                    long j25 = j23 + 5;
                    long j26 = (j25 >> 26) + j24;
                    long j27 = j17 + (j26 >> 26);
                    long j28 = j19 + (j27 >> 26);
                    long j29 = (j21 + (j28 >> 26)) - 67108864;
                    long j30 = j29 >> 63;
                    long j31 = j30 ^ (-1);
                    long j32 = (j24 & j30) | (j26 & 67108863 & j31);
                    long j33 = (j17 & j30) | (j27 & 67108863 & j31);
                    long j34 = (j19 & j30) | (j28 & 67108863 & j31);
                    long m30430c = (((j23 & j30) | (j25 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + m30430c(bArr, 16);
                    long m30430c2 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + m30430c(bArr, 20) + (m30430c >> 32);
                    long m30430c3 = (((j33 >> 12) | (j34 << 14)) & 4294967295L) + m30430c(bArr, 24) + (m30430c2 >> 32);
                    long m30430c4 = m30430c(bArr, 28);
                    byte[] bArr4 = new byte[16];
                    m30429d(bArr4, m30430c & 4294967295L, 0);
                    m30429d(bArr4, m30430c2 & 4294967295L, 4);
                    m30429d(bArr4, m30430c3 & 4294967295L, 8);
                    m30429d(bArr4, ((((j34 >> 18) | (((j21 & j30) | (j29 & j31)) << 8)) & 4294967295L) + m30430c4 + (m30430c3 >> 32)) & 4294967295L, 12);
                    return bArr4;
                }
            }
        } else {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
    }

    /* renamed from: b */
    private static long m30431b(byte[] bArr, int i, int i2) {
        return (m30430c(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: c */
    private static long m30430c(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: d */
    private static void m30429d(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
