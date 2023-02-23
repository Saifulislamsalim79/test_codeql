package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9425a;
import p272h.p375g.p376a.InterfaceC9426b;
import p272h.p375g.p376a.p379i.C9450b;
/* compiled from: LllbinParseInfo.java */
/* renamed from: h.g.a.h.l */
/* loaded from: classes2.dex */
public class C9444l extends AbstractC9442j {
    public C9444l() {
        super(EnumC9428d.LLLBIN, 0);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        String str;
        if (i2 >= 0) {
            int i3 = i2 + 3;
            if (i3 <= bArr.length) {
                int m14717a = m14717a(bArr, i2, 3);
                if (m14717a >= 0) {
                    if (m14717a + i2 + 3 <= bArr.length) {
                        byte[] m14705a = m14717a == 0 ? new byte[0] : C9450b.m14705a(new String(bArr, i3, m14717a));
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, m14705a, m14705a.length, null);
                        }
                        if (interfaceC9426b instanceof InterfaceC9425a) {
                            try {
                                Object mo14736b = ((InterfaceC9425a) interfaceC9426b).mo14736b(bArr, i3, m14717a);
                                return mo14736b == null ? new C9429e<>(this.f22106a, m14705a, m14705a.length, null) : new C9429e<>(this.f22106a, mo14736b, 0, interfaceC9426b);
                            } catch (IndexOutOfBoundsException unused) {
                                throw new ParseException(String.format("Insufficient data for LLLBIN field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                            }
                        }
                        if (m14717a == 0) {
                            str = "";
                        } else {
                            try {
                                str = new String(bArr, i3, m14717a);
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new ParseException(String.format("Insufficient data for LLLBIN field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                            }
                        }
                        T mo14737a = interfaceC9426b.mo14737a(str);
                        return mo14737a == null ? new C9429e<>(this.f22106a, m14705a, m14705a.length, null) : new C9429e<>(this.f22106a, mo14737a, m14717a, interfaceC9426b);
                    }
                    throw new ParseException(String.format("Insufficient data for LLLBIN field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                }
                throw new ParseException(String.format("Invalid LLLBIN length %d field %d pos %d", Integer.valueOf(m14717a), Integer.valueOf(i), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient LLLBIN header field %d", Integer.valueOf(i)), i2);
        }
        throw new ParseException(String.format("Invalid LLLBIN field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        if (i2 >= 0) {
            int i3 = i2 + 2;
            if (i3 <= bArr.length) {
                int i4 = i2 + 1;
                int i5 = ((bArr[i2] & 15) * 100) + (((bArr[i4] & 240) >> 4) * 10) + (bArr[i4] & 15);
                if (i5 >= 0) {
                    if (i5 + i2 + 2 <= bArr.length) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i3, bArr2, 0, i5);
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, bArr2, (InterfaceC9426b<byte[]>) null);
                        }
                        if (interfaceC9426b instanceof InterfaceC9425a) {
                            try {
                                Object mo14736b = ((InterfaceC9425a) interfaceC9426b).mo14736b(bArr, i3, i5);
                                return mo14736b == null ? new C9429e<>(this.f22106a, bArr2, i5, null) : new C9429e<>(this.f22106a, mo14736b, i5, interfaceC9426b);
                            } catch (IndexOutOfBoundsException unused) {
                                throw new ParseException(String.format("Insufficient data for LLLBIN field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                            }
                        }
                        T mo14737a = interfaceC9426b.mo14737a(C9450b.m14704b(bArr2, 0, i5));
                        return mo14737a == null ? new C9429e<>(this.f22106a, bArr2, (InterfaceC9426b<byte[]>) null) : new C9429e<>(this.f22106a, mo14737a, interfaceC9426b);
                    }
                    throw new ParseException(String.format("Insufficient data for bin LLLBIN field %d, pos %d requires %d, only %d available", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf((bArr.length - i2) + 1)), i2);
                }
                throw new ParseException(String.format("Invalid LLLBIN length %d field %d pos %d", Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient LLLBIN header field %d", Integer.valueOf(i)), i2);
        }
        throw new ParseException(String.format("Invalid bin LLLBIN field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
