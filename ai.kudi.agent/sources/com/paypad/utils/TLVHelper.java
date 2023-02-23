package com.paypad.utils;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class TLVHelper {
    public static byte[] dataDictionaryToTLVData(Map<String, Object> map, String str) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj instanceof List) {
                for (byte[] bArr : (List) obj) {
                    byteArrayOutputStream.write(headerForDataWithTag(bArr, str2));
                    byteArrayOutputStream.write(bArr);
                }
            } else if (obj instanceof Map) {
                byte[] dataDictionaryToTLVData = dataDictionaryToTLVData((Map) obj, null);
                byteArrayOutputStream.write(headerForDataWithTag(dataDictionaryToTLVData, str2));
                byteArrayOutputStream.write(dataDictionaryToTLVData);
            } else {
                byte[] bArr2 = (byte[]) obj;
                byteArrayOutputStream.write(headerForDataWithTag(bArr2, str2));
                byteArrayOutputStream.write(bArr2);
            }
        }
        if (str != null) {
            byte[] headerForDataWithTag = headerForDataWithTag(byteArrayOutputStream.toByteArray(), str);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(headerForDataWithTag);
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream2.close();
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] getTLVFromResponse(byte[] bArr) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = i3 + 1;
            if (bArr[i3] == -16) {
                if ((bArr[i4] & (-128)) == 0) {
                    i = i4 + 1;
                    i2 = bArr[i4];
                } else if ((bArr[i4] & 127) != 0) {
                    i = i4 + 1;
                    int i5 = bArr[i4] & 127;
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < i5) {
                        i6 = (i6 << 8) | (bArr[i] & 255);
                        i7++;
                        i++;
                    }
                    i2 = i6;
                } else {
                    i = i4;
                    i2 = 0;
                }
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            }
            i3 = i4 + 1;
        }
        return null;
    }

    private static byte[] headerForDataWithTag(byte[] bArr, String str) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(HexUtil.hexStringToByteArray(str));
        if (bArr != null && bArr.length != 0) {
            if (bArr.length <= 127) {
                byteArrayOutputStream.write((byte) bArr.length);
            } else {
                int length = bArr.length;
                double ceil = Math.ceil((Math.log(length + 1) / Math.log(2.0d)) / 8.0d);
                if (ceil <= 4.0d) {
                    int i = (int) ceil;
                    byteArrayOutputStream.write((byte) (i | 128));
                    byte[] bArr2 = new byte[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        bArr2[(i - i2) - 1] = (byte) ((length >> (i2 * 8)) & 255);
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    throw new Exception("Data is too large to encode.");
                }
            }
        } else if ("f0".equals(str)) {
            byteArrayOutputStream.write((byte) 0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, byte[]] */
    public static Map<String, Object> tlvDataToDataDictionary(byte[] bArr) {
        String format;
        int i;
        int i2;
        int i3;
        Map<String, Object> map;
        HashMap hashMap = new HashMap();
        int i4 = 0;
        while (i4 < bArr.length) {
            byte b = bArr[i4];
            if ((b & PrinterCommands.CEIL) == 31) {
                format = String.format("%02x%02x", Byte.valueOf(b), Byte.valueOf(bArr[i4 + 1]));
                i = i4 + 2;
            } else {
                format = String.format("%02x", Byte.valueOf(b));
                i = i4 + 1;
            }
            if (bArr.length == 1 && i == 1) {
                Log.d("BARRETT", "breakpoint");
            }
            Map<String, Object> map2 = null;
            if ((bArr[i] & Byte.MIN_VALUE) == 0) {
                i3 = i + 1;
                i2 = bArr[i];
            } else if ((bArr[i] & Byte.MAX_VALUE) == 0) {
                return null;
            } else {
                int i5 = i + 1;
                int i6 = bArr[i] & 127;
                int i7 = i5;
                int i8 = 0;
                int i9 = 0;
                while (i9 < i6) {
                    i8 = (i8 << 8) | bArr[i7];
                    i9++;
                    i7++;
                }
                i2 = i8;
                i3 = i7;
            }
            if (i2 > 0) {
                ?? r7 = new byte[i2];
                System.arraycopy(bArr, i3, r7, 0, i2);
                map = r7;
            } else {
                map = null;
            }
            int i10 = i3 + i2;
            if ((b & 32) == 32) {
                map2 = tlvDataToDataDictionary(new byte[i2]);
            } else if (map != null) {
                map2 = map;
            }
            Object obj = hashMap.get(format);
            if (obj != null) {
                if (obj instanceof List) {
                    ((List) obj).add((byte[]) map2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((byte[]) obj);
                    arrayList.add((byte[]) map2);
                    hashMap.put(format, arrayList);
                }
            } else {
                hashMap.put(format, map2);
            }
            i4 = i10;
        }
        return hashMap;
    }
}
