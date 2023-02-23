package com.paypad.models.messaging.nibss;

import com.paypad.utils.CryptoUtil;
import com.paypad.utils.HexUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
/* loaded from: classes2.dex */
public class GetMasterKeyResponse {
    private byte[] clearMasterKey;
    private String encryptedMasterKey;
    private String field39;

    public void _decryptMasterKey(byte[] bArr) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
        cipher.init(2, SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr)));
        this.clearMasterKey = cipher.doFinal(this.encryptedMasterKey.getBytes());
    }

    public void decryptMasterKey(byte[] bArr) {
        this.clearMasterKey = CryptoUtil.decrypt3DESECB(bArr, HexUtil.hexStringToByteArray(this.encryptedMasterKey));
    }

    public byte[] getClearMasterKey() {
        return this.clearMasterKey;
    }

    public String getEncryptedMasterKey() {
        return this.encryptedMasterKey;
    }

    public String getField39() {
        return this.field39;
    }

    public void setEncryptedMasterKey(String str) {
        this.encryptedMasterKey = str;
    }

    public void setField39(String str) {
        this.field39 = str;
    }
}
