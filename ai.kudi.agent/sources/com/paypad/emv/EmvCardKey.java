package com.paypad.emv;
/* loaded from: classes2.dex */
public class EmvCardKey {
    private int arithInd;
    private String checkSum;
    private String expDate;
    private String exponent;
    private int hashInd;
    private int keyId;
    private String modulus;

    public int getArithInd() {
        return this.arithInd;
    }

    public String getCheckSum() {
        return this.checkSum;
    }

    public String getExpDate() {
        return this.expDate;
    }

    public String getExponent() {
        return this.exponent;
    }

    public int getHashInd() {
        return this.hashInd;
    }

    public int getKeyId() {
        return this.keyId;
    }

    public String getModulus() {
        return this.modulus;
    }

    public void setArithInd(int i) {
        this.arithInd = i;
    }

    public void setCheckSum(String str) {
        this.checkSum = str;
    }

    public void setExpDate(String str) {
        this.expDate = str;
    }

    public void setExponent(String str) {
        this.exponent = str;
    }

    public void setHashInd(int i) {
        this.hashInd = i;
    }

    public void setKeyId(int i) {
        this.keyId = i;
    }

    public void setModulus(String str) {
        this.modulus = str;
    }
}
