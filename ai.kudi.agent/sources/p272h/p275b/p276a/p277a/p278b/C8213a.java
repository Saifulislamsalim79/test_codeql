package p272h.p275b.p276a.p277a.p278b;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.C2448l;
import com.github.kittinunf.fuel.core.C2459m;
import com.github.kittinunf.fuel.core.C2460n;
import com.github.kittinunf.fuel.core.C2463p;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.EnumC2462o;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2423a;
import com.github.kittinunf.fuel.core.InterfaceC2427d;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import com.github.kittinunf.fuel.core.requests.C2473b;
import com.github.kittinunf.fuel.core.requests.C2474c;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13736w;
import p272h.p275b.p276a.p277a.p279c.C8222a;
import p272h.p275b.p276a.p277a.p279c.C8225c;
import p272h.p275b.p276a.p277a.p279c.C8226d;
/* compiled from: HttpClient.kt */
/* renamed from: h.b.a.a.b.a */
/* loaded from: classes2.dex */
public final class C8213a implements InterfaceC2427d {

    /* renamed from: e */
    private static final List<String> f19770e;

    /* renamed from: f */
    public static final C8214a f19771f = new C8214a(null);

    /* renamed from: a */
    private final Proxy f19772a;

    /* renamed from: b */
    private boolean f19773b;

    /* renamed from: c */
    private boolean f19774c;

    /* renamed from: d */
    private InterfaceC2427d.InterfaceC2428a f19775d;

    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$a */
    /* loaded from: classes2.dex */
    public static final class C8214a {
        private C8214a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final EnumC2462o m16468b(EnumC2462o enumC2462o) {
            return enumC2462o == EnumC2462o.PATCH ? EnumC2462o.POST : enumC2462o;
        }

        public /* synthetic */ C8214a(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$b */
    /* loaded from: classes2.dex */
    public static final class C8215b extends AbstractC11802m implements InterfaceC11756a<BufferedInputStream> {

        /* renamed from: c */
        final /* synthetic */ C8225c f19776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8215b(C8225c c8225c) {
            super(0);
            this.f19776c = c8225c;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final BufferedInputStream invoke() {
            C8225c c8225c = this.f19776c;
            return c8225c instanceof BufferedInputStream ? (BufferedInputStream) c8225c : new BufferedInputStream(c8225c, C2448l.f7004s.m32856b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$c */
    /* loaded from: classes2.dex */
    public static final class C8216c extends AbstractC11802m implements InterfaceC11756a<Long> {

        /* renamed from: c */
        final /* synthetic */ C11812w f19777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8216c(C11812w c11812w) {
            super(0);
            this.f19777c = c11812w;
        }

        /* renamed from: a */
        public final long m16466a() {
            Long l = (Long) this.f19777c.f26499c;
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m16466a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$d */
    /* loaded from: classes2.dex */
    public static final class C8217d extends AbstractC11802m implements InterfaceC11767l<Long, C13666w> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC2464q f19779d;

        /* renamed from: e */
        final /* synthetic */ C11812w f19780e;

        /* renamed from: f */
        final /* synthetic */ WeakReference f19781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8217d(InterfaceC2464q interfaceC2464q, C11812w c11812w, WeakReference weakReference) {
            super(1);
            this.f19779d = interfaceC2464q;
            this.f19780e = c11812w;
            this.f19781f = weakReference;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Long l) {
            invoke(l.longValue());
            return C13666w.f30112a;
        }

        public final void invoke(long j) {
            C2463p m32808j = this.f19779d.mo32771e().m32808j();
            Long l = (Long) this.f19780e.f26499c;
            m32808j.m32821a(j, l != null ? l.longValue() : j);
            C8213a.this.m16475e(this.f19779d, (HttpURLConnection) this.f19781f.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$e */
    /* loaded from: classes2.dex */
    public static final class C8218e extends AbstractC11802m implements InterfaceC11771p<String, String, C13666w> {

        /* renamed from: c */
        final /* synthetic */ HttpURLConnection f19782c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8218e(HttpURLConnection httpURLConnection) {
            super(2);
            this.f19782c = httpURLConnection;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, String str2) {
            invoke2(str, str2);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str, String str2) {
            l.g(str, "key");
            l.g(str2, "values");
            this.f19782c.setRequestProperty(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$f */
    /* loaded from: classes2.dex */
    public static final class C8219f extends AbstractC11802m implements InterfaceC11771p<String, String, C13666w> {

        /* renamed from: c */
        final /* synthetic */ HttpURLConnection f19783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8219f(HttpURLConnection httpURLConnection) {
            super(2);
            this.f19783c = httpURLConnection;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, String str2) {
            invoke2(str, str2);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str, String str2) {
            l.g(str, "key");
            l.g(str2, "value");
            this.f19783c.addRequestProperty(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    /* renamed from: h.b.a.a.b.a$g */
    /* loaded from: classes2.dex */
    public static final class C8220g extends AbstractC11802m implements InterfaceC11767l<Long, C13666w> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC2464q f19785d;

        /* renamed from: e */
        final /* synthetic */ Long f19786e;

        /* renamed from: f */
        final /* synthetic */ HttpURLConnection f19787f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8220g(InterfaceC2464q interfaceC2464q, Long l, HttpURLConnection httpURLConnection) {
            super(1);
            this.f19785d = interfaceC2464q;
            this.f19786e = l;
            this.f19787f = httpURLConnection;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Long l) {
            invoke(l.longValue());
            return C13666w.f30112a;
        }

        public final void invoke(long j) {
            C2463p m32810h = this.f19785d.mo32771e().m32810h();
            Long l = this.f19786e;
            m32810h.m32821a(j, l != null ? l.longValue() : j);
            C8213a.this.m16475e(this.f19785d, this.f19787f);
        }
    }

    static {
        List<String> m3888h;
        m3888h = C13726r.m3888h("gzip", "deflate; q=0.5");
        f19770e = m3888h;
    }

    public C8213a(Proxy proxy, boolean z, boolean z2, InterfaceC2427d.InterfaceC2428a interfaceC2428a) {
        l.g(interfaceC2428a, "hook");
        this.f19772a = proxy;
        this.f19773b = z;
        this.f19774c = z2;
        this.f19775d = interfaceC2428a;
    }

    /* renamed from: c */
    private final InputStream m16477c(InterfaceC2464q interfaceC2464q, HttpURLConnection httpURLConnection) {
        try {
            InputStream mo32892c = this.f19775d.mo32892c(interfaceC2464q, httpURLConnection.getInputStream());
            r1 = mo32892c != null ? mo32892c instanceof BufferedInputStream ? (BufferedInputStream) mo32892c : new BufferedInputStream(mo32892c, 8192) : null;
            return r1;
        } catch (IOException unused) {
            InputStream mo32892c2 = this.f19775d.mo32892c(interfaceC2464q, httpURLConnection.getErrorStream());
            return mo32892c2 != null ? mo32892c2 instanceof BufferedInputStream ? (BufferedInputStream) mo32892c2 : new BufferedInputStream(mo32892c2, 8192) : r1;
        }
    }

    /* renamed from: d */
    private final C2500u m16476d(InterfaceC2464q interfaceC2464q) throws IOException, InterruptedException {
        HttpURLConnection m16474f = m16474f(interfaceC2464q);
        m16472h(interfaceC2464q, m16474f);
        return m16473g(interfaceC2464q, m16474f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m16475e(InterfaceC2464q interfaceC2464q, HttpURLConnection httpURLConnection) throws InterruptedException {
        boolean m32785a = C2473b.m32785a(interfaceC2464q);
        if (!m32785a) {
            Thread currentThread = Thread.currentThread();
            l.c(currentThread, "Thread.currentThread()");
            if (!currentThread.isInterrupted()) {
                return;
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw new InterruptedException("[HttpClient] could not ensure Request was active: cancelled=" + m32785a);
    }

    /* renamed from: f */
    private final HttpURLConnection m16474f(InterfaceC2464q interfaceC2464q) {
        URLConnection uRLConnection;
        URL mo32766j = interfaceC2464q.mo32766j();
        Proxy proxy = this.f19772a;
        if (proxy == null || (uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(mo32766j.openConnection(proxy))) == null) {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(mo32766j.openConnection());
        }
        if (uRLConnection != null) {
            return (HttpURLConnection) uRLConnection;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Long] */
    /* renamed from: g */
    private final C2500u m16473g(InterfaceC2464q interfaceC2464q, HttpURLConnection httpURLConnection) throws IOException, InterruptedException {
        boolean z;
        int m3867o;
        boolean m5440u;
        boolean z2;
        InputStream byteArrayInputStream;
        CharSequence m5414M0;
        List m5384q0;
        m16475e(interfaceC2464q, httpURLConnection);
        this.f19775d.mo32893b(interfaceC2464q);
        C2460n.C2461a c2461a = C2460n.f7036w;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        l.c(headerFields, "connection.headerFields");
        C2460n m32827c = c2461a.m32827c(headerFields);
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it = m32827c.get("Transfer-Encoding").iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            m5384q0 = C13277t.m5384q0((String) it.next(), new char[]{','}, false, 0, 6, null);
            C13736w.m3850v(arrayList, m5384q0);
        }
        m3867o = C13728s.m3867o(arrayList, 10);
        ArrayList<String> arrayList2 = new ArrayList(m3867o);
        for (String str : arrayList) {
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            m5414M0 = C13277t.m5414M0(str);
            arrayList2.add(m5414M0.toString());
        }
        String str2 = (String) C13722p.m3942d0(m32827c.get("Content-Encoding"));
        C11812w c11812w = new C11812w();
        String str3 = (String) C13722p.m3942d0(m32827c.get("Content-Length"));
        c11812w.f26499c = str3 != null ? Long.valueOf(Long.parseLong(str3)) : 0;
        Boolean m32814d = interfaceC2464q.mo32771e().m32814d();
        boolean z3 = (m32814d != null ? m32814d.booleanValue() : this.f19774c) && str2 != null && (l.b(str2, "identity") ^ true);
        if (z3) {
            m32827c.remove("Content-Encoding");
            m32827c.remove("Content-Length");
            c11812w.f26499c = null;
        }
        m32827c.remove("Transfer-Encoding");
        if (!arrayList2.isEmpty()) {
            for (String str4 : arrayList2) {
                m5440u = C13276s.m5440u(str4);
                if ((!m5440u) && (!l.b(str4, "identity"))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            m32827c.remove("Content-Length");
            c11812w.f26499c = -1L;
        }
        InputStream m16477c = m16477c(interfaceC2464q, httpURLConnection);
        if (m16477c == null || (byteArrayInputStream = C8222a.m16463c(m16477c, arrayList2, null, 2, null)) == null) {
            byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        }
        if (z3 && str2 != null) {
            byteArrayInputStream = C8222a.m16462d(byteArrayInputStream, str2, null, 2, null);
        }
        C8225c c8225c = new C8225c(byteArrayInputStream, new C8217d(interfaceC2464q, c11812w, new WeakReference(httpURLConnection)));
        URL mo32766j = interfaceC2464q.mo32766j();
        Long l = (Long) c11812w.f26499c;
        long longValue = l != null ? l.longValue() : -1L;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        return new C2500u(mo32766j, responseCode, responseMessage, m32827c, longValue, C2474c.C2477c.m32779b(C2474c.f7080h, new C8215b(c8225c), new C8216c(c11812w), null, 4, null));
    }

    /* renamed from: h */
    private final void m16472h(InterfaceC2464q interfaceC2464q, HttpURLConnection httpURLConnection) throws IOException, InterruptedException {
        m16475e(interfaceC2464q, httpURLConnection);
        httpURLConnection.setConnectTimeout(Math.max(interfaceC2464q.mo32771e().m32804n(), 0));
        httpURLConnection.setReadTimeout(Math.max(interfaceC2464q.mo32771e().m32803o(), 0));
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(interfaceC2464q.mo32771e().m32805m());
            httpsURLConnection.setHostnameVerifier(interfaceC2464q.mo32771e().m32813e());
        }
        httpURLConnection.setRequestMethod(f19771f.m16468b(interfaceC2464q.mo32765k()).m32822a());
        Boolean m32802p = interfaceC2464q.mo32771e().m32802p();
        httpURLConnection.setUseCaches(m32802p != null ? m32802p.booleanValue() : this.f19773b);
        httpURLConnection.setInstanceFollowRedirects(false);
        interfaceC2464q.mo32775a().m32831t(new C8218e(httpURLConnection), new C8219f(httpURLConnection));
        httpURLConnection.setRequestProperty("TE", C2460n.f7036w.m32829a(new C2459m("TE"), f19770e));
        EnumC2462o mo32765k = interfaceC2464q.mo32765k();
        EnumC2462o enumC2462o = EnumC2462o.PATCH;
        if (mo32765k == enumC2462o) {
            httpURLConnection.setRequestProperty("X-HTTP-Method-Override", enumC2462o.m32822a());
        }
        this.f19775d.mo32891d(httpURLConnection, interfaceC2464q);
        m16470j(httpURLConnection, interfaceC2464q.mo32765k());
        m16471i(httpURLConnection, interfaceC2464q);
        httpURLConnection.connect();
    }

    /* renamed from: i */
    private final void m16471i(HttpURLConnection httpURLConnection, InterfaceC2464q interfaceC2464q) {
        OutputStream bufferedOutputStream;
        InterfaceC2423a mo32761o = interfaceC2464q.mo32761o();
        if (!httpURLConnection.getDoOutput() || mo32761o.isEmpty()) {
            return;
        }
        Long mo32743h = mo32761o.mo32743h();
        if (mo32743h != null && mo32743h.longValue() != -1) {
            httpURLConnection.setFixedLengthStreamingMode(mo32743h.longValue());
        } else {
            httpURLConnection.setChunkedStreamingMode(4096);
        }
        if (interfaceC2464q.mo32771e().m32810h().m32820b()) {
            bufferedOutputStream = httpURLConnection.getOutputStream();
        } else {
            Long l = null;
            if ((mo32743h != null ? mo32743h.longValue() : -1L) > 0) {
                if (mo32743h == null) {
                    l.o();
                    throw null;
                }
                l = Long.valueOf(mo32743h.longValue());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            l.c(outputStream, "connection.outputStream");
            C8226d c8226d = new C8226d(outputStream, new C8220g(interfaceC2464q, l, httpURLConnection));
            bufferedOutputStream = c8226d instanceof BufferedOutputStream ? (BufferedOutputStream) c8226d : new BufferedOutputStream(c8226d, C2448l.f7004s.m32856b());
        }
        l.c(bufferedOutputStream, "outputStream");
        mo32761o.mo32747c(bufferedOutputStream);
        httpURLConnection.getOutputStream().flush();
    }

    /* renamed from: j */
    private final void m16470j(HttpURLConnection httpURLConnection, EnumC2462o enumC2462o) {
        switch (C8221b.f19788a[enumC2462o.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                httpURLConnection.setDoOutput(false);
                return;
            case 5:
            case 6:
            case 7:
            case 8:
                httpURLConnection.setDoOutput(true);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2427d
    /* renamed from: a */
    public C2500u mo16479a(InterfaceC2464q interfaceC2464q) {
        l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
        try {
            return m16476d(interfaceC2464q);
        } catch (IOException e) {
            this.f19775d.mo32894a(interfaceC2464q, e);
            throw FuelError.f6968d.m32899a(e, new C2500u(interfaceC2464q.mo32766j(), 0, null, null, 0L, null, 62, null));
        } catch (InterruptedException e2) {
            throw FuelError.f6968d.m32899a(e2, new C2500u(interfaceC2464q.mo32766j(), 0, null, null, 0L, null, 62, null));
        }
    }

    public /* synthetic */ C8213a(Proxy proxy, boolean z, boolean z2, InterfaceC2427d.InterfaceC2428a interfaceC2428a, int i, g gVar) {
        this((i & 1) != 0 ? null : proxy, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, interfaceC2428a);
    }
}
