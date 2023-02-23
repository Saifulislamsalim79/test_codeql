package com.paypad.emv;
/* loaded from: classes2.dex */
public enum AccountType {
    Default("00"),
    Savings("10"),
    Check("20"),
    Credit("30"),
    Universal("40"),
    Investment("50"),
    ElectronicPurse("60"),
    Mortgage("91"),
    Installment("92");
    
    private final String text;

    AccountType(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
