package okhttp3.internal.http2;

import io.intercom.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C14479f;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.C14239x;
import p565l.EnumC14242y;
import p565l.InterfaceC14233u;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p568f.C14175h;
import p565l.p566g0.p568f.C14176i;
import p565l.p566g0.p568f.C14178k;
import p565l.p566g0.p568f.InterfaceC14169c;
import p576m.AbstractC14349h;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: Http2Codec.java */
/* renamed from: okhttp3.internal.http2.e */
/* loaded from: classes3.dex */
public final class C14488e implements InterfaceC14169c {

    /* renamed from: f */
    private static final List<String> f31936f = C14148c.m2787u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: g */
    private static final List<String> f31937g = C14148c.m2787u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final InterfaceC14233u.InterfaceC14234a f31938a;

    /* renamed from: b */
    final C14479f f31939b;

    /* renamed from: c */
    private final C14490f f31940c;

    /* renamed from: d */
    private C14508h f31941d;

    /* renamed from: e */
    private final EnumC14242y f31942e;

    /* compiled from: Http2Codec.java */
    /* renamed from: okhttp3.internal.http2.e$a */
    /* loaded from: classes3.dex */
    class C14489a extends AbstractC14349h {

        /* renamed from: d */
        boolean f31943d;

        /* renamed from: e */
        long f31944e;

        C14489a(InterfaceC14365s interfaceC14365s) {
            super(interfaceC14365s);
            this.f31943d = false;
            this.f31944e = 0L;
        }

        /* renamed from: g */
        private void m1522g(IOException iOException) {
            if (this.f31943d) {
                return;
            }
            this.f31943d = true;
            C14488e c14488e = C14488e.this;
            c14488e.f31939b.m1561r(false, c14488e, this.f31944e, iOException);
        }

        @Override // p576m.AbstractC14349h, p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            try {
                long mo312O0 = m2033c().mo312O0(c14342c, j);
                if (mo312O0 > 0) {
                    this.f31944e += mo312O0;
                }
                return mo312O0;
            } catch (IOException e) {
                m1522g(e);
                throw e;
            }
        }

        @Override // p576m.AbstractC14349h, p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            m1522g(null);
        }
    }

    public C14488e(C14239x c14239x, InterfaceC14233u.InterfaceC14234a interfaceC14234a, C14479f c14479f, C14490f c14490f) {
        EnumC14242y enumC14242y;
        this.f31938a = interfaceC14234a;
        this.f31939b = c14479f;
        this.f31940c = c14490f;
        if (c14239x.m2440v().contains(EnumC14242y.H2_PRIOR_KNOWLEDGE)) {
            enumC14242y = EnumC14242y.H2_PRIOR_KNOWLEDGE;
        } else {
            enumC14242y = EnumC14242y.HTTP_2;
        }
        this.f31942e = enumC14242y;
    }

    /* renamed from: d */
    public static List<C14482b> m1524d(C14116a0 c14116a0) {
        C14229s m2917e = c14116a0.m2917e();
        ArrayList arrayList = new ArrayList(m2917e.m2545h() + 4);
        arrayList.add(new C14482b(C14482b.f31906f, c14116a0.m2915g()));
        arrayList.add(new C14482b(C14482b.f31907g, C14176i.m2702c(c14116a0.m2913i())));
        String m2919c = c14116a0.m2919c("Host");
        if (m2919c != null) {
            arrayList.add(new C14482b(C14482b.f31909i, m2919c));
        }
        arrayList.add(new C14482b(C14482b.f31908h, c14116a0.m2913i().m2531E()));
        int m2545h = m2917e.m2545h();
        for (int i = 0; i < m2545h; i++) {
            C14347f m2035m = C14347f.m2035m(m2917e.m2548e(i).toLowerCase(Locale.US));
            if (!f31936f.contains(m2035m.mo1965M())) {
                arrayList.add(new C14482b(m2035m, m2917e.m2544i(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C14131c0.C14132a m1523e(C14229s c14229s, EnumC14242y enumC14242y) throws IOException {
        C14229s.C14230a c14230a = new C14229s.C14230a();
        int m2545h = c14229s.m2545h();
        C14178k c14178k = null;
        for (int i = 0; i < m2545h; i++) {
            String m2548e = c14229s.m2548e(i);
            String m2544i = c14229s.m2544i(i);
            if (m2548e.equals(Header.RESPONSE_STATUS_UTF8)) {
                c14178k = C14178k.m2692a("HTTP/1.1 " + m2544i);
            } else if (!f31937g.contains(m2548e)) {
                AbstractC14146a.f30903a.mo2434b(c14230a, m2548e, m2544i);
            }
        }
        if (c14178k != null) {
            C14131c0.C14132a c14132a = new C14131c0.C14132a();
            c14132a.m2857n(enumC14242y);
            c14132a.m2864g(c14178k.f31010b);
            c14132a.m2860k(c14178k.f31011c);
            c14132a.m2861j(c14230a.m2539d());
            return c14132a;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: a */
    public void mo1527a(C14116a0 c14116a0) throws IOException {
        if (this.f31941d != null) {
            return;
        }
        C14508h m1508Z = this.f31940c.m1508Z(m1524d(c14116a0), c14116a0.m2921a() != null);
        this.f31941d = m1508Z;
        m1508Z.m1453n().mo1946g(this.f31938a.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f31941d.m1446u().mo1946g(this.f31938a.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: b */
    public AbstractC14135d0 mo1526b(C14131c0 c14131c0) throws IOException {
        C14479f c14479f = this.f31939b;
        c14479f.f31880f.m2568q(c14479f.f31879e);
        return new C14175h(c14131c0.m2885J("Content-Type"), C14172e.m2728b(c14131c0), C14353l.m2021d(new C14489a(this.f31941d.m1456k())));
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    /* renamed from: c */
    public InterfaceC14364r mo1525c(C14116a0 c14116a0, long j) {
        return this.f31941d.m1457j();
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void cancel() {
        C14508h c14508h = this.f31941d;
        if (c14508h != null) {
            c14508h.m1459h(EnumC14481a.CANCEL);
        }
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void finishRequest() throws IOException {
        this.f31941d.m1457j().close();
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public void flushRequest() throws IOException {
        this.f31940c.flush();
    }

    @Override // p565l.p566g0.p568f.InterfaceC14169c
    public C14131c0.C14132a readResponseHeaders(boolean z) throws IOException {
        C14131c0.C14132a m1523e = m1523e(this.f31941d.m1448s(), this.f31942e);
        if (z && AbstractC14146a.f30903a.mo2432d(m1523e) == 100) {
            return null;
        }
        return m1523e;
    }
}
