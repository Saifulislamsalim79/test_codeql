package com.google.firebase.perf.metrics.p180d;

import android.content.Context;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6639i;
import com.google.firebase.perf.p179k.C6663h;
import java.net.URI;
/* compiled from: FirebasePerfNetworkValidator.java */
/* renamed from: com.google.firebase.perf.metrics.d.c */
/* loaded from: classes2.dex */
final class C6699c extends AbstractC6701e {

    /* renamed from: c */
    private static final C6609a f16108c = C6609a.m21475e();

    /* renamed from: a */
    private final C6663h f16109a;

    /* renamed from: b */
    private final Context f16110b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6699c(C6663h c6663h, Context context) {
        this.f16110b = context;
        this.f16109a = c6663h;
    }

    /* renamed from: g */
    private URI m21088g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f16108c.m21470j("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private boolean m21087h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return C6639i.m21395a(uri, context);
    }

    /* renamed from: i */
    private boolean m21086i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    private boolean m21085j(String str) {
        return m21086i(str);
    }

    /* renamed from: k */
    private boolean m21084k(String str) {
        return (str == null || m21086i(str) || str.length() > 255) ? false : true;
    }

    /* renamed from: m */
    private boolean m21082m(int i) {
        return i > 0;
    }

    /* renamed from: n */
    private boolean m21081n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    private boolean m21080o(int i) {
        return i == -1 || i > 0;
    }

    /* renamed from: p */
    private boolean m21079p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    /* renamed from: q */
    private boolean m21078q(long j) {
        return j >= 0;
    }

    /* renamed from: r */
    private boolean m21077r(String str) {
        return str == null;
    }

    @Override // com.google.firebase.perf.metrics.p180d.AbstractC6701e
    /* renamed from: c */
    public boolean mo21063c() {
        if (m21085j(this.f16109a.m21247t0())) {
            C6609a c6609a = f16108c;
            c6609a.m21471i("URL is missing:" + this.f16109a.m21247t0());
            return false;
        }
        URI m21088g = m21088g(this.f16109a.m21247t0());
        if (m21088g == null) {
            f16108c.m21471i("URL cannot be parsed");
            return false;
        } else if (!m21087h(m21088g, this.f16110b)) {
            C6609a c6609a2 = f16108c;
            c6609a2.m21471i("URL fails allowlist rule: " + m21088g);
            return false;
        } else if (!m21084k(m21088g.getHost())) {
            f16108c.m21471i("URL host is null or invalid");
            return false;
        } else if (!m21079p(m21088g.getScheme())) {
            f16108c.m21471i("URL scheme is null or invalid");
            return false;
        } else if (!m21077r(m21088g.getUserInfo())) {
            f16108c.m21471i("URL user info is null");
            return false;
        } else if (!m21080o(m21088g.getPort())) {
            f16108c.m21471i("URL port is less than or equal to 0");
            return false;
        } else {
            if (!m21083l(this.f16109a.m21245v0() ? this.f16109a.m21256k0() : null)) {
                C6609a c6609a3 = f16108c;
                c6609a3.m21471i("HTTP Method is null or invalid: " + this.f16109a.m21256k0());
                return false;
            } else if (this.f16109a.m21244x0() && !m21082m(this.f16109a.m21255l0())) {
                C6609a c6609a4 = f16108c;
                c6609a4.m21471i("HTTP ResponseCode is a negative value:" + this.f16109a.m21255l0());
                return false;
            } else if (this.f16109a.m21243y0() && !m21081n(this.f16109a.m21253n0())) {
                C6609a c6609a5 = f16108c;
                c6609a5.m21471i("Request Payload is a negative value:" + this.f16109a.m21253n0());
                return false;
            } else if (this.f16109a.m21242z0() && !m21081n(this.f16109a.m21251p0())) {
                C6609a c6609a6 = f16108c;
                c6609a6.m21471i("Response Payload is a negative value:" + this.f16109a.m21251p0());
                return false;
            } else if (this.f16109a.m21246u0() && this.f16109a.m21258i0() > 0) {
                if (this.f16109a.m21290A0() && !m21078q(this.f16109a.m21250q0())) {
                    C6609a c6609a7 = f16108c;
                    c6609a7.m21471i("Time to complete the request is a negative value:" + this.f16109a.m21250q0());
                    return false;
                } else if (this.f16109a.m21288D0() && !m21078q(this.f16109a.m21248s0())) {
                    C6609a c6609a8 = f16108c;
                    c6609a8.m21471i("Time from the start of the request to the start of the response is null or a negative value:" + this.f16109a.m21248s0());
                    return false;
                } else if (this.f16109a.m21289B0() && this.f16109a.m21249r0() > 0) {
                    if (this.f16109a.m21244x0()) {
                        return true;
                    }
                    f16108c.m21471i("Did not receive a HTTP Response Code");
                    return false;
                } else {
                    C6609a c6609a9 = f16108c;
                    c6609a9.m21471i("Time from the start of the request to the end of the response is null, negative or zero:" + this.f16109a.m21249r0());
                    return false;
                }
            } else {
                C6609a c6609a10 = f16108c;
                c6609a10.m21471i("Start time of the request is null, or zero, or a negative value:" + this.f16109a.m21258i0());
                return false;
            }
        }
    }

    /* renamed from: l */
    boolean m21083l(C6663h.EnumC6667d enumC6667d) {
        return (enumC6667d == null || enumC6667d == C6663h.EnumC6667d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
