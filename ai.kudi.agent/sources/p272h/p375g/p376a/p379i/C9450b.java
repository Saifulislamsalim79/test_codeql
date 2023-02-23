package p272h.p375g.p376a.p379i;
/* compiled from: HexCodec.java */
/* renamed from: h.g.a.i.b */
/* loaded from: classes2.dex */
public final class C9450b {

    /* renamed from: a */
    static final char[] f22111a = "0123456789ABCDEF".toCharArray();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m14705a(java.lang.String r11) {
        /*
            r0 = 0
            if (r11 == 0) goto L7a
            int r1 = r11.length()
            if (r1 != 0) goto Lb
            goto L7a
        Lb:
            int r1 = r11.length()
            r2 = 3
            r3 = 1
            if (r1 >= r2) goto L21
            byte[] r1 = new byte[r3]
            r2 = 16
            int r11 = java.lang.Integer.parseInt(r11, r2)
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r1[r0] = r11
            return r1
        L21:
            int r1 = r11.length()
            int r2 = r1 % 2
            if (r2 == 0) goto L2c
            int r1 = r1 + 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r2 = 2
            int r1 = r1 / r2
            byte[] r4 = new byte[r1]
            r5 = 0
            r6 = 0
            r7 = 0
        L34:
            if (r5 >= r1) goto L79
            r8 = 0
        L37:
            if (r8 >= r2) goto L76
            int r9 = r11.length()
            if (r7 >= r9) goto L76
            int r9 = r7 + 1
            char r7 = r11.charAt(r7)
            r10 = 65
            if (r7 < r10) goto L51
            r10 = 70
            if (r7 > r10) goto L51
            int r7 = r7 + (-55)
        L4f:
            char r7 = (char) r7
            goto L67
        L51:
            r10 = 48
            if (r7 < r10) goto L5c
            r10 = 57
            if (r7 > r10) goto L5c
            int r7 = r7 + (-48)
            goto L4f
        L5c:
            r10 = 97
            if (r7 < r10) goto L67
            r10 = 102(0x66, float:1.43E-43)
            if (r7 > r10) goto L67
            int r7 = r7 + (-87)
            goto L4f
        L67:
            if (r3 != 0) goto L6c
            int r6 = r7 << 4
            goto L70
        L6c:
            r6 = r6 | r7
            byte r7 = (byte) r6
            r4[r5] = r7
        L70:
            int r3 = 1 - r3
            int r8 = r8 + 1
            r7 = r9
            goto L37
        L76:
            int r5 = r5 + 1
            goto L34
        L79:
            return r4
        L7a:
            byte[] r11 = new byte[r0]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p375g.p376a.p379i.C9450b.m14705a(java.lang.String):byte[]");
    }

    /* renamed from: b */
    public static String m14704b(byte[] bArr, int i, int i2) {
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[i2 * 2];
        int i3 = -1;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3++;
            int i5 = i3 * 2;
            char[] cArr2 = f22111a;
            cArr[i5] = cArr2[(bArr[i4] & 240) >> 4];
            cArr[i5 + 1] = cArr2[bArr[i4] & 15];
        }
        return new String(cArr);
    }
}
