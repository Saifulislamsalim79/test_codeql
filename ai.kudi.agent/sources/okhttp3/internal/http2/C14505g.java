package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C14484c;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14366t;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Http2Reader.java */
/* renamed from: okhttp3.internal.http2.g */
/* loaded from: classes3.dex */
public final class C14505g implements Closeable {

    /* renamed from: w */
    static final Logger f32008w = Logger.getLogger(C14487d.class.getName());

    /* renamed from: c */
    private final InterfaceC14346e f32009c;

    /* renamed from: d */
    private final C14506a f32010d;

    /* renamed from: e */
    private final boolean f32011e;

    /* renamed from: f */
    final C14484c.C14485a f32012f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Reader.java */
    /* renamed from: okhttp3.internal.http2.g$a */
    /* loaded from: classes3.dex */
    public static final class C14506a implements InterfaceC14365s {

        /* renamed from: c */
        private final InterfaceC14346e f32013c;

        /* renamed from: d */
        int f32014d;

        /* renamed from: e */
        byte f32015e;

        /* renamed from: f */
        int f32016f;

        /* renamed from: w */
        int f32017w;

        /* renamed from: x */
        short f32018x;

        C14506a(InterfaceC14346e interfaceC14346e) {
            this.f32013c = interfaceC14346e;
        }

        /* renamed from: c */
        private void m1471c() throws IOException {
            int i = this.f32016f;
            int m1482P = C14505g.m1482P(this.f32013c);
            this.f32017w = m1482P;
            this.f32014d = m1482P;
            byte readByte = (byte) (this.f32013c.readByte() & 255);
            this.f32015e = (byte) (this.f32013c.readByte() & 255);
            if (C14505g.f32008w.isLoggable(Level.FINE)) {
                C14505g.f32008w.fine(C14487d.m1530b(true, this.f32016f, this.f32014d, readByte, this.f32015e));
            }
            int readInt = this.f32013c.readInt() & Integer.MAX_VALUE;
            this.f32016f = readInt;
            if (readByte != 9) {
                C14487d.m1528d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt == i) {
            } else {
                C14487d.m1528d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            while (true) {
                int i = this.f32017w;
                if (i == 0) {
                    this.f32013c.mo1994a(this.f32018x);
                    this.f32018x = (short) 0;
                    if ((this.f32015e & 4) != 0) {
                        return -1L;
                    }
                    m1471c();
                } else {
                    long mo312O0 = this.f32013c.mo312O0(c14342c, Math.min(j, i));
                    if (mo312O0 == -1) {
                        return -1L;
                    }
                    this.f32017w = (int) (this.f32017w - mo312O0);
                    return mo312O0;
                }
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return this.f32013c.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Reader.java */
    /* renamed from: okhttp3.internal.http2.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14507b {
        /* renamed from: a */
        void mo1470a(boolean z, int i, InterfaceC14346e interfaceC14346e, int i2) throws IOException;

        void ackSettings();

        /* renamed from: b */
        void mo1469b(boolean z, C14517l c14517l);

        /* renamed from: c */
        void mo1468c(int i, EnumC14481a enumC14481a);

        /* renamed from: d */
        void mo1467d(int i, EnumC14481a enumC14481a, C14347f c14347f);

        void headers(boolean z, int i, int i2, List<C14482b> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<C14482b> list) throws IOException;

        void windowUpdate(int i, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14505g(InterfaceC14346e interfaceC14346e, boolean z) {
        this.f32009c = interfaceC14346e;
        this.f32011e = z;
        C14506a c14506a = new C14506a(interfaceC14346e);
        this.f32010d = c14506a;
        this.f32012f = new C14484c.C14485a(4096, c14506a);
    }

    /* renamed from: F */
    private void m1486F(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            C14487d.m1528d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        if (!((b & 32) != 0)) {
            short readByte = (b & 8) != 0 ? (short) (this.f32009c.readByte() & 255) : (short) 0;
            interfaceC14507b.mo1470a(z, i2, this.f32009c, m1477c(i, b, readByte));
            this.f32009c.mo1994a(readByte);
            return;
        }
        C14487d.m1528d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        throw null;
    }

    /* renamed from: I */
    private void m1485I(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            C14487d.m1528d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f32009c.readInt();
            int readInt2 = this.f32009c.readInt();
            int i3 = i - 8;
            EnumC14481a m1560a = EnumC14481a.m1560a(readInt2);
            if (m1560a == null) {
                C14487d.m1528d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            C14347f c14347f = C14347f.f31623w;
            if (i3 > 0) {
                c14347f = this.f32009c.mo1990f(i3);
            }
            interfaceC14507b.mo1467d(readInt, m1560a, c14347f);
        } else {
            C14487d.m1528d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: J */
    private List<C14482b> m1484J(int i, short s, byte b, int i2) throws IOException {
        C14506a c14506a = this.f32010d;
        c14506a.f32017w = i;
        c14506a.f32014d = i;
        c14506a.f32018x = s;
        c14506a.f32015e = b;
        c14506a.f32016f = i2;
        this.f32012f.m1546k();
        return this.f32012f.m1552e();
    }

    /* renamed from: O */
    private void m1483O(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            short readByte = (b & 8) != 0 ? (short) (this.f32009c.readByte() & 255) : (short) 0;
            if ((b & 32) != 0) {
                m1480X(interfaceC14507b, i2);
                i -= 5;
            }
            interfaceC14507b.headers(z, i2, -1, m1484J(m1477c(i, b, readByte), readByte, b, i2));
            return;
        }
        C14487d.m1528d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: P */
    static int m1482P(InterfaceC14346e interfaceC14346e) throws IOException {
        return (interfaceC14346e.readByte() & 255) | ((interfaceC14346e.readByte() & 255) << 16) | ((interfaceC14346e.readByte() & 255) << 8);
    }

    /* renamed from: V */
    private void m1481V(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            C14487d.m1528d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            interfaceC14507b.ping((b & 1) != 0, this.f32009c.readInt(), this.f32009c.readInt());
        } else {
            C14487d.m1528d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: X */
    private void m1480X(InterfaceC14507b interfaceC14507b, int i) throws IOException {
        int readInt = this.f32009c.readInt();
        interfaceC14507b.priority(i, readInt & Integer.MAX_VALUE, (this.f32009c.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: Z */
    private void m1479Z(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            C14487d.m1528d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            m1480X(interfaceC14507b, i2);
        } else {
            C14487d.m1528d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: b0 */
    private void m1478b0(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            short readByte = (b & 8) != 0 ? (short) (this.f32009c.readByte() & 255) : (short) 0;
            interfaceC14507b.pushPromise(i2, this.f32009c.readInt() & Integer.MAX_VALUE, m1484J(m1477c(i - 4, b, readByte), readByte, b, i2));
            return;
        }
        C14487d.m1528d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: c */
    static int m1477c(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C14487d.m1528d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* renamed from: f0 */
    private void m1476f0(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            C14487d.m1528d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f32009c.readInt();
            EnumC14481a m1560a = EnumC14481a.m1560a(readInt);
            if (m1560a != null) {
                interfaceC14507b.mo1468c(i2, m1560a);
            } else {
                C14487d.m1528d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                throw null;
            }
        } else {
            C14487d.m1528d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: g0 */
    private void m1474g0(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            C14487d.m1528d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b & 1) != 0) {
            if (i == 0) {
                interfaceC14507b.ackSettings();
            } else {
                C14487d.m1528d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i % 6 != 0) {
            C14487d.m1528d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        } else {
            C14517l c14517l = new C14517l();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int readShort = this.f32009c.readShort() & 65535;
                int readInt = this.f32009c.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            C14487d.m1528d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        C14487d.m1528d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    C14487d.m1528d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                c14517l.m1410i(readShort, readInt);
            }
            interfaceC14507b.mo1469b(false, c14517l);
        }
    }

    /* renamed from: i0 */
    private void m1473i0(InterfaceC14507b interfaceC14507b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            C14487d.m1528d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.f32009c.readInt() & 2147483647L;
        if (readInt != 0) {
            interfaceC14507b.windowUpdate(i2, readInt);
        } else {
            C14487d.m1528d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32009c.close();
    }

    /* renamed from: g */
    public boolean m1475g(boolean z, InterfaceC14507b interfaceC14507b) throws IOException {
        try {
            this.f32009c.mo1978z(9L);
            int m1482P = m1482P(this.f32009c);
            if (m1482P < 0 || m1482P > 16384) {
                C14487d.m1528d("FRAME_SIZE_ERROR: %s", Integer.valueOf(m1482P));
                throw null;
            }
            byte readByte = (byte) (this.f32009c.readByte() & 255);
            if (z && readByte != 4) {
                C14487d.m1528d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f32009c.readByte() & 255);
            int readInt = this.f32009c.readInt() & Integer.MAX_VALUE;
            if (f32008w.isLoggable(Level.FINE)) {
                f32008w.fine(C14487d.m1530b(true, readInt, m1482P, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    m1486F(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 1:
                    m1483O(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 2:
                    m1479Z(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 3:
                    m1476f0(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 4:
                    m1474g0(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 5:
                    m1478b0(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 6:
                    m1481V(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 7:
                    m1485I(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                case 8:
                    m1473i0(interfaceC14507b, m1482P, readByte2, readInt);
                    break;
                default:
                    this.f32009c.mo1994a(m1482P);
                    break;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public void m1472m(InterfaceC14507b interfaceC14507b) throws IOException {
        if (this.f32011e) {
            if (m1475g(true, interfaceC14507b)) {
                return;
            }
            C14487d.m1528d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        C14347f mo1990f = this.f32009c.mo1990f(C14487d.f31932a.mo1969A());
        if (f32008w.isLoggable(Level.FINE)) {
            f32008w.fine(C14148c.m2790r("<< CONNECTION %s", mo1990f.mo1959p()));
        }
        if (C14487d.f31932a.equals(mo1990f)) {
            return;
        }
        C14487d.m1528d("Expected a connection header but was %s", mo1990f.mo1965M());
        throw null;
    }
}
