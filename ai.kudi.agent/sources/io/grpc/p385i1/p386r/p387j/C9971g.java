package io.grpc.p385i1.p386r.p387j;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import io.grpc.p385i1.p386r.p387j.C9968f;
import io.grpc.p385i1.p386r.p387j.InterfaceC9963b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14366t;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* compiled from: Http2.java */
/* renamed from: io.grpc.i1.r.j.g */
/* loaded from: classes2.dex */
public final class C9971g implements InterfaceC9979j {

    /* renamed from: a */
    private static final Logger f23661a = Logger.getLogger(C9973b.class.getName());

    /* renamed from: b */
    private static final C14347f f23662b = C14347f.m2035m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2.java */
    /* renamed from: io.grpc.i1.r.j.g$a */
    /* loaded from: classes2.dex */
    public static final class C9972a implements InterfaceC14365s {

        /* renamed from: c */
        private final InterfaceC14346e f23663c;

        /* renamed from: d */
        int f23664d;

        /* renamed from: e */
        byte f23665e;

        /* renamed from: f */
        int f23666f;

        /* renamed from: w */
        int f23667w;

        /* renamed from: x */
        short f23668x;

        public C9972a(InterfaceC14346e interfaceC14346e) {
            this.f23663c = interfaceC14346e;
        }

        /* renamed from: c */
        private void m13420c() throws IOException {
            int i = this.f23666f;
            int m13422m = C9971g.m13422m(this.f23663c);
            this.f23667w = m13422m;
            this.f23664d = m13422m;
            byte readByte = (byte) (this.f23663c.readByte() & 255);
            this.f23665e = (byte) (this.f23663c.readByte() & 255);
            if (C9971g.f23661a.isLoggable(Level.FINE)) {
                C9971g.f23661a.fine(C9973b.m13418b(true, this.f23666f, this.f23664d, readByte, this.f23665e));
            }
            int readInt = this.f23663c.readInt() & Integer.MAX_VALUE;
            this.f23666f = readInt;
            if (readByte != 9) {
                C9971g.m13430e("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                throw null;
            } else if (readInt == i) {
            } else {
                C9971g.m13430e("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            while (true) {
                int i = this.f23667w;
                if (i == 0) {
                    this.f23663c.mo1994a(this.f23668x);
                    this.f23668x = (short) 0;
                    if ((this.f23665e & 4) != 0) {
                        return -1L;
                    }
                    m13420c();
                } else {
                    long mo312O0 = this.f23663c.mo312O0(c14342c, Math.min(j, i));
                    if (mo312O0 == -1) {
                        return -1L;
                    }
                    this.f23667w -= (int) mo312O0;
                    return mo312O0;
                }
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return this.f23663c.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2.java */
    /* renamed from: io.grpc.i1.r.j.g$b */
    /* loaded from: classes2.dex */
    public static final class C9973b {

        /* renamed from: a */
        private static final String[] f23669a = {IssueTypeFragmentNew.DATA, "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f23670b = new String[64];

        /* renamed from: c */
        private static final String[] f23671c = new String[256];

        static {
            int i;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = f23671c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f23670b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                f23670b[iArr[i4] | 8] = f23670b[i] + "|PADDED";
            }
            String[] strArr3 = f23670b;
            strArr3[4] = "END_HEADERS";
            strArr3[32] = "PRIORITY";
            strArr3[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    int i9 = i8 | i6;
                    f23670b[i9] = f23670b[i8] + '|' + f23670b[i6];
                    f23670b[i9 | 8] = f23670b[i8] + '|' + f23670b[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr4 = f23670b;
                if (i2 >= strArr4.length) {
                    return;
                }
                if (strArr4[i2] == null) {
                    strArr4[i2] = f23671c[i2];
                }
                i2++;
            }
        }

        C9973b() {
        }

        /* renamed from: a */
        static String m13419a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : f23671c[b2];
                } else if (b != 7 && b != 8) {
                    String[] strArr = f23670b;
                    String str = b2 < strArr.length ? strArr[b2] : f23671c[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f23671c[b2];
        }

        /* renamed from: b */
        static String m13418b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f23669a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b));
            String m13419a = m13419a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = m13419a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* compiled from: Http2.java */
    /* renamed from: io.grpc.i1.r.j.g$c */
    /* loaded from: classes2.dex */
    static final class C9974c implements InterfaceC9963b {

        /* renamed from: c */
        private final InterfaceC14346e f23672c;

        /* renamed from: d */
        private final C9972a f23673d;

        /* renamed from: e */
        final C9968f.C9969a f23674e;

        C9974c(InterfaceC14346e interfaceC14346e, int i, boolean z) {
            this.f23672c = interfaceC14346e;
            C9972a c9972a = new C9972a(interfaceC14346e);
            this.f23673d = c9972a;
            this.f23674e = new C9968f.C9969a(i, c9972a);
        }

        /* renamed from: F */
        private void m13417F(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                short readByte = (b & 8) != 0 ? (short) (this.f23672c.readByte() & 255) : (short) 0;
                if ((b & 32) != 0) {
                    m13415J(interfaceC9964a, i2);
                    i -= 5;
                }
                interfaceC9964a.mo13464H(false, z, i2, -1, m13406m(C9971g.m13423l(i, b, readByte), readByte, b, i2), EnumC9967e.HTTP_20_HEADERS);
                return;
            }
            C9971g.m13430e("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }

        /* renamed from: I */
        private void m13416I(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i != 8) {
                C9971g.m13430e("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                interfaceC9964a.ping((b & 1) != 0, this.f23672c.readInt(), this.f23672c.readInt());
            } else {
                C9971g.m13430e("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: J */
        private void m13415J(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i) throws IOException {
            int readInt = this.f23672c.readInt();
            interfaceC9964a.priority(i, readInt & Integer.MAX_VALUE, (this.f23672c.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: O */
        private void m13414O(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                C9971g.m13430e("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                m13415J(interfaceC9964a, i2);
            } else {
                C9971g.m13430e("TYPE_PRIORITY streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: P */
        private void m13413P(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                short readByte = (b & 8) != 0 ? (short) (this.f23672c.readByte() & 255) : (short) 0;
                interfaceC9964a.pushPromise(i2, this.f23672c.readInt() & Integer.MAX_VALUE, m13406m(C9971g.m13423l(i - 4, b, readByte), readByte, b, i2));
                return;
            }
            C9971g.m13430e("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }

        /* renamed from: V */
        private void m13411V(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                C9971g.m13430e("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                int readInt = this.f23672c.readInt();
                EnumC9962a m13468a = EnumC9962a.m13468a(readInt);
                if (m13468a != null) {
                    interfaceC9964a.mo13467E(i2, m13468a);
                } else {
                    C9971g.m13430e("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt)});
                    throw null;
                }
            } else {
                C9971g.m13430e("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: X */
        private void m13410X(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                C9971g.m13430e("TYPE_SETTINGS streamId != 0", new Object[0]);
                throw null;
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    interfaceC9964a.ackSettings();
                } else {
                    C9971g.m13430e("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    throw null;
                }
            } else if (i % 6 != 0) {
                C9971g.m13430e("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else {
                C9978i c9978i = new C9978i();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f23672c.readShort();
                    int readInt = this.f23672c.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (readInt != 0 && readInt != 1) {
                                C9971g.m13430e("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                            break;
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                C9971g.m13430e("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                C9971g.m13430e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt)});
                                throw null;
                            }
                            break;
                        default:
                    }
                    c9978i.m13382e(readShort, 0, readInt);
                }
                interfaceC9964a.mo13465G(false, c9978i);
                if (c9978i.m13385b() >= 0) {
                    this.f23674e.m13450g(c9978i.m13385b());
                }
            }
        }

        /* renamed from: Z */
        private void m13409Z(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                C9971g.m13430e("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
            long readInt = this.f23672c.readInt() & 2147483647L;
            if (readInt != 0) {
                interfaceC9964a.windowUpdate(i2, readInt);
            } else {
                C9971g.m13430e("windowSizeIncrement was 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: c */
        private void m13408c(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            boolean z = (b & 1) != 0;
            if (!((b & 32) != 0)) {
                short readByte = (b & 8) != 0 ? (short) (this.f23672c.readByte() & 255) : (short) 0;
                interfaceC9964a.mo13463a(z, i2, this.f23672c, C9971g.m13423l(i, b, readByte));
                this.f23672c.mo1994a(readByte);
                return;
            }
            C9971g.m13430e("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }

        /* renamed from: g */
        private void m13407g(InterfaceC9963b.InterfaceC9964a interfaceC9964a, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                C9971g.m13430e("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                int readInt = this.f23672c.readInt();
                int readInt2 = this.f23672c.readInt();
                int i3 = i - 8;
                EnumC9962a m13468a = EnumC9962a.m13468a(readInt2);
                if (m13468a == null) {
                    C9971g.m13430e("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
                    throw null;
                }
                C14347f c14347f = C14347f.f31623w;
                if (i3 > 0) {
                    c14347f = this.f23672c.mo1990f(i3);
                }
                interfaceC9964a.mo13466F(readInt, m13468a, c14347f);
            } else {
                C9971g.m13430e("TYPE_GOAWAY streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: m */
        private List<C9966d> m13406m(int i, short s, byte b, int i2) throws IOException {
            C9972a c9972a = this.f23673d;
            c9972a.f23667w = i;
            c9972a.f23664d = i;
            c9972a.f23668x = s;
            c9972a.f23665e = b;
            c9972a.f23666f = i2;
            this.f23674e.m13445l();
            return this.f23674e.m13452e();
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b
        /* renamed from: S */
        public boolean mo13412S(InterfaceC9963b.InterfaceC9964a interfaceC9964a) throws IOException {
            try {
                this.f23672c.mo1978z(9L);
                int m13422m = C9971g.m13422m(this.f23672c);
                if (m13422m < 0 || m13422m > 16384) {
                    C9971g.m13430e("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(m13422m)});
                    throw null;
                }
                byte readByte = (byte) (this.f23672c.readByte() & 255);
                byte readByte2 = (byte) (this.f23672c.readByte() & 255);
                int readInt = this.f23672c.readInt() & Integer.MAX_VALUE;
                if (C9971g.f23661a.isLoggable(Level.FINE)) {
                    C9971g.f23661a.fine(C9973b.m13418b(true, readInt, m13422m, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m13408c(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 1:
                        m13417F(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 2:
                        m13414O(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 3:
                        m13411V(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 4:
                        m13410X(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 5:
                        m13413P(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 6:
                        m13416I(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 7:
                        m13407g(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    case 8:
                        m13409Z(interfaceC9964a, m13422m, readByte2, readInt);
                        break;
                    default:
                        this.f23672c.mo1994a(m13422m);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f23672c.close();
        }
    }

    /* compiled from: Http2.java */
    /* renamed from: io.grpc.i1.r.j.g$d */
    /* loaded from: classes2.dex */
    static final class C9975d implements InterfaceC9965c {

        /* renamed from: c */
        private final InterfaceC14345d f23675c;

        /* renamed from: d */
        private final boolean f23676d;

        /* renamed from: e */
        private final C14342c f23677e;

        /* renamed from: f */
        private final C9968f.C9970b f23678f;

        /* renamed from: w */
        private int f23679w;

        /* renamed from: x */
        private boolean f23680x;

        C9975d(InterfaceC14345d interfaceC14345d, boolean z) {
            this.f23675c = interfaceC14345d;
            this.f23676d = z;
            C14342c c14342c = new C14342c();
            this.f23677e = c14342c;
            this.f23678f = new C9968f.C9970b(c14342c);
            this.f23679w = 16384;
        }

        /* renamed from: F */
        private void m13404F(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min(this.f23679w, j);
                long j2 = min;
                j -= j2;
                m13399g(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.f23675c.mo1444r0(this.f23677e, j2);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: E */
        public synchronized void mo13405E(int i, EnumC9962a enumC9962a) throws IOException {
            if (!this.f23680x) {
                if (enumC9962a.f23627c != -1) {
                    m13399g(i, 4, (byte) 3, (byte) 0);
                    this.f23675c.mo2006j(enumC9962a.f23627c);
                    this.f23675c.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: W */
        public synchronized void mo13403W(boolean z, int i, C14342c c14342c, int i2) throws IOException {
            if (!this.f23680x) {
                m13400c(i, z ? (byte) 1 : (byte) 0, c14342c, i2);
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: W0 */
        public synchronized void mo13402W0(boolean z, boolean z2, int i, int i2, List<C9966d> list) throws IOException {
            try {
                if (!z2) {
                    if (!this.f23680x) {
                        m13398m(z, i, list);
                    } else {
                        throw new IOException(MetricTracker.Action.CLOSED);
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: a1 */
        public synchronized void mo13401a1(int i, EnumC9962a enumC9962a, byte[] bArr) throws IOException {
            if (!this.f23680x) {
                if (enumC9962a.f23627c != -1) {
                    m13399g(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f23675c.mo2006j(i);
                    this.f23675c.mo2006j(enumC9962a.f23627c);
                    if (bArr.length > 0) {
                        this.f23675c.mo2000x(bArr);
                    }
                    this.f23675c.flush();
                } else {
                    C9971g.m13427h("errorCode.httpCode == -1", new Object[0]);
                    throw null;
                }
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        /* renamed from: c */
        void m13400c(int i, byte b, C14342c c14342c, int i2) throws IOException {
            m13399g(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f23675c.mo1444r0(c14342c, i2);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f23680x = true;
            this.f23675c.close();
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        public synchronized void connectionPreface() throws IOException {
            if (!this.f23680x) {
                if (this.f23676d) {
                    if (C9971g.f23661a.isLoggable(Level.FINE)) {
                        C9971g.f23661a.fine(String.format(">> CONNECTION %s", C9971g.f23662b.mo1959p()));
                    }
                    this.f23675c.mo2000x(C9971g.f23662b.mo1966J());
                    this.f23675c.flush();
                    return;
                }
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        public synchronized void flush() throws IOException {
            if (!this.f23680x) {
                this.f23675c.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        /* renamed from: g */
        void m13399g(int i, int i2, byte b, byte b2) throws IOException {
            if (C9971g.f23661a.isLoggable(Level.FINE)) {
                C9971g.f23661a.fine(C9973b.m13418b(false, i, i2, b, b2));
            }
            int i3 = this.f23679w;
            if (i2 > i3) {
                C9971g.m13427h("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
                throw null;
            } else if ((Integer.MIN_VALUE & i) != 0) {
                C9971g.m13427h("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else {
                C9971g.m13421n(this.f23675c, i2);
                this.f23675c.mo2005n(b & 255);
                this.f23675c.mo2005n(b2 & 255);
                this.f23675c.mo2006j(i & Integer.MAX_VALUE);
            }
        }

        /* renamed from: m */
        void m13398m(boolean z, int i, List<C9966d> list) throws IOException {
            if (!this.f23680x) {
                this.f23678f.m13434e(list);
                long m2072F0 = this.f23677e.m2072F0();
                int min = (int) Math.min(this.f23679w, m2072F0);
                long j = min;
                byte b = m2072F0 == j ? (byte) 4 : (byte) 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                m13399g(i, min, (byte) 1, b);
                this.f23675c.mo1444r0(this.f23677e, j);
                if (m2072F0 > j) {
                    m13404F(i, m2072F0 - j);
                    return;
                }
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        public int maxDataLength() {
            return this.f23679w;
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: p0 */
        public synchronized void mo13397p0(C9978i c9978i) throws IOException {
            if (!this.f23680x) {
                this.f23679w = c9978i.m13384c(this.f23679w);
                m13399g(0, 0, (byte) 4, (byte) 1);
                this.f23675c.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        public synchronized void ping(boolean z, int i, int i2) throws IOException {
            if (!this.f23680x) {
                m13399g(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
                this.f23675c.mo2006j(i);
                this.f23675c.mo2006j(i2);
                this.f23675c.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        /* renamed from: t0 */
        public synchronized void mo13396t0(C9978i c9978i) throws IOException {
            if (!this.f23680x) {
                int i = 0;
                m13399g(0, c9978i.m13381f() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (c9978i.m13383d(i)) {
                        this.f23675c.mo2007i(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f23675c.mo2006j(c9978i.m13386a(i));
                    }
                    i++;
                }
                this.f23675c.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
        public synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.f23680x) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (j != 0 && j <= 2147483647L) {
                m13399g(i, 4, (byte) 8, (byte) 0);
                this.f23675c.mo2006j((int) j);
                this.f23675c.flush();
            } else {
                C9971g.m13427h("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
                throw null;
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ IOException m13430e(String str, Object[] objArr) throws IOException {
        m13424k(str, objArr);
        throw null;
    }

    /* renamed from: h */
    static /* synthetic */ IllegalArgumentException m13427h(String str, Object[] objArr) {
        m13425j(str, objArr);
        throw null;
    }

    /* renamed from: j */
    private static IllegalArgumentException m13425j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: k */
    private static IOException m13424k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m13423l(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        m13424k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static int m13422m(InterfaceC14346e interfaceC14346e) throws IOException {
        return (interfaceC14346e.readByte() & 255) | ((interfaceC14346e.readByte() & 255) << 16) | ((interfaceC14346e.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m13421n(InterfaceC14345d interfaceC14345d, int i) throws IOException {
        interfaceC14345d.mo2005n((i >>> 16) & 255);
        interfaceC14345d.mo2005n((i >>> 8) & 255);
        interfaceC14345d.mo2005n(i & 255);
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9979j
    /* renamed from: a */
    public InterfaceC9963b mo13380a(InterfaceC14346e interfaceC14346e, boolean z) {
        return new C9974c(interfaceC14346e, 4096, z);
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9979j
    /* renamed from: b */
    public InterfaceC9965c mo13379b(InterfaceC14345d interfaceC14345d, boolean z) {
        return new C9975d(interfaceC14345d, z);
    }
}
