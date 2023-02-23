package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.C5052o;
import com.google.common.base.C5055p;
import com.google.common.base.InterfaceC5058r;
import com.google.common.util.concurrent.C5165g;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC10020n0;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.C9897i0;
import io.grpc.InterfaceC10094z0;
import io.grpc.p384h1.C9610f2;
import io.grpc.p384h1.InterfaceC9695k2;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p384h1.InterfaceC9773s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: GrpcUtil.java */
/* renamed from: io.grpc.h1.r0 */
/* loaded from: classes2.dex */
public final class C9755r0 {

    /* renamed from: a */
    private static final Logger f22901a = Logger.getLogger(C9755r0.class.getName());

    /* renamed from: b */
    public static final C10049s0.AbstractC10055f<Long> f22902b;

    /* renamed from: c */
    public static final C10049s0.AbstractC10055f<String> f22903c;

    /* renamed from: d */
    public static final C10049s0.AbstractC10055f<byte[]> f22904d;

    /* renamed from: e */
    public static final C10049s0.AbstractC10055f<String> f22905e;

    /* renamed from: f */
    public static final C10049s0.AbstractC10055f<byte[]> f22906f;

    /* renamed from: g */
    public static final C10049s0.AbstractC10055f<String> f22907g;

    /* renamed from: h */
    public static final C10049s0.AbstractC10055f<String> f22908h;

    /* renamed from: i */
    public static final C10049s0.AbstractC10055f<String> f22909i;

    /* renamed from: j */
    public static final long f22910j;

    /* renamed from: k */
    public static final InterfaceC10094z0 f22911k;

    /* renamed from: l */
    public static final C9502d.C9503a<Boolean> f22912l;

    /* renamed from: m */
    private static final AbstractC10001l f22913m;

    /* renamed from: n */
    public static final C9610f2.InterfaceC9614d<Executor> f22914n;

    /* renamed from: o */
    public static final C9610f2.InterfaceC9614d<ScheduledExecutorService> f22915o;

    /* renamed from: p */
    public static final InterfaceC5058r<C5055p> f22916p;

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$a */
    /* loaded from: classes2.dex */
    class C9756a implements InterfaceC10094z0 {
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$b */
    /* loaded from: classes2.dex */
    class C9757b extends AbstractC10001l {
        C9757b() {
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$c */
    /* loaded from: classes2.dex */
    class C9758c implements C9610f2.InterfaceC9614d<Executor> {
        C9758c() {
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: a */
        public void mo13721b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(C9755r0.m14059i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$d */
    /* loaded from: classes2.dex */
    class C9759d implements C9610f2.InterfaceC9614d<ScheduledExecutorService> {
        C9759d() {
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: a */
        public void mo13721b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: c */
        public ScheduledExecutorService create() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C9755r0.m14059i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$e */
    /* loaded from: classes2.dex */
    class C9760e implements InterfaceC5058r<C5055p> {
        C9760e() {
        }

        @Override // com.google.common.base.InterfaceC5058r
        /* renamed from: a */
        public C5055p get() {
            return C5055p.m25764c();
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$f */
    /* loaded from: classes2.dex */
    class C9761f implements InterfaceC9773s {

        /* renamed from: a */
        final /* synthetic */ AbstractC10001l.AbstractC10002a f22917a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9773s f22918b;

        C9761f(AbstractC10001l.AbstractC10002a abstractC10002a, InterfaceC9773s interfaceC9773s) {
            this.f22917a = abstractC10002a;
            this.f22918b = interfaceC9773s;
        }

        @Override // io.grpc.p384h1.InterfaceC9773s
        /* renamed from: b */
        public InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
            AbstractC10001l.C10004c.C10005a m13331a = AbstractC10001l.C10004c.m13331a();
            m13331a.m13328b(c9502d);
            AbstractC10001l m14054n = C9755r0.m14054n(this.f22917a, m13331a.m13329a(), c10049s0);
            C5051n.m25773u(abstractC10001lArr[abstractC10001lArr.length - 1] == C9755r0.f22913m, "lb tracer already assigned");
            abstractC10001lArr[abstractC10001lArr.length - 1] = m14054n;
            return this.f22918b.mo13637b(c10060t0, c10049s0, c9502d, abstractC10001lArr);
        }

        @Override // io.grpc.InterfaceC10006l0
        /* renamed from: f */
        public C9526h0 mo13324f() {
            return this.f22918b.mo13324f();
        }

        @Override // io.grpc.p384h1.InterfaceC9773s
        /* renamed from: g */
        public void mo13628g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
            this.f22918b.mo13628g(interfaceC9774a, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$g */
    /* loaded from: classes2.dex */
    public class C9762g extends AbstractC9684j0 {

        /* renamed from: a */
        final AbstractC10001l f22919a;

        /* renamed from: b */
        volatile AbstractC10001l f22920b;

        /* renamed from: c */
        final /* synthetic */ AbstractC10001l.AbstractC10002a f22921c;

        /* renamed from: d */
        final /* synthetic */ AbstractC10001l.C10004c f22922d;

        /* renamed from: e */
        final /* synthetic */ C10049s0 f22923e;

        /* compiled from: GrpcUtil.java */
        /* renamed from: io.grpc.h1.r0$g$a */
        /* loaded from: classes2.dex */
        class C9763a extends AbstractC10001l {
            C9763a(C9762g c9762g) {
            }
        }

        C9762g(AbstractC10001l.AbstractC10002a abstractC10002a, AbstractC10001l.C10004c c10004c, C10049s0 c10049s0) {
            this.f22921c = abstractC10002a;
            this.f22922d = c10004c;
            this.f22923e = c10049s0;
            C9763a c9763a = new C9763a(this);
            this.f22919a = c9763a;
            this.f22920b = c9763a;
        }

        @Override // io.grpc.AbstractC9507d1
        /* renamed from: i */
        public void mo14047i(C9497c1 c9497c1) {
            m14045o(this.f22922d, this.f22923e);
            mo14046n().mo14047i(c9497c1);
        }

        @Override // io.grpc.AbstractC10001l
        /* renamed from: m */
        public void mo13333m(C9477a c9477a, C10049s0 c10049s0) {
            AbstractC10001l.C10004c.C10005a m13330b = this.f22922d.m13330b();
            m13330b.m13325e(c9477a);
            m14045o(m13330b.m13329a(), c10049s0);
            mo14046n().mo13333m(c9477a, c10049s0);
        }

        @Override // io.grpc.p384h1.AbstractC9684j0
        /* renamed from: n */
        protected AbstractC10001l mo14046n() {
            return this.f22920b;
        }

        /* renamed from: o */
        void m14045o(AbstractC10001l.C10004c c10004c, C10049s0 c10049s0) {
            if (this.f22920b != this.f22919a) {
                return;
            }
            synchronized (this) {
                if (this.f22920b == this.f22919a) {
                    this.f22920b = this.f22921c.mo13332a(c10004c, c10049s0);
                }
            }
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$h */
    /* loaded from: classes2.dex */
    private static final class C9764h implements C9897i0.InterfaceC9898a<byte[]> {
        private C9764h() {
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: a */
        public /* bridge */ /* synthetic */ byte[] mo13173a(Object obj) {
            byte[] bArr = (byte[]) obj;
            m14043d(bArr);
            return bArr;
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo13172b(byte[] bArr) {
            m14044c(bArr);
            return bArr;
        }

        /* renamed from: c */
        public byte[] m14044c(byte[] bArr) {
            return bArr;
        }

        /* renamed from: d */
        public byte[] m14043d(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ C9764h(C9756a c9756a) {
            this();
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$i */
    /* loaded from: classes2.dex */
    public enum EnumC9765i {
        NO_ERROR(0, C9497c1.f22195n),
        PROTOCOL_ERROR(1, C9497c1.f22194m),
        INTERNAL_ERROR(2, C9497c1.f22194m),
        FLOW_CONTROL_ERROR(3, C9497c1.f22194m),
        SETTINGS_TIMEOUT(4, C9497c1.f22194m),
        STREAM_CLOSED(5, C9497c1.f22194m),
        FRAME_SIZE_ERROR(6, C9497c1.f22194m),
        REFUSED_STREAM(7, C9497c1.f22195n),
        CANCEL(8, C9497c1.f22188g),
        COMPRESSION_ERROR(9, C9497c1.f22194m),
        CONNECT_ERROR(10, C9497c1.f22194m),
        ENHANCE_YOUR_CALM(11, C9497c1.f22193l.m14578r("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, C9497c1.f22191j.m14578r("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, C9497c1.f22189h);
        

        /* renamed from: I */
        private static final EnumC9765i[] f22932I = m14042a();

        /* renamed from: c */
        private final int f22940c;

        /* renamed from: d */
        private final C9497c1 f22941d;

        EnumC9765i(int i, C9497c1 c9497c1) {
            this.f22940c = i;
            String str = "HTTP/2 error code: " + name();
            if (c9497c1.m14581o() != null) {
                str = str + " (" + c9497c1.m14581o() + ")";
            }
            this.f22941d = c9497c1.m14578r(str);
        }

        /* renamed from: a */
        private static EnumC9765i[] m14042a() {
            EnumC9765i[] values = values();
            EnumC9765i[] enumC9765iArr = new EnumC9765i[((int) values[values.length - 1].m14041b()) + 1];
            for (EnumC9765i enumC9765i : values) {
                enumC9765iArr[(int) enumC9765i.m14041b()] = enumC9765i;
            }
            return enumC9765iArr;
        }

        /* renamed from: e */
        public static EnumC9765i m14040e(long j) {
            EnumC9765i[] enumC9765iArr = f22932I;
            if (j >= enumC9765iArr.length || j < 0) {
                return null;
            }
            return enumC9765iArr[(int) j];
        }

        /* renamed from: h */
        public static C9497c1 m14038h(long j) {
            EnumC9765i m14040e = m14040e(j);
            if (m14040e == null) {
                C9497c1 m14587i = C9497c1.m14587i(INTERNAL_ERROR.m14039g().m14582n().m14575e());
                return m14587i.m14578r("Unrecognized HTTP/2 error code: " + j);
            }
            return m14040e.m14039g();
        }

        /* renamed from: b */
        public long m14041b() {
            return this.f22940c;
        }

        /* renamed from: g */
        public C9497c1 m14039g() {
            return this.f22941d;
        }
    }

    /* compiled from: GrpcUtil.java */
    /* renamed from: io.grpc.h1.r0$j */
    /* loaded from: classes2.dex */
    static class C9766j implements C10049s0.InterfaceC10053d<Long> {
        C9766j() {
        }

        @Override // io.grpc.C10049s0.InterfaceC10053d
        /* renamed from: c */
        public Long mo13192b(String str) {
            C5051n.m25789e(str.length() > 0, "empty timeout");
            C5051n.m25789e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt != 'H') {
                if (charAt != 'M') {
                    if (charAt != 'S') {
                        if (charAt != 'u') {
                            if (charAt != 'm') {
                                if (charAt == 'n') {
                                    return Long.valueOf(parseLong);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }

        @Override // io.grpc.C10049s0.InterfaceC10053d
        /* renamed from: d */
        public String mo13193a(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() >= 0) {
                if (l.longValue() < 100000000) {
                    return l + "n";
                } else if (l.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l.longValue()) + "u";
                } else if (l.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l.longValue()) + "m";
                } else if (l.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l.longValue()) + "S";
                } else if (l.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l.longValue()) + "M";
                } else {
                    return timeUnit.toHours(l.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }
    }

    static {
        Charset.forName("US-ASCII");
        f22902b = C10049s0.AbstractC10055f.m13185e("grpc-timeout", new C9766j());
        f22903c = C10049s0.AbstractC10055f.m13185e("grpc-encoding", C10049s0.f23786c);
        f22904d = C9897i0.m13744b("grpc-accept-encoding", new C9764h(null));
        f22905e = C10049s0.AbstractC10055f.m13185e("content-encoding", C10049s0.f23786c);
        f22906f = C9897i0.m13744b("accept-encoding", new C9764h(null));
        f22907g = C10049s0.AbstractC10055f.m13185e("content-type", C10049s0.f23786c);
        f22908h = C10049s0.AbstractC10055f.m13185e("te", C10049s0.f23786c);
        f22909i = C10049s0.AbstractC10055f.m13185e("user-agent", C10049s0.f23786c);
        C5052o.m25770a(',').m25768c();
        f22910j = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        f22911k = new C9794u1();
        f22912l = C9502d.C9503a.m14546b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f22913m = new C9757b();
        f22914n = new C9758c();
        f22915o = new C9759d();
        f22916p = new C9760e();
    }

    private C9755r0() {
    }

    /* renamed from: b */
    public static URI m14066b(String str) {
        C5051n.m25779o(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: " + str, e);
        }
    }

    /* renamed from: c */
    public static String m14065c(String str) {
        URI m14066b = m14066b(str);
        C5051n.m25784j(m14066b.getHost() != null, "No host in authority '%s'", str);
        C5051n.m25784j(m14066b.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m14064d(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
        while (true) {
            InputStream next = interfaceC9696a.next();
            if (next == null) {
                return;
            }
            m14063e(next);
        }
    }

    /* renamed from: e */
    public static void m14063e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            f22901a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    /* renamed from: f */
    public static AbstractC10001l[] m14062f(C9502d c9502d, C10049s0 c10049s0, int i, boolean z) {
        List<AbstractC10001l.AbstractC10002a> m14558i = c9502d.m14558i();
        int size = m14558i.size() + 1;
        AbstractC10001l[] abstractC10001lArr = new AbstractC10001l[size];
        AbstractC10001l.C10004c.C10005a m13331a = AbstractC10001l.C10004c.m13331a();
        m13331a.m13328b(c9502d);
        m13331a.m13326d(i);
        m13331a.m13327c(z);
        AbstractC10001l.C10004c m13329a = m13331a.m13329a();
        for (int i2 = 0; i2 < m14558i.size(); i2++) {
            abstractC10001lArr[i2] = m14054n(m14558i.get(i2), m13329a, c10049s0);
        }
        abstractC10001lArr[size - 1] = f22913m;
        return abstractC10001lArr;
    }

    /* renamed from: g */
    public static String m14061g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.41.0");
        return sb.toString();
    }

    /* renamed from: h */
    public static String m14060h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: i */
    public static ThreadFactory m14059i(String str, boolean z) {
        C5165g c5165g = new C5165g();
        c5165g.m25483e(z);
        c5165g.m25482f(str);
        return c5165g.m25486b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static InterfaceC9773s m14058j(AbstractC10020n0.C10026e c10026e, boolean z) {
        AbstractC10020n0.AbstractC10030h m13286c = c10026e.m13286c();
        InterfaceC9773s mo13910a = m13286c != null ? ((InterfaceC9724n2) m13286c.mo13265d()).mo13910a() : null;
        if (mo13910a != null) {
            AbstractC10001l.AbstractC10002a m13287b = c10026e.m13287b();
            return m13287b == null ? mo13910a : new C9761f(m13287b, mo13910a);
        }
        if (!c10026e.m13288a().m14580p()) {
            if (c10026e.m13285d()) {
                return new C9621g0(c10026e.m13288a(), InterfaceC9753r.EnumC9754a.DROPPED);
            }
            if (!z) {
                return new C9621g0(c10026e.m13288a(), InterfaceC9753r.EnumC9754a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: k */
    private static C9497c1.EnumC9499b m14057k(int i) {
        if (i >= 100 && i < 200) {
            return C9497c1.EnumC9499b.INTERNAL;
        }
        if (i != 400) {
            if (i != 401) {
                if (i != 403) {
                    if (i != 404) {
                        if (i != 429) {
                            if (i != 431) {
                                switch (i) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        break;
                                    default:
                                        return C9497c1.EnumC9499b.UNKNOWN;
                                }
                            }
                        }
                        return C9497c1.EnumC9499b.UNAVAILABLE;
                    }
                    return C9497c1.EnumC9499b.UNIMPLEMENTED;
                }
                return C9497c1.EnumC9499b.PERMISSION_DENIED;
            }
            return C9497c1.EnumC9499b.UNAUTHENTICATED;
        }
        return C9497c1.EnumC9499b.INTERNAL;
    }

    /* renamed from: l */
    public static C9497c1 m14056l(int i) {
        C9497c1 m14576b = m14057k(i).m14576b();
        return m14576b.m14578r("HTTP status code " + i);
    }

    /* renamed from: m */
    public static boolean m14055m(String str) {
        char charAt;
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc")) {
                return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    static AbstractC10001l m14054n(AbstractC10001l.AbstractC10002a abstractC10002a, AbstractC10001l.C10004c c10004c, C10049s0 c10049s0) {
        if (abstractC10002a instanceof AbstractC10001l.AbstractC10003b) {
            return abstractC10002a.mo13332a(c10004c, c10049s0);
        }
        return new C9762g(abstractC10002a, c10004c, c10049s0);
    }

    /* renamed from: o */
    public static boolean m14053o(C9502d c9502d) {
        return !Boolean.TRUE.equals(c9502d.m14559h(f22912l));
    }
}
