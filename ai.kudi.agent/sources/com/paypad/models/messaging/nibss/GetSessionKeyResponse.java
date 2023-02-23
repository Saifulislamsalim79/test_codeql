package com.paypad.models.messaging.nibss;

import com.paypad.utils.CryptoUtil;
import com.paypad.utils.HexUtil;
/* loaded from: classes2.dex */
public class GetSessionKeyResponse {
    private byte[] clearSessionKey;
    private String encryptedSessionKey;

    public void decryptSessionKey(byte[] bArr) {
        this.clearSessionKey = CryptoUtil.decrypt3DESECB(bArr, HexUtil.hexStringToByteArray(this.encryptedSessionKey));
    }

    public byte[] getClearSessionKey() {
        return this.clearSessionKey;
    }

    public String getEncryptedSessionKey() {
        return this.encryptedSessionKey;
    }

    public void setEncryptedSessionKey(String str) {
        this.encryptedSessionKey = str;
    }
}
