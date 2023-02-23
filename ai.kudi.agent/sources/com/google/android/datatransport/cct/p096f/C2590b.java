package com.google.android.datatransport.cct.p096f;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.p141g.InterfaceC5968a;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.io.IOException;
/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: com.google.android.datatransport.cct.f.b */
/* loaded from: classes2.dex */
public final class C2590b implements InterfaceC5968a {

    /* renamed from: a */
    public static final InterfaceC5968a f7236a = new C2590b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$a */
    /* loaded from: classes2.dex */
    private static final class C2591a implements InterfaceC5964c<AbstractC2588a> {

        /* renamed from: a */
        static final C2591a f7237a = new C2591a();

        /* renamed from: b */
        private static final C5961b f7238b = C5961b.m23168d("sdkVersion");

        /* renamed from: c */
        private static final C5961b f7239c = C5961b.m23168d("model");

        /* renamed from: d */
        private static final C5961b f7240d = C5961b.m23168d("hardware");

        /* renamed from: e */
        private static final C5961b f7241e = C5961b.m23168d("device");

        /* renamed from: f */
        private static final C5961b f7242f = C5961b.m23168d("product");

        /* renamed from: g */
        private static final C5961b f7243g = C5961b.m23168d("osBuild");

        /* renamed from: h */
        private static final C5961b f7244h = C5961b.m23168d("manufacturer");

        /* renamed from: i */
        private static final C5961b f7245i = C5961b.m23168d("fingerprint");

        /* renamed from: j */
        private static final C5961b f7246j = C5961b.m23168d("locale");

        /* renamed from: k */
        private static final C5961b f7247k = C5961b.m23168d("country");

        /* renamed from: l */
        private static final C5961b f7248l = C5961b.m23168d("mccMnc");

        /* renamed from: m */
        private static final C5961b f7249m = C5961b.m23168d("applicationBuild");

        private C2591a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2588a abstractC2588a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f7238b, abstractC2588a.mo32548m());
            interfaceC5965d.mo15507f(f7239c, abstractC2588a.mo32551j());
            interfaceC5965d.mo15507f(f7240d, abstractC2588a.mo32555f());
            interfaceC5965d.mo15507f(f7241e, abstractC2588a.mo32557d());
            interfaceC5965d.mo15507f(f7242f, abstractC2588a.mo32549l());
            interfaceC5965d.mo15507f(f7243g, abstractC2588a.mo32550k());
            interfaceC5965d.mo15507f(f7244h, abstractC2588a.mo32553h());
            interfaceC5965d.mo15507f(f7245i, abstractC2588a.mo32556e());
            interfaceC5965d.mo15507f(f7246j, abstractC2588a.mo32554g());
            interfaceC5965d.mo15507f(f7247k, abstractC2588a.mo32558c());
            interfaceC5965d.mo15507f(f7248l, abstractC2588a.mo32552i());
            interfaceC5965d.mo15507f(f7249m, abstractC2588a.mo32559b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$b */
    /* loaded from: classes2.dex */
    private static final class C2592b implements InterfaceC5964c<AbstractC2614j> {

        /* renamed from: a */
        static final C2592b f7250a = new C2592b();

        /* renamed from: b */
        private static final C5961b f7251b = C5961b.m23168d("logRequest");

        private C2592b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2614j abstractC2614j, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f7251b, abstractC2614j.mo32532c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$c */
    /* loaded from: classes2.dex */
    private static final class C2593c implements InterfaceC5964c<AbstractC2615k> {

        /* renamed from: a */
        static final C2593c f7252a = new C2593c();

        /* renamed from: b */
        private static final C5961b f7253b = C5961b.m23168d("clientType");

        /* renamed from: c */
        private static final C5961b f7254c = C5961b.m23168d("androidClientInfo");

        private C2593c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2615k abstractC2615k, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f7253b, abstractC2615k.mo32529c());
            interfaceC5965d.mo15507f(f7254c, abstractC2615k.mo32530b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$d */
    /* loaded from: classes2.dex */
    private static final class C2594d implements InterfaceC5964c<AbstractC2618l> {

        /* renamed from: a */
        static final C2594d f7255a = new C2594d();

        /* renamed from: b */
        private static final C5961b f7256b = C5961b.m23168d("eventTimeMs");

        /* renamed from: c */
        private static final C5961b f7257c = C5961b.m23168d("eventCode");

        /* renamed from: d */
        private static final C5961b f7258d = C5961b.m23168d("eventUptimeMs");

        /* renamed from: e */
        private static final C5961b f7259e = C5961b.m23168d("sourceExtension");

        /* renamed from: f */
        private static final C5961b f7260f = C5961b.m23168d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C5961b f7261g = C5961b.m23168d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C5961b f7262h = C5961b.m23168d("networkConnectionInfo");

        private C2594d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2618l abstractC2618l, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f7256b, abstractC2618l.mo32523c());
            interfaceC5965d.mo15507f(f7257c, abstractC2618l.mo32524b());
            interfaceC5965d.mo15511b(f7258d, abstractC2618l.mo32522d());
            interfaceC5965d.mo15507f(f7259e, abstractC2618l.mo32520f());
            interfaceC5965d.mo15507f(f7260f, abstractC2618l.mo32519g());
            interfaceC5965d.mo15511b(f7261g, abstractC2618l.mo32518h());
            interfaceC5965d.mo15507f(f7262h, abstractC2618l.mo32521e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$e */
    /* loaded from: classes2.dex */
    private static final class C2595e implements InterfaceC5964c<AbstractC2620m> {

        /* renamed from: a */
        static final C2595e f7263a = new C2595e();

        /* renamed from: b */
        private static final C5961b f7264b = C5961b.m23168d("requestTimeMs");

        /* renamed from: c */
        private static final C5961b f7265c = C5961b.m23168d("requestUptimeMs");

        /* renamed from: d */
        private static final C5961b f7266d = C5961b.m23168d("clientInfo");

        /* renamed from: e */
        private static final C5961b f7267e = C5961b.m23168d("logSource");

        /* renamed from: f */
        private static final C5961b f7268f = C5961b.m23168d("logSourceName");

        /* renamed from: g */
        private static final C5961b f7269g = C5961b.m23168d("logEvent");

        /* renamed from: h */
        private static final C5961b f7270h = C5961b.m23168d("qosTier");

        private C2595e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2620m abstractC2620m, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f7264b, abstractC2620m.mo32501g());
            interfaceC5965d.mo15511b(f7265c, abstractC2620m.mo32500h());
            interfaceC5965d.mo15507f(f7266d, abstractC2620m.mo32506b());
            interfaceC5965d.mo15507f(f7267e, abstractC2620m.mo32504d());
            interfaceC5965d.mo15507f(f7268f, abstractC2620m.mo32503e());
            interfaceC5965d.mo15507f(f7269g, abstractC2620m.mo32505c());
            interfaceC5965d.mo15507f(f7270h, abstractC2620m.mo32502f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$f */
    /* loaded from: classes2.dex */
    private static final class C2596f implements InterfaceC5964c<AbstractC2623o> {

        /* renamed from: a */
        static final C2596f f7271a = new C2596f();

        /* renamed from: b */
        private static final C5961b f7272b = C5961b.m23168d("networkType");

        /* renamed from: c */
        private static final C5961b f7273c = C5961b.m23168d("mobileSubtype");

        private C2596f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC2623o abstractC2623o, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f7272b, abstractC2623o.mo32484c());
            interfaceC5965d.mo15507f(f7273c, abstractC2623o.mo32485b());
        }
    }

    private C2590b() {
    }

    @Override // com.google.firebase.encoders.p141g.InterfaceC5968a
    /* renamed from: a */
    public void mo15620a(InterfaceC5969b<?> interfaceC5969b) {
        interfaceC5969b.mo15833a(AbstractC2614j.class, C2592b.f7250a);
        interfaceC5969b.mo15833a(C2600d.class, C2592b.f7250a);
        interfaceC5969b.mo15833a(AbstractC2620m.class, C2595e.f7263a);
        interfaceC5969b.mo15833a(C2607g.class, C2595e.f7263a);
        interfaceC5969b.mo15833a(AbstractC2615k.class, C2593c.f7252a);
        interfaceC5969b.mo15833a(C2601e.class, C2593c.f7252a);
        interfaceC5969b.mo15833a(AbstractC2588a.class, C2591a.f7237a);
        interfaceC5969b.mo15833a(C2597c.class, C2591a.f7237a);
        interfaceC5969b.mo15833a(AbstractC2618l.class, C2594d.f7255a);
        interfaceC5969b.mo15833a(C2604f.class, C2594d.f7255a);
        interfaceC5969b.mo15833a(AbstractC2623o.class, C2596f.f7271a);
        interfaceC5969b.mo15833a(C2611i.class, C2596f.f7271a);
    }
}
