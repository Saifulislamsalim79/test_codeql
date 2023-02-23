package com.smartlook.sdk.smartlook.analytic.interceptor;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.smartlook.sdk.smartlook.analytic.interceptor.model.UrlMask;
import e.a.a.a.a.c.c.a;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.InterfaceC14211i;
import p565l.InterfaceC14233u;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B'\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0013"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/analytic/interceptor/SmartlookOkHttpInterceptor;", "Ll/u;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "Lcom/smartlook/sdk/smartlook/analytic/interceptor/model/UrlMask;", "urlMasks", "Ljava/util/List;", "", "sensitiveHeaderNameRegexps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "()V", "Companion", "a", "b", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class SmartlookOkHttpInterceptor implements InterfaceC14233u {
    public static final C7218a Companion = new C7218a(null);
    private static final String NO_CONNECTION_MSG = "No connection associated with this request did you use addInterceptor instead of addNetworkInterceptor?";
    private final List<String> sensitiveHeaderNameRegexps;
    private final List<UrlMask> urlMasks;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m10421d2 = {"com/smartlook/sdk/smartlook/analytic/interceptor/SmartlookOkHttpInterceptor$a", "", "NO_CONNECTION_MSG", "Ljava/lang/String;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.analytic.interceptor.SmartlookOkHttpInterceptor$a */
    /* loaded from: classes2.dex */
    public static final class C7218a {
        private C7218a() {
        }

        public /* synthetic */ C7218a(g gVar) {
            this();
        }
    }

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0016\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m10421d2 = {"com/smartlook/sdk/smartlook/analytic/interceptor/SmartlookOkHttpInterceptor$b", "Le/a/a/a/a/c/c/a;", "", "j", "()Ljava/lang/String;", "", "i", "()I", "f", "", "b", "()Z", TransactionField.TRANSACTION_CHANNEL, "a", "(I)I", "index", "(II)Ljava/lang/String;", "h", "Lokhttp3/Request;", "Lokhttp3/Request;", "l", "()Lokhttp3/Request;", TransactionRequest.TYPE_REQUEST, "e", "Ljava/lang/String;", "d", "INITIATOR", "Lokhttp3/Connection;", "Lokhttp3/Connection;", "k", "()Lokhttp3/Connection;", "connection", "Lokhttp3/Response;", "g", "Lokhttp3/Response;", "m", "()Lokhttp3/Response;", "response", "<init>", "(Lcom/smartlook/sdk/smartlook/analytic/interceptor/SmartlookOkHttpInterceptor;Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/Connection;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.analytic.interceptor.SmartlookOkHttpInterceptor$b */
    /* loaded from: classes2.dex */
    public final class C7219b extends a {

        /* renamed from: e */
        public final String f17149e;

        /* renamed from: f */
        public final C14116a0 f17150f;

        /* renamed from: g */
        public final C14131c0 f17151g;

        /* renamed from: h */
        public final InterfaceC14211i f17152h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7219b(SmartlookOkHttpInterceptor smartlookOkHttpInterceptor, C14116a0 c14116a0, C14131c0 c14131c0, InterfaceC14211i interfaceC14211i) {
            super(smartlookOkHttpInterceptor.urlMasks, smartlookOkHttpInterceptor.sensitiveHeaderNameRegexps);
            l.f(c14116a0, TransactionRequest.TYPE_REQUEST);
            l.f(interfaceC14211i, "connection");
            this.f17150f = c14116a0;
            this.f17151g = c14131c0;
            this.f17152h = interfaceC14211i;
            this.f17149e = "OkHttp";
        }

        /* renamed from: a */
        public int m19116a(int i) {
            C14229s m2883P;
            if (i == 0) {
                return this.f17150f.m2917e().m2545h();
            }
            C14131c0 c14131c0 = this.f17151g;
            if (c14131c0 == null || (m2883P = c14131c0.m2883P()) == null) {
                return 0;
            }
            return m2883P.m2545h();
        }

        /* renamed from: b */
        public boolean m19114b() {
            C14131c0 c14131c0 = this.f17151g;
            return (c14131c0 != null ? c14131c0.m2872m() : null) != null;
        }

        /* renamed from: d */
        public String m19112d() {
            return this.f17149e;
        }

        /* renamed from: f */
        public String m19111f() {
            String m2915g = this.f17150f.m2915g();
            if (m2915g != null) {
                String upperCase = m2915g.toUpperCase();
                l.e(upperCase, "(this as java.lang.String).toUpperCase()");
                return upperCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: h */
        public String m19110h() {
            return this.f17152h.protocol().toString();
        }

        /* renamed from: i */
        public int m19109i() {
            C14131c0 c14131c0 = this.f17151g;
            if (c14131c0 != null) {
                return c14131c0.m2887F();
            }
            return 0;
        }

        /* renamed from: j */
        public String m19108j() {
            return this.f17150f.m2913i().toString();
        }

        /* renamed from: k */
        public final InterfaceC14211i m19107k() {
            return this.f17152h;
        }

        /* renamed from: l */
        public final C14116a0 m19106l() {
            return this.f17150f;
        }

        /* renamed from: m */
        public final C14131c0 m19105m() {
            return this.f17151g;
        }

        /* renamed from: b */
        public String m19113b(int i, int i2) {
            C14229s m2883P;
            String m2544i;
            if (i == 0) {
                return this.f17150f.m2917e().m2544i(i2);
            }
            C14131c0 c14131c0 = this.f17151g;
            return (c14131c0 == null || (m2883P = c14131c0.m2883P()) == null || (m2544i = m2883P.m2544i(i2)) == null) ? "" : m2544i;
        }

        /* renamed from: a */
        public String m19115a(int i, int i2) {
            C14229s m2883P;
            String m2548e;
            if (i == 0) {
                return this.f17150f.m2917e().m2548e(i2);
            }
            C14131c0 c14131c0 = this.f17151g;
            return (c14131c0 == null || (m2883P = c14131c0.m2883P()) == null || (m2548e = m2883P.m2548e(i2)) == null) ? "" : m2548e;
        }
    }

    public SmartlookOkHttpInterceptor(List<UrlMask> list, List<String> list2) {
        this.urlMasks = list;
        this.sensitiveHeaderNameRegexps = list2;
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        l.f(interfaceC14234a, "chain");
        C14116a0 request = interfaceC14234a.request();
        InterfaceC14211i connection = interfaceC14234a.connection();
        if (connection != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                C14131c0 mo2478a = interfaceC14234a.mo2478a(request);
                e.a.a.a.c.h.a.U.P().c(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, new C7219b(this, request, mo2478a, connection));
                return mo2478a;
            } catch (IOException e) {
                e.a.a.a.c.h.a.U.P().a(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, new C7219b(this, request, null, connection));
                throw e;
            }
        }
        throw new IllegalStateException(NO_CONNECTION_MSG);
    }

    public SmartlookOkHttpInterceptor() {
        this(null, null);
    }
}
