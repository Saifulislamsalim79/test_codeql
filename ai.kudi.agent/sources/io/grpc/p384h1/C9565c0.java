package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import com.google.common.base.C5059s;
import com.google.common.base.C5062u;
import com.google.common.base.VerifyException;
import io.grpc.AbstractC10069u0;
import io.grpc.AbstractC10091y0;
import io.grpc.C10090y;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.ExecutorC9513e1;
import io.grpc.InterfaceC10094z0;
import io.grpc.p384h1.C9610f2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: DnsNameResolver.java */
/* renamed from: io.grpc.h1.c0 */
/* loaded from: classes2.dex */
public class C9565c0 extends AbstractC10069u0 {

    /* renamed from: B */
    private static String f22389B;

    /* renamed from: a */
    final InterfaceC10094z0 f22398a;

    /* renamed from: b */
    private final Random f22399b = new Random();

    /* renamed from: c */
    protected volatile InterfaceC9567b f22400c = EnumC9569d.INSTANCE;

    /* renamed from: d */
    private final AtomicReference<InterfaceC9572f> f22401d = new AtomicReference<>();

    /* renamed from: e */
    private final String f22402e;

    /* renamed from: f */
    private final String f22403f;

    /* renamed from: g */
    private final int f22404g;

    /* renamed from: h */
    private final C9610f2.InterfaceC9614d<Executor> f22405h;

    /* renamed from: i */
    private final long f22406i;

    /* renamed from: j */
    private final ExecutorC9513e1 f22407j;

    /* renamed from: k */
    private final C5055p f22408k;

    /* renamed from: l */
    protected boolean f22409l;

    /* renamed from: m */
    private boolean f22410m;

    /* renamed from: n */
    private Executor f22411n;

    /* renamed from: o */
    private final boolean f22412o;

    /* renamed from: p */
    private final AbstractC10069u0.AbstractC10079h f22413p;

    /* renamed from: q */
    private boolean f22414q;

    /* renamed from: r */
    private AbstractC10069u0.AbstractC10075e f22415r;

    /* renamed from: s */
    private static final Logger f22390s = Logger.getLogger(C9565c0.class.getName());

    /* renamed from: t */
    private static final Set<String> f22391t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u */
    private static final String f22392u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");

    /* renamed from: v */
    private static final String f22393v = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");

    /* renamed from: w */
    private static final String f22394w = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");

    /* renamed from: x */
    static boolean f22395x = Boolean.parseBoolean(f22392u);

    /* renamed from: y */
    static boolean f22396y = Boolean.parseBoolean(f22393v);

    /* renamed from: z */
    protected static boolean f22397z = Boolean.parseBoolean(f22394w);

    /* renamed from: A */
    private static final InterfaceC9573g f22388A = m14434v(C9565c0.class.getClassLoader());

    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9567b {
        /* renamed from: a */
        List<InetAddress> mo14423a(String str) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$c */
    /* loaded from: classes2.dex */
    public static final class C9568c {

        /* renamed from: a */
        private C9497c1 f22416a;

        /* renamed from: b */
        private List<C10090y> f22417b;

        /* renamed from: c */
        private AbstractC10069u0.C10073c f22418c;

        /* renamed from: d */
        public C9477a f22419d;

        private C9568c() {
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$d */
    /* loaded from: classes2.dex */
    private enum EnumC9569d implements InterfaceC9567b {
        INSTANCE;

        @Override // io.grpc.p384h1.C9565c0.InterfaceC9567b
        /* renamed from: a */
        public List<InetAddress> mo14423a(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$e */
    /* loaded from: classes2.dex */
    public final class RunnableC9570e implements Runnable {

        /* renamed from: c */
        private final AbstractC10069u0.AbstractC10075e f22422c;

        /* compiled from: DnsNameResolver.java */
        /* renamed from: io.grpc.h1.c0$e$a */
        /* loaded from: classes2.dex */
        class RunnableC9571a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ boolean f22424c;

            RunnableC9571a(boolean z) {
                this.f22424c = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f22424c) {
                    C9565c0 c9565c0 = C9565c0.this;
                    c9565c0.f22409l = true;
                    if (c9565c0.f22406i > 0) {
                        C5055p c5055p = C9565c0.this.f22408k;
                        c5055p.m25761f();
                        c5055p.m25760g();
                    }
                }
                C9565c0.this.f22414q = false;
            }
        }

        RunnableC9570e(AbstractC10069u0.AbstractC10075e abstractC10075e) {
            C5051n.m25779o(abstractC10075e, "savedListener");
            this.f22422c = abstractC10075e;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC9513e1 executorC9513e1;
            RunnableC9571a runnableC9571a;
            if (C9565c0.f22390s.isLoggable(Level.FINER)) {
                Logger logger = C9565c0.f22390s;
                logger.finer("Attempting DNS resolution of " + C9565c0.this.f22403f);
            }
            C9568c c9568c = null;
            boolean z = true;
            try {
                try {
                    C10090y m14442n = C9565c0.this.m14442n();
                    AbstractC10069u0.C10077g.C10078a m13112d = AbstractC10069u0.C10077g.m13112d();
                    if (m14442n != null) {
                        if (C9565c0.f22390s.isLoggable(Level.FINER)) {
                            Logger logger2 = C9565c0.f22390s;
                            logger2.finer("Using proxy address " + m14442n);
                        }
                        m13112d.m13110b(Collections.singletonList(m14442n));
                    } else {
                        c9568c = C9565c0.this.m14441o(false);
                        if (c9568c.f22416a != null) {
                            this.f22422c.mo13117a(c9568c.f22416a);
                            return;
                        }
                        if (c9568c.f22417b != null) {
                            m13112d.m13110b(c9568c.f22417b);
                        }
                        if (c9568c.f22418c != null) {
                            m13112d.m13108d(c9568c.f22418c);
                        }
                        if (c9568c.f22419d != null) {
                            m13112d.m13109c(c9568c.f22419d);
                        }
                    }
                    this.f22422c.mo13118c(m13112d.m13111a());
                    z = (c9568c == null || c9568c.f22416a != null) ? false : false;
                    executorC9513e1 = C9565c0.this.f22407j;
                    runnableC9571a = new RunnableC9571a(z);
                } catch (IOException e) {
                    AbstractC10069u0.AbstractC10075e abstractC10075e = this.f22422c;
                    C9497c1 c9497c1 = C9497c1.f22195n;
                    abstractC10075e.mo13117a(c9497c1.m14578r("Unable to resolve host " + C9565c0.this.f22403f).m14579q(e));
                    z = (0 == 0 || null.f22416a != null) ? false : false;
                    executorC9513e1 = C9565c0.this.f22407j;
                    runnableC9571a = new RunnableC9571a(z);
                }
                executorC9513e1.execute(runnableC9571a);
            } finally {
                C9565c0.this.f22407j.execute(new RunnableC9571a((0 == 0 || null.f22416a != null) ? false : false));
            }
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC9572f {
        /* renamed from: a */
        List<String> mo13833a(String str) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DnsNameResolver.java */
    /* renamed from: io.grpc.h1.c0$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC9573g {
        /* renamed from: a */
        InterfaceC9572f mo13840a();

        /* renamed from: b */
        Throwable mo13839b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9565c0(String str, String str2, AbstractC10069u0.C10071b c10071b, C9610f2.InterfaceC9614d<Executor> interfaceC9614d, C5055p c5055p, boolean z) {
        C5051n.m25779o(c10071b, "args");
        this.f22405h = interfaceC9614d;
        StringBuilder sb = new StringBuilder();
        sb.append("//");
        C5051n.m25779o(str2, "name");
        sb.append(str2);
        URI create = URI.create(sb.toString());
        C5051n.m25784j(create.getHost() != null, "Invalid DNS name: %s", str2);
        String authority = create.getAuthority();
        C5051n.m25778p(authority, "nameUri (%s) doesn't have an authority", create);
        this.f22402e = authority;
        this.f22403f = create.getHost();
        if (create.getPort() == -1) {
            this.f22404g = c10071b.m13136a();
        } else {
            this.f22404g = create.getPort();
        }
        InterfaceC10094z0 m13134c = c10071b.m13134c();
        C5051n.m25779o(m13134c, "proxyDetector");
        this.f22398a = m13134c;
        this.f22406i = m14437s(z);
        C5051n.m25779o(c5055p, "stopwatch");
        this.f22408k = c5055p;
        ExecutorC9513e1 m13132e = c10071b.m13132e();
        C5051n.m25779o(m13132e, "syncContext");
        this.f22407j = m13132e;
        Executor m13135b = c10071b.m13135b();
        this.f22411n = m13135b;
        this.f22412o = m13135b == null;
        AbstractC10069u0.AbstractC10079h m13133d = c10071b.m13133d();
        C5051n.m25779o(m13133d, "serviceConfigParser");
        this.f22413p = m13133d;
    }

    /* renamed from: A */
    private List<C10090y> m14453A() {
        Exception e = null;
        try {
            try {
                List<InetAddress> mo14423a = this.f22400c.mo14423a(this.f22403f);
                ArrayList arrayList = new ArrayList(mo14423a.size());
                for (InetAddress inetAddress : mo14423a) {
                    arrayList.add(new C10090y(new InetSocketAddress(inetAddress, this.f22404g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e2) {
                e = e2;
                C5059s.m25750f(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (e != null) {
                f22390s.log(Level.FINE, "Address resolution failure", (Throwable) e);
            }
            throw th;
        }
    }

    /* renamed from: B */
    private AbstractC10069u0.C10073c m14452B() {
        List<String> emptyList = Collections.emptyList();
        InterfaceC9572f m14435u = m14435u();
        if (m14435u != null) {
            try {
                emptyList = m14435u.mo13833a("_grpc_config." + this.f22403f);
            } catch (Exception e) {
                f22390s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e);
            }
        }
        if (!emptyList.isEmpty()) {
            AbstractC10069u0.C10073c m14432x = m14432x(emptyList, this.f22399b, m14438r());
            if (m14432x != null) {
                if (m14432x.m13119d() != null) {
                    return AbstractC10069u0.C10073c.m13121b(m14432x.m13119d());
                }
                return this.f22413p.mo13107a((Map) m14432x.m13120c());
            }
            return null;
        }
        f22390s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f22403f});
        return null;
    }

    /* renamed from: C */
    protected static boolean m14451C(boolean z, boolean z2, String str) {
        if (z) {
            if ("localhost".equalsIgnoreCase(str)) {
                return z2;
            }
            if (str.contains(":")) {
                return false;
            }
            boolean z3 = true;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt != '.') {
                    z3 &= charAt >= '0' && charAt <= '9';
                }
            }
            return true ^ z3;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m14443m() {
        if (this.f22409l) {
            long j = this.f22406i;
            if (j != 0 && (j <= 0 || this.f22408k.m25763d(TimeUnit.NANOSECONDS) <= this.f22406i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public C10090y m14442n() throws IOException {
        AbstractC10091y0 mo13073a = this.f22398a.mo13073a(InetSocketAddress.createUnresolved(this.f22403f, this.f22404g));
        if (mo13073a != null) {
            return new C10090y(mo13073a);
        }
        return null;
    }

    /* renamed from: p */
    private static final List<String> m14440p(Map<String, ?> map) {
        return C9562b1.m14464g(map, "clientLanguage");
    }

    /* renamed from: q */
    private static final List<String> m14439q(Map<String, ?> map) {
        return C9562b1.m14464g(map, "clientHostname");
    }

    /* renamed from: r */
    private static String m14438r() {
        if (f22389B == null) {
            try {
                f22389B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f22389B;
    }

    /* renamed from: s */
    private static long m14437s(boolean z) {
        if (z) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f22390s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    /* renamed from: t */
    private static final Double m14436t(Map<String, ?> map) {
        return C9562b1.m14463h(map, "percentage");
    }

    /* renamed from: v */
    static InterfaceC9573g m14434v(ClassLoader classLoader) {
        try {
            try {
                try {
                    InterfaceC9573g interfaceC9573g = (InterfaceC9573g) Class.forName("io.grpc.h1.z0", true, classLoader).asSubclass(InterfaceC9573g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (interfaceC9573g.mo13839b() != null) {
                        f22390s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", interfaceC9573g.mo13839b());
                        return null;
                    }
                    return interfaceC9573g;
                } catch (Exception e) {
                    f22390s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                    return null;
                }
            } catch (Exception e2) {
                f22390s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
                return null;
            }
        } catch (ClassCastException e3) {
            f22390s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
            return null;
        } catch (ClassNotFoundException e4) {
            f22390s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
            return null;
        }
    }

    /* renamed from: w */
    static Map<String, ?> m14433w(Map<String, ?> map, Random random, String str) {
        boolean z;
        boolean z2;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            C5062u.m25747a(f22391t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> m14440p = m14440p(map);
        if (m14440p != null && !m14440p.isEmpty()) {
            Iterator<String> it = m14440p.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return null;
            }
        }
        Double m14436t = m14436t(map);
        if (m14436t != null) {
            int intValue = m14436t.intValue();
            C5062u.m25747a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", m14436t);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> m14439q = m14439q(map);
        if (m14439q != null && !m14439q.isEmpty()) {
            Iterator<String> it2 = m14439q.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return null;
            }
        }
        Map<String, ?> m14461j = C9562b1.m14461j(map, "serviceConfig");
        if (m14461j != null) {
            return m14461j;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* renamed from: x */
    static AbstractC10069u0.C10073c m14432x(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map<String, ?> map2 : m14431y(list)) {
                try {
                    map = m14433w(map2, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e) {
                    return AbstractC10069u0.C10073c.m13121b(C9497c1.f22189h.m14578r("failed to pick service config choice").m14579q(e));
                }
            }
            if (map == null) {
                return null;
            }
            return AbstractC10069u0.C10073c.m13122a(map);
        } catch (IOException | RuntimeException e2) {
            return AbstractC10069u0.C10073c.m13121b(C9497c1.f22189h.m14578r("failed to parse TXT records").m14579q(e2));
        }
    }

    /* renamed from: y */
    static List<Map<String, ?>> m14431y(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.startsWith("grpc_config=")) {
                f22390s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                Object m14486a = C9538a1.m14486a(str.substring(12));
                if (m14486a instanceof List) {
                    List list2 = (List) m14486a;
                    C9562b1.m14470a(list2);
                    arrayList.addAll(list2);
                } else {
                    throw new ClassCastException("wrong type " + m14486a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private void m14430z() {
        if (this.f22414q || this.f22410m || !m14443m()) {
            return;
        }
        this.f22414q = true;
        this.f22411n.execute(new RunnableC9570e(this.f22415r));
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: a */
    public String mo13141a() {
        return this.f22402e;
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: b */
    public void mo13140b() {
        C5051n.m25773u(this.f22415r != null, "not started");
        m14430z();
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: c */
    public void mo13139c() {
        if (this.f22410m) {
            return;
        }
        this.f22410m = true;
        Executor executor = this.f22411n;
        if (executor == null || !this.f22412o) {
            return;
        }
        this.f22411n = (Executor) C9610f2.m14334f(this.f22405h, executor);
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: d */
    public void mo13138d(AbstractC10069u0.AbstractC10075e abstractC10075e) {
        C5051n.m25773u(this.f22415r == null, "already started");
        if (this.f22412o) {
            this.f22411n = (Executor) C9610f2.m14336d(this.f22405h);
        }
        C5051n.m25779o(abstractC10075e, "listener");
        this.f22415r = abstractC10075e;
        m14430z();
    }

    /* renamed from: o */
    protected C9568c m14441o(boolean z) {
        C9568c c9568c = new C9568c();
        try {
            c9568c.f22417b = m14453A();
        } catch (Exception e) {
            if (!z) {
                C9497c1 c9497c1 = C9497c1.f22195n;
                c9568c.f22416a = c9497c1.m14578r("Unable to resolve host " + this.f22403f).m14579q(e);
                return c9568c;
            }
        }
        if (f22397z) {
            c9568c.f22418c = m14452B();
        }
        return c9568c;
    }

    /* renamed from: u */
    protected InterfaceC9572f m14435u() {
        InterfaceC9573g interfaceC9573g;
        if (m14451C(f22395x, f22396y, this.f22403f)) {
            InterfaceC9572f interfaceC9572f = this.f22401d.get();
            return (interfaceC9572f != null || (interfaceC9573g = f22388A) == null) ? interfaceC9572f : interfaceC9573g.mo13840a();
        }
        return null;
    }
}
