package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: AlphaNumericFieldParseInfo.java */
/* renamed from: h.g.a.h.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9432a extends AbstractC9442j {
    public AbstractC9432a(EnumC9428d enumC9428d, int i) {
        super(enumC9428d, i);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (this.f22107b + i2 <= bArr.length) {
                try {
                    String str = new String(bArr, i2, this.f22107b, m14716b());
                    if (str.length() != this.f22107b) {
                        str = new String(bArr, i2, bArr.length - i2, m14716b()).substring(0, this.f22107b);
                    }
                    if (interfaceC9426b == null) {
                        return new C9429e<>(this.f22106a, str, this.f22107b, null);
                    }
                    T mo14737a = interfaceC9426b.mo14737a(str);
                    return mo14737a == null ? new C9429e<>(this.f22106a, str, this.f22107b, null) : new C9429e<>(this.f22106a, mo14737a, this.f22107b, interfaceC9426b);
                } catch (StringIndexOutOfBoundsException unused) {
                    throw new ParseException(String.format("Insufficient data for %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
                }
            }
            throw new ParseException(String.format("Insufficient data for %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid ALPHA/NUM field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
