package p425j.p429b.p433b;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.java */
/* renamed from: j.b.b.j */
/* loaded from: classes3.dex */
public final class C11156j implements InterfaceC11170s {

    /* renamed from: d */
    private final InterfaceC11151e f25223d;

    /* renamed from: e */
    private final Inflater f25224e;

    /* renamed from: f */
    private final C11157k f25225f;

    /* renamed from: c */
    private int f25222c = 0;

    /* renamed from: w */
    private final CRC32 f25226w = new CRC32();

    public C11156j(InterfaceC11170s interfaceC11170s) {
        if (interfaceC11170s != null) {
            this.f25224e = new Inflater(true);
            InterfaceC11151e m11526d = C11158l.m11526d(interfaceC11170s);
            this.f25223d = m11526d;
            this.f25225f = new C11157k(m11526d, this.f25224e);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: F */
    private void m11535F(C11146c c11146c, long j, long j2) {
        int i;
        C11166o c11166o = c11146c.f25205c;
        while (true) {
            int i2 = c11166o.f25246c;
            int i3 = c11166o.f25245b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            c11166o = c11166o.f25249f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c11166o.f25246c - i, j2);
            this.f25226w.update(c11166o.f25244a, (int) (c11166o.f25245b + j), min);
            j2 -= min;
            c11166o = c11166o.f25249f;
            j = 0;
        }
    }

    /* renamed from: c */
    private void m11534c(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    private void m11533g() throws IOException {
        this.f25223d.mo11482z(10L);
        byte m11576P = this.f25223d.mo11496d().m11576P(3L);
        boolean z = ((m11576P >> 1) & 1) == 1;
        if (z) {
            m11535F(this.f25223d.mo11496d(), 0L, 10L);
        }
        m11534c("ID1ID2", 8075, this.f25223d.readShort());
        this.f25223d.mo11499a(8L);
        if (((m11576P >> 2) & 1) == 1) {
            this.f25223d.mo11482z(2L);
            if (z) {
                m11535F(this.f25223d.mo11496d(), 0L, 2L);
            }
            long mo11483y = this.f25223d.mo11496d().mo11483y();
            this.f25223d.mo11482z(mo11483y);
            if (z) {
                m11535F(this.f25223d.mo11496d(), 0L, mo11483y);
            }
            this.f25223d.mo11499a(mo11483y);
        }
        if (((m11576P >> 3) & 1) == 1) {
            long mo11503B = this.f25223d.mo11503B((byte) 0);
            if (mo11503B != -1) {
                if (z) {
                    m11535F(this.f25223d.mo11496d(), 0L, mo11503B + 1);
                }
                this.f25223d.mo11499a(mo11503B + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m11576P >> 4) & 1) == 1) {
            long mo11503B2 = this.f25223d.mo11503B((byte) 0);
            if (mo11503B2 != -1) {
                if (z) {
                    m11535F(this.f25223d.mo11496d(), 0L, mo11503B2 + 1);
                }
                this.f25223d.mo11499a(mo11503B2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m11534c("FHCRC", this.f25223d.mo11483y(), (short) this.f25226w.getValue());
            this.f25226w.reset();
        }
    }

    /* renamed from: m */
    private void m11532m() throws IOException {
        m11534c("CRC", this.f25223d.mo11485v(), (int) this.f25226w.getValue());
        m11534c("ISIZE", this.f25223d.mo11485v(), (int) this.f25224e.getBytesWritten());
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25225f.close();
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public long read(C11146c c11146c, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0L;
        } else {
            if (this.f25222c == 0) {
                m11533g();
                this.f25222c = 1;
            }
            if (this.f25222c == 1) {
                long j2 = c11146c.f25206d;
                long read = this.f25225f.read(c11146c, j);
                if (read != -1) {
                    m11535F(c11146c, j2, read);
                    return read;
                }
                this.f25222c = 2;
            }
            if (this.f25222c == 2) {
                m11532m();
                this.f25222c = 3;
                if (!this.f25223d.mo11491l()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public C11171t timeout() {
        return this.f25223d.timeout();
    }
}
