package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: AlphaParseInfo.java */
/* renamed from: h.g.a.h.b */
/* loaded from: classes2.dex */
public class C9433b extends AbstractC9432a {
    public C9433b(int i) {
        super(EnumC9428d.ALPHA, i);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (this.f22107b + i2 <= bArr.length) {
                try {
                    if (interfaceC9426b == null) {
                        return new C9429e<>(this.f22106a, new String(bArr, i2, this.f22107b, m14716b()), this.f22107b, null);
                    }
                    T mo14737a = interfaceC9426b.mo14737a(new String(bArr, i2, this.f22107b, m14716b()));
                    return mo14737a == null ? new C9429e<>(this.f22106a, new String(bArr, i2, this.f22107b, m14716b()), this.f22107b, null) : new C9429e<>(this.f22106a, mo14737a, this.f22107b, interfaceC9426b);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ParseException(String.format("Insufficient data for bin %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
                }
            }
            throw new ParseException(String.format("Insufficient data for bin %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid bin ALPHA field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
