package okhttp3.internal.http2;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C14484c;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.InterfaceC14345d;
/* compiled from: Http2Writer.java */
/* renamed from: okhttp3.internal.http2.i */
/* loaded from: classes3.dex */
final class C14512i implements Closeable {

    /* renamed from: y */
    private static final Logger f32042y = Logger.getLogger(C14487d.class.getName());

    /* renamed from: c */
    private final InterfaceC14345d f32043c;

    /* renamed from: d */
    private final boolean f32044d;

    /* renamed from: e */
    private final C14342c f32045e;

    /* renamed from: f */
    private int f32046f;

    /* renamed from: w */
    private boolean f32047w;

    /* renamed from: x */
    final C14484c.C14486b f32048x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14512i(InterfaceC14345d interfaceC14345d, boolean z) {
        this.f32043c = interfaceC14345d;
        this.f32044d = z;
        C14342c c14342c = new C14342c();
        this.f32045e = c14342c;
        this.f32048x = new C14484c.C14486b(c14342c);
        this.f32046f = 16384;
    }

    /* renamed from: X */
    private void m1431X(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.f32046f, j);
            long j2 = min;
            j -= j2;
            m1427m(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f32043c.mo1444r0(this.f32045e, j2);
        }
    }

    /* renamed from: Z */
    private static void m1430Z(InterfaceC14345d interfaceC14345d, int i) throws IOException {
        interfaceC14345d.mo2005n((i >>> 16) & 255);
        interfaceC14345d.mo2005n((i >>> 8) & 255);
        interfaceC14345d.mo2005n(i & 255);
    }

    /* renamed from: F */
    public synchronized void m1438F(int i, EnumC14481a enumC14481a, byte[] bArr) throws IOException {
        if (!this.f32047w) {
            if (enumC14481a.f31903c != -1) {
                m1427m(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f32043c.mo2006j(i);
                this.f32043c.mo2006j(enumC14481a.f31903c);
                if (bArr.length > 0) {
                    this.f32043c.mo2000x(bArr);
                }
                this.f32043c.flush();
            } else {
                C14487d.m1529c("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: I */
    void m1437I(boolean z, int i, List<C14482b> list) throws IOException {
        if (!this.f32047w) {
            this.f32048x.m1533g(list);
            long m2072F0 = this.f32045e.m2072F0();
            int min = (int) Math.min(this.f32046f, m2072F0);
            long j = min;
            byte b = m2072F0 == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m1427m(i, min, (byte) 1, b);
            this.f32043c.mo1444r0(this.f32045e, j);
            if (m2072F0 > j) {
                m1431X(i, m2072F0 - j);
                return;
            }
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    /* renamed from: J */
    public synchronized void m1436J(int i, int i2, List<C14482b> list) throws IOException {
        if (!this.f32047w) {
            this.f32048x.m1533g(list);
            long m2072F0 = this.f32045e.m2072F0();
            int min = (int) Math.min(this.f32046f - 4, m2072F0);
            long j = min;
            m1427m(i, min + 4, (byte) 5, m2072F0 == j ? (byte) 4 : (byte) 0);
            this.f32043c.mo2006j(i2 & Integer.MAX_VALUE);
            this.f32043c.mo1444r0(this.f32045e, j);
            if (m2072F0 > j) {
                m1431X(i, m2072F0 - j);
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: O */
    public synchronized void m1435O(int i, EnumC14481a enumC14481a) throws IOException {
        if (!this.f32047w) {
            if (enumC14481a.f31903c != -1) {
                m1427m(i, 4, (byte) 3, (byte) 0);
                this.f32043c.mo2006j(enumC14481a.f31903c);
                this.f32043c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: P */
    public synchronized void m1434P(C14517l c14517l) throws IOException {
        if (!this.f32047w) {
            int i = 0;
            m1427m(0, c14517l.m1409j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (c14517l.m1412g(i)) {
                    this.f32043c.mo2007i(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f32043c.mo2006j(c14517l.m1417b(i));
                }
                i++;
            }
            this.f32043c.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: V */
    public synchronized void m1433V(boolean z, int i, int i2, List<C14482b> list) throws IOException {
        if (!this.f32047w) {
            m1437I(z, i, list);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: W */
    public synchronized void m1432W(boolean z, int i, C14342c c14342c, int i2) throws IOException {
        if (!this.f32047w) {
            m1428g(i, z ? (byte) 1 : (byte) 0, c14342c, i2);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: c */
    public synchronized void m1429c(C14517l c14517l) throws IOException {
        if (!this.f32047w) {
            this.f32046f = c14517l.m1413f(this.f32046f);
            if (c14517l.m1416c() != -1) {
                this.f32048x.m1535e(c14517l.m1416c());
            }
            m1427m(0, 0, (byte) 4, (byte) 1);
            this.f32043c.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f32047w = true;
        this.f32043c.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (!this.f32047w) {
            if (this.f32044d) {
                if (f32042y.isLoggable(Level.FINE)) {
                    f32042y.fine(C14148c.m2790r(">> CONNECTION %s", C14487d.f31932a.mo1959p()));
                }
                this.f32043c.mo2000x(C14487d.f31932a.mo1966J());
                this.f32043c.flush();
                return;
            }
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    public synchronized void flush() throws IOException {
        if (!this.f32047w) {
            this.f32043c.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* renamed from: g */
    void m1428g(int i, byte b, C14342c c14342c, int i2) throws IOException {
        m1427m(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f32043c.mo1444r0(c14342c, i2);
        }
    }

    /* renamed from: m */
    public void m1427m(int i, int i2, byte b, byte b2) throws IOException {
        if (f32042y.isLoggable(Level.FINE)) {
            f32042y.fine(C14487d.m1530b(false, i, i2, b, b2));
        }
        int i3 = this.f32046f;
        if (i2 > i3) {
            C14487d.m1529c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) != 0) {
            C14487d.m1529c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        } else {
            m1430Z(this.f32043c, i2);
            this.f32043c.mo2005n(b & 255);
            this.f32043c.mo2005n(b2 & 255);
            this.f32043c.mo2006j(i & Integer.MAX_VALUE);
        }
    }

    public int maxDataLength() {
        return this.f32046f;
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.f32047w) {
            m1427m(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f32043c.mo2006j(i);
            this.f32043c.mo2006j(i2);
            this.f32043c.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.f32047w) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (j != 0 && j <= 2147483647L) {
            m1427m(i, 4, (byte) 8, (byte) 0);
            this.f32043c.mo2006j((int) j);
            this.f32043c.flush();
        } else {
            C14487d.m1529c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
    }
}
