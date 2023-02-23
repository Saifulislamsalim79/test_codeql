package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9425a;
import p272h.p375g.p376a.InterfaceC9426b;
import p272h.p375g.p376a.p379i.C9450b;
/* compiled from: LlbinParseInfo.java */
/* renamed from: h.g.a.h.k */
/* loaded from: classes2.dex */
public class C9443k extends AbstractC9442j {
    public C9443k() {
        super(EnumC9428d.LLBIN, 0);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            int i3 = i2 + 2;
            if (i3 <= bArr.length) {
                int m14717a = m14717a(bArr, i2, 2);
                this.f22107b = m14717a;
                if (m14717a >= 0) {
                    if (m14717a + i2 + 2 <= bArr.length) {
                        byte[] m14705a = m14717a == 0 ? new byte[0] : C9450b.m14705a(new String(bArr, i3, this.f22107b));
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, m14705a, m14705a.length, null);
                        }
                        if (interfaceC9426b instanceof InterfaceC9425a) {
                            try {
                                Object mo14736b = ((InterfaceC9425a) interfaceC9426b).mo14736b(bArr, i3, this.f22107b);
                                return mo14736b == null ? new C9429e<>(this.f22106a, m14705a, m14705a.length, null) : new C9429e<>(this.f22106a, mo14736b, 0, interfaceC9426b);
                            } catch (IndexOutOfBoundsException unused) {
                                throw new ParseException(String.format("Insufficient data for LLBIN field %d, pos %d (LEN states '%s')", Integer.valueOf(i), Integer.valueOf(i2), new String(bArr, i2, 2)), i2);
                            }
                        }
                        try {
                            T mo14737a = interfaceC9426b.mo14737a(new String(bArr, i3, this.f22107b));
                            return mo14737a == null ? new C9429e<>(this.f22106a, m14705a, m14705a.length, null) : new C9429e<>(this.f22106a, mo14737a, m14705a.length, interfaceC9426b);
                        } catch (IndexOutOfBoundsException unused2) {
                            throw new ParseException(String.format("Insufficient data for LLBIN field %d, pos %d (LEN states '%s')", Integer.valueOf(i), Integer.valueOf(i2), new String(bArr, i2, 2)), i2);
                        }
                    }
                    throw new ParseException(String.format("Insufficient data for LLBIN field %d, pos %d (LEN states '%s')", Integer.valueOf(i), Integer.valueOf(i2), new String(bArr, i2, 2)), i2);
                }
                throw new ParseException(String.format("Invalid LLBIN field %d length %d pos %d", Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient LLBIN header field %d", Integer.valueOf(i)), i2);
        }
        throw new ParseException(String.format("Invalid LLBIN field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 <= bArr.length) {
                int i4 = (((bArr[i2] & 240) >> 4) * 10) + (bArr[i2] & 15);
                if (i4 >= 0) {
                    if (i4 + i2 + 1 <= bArr.length) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i3, bArr2, 0, i4);
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, bArr2, (InterfaceC9426b<byte[]>) null);
                        }
                        if (interfaceC9426b instanceof InterfaceC9425a) {
                            try {
                                Object mo14736b = ((InterfaceC9425a) interfaceC9426b).mo14736b(bArr, i3, i4);
                                return mo14736b == null ? new C9429e<>(this.f22106a, bArr2, i4, null) : new C9429e<>(this.f22106a, mo14736b, i4, interfaceC9426b);
                            } catch (IndexOutOfBoundsException unused) {
                                throw new ParseException(String.format("Insufficient data for LLBIN field %d, pos %d length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4)), i2);
                            }
                        }
                        T mo14737a = interfaceC9426b.mo14737a(C9450b.m14704b(bArr2, 0, i4));
                        return mo14737a == null ? new C9429e<>(this.f22106a, bArr2, (InterfaceC9426b<byte[]>) null) : new C9429e<>(this.f22106a, mo14737a, interfaceC9426b);
                    }
                    throw new ParseException(String.format("Insufficient data for bin LLBIN field %d, pos %d: need %d, only %d available", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(bArr.length)), i2);
                }
                throw new ParseException(String.format("Invalid bin LLBIN length %d pos %d", Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient bin LLBIN header field %d", Integer.valueOf(i)), i2);
        }
        throw new ParseException(String.format("Invalid bin LLBIN field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
