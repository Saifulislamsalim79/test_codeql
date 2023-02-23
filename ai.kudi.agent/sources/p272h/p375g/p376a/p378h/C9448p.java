package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: TimeParseInfo.java */
/* renamed from: h.g.a.h.p */
/* loaded from: classes2.dex */
public class C9448p extends AbstractC9441i {
    public C9448p() {
        super(EnumC9428d.TIME, 6);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<Date> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (i2 + 6 <= bArr.length) {
                Calendar calendar = Calendar.getInstance();
                if (this.f22109d) {
                    calendar.set(11, Integer.parseInt(new String(bArr, i2, 2, m14716b()), 10));
                    calendar.set(12, Integer.parseInt(new String(bArr, i2 + 2, 2, m14716b()), 10));
                    calendar.set(13, Integer.parseInt(new String(bArr, i2 + 4, 2, m14716b()), 10));
                } else {
                    calendar.set(11, (((bArr[i2] - 48) * 10) + bArr[i2 + 1]) - 48);
                    calendar.set(12, (((bArr[i2 + 2] - 48) * 10) + bArr[i2 + 3]) - 48);
                    calendar.set(13, (((bArr[i2 + 4] - 48) * 10) + bArr[i2 + 5]) - 48);
                }
                TimeZone timeZone = this.f22105f;
                if (timeZone != null) {
                    calendar.setTimeZone(timeZone);
                }
                return new C9429e<>(this.f22106a, calendar.getTime(), (InterfaceC9426b<Date>) null);
            }
            throw new ParseException(String.format("Insufficient data for TIME field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid TIME field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<Date> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        if (i2 >= 0) {
            int i3 = i2 + 3;
            if (i3 <= bArr.length) {
                int[] iArr = new int[3];
                int i4 = 0;
                while (i2 < i3) {
                    iArr[i4] = (((bArr[i2] & 240) >> 4) * 10) + (bArr[i2] & 15);
                    i2++;
                    i4++;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, iArr[0]);
                calendar.set(12, iArr[1]);
                calendar.set(13, iArr[2]);
                TimeZone timeZone = this.f22105f;
                if (timeZone != null) {
                    calendar.setTimeZone(timeZone);
                }
                return new C9429e<>(this.f22106a, calendar.getTime(), (InterfaceC9426b<Date>) null);
            }
            throw new ParseException(String.format("Insufficient data for bin TIME field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid bin TIME field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
