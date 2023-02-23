package com.github.kittinunf.fuel.core.p090x;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.C2443i;
import com.github.kittinunf.fuel.core.C2448l;
import com.github.kittinunf.fuel.core.C2460n;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.C2503v;
import com.github.kittinunf.fuel.core.EnumC2462o;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
/* compiled from: RedirectionInterceptor.kt */
/* renamed from: com.github.kittinunf.fuel.core.x.c */
/* loaded from: classes2.dex */
public final class C2509c {

    /* renamed from: a */
    private static final List<Integer> f7134a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RedirectionInterceptor.kt */
    /* renamed from: com.github.kittinunf.fuel.core.x.c$a */
    /* loaded from: classes2.dex */
    public static final class C2510a extends AbstractC11802m implements InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, ? extends C2500u>, InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, ? extends C2500u>> {

        /* renamed from: c */
        final /* synthetic */ C2448l f7135c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RedirectionInterceptor.kt */
        /* renamed from: com.github.kittinunf.fuel.core.x.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C2511a extends AbstractC11802m implements InterfaceC11771p<InterfaceC2464q, C2500u, C2500u> {

            /* renamed from: d */
            final /* synthetic */ InterfaceC11771p f7137d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2511a(InterfaceC11771p interfaceC11771p) {
                super(2);
                this.f7137d = interfaceC11771p;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: a */
            public final C2500u invoke(InterfaceC2464q interfaceC2464q, C2500u c2500u) {
                List m5384q0;
                l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
                l.g(c2500u, "response");
                if (C2503v.m32716c(c2500u) && !l.b(interfaceC2464q.mo32771e().m32816b(), Boolean.FALSE)) {
                    Collection<String> m32725a = c2500u.m32725a("Location");
                    if (m32725a.isEmpty()) {
                        m32725a = c2500u.m32725a("Content-Location");
                    }
                    String str = (String) C13722p.m3942d0(m32725a);
                    if (str == null || str.length() == 0) {
                        return (C2500u) this.f7137d.invoke(interfaceC2464q, c2500u);
                    }
                    m5384q0 = C13277t.m5384q0(str, new char[]{'?'}, false, 0, 6, null);
                    URL url = new URI((String) C13722p.m3954R(m5384q0)).isAbsolute() ? new URL(str) : new URL(interfaceC2464q.mo32766j(), str);
                    EnumC2462o mo32765k = C2509c.f7134a.contains(Integer.valueOf(c2500u.m32722d())) ? EnumC2462o.GET : interfaceC2464q.mo32765k();
                    String url2 = url.toString();
                    l.c(url2, "newUrl.toString()");
                    InterfaceC2464q mo32767i = C2510a.this.f7135c.m32859n(new C2443i(mo32765k, url2, null, null, 12, null)).mo32767i(C2460n.f7036w.m32827c(interfaceC2464q.mo32775a()));
                    if (!l.b(url.getHost(), interfaceC2464q.mo32766j().getHost())) {
                        mo32767i.mo32775a().remove("Authorization");
                    }
                    InterfaceC2464q mo32760p = mo32767i.mo32768h(interfaceC2464q.mo32771e().m32810h()).mo32760p(interfaceC2464q.mo32771e().m32808j());
                    if (mo32765k == interfaceC2464q.mo32765k() && !interfaceC2464q.mo32761o().isEmpty() && !interfaceC2464q.mo32761o().mo32744g()) {
                        mo32760p = mo32760p.mo32758r(interfaceC2464q.mo32761o());
                    }
                    return (C2500u) this.f7137d.invoke(interfaceC2464q, mo32760p.mo32764l().m4229d());
                }
                return (C2500u) this.f7137d.invoke(interfaceC2464q, c2500u);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2510a(C2448l c2448l) {
            super(1);
            this.f7135c = c2448l;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC11771p<InterfaceC2464q, C2500u, C2500u> invoke(InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u> interfaceC11771p) {
            l.g(interfaceC11771p, "next");
            return new C2511a(interfaceC11771p);
        }
    }

    static {
        List<Integer> m3888h;
        m3888h = C13726r.m3888h(301, 302, 303);
        f7134a = m3888h;
    }

    /* renamed from: b */
    public static final InterfaceC11767l<InterfaceC11771p<? super InterfaceC2464q, ? super C2500u, C2500u>, InterfaceC11771p<InterfaceC2464q, C2500u, C2500u>> m32703b(C2448l c2448l) {
        l.g(c2448l, "manager");
        return new C2510a(c2448l);
    }
}
