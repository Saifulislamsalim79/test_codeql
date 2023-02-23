package com.github.kittinunf.fuel.core;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.requests.C2497h;
import com.github.kittinunf.fuel.core.requests.CallableC2495g;
import com.github.kittinunf.fuel.core.requests.FutureC2469a;
import com.github.kittinunf.result.AbstractC2512a;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13663t;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import p272h.p275b.p276a.p277a.C8212a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: Deserializable.kt */
/* renamed from: com.github.kittinunf.fuel.core.h */
/* loaded from: classes2.dex */
public final class C2433h {

    /* compiled from: Deserializable.kt */
    /* renamed from: com.github.kittinunf.fuel.core.h$a */
    /* loaded from: classes2.dex */
    static final class C2434a extends AbstractC11802m implements InterfaceC11772q<InterfaceC2464q, C2500u, T, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11772q f6974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2434a(InterfaceC11772q interfaceC11772q) {
            super(3);
            this.f6974c = interfaceC11772q;
        }

        /* renamed from: a */
        public final void m32887a(InterfaceC2464q interfaceC2464q, C2500u c2500u, T t) {
            kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
            kotlin.e0.d.l.g(c2500u, "response");
            kotlin.e0.d.l.g(t, "value");
            this.f6974c.invoke(interfaceC2464q, c2500u, new AbstractC2512a.C2515c(t));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC2464q interfaceC2464q, C2500u c2500u, Object obj) {
            m32887a(interfaceC2464q, c2500u, obj);
            return C13666w.f30112a;
        }
    }

    /* compiled from: Deserializable.kt */
    /* renamed from: com.github.kittinunf.fuel.core.h$b */
    /* loaded from: classes2.dex */
    static final class C2435b extends AbstractC11802m implements InterfaceC11772q<InterfaceC2464q, C2500u, FuelError, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11772q f6975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2435b(InterfaceC11772q interfaceC11772q) {
            super(3);
            this.f6975c = interfaceC11772q;
        }

        /* renamed from: a */
        public final void m32886a(InterfaceC2464q interfaceC2464q, C2500u c2500u, FuelError fuelError) {
            kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
            kotlin.e0.d.l.g(c2500u, "response");
            kotlin.e0.d.l.g(fuelError, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            this.f6975c.invoke(interfaceC2464q, c2500u, new AbstractC2512a.C2514b(fuelError));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC2464q interfaceC2464q, C2500u c2500u, FuelError fuelError) {
            m32886a(interfaceC2464q, c2500u, fuelError);
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Deserializable.kt */
    /* renamed from: com.github.kittinunf.fuel.core.h$c */
    /* loaded from: classes2.dex */
    public static final class C2436c extends AbstractC11802m implements InterfaceC11767l<C2500u, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC2464q f6976c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2432g f6977d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC11772q f6978e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11772q f6979f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Deserializable.kt */
        /* renamed from: com.github.kittinunf.fuel.core.h$c$a */
        /* loaded from: classes2.dex */
        public static final class C2437a extends AbstractC11802m implements InterfaceC11756a<C13666w> {

            /* renamed from: d */
            final /* synthetic */ AbstractC2512a f6981d;

            /* renamed from: e */
            final /* synthetic */ C2500u f6982e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Deserializable.kt */
            /* renamed from: com.github.kittinunf.fuel.core.h$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C2438a extends AbstractC11802m implements InterfaceC11756a<String> {

                /* renamed from: c */
                final /* synthetic */ FuelError f6983c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2438a(FuelError fuelError) {
                    super(0);
                    this.f6983c = fuelError;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                public final String invoke() {
                    return "[Deserializable] unfold failure: \n\r" + this.f6983c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2437a(AbstractC2512a abstractC2512a, C2500u c2500u) {
                super(0);
                this.f6981d = abstractC2512a;
                this.f6982e = c2500u;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public /* bridge */ /* synthetic */ C13666w invoke() {
                invoke2();
                return C13666w.f30112a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AbstractC2512a abstractC2512a = this.f6981d;
                if (abstractC2512a instanceof AbstractC2512a.C2515c) {
                    Object m32693b = ((AbstractC2512a.C2515c) abstractC2512a).m32693b();
                    C2436c c2436c = C2436c.this;
                    c2436c.f6978e.invoke(c2436c.f6976c, this.f6982e, m32693b);
                } else if (abstractC2512a instanceof AbstractC2512a.C2514b) {
                    Exception m32696c = ((AbstractC2512a.C2514b) abstractC2512a).m32696c();
                    C2436c c2436c2 = C2436c.this;
                    InterfaceC11772q interfaceC11772q = c2436c2.f6979f;
                    InterfaceC2464q interfaceC2464q = c2436c2.f6976c;
                    C2500u c2500u = this.f6982e;
                    FuelError m32899a = FuelError.f6968d.m32899a(m32696c, c2500u);
                    C8212a.f19768c.m16480b(new C2438a(m32899a));
                    interfaceC11772q.invoke(interfaceC2464q, c2500u, m32899a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Deserializable.kt */
        /* renamed from: com.github.kittinunf.fuel.core.h$c$b */
        /* loaded from: classes2.dex */
        public static final class C2439b extends AbstractC11802m implements InterfaceC11756a<T> {

            /* renamed from: d */
            final /* synthetic */ C2500u f6985d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2439b(C2500u c2500u) {
                super(0);
                this.f6985d = c2500u;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final T invoke() {
                return C2436c.this.f6977d.mo32715a(this.f6985d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2436c(InterfaceC2464q interfaceC2464q, InterfaceC2432g interfaceC2432g, InterfaceC11772q interfaceC11772q, InterfaceC11772q interfaceC11772q2) {
            super(1);
            this.f6976c = interfaceC2464q;
            this.f6977d = interfaceC2432g;
            this.f6978e = interfaceC11772q;
            this.f6979f = interfaceC11772q2;
        }

        /* renamed from: a */
        public final void m32885a(C2500u c2500u) {
            kotlin.e0.d.l.g(c2500u, "response");
            this.f6976c.mo32771e().m32817a(new C2437a(AbstractC2512a.f7138a.m32699b(new C2439b(c2500u)), c2500u));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C2500u c2500u) {
            m32885a(c2500u);
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Deserializable.kt */
    /* renamed from: com.github.kittinunf.fuel.core.h$d */
    /* loaded from: classes2.dex */
    public static final class C2440d extends AbstractC11802m implements InterfaceC11771p<FuelError, C2500u, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC2464q f6986c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11772q f6987d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Deserializable.kt */
        /* renamed from: com.github.kittinunf.fuel.core.h$d$a */
        /* loaded from: classes2.dex */
        public static final class C2441a extends AbstractC11802m implements InterfaceC11756a<C13666w> {

            /* renamed from: d */
            final /* synthetic */ C2500u f6989d;

            /* renamed from: e */
            final /* synthetic */ FuelError f6990e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Deserializable.kt */
            /* renamed from: com.github.kittinunf.fuel.core.h$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C2442a extends AbstractC11802m implements InterfaceC11756a<String> {

                /* renamed from: c */
                final /* synthetic */ FuelError f6991c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2442a(FuelError fuelError) {
                    super(0);
                    this.f6991c = fuelError;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                public final String invoke() {
                    return "[Deserializable] callback failure: \n\r" + this.f6991c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2441a(C2500u c2500u, FuelError fuelError) {
                super(0);
                this.f6989d = c2500u;
                this.f6990e = fuelError;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public /* bridge */ /* synthetic */ C13666w invoke() {
                invoke2();
                return C13666w.f30112a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C2440d c2440d = C2440d.this;
                InterfaceC11772q interfaceC11772q = c2440d.f6987d;
                InterfaceC2464q interfaceC2464q = c2440d.f6986c;
                C2500u c2500u = this.f6989d;
                FuelError fuelError = this.f6990e;
                C8212a.f19768c.m16480b(new C2442a(fuelError));
                interfaceC11772q.invoke(interfaceC2464q, c2500u, fuelError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2440d(InterfaceC2464q interfaceC2464q, InterfaceC11772q interfaceC11772q) {
            super(2);
            this.f6986c = interfaceC2464q;
            this.f6987d = interfaceC11772q;
        }

        /* renamed from: a */
        public final void m32884a(FuelError fuelError, C2500u c2500u) {
            kotlin.e0.d.l.g(fuelError, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            kotlin.e0.d.l.g(c2500u, "response");
            this.f6986c.mo32771e().m32817a(new C2441a(c2500u, fuelError));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(FuelError fuelError, C2500u c2500u) {
            m32884a(fuelError, c2500u);
            return C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public static final <T, U extends InterfaceC2432g<? extends T>> FutureC2469a m32890a(InterfaceC2464q interfaceC2464q, U u, InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super AbstractC2512a<? extends T, ? extends FuelError>, C13666w> interfaceC11772q) {
        kotlin.e0.d.l.g(interfaceC2464q, "$this$response");
        kotlin.e0.d.l.g(u, "deserializable");
        kotlin.e0.d.l.g(interfaceC11772q, "handler");
        return m32889b(interfaceC2464q, u, new C2434a(interfaceC11772q), new C2435b(interfaceC11772q));
    }

    /* renamed from: b */
    private static final <T, U extends InterfaceC2432g<? extends T>> FutureC2469a m32889b(InterfaceC2464q interfaceC2464q, U u, InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super T, C13666w> interfaceC11772q, InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super FuelError, C13666w> interfaceC11772q2) {
        return FutureC2469a.f7070y.m32790a(interfaceC2464q, interfaceC2464q.mo32771e().m32799s(new CallableC2495g(interfaceC2464q, null, new C2436c(interfaceC2464q, u, interfaceC11772q, interfaceC11772q2), new C2440d(interfaceC2464q, interfaceC11772q2), 2, null)));
    }

    /* renamed from: c */
    public static final <T, U extends InterfaceC2432g<? extends T>> C13663t<InterfaceC2464q, C2500u, AbstractC2512a<T, FuelError>> m32888c(InterfaceC2464q interfaceC2464q, U u) {
        C2500u m5358a;
        Object m5358a2;
        kotlin.e0.d.l.g(interfaceC2464q, "$this$response");
        kotlin.e0.d.l.g(u, "deserializable");
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = C2497h.m32726a(interfaceC2464q).call();
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        Throwable m5361b = C13288p.m5361b(m5358a);
        if (m5361b != null) {
            FuelError m32899a = FuelError.f6968d.m32899a(m5361b, C2500u.f7122g.m32721a(interfaceC2464q.mo32766j()));
            return new C13663t<>(interfaceC2464q, m32899a.m32900d(), AbstractC2512a.f7138a.m32700a(m32899a));
        }
        C13291q.m5357b(m5358a);
        C2500u c2500u = (C2500u) m5358a;
        try {
            C13288p.C13289a c13289a3 = C13288p.f29444c;
            kotlin.e0.d.l.c(c2500u, "rawResponse");
            m5358a2 = new C13663t(interfaceC2464q, c2500u, new AbstractC2512a.C2515c(u.mo32715a(c2500u)));
            C13288p.m5362a(m5358a2);
        } catch (Throwable th2) {
            C13288p.C13289a c13289a4 = C13288p.f29444c;
            m5358a2 = C13291q.m5358a(th2);
            C13288p.m5362a(m5358a2);
        }
        Throwable m5361b2 = C13288p.m5361b(m5358a2);
        if (m5361b2 != null) {
            C13288p.C13289a c13289a5 = C13288p.f29444c;
            FuelError.C2422a c2422a = FuelError.f6968d;
            kotlin.e0.d.l.c(c2500u, "rawResponse");
            m5358a2 = new C13663t(interfaceC2464q, c2500u, new AbstractC2512a.C2514b(c2422a.m32899a(m5361b2, c2500u)));
            C13288p.m5362a(m5358a2);
        }
        C13291q.m5357b(m5358a2);
        return (C13663t) m5358a2;
    }
}
