package com.github.kittinunf.fuel.core;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.requests.C2481d;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.InterfaceC11824h;
import kotlin.TypeCastException;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
/* compiled from: Encoding.kt */
/* renamed from: com.github.kittinunf.fuel.core.i */
/* loaded from: classes2.dex */
public final class C2443i implements InterfaceC2499t {

    /* renamed from: z */
    static final /* synthetic */ InterfaceC11872i[] f6992z = {C11813x.m10312f(new C11808s(C11813x.m10316b(C2443i.class), TransactionRequest.TYPE_REQUEST, "getRequest()Lcom/github/kittinunf/fuel/core/Request;"))};

    /* renamed from: c */
    private final InterfaceC11772q<EnumC2462o, String, List<? extends C13287o<String, ? extends Object>>, InterfaceC2464q> f6993c;

    /* renamed from: d */
    private final InterfaceC11824h f6994d;

    /* renamed from: e */
    private final C2460n f6995e;

    /* renamed from: f */
    private final EnumC2462o f6996f;

    /* renamed from: w */
    private final String f6997w;

    /* renamed from: x */
    private final String f6998x;

    /* renamed from: y */
    private final List<C13287o<String, Object>> f6999y;

    /* compiled from: Encoding.kt */
    /* renamed from: com.github.kittinunf.fuel.core.i$a */
    /* loaded from: classes2.dex */
    static final class C2444a extends AbstractC11802m implements InterfaceC11772q<EnumC2462o, String, List<? extends C13287o<? extends String, ? extends Object>>, C2481d> {
        C2444a() {
            super(3);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: a */
        public final C2481d invoke(EnumC2462o enumC2462o, String str, List<? extends C13287o<String, ? extends Object>> list) {
            kotlin.e0.d.l.g(enumC2462o, "method");
            kotlin.e0.d.l.g(str, "path");
            URL m32879w = C2443i.this.m32879w(str);
            if (list == null) {
                list = C13726r.m3891e();
            }
            return new C2481d(enumC2462o, m32879w, C2460n.f7036w.m32827c(C2443i.this.f6995e), list, null, null, null, 112, null);
        }
    }

    /* compiled from: Encoding.kt */
    /* renamed from: com.github.kittinunf.fuel.core.i$b */
    /* loaded from: classes2.dex */
    static final class C2445b extends AbstractC11802m implements InterfaceC11756a<InterfaceC2464q> {
        C2445b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC2464q invoke() {
            return (InterfaceC2464q) C2443i.this.f6993c.invoke(C2443i.this.m32878x(), C2443i.this.m32877y(), C2443i.this.m32883c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2443i(EnumC2462o enumC2462o, String str, String str2, List<? extends C13287o<String, ? extends Object>> list) {
        InterfaceC11824h m5625b;
        kotlin.e0.d.l.g(enumC2462o, "httpMethod");
        kotlin.e0.d.l.g(str, "urlString");
        this.f6996f = enumC2462o;
        this.f6997w = str;
        this.f6998x = str2;
        this.f6999y = list;
        this.f6993c = new C2444a();
        m5625b = C13218k.m5625b(new C2445b());
        this.f6994d = m5625b;
        this.f6995e = C2460n.f7036w.m32826d(new C13287o[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final URL m32879w(String str) {
        boolean m5415M;
        boolean m5378w0;
        URL url;
        URI uri;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            String str2 = this.f6998x;
            if (str2 == null) {
                str2 = "";
            }
            m5415M = C13277t.m5415M(str2, '/', false, 2, null);
            if (m5415M) {
                int length = str2.length() - 1;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                str2 = str2.substring(0, length);
                kotlin.e0.d.l.c(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            m5378w0 = C13277t.m5378w0(str, '/', false, 2, null);
            if (!(m5378w0 | (str.length() == 0))) {
                str = '/' + str;
            }
            sb.append(str);
            url = new URL(sb.toString());
        }
        try {
            uri = url.toURI();
        } catch (URISyntaxException unused2) {
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        return new URL(uri.toASCIIString());
    }

    /* renamed from: c */
    public final List<C13287o<String, Object>> m32883c() {
        return this.f6999y;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2499t
    public InterfaceC2464q getRequest() {
        InterfaceC11824h interfaceC11824h = this.f6994d;
        InterfaceC11872i interfaceC11872i = f6992z[0];
        return (InterfaceC2464q) interfaceC11824h.getValue();
    }

    /* renamed from: x */
    public final EnumC2462o m32878x() {
        return this.f6996f;
    }

    /* renamed from: y */
    public final String m32877y() {
        return this.f6997w;
    }

    public /* synthetic */ C2443i(EnumC2462o enumC2462o, String str, String str2, List list, int i, kotlin.e0.d.g gVar) {
        this(enumC2462o, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
