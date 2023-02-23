package com.paypad.emv;
/* loaded from: classes2.dex */
public enum EmvTransactionType {
    EmvGoods("00");
    
    private final String text;

    EmvTransactionType(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
