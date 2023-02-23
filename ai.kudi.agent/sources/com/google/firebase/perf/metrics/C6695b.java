package com.google.firebase.perf.metrics;

import com.google.firebase.perf.network.C6709h;
import com.google.firebase.perf.p172f.AbstractC6596b;
import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6641k;
import com.google.firebase.perf.p179k.C6663h;
import com.google.firebase.perf.p179k.C6675k;
import com.google.firebase.perf.session.C6710a;
import com.google.firebase.perf.session.InterfaceC6712b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: NetworkRequestMetricBuilder.java */
/* renamed from: com.google.firebase.perf.metrics.b */
/* loaded from: classes2.dex */
public final class C6695b extends AbstractC6596b implements InterfaceC6712b {

    /* renamed from: A */
    private static final C6609a f16095A = C6609a.m21475e();

    /* renamed from: c */
    private final List<C6710a> f16096c;

    /* renamed from: d */
    private final GaugeManager f16097d;

    /* renamed from: e */
    private final C6623k f16098e;

    /* renamed from: f */
    private final C6663h.C6665b f16099f;

    /* renamed from: w */
    private final WeakReference<InterfaceC6712b> f16100w;

    /* renamed from: x */
    private String f16101x;

    /* renamed from: y */
    private boolean f16102y;

    /* renamed from: z */
    private boolean f16103z;

    private C6695b(C6623k c6623k) {
        this(c6623k, C6593a.m21528b(), GaugeManager.getInstance());
    }

    /* renamed from: c */
    public static C6695b m21109c(C6623k c6623k) {
        return new C6695b(c6623k);
    }

    /* renamed from: g */
    private boolean m21105g() {
        return this.f16099f.m21238I();
    }

    /* renamed from: h */
    private boolean m21104h() {
        return this.f16099f.m21236L();
    }

    /* renamed from: i */
    private static boolean m21103i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.perf.session.InterfaceC6712b
    /* renamed from: a */
    public void mo20977a(C6710a c6710a) {
        if (c6710a == null) {
            f16095A.m21471i("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (!m21105g() || m21104h()) {
        } else {
            this.f16096c.add(c6710a);
        }
    }

    /* renamed from: b */
    public C6663h m21110b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f16100w);
        unregisterForAppState();
        C6675k[] m20988b = C6710a.m20988b(m21108d());
        if (m20988b != null) {
            this.f16099f.m21241F(Arrays.asList(m20988b));
        }
        C6663h build = this.f16099f.build();
        if (!C6709h.m20991c(this.f16101x)) {
            f16095A.m21479a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        } else if (!this.f16102y) {
            this.f16098e.m21419w(build, getAppState());
            this.f16102y = true;
            return build;
        } else {
            if (this.f16103z) {
                f16095A.m21479a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
    }

    /* renamed from: d */
    List<C6710a> m21108d() {
        List<C6710a> unmodifiableList;
        synchronized (this.f16096c) {
            ArrayList arrayList = new ArrayList();
            for (C6710a c6710a : this.f16096c) {
                if (c6710a != null) {
                    arrayList.add(c6710a);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public long m21107e() {
        return this.f16099f.m21239H();
    }

    /* renamed from: f */
    public boolean m21106f() {
        return this.f16099f.m21237K();
    }

    /* renamed from: j */
    public C6695b m21102j(String str) {
        C6663h.EnumC6667d enumC6667d;
        if (str != null) {
            C6663h.EnumC6667d enumC6667d2 = C6663h.EnumC6667d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 6;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 0;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 2;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    enumC6667d = C6663h.EnumC6667d.GET;
                    break;
                case 1:
                    enumC6667d = C6663h.EnumC6667d.PUT;
                    break;
                case 2:
                    enumC6667d = C6663h.EnumC6667d.POST;
                    break;
                case 3:
                    enumC6667d = C6663h.EnumC6667d.DELETE;
                    break;
                case 4:
                    enumC6667d = C6663h.EnumC6667d.HEAD;
                    break;
                case 5:
                    enumC6667d = C6663h.EnumC6667d.PATCH;
                    break;
                case 6:
                    enumC6667d = C6663h.EnumC6667d.OPTIONS;
                    break;
                case 7:
                    enumC6667d = C6663h.EnumC6667d.TRACE;
                    break;
                case '\b':
                    enumC6667d = C6663h.EnumC6667d.CONNECT;
                    break;
                default:
                    enumC6667d = C6663h.EnumC6667d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f16099f.m21234N(enumC6667d);
        }
        return this;
    }

    /* renamed from: k */
    public C6695b m21101k(int i) {
        this.f16099f.m21233O(i);
        return this;
    }

    /* renamed from: l */
    public C6695b m21100l() {
        this.f16099f.m21232P(C6663h.EnumC6669e.GENERIC_CLIENT_ERROR);
        return this;
    }

    /* renamed from: m */
    public C6695b m21099m(long j) {
        this.f16099f.m21231Q(j);
        return this;
    }

    /* renamed from: n */
    public C6695b m21098n(long j) {
        C6710a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f16100w);
        this.f16099f.m21235M(j);
        mo20977a(perfSession);
        if (perfSession.m20984f()) {
            this.f16097d.collectGaugeMetricOnce(perfSession.m20986d());
        }
        return this;
    }

    /* renamed from: o */
    public C6695b m21097o(String str) {
        if (str == null) {
            this.f16099f.m21240G();
            return this;
        }
        if (m21103i(str)) {
            this.f16099f.m21230R(str);
        } else {
            C6609a c6609a = f16095A;
            c6609a.m21471i("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: p */
    public C6695b m21096p(long j) {
        this.f16099f.m21229S(j);
        return this;
    }

    /* renamed from: q */
    public C6695b m21095q(long j) {
        this.f16099f.m21228T(j);
        return this;
    }

    /* renamed from: r */
    public C6695b m21094r(long j) {
        this.f16099f.m21227U(j);
        if (SessionManager.getInstance().perfSession().m20984f()) {
            this.f16097d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m20986d());
        }
        return this;
    }

    /* renamed from: s */
    public C6695b m21093s(long j) {
        this.f16099f.m21226W(j);
        return this;
    }

    /* renamed from: t */
    public C6695b m21092t(String str) {
        if (str != null) {
            this.f16099f.m21225X(C6641k.m21389e(C6641k.m21390d(str), 2000));
        }
        return this;
    }

    /* renamed from: u */
    public C6695b m21091u(String str) {
        this.f16101x = str;
        return this;
    }

    public C6695b(C6623k c6623k, C6593a c6593a, GaugeManager gaugeManager) {
        super(c6593a);
        this.f16099f = C6663h.m21287E0();
        this.f16100w = new WeakReference<>(this);
        this.f16098e = c6623k;
        this.f16097d = gaugeManager;
        this.f16096c = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
