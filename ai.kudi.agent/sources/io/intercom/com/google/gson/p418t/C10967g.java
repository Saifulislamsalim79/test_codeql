package io.intercom.com.google.gson.p418t;

import java.math.BigDecimal;
/* compiled from: LazilyParsedNumber.java */
/* renamed from: io.intercom.com.google.gson.t.g */
/* loaded from: classes3.dex */
public final class C10967g extends Number {

    /* renamed from: c */
    private final String f24971c;

    public C10967g(String str) {
        this.f24971c = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f24971c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10967g) {
            String str = this.f24971c;
            String str2 = ((C10967g) obj).f24971c;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f24971c);
    }

    public int hashCode() {
        return this.f24971c.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f24971c);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f24971c);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f24971c).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f24971c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f24971c).longValue();
        }
    }

    public String toString() {
        return this.f24971c;
    }
}
