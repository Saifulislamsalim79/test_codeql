package p576m;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSink.java */
/* renamed from: m.m */
/* loaded from: classes3.dex */
public final class C14358m implements InterfaceC14345d {

    /* renamed from: c */
    public final C14342c f31645c = new C14342c();

    /* renamed from: d */
    public final InterfaceC14364r f31646d;

    /* renamed from: e */
    boolean f31647e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14358m(InterfaceC14364r interfaceC14364r) {
        if (interfaceC14364r != null) {
            this.f31646d = interfaceC14364r;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: A */
    public InterfaceC14345d mo2010A(long j) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2059b1(j);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: I0 */
    public InterfaceC14345d mo2009I0(C14347f c14347f) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2065P0(c14347f);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: b */
    public InterfaceC14345d mo2008b(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2062X0(bArr, i, i2);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f31647e) {
            return;
        }
        try {
            if (this.f31645c.f31619d > 0) {
                this.f31646d.mo1444r0(this.f31645c, this.f31645c.f31619d);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f31646d.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f31647e = true;
        if (th == null) {
            return;
        }
        C14368u.m1941e(th);
        throw null;
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: d */
    public C14342c mo1992d() {
        return this.f31645c;
    }

    @Override // p576m.InterfaceC14345d, p576m.InterfaceC14364r, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f31647e) {
            C14342c c14342c = this.f31645c;
            long j = c14342c.f31619d;
            if (j > 0) {
                this.f31646d.mo1444r0(c14342c, j);
            }
            this.f31646d.flush();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: i */
    public InterfaceC14345d mo2007i(int i) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2055e1(i);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f31647e;
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: j */
    public InterfaceC14345d mo2006j(int i) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2056d1(i);
            return mo2004o();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: n */
    public InterfaceC14345d mo2005n(int i) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2061Z0(i);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: o */
    public InterfaceC14345d mo2004o() throws IOException {
        if (!this.f31647e) {
            long m2073F = this.f31645c.m2073F();
            if (m2073F > 0) {
                this.f31646d.mo1444r0(this.f31645c, m2073F);
            }
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: r */
    public InterfaceC14345d mo2003r(String str) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2050h1(str);
            return mo2004o();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14364r
    /* renamed from: r0 */
    public void mo1444r0(C14342c c14342c, long j) throws IOException {
        if (!this.f31647e) {
            this.f31645c.mo1444r0(c14342c, j);
            mo2004o();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: s0 */
    public long mo2002s0(InterfaceC14365s interfaceC14365s) throws IOException {
        if (interfaceC14365s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long mo312O0 = interfaceC14365s.mo312O0(this.f31645c, 8192L);
            if (mo312O0 == -1) {
                return j;
            }
            j += mo312O0;
            mo2004o();
        }
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: t */
    public InterfaceC14345d mo2001t(long j) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2057c1(j);
            return mo2004o();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14364r
    public C14366t timeout() {
        return this.f31646d.timeout();
    }

    public String toString() {
        return "buffer(" + this.f31646d + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f31647e) {
            int write = this.f31645c.write(byteBuffer);
            mo2004o();
            return write;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: x */
    public InterfaceC14345d mo2000x(byte[] bArr) throws IOException {
        if (!this.f31647e) {
            this.f31645c.m2064U0(bArr);
            mo2004o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }
}
