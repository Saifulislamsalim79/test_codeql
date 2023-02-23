package com.github.kittinunf.fuel.core.requests;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.C2466r;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2427d;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import java.util.concurrent.Callable;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
/* compiled from: RequestTask.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.f */
/* loaded from: classes2.dex */
public final class CallableC2488f implements Callable<C2500u> {

    /* renamed from: w */
    static final /* synthetic */ InterfaceC11872i[] f7105w = {C11813x.m10312f(new C11808s(C11813x.m10316b(CallableC2488f.class), "interruptCallback", "getInterruptCallback()Lkotlin/jvm/functions/Function1;")), C11813x.m10312f(new C11808s(C11813x.m10316b(CallableC2488f.class), "executor", "getExecutor()Lcom/github/kittinunf/fuel/core/RequestExecutionOptions;")), C11813x.m10312f(new C11808s(C11813x.m10316b(CallableC2488f.class), "client", "getClient()Lcom/github/kittinunf/fuel/core/Client;"))};

    /* renamed from: c */
    private final InterfaceC11824h f7106c;

    /* renamed from: d */
    private final InterfaceC11824h f7107d;

    /* renamed from: e */
    private final InterfaceC11824h f7108e;

    /* renamed from: f */
    private final InterfaceC2464q f7109f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$a */
    /* loaded from: classes2.dex */
    public static final class C2489a extends AbstractC11802m implements InterfaceC11756a<String> {

        /* renamed from: c */
        final /* synthetic */ Throwable f7110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2489a(Throwable th) {
            super(0);
            this.f7110c = th;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f7110c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$b */
    /* loaded from: classes2.dex */
    public static final class C2490b extends AbstractC11802m implements InterfaceC11756a<String> {

        /* renamed from: c */
        final /* synthetic */ Throwable f7111c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2490b(Throwable th) {
            super(0);
            this.f7111c = th;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("[RequestTask] on failure (interrupted=");
            Throwable th = this.f7111c;
            if (!(th instanceof FuelError)) {
                th = null;
            }
            FuelError fuelError = (FuelError) th;
            sb.append(fuelError != null ? Boolean.valueOf(fuelError.m32902b()) : this.f7111c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$c */
    /* loaded from: classes2.dex */
    public static final class C2491c extends AbstractC11802m implements InterfaceC11756a<String> {

        /* renamed from: c */
        final /* synthetic */ Throwable f7112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2491c(Throwable th) {
            super(0);
            this.f7112c = th;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f7112c;
        }
    }

    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$d */
    /* loaded from: classes2.dex */
    static final class C2492d extends AbstractC11802m implements InterfaceC11756a<InterfaceC2427d> {
        C2492d() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC2427d invoke() {
            return CallableC2488f.this.m32736e().m32815c();
        }
    }

    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$e */
    /* loaded from: classes2.dex */
    static final class C2493e extends AbstractC11802m implements InterfaceC11756a<C2466r> {
        C2493e() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C2466r invoke() {
            return CallableC2488f.this.m32734g().mo32771e();
        }
    }

    /* compiled from: RequestTask.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.f$f */
    /* loaded from: classes2.dex */
    static final class C2494f extends AbstractC11802m implements InterfaceC11756a<InterfaceC11767l<? super InterfaceC2464q, ? extends C13666w>> {
        C2494f() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC11767l<InterfaceC2464q, C13666w> invoke() {
            return CallableC2488f.this.m32736e().m32812f();
        }
    }

    public CallableC2488f(InterfaceC2464q interfaceC2464q) {
        InterfaceC11824h m5625b;
        InterfaceC11824h m5625b2;
        InterfaceC11824h m5625b3;
        l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
        this.f7109f = interfaceC2464q;
        m5625b = C13218k.m5625b(new C2494f());
        this.f7106c = m5625b;
        m5625b2 = C13218k.m5625b(new C2493e());
        this.f7107d = m5625b2;
        m5625b3 = C13218k.m5625b(new C2492d());
        this.f7108e = m5625b3;
    }

    /* renamed from: c */
    private final C13287o<InterfaceC2464q, C2500u> m32738c(InterfaceC2464q interfaceC2464q) throws FuelError {
        Object m5358a;
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = new C13287o(interfaceC2464q, m32737d().mo16479a(interfaceC2464q));
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        Throwable m5361b = C13288p.m5361b(m5358a);
        if (m5361b == null) {
            C13291q.m5357b(m5358a);
            return (C13287o) m5358a;
        }
        C13288p.C13289a c13289a3 = C13288p.f29444c;
        throw FuelError.f6968d.m32899a(m5361b, new C2500u(interfaceC2464q.mo32766j(), 0, null, null, 0L, null, 62, null));
    }

    /* renamed from: d */
    private final InterfaceC2427d m32737d() {
        InterfaceC11824h interfaceC11824h = this.f7108e;
        InterfaceC11872i interfaceC11872i = f7105w[2];
        return (InterfaceC2427d) interfaceC11824h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final C2466r m32736e() {
        InterfaceC11824h interfaceC11824h = this.f7107d;
        InterfaceC11872i interfaceC11872i = f7105w[1];
        return (C2466r) interfaceC11824h.getValue();
    }

    /* renamed from: f */
    private final InterfaceC11767l<InterfaceC2464q, C13666w> m32735f() {
        InterfaceC11824h interfaceC11824h = this.f7106c;
        InterfaceC11872i interfaceC11872i = f7105w[0];
        return (InterfaceC11767l) interfaceC11824h.getValue();
    }

    /* renamed from: h */
    private final InterfaceC2464q m32733h(InterfaceC2464q interfaceC2464q) {
        return m32736e().m32809i().invoke(interfaceC2464q);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.github.kittinunf.fuel.core.C2500u m32732i(kotlin.C13287o<? extends com.github.kittinunf.fuel.core.InterfaceC2464q, com.github.kittinunf.fuel.core.C2500u> r6) throws com.github.kittinunf.fuel.core.FuelError {
        /*
            r5 = this;
            java.lang.Object r0 = r6.m5366a()
            com.github.kittinunf.fuel.core.q r0 = (com.github.kittinunf.fuel.core.InterfaceC2464q) r0
            java.lang.Object r6 = r6.m5365b()
            com.github.kittinunf.fuel.core.u r6 = (com.github.kittinunf.fuel.core.C2500u) r6
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L20
            com.github.kittinunf.fuel.core.r r1 = r5.m32736e()     // Catch: java.lang.Throwable -> L20
            kotlin.e0.c.p r1 = r1.m32807k()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.invoke(r0, r6)     // Catch: java.lang.Throwable -> L20
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0     // Catch: java.lang.Throwable -> L20
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> L20
            goto L2a
        L20:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
            kotlin.C13288p.m5362a(r0)
        L2a:
            boolean r1 = kotlin.C13288p.m5359d(r0)
            if (r1 == 0) goto L67
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L60
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0     // Catch: java.lang.Throwable -> L60
            com.github.kittinunf.fuel.core.r r1 = r5.m32736e()     // Catch: java.lang.Throwable -> L60
            kotlin.e0.c.l r1 = r1.m32806l()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L60
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L4c
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> L60
            goto L6a
        L4c:
            com.github.kittinunf.fuel.core.FuelError$a r1 = com.github.kittinunf.fuel.core.FuelError.f6968d     // Catch: java.lang.Throwable -> L60
            com.github.kittinunf.fuel.core.HttpException r2 = new com.github.kittinunf.fuel.core.HttpException     // Catch: java.lang.Throwable -> L60
            int r3 = r0.m32722d()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r0.m32723c()     // Catch: java.lang.Throwable -> L60
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L60
            com.github.kittinunf.fuel.core.FuelError r0 = r1.m32899a(r2, r0)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
        L67:
            kotlin.C13288p.m5362a(r0)
        L6a:
            java.lang.Throwable r1 = kotlin.C13288p.m5361b(r0)
            if (r1 != 0) goto L76
            kotlin.C13291q.m5357b(r0)
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0
            return r0
        L76:
            kotlin.p$a r0 = kotlin.C13288p.f29444c
            com.github.kittinunf.fuel.core.FuelError$a r0 = com.github.kittinunf.fuel.core.FuelError.f6968d
            com.github.kittinunf.fuel.core.FuelError r6 = r0.m32899a(r1, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.requests.CallableC2488f.m32732i(kotlin.o):com.github.kittinunf.fuel.core.u");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.github.kittinunf.fuel.core.C2500u call() throws com.github.kittinunf.fuel.core.FuelError {
        /*
            r4 = this;
            kotlin.p$a r0 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> Lc
            com.github.kittinunf.fuel.core.q r0 = r4.f7109f     // Catch: java.lang.Throwable -> Lc
            com.github.kittinunf.fuel.core.q r0 = r4.m32733h(r0)     // Catch: java.lang.Throwable -> Lc
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> Lc
            goto L16
        Lc:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
            kotlin.C13288p.m5362a(r0)
        L16:
            boolean r1 = kotlin.C13288p.m5359d(r0)
            if (r1 == 0) goto L2f
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L28
            com.github.kittinunf.fuel.core.q r0 = (com.github.kittinunf.fuel.core.InterfaceC2464q) r0     // Catch: java.lang.Throwable -> L28
            kotlin.o r0 = r4.m32738c(r0)     // Catch: java.lang.Throwable -> L28
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> L28
            goto L32
        L28:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
        L2f:
            kotlin.C13288p.m5362a(r0)
        L32:
            boolean r1 = kotlin.C13288p.m5359d(r0)
            if (r1 == 0) goto L7f
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L78
            kotlin.o r0 = (kotlin.C13287o) r0     // Catch: java.lang.Throwable -> L78
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L46
            com.github.kittinunf.fuel.core.u r1 = r4.m32732i(r0)     // Catch: java.lang.Throwable -> L46
            kotlin.C13288p.m5362a(r1)     // Catch: java.lang.Throwable -> L46
            goto L50
        L46:
            r1 = move-exception
            kotlin.p$a r2 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = kotlin.C13291q.m5358a(r1)     // Catch: java.lang.Throwable -> L78
            kotlin.C13288p.m5362a(r1)     // Catch: java.lang.Throwable -> L78
        L50:
            java.lang.Throwable r2 = kotlin.C13288p.m5361b(r1)     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L5f
            kotlin.C13291q.m5357b(r1)     // Catch: java.lang.Throwable -> L78
            com.github.kittinunf.fuel.core.u r1 = (com.github.kittinunf.fuel.core.C2500u) r1     // Catch: java.lang.Throwable -> L78
            kotlin.C13288p.m5362a(r1)     // Catch: java.lang.Throwable -> L78
            goto L83
        L5f:
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L78
            h.b.a.a.a r1 = p272h.p275b.p276a.p277a.C8212a.f19768c     // Catch: java.lang.Throwable -> L78
            com.github.kittinunf.fuel.core.requests.f$a r3 = new com.github.kittinunf.fuel.core.requests.f$a     // Catch: java.lang.Throwable -> L78
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L78
            r1.m16480b(r3)     // Catch: java.lang.Throwable -> L78
            com.github.kittinunf.fuel.core.FuelError$a r1 = com.github.kittinunf.fuel.core.FuelError.f6968d     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.m5363d()     // Catch: java.lang.Throwable -> L78
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0     // Catch: java.lang.Throwable -> L78
            com.github.kittinunf.fuel.core.FuelError r0 = r1.m32899a(r2, r0)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
        L7f:
            kotlin.C13288p.m5362a(r0)
            r1 = r0
        L83:
            java.lang.Throwable r0 = kotlin.C13288p.m5361b(r1)
            if (r0 == 0) goto Lb3
            h.b.a.a.a r2 = p272h.p275b.p276a.p277a.C8212a.f19768c
            com.github.kittinunf.fuel.core.requests.f$b r3 = new com.github.kittinunf.fuel.core.requests.f$b
            r3.<init>(r0)
            r2.m16480b(r3)
            boolean r2 = r0 instanceof com.github.kittinunf.fuel.core.FuelError
            if (r2 == 0) goto Lb3
            r2 = r0
            com.github.kittinunf.fuel.core.FuelError r2 = (com.github.kittinunf.fuel.core.FuelError) r2
            boolean r2 = r2.m32902b()
            if (r2 == 0) goto Lb3
            h.b.a.a.a r2 = p272h.p275b.p276a.p277a.C8212a.f19768c
            com.github.kittinunf.fuel.core.requests.f$c r3 = new com.github.kittinunf.fuel.core.requests.f$c
            r3.<init>(r0)
            r2.m16480b(r3)
            kotlin.e0.c.l r0 = r4.m32735f()
            com.github.kittinunf.fuel.core.q r2 = r4.f7109f
            r0.invoke(r2)
        Lb3:
            kotlin.C13291q.m5357b(r1)
            com.github.kittinunf.fuel.core.u r1 = (com.github.kittinunf.fuel.core.C2500u) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.requests.CallableC2488f.call():com.github.kittinunf.fuel.core.u");
    }

    /* renamed from: g */
    public final InterfaceC2464q m32734g() {
        return this.f7109f;
    }
}
