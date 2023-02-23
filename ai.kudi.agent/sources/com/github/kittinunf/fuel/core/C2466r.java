package com.github.kittinunf.fuel.core;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RequestExecutionOptions.kt */
/* renamed from: com.github.kittinunf.fuel.core.r */
/* loaded from: classes2.dex */
public final class C2466r {

    /* renamed from: a */
    private final C2463p f7049a;

    /* renamed from: b */
    private final C2463p f7050b;

    /* renamed from: c */
    private int f7051c;

    /* renamed from: d */
    private int f7052d;

    /* renamed from: e */
    private Boolean f7053e;

    /* renamed from: f */
    private Boolean f7054f;

    /* renamed from: g */
    private Boolean f7055g;

    /* renamed from: h */
    private Collection<InterfaceC11767l<InterfaceC2464q, C13666w>> f7056h;

    /* renamed from: i */
    private InterfaceC11767l<? super C2500u, Boolean> f7057i;

    /* renamed from: j */
    private final InterfaceC11767l<InterfaceC2464q, C13666w> f7058j;

    /* renamed from: k */
    private final InterfaceC2427d f7059k;

    /* renamed from: l */
    private final SSLSocketFactory f7060l;

    /* renamed from: m */
    private final HostnameVerifier f7061m;

    /* renamed from: n */
    private final ExecutorService f7062n;

    /* renamed from: o */
    private final Executor f7063o;

    /* renamed from: p */
    private final InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> f7064p;

    /* renamed from: q */
    private InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u> f7065q;

    /* compiled from: RequestExecutionOptions.kt */
    /* renamed from: com.github.kittinunf.fuel.core.r$a */
    /* loaded from: classes2.dex */
    static final class C2467a extends AbstractC11802m implements InterfaceC11767l<InterfaceC2464q, C13666w> {
        C2467a() {
            super(1);
        }

        /* renamed from: a */
        public final void m32798a(InterfaceC2464q interfaceC2464q) {
            kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
            Iterator<T> it = C2466r.this.m32811g().iterator();
            while (it.hasNext()) {
                ((InterfaceC11767l) it.next()).invoke(interfaceC2464q);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC2464q interfaceC2464q) {
            m32798a(interfaceC2464q);
            return C13666w.f30112a;
        }
    }

    /* compiled from: RequestExecutionOptions.kt */
    /* renamed from: com.github.kittinunf.fuel.core.r$b */
    /* loaded from: classes2.dex */
    static final class C2468b extends AbstractC11802m implements InterfaceC11767l<C2500u, Boolean> {

        /* renamed from: c */
        public static final C2468b f7067c = new C2468b();

        C2468b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m32797a(C2500u c2500u) {
            kotlin.e0.d.l.g(c2500u, "response");
            return (C2503v.m32717b(c2500u) || C2503v.m32718a(c2500u)) ? false : true;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(C2500u c2500u) {
            return Boolean.valueOf(m32797a(c2500u));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2466r(InterfaceC2427d interfaceC2427d, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ExecutorService executorService, Executor executor, InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q> interfaceC11767l, InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u> interfaceC11771p) {
        kotlin.e0.d.l.g(interfaceC2427d, "client");
        kotlin.e0.d.l.g(executorService, "executorService");
        kotlin.e0.d.l.g(executor, "callbackExecutor");
        kotlin.e0.d.l.g(interfaceC11767l, "requestTransformer");
        kotlin.e0.d.l.g(interfaceC11771p, "responseTransformer");
        this.f7059k = interfaceC2427d;
        this.f7060l = sSLSocketFactory;
        this.f7061m = hostnameVerifier;
        this.f7062n = executorService;
        this.f7063o = executor;
        this.f7064p = interfaceC11767l;
        this.f7065q = interfaceC11771p;
        this.f7049a = new C2463p(null, 1, null);
        this.f7050b = new C2463p(null, 1, null);
        this.f7051c = 15000;
        this.f7052d = 15000;
        this.f7056h = new ArrayList();
        this.f7057i = C2468b.f7067c;
        this.f7058j = new C2467a();
    }

    /* renamed from: a */
    public final void m32817a(InterfaceC11756a<C13666w> interfaceC11756a) {
        kotlin.e0.d.l.g(interfaceC11756a, "f");
        this.f7063o.execute(new RunnableC2498s(interfaceC11756a));
    }

    /* renamed from: b */
    public final Boolean m32816b() {
        return this.f7054f;
    }

    /* renamed from: c */
    public final InterfaceC2427d m32815c() {
        return this.f7059k;
    }

    /* renamed from: d */
    public final Boolean m32814d() {
        return this.f7053e;
    }

    /* renamed from: e */
    public final HostnameVerifier m32813e() {
        return this.f7061m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2466r) {
                C2466r c2466r = (C2466r) obj;
                return kotlin.e0.d.l.b(this.f7059k, c2466r.f7059k) && kotlin.e0.d.l.b(this.f7060l, c2466r.f7060l) && kotlin.e0.d.l.b(this.f7061m, c2466r.f7061m) && kotlin.e0.d.l.b(this.f7062n, c2466r.f7062n) && kotlin.e0.d.l.b(this.f7063o, c2466r.f7063o) && kotlin.e0.d.l.b(this.f7064p, c2466r.f7064p) && kotlin.e0.d.l.b(this.f7065q, c2466r.f7065q);
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final InterfaceC11767l<InterfaceC2464q, C13666w> m32812f() {
        return this.f7058j;
    }

    /* renamed from: g */
    public final Collection<InterfaceC11767l<InterfaceC2464q, C13666w>> m32811g() {
        return this.f7056h;
    }

    /* renamed from: h */
    public final C2463p m32810h() {
        return this.f7049a;
    }

    public int hashCode() {
        InterfaceC2427d interfaceC2427d = this.f7059k;
        int hashCode = (interfaceC2427d != null ? interfaceC2427d.hashCode() : 0) * 31;
        SSLSocketFactory sSLSocketFactory = this.f7060l;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f7061m;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        ExecutorService executorService = this.f7062n;
        int hashCode4 = (hashCode3 + (executorService != null ? executorService.hashCode() : 0)) * 31;
        Executor executor = this.f7063o;
        int hashCode5 = (hashCode4 + (executor != null ? executor.hashCode() : 0)) * 31;
        InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> interfaceC11767l = this.f7064p;
        int hashCode6 = (hashCode5 + (interfaceC11767l != null ? interfaceC11767l.hashCode() : 0)) * 31;
        InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u> interfaceC11771p = this.f7065q;
        return hashCode6 + (interfaceC11771p != null ? interfaceC11771p.hashCode() : 0);
    }

    /* renamed from: i */
    public final InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> m32809i() {
        return this.f7064p;
    }

    /* renamed from: j */
    public final C2463p m32808j() {
        return this.f7050b;
    }

    /* renamed from: k */
    public final InterfaceC11771p<InterfaceC2464q, C2500u, C2500u> m32807k() {
        return this.f7065q;
    }

    /* renamed from: l */
    public final InterfaceC11767l<C2500u, Boolean> m32806l() {
        return this.f7057i;
    }

    /* renamed from: m */
    public final SSLSocketFactory m32805m() {
        return this.f7060l;
    }

    /* renamed from: n */
    public final int m32804n() {
        return this.f7051c;
    }

    /* renamed from: o */
    public final int m32803o() {
        return this.f7052d;
    }

    /* renamed from: p */
    public final Boolean m32802p() {
        return this.f7055g;
    }

    /* renamed from: q */
    public final void m32801q(int i) {
        this.f7051c = i;
    }

    /* renamed from: r */
    public final void m32800r(int i) {
        this.f7052d = i;
    }

    /* renamed from: s */
    public final Future<C2500u> m32799s(Callable<C2500u> callable) {
        kotlin.e0.d.l.g(callable, "task");
        Future<C2500u> submit = this.f7062n.submit(callable);
        kotlin.e0.d.l.c(submit, "executorService.submit(task)");
        return submit;
    }

    public String toString() {
        return "RequestExecutionOptions(client=" + this.f7059k + ", socketFactory=" + this.f7060l + ", hostnameVerifier=" + this.f7061m + ", executorService=" + this.f7062n + ", callbackExecutor=" + this.f7063o + ", requestTransformer=" + this.f7064p + ", responseTransformer=" + this.f7065q + ")";
    }
}
