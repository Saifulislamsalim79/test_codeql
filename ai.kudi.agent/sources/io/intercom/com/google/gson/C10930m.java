package io.intercom.com.google.gson;

import io.intercom.com.google.gson.p418t.C10943a;
import io.intercom.com.google.gson.p418t.C10967g;
import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* renamed from: io.intercom.com.google.gson.m */
/* loaded from: classes3.dex */
public final class C10930m extends AbstractC10927j {

    /* renamed from: b */
    private static final Class<?>[] f24894b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f24895a;

    public C10930m(Boolean bool) {
        m11912d0(bool);
    }

    /* renamed from: V */
    private static boolean m11916V(C10930m c10930m) {
        Object obj = c10930m.f24895a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    /* renamed from: Z */
    private static boolean m11914Z(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f24894b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public double m11922E() {
        return m11915X() ? m11919J().doubleValue() : Double.parseDouble(m11918O());
    }

    /* renamed from: F */
    public int m11921F() {
        return m11915X() ? m11919J().intValue() : Integer.parseInt(m11918O());
    }

    /* renamed from: I */
    public long m11920I() {
        return m11915X() ? m11919J().longValue() : Long.parseLong(m11918O());
    }

    /* renamed from: J */
    public Number m11919J() {
        Object obj = this.f24895a;
        return obj instanceof String ? new C10967g((String) this.f24895a) : (Number) obj;
    }

    /* renamed from: O */
    public String m11918O() {
        if (m11915X()) {
            return m11919J().toString();
        }
        if (m11917P()) {
            return m11910u().toString();
        }
        return (String) this.f24895a;
    }

    /* renamed from: P */
    public boolean m11917P() {
        return this.f24895a instanceof Boolean;
    }

    /* renamed from: X */
    public boolean m11915X() {
        return this.f24895a instanceof Number;
    }

    /* renamed from: b0 */
    public boolean m11913b0() {
        return this.f24895a instanceof String;
    }

    /* renamed from: d0 */
    void m11912d0(Object obj) {
        if (obj instanceof Character) {
            this.f24895a = String.valueOf(((Character) obj).charValue());
            return;
        }
        C10943a.m11869a((obj instanceof Number) || m11914Z(obj));
        this.f24895a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10930m.class != obj.getClass()) {
            return false;
        }
        C10930m c10930m = (C10930m) obj;
        if (this.f24895a == null) {
            return c10930m.f24895a == null;
        } else if (m11916V(this) && m11916V(c10930m)) {
            return m11919J().longValue() == c10930m.m11919J().longValue();
        } else if ((this.f24895a instanceof Number) && (c10930m.f24895a instanceof Number)) {
            double doubleValue = m11919J().doubleValue();
            double doubleValue2 = c10930m.m11919J().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return this.f24895a.equals(c10930m.f24895a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f24895a == null) {
            return 31;
        }
        if (m11916V(this)) {
            doubleToLongBits = m11919J().longValue();
        } else {
            Object obj = this.f24895a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m11919J().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: s */
    public boolean m11911s() {
        if (m11917P()) {
            return m11910u().booleanValue();
        }
        return Boolean.parseBoolean(m11918O());
    }

    /* renamed from: u */
    Boolean m11910u() {
        return (Boolean) this.f24895a;
    }

    public C10930m(Number number) {
        m11912d0(number);
    }

    public C10930m(String str) {
        m11912d0(str);
    }
}
