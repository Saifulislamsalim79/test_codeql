package io.grpc.p384h1;

import com.google.common.base.C5034d;
import com.google.common.p109io.BaseEncoding;
import io.grpc.C10049s0;
import io.grpc.C9897i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
/* compiled from: TransportFrameUtil.java */
/* renamed from: io.grpc.h1.m2 */
/* loaded from: classes2.dex */
public final class C9718m2 {

    /* renamed from: a */
    private static final Logger f22813a = Logger.getLogger(C9718m2.class.getName());

    /* renamed from: b */
    private static final byte[] f22814b = "-bin".getBytes(C5034d.f12685a);

    private C9718m2() {
    }

    /* renamed from: a */
    private static boolean m14138a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m14137b(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static byte[][] m14136c(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (!m14138a(bArr2, f22814b)) {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] m25550c = BaseEncoding.m25551b().m25550c(new String(bArr3, i3, i4 - i3, C5034d.f12685a));
                        arrayList.add(bArr2);
                        arrayList.add(m25550c);
                        i3 = i4 + 1;
                    }
                }
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    /* renamed from: d */
    public static byte[][] m14135d(C10049s0 c10049s0) {
        byte[][] m13742d = C9897i0.m13742d(c10049s0);
        if (m13742d == null) {
            return new byte[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < m13742d.length; i2 += 2) {
            byte[] bArr = m13742d[i2];
            byte[] bArr2 = m13742d[i2 + 1];
            if (m14138a(bArr, f22814b)) {
                m13742d[i] = bArr;
                m13742d[i + 1] = C9897i0.f23242b.m25548f(bArr2).getBytes(C5034d.f12685a);
            } else if (m14137b(bArr2)) {
                m13742d[i] = bArr;
                m13742d[i + 1] = bArr2;
            } else {
                String str = new String(bArr, C5034d.f12685a);
                Logger logger = f22813a;
                logger.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        return i == m13742d.length ? m13742d : (byte[][]) Arrays.copyOfRange(m13742d, 0, i);
    }

    /* renamed from: e */
    public static byte[][] m14134e(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m14138a(bArr2, f22814b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        return m14136c(bArr, i);
                    }
                }
                bArr[i2] = BaseEncoding.m25551b().m25550c(new String(bArr3, C5034d.f12685a));
            }
        }
        return bArr;
    }
}
