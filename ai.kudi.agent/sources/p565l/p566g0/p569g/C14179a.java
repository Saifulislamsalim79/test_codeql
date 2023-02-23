package p565l.p566g0.p569g;

import android.support.p050v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C14475c;
import okhttp3.internal.connection.C14479f;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.C14231t;
import p565l.C14239x;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p568f.C14175h;
import p565l.p566g0.p568f.C14176i;
import p565l.p566g0.p568f.C14178k;
import p565l.p566g0.p568f.InterfaceC14169c;
import p576m.C14342c;
import p576m.C14350i;
import p576m.C14353l;
import p576m.C14366t;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: Http1Codec.java */
/* renamed from: l.g0.g.a */
/* loaded from: classes3.dex */
public final class C14179a implements InterfaceC14169c {

    /* renamed from: a */
    final C14239x f31012a;

    /* renamed from: b */
    final C14479f f31013b;

    /* renamed from: c */
    final InterfaceC14346e f31014c;

    /* renamed from: d */
    final InterfaceC14345d f31015d;

    /* renamed from: e */
    int f31016e = 0;

    /* renamed from: f */
    private long f31017f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractC14181b implements InterfaceC14365s {

        /* renamed from: c */
        protected final C14350i f31018c;

        /* renamed from: d */
        protected boolean f31019d;

        /* renamed from: e */
        protected long f31020e;

        private AbstractC14181b() {
            this.f31018c = new C14350i(C14179a.this.f31014c.timeout());
            this.f31020e = 0L;
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            try {
                long mo312O0 = C14179a.this.f31014c.mo312O0(c14342c, j);
                if (mo312O0 > 0) {
                    this.f31020e += mo312O0;
                }
                return mo312O0;
            } catch (IOException e) {
                m2682c(false, e);
                throw e;
            }
        }

        /* renamed from: c */
        protected final void m2682c(boolean z, IOException iOException) throws IOException {
            C14179a c14179a = C14179a.this;
            int i = c14179a.f31016e;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                c14179a.m2691d(this.f31018c);
                C14179a c14179a2 = C14179a.this;
                c14179a2.f31016e = 6;
                C14479f c14479f = c14179a2.f31013b;
                if (c14479f != null) {
                    c14479f.m1561r(!z, c14179a2, this.f31020e, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + C14179a.this.f31016e);
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return this.f31018c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$c */
    /* loaded from: classes3.dex */
    public final class C14182c implements InterfaceC14364r {

        /* renamed from: c */
        private final C14350i f31022c;

        /* renamed from: d */
        private boolean f31023d;

        C14182c() {
            this.f31022c = new C14350i(C14179a.this.f31015d.timeout());
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f31023d) {
                return;
            }
            this.f31023d = true;
            C14179a.this.f31015d.mo2003r("0\r\n\r\n");
            C14179a.this.m2691d(this.f31022c);
            C14179a.this.f31016e = 3;
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f31023d) {
                return;
            }
            C14179a.this.f31015d.flush();
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            if (this.f31023d) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (j == 0) {
                return;
            }
            C14179a.this.f31015d.mo2001t(j);
            C14179a.this.f31015d.mo2003r("\r\n");
            C14179a.this.f31015d.mo1444r0(c14342c, j);
            C14179a.this.f31015d.mo2003r("\r\n");
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return this.f31022c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$d */
    /* loaded from: classes3.dex */
    public class C14183d extends AbstractC14181b {

        /* renamed from: w */
        private final C14231t f31025w;

        /* renamed from: x */
        private long f31026x;

        /* renamed from: y */
        private boolean f31027y;

        C14183d(C14231t c14231t) {
            super();
            this.f31026x = -1L;
            this.f31027y = true;
            this.f31025w = c14231t;
        }

        /* renamed from: g */
        private void m2681g() throws IOException {
            if (this.f31026x != -1) {
                C14179a.this.f31014c.mo1982u();
            }
            try {
                this.f31026x = C14179a.this.f31014c.mo1998C();
                String trim = C14179a.this.f31014c.mo1982u().trim();
                if (this.f31026x >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f31026x == 0) {
                        this.f31027y = false;
                        C14172e.m2723g(C14179a.this.f31012a.m2452i(), this.f31025w, C14179a.this.m2684k());
                        m2682c(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f31026x + trim + "\"");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // p565l.p566g0.p569g.C14179a.AbstractC14181b, p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            if (j >= 0) {
                if (!this.f31019d) {
                    if (this.f31027y) {
                        long j2 = this.f31026x;
                        if (j2 == 0 || j2 == -1) {
                            m2681g();
                            if (!this.f31027y) {
                                return -1L;
                            }
                        }
                        long mo312O0 = super.mo312O0(c14342c, Math.min(j, this.f31026x));
                        if (mo312O0 != -1) {
                            this.f31026x -= mo312O0;
                            return mo312O0;
                        }
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        m2682c(false, protocolException);
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f31019d) {
                return;
            }
            if (this.f31027y && !C14148c.m2792p(this, 100, TimeUnit.MILLISECONDS)) {
                m2682c(false, null);
            }
            this.f31019d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$e */
    /* loaded from: classes3.dex */
    public final class C14184e implements InterfaceC14364r {

        /* renamed from: c */
        private final C14350i f31029c;

        /* renamed from: d */
        private boolean f31030d;

        /* renamed from: e */
        private long f31031e;

        C14184e(long j) {
            this.f31029c = new C14350i(C14179a.this.f31015d.timeout());
            this.f31031e = j;
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f31030d) {
                return;
            }
            this.f31030d = true;
            if (this.f31031e <= 0) {
                C14179a.this.m2691d(this.f31029c);
                C14179a.this.f31016e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f31030d) {
                return;
            }
            C14179a.this.f31015d.flush();
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            if (!this.f31030d) {
                C14148c.m2802f(c14342c.m2072F0(), 0L, j);
                if (j <= this.f31031e) {
                    C14179a.this.f31015d.mo1444r0(c14342c, j);
                    this.f31031e -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f31031e + " bytes but received " + j);
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return this.f31029c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$f */
    /* loaded from: classes3.dex */
    public class C14185f extends AbstractC14181b {

        /* renamed from: w */
        private long f31033w;

        C14185f(C14179a c14179a, long j) throws IOException {
            super();
            this.f31033w = j;
            if (j == 0) {
                m2682c(true, null);
            }
        }

        @Override // p565l.p566g0.p569g.C14179a.AbstractC14181b, p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            if (j >= 0) {
                if (!this.f31019d) {
                    long j2 = this.f31033w;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long mo312O0 = super.mo312O0(c14342c, Math.min(j2, j));
                    if (mo312O0 != -1) {
                        long j3 = this.f31033w - mo312O0;
                        this.f31033w = j3;
                        if (j3 == 0) {
                            m2682c(true, null);
                        }
                        return mo312O0;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m2682c(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f31019d) {
                return;
            }
            if (this.f31033w != 0 && !C14148c.m2792p(this, 100, TimeUnit.MILLISECONDS)) {
                m2682c(false, null);
            }
            this.f31019d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* renamed from: l.g0.g.a$g */
    /* loaded from: classes3.dex */
    public class C14186g extends AbstractC14181b {

        /* renamed from: w */
        private boolean f31034w;

        C14186g(C14179a c14179a) {
            super();
        }

        @Override // p565l.p566g0.p569g.C14179a.AbstractC14181b, p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            if (j >= 0) {
                if (!this.f31019d) {
                    if (this.f31034w) {
                        return -1L;
                    }
                    long mo312O0 = super.mo312O0(c14342c, j);
                    if (mo312O0 == -1) {
                        this.f31034w = true;
                        m2682c(true, null);
                        return -1L;
                    }
                    return mo312O0;
                }
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f31019d) {
                return;
            }
            if (!this.f31034w) {
                m2682c(false, null);
            }
            this.f31019d = true;
        }
    }

    public C14179a(C14239x c14239x, C14479f c14479f, InterfaceC14346e interfaceC14346e, InterfaceC14345d interfaceC14345d) {
        this.f31012a = c14239x;
        this.f31013b = c14479f;
        this.f31014c = interfaceC14346e;
        this.f31015d = interfaceC14345d;
    }

    /* renamed from: j */
    private String m2685j() throws IOException {
        String mo1984q = this.f31014c.mo1984q(this.f31017f);
        this.f31017f -= mo1984q.length();
        return mo1984q;
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: a */
    public void mo1527a(C14116a0 c14116a0) throws IOException {
        m2683l(c14116a0.m2917e(), C14176i.m2704a(c14116a0, this.f31013b.m1575d().m1596p().m2831b().type()));
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: b */
    public AbstractC14135d0 mo1526b(C14131c0 c14131c0) throws IOException {
        C14479f c14479f = this.f31013b;
        c14479f.f31880f.m2568q(c14479f.f31879e);
        String m2885J = c14131c0.m2885J("Content-Type");
        if (!C14172e.m2727c(c14131c0)) {
            return new C14175h(m2885J, 0L, C14353l.m2021d(m2687h(0L)));
        }
        if ("chunked".equalsIgnoreCase(c14131c0.m2885J("Transfer-Encoding"))) {
            return new C14175h(m2885J, -1L, C14353l.m2021d(m2689f(c14131c0.m2873k0().m2913i())));
        }
        long m2728b = C14172e.m2728b(c14131c0);
        if (m2728b != -1) {
            return new C14175h(m2885J, m2728b, C14353l.m2021d(m2687h(m2728b)));
        }
        return new C14175h(m2885J, -1L, C14353l.m2021d(m2686i()));
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: c */
    public InterfaceC14364r mo1525c(C14116a0 c14116a0, long j) {
        if ("chunked".equalsIgnoreCase(c14116a0.m2919c("Transfer-Encoding"))) {
            return m2690e();
        }
        if (j != -1) {
            return m2688g(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void cancel() {
        C14475c m1575d = this.f31013b.m1575d();
        if (m1575d != null) {
            m1575d.m1609c();
        }
    }

    /* renamed from: d */
    void m2691d(C14350i c14350i) {
        C14366t m2032i = c14350i.m2032i();
        c14350i.m2031j(C14366t.f31663d);
        m2032i.mo1953a();
        m2032i.mo1952b();
    }

    /* renamed from: e */
    public InterfaceC14364r m2690e() {
        if (this.f31016e == 1) {
            this.f31016e = 2;
            return new C14182c();
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    /* renamed from: f */
    public InterfaceC14365s m2689f(C14231t c14231t) throws IOException {
        if (this.f31016e == 4) {
            this.f31016e = 5;
            return new C14183d(c14231t);
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void finishRequest() throws IOException {
        this.f31015d.flush();
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void flushRequest() throws IOException {
        this.f31015d.flush();
    }

    /* renamed from: g */
    public InterfaceC14364r m2688g(long j) {
        if (this.f31016e == 1) {
            this.f31016e = 2;
            return new C14184e(j);
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    /* renamed from: h */
    public InterfaceC14365s m2687h(long j) throws IOException {
        if (this.f31016e == 4) {
            this.f31016e = 5;
            return new C14185f(this, j);
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    /* renamed from: i */
    public InterfaceC14365s m2686i() throws IOException {
        if (this.f31016e == 4) {
            C14479f c14479f = this.f31013b;
            if (c14479f != null) {
                this.f31016e = 5;
                c14479f.m1569j();
                return new C14186g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    /* renamed from: k */
    public C14229s m2684k() throws IOException {
        C14229s.C14230a c14230a = new C14229s.C14230a();
        while (true) {
            String m2685j = m2685j();
            if (m2685j.length() != 0) {
                AbstractC14146a.f30903a.mo2435a(c14230a, m2685j);
            } else {
                return c14230a.m2539d();
            }
        }
    }

    /* renamed from: l */
    public void m2683l(C14229s c14229s, String str) throws IOException {
        if (this.f31016e == 0) {
            this.f31015d.mo2003r(str).mo2003r("\r\n");
            int m2545h = c14229s.m2545h();
            for (int i = 0; i < m2545h; i++) {
                this.f31015d.mo2003r(c14229s.m2548e(i)).mo2003r(": ").mo2003r(c14229s.m2544i(i)).mo2003r("\r\n");
            }
            this.f31015d.mo2003r("\r\n");
            this.f31016e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f31016e);
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public C14131c0.C14132a readResponseHeaders(boolean z) throws IOException {
        int i = this.f31016e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f31016e);
        }
        try {
            C14178k m2692a = C14178k.m2692a(m2685j());
            C14131c0.C14132a c14132a = new C14131c0.C14132a();
            c14132a.m2857n(m2692a.f31009a);
            c14132a.m2864g(m2692a.f31010b);
            c14132a.m2860k(m2692a.f31011c);
            c14132a.m2861j(m2684k());
            if (z && m2692a.f31010b == 100) {
                return null;
            }
            if (m2692a.f31010b == 100) {
                this.f31016e = 3;
                return c14132a;
            }
            this.f31016e = 4;
            return c14132a;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f31013b);
            iOException.initCause(e);
            throw iOException;
        }
    }
}
