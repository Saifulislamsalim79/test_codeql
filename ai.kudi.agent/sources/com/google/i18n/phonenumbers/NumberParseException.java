package com.google.i18n.phonenumbers;
/* loaded from: classes2.dex */
public class NumberParseException extends Exception {

    /* renamed from: c */
    private EnumC6917a f16596c;

    /* renamed from: d */
    private String f16597d;

    /* renamed from: com.google.i18n.phonenumbers.NumberParseException$a */
    /* loaded from: classes2.dex */
    public enum EnumC6917a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error type: " + this.f16596c + ". " + this.f16597d;
    }
}
