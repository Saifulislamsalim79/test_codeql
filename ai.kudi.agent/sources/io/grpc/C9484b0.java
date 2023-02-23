package io.grpc;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* compiled from: HttpConnectProxiedSocketAddress.java */
/* renamed from: io.grpc.b0 */
/* loaded from: classes2.dex */
public final class C9484b0 extends AbstractC10091y0 {

    /* renamed from: c */
    private final SocketAddress f22171c;

    /* renamed from: d */
    private final InetSocketAddress f22172d;

    /* renamed from: e */
    private final String f22173e;

    /* renamed from: f */
    private final String f22174f;

    /* compiled from: HttpConnectProxiedSocketAddress.java */
    /* renamed from: io.grpc.b0$b */
    /* loaded from: classes2.dex */
    public static final class C9486b {

        /* renamed from: a */
        private SocketAddress f22175a;

        /* renamed from: b */
        private InetSocketAddress f22176b;

        /* renamed from: c */
        private String f22177c;

        /* renamed from: d */
        private String f22178d;

        /* renamed from: a */
        public C9484b0 m14616a() {
            return new C9484b0(this.f22175a, this.f22176b, this.f22177c, this.f22178d);
        }

        /* renamed from: b */
        public C9486b m14615b(String str) {
            this.f22178d = str;
            return this;
        }

        /* renamed from: c */
        public C9486b m14614c(SocketAddress socketAddress) {
            C5051n.m25779o(socketAddress, "proxyAddress");
            this.f22175a = socketAddress;
            return this;
        }

        /* renamed from: d */
        public C9486b m14613d(InetSocketAddress inetSocketAddress) {
            C5051n.m25779o(inetSocketAddress, "targetAddress");
            this.f22176b = inetSocketAddress;
            return this;
        }

        /* renamed from: e */
        public C9486b m14612e(String str) {
            this.f22177c = str;
            return this;
        }

        private C9486b() {
        }
    }

    /* renamed from: e */
    public static C9486b m14617e() {
        return new C9486b();
    }

    /* renamed from: a */
    public String m14621a() {
        return this.f22174f;
    }

    /* renamed from: b */
    public SocketAddress m14620b() {
        return this.f22171c;
    }

    /* renamed from: c */
    public InetSocketAddress m14619c() {
        return this.f22172d;
    }

    /* renamed from: d */
    public String m14618d() {
        return this.f22173e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9484b0) {
            C9484b0 c9484b0 = (C9484b0) obj;
            return C5046k.m25800a(this.f22171c, c9484b0.f22171c) && C5046k.m25800a(this.f22172d, c9484b0.f22172d) && C5046k.m25800a(this.f22173e, c9484b0.f22173e) && C5046k.m25800a(this.f22174f, c9484b0.f22174f);
        }
        return false;
    }

    public int hashCode() {
        return C5046k.m25799b(this.f22171c, this.f22172d, this.f22173e, this.f22174f);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("proxyAddr", this.f22171c);
        m25812c.m25808d("targetAddr", this.f22172d);
        m25812c.m25808d(CacheDataSource.PREF_USERNAME, this.f22173e);
        m25812c.m25807e("hasPassword", this.f22174f != null);
        return m25812c.toString();
    }

    private C9484b0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        C5051n.m25779o(socketAddress, "proxyAddress");
        C5051n.m25779o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            C5051n.m25771w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f22171c = socketAddress;
        this.f22172d = inetSocketAddress;
        this.f22173e = str;
        this.f22174f = str2;
    }
}
