package p565l.p566g0.p568f;

import java.io.IOException;
import java.util.List;
import p565l.AbstractC14120b0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14216l;
import p565l.C14229s;
import p565l.C14235v;
import p565l.InterfaceC14217m;
import p565l.InterfaceC14233u;
import p565l.p566g0.C14148c;
import p565l.p566g0.C14151d;
import p576m.C14351j;
import p576m.C14353l;
/* compiled from: BridgeInterceptor.java */
/* renamed from: l.g0.f.a */
/* loaded from: classes3.dex */
public final class C14166a implements InterfaceC14233u {

    /* renamed from: a */
    private final InterfaceC14217m f30984a;

    public C14166a(InterfaceC14217m interfaceC14217m) {
        this.f30984a = interfaceC14217m;
    }

    /* renamed from: a */
    private String m2733a(List<C14216l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C14216l c14216l = list.get(i);
            sb.append(c14216l.m2604c());
            sb.append('=');
            sb.append(c14216l.m2596k());
        }
        return sb.toString();
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        C14116a0 request = interfaceC14234a.request();
        C14116a0.C14117a m2914h = request.m2914h();
        AbstractC14120b0 m2921a = request.m2921a();
        if (m2921a != null) {
            C14235v contentType = m2921a.contentType();
            if (contentType != null) {
                m2914h.m2909d("Content-Type", contentType.toString());
            }
            long contentLength = m2921a.contentLength();
            if (contentLength != -1) {
                m2914h.m2909d("Content-Length", Long.toString(contentLength));
                m2914h.m2906g("Transfer-Encoding");
            } else {
                m2914h.m2909d("Transfer-Encoding", "chunked");
                m2914h.m2906g("Content-Length");
            }
        }
        boolean z = false;
        if (request.m2919c("Host") == null) {
            m2914h.m2909d("Host", C14148c.m2789s(request.m2913i(), false));
        }
        if (request.m2919c("Connection") == null) {
            m2914h.m2909d("Connection", "Keep-Alive");
        }
        if (request.m2919c("Accept-Encoding") == null && request.m2919c("Range") == null) {
            z = true;
            m2914h.m2909d("Accept-Encoding", "gzip");
        }
        List<C14216l> mo2594b = this.f30984a.mo2594b(request.m2913i());
        if (!mo2594b.isEmpty()) {
            m2914h.m2909d("Cookie", m2733a(mo2594b));
        }
        if (request.m2919c("User-Agent") == null) {
            m2914h.m2909d("User-Agent", C14151d.m2780a());
        }
        C14131c0 mo2478a = interfaceC14234a.mo2478a(m2914h.m2911b());
        C14172e.m2723g(this.f30984a, request.m2913i(), mo2478a.m2883P());
        C14131c0.C14132a m2879b0 = mo2478a.m2879b0();
        m2879b0.m2855p(request);
        if (z && "gzip".equalsIgnoreCase(mo2478a.m2885J("Content-Encoding")) && C14172e.m2727c(mo2478a)) {
            C14351j c14351j = new C14351j(mo2478a.m2878c().mo310O());
            C14229s.C14230a m2547f = mo2478a.m2883P().m2547f();
            m2547f.m2537f("Content-Encoding");
            m2547f.m2537f("Content-Length");
            m2879b0.m2861j(m2547f.m2539d());
            m2879b0.m2869b(new C14175h(mo2478a.m2885J("Content-Type"), -1L, C14353l.m2021d(c14351j)));
        }
        return m2879b0.m2868c();
    }
}
