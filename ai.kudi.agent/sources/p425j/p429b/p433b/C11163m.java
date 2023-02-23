package p425j.p429b.p433b;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSink.java */
/* renamed from: j.b.b.m */
/* loaded from: classes3.dex */
public final class C11163m implements InterfaceC11150d {

    /* renamed from: c */
    public final C11146c f25237c = new C11146c();

    /* renamed from: d */
    public final InterfaceC11169r f25238d;

    /* renamed from: e */
    boolean f25239e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11163m(InterfaceC11169r interfaceC11169r) {
        if (interfaceC11169r != null) {
            this.f25238d = interfaceC11169r;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: A */
    public InterfaceC11150d mo11515A(long j) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11566d1(j);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: K */
    public InterfaceC11150d mo11514K() throws IOException {
        if (!this.f25239e) {
            long m11579J0 = this.f25237c.m11579J0();
            if (m11579J0 > 0) {
                this.f25238d.write(this.f25237c, m11579J0);
            }
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: b */
    public InterfaceC11150d mo11513b(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11569b1(bArr, i, i2);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25239e) {
            return;
        }
        try {
            if (this.f25237c.f25206d > 0) {
                this.f25238d.write(this.f25237c, this.f25237c.f25206d);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f25238d.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f25239e = true;
        if (th == null) {
            return;
        }
        C11173u.m11451e(th);
        throw null;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: d */
    public C11146c mo11496d() {
        return this.f25237c;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: d0 */
    public long mo11512d0(InterfaceC11170s interfaceC11170s) throws IOException {
        if (interfaceC11170s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = interfaceC11170s.read(this.f25237c, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            mo11508o();
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d, p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f25239e) {
            C11146c c11146c = this.f25237c;
            long j = c11146c.f25206d;
            if (j > 0) {
                this.f25238d.write(c11146c, j);
            }
            this.f25238d.flush();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: i */
    public InterfaceC11150d mo11511i(int i) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11560h1(i);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f25239e;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: j */
    public InterfaceC11150d mo11510j(int i) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11563f1(i);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: n */
    public InterfaceC11150d mo11509n(int i) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11567c1(i);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: o */
    public InterfaceC11150d mo11508o() throws IOException {
        if (!this.f25239e) {
            long m11583F = this.f25237c.m11583F();
            if (m11583F > 0) {
                this.f25238d.write(this.f25237c, m11583F);
            }
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: r */
    public InterfaceC11150d mo11507r(String str) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11556k1(str);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: t */
    public InterfaceC11150d mo11506t(long j) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11565e1(j);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r
    public C11171t timeout() {
        return this.f25238d.timeout();
    }

    public String toString() {
        return "buffer(" + this.f25238d + ")";
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r
    public void write(C11146c c11146c, long j) throws IOException {
        if (!this.f25239e) {
            this.f25237c.write(c11146c, j);
            mo11508o();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: x */
    public InterfaceC11150d mo11505x(byte[] bArr) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11571Z0(bArr);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: y0 */
    public InterfaceC11150d mo11504y0(C11152f c11152f) throws IOException {
        if (!this.f25239e) {
            this.f25237c.m11572X0(c11152f);
            mo11508o();
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f25239e) {
            int write = this.f25237c.write(byteBuffer);
            mo11508o();
            return write;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }
}
