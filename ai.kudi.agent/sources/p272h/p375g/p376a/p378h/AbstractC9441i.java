package p272h.p375g.p376a.p378h;

import java.util.Calendar;
import java.util.TimeZone;
import p272h.p375g.p376a.EnumC9428d;
/* compiled from: DateTimeParseInfo.java */
/* renamed from: h.g.a.h.i */
/* loaded from: classes2.dex */
public abstract class AbstractC9441i extends AbstractC9442j {

    /* renamed from: g */
    protected static final long f22104g = Long.parseLong(System.getProperty("j8583.future.tolerance", "900000"));

    /* renamed from: f */
    protected TimeZone f22105f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9441i(EnumC9428d enumC9428d, int i) {
        super(enumC9428d, i);
    }

    /* renamed from: j */
    public static void m14718j(Calendar calendar) {
        long currentTimeMillis = System.currentTimeMillis();
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis <= currentTimeMillis || timeInMillis - currentTimeMillis <= f22104g) {
            return;
        }
        calendar.add(1, -1);
    }
}
