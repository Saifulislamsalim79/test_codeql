package com.paypad.utils;
/* loaded from: classes2.dex */
public abstract class HexUtil {
    private static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HexUtil() {
    }

    public static final String byteArrayToHexString(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 3];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            char[] cArr2 = HEX;
            int i6 = i + i3;
            cArr[i4] = cArr2[(bArr[i6] >> 4) & 15];
            int i7 = i5 + 1;
            cArr[i5] = cArr2[bArr[i6] & 15];
            cArr[i7] = ' ';
            i3++;
            i4 = i7 + 1;
        }
        return new String(cArr);
    }

    public static final byte[] hexStringToByteArray(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        if ((i2 & 1) == 0) {
            byte[] bArr = new byte[i2 / 2];
            for (int i5 = 0; i5 < i2; i5++) {
                char c = cArr[i + i5];
                if ('0' > c || c > '9') {
                    if ('A' <= c && c <= 'F') {
                        i3 = c - 'A';
                    } else if ('a' > c || c > 'f') {
                        throw new IllegalArgumentException("The argument 'src' can contains only HEX characters");
                    } else {
                        i3 = c - 'a';
                    }
                    i4 = i3 + 10;
                } else {
                    i4 = c - '0';
                }
                if ((i5 & 1) != 0) {
                    int i6 = i5 / 2;
                    bArr[i6] = (byte) (bArr[i6] + i4);
                } else {
                    bArr[i5 / 2] = (byte) (i4 << 4);
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("The argument 'len' can not be odd value");
    }

    public static final String byteArrayToHexString(byte[] bArr) {
        return byteArrayToHexString(bArr, 0, bArr.length);
    }

    public static final byte[] hexStringToByteArray(char[] cArr) {
        return hexStringToByteArray(cArr, 0, cArr.length);
    }

    public static final byte[] hexStringToByteArray(String str) {
        return hexStringToByteArray(str.toCharArray());
    }

    public static final byte[] hexStringToByteArray(String str, char c) {
        char[] charArray = str.toCharArray();
        int i = 0;
        for (char c2 : charArray) {
            if (c2 != c) {
                charArray[i] = c2;
                i++;
            }
        }
        return hexStringToByteArray(charArray, 0, i);
    }
}
