package com.github.kittinunf.fuel.core;

import com.github.kittinunf.fuel.core.C2460n;
import com.github.kittinunf.fuel.core.InterfaceC2427d;
import com.github.kittinunf.fuel.core.p090x.C2506b;
import com.github.kittinunf.fuel.core.p090x.C2509c;
import java.net.Proxy;
import java.security.KeyStore;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.C13287o;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11804o;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p488g0.InterfaceC11823c;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p272h.p275b.p276a.p277a.p278b.C8213a;
import p272h.p275b.p276a.p277a.p279c.C8224b;
/* compiled from: FuelManager.kt */
/* renamed from: com.github.kittinunf.fuel.core.l */
/* loaded from: classes2.dex */
public final class C2448l {

    /* renamed from: b */
    private Proxy f7006b;

    /* renamed from: c */
    private String f7007c;

    /* renamed from: h */
    private Map<String, String> f7012h;

    /* renamed from: i */
    private List<? extends C13287o<String, ? extends Object>> f7013i;

    /* renamed from: j */
    private KeyStore f7014j;

    /* renamed from: k */
    private final InterfaceC11823c f7015k;

    /* renamed from: l */
    private final InterfaceC11823c f7016l;

    /* renamed from: m */
    private final InterfaceC11823c f7017m;

    /* renamed from: n */
    private final List<InterfaceC11767l<InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>, InterfaceC11767l<InterfaceC2464q, InterfaceC2464q>>> f7018n;

    /* renamed from: o */
    private final List<InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u>, InterfaceC11771p<InterfaceC2464q, C2500u, C2500u>>> f7019o;

    /* renamed from: p */
    private final InterfaceC11823c f7020p;

    /* renamed from: q */
    static final /* synthetic */ InterfaceC11872i[] f7002q = {C11813x.m10313e(new C11804o(C11813x.m10316b(C2448l.class), "client", "getClient()Lcom/github/kittinunf/fuel/core/Client;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C2448l.class), "socketFactory", "getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C2448l.class), "hostnameVerifier", "getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C2448l.class), "executorService", "getExecutorService()Ljava/util/concurrent/ExecutorService;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C2448l.class), "callbackExecutor", "getCallbackExecutor()Ljava/util/concurrent/Executor;"))};

    /* renamed from: s */
    public static final C2450b f7004s = new C2450b(null);

    /* renamed from: r */
    private static final InterfaceC11823c f7003r = C8224b.m16460a(C2449a.f7021c);

    /* renamed from: a */
    private final InterfaceC11823c f7005a = C8224b.m16460a(new C2454f());

    /* renamed from: d */
    private int f7008d = 15000;

    /* renamed from: e */
    private int f7009e = 15000;

    /* renamed from: f */
    private int f7010f = 8192;

    /* renamed from: g */
    private InterfaceC2427d.InterfaceC2428a f7011g = new C2431f();

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$a */
    /* loaded from: classes2.dex */
    static final class C2449a extends AbstractC11802m implements InterfaceC11756a<C2448l> {

        /* renamed from: c */
        public static final C2449a f7021c = new C2449a();

        C2449a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C2448l invoke() {
            return new C2448l();
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$b */
    /* loaded from: classes2.dex */
    public static final class C2450b {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC11872i[] f7022a = {C11813x.m10313e(new C11804o(C11813x.m10316b(C2450b.class), "instance", "getInstance()Lcom/github/kittinunf/fuel/core/FuelManager;"))};

        private C2450b() {
        }

        /* renamed from: a */
        public final C2448l m32857a() {
            return (C2448l) C2448l.f7003r.mo10298b(C2448l.f7004s, f7022a[0]);
        }

        /* renamed from: b */
        public final int m32856b() {
            return C2448l.f7004s.m32857a().m32863j();
        }

        public /* synthetic */ C2450b(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$c */
    /* loaded from: classes2.dex */
    public static final class C2451c extends AbstractC11802m implements InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> {

        /* renamed from: c */
        public static final C2451c f7023c = new C2451c();

        C2451c() {
            super(1);
        }

        /* renamed from: a */
        public final InterfaceC2464q m32855a(InterfaceC2464q interfaceC2464q) {
            kotlin.e0.d.l.g(interfaceC2464q, "r");
            return interfaceC2464q;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC2464q invoke(InterfaceC2464q interfaceC2464q) {
            InterfaceC2464q interfaceC2464q2 = interfaceC2464q;
            m32855a(interfaceC2464q2);
            return interfaceC2464q2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$d */
    /* loaded from: classes2.dex */
    public static final class C2452d extends AbstractC11802m implements InterfaceC11771p<InterfaceC2464q, C2500u, C2500u> {

        /* renamed from: c */
        public static final C2452d f7024c = new C2452d();

        C2452d() {
            super(2);
        }

        /* renamed from: a */
        public final C2500u m32854a(InterfaceC2464q interfaceC2464q, C2500u c2500u) {
            kotlin.e0.d.l.g(interfaceC2464q, "<anonymous parameter 0>");
            kotlin.e0.d.l.g(c2500u, "res");
            return c2500u;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C2500u invoke(InterfaceC2464q interfaceC2464q, C2500u c2500u) {
            C2500u c2500u2 = c2500u;
            m32854a(interfaceC2464q, c2500u2);
            return c2500u2;
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$e */
    /* loaded from: classes2.dex */
    static final class C2453e extends AbstractC11802m implements InterfaceC11756a<Executor> {

        /* renamed from: c */
        public static final C2453e f7025c = new C2453e();

        C2453e() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Executor invoke() {
            return C2447k.m32873a().mo32874a();
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$f */
    /* loaded from: classes2.dex */
    static final class C2454f extends AbstractC11802m implements InterfaceC11756a<C8213a> {
        C2454f() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C8213a invoke() {
            return new C8213a(C2448l.this.m32862k(), false, false, C2448l.this.m32866g(), 6, null);
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$g */
    /* loaded from: classes2.dex */
    static final class C2455g extends AbstractC11802m implements InterfaceC11756a<ExecutorService> {

        /* renamed from: c */
        public static final C2455g f7027c = new C2455g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FuelManager.kt */
        /* renamed from: com.github.kittinunf.fuel.core.l$g$a */
        /* loaded from: classes2.dex */
        public static final class ThreadFactoryC2456a implements ThreadFactory {

            /* renamed from: c */
            public static final ThreadFactoryC2456a f7028c = new ThreadFactoryC2456a();

            ThreadFactoryC2456a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setPriority(5);
                thread.setDaemon(true);
                return thread;
            }
        }

        C2455g() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool(ThreadFactoryC2456a.f7028c);
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$h */
    /* loaded from: classes2.dex */
    static final class C2457h extends AbstractC11802m implements InterfaceC11756a<HostnameVerifier> {

        /* renamed from: c */
        public static final C2457h f7029c = new C2457h();

        C2457h() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final HostnameVerifier invoke() {
            return HttpsURLConnection.getDefaultHostnameVerifier();
        }
    }

    /* compiled from: FuelManager.kt */
    /* renamed from: com.github.kittinunf.fuel.core.l$i */
    /* loaded from: classes2.dex */
    static final class C2458i extends AbstractC11802m implements InterfaceC11756a<SSLSocketFactory> {
        C2458i() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final SSLSocketFactory invoke() {
            KeyStore m32864i = C2448l.this.m32864i();
            if (m32864i != null) {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(m32864i);
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                kotlin.e0.d.l.c(trustManagerFactory, "trustFactory");
                sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
                kotlin.e0.d.l.c(sSLContext, "sslContext");
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                if (socketFactory != null) {
                    return socketFactory;
                }
            }
            return HttpsURLConnection.getDefaultSSLSocketFactory();
        }
    }

    public C2448l() {
        List<? extends C13287o<String, ? extends Object>> m3891e;
        List<InterfaceC11767l<InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>, InterfaceC11767l<InterfaceC2464q, InterfaceC2464q>>> m3885k;
        List<InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u>, InterfaceC11771p<InterfaceC2464q, C2500u, C2500u>>> m3885k2;
        m3891e = C13726r.m3891e();
        this.f7013i = m3891e;
        this.f7015k = C8224b.m16460a(new C2458i());
        this.f7016l = C8224b.m16460a(C2457h.f7029c);
        this.f7017m = C8224b.m16460a(C2455g.f7027c);
        m3885k = C13726r.m3885k(C2506b.f7131c);
        this.f7018n = m3885k;
        m3885k2 = C13726r.m3885k(C2509c.m32703b(this));
        this.f7019o = m3885k2;
        this.f7020p = C8224b.m16460a(C2453e.f7025c);
    }

    /* renamed from: b */
    private final InterfaceC2464q m32871b(InterfaceC2464q interfaceC2464q) {
        Set<String> keySet = interfaceC2464q.mo32775a().keySet();
        C2460n.C2461a c2461a = C2460n.f7036w;
        Map<String, String> map = this.f7012h;
        if (map == null) {
            map = C13727r0.m3881k();
        }
        C2460n m32827c = c2461a.m32827c(map);
        for (String str : keySet) {
            m32827c.remove(str);
        }
        InterfaceC2464q mo32767i = interfaceC2464q.mo32767i(m32827c);
        InterfaceC2427d m32868e = m32868e();
        SSLSocketFactory m32861l = m32861l();
        HostnameVerifier m32865h = m32865h();
        Executor m32869d = m32869d();
        List<InterfaceC11767l<InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>, InterfaceC11767l<InterfaceC2464q, InterfaceC2464q>>> list = this.f7018n;
        InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> interfaceC11767l = C2451c.f7023c;
        if (!list.isEmpty()) {
            ListIterator<InterfaceC11767l<InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>, InterfaceC11767l<InterfaceC2464q, InterfaceC2464q>>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                interfaceC11767l = listIterator.previous().invoke(interfaceC11767l);
            }
        }
        InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> interfaceC11767l2 = interfaceC11767l;
        List<InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u>, InterfaceC11771p<InterfaceC2464q, C2500u, C2500u>>> list2 = this.f7019o;
        InterfaceC11771p<InterfaceC2464q, C2500u, C2500u> interfaceC11771p = C2452d.f7024c;
        if (!list2.isEmpty()) {
            ListIterator<InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u>, InterfaceC11771p<InterfaceC2464q, C2500u, C2500u>>> listIterator2 = list2.listIterator(list2.size());
            while (listIterator2.hasPrevious()) {
                interfaceC11771p = listIterator2.previous().invoke(interfaceC11771p);
            }
        }
        C2466r c2466r = new C2466r(m32868e, m32861l, m32865h, m32867f(), m32869d, interfaceC11767l2, interfaceC11771p);
        c2466r.m32801q(this.f7008d);
        c2466r.m32800r(this.f7009e);
        mo32767i.mo32763m(c2466r);
        return mo32767i;
    }

    /* renamed from: c */
    public InterfaceC2464q m32870c(String str, List<? extends C13287o<String, ? extends Object>> list) {
        kotlin.e0.d.l.g(str, "path");
        return m32860m(EnumC2462o.GET, str, list);
    }

    /* renamed from: d */
    public final Executor m32869d() {
        return (Executor) this.f7020p.mo10298b(this, f7002q[4]);
    }

    /* renamed from: e */
    public final InterfaceC2427d m32868e() {
        return (InterfaceC2427d) this.f7005a.mo10298b(this, f7002q[0]);
    }

    /* renamed from: f */
    public final ExecutorService m32867f() {
        return (ExecutorService) this.f7017m.mo10298b(this, f7002q[3]);
    }

    /* renamed from: g */
    public final InterfaceC2427d.InterfaceC2428a m32866g() {
        return this.f7011g;
    }

    /* renamed from: h */
    public final HostnameVerifier m32865h() {
        return (HostnameVerifier) this.f7016l.mo10298b(this, f7002q[2]);
    }

    /* renamed from: i */
    public final KeyStore m32864i() {
        return this.f7014j;
    }

    /* renamed from: j */
    public final int m32863j() {
        return this.f7010f;
    }

    /* renamed from: k */
    public final Proxy m32862k() {
        return this.f7006b;
    }

    /* renamed from: l */
    public final SSLSocketFactory m32861l() {
        return (SSLSocketFactory) this.f7015k.mo10298b(this, f7002q[1]);
    }

    /* renamed from: m */
    public InterfaceC2464q m32860m(EnumC2462o enumC2462o, String str, List<? extends C13287o<String, ? extends Object>> list) {
        kotlin.e0.d.l.g(enumC2462o, "method");
        kotlin.e0.d.l.g(str, "path");
        return m32871b(m32859n(new C2443i(enumC2462o, str, this.f7007c, list == null ? this.f7013i : C13742z.m3784n0(this.f7013i, list)).getRequest()));
    }

    /* renamed from: n */
    public InterfaceC2464q m32859n(InterfaceC2499t interfaceC2499t) {
        kotlin.e0.d.l.g(interfaceC2499t, "convertible");
        return m32871b(interfaceC2499t.getRequest());
    }
}
