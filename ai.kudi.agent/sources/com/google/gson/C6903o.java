package com.google.gson;

import com.google.gson.internal.C6795a;
import com.google.gson.internal.C6875f;
import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* renamed from: com.google.gson.o */
/* loaded from: classes2.dex */
public final class C6903o extends AbstractC6900l {

    /* renamed from: a */
    private final Object f16553a;

    public C6903o(Boolean bool) {
        C6795a.m20716b(bool);
        this.f16553a = bool;
    }

    /* renamed from: P */
    private static boolean m20536P(C6903o c6903o) {
        Object obj = c6903o.f16553a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    /* renamed from: E */
    public int m20541E() {
        return m20535V() ? m20539I().intValue() : Integer.parseInt(m20538J());
    }

    /* renamed from: F */
    public long m20540F() {
        return m20535V() ? m20539I().longValue() : Long.parseLong(m20538J());
    }

    /* renamed from: I */
    public Number m20539I() {
        Object obj = this.f16553a;
        return obj instanceof String ? new C6875f((String) this.f16553a) : (Number) obj;
    }

    /* renamed from: J */
    public String m20538J() {
        if (m20535V()) {
            return m20539I().toString();
        }
        if (m20537O()) {
            return ((Boolean) this.f16553a).toString();
        }
        return (String) this.f16553a;
    }

    /* renamed from: O */
    public boolean m20537O() {
        return this.f16553a instanceof Boolean;
    }

    /* renamed from: V */
    public boolean m20535V() {
        return this.f16553a instanceof Number;
    }

    /* renamed from: X */
    public boolean m20534X() {
        return this.f16553a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6903o.class != obj.getClass()) {
            return false;
        }
        C6903o c6903o = (C6903o) obj;
        if (this.f16553a == null) {
            return c6903o.f16553a == null;
        } else if (m20536P(this) && m20536P(c6903o)) {
            return m20539I().longValue() == c6903o.m20539I().longValue();
        } else if ((this.f16553a instanceof Number) && (c6903o.f16553a instanceof Number)) {
            double doubleValue = m20539I().doubleValue();
            double doubleValue2 = c6903o.m20539I().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return this.f16553a.equals(c6903o.f16553a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f16553a == null) {
            return 31;
        }
        if (m20536P(this)) {
            doubleToLongBits = m20539I().longValue();
        } else {
            Object obj = this.f16553a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m20539I().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: s */
    public boolean m20533s() {
        if (m20537O()) {
            return ((Boolean) this.f16553a).booleanValue();
        }
        return Boolean.parseBoolean(m20538J());
    }

    /* renamed from: u */
    public double m20532u() {
        return m20535V() ? m20539I().doubleValue() : Double.parseDouble(m20538J());
    }

    public C6903o(Number number) {
        C6795a.m20716b(number);
        this.f16553a = number;
    }

    public C6903o(String str) {
        C6795a.m20716b(str);
        this.f16553a = str;
    }
}
