package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import okhttp3.internal.http2.C14482b;
import p565l.C14229s;
import p565l.p566g0.C14148c;
import p576m.C14337a;
import p576m.C14342c;
import p576m.C14366t;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: Http2Stream.java */
/* renamed from: okhttp3.internal.http2.h */
/* loaded from: classes3.dex */
public final class C14508h {

    /* renamed from: b */
    long f32020b;

    /* renamed from: c */
    final int f32021c;

    /* renamed from: d */
    final C14490f f32022d;

    /* renamed from: f */
    private C14482b.InterfaceC14483a f32024f;

    /* renamed from: g */
    private boolean f32025g;

    /* renamed from: h */
    private final C14510b f32026h;

    /* renamed from: i */
    final C14509a f32027i;

    /* renamed from: a */
    long f32019a = 0;

    /* renamed from: e */
    private final Deque<C14229s> f32023e = new ArrayDeque();

    /* renamed from: j */
    final C14511c f32028j = new C14511c();

    /* renamed from: k */
    final C14511c f32029k = new C14511c();

    /* renamed from: l */
    EnumC14481a f32030l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Stream.java */
    /* renamed from: okhttp3.internal.http2.h$a */
    /* loaded from: classes3.dex */
    public final class C14509a implements InterfaceC14364r {

        /* renamed from: c */
        private final C14342c f32031c = new C14342c();

        /* renamed from: d */
        boolean f32032d;

        /* renamed from: e */
        boolean f32033e;

        C14509a() {
        }

        /* renamed from: c */
        private void m1445c(boolean z) throws IOException {
            long min;
            synchronized (C14508h.this) {
                C14508h.this.f32029k.m2086k();
                while (C14508h.this.f32020b <= 0 && !this.f32033e && !this.f32032d && C14508h.this.f32030l == null) {
                    C14508h.this.m1447t();
                }
                C14508h.this.f32029k.m1439u();
                C14508h.this.m1462e();
                min = Math.min(C14508h.this.f32020b, this.f32031c.m2072F0());
                C14508h.this.f32020b -= min;
            }
            C14508h.this.f32029k.m2086k();
            try {
                C14508h.this.f32022d.m1520C0(C14508h.this.f32021c, z && min == this.f32031c.m2072F0(), this.f32031c, min);
            } finally {
                C14508h.this.f32029k.m1439u();
            }
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C14508h.this) {
                if (this.f32032d) {
                    return;
                }
                if (!C14508h.this.f32027i.f32033e) {
                    if (this.f32031c.m2072F0() > 0) {
                        while (this.f32031c.m2072F0() > 0) {
                            m1445c(true);
                        }
                    } else {
                        C14508h c14508h = C14508h.this;
                        c14508h.f32022d.m1520C0(c14508h.f32021c, true, null, 0L);
                    }
                }
                synchronized (C14508h.this) {
                    this.f32032d = true;
                }
                C14508h.this.f32022d.flush();
                C14508h.this.m1463d();
            }
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public void flush() throws IOException {
            synchronized (C14508h.this) {
                C14508h.this.m1462e();
            }
            while (this.f32031c.m2072F0() > 0) {
                m1445c(false);
                C14508h.this.f32022d.flush();
            }
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            this.f32031c.mo1444r0(c14342c, j);
            while (this.f32031c.m2072F0() >= 16384) {
                m1445c(false);
            }
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return C14508h.this.f32029k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http2Stream.java */
    /* renamed from: okhttp3.internal.http2.h$b */
    /* loaded from: classes3.dex */
    public final class C14510b implements InterfaceC14365s {

        /* renamed from: c */
        private final C14342c f32035c = new C14342c();

        /* renamed from: d */
        private final C14342c f32036d = new C14342c();

        /* renamed from: e */
        private final long f32037e;

        /* renamed from: f */
        boolean f32038f;

        /* renamed from: w */
        boolean f32039w;

        C14510b(long j) {
            this.f32037e = j;
        }

        /* renamed from: g */
        private void m1442g(long j) {
            C14508h.this.f32022d.m1521A0(j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
            if (r11 == (-1)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
            m1442g(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
            throw new okhttp3.internal.http2.StreamResetException(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long mo312O0(p576m.C14342c r18, long r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14508h.C14510b.mo312O0(m.c, long):long");
        }

        /* renamed from: c */
        void m1443c(InterfaceC14346e interfaceC14346e, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C14508h.this) {
                    z = this.f32039w;
                    z2 = true;
                    z3 = this.f32036d.m2072F0() + j > this.f32037e;
                }
                if (z3) {
                    interfaceC14346e.mo1994a(j);
                    C14508h.this.m1459h(EnumC14481a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    interfaceC14346e.mo1994a(j);
                    return;
                } else {
                    long mo312O0 = interfaceC14346e.mo312O0(this.f32035c, j);
                    if (mo312O0 != -1) {
                        j -= mo312O0;
                        synchronized (C14508h.this) {
                            if (this.f32036d.m2072F0() != 0) {
                                z2 = false;
                            }
                            this.f32036d.mo2002s0(this.f32035c);
                            if (z2) {
                                C14508h.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long m2072F0;
            C14482b.InterfaceC14483a interfaceC14483a;
            ArrayList<C14229s> arrayList;
            synchronized (C14508h.this) {
                this.f32038f = true;
                m2072F0 = this.f32036d.m2072F0();
                this.f32036d.m2058c();
                interfaceC14483a = null;
                if (C14508h.this.f32023e.isEmpty() || C14508h.this.f32024f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(C14508h.this.f32023e);
                    C14508h.this.f32023e.clear();
                    interfaceC14483a = C14508h.this.f32024f;
                    arrayList = arrayList2;
                }
                C14508h.this.notifyAll();
            }
            if (m2072F0 > 0) {
                m1442g(m2072F0);
            }
            C14508h.this.m1463d();
            if (interfaceC14483a != null) {
                for (C14229s c14229s : arrayList) {
                    interfaceC14483a.m1559a(c14229s);
                }
            }
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return C14508h.this.f32028j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Stream.java */
    /* renamed from: okhttp3.internal.http2.h$c */
    /* loaded from: classes3.dex */
    public class C14511c extends C14337a {
        C14511c() {
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
            C14508h.this.m1459h(EnumC14481a.CANCEL);
        }

        /* renamed from: u */
        public void m1439u() throws IOException {
            if (m2083n()) {
                throw mo1441o(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14508h(int i, C14490f c14490f, boolean z, boolean z2, C14229s c14229s) {
        if (c14490f != null) {
            this.f32021c = i;
            this.f32022d = c14490f;
            this.f32020b = c14490f.f31953G.m1415d();
            this.f32026h = new C14510b(c14490f.f31952F.m1415d());
            C14509a c14509a = new C14509a();
            this.f32027i = c14509a;
            this.f32026h.f32039w = z2;
            c14509a.f32033e = z;
            if (c14229s != null) {
                this.f32023e.add(c14229s);
            }
            if (m1455l() && c14229s != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            if (!m1455l() && c14229s == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new NullPointerException("connection == null");
    }

    /* renamed from: g */
    private boolean m1460g(EnumC14481a enumC14481a) {
        synchronized (this) {
            if (this.f32030l != null) {
                return false;
            }
            if (this.f32026h.f32039w && this.f32027i.f32033e) {
                return false;
            }
            this.f32030l = enumC14481a;
            notifyAll();
            this.f32022d.m1498u0(this.f32021c);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1464c(long j) {
        this.f32020b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: d */
    void m1463d() throws IOException {
        boolean z;
        boolean m1454m;
        synchronized (this) {
            z = !this.f32026h.f32039w && this.f32026h.f32038f && (this.f32027i.f32033e || this.f32027i.f32032d);
            m1454m = m1454m();
        }
        if (z) {
            m1461f(EnumC14481a.CANCEL);
        } else if (m1454m) {
        } else {
            this.f32022d.m1498u0(this.f32021c);
        }
    }

    /* renamed from: e */
    void m1462e() throws IOException {
        C14509a c14509a = this.f32027i;
        if (!c14509a.f32032d) {
            if (!c14509a.f32033e) {
                if (this.f32030l != null) {
                    throw new StreamResetException(this.f32030l);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: f */
    public void m1461f(EnumC14481a enumC14481a) throws IOException {
        if (m1460g(enumC14481a)) {
            this.f32022d.m1518E0(this.f32021c, enumC14481a);
        }
    }

    /* renamed from: h */
    public void m1459h(EnumC14481a enumC14481a) {
        if (m1460g(enumC14481a)) {
            this.f32022d.m1516F0(this.f32021c, enumC14481a);
        }
    }

    /* renamed from: i */
    public int m1458i() {
        return this.f32021c;
    }

    /* renamed from: j */
    public InterfaceC14364r m1457j() {
        synchronized (this) {
            if (!this.f32025g && !m1455l()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f32027i;
    }

    /* renamed from: k */
    public InterfaceC14365s m1456k() {
        return this.f32026h;
    }

    /* renamed from: l */
    public boolean m1455l() {
        return this.f32022d.f31959c == ((this.f32021c & 1) == 1);
    }

    /* renamed from: m */
    public synchronized boolean m1454m() {
        if (this.f32030l != null) {
            return false;
        }
        if ((this.f32026h.f32039w || this.f32026h.f32038f) && (this.f32027i.f32033e || this.f32027i.f32032d)) {
            if (this.f32025g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public C14366t m1453n() {
        return this.f32028j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1452o(InterfaceC14346e interfaceC14346e, int i) throws IOException {
        this.f32026h.m1443c(interfaceC14346e, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1451p() {
        boolean m1454m;
        synchronized (this) {
            this.f32026h.f32039w = true;
            m1454m = m1454m();
            notifyAll();
        }
        if (m1454m) {
            return;
        }
        this.f32022d.m1498u0(this.f32021c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1450q(List<C14482b> list) {
        boolean m1454m;
        synchronized (this) {
            this.f32025g = true;
            this.f32023e.add(C14148c.m2810H(list));
            m1454m = m1454m();
            notifyAll();
        }
        if (m1454m) {
            return;
        }
        this.f32022d.m1498u0(this.f32021c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void m1449r(EnumC14481a enumC14481a) {
        if (this.f32030l == null) {
            this.f32030l = enumC14481a;
            notifyAll();
        }
    }

    /* renamed from: s */
    public synchronized C14229s m1448s() throws IOException {
        this.f32028j.m2086k();
        while (this.f32023e.isEmpty() && this.f32030l == null) {
            m1447t();
        }
        this.f32028j.m1439u();
        if (!this.f32023e.isEmpty()) {
        } else {
            throw new StreamResetException(this.f32030l);
        }
        return this.f32023e.removeFirst();
    }

    /* renamed from: t */
    void m1447t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public C14366t m1446u() {
        return this.f32029k;
    }
}
