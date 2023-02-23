package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14231t;
import p565l.C14235v;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14141f;
/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21051a(C14131c0 c14131c0, C6695b c6695b, long j, long j2) throws IOException {
        C14116a0 m2873k0 = c14131c0.m2873k0();
        if (m2873k0 == null) {
            return;
        }
        c6695b.m21092t(m2873k0.m2913i().m2529G().toString());
        c6695b.m21102j(m2873k0.m2915g());
        if (m2873k0.m2921a() != null) {
            long contentLength = m2873k0.m2921a().contentLength();
            if (contentLength != -1) {
                c6695b.m21099m(contentLength);
            }
        }
        AbstractC14135d0 m2878c = c14131c0.m2878c();
        if (m2878c != null) {
            long mo309m = m2878c.mo309m();
            if (mo309m != -1) {
                c6695b.m21096p(mo309m);
            }
            C14235v mo311F = m2878c.mo311F();
            if (mo311F != null) {
                c6695b.m21097o(mo311F.toString());
            }
        }
        c6695b.m21101k(c14131c0.m2887F());
        c6695b.m21098n(j);
        c6695b.m21094r(j2);
        c6695b.m21110b();
    }

    @Keep
    public static void enqueue(InterfaceC14138e interfaceC14138e, InterfaceC14141f interfaceC14141f) {
        C6637h c6637h = new C6637h();
        interfaceC14138e.mo2417J(new C6708g(interfaceC14141f, C6623k.m21437e(), c6637h, c6637h.m21399d()));
    }

    @Keep
    public static C14131c0 execute(InterfaceC14138e interfaceC14138e) throws IOException {
        C6695b m21109c = C6695b.m21109c(C6623k.m21437e());
        C6637h c6637h = new C6637h();
        long m21399d = c6637h.m21399d();
        try {
            C14131c0 execute = interfaceC14138e.execute();
            m21051a(execute, m21109c, m21399d, c6637h.m21401b());
            return execute;
        } catch (IOException e) {
            C14116a0 request = interfaceC14138e.request();
            if (request != null) {
                C14231t m2913i = request.m2913i();
                if (m2913i != null) {
                    m21109c.m21092t(m2913i.m2529G().toString());
                }
                if (request.m2915g() != null) {
                    m21109c.m21102j(request.m2915g());
                }
            }
            m21109c.m21098n(m21399d);
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }
}
