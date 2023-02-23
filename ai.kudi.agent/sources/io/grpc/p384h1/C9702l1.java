package io.grpc.p384h1;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import com.google.common.base.C5051n;
import io.grpc.C9497c1;
import io.grpc.InterfaceC10014m;
import io.grpc.InterfaceC10080v;
import io.grpc.p384h1.InterfaceC9695k2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
/* compiled from: MessageDeframer.java */
/* renamed from: io.grpc.h1.l1 */
/* loaded from: classes2.dex */
public class C9702l1 implements Closeable, InterfaceC9813y {

    /* renamed from: C */
    private boolean f22763C;

    /* renamed from: D */
    private C9784u f22764D;

    /* renamed from: F */
    private long f22766F;

    /* renamed from: I */
    private int f22769I;

    /* renamed from: c */
    private InterfaceC9704b f22772c;

    /* renamed from: d */
    private int f22773d;

    /* renamed from: e */
    private final C9676i2 f22774e;

    /* renamed from: f */
    private final C9730o2 f22775f;

    /* renamed from: w */
    private InterfaceC10080v f22776w;

    /* renamed from: x */
    private C9775s0 f22777x;

    /* renamed from: y */
    private byte[] f22778y;

    /* renamed from: z */
    private int f22779z;

    /* renamed from: A */
    private EnumC9707e f22761A = EnumC9707e.HEADER;

    /* renamed from: B */
    private int f22762B = 5;

    /* renamed from: E */
    private C9784u f22765E = new C9784u();

    /* renamed from: G */
    private boolean f22767G = false;

    /* renamed from: H */
    private int f22768H = -1;

    /* renamed from: J */
    private boolean f22770J = false;

    /* renamed from: K */
    private volatile boolean f22771K = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MessageDeframer.java */
    /* renamed from: io.grpc.h1.l1$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9703a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22780a;

        static {
            int[] iArr = new int[EnumC9707e.values().length];
            f22780a = iArr;
            try {
                iArr[EnumC9707e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22780a[EnumC9707e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: MessageDeframer.java */
    /* renamed from: io.grpc.h1.l1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9704b {
        /* renamed from: a */
        void mo14161a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a);

        /* renamed from: b */
        void mo13677b(boolean z);

        /* renamed from: c */
        void mo13675c(int i);

        /* renamed from: d */
        void mo13673d(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessageDeframer.java */
    /* renamed from: io.grpc.h1.l1$c */
    /* loaded from: classes2.dex */
    public static class C9705c implements InterfaceC9695k2.InterfaceC9696a {

        /* renamed from: c */
        private InputStream f22781c;

        /* synthetic */ C9705c(InputStream inputStream, C9703a c9703a) {
            this(inputStream);
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2.InterfaceC9696a
        public InputStream next() {
            InputStream inputStream = this.f22781c;
            this.f22781c = null;
            return inputStream;
        }

        private C9705c(InputStream inputStream) {
            this.f22781c = inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessageDeframer.java */
    /* renamed from: io.grpc.h1.l1$e */
    /* loaded from: classes2.dex */
    public enum EnumC9707e {
        HEADER,
        BODY
    }

    public C9702l1(InterfaceC9704b interfaceC9704b, InterfaceC10080v interfaceC10080v, int i, C9676i2 c9676i2, C9730o2 c9730o2) {
        C5051n.m25779o(interfaceC9704b, "sink");
        this.f22772c = interfaceC9704b;
        C5051n.m25779o(interfaceC10080v, "decompressor");
        this.f22776w = interfaceC10080v;
        this.f22773d = i;
        C5051n.m25779o(c9676i2, "statsTraceCtx");
        this.f22774e = c9676i2;
        C5051n.m25779o(c9730o2, "transportTracer");
        this.f22775f = c9730o2;
    }

    /* renamed from: J */
    private void m14172J() {
        if (this.f22767G) {
            return;
        }
        this.f22767G = true;
        while (true) {
            try {
                if (this.f22771K || this.f22766F <= 0 || !m14165f0()) {
                    break;
                }
                int i = C9703a.f22780a[this.f22761A.ordinal()];
                if (i == 1) {
                    m14166b0();
                } else if (i == 2) {
                    m14167Z();
                    this.f22766F--;
                } else {
                    throw new AssertionError("Invalid state: " + this.f22761A);
                }
            } finally {
                this.f22767G = false;
            }
        }
        if (this.f22771K) {
            close();
            return;
        }
        if (this.f22770J && m14168X()) {
            close();
        }
    }

    /* renamed from: O */
    private InputStream m14171O() {
        InterfaceC10080v interfaceC10080v = this.f22776w;
        if (interfaceC10080v != InterfaceC10014m.C10016b.f23740a) {
            try {
                return new C9706d(interfaceC10080v.mo13105b(C9806w1.m13945c(this.f22764D, true)), this.f22773d, this.f22774e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw C9497c1.f22194m.m14578r("Can't decode compressed gRPC message as compression not configured").m14592d();
    }

    /* renamed from: P */
    private InputStream m14170P() {
        this.f22774e.m14214f(this.f22764D.mo13566h());
        return C9806w1.m13945c(this.f22764D, true);
    }

    /* renamed from: V */
    private boolean m14169V() {
        return isClosed() || this.f22770J;
    }

    /* renamed from: X */
    private boolean m14168X() {
        C9775s0 c9775s0 = this.f22777x;
        if (c9775s0 != null) {
            return c9775s0.m14013k0();
        }
        return this.f22765E.mo13566h() == 0;
    }

    /* renamed from: Z */
    private void m14167Z() {
        this.f22774e.m14215e(this.f22768H, this.f22769I, -1L);
        this.f22769I = 0;
        InputStream m14171O = this.f22763C ? m14171O() : m14170P();
        this.f22764D = null;
        this.f22772c.mo14161a(new C9705c(m14171O, null));
        this.f22761A = EnumC9707e.HEADER;
        this.f22762B = 5;
    }

    /* renamed from: b0 */
    private void m14166b0() {
        int readUnsignedByte = this.f22764D.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.f22763C = (readUnsignedByte & 1) != 0;
            int readInt = this.f22764D.readInt();
            this.f22762B = readInt;
            if (readInt >= 0 && readInt <= this.f22773d) {
                int i = this.f22768H + 1;
                this.f22768H = i;
                this.f22774e.m14216d(i);
                this.f22775f.m14113d();
                this.f22761A = EnumC9707e.BODY;
                return;
            }
            throw C9497c1.f22193l.m14578r(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f22773d), Integer.valueOf(this.f22762B))).m14592d();
        }
        throw C9497c1.f22194m.m14578r("gRPC frame header malformed: reserved bits not zero").m14592d();
    }

    /* renamed from: f0 */
    private boolean m14165f0() {
        int i;
        int i2 = 0;
        try {
            if (this.f22764D == null) {
                this.f22764D = new C9784u();
            }
            int i3 = 0;
            i = 0;
            while (true) {
                try {
                    int mo13566h = this.f22762B - this.f22764D.mo13566h();
                    if (mo13566h <= 0) {
                        if (i3 > 0) {
                            this.f22772c.mo13675c(i3);
                            if (this.f22761A == EnumC9707e.BODY) {
                                if (this.f22777x != null) {
                                    this.f22774e.m14213g(i);
                                    this.f22769I += i;
                                } else {
                                    this.f22774e.m14213g(i3);
                                    this.f22769I += i3;
                                }
                            }
                        }
                        return true;
                    } else if (this.f22777x != null) {
                        try {
                            try {
                                if (this.f22778y == null || this.f22779z == this.f22778y.length) {
                                    this.f22778y = new byte[Math.min(mo13566h, 2097152)];
                                    this.f22779z = 0;
                                }
                                int m14015g0 = this.f22777x.m14015g0(this.f22778y, this.f22779z, Math.min(mo13566h, this.f22778y.length - this.f22779z));
                                i3 += this.f22777x.m14021X();
                                i += this.f22777x.m14020Z();
                                if (m14015g0 == 0) {
                                    if (i3 > 0) {
                                        this.f22772c.mo13675c(i3);
                                        if (this.f22761A == EnumC9707e.BODY) {
                                            if (this.f22777x != null) {
                                                this.f22774e.m14213g(i);
                                                this.f22769I += i;
                                            } else {
                                                this.f22774e.m14213g(i3);
                                                this.f22769I += i3;
                                            }
                                        }
                                    }
                                    return false;
                                }
                                this.f22764D.m13982g(C9806w1.m13942f(this.f22778y, this.f22779z, m14015g0));
                                this.f22779z += m14015g0;
                            } catch (DataFormatException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (this.f22765E.mo13566h() == 0) {
                        if (i3 > 0) {
                            this.f22772c.mo13675c(i3);
                            if (this.f22761A == EnumC9707e.BODY) {
                                if (this.f22777x != null) {
                                    this.f22774e.m14213g(i);
                                    this.f22769I += i;
                                } else {
                                    this.f22774e.m14213g(i3);
                                    this.f22769I += i3;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(mo13566h, this.f22765E.mo13566h());
                        i3 += min;
                        this.f22764D.m13982g(this.f22765E.mo13570M(min));
                    }
                } catch (Throwable th) {
                    int i4 = i3;
                    th = th;
                    i2 = i4;
                    if (i2 > 0) {
                        this.f22772c.mo13675c(i2);
                        if (this.f22761A == EnumC9707e.BODY) {
                            if (this.f22777x != null) {
                                this.f22774e.m14213g(i);
                                this.f22769I += i;
                            } else {
                                this.f22774e.m14213g(i2);
                                this.f22769I += i2;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: F */
    public void mo13935F(InterfaceC10080v interfaceC10080v) {
        C5051n.m25773u(this.f22777x == null, "Already set full stream decompressor");
        C5051n.m25779o(interfaceC10080v, "Can't pass an empty decompressor");
        this.f22776w = interfaceC10080v;
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: I */
    public void mo13934I(InterfaceC9802v1 interfaceC9802v1) {
        C5051n.m25779o(interfaceC9802v1, TransactionBreakDownItemType.DATA);
        boolean z = true;
        try {
            if (!m14169V()) {
                if (this.f22777x != null) {
                    this.f22777x.m14023P(interfaceC9802v1);
                } else {
                    this.f22765E.m13982g(interfaceC9802v1);
                }
                z = false;
                m14172J();
            }
        } finally {
            if (z) {
                interfaceC9802v1.close();
            }
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: c */
    public void mo13933c(int i) {
        C5051n.m25789e(i > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f22766F += i;
        m14172J();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.p384h1.InterfaceC9813y
    public void close() {
        if (isClosed()) {
            return;
        }
        C9784u c9784u = this.f22764D;
        boolean z = true;
        boolean z2 = c9784u != null && c9784u.mo13566h() > 0;
        try {
            if (this.f22777x != null) {
                if (!z2 && !this.f22777x.m14019b0()) {
                    z = false;
                }
                this.f22777x.close();
                z2 = z;
            }
            if (this.f22765E != null) {
                this.f22765E.close();
            }
            if (this.f22764D != null) {
                this.f22764D.close();
            }
            this.f22777x = null;
            this.f22765E = null;
            this.f22764D = null;
            this.f22772c.mo13677b(z2);
        } catch (Throwable th) {
            this.f22777x = null;
            this.f22765E = null;
            this.f22764D = null;
            throw th;
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: g */
    public void mo13932g(int i) {
        this.f22773d = i;
    }

    /* renamed from: g0 */
    public void m14164g0(C9775s0 c9775s0) {
        C5051n.m25773u(this.f22776w == InterfaceC10014m.C10016b.f23740a, "per-message decompressor already set");
        C5051n.m25773u(this.f22777x == null, "full stream decompressor already set");
        C5051n.m25779o(c9775s0, "Can't pass a null full stream decompressor");
        this.f22777x = c9775s0;
        this.f22765E = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void m14163i0(InterfaceC9704b interfaceC9704b) {
        this.f22772c = interfaceC9704b;
    }

    public boolean isClosed() {
        return this.f22765E == null && this.f22777x == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void m14162k0() {
        this.f22771K = true;
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: m */
    public void mo13931m() {
        if (isClosed()) {
            return;
        }
        if (m14168X()) {
            close();
        } else {
            this.f22770J = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MessageDeframer.java */
    /* renamed from: io.grpc.h1.l1$d */
    /* loaded from: classes2.dex */
    public static final class C9706d extends FilterInputStream {

        /* renamed from: c */
        private final int f22782c;

        /* renamed from: d */
        private final C9676i2 f22783d;

        /* renamed from: e */
        private long f22784e;

        /* renamed from: f */
        private long f22785f;

        /* renamed from: w */
        private long f22786w;

        C9706d(InputStream inputStream, int i, C9676i2 c9676i2) {
            super(inputStream);
            this.f22786w = -1L;
            this.f22782c = i;
            this.f22783d = c9676i2;
        }

        /* renamed from: c */
        private void m14160c() {
            long j = this.f22785f;
            long j2 = this.f22784e;
            if (j > j2) {
                this.f22783d.m14214f(j - j2);
                this.f22784e = this.f22785f;
            }
        }

        /* renamed from: g */
        private void m14159g() {
            long j = this.f22785f;
            int i = this.f22782c;
            if (j > i) {
                throw C9497c1.f22193l.m14578r(String.format("Decompressed gRPC message exceeds maximum size %d", Integer.valueOf(i))).m14592d();
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f22786w = this.f22785f;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f22785f++;
            }
            m14159g();
            m14160c();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f22786w != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f22785f = this.f22786w;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(j);
            this.f22785f += skip;
            m14159g();
            m14160c();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read != -1) {
                this.f22785f += read;
            }
            m14159g();
            m14160c();
            return read;
        }
    }
}
