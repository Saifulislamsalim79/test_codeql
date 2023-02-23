package com.paypad.models.messaging.nibss;

import com.paypad.utils.CryptoUtil;
import com.paypad.utils.HexUtil;
/* loaded from: classes2.dex */
public class GetPinKeyResponse {
    private byte[] clearPinKey;
    private String encryptedPinKey;

    public void descryptPinKey(byte[] bArr) {
        this.clearPinKey = CryptoUtil.decrypt3DESECB(bArr, HexUtil.hexStringToByteArray(this.encryptedPinKey.replace(" ", "")));
    }

    public byte[] getClearPinKey() {
        return this.clearPinKey;
    }

    public String getEncryptedPinKey() {
        return this.encryptedPinKey;
    }

    public void setEncryptedPinKey(String str) {
        this.encryptedPinKey = str;
    }
}
