package com.google.gson.internal;

import java.math.BigDecimal;
/* compiled from: LazilyParsedNumber.java */
/* renamed from: com.google.gson.internal.f */
/* loaded from: classes2.dex */
public final class C6875f extends Number {

    /* renamed from: c */
    private final String f16516c;

    public C6875f(String str) {
        this.f16516c = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f16516c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6875f) {
            String str = this.f16516c;
            String str2 = ((C6875f) obj).f16516c;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f16516c);
    }

    public int hashCode() {
        return this.f16516c.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f16516c);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f16516c);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f16516c).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f16516c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16516c).longValue();
        }
    }

    public String toString() {
        return this.f16516c;
    }
}
