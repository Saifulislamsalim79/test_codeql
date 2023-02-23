package p272h.p375g.p376a.p378h;

import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
import p272h.p375g.p376a.p379i.C9449a;
/* compiled from: NumericParseInfo.java */
/* renamed from: h.g.a.h.o */
/* loaded from: classes2.dex */
public class C9447o extends AbstractC9432a {
    public C9447o(int i) {
        super(EnumC9428d.NUMERIC, i);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<Number> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        if (i2 >= 0) {
            int i3 = this.f22107b;
            if ((i3 / 2) + i2 <= bArr.length) {
                if (i3 < 19) {
                    return new C9429e<>(EnumC9428d.NUMERIC, Long.valueOf(C9449a.m14707b(bArr, i2, i3)), this.f22107b, null);
                }
                try {
                    return new C9429e<>(EnumC9428d.NUMERIC, C9449a.m14708a(bArr, i2, i3), this.f22107b, null);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ParseException(String.format("Insufficient data for bin %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
                }
            }
            throw new ParseException(String.format("Insufficient data for bin %s field %d of length %d, pos %d", this.f22106a, Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid bin NUMERIC field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
