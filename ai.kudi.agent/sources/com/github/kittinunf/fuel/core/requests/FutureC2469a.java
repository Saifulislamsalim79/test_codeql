package com.github.kittinunf.fuel.core.requests;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.C2460n;
import com.github.kittinunf.fuel.core.C2466r;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.EnumC2462o;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2423a;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import com.github.kittinunf.result.AbstractC2512a;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13663t;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
/* compiled from: CancellableRequest.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.a */
/* loaded from: classes2.dex */
public final class FutureC2469a implements InterfaceC2464q, Future<C2500u> {

    /* renamed from: x */
    private static final String f7069x;

    /* renamed from: c */
    private final InterfaceC11824h f7071c;

    /* renamed from: d */
    private final FutureC2469a f7072d;

    /* renamed from: e */
    private final InterfaceC2464q f7073e;

    /* renamed from: f */
    private final Future<C2500u> f7074f;

    /* renamed from: w */
    static final /* synthetic */ InterfaceC11872i[] f7068w = {C11813x.m10312f(new C11808s(C11813x.m10316b(FutureC2469a.class), "interruptCallback", "getInterruptCallback()Lkotlin/jvm/functions/Function1;")), C11813x.m10312f(new C11808s(C11813x.m10316b(FutureC2469a.class), "executor", "getExecutor()Lcom/github/kittinunf/fuel/core/RequestExecutionOptions;"))};

    /* renamed from: y */
    public static final C2470a f7070y = new C2470a(null);

    /* compiled from: CancellableRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.a$a */
    /* loaded from: classes2.dex */
    public static final class C2470a {
        private C2470a() {
        }

        /* renamed from: a */
        public final FutureC2469a m32790a(InterfaceC2464q interfaceC2464q, Future<C2500u> future) {
            l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
            l.g(future, "future");
            FutureC2469a m32788c = m32788c(interfaceC2464q);
            if (m32788c == null) {
                m32788c = new FutureC2469a(interfaceC2464q, future, null);
            }
            if (interfaceC2464q != m32788c) {
                interfaceC2464q.mo32757s().put(m32789b(), m32788c);
            }
            return m32788c;
        }

        /* renamed from: b */
        public final String m32789b() {
            return FutureC2469a.f7069x;
        }

        /* renamed from: c */
        public final FutureC2469a m32788c(InterfaceC2464q interfaceC2464q) {
            l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
            InterfaceC2464q interfaceC2464q2 = interfaceC2464q.mo32757s().get(m32789b());
            if (!(interfaceC2464q2 instanceof FutureC2469a)) {
                interfaceC2464q2 = null;
            }
            return (FutureC2469a) interfaceC2464q2;
        }

        public /* synthetic */ C2470a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* compiled from: CancellableRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.a$b */
    /* loaded from: classes2.dex */
    static final class C2471b extends AbstractC11802m implements InterfaceC11756a<C2466r> {
        C2471b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C2466r invoke() {
            return FutureC2469a.this.getRequest().mo32771e();
        }
    }

    /* compiled from: CancellableRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.a$c */
    /* loaded from: classes2.dex */
    static final class C2472c extends AbstractC11802m implements InterfaceC11756a<InterfaceC11767l<? super InterfaceC2464q, ? extends C13666w>> {
        C2472c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC11767l<InterfaceC2464q, C13666w> invoke() {
            return FutureC2469a.this.m32792x().m32812f();
        }
    }

    static {
        String canonicalName = FutureC2469a.class.getCanonicalName();
        l.c(canonicalName, "CancellableRequest::class.java.canonicalName");
        f7069x = canonicalName;
    }

    private FutureC2469a(InterfaceC2464q interfaceC2464q, Future<C2500u> future) {
        InterfaceC11824h m5625b;
        this.f7073e = interfaceC2464q;
        this.f7074f = future;
        C13218k.m5625b(new C2472c());
        m5625b = C13218k.m5625b(new C2471b());
        this.f7071c = m5625b;
        this.f7072d = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final C2466r m32792x() {
        InterfaceC11824h interfaceC11824h = this.f7071c;
        InterfaceC11872i interfaceC11872i = f7068w[1];
        return (C2466r) interfaceC11824h.getValue();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: a */
    public C2460n mo32775a() {
        return this.f7073e.mo32775a();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: b */
    public Collection<String> mo32774b(String str) {
        l.g(str, "header");
        return this.f7073e.mo32774b(str);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: c */
    public List<C13287o<String, Object>> mo32773c() {
        return this.f7073e.mo32773c();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f7074f.cancel(z);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: d */
    public void mo32772d(URL url) {
        l.g(url, "<set-?>");
        this.f7073e.mo32772d(url);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: e */
    public C2466r mo32771e() {
        return this.f7073e.mo32771e();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: f */
    public InterfaceC2464q mo32770f(String str, Charset charset) {
        l.g(str, "body");
        l.g(charset, "charset");
        return this.f7073e.mo32770f(str, charset);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: g */
    public FutureC2469a mo32769g(InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super AbstractC2512a<byte[], ? extends FuelError>, C13666w> interfaceC11772q) {
        l.g(interfaceC11772q, "handler");
        return this.f7073e.mo32769g(interfaceC11772q);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: h */
    public InterfaceC2464q mo32768h(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p) {
        l.g(interfaceC11771p, "handler");
        return this.f7073e.mo32768h(interfaceC11771p);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: i */
    public InterfaceC2464q mo32767i(Map<String, ? extends Object> map) {
        l.g(map, "map");
        return this.f7073e.mo32767i(map);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f7074f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f7074f.isDone();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: j */
    public URL mo32766j() {
        return this.f7073e.mo32766j();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: k */
    public EnumC2462o mo32765k() {
        return this.f7073e.mo32765k();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: l */
    public C13663t<InterfaceC2464q, C2500u, AbstractC2512a<byte[], FuelError>> mo32764l() {
        return this.f7073e.mo32764l();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: m */
    public void mo32763m(C2466r c2466r) {
        l.g(c2466r, "<set-?>");
        this.f7073e.mo32763m(c2466r);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: n */
    public InterfaceC2464q mo32762n(String str, Object obj) {
        l.g(str, "header");
        l.g(obj, "value");
        return this.f7073e.mo32762n(str, obj);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: o */
    public InterfaceC2423a mo32761o() {
        return this.f7073e.mo32761o();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: p */
    public InterfaceC2464q mo32760p(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p) {
        l.g(interfaceC11771p, "handler");
        return this.f7073e.mo32760p(interfaceC11771p);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: q */
    public void mo32759q(List<? extends C13287o<String, ? extends Object>> list) {
        l.g(list, "<set-?>");
        this.f7073e.mo32759q(list);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: r */
    public InterfaceC2464q mo32758r(InterfaceC2423a interfaceC2423a) {
        l.g(interfaceC2423a, "body");
        return this.f7073e.mo32758r(interfaceC2423a);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: s */
    public Map<String, InterfaceC2464q> mo32757s() {
        return this.f7073e.mo32757s();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    public String toString() {
        return "Cancellable[\n\r\t" + this.f7073e + "\n\r] done=" + isDone() + " cancelled=" + isCancelled();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: v */
    public C2500u get() {
        return this.f7074f.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: w */
    public C2500u get(long j, TimeUnit timeUnit) {
        return this.f7074f.get(j, timeUnit);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2499t
    /* renamed from: y */
    public FutureC2469a getRequest() {
        return this.f7072d;
    }

    public /* synthetic */ FutureC2469a(InterfaceC2464q interfaceC2464q, Future future, kotlin.e0.d.g gVar) {
        this(interfaceC2464q, future);
    }
}
