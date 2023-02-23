package com.github.kittinunf.fuel.core.requests;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RequestTaskCallbacks.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.g */
/* loaded from: classes2.dex */
public final class CallableC2495g implements Callable<C2500u> {

    /* renamed from: c */
    private final InterfaceC2464q f7116c;

    /* renamed from: d */
    private final Callable<C2500u> f7117d;

    /* renamed from: e */
    private final InterfaceC11767l<C2500u, C13666w> f7118e;

    /* renamed from: f */
    private final InterfaceC11771p<FuelError, C2500u, C13666w> f7119f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestTaskCallbacks.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.g$a */
    /* loaded from: classes2.dex */
    public static final class C2496a extends AbstractC11802m implements InterfaceC11756a<String> {
        C2496a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            return "[RequestTaskCallbacks] start request task\n\r\t" + CallableC2495g.this.f7116c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallableC2495g(InterfaceC2464q interfaceC2464q, Callable<C2500u> callable, InterfaceC11767l<? super C2500u, C13666w> interfaceC11767l, InterfaceC11771p<? super FuelError, ? super C2500u, C13666w> interfaceC11771p) {
        l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
        l.g(callable, "task");
        l.g(interfaceC11767l, "onSuccess");
        l.g(interfaceC11771p, "onFailure");
        this.f7116c = interfaceC2464q;
        this.f7117d = callable;
        this.f7118e = interfaceC11767l;
        this.f7119f = interfaceC11771p;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.github.kittinunf.fuel.core.C2500u call() {
        /*
            r4 = this;
            h.b.a.a.a r0 = p272h.p275b.p276a.p277a.C8212a.f19768c
            com.github.kittinunf.fuel.core.requests.g$a r1 = new com.github.kittinunf.fuel.core.requests.g$a
            r1.<init>()
            r0.m16480b(r1)
            kotlin.p$a r0 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Callable<com.github.kittinunf.fuel.core.u> r0 = r4.f7117d     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L18
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0     // Catch: java.lang.Throwable -> L18
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> L18
            goto L22
        L18:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
            kotlin.C13288p.m5362a(r0)
        L22:
            boolean r1 = kotlin.C13288p.m5359d(r0)
            if (r1 == 0) goto L41
            kotlin.p$a r1 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L3a
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0     // Catch: java.lang.Throwable -> L3a
            kotlin.e0.c.l<com.github.kittinunf.fuel.core.u, kotlin.w> r1 = r4.f7118e     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "it"
            kotlin.e0.d.l.c(r0, r2)     // Catch: java.lang.Throwable -> L3a
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L3a
            kotlin.C13288p.m5362a(r0)     // Catch: java.lang.Throwable -> L3a
            goto L44
        L3a:
            r0 = move-exception
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            java.lang.Object r0 = kotlin.C13291q.m5358a(r0)
        L41:
            kotlin.C13288p.m5362a(r0)
        L44:
            java.lang.Throwable r1 = kotlin.C13288p.m5361b(r0)
            if (r1 != 0) goto L4b
            goto L60
        L4b:
            com.github.kittinunf.fuel.core.FuelError$a r0 = com.github.kittinunf.fuel.core.FuelError.f6968d
            r2 = 2
            r3 = 0
            com.github.kittinunf.fuel.core.FuelError r0 = com.github.kittinunf.fuel.core.FuelError.C2422a.m32898b(r0, r1, r3, r2, r3)
            kotlin.e0.c.p<com.github.kittinunf.fuel.core.FuelError, com.github.kittinunf.fuel.core.u, kotlin.w> r1 = r4.f7119f
            com.github.kittinunf.fuel.core.u r2 = r0.m32900d()
            r1.invoke(r0, r2)
            com.github.kittinunf.fuel.core.u r0 = r0.m32900d()
        L60:
            java.lang.String r1 = "runCatching { task.call(…it.response) }.response }"
            kotlin.e0.d.l.c(r0, r1)
            com.github.kittinunf.fuel.core.u r0 = (com.github.kittinunf.fuel.core.C2500u) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.requests.CallableC2495g.call():com.github.kittinunf.fuel.core.u");
    }

    public /* synthetic */ CallableC2495g(InterfaceC2464q interfaceC2464q, Callable callable, InterfaceC11767l interfaceC11767l, InterfaceC11771p interfaceC11771p, int i, kotlin.e0.d.g gVar) {
        this(interfaceC2464q, (i & 2) != 0 ? C2497h.m32726a(interfaceC2464q) : callable, interfaceC11767l, interfaceC11771p);
    }
}
