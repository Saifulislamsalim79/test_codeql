package p425j.p429b.p433b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Okio.java */
/* renamed from: j.b.b.l */
/* loaded from: classes3.dex */
public final class C11158l {

    /* renamed from: a */
    static final Logger f25231a = Logger.getLogger(C11158l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: j.b.b.l$a */
    /* loaded from: classes3.dex */
    public final class C11159a implements InterfaceC11169r {

        /* renamed from: c */
        final /* synthetic */ C11171t f25232c;

        /* renamed from: d */
        final /* synthetic */ OutputStream f25233d;

        C11159a(C11171t c11171t, OutputStream outputStream) {
            this.f25232c = c11171t;
            this.f25233d = outputStream;
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f25233d.close();
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
        public void flush() throws IOException {
            this.f25233d.flush();
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public C11171t timeout() {
            return this.f25232c;
        }

        public String toString() {
            return "sink(" + this.f25233d + ")";
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public void write(C11146c c11146c, long j) throws IOException {
            C11173u.m11454b(c11146c.f25206d, 0L, j);
            while (j > 0) {
                this.f25232c.throwIfReached();
                C11166o c11166o = c11146c.f25205c;
                int min = (int) Math.min(j, c11166o.f25246c - c11166o.f25245b);
                this.f25233d.write(c11166o.f25244a, c11166o.f25245b, min);
                int i = c11166o.f25245b + min;
                c11166o.f25245b = i;
                long j2 = min;
                j -= j2;
                c11146c.f25206d -= j2;
                if (i == c11166o.f25246c) {
                    c11146c.f25205c = c11166o.m11480b();
                    C11167p.m11474a(c11166o);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: j.b.b.l$b */
    /* loaded from: classes3.dex */
    public final class C11160b implements InterfaceC11170s {

        /* renamed from: c */
        final /* synthetic */ C11171t f25234c;

        /* renamed from: d */
        final /* synthetic */ InputStream f25235d;

        C11160b(C11171t c11171t, InputStream inputStream) {
            this.f25234c = c11171t;
            this.f25235d = inputStream;
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f25235d.close();
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s
        public long read(C11146c c11146c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0L;
            } else {
                try {
                    this.f25234c.throwIfReached();
                    C11166o m11574U0 = c11146c.m11574U0(1);
                    int read = this.f25235d.read(m11574U0.f25244a, m11574U0.f25246c, (int) Math.min(j, 8192 - m11574U0.f25246c));
                    if (read == -1) {
                        return -1L;
                    }
                    m11574U0.f25246c += read;
                    long j2 = read;
                    c11146c.f25206d += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C11158l.m11525e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s
        public C11171t timeout() {
            return this.f25234c;
        }

        public String toString() {
            return "source(" + this.f25235d + ")";
        }
    }

    /* compiled from: Okio.java */
    /* renamed from: j.b.b.l$c */
    /* loaded from: classes3.dex */
    final class C11161c implements InterfaceC11169r {
        C11161c() {
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public C11171t timeout() {
            return C11171t.NONE;
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public void write(C11146c c11146c, long j) throws IOException {
            c11146c.mo11499a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: j.b.b.l$d */
    /* loaded from: classes3.dex */
    public final class C11162d extends C11141a {

        /* renamed from: a */
        final /* synthetic */ Socket f25236a;

        C11162d(Socket socket) {
            this.f25236a = socket;
        }

        @Override // p425j.p429b.p433b.C11141a
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p425j.p429b.p433b.C11141a
        protected void timedOut() {
            try {
                this.f25236a.close();
            } catch (AssertionError e) {
                if (C11158l.m11525e(e)) {
                    Logger logger = C11158l.f25231a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + this.f25236a, (Throwable) e);
                    return;
                }
                throw e;
            } catch (Exception e2) {
                Logger logger2 = C11158l.f25231a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f25236a, (Throwable) e2);
            }
        }
    }

    private C11158l() {
    }

    /* renamed from: a */
    public static InterfaceC11169r m11529a(File file) throws FileNotFoundException {
        if (file != null) {
            return m11523g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static InterfaceC11169r m11528b() {
        return new C11161c();
    }

    /* renamed from: c */
    public static InterfaceC11150d m11527c(InterfaceC11169r interfaceC11169r) {
        return new C11163m(interfaceC11169r);
    }

    /* renamed from: d */
    public static InterfaceC11151e m11526d(InterfaceC11170s interfaceC11170s) {
        return new C11164n(interfaceC11170s);
    }

    /* renamed from: e */
    static boolean m11525e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static InterfaceC11169r m11524f(File file) throws FileNotFoundException {
        if (file != null) {
            return m11523g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static InterfaceC11169r m11523g(OutputStream outputStream) {
        return m11522h(outputStream, new C11171t());
    }

    /* renamed from: h */
    private static InterfaceC11169r m11522h(OutputStream outputStream, C11171t c11171t) {
        if (outputStream != null) {
            if (c11171t != null) {
                return new C11159a(c11171t, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: i */
    public static InterfaceC11169r m11521i(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                C11141a m11516n = m11516n(socket);
                return m11516n.sink(m11522h(socket.getOutputStream(), m11516n));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: j */
    public static InterfaceC11170s m11520j(File file) throws FileNotFoundException {
        if (file != null) {
            return m11519k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static InterfaceC11170s m11519k(InputStream inputStream) {
        return m11518l(inputStream, new C11171t());
    }

    /* renamed from: l */
    private static InterfaceC11170s m11518l(InputStream inputStream, C11171t c11171t) {
        if (inputStream != null) {
            if (c11171t != null) {
                return new C11160b(c11171t, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: m */
    public static InterfaceC11170s m11517m(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                C11141a m11516n = m11516n(socket);
                return m11516n.source(m11518l(socket.getInputStream(), m11516n));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: n */
    private static C11141a m11516n(Socket socket) {
        return new C11162d(socket);
    }
}
