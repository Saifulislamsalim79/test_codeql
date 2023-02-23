package p425j.p429b.p433b;

import java.io.IOException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.java */
/* renamed from: j.b.b.k */
/* loaded from: classes3.dex */
public final class C11157k implements InterfaceC11170s {

    /* renamed from: c */
    private final InterfaceC11151e f25227c;

    /* renamed from: d */
    private final Inflater f25228d;

    /* renamed from: e */
    private int f25229e;

    /* renamed from: f */
    private boolean f25230f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11157k(InterfaceC11151e interfaceC11151e, Inflater inflater) {
        if (interfaceC11151e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.f25227c = interfaceC11151e;
            this.f25228d = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }

    /* renamed from: g */
    private void m11530g() throws IOException {
        int i = this.f25229e;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f25228d.getRemaining();
        this.f25229e -= remaining;
        this.f25227c.mo11499a(remaining);
    }

    /* renamed from: c */
    public final boolean m11531c() throws IOException {
        if (this.f25228d.needsInput()) {
            m11530g();
            if (this.f25228d.getRemaining() == 0) {
                if (this.f25227c.mo11491l()) {
                    return true;
                }
                C11166o c11166o = this.f25227c.mo11496d().f25205c;
                int i = c11166o.f25246c;
                int i2 = c11166o.f25245b;
                int i3 = i - i2;
                this.f25229e = i3;
                this.f25228d.setInput(c11166o.f25244a, i2, i3);
                return false;
            }
            throw new IllegalStateException("?");
        }
        return false;
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25230f) {
            return;
        }
        this.f25228d.end();
        this.f25230f = true;
        this.f25227c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        m11530g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r1.f25245b != r1.f25246c) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r7.f25205c = r1.m11480b();
        p425j.p429b.p433b.C11167p.m11474a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return -1;
     */
    @Override // p425j.p429b.p433b.InterfaceC11170s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(p425j.p429b.p433b.C11146c r7, long r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L7a
            boolean r2 = r6.f25230f
            if (r2 != 0) goto L72
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            return r0
        Lf:
            boolean r0 = r6.m11531c()
            r1 = 1
            j.b.b.o r1 = r7.m11574U0(r1)     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = r1.f25246c     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L6b
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.util.zip.DataFormatException -> L6b
            int r3 = (int) r2     // Catch: java.util.zip.DataFormatException -> L6b
            java.util.zip.Inflater r2 = r6.f25228d     // Catch: java.util.zip.DataFormatException -> L6b
            byte[] r4 = r1.f25244a     // Catch: java.util.zip.DataFormatException -> L6b
            int r5 = r1.f25246c     // Catch: java.util.zip.DataFormatException -> L6b
            int r2 = r2.inflate(r4, r5, r3)     // Catch: java.util.zip.DataFormatException -> L6b
            if (r2 <= 0) goto L3a
            int r8 = r1.f25246c     // Catch: java.util.zip.DataFormatException -> L6b
            int r8 = r8 + r2
            r1.f25246c = r8     // Catch: java.util.zip.DataFormatException -> L6b
            long r8 = r7.f25206d     // Catch: java.util.zip.DataFormatException -> L6b
            long r0 = (long) r2     // Catch: java.util.zip.DataFormatException -> L6b
            long r8 = r8 + r0
            r7.f25206d = r8     // Catch: java.util.zip.DataFormatException -> L6b
            return r0
        L3a:
            java.util.zip.Inflater r2 = r6.f25228d     // Catch: java.util.zip.DataFormatException -> L6b
            boolean r2 = r2.finished()     // Catch: java.util.zip.DataFormatException -> L6b
            if (r2 != 0) goto L56
            java.util.zip.Inflater r2 = r6.f25228d     // Catch: java.util.zip.DataFormatException -> L6b
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
            r6.m11530g()     // Catch: java.util.zip.DataFormatException -> L6b
            int r8 = r1.f25245b     // Catch: java.util.zip.DataFormatException -> L6b
            int r9 = r1.f25246c     // Catch: java.util.zip.DataFormatException -> L6b
            if (r8 != r9) goto L68
            j.b.b.o r8 = r1.m11480b()     // Catch: java.util.zip.DataFormatException -> L6b
            r7.f25205c = r8     // Catch: java.util.zip.DataFormatException -> L6b
            p425j.p429b.p433b.C11167p.m11474a(r1)     // Catch: java.util.zip.DataFormatException -> L6b
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
        throw new UnsupportedOperationException("Method not decompiled: p425j.p429b.p433b.C11157k.read(j.b.b.c, long):long");
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public C11171t timeout() {
        return this.f25227c.timeout();
    }
}
