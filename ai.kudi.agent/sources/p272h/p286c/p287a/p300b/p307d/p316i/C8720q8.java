package p272h.p286c.p287a.p300b.p307d.p316i;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.q8 */
/* loaded from: classes2.dex */
public class C8720q8 implements Closeable {

    /* renamed from: z */
    private static final Map f20579z = new HashMap();

    /* renamed from: c */
    private final String f20580c;

    /* renamed from: d */
    private int f20581d;

    /* renamed from: e */
    private double f20582e;

    /* renamed from: f */
    private long f20583f;

    /* renamed from: w */
    private long f20584w;

    /* renamed from: x */
    private long f20585x;

    /* renamed from: y */
    private long f20586y;

    private C8720q8(String str) {
        this.f20585x = 2147483647L;
        this.f20586y = -2147483648L;
        this.f20580c = str;
    }

    /* renamed from: I */
    public static C8720q8 m15928I(String str) {
        C8698o8 c8698o8;
        C8710p9.m15931a();
        if (!C8710p9.m15930b()) {
            c8698o8 = C8698o8.f20567A;
            return c8698o8;
        }
        if (f20579z.get("detectorTaskWithResource#run") == null) {
            f20579z.put("detectorTaskWithResource#run", new C8720q8("detectorTaskWithResource#run"));
        }
        return (C8720q8) f20579z.get("detectorTaskWithResource#run");
    }

    /* renamed from: c */
    private final void m15927c() {
        this.f20581d = 0;
        this.f20582e = 0.0d;
        this.f20583f = 0L;
        this.f20585x = 2147483647L;
        this.f20586y = -2147483648L;
    }

    /* renamed from: F */
    public void mo15929F(long j) {
        mo15925m((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f20583f;
        if (j != 0) {
            mo15929F(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: g */
    public C8720q8 mo15926g() {
        this.f20583f = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    /* renamed from: m */
    public void mo15925m(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f20584w;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            m15927c();
        }
        this.f20584w = elapsedRealtimeNanos;
        this.f20581d++;
        double d = this.f20582e;
        double d2 = j;
        Double.isNaN(d2);
        this.f20582e = d + d2;
        this.f20585x = Math.min(this.f20585x, j);
        this.f20586y = Math.max(this.f20586y, j);
        if (this.f20581d % 50 == 0) {
            Locale locale = Locale.US;
            double d3 = this.f20582e;
            double d4 = this.f20581d;
            Double.isNaN(d4);
            String.format(locale, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f20580c, Long.valueOf(j), Integer.valueOf(this.f20581d), Long.valueOf(this.f20585x), Long.valueOf(this.f20586y), Integer.valueOf((int) (d3 / d4)));
            C8710p9.m15931a();
        }
        if (this.f20581d % 500 == 0) {
            m15927c();
        }
    }
}
