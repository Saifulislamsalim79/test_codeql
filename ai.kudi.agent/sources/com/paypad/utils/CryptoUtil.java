package com.paypad.utils;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.RSAPrivateKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public class CryptoUtil {
    public static byte[] calculateDataKey(byte[] bArr, byte[] bArr2) {
        byte[] calculateDerivedKey = calculateDerivedKey(bArr, bArr2);
        calculateDerivedKey[5] = (byte) (calculateDerivedKey[5] ^ 255);
        calculateDerivedKey[13] = (byte) (calculateDerivedKey[13] ^ 255);
        encrypt3DESECB(calculateDerivedKey, 0, calculateDerivedKey, 0, calculateDerivedKey.length, calculateDerivedKey, 0);
        return calculateDerivedKey;
    }

    public static byte[] calculateDerivedKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5 = new byte[8];
        byte[] bArr6 = new byte[8];
        byte[] bArr7 = new byte[8];
        byte[] bArr8 = new byte[16];
        memcpy(bArr8, 0, bArr2, 0, 16);
        char c = 6;
        memcpy(bArr5, 0, bArr, 2, 6);
        bArr5[5] = (byte) (bArr5[5] & (-32));
        int i = (bArr[bArr.length - 1] & 255) | ((bArr[bArr.length - 2] & 255) << 8) | ((bArr[bArr.length - 3] & PrinterCommands.CEIL) << 16);
        byte[] bArr9 = {-64, -64, -64, -64, 0, 0, 0, 0, -64, -64, -64, -64, 0, 0, 0, 0};
        int i2 = 1048576;
        while (i2 != 0) {
            if ((i2 & i) != 0) {
                bArr5[5] = (byte) (bArr5[5] | (i2 >> 16));
                bArr5[c] = (byte) (bArr5[c] | (i2 >> 8));
                bArr5[7] = (byte) (bArr5[7] | i2);
                memxor(bArr6, 0, bArr8, 8, bArr5, 0, 8);
                encryptDES(bArr6, 0, bArr6, 0, 8, bArr8, 0);
                memxor(bArr6, 0, bArr6, 0, bArr8, 8, 8);
                bArr3 = bArr9;
                byte[] bArr10 = bArr8;
                memxor(bArr8, 0, bArr8, 0, bArr3, 0, 16);
                bArr4 = bArr10;
                memxor(bArr7, 0, bArr10, 8, bArr5, 0, 8);
                encryptDES(bArr7, 0, bArr7, 0, 8, bArr4, 0);
                memxor(bArr7, 0, bArr7, 0, bArr4, 8, 8);
                memcpy(bArr4, 8, bArr6, 0, 8);
                memcpy(bArr4, 0, bArr7, 0, 8);
            } else {
                bArr3 = bArr9;
                bArr4 = bArr8;
            }
            i2 >>= 1;
            bArr8 = bArr4;
            bArr9 = bArr3;
            c = 6;
        }
        byte[] bArr11 = bArr8;
        memset(bArr5, 0, 0, 8);
        memset(bArr6, 0, 0, 8);
        memset(bArr7, 0, 0, 8);
        return bArr11;
    }

    public static byte[] calculateSHA256(byte[] bArr, int i, int i2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, i, i2);
            return messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int crcccit16(int i, int i2) {
        int i3 = (((i << 8) & 65535) | ((i >> 8) & 255)) ^ (i2 & 255);
        int i4 = i3 ^ ((i3 & 255) >> 4);
        int i5 = i4 ^ (((i4 << 8) << 4) & 65535);
        return (i5 ^ (((i5 & 255) << 4) << 1)) & 65535;
    }

    public static int crcccitt16(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = crcccit16(i, bArr[i2 + i4] & 255);
        }
        return i;
    }

    public static byte[] decrypt3DESCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/CBC/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] decrypt3DESECB(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] decryptAESCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] decryptRSABlock(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            BigInteger bigInteger = new BigInteger(1, bArr);
            BigInteger bigInteger2 = new BigInteger(1, bArr2);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(2, keyFactory.generatePrivate(new RSAPrivateKeySpec(bigInteger, bigInteger2)));
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] encrypt3DESCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/CBC/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] encrypt3DESECB(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final void encryptDES(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, i4, 8, "DES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            cipher.doFinal(bArr2, i2, i3, bArr, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void memcpy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr2, i2, bArr, i, i3);
    }

    private static void memset(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i + i4] = (byte) i2;
        }
    }

    private static void memxor(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i + i5] = (byte) ((bArr2[i2 + i5] & 255) ^ (bArr3[i3 + i5] & 255));
        }
    }

    public static int crcccitt16(int i, byte[] bArr) {
        return crcccitt16(i, bArr, 0, bArr.length);
    }

    public static byte[] calculateSHA256(ByteBuffer byteBuffer) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(byteBuffer);
            return messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final void encrypt3DESECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr3, i4, bArr4, 0, 16);
        System.arraycopy(bArr3, i4, bArr4, 16, 8);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            cipher.doFinal(bArr2, i2, i3, bArr, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] decryptAESCBC(byte[] bArr, byte[] bArr2) {
        return decryptAESCBC(bArr, new byte[16], bArr2);
    }
}
