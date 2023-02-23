package com.paypad.emv.utils;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class Tag {
    private static final int MASK_ANOTHER_BYTE = 128;
    private static final int MASK_CONSTRUCTED_DATA_OBJECT = 32;
    private static final int MASK_SUBSEQUENT_BYTES = 31;
    private final byte[] mBytes;

    public Tag(byte[] bArr) {
        validate(bArr);
        this.mBytes = bArr;
    }

    public static Tag create(ByteBuffer byteBuffer) {
        int i = 1;
        if ((byteBuffer.get() & PrinterCommands.CEIL) == 31) {
            int i2 = 1;
            do {
                i2++;
            } while ((byteBuffer.get() & MASK_ANOTHER_BYTE) == MASK_ANOTHER_BYTE);
            i = i2;
        }
        byte[] bArr = new byte[i];
        byteBuffer.position(byteBuffer.position() - i);
        byteBuffer.get(bArr, 0, i);
        return new Tag(bArr);
    }

    private static byte[] encodeTag(int i) {
        byte b = (byte) (i >> 24);
        byte b2 = (byte) (i >> 16);
        byte b3 = (byte) (i >> 8);
        byte b4 = (byte) i;
        if (b != 0) {
            return new byte[]{b, b2, b3, b4};
        }
        if (b2 != 0) {
            return new byte[]{b2, b3, b4};
        }
        if (b3 != 0) {
            return new byte[]{b3, b4};
        }
        if (b4 != 0) {
            return new byte[]{b4};
        }
        throw new IllegalArgumentException("The argument 'tag' can not be null");
    }

    private void validate(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if (bArr.length == 1) {
                if ((bArr[0] & PrinterCommands.CEIL) == 31) {
                    throw new IllegalArgumentException("If first 5 bits are set tag must not be only one byte long");
                }
                return;
            } else if ((bArr[bArr.length - 1] & Byte.MIN_VALUE) == 0) {
                if (bArr.length > 2) {
                    for (int i = 1; i < bArr.length - 1; i++) {
                        if ((bArr[i] & Byte.MIN_VALUE) != -128) {
                            throw new IllegalArgumentException("For multibyte tag bit 8 of the internal bytes must be 1");
                        }
                    }
                    return;
                }
                return;
            } else {
                throw new IllegalArgumentException("For multibyte tag bit 8 of the final byte must be 0");
            }
        }
        throw new IllegalArgumentException("Tag must be constructed with a non-empty byte array");
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (this.mBytes.length != tag.mBytes.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.mBytes;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != tag.mBytes[i]) {
                return false;
            }
            i++;
        }
    }

    public byte[] getBytes() {
        return this.mBytes;
    }

    public TagClass getTagClass() {
        byte b = (byte) ((this.mBytes[0] >>> 6) & 3);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        return TagClass.PRIVATE;
                    }
                    throw new RuntimeException("Tag has invalid class type: " + Integer.toHexString(b));
                }
                return TagClass.CONTEXT_SPECIFIC;
            }
            return TagClass.APPLICATION;
        }
        return TagClass.UNIVERSAL;
    }

    public TagType getTagType() {
        if (isConstructed()) {
            return TagType.CONSTRUCTED;
        }
        return TagType.PRIMITIVE;
    }

    public int hashCode() {
        int hashCode = Tag.class.getName().hashCode() + 1;
        for (byte b : this.mBytes) {
            hashCode = (hashCode * 31) + b;
        }
        return hashCode;
    }

    public boolean isConstructed() {
        return (this.mBytes[0] & 32) != 0;
    }

    public boolean isPrimitive() {
        return !isConstructed();
    }

    public String toHexValue() {
        return Integer.toHexString(toIntValue()).toUpperCase();
    }

    public int toIntValue() {
        int i = 0;
        for (byte b : this.mBytes) {
            i = (i << 8) + (b & 255);
        }
        return i;
    }

    public String toString() {
        return "Tag [" + toHexValue() + ", Type=" + getTagType() + ", Class=" + getTagClass() + "]";
    }

    public Tag(int i) {
        this(encodeTag(i));
    }
}
