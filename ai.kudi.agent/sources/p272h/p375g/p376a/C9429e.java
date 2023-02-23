package p272h.p375g.p376a;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;
import p272h.p375g.p376a.p379i.C9449a;
import p272h.p375g.p376a.p379i.C9450b;
/* compiled from: IsoValue.java */
/* renamed from: h.g.a.e */
/* loaded from: classes2.dex */
public class C9429e<T> implements Cloneable {

    /* renamed from: c */
    private EnumC9428d f22083c;

    /* renamed from: d */
    private T f22084d;

    /* renamed from: e */
    private InterfaceC9426b<T> f22085e;

    /* renamed from: f */
    private int f22086f;

    /* renamed from: w */
    private String f22087w;

    /* renamed from: x */
    private TimeZone f22088x;

    public C9429e(EnumC9428d enumC9428d, T t) {
        this(enumC9428d, t, (InterfaceC9426b) null);
    }

    /* renamed from: a */
    public C9429e<T> clone() {
        try {
            return (C9429e) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String m14762b() {
        return this.f22087w;
    }

    /* renamed from: c */
    public int m14761c() {
        return this.f22086f;
    }

    /* renamed from: d */
    public EnumC9428d m14760d() {
        return this.f22083c;
    }

    /* renamed from: e */
    public T m14759e() {
        return this.f22084d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9429e)) {
            return false;
        }
        C9429e c9429e = (C9429e) obj;
        return c9429e.m14760d() == m14760d() && c9429e.m14759e().equals(m14759e()) && c9429e.m14761c() == m14761c();
    }

    /* renamed from: f */
    public void m14758f(String str) {
        this.f22087w = str;
    }

    /* renamed from: g */
    public void m14757g(OutputStream outputStream, boolean z, boolean z2) throws IOException {
        EnumC9428d enumC9428d;
        int i;
        int length;
        int i2;
        EnumC9428d enumC9428d2 = this.f22083c;
        if (enumC9428d2 != EnumC9428d.LLLVAR && enumC9428d2 != EnumC9428d.LLVAR) {
            if (enumC9428d2 == EnumC9428d.LLBIN || enumC9428d2 == EnumC9428d.LLLBIN) {
                int i3 = this.f22086f;
                if (!z) {
                    i3 *= 2;
                }
                m14756h(i3, outputStream, this.f22083c == EnumC9428d.LLLBIN ? 3 : 2, z, z2);
            } else if (z) {
                byte[] bArr = null;
                if (enumC9428d2 == EnumC9428d.NUMERIC) {
                    int i4 = this.f22086f;
                    bArr = new byte[(i4 / 2) + (i4 % 2)];
                } else if (enumC9428d2 == EnumC9428d.AMOUNT) {
                    bArr = new byte[6];
                } else if (enumC9428d2 == EnumC9428d.DATE10 || enumC9428d2 == EnumC9428d.DATE4 || enumC9428d2 == EnumC9428d.DATE_EXP || enumC9428d2 == EnumC9428d.TIME) {
                    bArr = new byte[this.f22086f / 2];
                }
                if (bArr != null) {
                    C9449a.m14706c(toString(), bArr);
                    outputStream.write(bArr);
                    return;
                }
            }
        } else {
            m14756h(this.f22086f, outputStream, this.f22083c == EnumC9428d.LLLVAR ? 3 : 2, z, z2);
        }
        if (z && ((enumC9428d = this.f22083c) == EnumC9428d.BINARY || enumC9428d == EnumC9428d.LLBIN || enumC9428d == EnumC9428d.LLLBIN)) {
            T t = this.f22084d;
            if (t instanceof byte[]) {
                outputStream.write((byte[]) t);
                i2 = this.f22086f - ((byte[]) this.f22084d).length;
            } else {
                InterfaceC9426b<T> interfaceC9426b = this.f22085e;
                if (interfaceC9426b instanceof InterfaceC9425a) {
                    byte[] mo14735c = ((InterfaceC9425a) interfaceC9426b).mo14735c(t);
                    outputStream.write(mo14735c);
                    i = this.f22086f;
                    length = mo14735c.length;
                } else {
                    byte[] m14705a = C9450b.m14705a(t.toString());
                    outputStream.write(m14705a);
                    i = this.f22086f;
                    length = m14705a.length;
                }
                i2 = i - length;
            }
            if (this.f22083c != EnumC9428d.BINARY || i2 <= 0) {
                return;
            }
            for (int i5 = 0; i5 < i2; i5++) {
                outputStream.write(0);
            }
            return;
        }
        outputStream.write(this.f22087w == null ? toString().getBytes() : toString().getBytes(this.f22087w));
    }

    /* renamed from: h */
    protected void m14756h(int i, OutputStream outputStream, int i2, boolean z, boolean z2) throws IOException {
        if (z) {
            if (i2 == 3) {
                outputStream.write(i / 100);
            }
            outputStream.write((i % 10) | (((i % 100) / 10) << 4));
        } else if (z2) {
            String num = Integer.toString(i);
            int length = i2 - num.length();
            if (length == 1) {
                num = '0' + num;
            } else if (length == 2) {
                num = "00" + num;
            }
            String str = this.f22087w;
            outputStream.write(str == null ? num.getBytes() : num.getBytes(str));
        } else {
            if (i2 == 3) {
                outputStream.write((i / 100) + 48);
            }
            if (i >= 10) {
                outputStream.write(((i % 100) / 10) + 48);
            } else {
                outputStream.write(48);
            }
            outputStream.write((i % 10) + 48);
        }
    }

    public int hashCode() {
        if (this.f22084d == null) {
            return 0;
        }
        return toString().hashCode();
    }

    public String toString() {
        T t = this.f22084d;
        if (t == null) {
            return "ISOValue<null>";
        }
        EnumC9428d enumC9428d = this.f22083c;
        if (enumC9428d != EnumC9428d.NUMERIC && enumC9428d != EnumC9428d.AMOUNT) {
            if (enumC9428d == EnumC9428d.ALPHA) {
                InterfaceC9426b<T> interfaceC9426b = this.f22085e;
                return enumC9428d.m14768b(interfaceC9426b == null ? t.toString() : interfaceC9426b.mo14734d(t), this.f22086f);
            } else if (enumC9428d != EnumC9428d.LLVAR && enumC9428d != EnumC9428d.LLLVAR) {
                if (t instanceof Date) {
                    return enumC9428d.m14766g((Date) t, this.f22088x);
                }
                if (enumC9428d == EnumC9428d.BINARY) {
                    if (t instanceof byte[]) {
                        byte[] bArr = (byte[]) t;
                        InterfaceC9426b<T> interfaceC9426b2 = this.f22085e;
                        return enumC9428d.m14768b(interfaceC9426b2 == null ? C9450b.m14704b(bArr, 0, bArr.length) : interfaceC9426b2.mo14734d(t), this.f22086f * 2);
                    }
                    InterfaceC9426b<T> interfaceC9426b3 = this.f22085e;
                    return enumC9428d.m14768b(interfaceC9426b3 == null ? t.toString() : interfaceC9426b3.mo14734d(t), this.f22086f * 2);
                } else if (enumC9428d != EnumC9428d.LLBIN && enumC9428d != EnumC9428d.LLLBIN) {
                    InterfaceC9426b<T> interfaceC9426b4 = this.f22085e;
                    return interfaceC9426b4 == null ? t.toString() : interfaceC9426b4.mo14734d(t);
                } else {
                    T t2 = this.f22084d;
                    if (t2 instanceof byte[]) {
                        byte[] bArr2 = (byte[]) t2;
                        InterfaceC9426b<T> interfaceC9426b5 = this.f22085e;
                        return interfaceC9426b5 == null ? C9450b.m14704b(bArr2, 0, bArr2.length) : interfaceC9426b5.mo14734d(t2);
                    }
                    InterfaceC9426b<T> interfaceC9426b6 = this.f22085e;
                    String obj = interfaceC9426b6 == null ? t2.toString() : interfaceC9426b6.mo14734d(t2);
                    return obj.length() % 2 == 1 ? String.format("0%s", obj) : obj;
                }
            } else {
                InterfaceC9426b<T> interfaceC9426b7 = this.f22085e;
                return interfaceC9426b7 == null ? this.f22084d.toString() : interfaceC9426b7.mo14734d(this.f22084d);
            }
        }
        EnumC9428d enumC9428d2 = this.f22083c;
        if (enumC9428d2 == EnumC9428d.AMOUNT) {
            T t3 = this.f22084d;
            if (t3 instanceof BigDecimal) {
                return enumC9428d2.m14767e((BigDecimal) t3, 12);
            }
            return enumC9428d2.m14768b(t3.toString(), 12);
        }
        T t4 = this.f22084d;
        if (t4 instanceof Number) {
            return enumC9428d2.m14769a(((Number) t4).longValue(), this.f22086f);
        }
        InterfaceC9426b<T> interfaceC9426b8 = this.f22085e;
        return enumC9428d2.m14768b(interfaceC9426b8 == null ? t4.toString() : interfaceC9426b8.mo14734d(t4), this.f22086f);
    }

    public C9429e(EnumC9428d enumC9428d, T t, InterfaceC9426b<T> interfaceC9426b) {
        if (!enumC9428d.m14764i()) {
            this.f22085e = interfaceC9426b;
            this.f22083c = enumC9428d;
            this.f22084d = t;
            if (enumC9428d != EnumC9428d.LLVAR && enumC9428d != EnumC9428d.LLLVAR) {
                if (enumC9428d != EnumC9428d.LLBIN && enumC9428d != EnumC9428d.LLLBIN) {
                    this.f22086f = enumC9428d.m14765h();
                    return;
                }
                if (interfaceC9426b == null) {
                    if (t instanceof byte[]) {
                        this.f22086f = ((byte[]) t).length;
                    } else {
                        this.f22086f = (t.toString().length() / 2) + (t.toString().length() % 2);
                    }
                } else if (interfaceC9426b instanceof InterfaceC9425a) {
                    this.f22086f = ((InterfaceC9425a) interfaceC9426b).mo14735c(t).length;
                } else {
                    String mo14734d = interfaceC9426b.mo14734d(t);
                    if (mo14734d == null) {
                        mo14734d = t != null ? t.toString() : "";
                    }
                    this.f22086f = mo14734d.length();
                }
                if (enumC9428d == EnumC9428d.LLBIN && this.f22086f > 99) {
                    throw new IllegalArgumentException("LLBIN can only hold values up to 99 chars");
                }
                if (enumC9428d == EnumC9428d.LLLBIN && this.f22086f > 999) {
                    throw new IllegalArgumentException("LLLBIN can only hold values up to 999 chars");
                }
                return;
            }
            if (interfaceC9426b == null) {
                this.f22086f = t.toString().length();
            } else {
                String mo14734d2 = interfaceC9426b.mo14734d(t);
                if (mo14734d2 == null) {
                    mo14734d2 = t != null ? t.toString() : "";
                }
                this.f22086f = mo14734d2.length();
            }
            if (enumC9428d == EnumC9428d.LLVAR && this.f22086f > 99) {
                throw new IllegalArgumentException("LLVAR can only hold values up to 99 chars");
            }
            if (enumC9428d == EnumC9428d.LLLVAR && this.f22086f > 999) {
                throw new IllegalArgumentException("LLLVAR can only hold values up to 999 chars");
            }
            return;
        }
        throw new IllegalArgumentException("Fixed-value types must use constructor that specifies length");
    }

    public C9429e(EnumC9428d enumC9428d, T t, int i) {
        this(enumC9428d, t, i, null);
    }

    public C9429e(EnumC9428d enumC9428d, T t, int i, InterfaceC9426b<T> interfaceC9426b) {
        this.f22083c = enumC9428d;
        this.f22084d = t;
        this.f22086f = i;
        this.f22085e = interfaceC9426b;
        if (i == 0 && enumC9428d.m14764i()) {
            throw new IllegalArgumentException(String.format("Length must be greater than zero for type %s (value '%s')", enumC9428d, t));
        }
        if (enumC9428d != EnumC9428d.LLVAR && enumC9428d != EnumC9428d.LLLVAR) {
            if (enumC9428d == EnumC9428d.LLBIN || enumC9428d == EnumC9428d.LLLBIN) {
                if (i == 0) {
                    if (interfaceC9426b == null) {
                        this.f22086f = ((byte[]) t).length;
                    } else if (interfaceC9426b instanceof InterfaceC9425a) {
                        this.f22086f = ((InterfaceC9425a) interfaceC9426b).mo14735c(this.f22084d).length;
                    } else {
                        this.f22086f = interfaceC9426b.mo14734d(this.f22084d).length();
                    }
                    this.f22086f = interfaceC9426b == null ? ((byte[]) t).length : interfaceC9426b.mo14734d(this.f22084d).length();
                }
                if (enumC9428d == EnumC9428d.LLBIN && this.f22086f > 99) {
                    throw new IllegalArgumentException("LLBIN can only hold values up to 99 chars");
                }
                if (enumC9428d == EnumC9428d.LLLBIN && this.f22086f > 999) {
                    throw new IllegalArgumentException("LLLBIN can only hold values up to 999 chars");
                }
                return;
            }
            return;
        }
        if (i == 0) {
            this.f22086f = (interfaceC9426b == null ? t.toString() : interfaceC9426b.mo14734d(this.f22084d)).length();
        }
        if (enumC9428d == EnumC9428d.LLVAR && this.f22086f > 99) {
            throw new IllegalArgumentException("LLVAR can only hold values up to 99 chars");
        }
        if (enumC9428d == EnumC9428d.LLLVAR && this.f22086f > 999) {
            throw new IllegalArgumentException("LLLVAR can only hold values up to 999 chars");
        }
    }
}
