package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
import p272h.p375g.p376a.p379i.C9450b;
/* compiled from: BinaryParseInfo.java */
/* renamed from: h.g.a.h.d */
/* loaded from: classes2.dex */
public class C9435d extends AbstractC9442j {
    public C9435d(int i) {
        super(EnumC9428d.BINARY, i);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if ((this.f22107b * 2) + i2 <= bArr.length) {
                byte[] m14705a = C9450b.m14705a(new String(bArr, i2, this.f22107b * 2));
                if (interfaceC9426b == null) {
                    return new C9429e<>(this.f22106a, m14705a, m14705a.length, null);
                }
                T mo14737a = interfaceC9426b.mo14737a(new String(bArr, i2, this.f22107b * 2, m14716b()));
                return mo14737a == null ? new C9429e<>(this.f22106a, m14705a, m14705a.length, null) : new C9429e<>(this.f22106a, mo14737a, this.f22107b, interfaceC9426b);
            }
            throw new ParseException(String.format("Insufficient data for BINARY field %d of length %d, pos %d", Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid BINARY field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        if (i2 >= 0) {
            int i3 = this.f22107b;
            if (i2 + i3 <= bArr.length) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i2, bArr2, 0, i3);
                if (interfaceC9426b == null) {
                    return new C9429e<>(this.f22106a, bArr2, this.f22107b, null);
                }
                T mo14737a = interfaceC9426b.mo14737a(C9450b.m14704b(bArr2, 0, i3));
                return mo14737a == null ? new C9429e<>(this.f22106a, bArr2, this.f22107b, null) : new C9429e<>(this.f22106a, mo14737a, this.f22107b, interfaceC9426b);
            }
            throw new ParseException(String.format("Insufficient data for BINARY field %d of length %d, pos %d", Integer.valueOf(i), Integer.valueOf(this.f22107b), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid BINARY field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
