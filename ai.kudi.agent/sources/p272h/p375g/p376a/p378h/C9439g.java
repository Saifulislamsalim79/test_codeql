package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: Date4ParseInfo.java */
/* renamed from: h.g.a.h.g */
/* loaded from: classes2.dex */
public class C9439g extends AbstractC9441i {
    public C9439g() {
        super(EnumC9428d.DATE4, 4);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: e */
    public <T> C9429e<Date> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException {
        if (i2 >= 0) {
            if (i2 + 4 <= bArr.length) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(10, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (this.f22109d) {
                    calendar.set(2, Integer.parseInt(new String(bArr, i2, 2, m14716b()), 10) - 1);
                    calendar.set(5, Integer.parseInt(new String(bArr, i2 + 2, 2, m14716b()), 10));
                } else {
                    calendar.set(2, (((bArr[i2] - 48) * 10) + bArr[i2 + 1]) - 49);
                    calendar.set(5, (((bArr[i2 + 2] - 48) * 10) + bArr[i2 + 3]) - 48);
                }
                TimeZone timeZone = this.f22105f;
                if (timeZone != null) {
                    calendar.setTimeZone(timeZone);
                }
                AbstractC9441i.m14718j(calendar);
                return new C9429e<>(this.f22106a, calendar.getTime(), (InterfaceC9426b<Date>) null);
            }
            throw new ParseException(String.format("Insufficient data for DATE4 field %d, pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
        }
        throw new ParseException(String.format("Invalid DATE4 field %d position %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }

    @Override // p272h.p375g.p376a.p378h.AbstractC9442j
    /* renamed from: f */
    public <T> C9429e<Date> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException {
        int[] iArr = new int[2];
        if (bArr.length - i2 >= 2) {
            int i3 = i2;
            int i4 = 0;
            while (i3 < i2 + 2) {
                iArr[i4] = (((bArr[i3] & 240) >> 4) * 10) + (bArr[i3] & 15);
                i3++;
                i4++;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(10, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(2, iArr[0] - 1);
            calendar.set(5, iArr[1]);
            calendar.set(14, 0);
            TimeZone timeZone = this.f22105f;
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
            }
            AbstractC9441i.m14718j(calendar);
            return new C9429e<>(this.f22106a, calendar.getTime(), (InterfaceC9426b<Date>) null);
        }
        throw new ParseException(String.format("Insufficient data to parse binary DATE4 field %d pos %d", Integer.valueOf(i), Integer.valueOf(i2)), i2);
    }
}
