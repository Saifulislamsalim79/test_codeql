package p576m;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.java */
/* renamed from: m.j */
/* loaded from: classes3.dex */
public final class C14351j implements InterfaceC14365s {

    /* renamed from: d */
    private final InterfaceC14346e f31631d;

    /* renamed from: e */
    private final Inflater f31632e;

    /* renamed from: f */
    private final C14352k f31633f;

    /* renamed from: c */
    private int f31630c = 0;

    /* renamed from: w */
    private final CRC32 f31634w = new CRC32();

    public C14351j(InterfaceC14365s interfaceC14365s) {
        if (interfaceC14365s != null) {
            this.f31632e = new Inflater(true);
            InterfaceC14346e m2021d = C14353l.m2021d(interfaceC14365s);
            this.f31631d = m2021d;
            this.f31633f = new C14352k(m2021d, this.f31632e);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: F */
    private void m2030F(C14342c c14342c, long j, long j2) {
        int i;
        C14361o c14361o = c14342c.f31618c;
        while (true) {
            int i2 = c14361o.f31654c;
            int i3 = c14361o.f31653b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            c14361o = c14361o.f31657f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c14361o.f31654c - i, j2);
            this.f31634w.update(c14361o.f31652a, (int) (c14361o.f31653b + j), min);
            j2 -= min;
            c14361o = c14361o.f31657f;
            j = 0;
        }
    }

    /* renamed from: c */
    private void m2029c(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    private void m2028g() throws IOException {
        this.f31631d.mo1978z(10L);
        byte m2066P = this.f31631d.mo1992d().m2066P(3L);
        boolean z = ((m2066P >> 1) & 1) == 1;
        if (z) {
            m2030F(this.f31631d.mo1992d(), 0L, 10L);
        }
        m2029c("ID1ID2", 8075, this.f31631d.readShort());
        this.f31631d.mo1994a(8L);
        if (((m2066P >> 2) & 1) == 1) {
            this.f31631d.mo1978z(2L);
            if (z) {
                m2030F(this.f31631d.mo1992d(), 0L, 2L);
            }
            long mo1979y = this.f31631d.mo1992d().mo1979y();
            this.f31631d.mo1978z(mo1979y);
            if (z) {
                m2030F(this.f31631d.mo1992d(), 0L, mo1979y);
            }
            this.f31631d.mo1994a(mo1979y);
        }
        if (((m2066P >> 3) & 1) == 1) {
            long mo1999B = this.f31631d.mo1999B((byte) 0);
            if (mo1999B != -1) {
                if (z) {
                    m2030F(this.f31631d.mo1992d(), 0L, mo1999B + 1);
                }
                this.f31631d.mo1994a(mo1999B + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m2066P >> 4) & 1) == 1) {
            long mo1999B2 = this.f31631d.mo1999B((byte) 0);
            if (mo1999B2 != -1) {
                if (z) {
                    m2030F(this.f31631d.mo1992d(), 0L, mo1999B2 + 1);
                }
                this.f31631d.mo1994a(mo1999B2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m2029c("FHCRC", this.f31631d.mo1979y(), (short) this.f31634w.getValue());
            this.f31634w.reset();
        }
    }

    /* renamed from: m */
    private void m2027m() throws IOException {
        m2029c("CRC", this.f31631d.mo1981v(), (int) this.f31634w.getValue());
        m2029c("ISIZE", this.f31631d.mo1981v(), (int) this.f31632e.getBytesWritten());
    }

    @Override // p576m.InterfaceC14365s
    /* renamed from: O0 */
    public long mo312O0(C14342c c14342c, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0L;
        } else {
            if (this.f31630c == 0) {
                m2028g();
                this.f31630c = 1;
            }
            if (this.f31630c == 1) {
                long j2 = c14342c.f31619d;
                long mo312O0 = this.f31633f.mo312O0(c14342c, j);
                if (mo312O0 != -1) {
                    m2030F(c14342c, j2, mo312O0);
                    return mo312O0;
                }
                this.f31630c = 2;
            }
            if (this.f31630c == 2) {
                m2027m();
                this.f31630c = 3;
                if (!this.f31631d.mo1987l()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31633f.close();
    }

    @Override // p576m.InterfaceC14365s
    public C14366t timeout() {
        return this.f31631d.timeout();
    }
}
