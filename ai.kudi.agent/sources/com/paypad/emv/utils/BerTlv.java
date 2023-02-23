package com.paypad.emv.utils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class BerTlv {
    private final Tag mTag;
    private final byte[] mValue;

    public BerTlv(Tag tag, byte[] bArr) {
        if (tag == null) {
            throw new IllegalArgumentException("The argument 'tag' can not be null");
        }
        if (bArr != null) {
            this.mTag = tag;
            this.mValue = bArr;
            return;
        }
        throw new IllegalArgumentException("The argument 'value' can not be null");
    }

    public static BerTlv create(Tag tag, byte[] bArr) {
        return new BerTlv(tag, bArr);
    }

    public static List<BerTlv> createList(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            arrayList.add(create(byteBuffer));
        }
        return arrayList;
    }

    public static Map<Tag, byte[]> createMap(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.hasRemaining()) {
            BerTlv create = create(byteBuffer);
            hashMap.put(create.getTag(), create.getValue());
        }
        return hashMap;
    }

    public static int decodeLength(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        if ((i & 128) != 0) {
            int i2 = 0;
            for (int i3 = i & 127; i3 > 0; i3--) {
                i2 = (i2 << 8) + (byteBuffer.get() & 255);
            }
            return i2;
        }
        return i;
    }

    public static byte[] encodeLength(int i) {
        byte[] bArr;
        if (i == 0) {
            return new byte[]{0};
        }
        if (i <= 127) {
            bArr = new byte[]{(byte) i};
        } else {
            int i2 = 0;
            do {
                i2++;
            } while (((8388607 << (i2 * 8)) & i) > 0);
            bArr = new byte[i2 + 1];
            bArr[0] = (byte) (i2 + 128);
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i2 - i3] = (byte) ((i >> (i3 * 8)) & 255);
            }
        }
        return bArr;
    }

    public static BerTlv find(ByteBuffer byteBuffer, Tag tag) {
        while (byteBuffer.hasRemaining()) {
            BerTlv create = create(byteBuffer);
            if (create.getTag().equals(tag)) {
                return create;
            }
        }
        return null;
    }

    public static byte[] listToByteArray(List<BerTlv> list) {
        ArrayList<byte[]> arrayList = new ArrayList();
        int i = 0;
        for (BerTlv berTlv : list) {
            byte[] byteArray = berTlv.toByteArray();
            arrayList.add(byteArray);
            i += byteArray.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] mapToByteArray(Map<Tag, byte[]> map) {
        ArrayList<byte[]> arrayList = new ArrayList();
        int i = 0;
        for (Tag tag : map.keySet()) {
            byte[] bytes = tag.getBytes();
            byte[] bArr = map.get(tag);
            byte[] encodeLength = encodeLength(bArr.length);
            arrayList.add(bytes);
            arrayList.add(encodeLength);
            arrayList.add(bArr);
            i += bytes.length + encodeLength.length + bArr.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : arrayList) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        BerTlv berTlv = (BerTlv) obj;
        if (!this.mTag.equals(berTlv.getTag()) || this.mValue.length != berTlv.mValue.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.mValue;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != berTlv.mValue[i]) {
                return false;
            }
            i++;
        }
    }

    public byte[] getLengthBytes() {
        return encodeLength(this.mValue.length);
    }

    public Tag getTag() {
        return this.mTag;
    }

    public byte[] getValue() {
        return this.mValue;
    }

    public String getValueAsHexString() {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[this.mValue.length * 2];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.mValue;
            if (i < bArr.length) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(bArr[i] >> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[bArr[i] & 15];
                i++;
            } else {
                return new String(cArr2);
            }
        }
    }

    public int getValueAsInteger() {
        int i = 0;
        for (byte b : this.mValue) {
            i = (i << 8) + (b & 255);
        }
        return i;
    }

    public int hashCode() {
        int hashCode = BerTlv.class.getName().hashCode() + 1;
        for (byte b : this.mTag.getBytes()) {
            hashCode = (hashCode * 31) + b;
        }
        for (byte b2 : this.mValue) {
            hashCode = (hashCode * 31) + b2;
        }
        return hashCode;
    }

    public byte[] toByteArray() {
        byte[] bytes = this.mTag.getBytes();
        byte[] lengthBytes = getLengthBytes();
        byte[] bArr = this.mValue;
        byte[] bArr2 = new byte[bytes.length + lengthBytes.length + bArr.length];
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        System.arraycopy(lengthBytes, 0, bArr2, bytes.length, lengthBytes.length);
        System.arraycopy(bArr, 0, bArr2, bytes.length + lengthBytes.length, bArr.length);
        return bArr2;
    }

    public String toString() {
        return "BerTlv [Tag=" + this.mTag.toHexValue() + ", Length=" + this.mValue.length + ", Value=" + getValueAsHexString() + "]";
    }

    public static BerTlv create(Tag tag, List<BerTlv> list) {
        int size = list.size();
        byte[][] bArr = new byte[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = list.get(i2).toByteArray();
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            System.arraycopy(bArr[i4], 0, bArr2, i3, bArr[i4].length);
            i3 += bArr[i4].length;
        }
        return new BerTlv(tag, bArr2);
    }

    public static BerTlv find(ByteBuffer byteBuffer, int i) {
        return find(byteBuffer, new Tag(i));
    }

    public static List<BerTlv> createList(byte[] bArr) {
        return createList(ByteBuffer.wrap(bArr));
    }

    public static Map<Tag, byte[]> createMap(byte[] bArr) {
        return createMap(ByteBuffer.wrap(bArr));
    }

    public static BerTlv find(byte[] bArr, Tag tag) {
        return find(ByteBuffer.wrap(bArr), tag);
    }

    public BerTlv(int i, byte[] bArr) {
        this(new Tag(i), bArr);
    }

    public static BerTlv find(byte[] bArr, int i) {
        return find(ByteBuffer.wrap(bArr), i);
    }

    public static BerTlv create(ByteBuffer byteBuffer) {
        Tag create = Tag.create(byteBuffer);
        byte[] bArr = new byte[decodeLength(byteBuffer)];
        byteBuffer.get(bArr);
        return new BerTlv(create, bArr);
    }

    public static BerTlv create(byte[] bArr, int i, int i2) {
        return create(ByteBuffer.wrap(bArr, i, i2));
    }

    public static BerTlv create(byte[] bArr) {
        return create(ByteBuffer.wrap(bArr, 0, bArr.length));
    }
}
