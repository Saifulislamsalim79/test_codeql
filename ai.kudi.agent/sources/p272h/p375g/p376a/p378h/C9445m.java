package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: LllvarParseInfo.java */
/* renamed from: h.g.a.h.m */
/* loaded from: classes2.dex */
public class C9445m extends AbstractC9442j {
    public C9445m() {
        super(EnumC9428d.LLLVAR, 0);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        String str;
        if (i2 >= 0) {
            int i3 = i2 + 3;
            if (i3 <= bArr.length) {
                int m14717a = m14717a(bArr, i2, 3);
                this.f22107b = m14717a;
                if (m14717a >= 0) {
                    if (m14717a + i2 + 3 <= bArr.length) {
                        if (m14717a == 0) {
                            str = "";
                        } else {
                            try {
                                str = new String(bArr, i3, this.f22107b, m14716b());
                            } catch (IndexOutOfBoundsException unused) {
                                throw new ParseException(String.format("Insufficient data for LLLVAR header, field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                            }
                        }
                        if (str.length() != this.f22107b) {
                            str = new String(bArr, i3, (bArr.length - i2) - 3, m14716b()).substring(0, this.f22107b);
                        }
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, str, this.f22107b, null);
                        }
                        T mo14737a = interfaceC9426b.mo14737a(str);
                        return mo14737a == null ? new C9429e<>(this.f22106a, str, this.f22107b, null) : new C9429e<>(this.f22106a, mo14737a, this.f22107b, interfaceC9426b);
                    }
                    throw new ParseException(String.format("Insufficient data for LLLVAR field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                }
                throw new ParseException(String.format("Invalid LLLVAR length %d field %d pos %d", Integer.valueOf(this.f22107b), Integer.valueOf(i), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient data for LLLVAR header field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid LLLVAR field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (i2 + 3 <= bArr.length) {
                int i3 = i2 + 1;
                int i4 = ((bArr[i2] & 15) * 100) + (((bArr[i3] & 240) >> 4) * 10) + (bArr[i3] & 15);
                this.f22107b = i4;
                if (i4 >= 0) {
                    if (i4 + i2 + 2 <= bArr.length) {
                        if (interfaceC9426b == null) {
                            return new C9429e<>(this.f22106a, new String(bArr, i2 + 2, this.f22107b, m14716b()), (InterfaceC9426b<String>) null);
                        }
                        int i5 = i2 + 2;
                        C9429e<?> c9429e = new C9429e<>(this.f22106a, interfaceC9426b.mo14737a(new String(bArr, i5, this.f22107b, m14716b())), interfaceC9426b);
                        return c9429e.m14759e() == null ? new C9429e<>(this.f22106a, new String(bArr, i5, this.f22107b, m14716b()), (InterfaceC9426b<String>) null) : c9429e;
                    }
                    throw new ParseException(String.format("Insufficient data for bin LLLVAR field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                }
                throw new ParseException(String.format("Invalid bin LLLVAR length %d, field %d pos %d", Integer.valueOf(this.f22107b), Integer.valueOf(i), Integer.valueOf(i2)), i2);
            }
            throw new ParseException(String.format("Insufficient data for bin LLLVAR header, field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid bin LLLVAR field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
