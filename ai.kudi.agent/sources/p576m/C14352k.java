package p576m;

import java.io.IOException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.java */
/* renamed from: m.k */
/* loaded from: classes3.dex */
public final class C14352k implements InterfaceC14365s {

    /* renamed from: c */
    private final InterfaceC14346e f31635c;

    /* renamed from: d */
    private final Inflater f31636d;

    /* renamed from: e */
    private int f31637e;

    /* renamed from: f */
    private boolean f31638f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14352k(InterfaceC14346e interfaceC14346e, Inflater inflater) {
        if (interfaceC14346e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.f31635c = interfaceC14346e;
            this.f31636d = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }

    /* renamed from: g */
    private void m2025g() throws IOException {
        int i = this.f31637e;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f31636d.getRemaining();
        this.f31637e -= remaining;
        this.f31635c.mo1994a(remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        m2025g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r1.f31653b != r1.f31654c) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r7.f31618c = r1.m1976b();
        p576m.C14362p.m1971a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return -1;
     */
    @Override // p576m.InterfaceC14365s
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo312O0(p576m.C14342c r7, long r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L7a
            boolean r2 = r6.f31638f
            if (r2 != 0) goto L72
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            return r0
        Lf:
            boolean r0 = r6.m2026c()
            r1 = 1
            m.o r1 = r7.m2068K0(r1)     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = r1.f31654c     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L6b
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.util.zip.DataFormatException -> L6b
            int r3 = (int) r2     // Catch: java.util.zip.DataFormatException -> L6b
            java.util.zip.Inflater r2 = r6.f31636d     // Catch: java.util.zip.DataFormatException -> L6b
            byte[] r4 = r1.f31652a     // Catch: java.util.zip.DataFormatException -> L6b
            int r5 = r1.f31654c     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = r2.inflate(r4, r5, r3)     // Catch: java.util.zip.DataFormatException -> L6b
            if (r2 <= 0) goto L3a
            int r8 = r1.f31654c     // Catch: java.util.zip.DataFormatException -> L6b
            int r8 = r8 + r2
            r1.f31654c = r8     // Catch: java.util.zip.DataFormatException -> L6b
            long r8 = r7.f31619d     // Catch: java.util.zip.DataFormatException -> L6b
            long r0 = (long) r2     // Catch: java.util.zip.DataFormatException -> L6b
            long r8 = r8 + r0
            r7.f31619d = r8     // Catch: java.util.zip.DataFormatException -> L6b
            return r0
        L3a:
            java.util.zip.Inflater r2 = r6.f31636d     // Catch: java.util.zip.DataFormatException -> L6b
            boolean r2 = r2.finished()     // Catch: java.util.zip.DataFormatException -> L6b
            if (r2 != 0) goto L56
            java.util.zip.Inflater r2 = r6.f31636d     // Catch: java.util.zip.DataFormatException -> L6b
            boolean r2 = r2.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L6b
            if (r2 == 0) goto L4b
            goto L56
        L4b:
            if (r0 != 0) goto L4e
            goto Lf
        L4e:
            java.io.EOFException r7 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L6b
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)     // Catch: java.util.zip.DataFormatException -> L6b
            throw r7     // Catch: java.util.zip.DataFormatException -> L6b
        L56:
            r6.m2025g()     // Catch: java.util.zip.DataFormatException -> L6b
            int r8 = r1.f31653b     // Catch: java.util.zip.DataFormatException -> L6b
            int r9 = r1.f31654c     // Catch: java.util.zip.DataFormatException -> L6b
            if (r8 != r9) goto L68
            m.o r8 = r1.m1976b()     // Catch: java.util.zip.DataFormatException -> L6b
            r7.f31618c = r8     // Catch: java.util.zip.DataFormatException -> L6b
            p576m.C14362p.m1971a(r1)     // Catch: java.util.zip.DataFormatException -> L6b
        L68:
            r7 = -1
            return r7
        L6b:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L72:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        L7a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "byteCount < 0: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            goto L92
        L91:
            throw r7
        L92:
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: p576m.C14352k.mo312O0(m.c, long):long");
    }

    /* renamed from: c */
    public final boolean m2026c() throws IOException {
        if (this.f31636d.needsInput()) {
            m2025g();
            if (this.f31636d.getRemaining() == 0) {
                if (this.f31635c.mo1987l()) {
                    return true;
                }
                C14361o c14361o = this.f31635c.mo1992d().f31618c;
                int i = c14361o.f31654c;
                int i2 = c14361o.f31653b;
                int i3 = i - i2;
                this.f31637e = i3;
                this.f31636d.setInput(c14361o.f31652a, i2, i3);
                return false;
            }
            throw new IllegalStateException("?");
        }
        return false;
    }

    @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f31638f) {
            return;
        }
        this.f31636d.end();
        this.f31638f = true;
        this.f31635c.close();
    }

    @Override // p576m.InterfaceC14365s
    public C14366t timeout() {
        return this.f31635c.timeout();
    }
}
