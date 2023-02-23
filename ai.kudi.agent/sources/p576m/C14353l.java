package p576m;

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
/* renamed from: m.l */
/* loaded from: classes3.dex */
public final class C14353l {

    /* renamed from: a */
    static final Logger f31639a = Logger.getLogger(C14353l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: m.l$a */
    /* loaded from: classes3.dex */
    public final class C14354a implements InterfaceC14364r {

        /* renamed from: c */
        final /* synthetic */ C14366t f31640c;

        /* renamed from: d */
        final /* synthetic */ OutputStream f31641d;

        C14354a(C14366t c14366t, OutputStream outputStream) {
            this.f31640c = c14366t;
            this.f31641d = outputStream;
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31641d.close();
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public void flush() throws IOException {
            this.f31641d.flush();
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            C14368u.m1944b(c14342c.f31619d, 0L, j);
            while (j > 0) {
                this.f31640c.mo1947f();
                C14361o c14361o = c14342c.f31618c;
                int min = (int) Math.min(j, c14361o.f31654c - c14361o.f31653b);
                this.f31641d.write(c14361o.f31652a, c14361o.f31653b, min);
                int i = c14361o.f31653b + min;
                c14361o.f31653b = i;
                long j2 = min;
                j -= j2;
                c14342c.f31619d -= j2;
                if (i == c14361o.f31654c) {
                    c14342c.f31618c = c14361o.m1976b();
                    C14362p.m1971a(c14361o);
                }
            }
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return this.f31640c;
        }

        public String toString() {
            return "sink(" + this.f31641d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: m.l$b */
    /* loaded from: classes3.dex */
    public final class C14355b implements InterfaceC14365s {

        /* renamed from: c */
        final /* synthetic */ C14366t f31642c;

        /* renamed from: d */
        final /* synthetic */ InputStream f31643d;

        C14355b(C14366t c14366t, InputStream inputStream) {
            this.f31642c = c14366t;
            this.f31643d = inputStream;
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0L;
            } else {
                try {
                    this.f31642c.mo1947f();
                    C14361o m2068K0 = c14342c.m2068K0(1);
                    int read = this.f31643d.read(m2068K0.f31652a, m2068K0.f31654c, (int) Math.min(j, 8192 - m2068K0.f31654c));
                    if (read == -1) {
                        if (m2068K0.f31653b == m2068K0.f31654c) {
                            c14342c.f31618c = m2068K0.m1976b();
                            C14362p.m1971a(m2068K0);
                            return -1L;
                        }
                        return -1L;
                    }
                    m2068K0.f31654c += read;
                    long j2 = read;
                    c14342c.f31619d += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C14353l.m2020e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31643d.close();
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return this.f31642c;
        }

        public String toString() {
            return "source(" + this.f31643d + ")";
        }
    }

    /* compiled from: Okio.java */
    /* renamed from: m.l$c */
    /* loaded from: classes3.dex */
    final class C14356c implements InterfaceC14364r {
        C14356c() {
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            c14342c.mo1994a(j);
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return C14366t.f31663d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* renamed from: m.l$d */
    /* loaded from: classes3.dex */
    public final class C14357d extends C14337a {

        /* renamed from: k */
        final /* synthetic */ Socket f31644k;

        C14357d(Socket socket) {
            this.f31644k = socket;
        }

        @Override // p576m.C14337a
        /* renamed from: o */
        protected IOException mo1441o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p576m.C14337a
        /* renamed from: t */
        protected void mo1440t() {
            try {
                this.f31644k.close();
            } catch (AssertionError e) {
                if (C14353l.m2020e(e)) {
                    Logger logger = C14353l.f31639a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + this.f31644k, (Throwable) e);
                    return;
                }
                throw e;
            } catch (Exception e2) {
                Logger logger2 = C14353l.f31639a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f31644k, (Throwable) e2);
            }
        }
    }

    private C14353l() {
    }

    /* renamed from: a */
    public static InterfaceC14364r m2024a(File file) throws FileNotFoundException {
        if (file != null) {
            return m2018g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static InterfaceC14364r m2023b() {
        return new C14356c();
    }

    /* renamed from: c */
    public static InterfaceC14345d m2022c(InterfaceC14364r interfaceC14364r) {
        return new C14358m(interfaceC14364r);
    }

    /* renamed from: d */
    public static InterfaceC14346e m2021d(InterfaceC14365s interfaceC14365s) {
        return new C14359n(interfaceC14365s);
    }

    /* renamed from: e */
    static boolean m2020e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static InterfaceC14364r m2019f(File file) throws FileNotFoundException {
        if (file != null) {
            return m2018g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static InterfaceC14364r m2018g(OutputStream outputStream) {
        return m2017h(outputStream, new C14366t());
    }

    /* renamed from: h */
    private static InterfaceC14364r m2017h(OutputStream outputStream, C14366t c14366t) {
        if (outputStream != null) {
            if (c14366t != null) {
                return new C14354a(c14366t, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: i */
    public static InterfaceC14364r m2016i(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                C14337a m2011n = m2011n(socket);
                return m2011n.m2080r(m2017h(socket.getOutputStream(), m2011n));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: j */
    public static InterfaceC14365s m2015j(File file) throws FileNotFoundException {
        if (file != null) {
            return m2014k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static InterfaceC14365s m2014k(InputStream inputStream) {
        return m2013l(inputStream, new C14366t());
    }

    /* renamed from: l */
    private static InterfaceC14365s m2013l(InputStream inputStream, C14366t c14366t) {
        if (inputStream != null) {
            if (c14366t != null) {
                return new C14355b(c14366t, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: m */
    public static InterfaceC14365s m2012m(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                C14337a m2011n = m2011n(socket);
                return m2011n.m2079s(m2013l(socket.getInputStream(), m2011n));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: n */
    private static C14337a m2011n(Socket socket) {
        return new C14357d(socket);
    }
}
