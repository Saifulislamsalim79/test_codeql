package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: AmountParseInfo.java */
/* renamed from: h.g.a.h.c */
/* loaded from: classes2.dex */
public class C9434c extends AbstractC9442j {
    public C9434c() {
        super(EnumC9428d.AMOUNT, 12);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<BigDecimal> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (i2 + 12 <= bArr.length) {
                String str = new String(bArr, i2, 12, m14716b());
                try {
                    return new C9429e<>(this.f22106a, new BigDecimal(str).movePointLeft(2));
                } catch (IndexOutOfBoundsException unused) {
                    throw new ParseException(String.format("Insufficient data for AMOUNT field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
                } catch (NumberFormatException unused2) {
                    throw new ParseException(String.format("Cannot read amount '%s' field %d pos %d", str, Integer.valueOf(i), Integer.valueOf(i2)), i2);
                }
            }
            throw new ParseException(String.format("Insufficient data for AMOUNT field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid AMOUNT field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<BigDecimal> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        char[] cArr = new char[13];
        cArr[10] = '.';
        int i3 = 0;
        for (int i4 = i2; i4 < i2 + 6; i4++) {
            int i5 = i3 + 1;
            cArr[i3] = (char) (((bArr[i4] & 240) >> 4) + 48);
            i3 = i5 + 1;
            cArr[i5] = (char) ((bArr[i4] & 15) + 48);
            if (i3 == 10) {
                i3++;
            }
        }
        try {
            return new C9429e<>(EnumC9428d.AMOUNT, new BigDecimal(new String(cArr)));
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException(String.format("Insufficient data for AMOUNT field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        } catch (NumberFormatException unused2) {
            throw new ParseException(String.format("Cannot read amount '%s' field %d pos %d", new String(cArr), Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
    }
}
