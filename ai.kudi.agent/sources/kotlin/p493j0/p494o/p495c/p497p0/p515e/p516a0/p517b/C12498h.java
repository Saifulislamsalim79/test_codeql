package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import kotlin.C13668y;
import kotlin.e0.d.l;
/* compiled from: utfEncoding.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.h */
/* loaded from: classes3.dex */
public final class C12498h {
    /* renamed from: a */
    public static final byte[] m8627a(String[] strArr) {
        int i;
        l.f(strArr, "strings");
        int i2 = 0;
        for (String str : strArr) {
            i2 += str.length();
        }
        byte[] bArr = new byte[i2];
        int length = strArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str2 = strArr[i3];
            i3++;
            int length2 = str2.length() - 1;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    i = i4 + 1;
                    bArr[i4] = (byte) str2.charAt(i5);
                    if (i5 == length2) {
                        break;
                    }
                    i5 = i6;
                    i4 = i;
                }
                i4 = i;
            }
        }
        boolean z = i4 == i2;
        if (!C13668y.f30115a || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
