package com.google.firebase.crashlytics.p112h.p117l;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.p141g.InterfaceC5968a;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: com.google.firebase.crashlytics.h.l.a */
/* loaded from: classes2.dex */
public final class C5426a implements InterfaceC5968a {

    /* renamed from: a */
    public static final InterfaceC5968a f13397a = new C5426a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$a */
    /* loaded from: classes2.dex */
    private static final class C5427a implements InterfaceC5964c<AbstractC5448a0.AbstractC5449a> {

        /* renamed from: a */
        static final C5427a f13398a = new C5427a();

        /* renamed from: b */
        private static final C5961b f13399b = C5961b.m23168d("pid");

        /* renamed from: c */
        private static final C5961b f13400c = C5961b.m23168d("processName");

        /* renamed from: d */
        private static final C5961b f13401d = C5961b.m23168d("reasonCode");

        /* renamed from: e */
        private static final C5961b f13402e = C5961b.m23168d("importance");

        /* renamed from: f */
        private static final C5961b f13403f = C5961b.m23168d("pss");

        /* renamed from: g */
        private static final C5961b f13404g = C5961b.m23168d("rss");

        /* renamed from: h */
        private static final C5961b f13405h = C5961b.m23168d("timestamp");

        /* renamed from: i */
        private static final C5961b f13406i = C5961b.m23168d("traceFile");

        private C5427a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5449a abstractC5449a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15510c(f13399b, abstractC5449a.mo24711c());
            interfaceC5965d.mo15507f(f13400c, abstractC5449a.mo24710d());
            interfaceC5965d.mo15510c(f13401d, abstractC5449a.mo24708f());
            interfaceC5965d.mo15510c(f13402e, abstractC5449a.mo24712b());
            interfaceC5965d.mo15511b(f13403f, abstractC5449a.mo24709e());
            interfaceC5965d.mo15511b(f13404g, abstractC5449a.mo24707g());
            interfaceC5965d.mo15511b(f13405h, abstractC5449a.mo24706h());
            interfaceC5965d.mo15507f(f13406i, abstractC5449a.mo24705i());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$b */
    /* loaded from: classes2.dex */
    private static final class C5428b implements InterfaceC5964c<AbstractC5448a0.AbstractC5452c> {

        /* renamed from: a */
        static final C5428b f13407a = new C5428b();

        /* renamed from: b */
        private static final C5961b f13408b = C5961b.m23168d("key");

        /* renamed from: c */
        private static final C5961b f13409c = C5961b.m23168d("value");

        private C5428b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5452c abstractC5452c, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13408b, abstractC5452c.mo24691b());
            interfaceC5965d.mo15507f(f13409c, abstractC5452c.mo24690c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$c */
    /* loaded from: classes2.dex */
    private static final class C5429c implements InterfaceC5964c<AbstractC5448a0> {

        /* renamed from: a */
        static final C5429c f13410a = new C5429c();

        /* renamed from: b */
        private static final C5961b f13411b = C5961b.m23168d("sdkVersion");

        /* renamed from: c */
        private static final C5961b f13412c = C5961b.m23168d("gmpAppId");

        /* renamed from: d */
        private static final C5961b f13413d = C5961b.m23168d("platform");

        /* renamed from: e */
        private static final C5961b f13414e = C5961b.m23168d("installationUuid");

        /* renamed from: f */
        private static final C5961b f13415f = C5961b.m23168d("buildVersion");

        /* renamed from: g */
        private static final C5961b f13416g = C5961b.m23168d("displayVersion");

        /* renamed from: h */
        private static final C5961b f13417h = C5961b.m23168d("session");

        /* renamed from: i */
        private static final C5961b f13418i = C5961b.m23168d("ndkPayload");

        private C5429c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0 abstractC5448a0, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13411b, abstractC5448a0.mo24726i());
            interfaceC5965d.mo15507f(f13412c, abstractC5448a0.mo24730e());
            interfaceC5965d.mo15510c(f13413d, abstractC5448a0.mo24727h());
            interfaceC5965d.mo15507f(f13414e, abstractC5448a0.mo24729f());
            interfaceC5965d.mo15507f(f13415f, abstractC5448a0.mo24732c());
            interfaceC5965d.mo15507f(f13416g, abstractC5448a0.mo24731d());
            interfaceC5965d.mo15507f(f13417h, abstractC5448a0.mo24725j());
            interfaceC5965d.mo15507f(f13418i, abstractC5448a0.mo24728g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$d */
    /* loaded from: classes2.dex */
    private static final class C5430d implements InterfaceC5964c<AbstractC5448a0.AbstractC5454d> {

        /* renamed from: a */
        static final C5430d f13419a = new C5430d();

        /* renamed from: b */
        private static final C5961b f13420b = C5961b.m23168d("files");

        /* renamed from: c */
        private static final C5961b f13421c = C5961b.m23168d("orgId");

        private C5430d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5454d abstractC5454d, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13420b, abstractC5454d.mo24654b());
            interfaceC5965d.mo15507f(f13421c, abstractC5454d.mo24653c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$e */
    /* loaded from: classes2.dex */
    private static final class C5431e implements InterfaceC5964c<AbstractC5448a0.AbstractC5454d.AbstractC5456b> {

        /* renamed from: a */
        static final C5431e f13422a = new C5431e();

        /* renamed from: b */
        private static final C5961b f13423b = C5961b.m23168d("filename");

        /* renamed from: c */
        private static final C5961b f13424c = C5961b.m23168d("contents");

        private C5431e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5454d.AbstractC5456b abstractC5456b, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13423b, abstractC5456b.mo24648c());
            interfaceC5965d.mo15507f(f13424c, abstractC5456b.mo24649b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$f */
    /* loaded from: classes2.dex */
    private static final class C5432f implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5459a> {

        /* renamed from: a */
        static final C5432f f13425a = new C5432f();

        /* renamed from: b */
        private static final C5961b f13426b = C5961b.m23168d("identifier");

        /* renamed from: c */
        private static final C5961b f13427c = C5961b.m23168d("version");

        /* renamed from: d */
        private static final C5961b f13428d = C5961b.m23168d("displayVersion");

        /* renamed from: e */
        private static final C5961b f13429e = C5961b.m23168d("organization");

        /* renamed from: f */
        private static final C5961b f13430f = C5961b.m23168d("installationUuid");

        /* renamed from: g */
        private static final C5961b f13431g = C5961b.m23168d("developmentPlatform");

        /* renamed from: h */
        private static final C5961b f13432h = C5961b.m23168d("developmentPlatformVersion");

        private C5432f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5459a abstractC5459a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13426b, abstractC5459a.mo24617e());
            interfaceC5965d.mo15507f(f13427c, abstractC5459a.mo24614h());
            interfaceC5965d.mo15507f(f13428d, abstractC5459a.mo24618d());
            interfaceC5965d.mo15507f(f13429e, abstractC5459a.mo24615g());
            interfaceC5965d.mo15507f(f13430f, abstractC5459a.mo24616f());
            interfaceC5965d.mo15507f(f13431g, abstractC5459a.mo24620b());
            interfaceC5965d.mo15507f(f13432h, abstractC5459a.mo24619c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$g */
    /* loaded from: classes2.dex */
    private static final class C5433g implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b> {

        /* renamed from: a */
        static final C5433g f13433a = new C5433g();

        /* renamed from: b */
        private static final C5961b f13434b = C5961b.m23168d("clsId");

        private C5433g() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b abstractC5461b, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13434b, abstractC5461b.mo24606a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$h */
    /* loaded from: classes2.dex */
    private static final class C5434h implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5463c> {

        /* renamed from: a */
        static final C5434h f13435a = new C5434h();

        /* renamed from: b */
        private static final C5961b f13436b = C5961b.m23168d("arch");

        /* renamed from: c */
        private static final C5961b f13437c = C5961b.m23168d("model");

        /* renamed from: d */
        private static final C5961b f13438d = C5961b.m23168d("cores");

        /* renamed from: e */
        private static final C5961b f13439e = C5961b.m23168d("ram");

        /* renamed from: f */
        private static final C5961b f13440f = C5961b.m23168d("diskSpace");

        /* renamed from: g */
        private static final C5961b f13441g = C5961b.m23168d("simulator");

        /* renamed from: h */
        private static final C5961b f13442h = C5961b.m23168d(SendReceiptToTerminalConfirmationBottomSheet.STATE);

        /* renamed from: i */
        private static final C5961b f13443i = C5961b.m23168d("manufacturer");

        /* renamed from: j */
        private static final C5961b f13444j = C5961b.m23168d("modelClass");

        private C5434h() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15510c(f13436b, abstractC5463c.mo24605b());
            interfaceC5965d.mo15507f(f13437c, abstractC5463c.mo24601f());
            interfaceC5965d.mo15510c(f13438d, abstractC5463c.mo24604c());
            interfaceC5965d.mo15511b(f13439e, abstractC5463c.mo24599h());
            interfaceC5965d.mo15511b(f13440f, abstractC5463c.mo24603d());
            interfaceC5965d.mo15512a(f13441g, abstractC5463c.mo24597j());
            interfaceC5965d.mo15510c(f13442h, abstractC5463c.mo24598i());
            interfaceC5965d.mo15507f(f13443i, abstractC5463c.mo24602e());
            interfaceC5965d.mo15507f(f13444j, abstractC5463c.mo24600g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$i */
    /* loaded from: classes2.dex */
    private static final class C5435i implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e> {

        /* renamed from: a */
        static final C5435i f13445a = new C5435i();

        /* renamed from: b */
        private static final C5961b f13446b = C5961b.m23168d("generator");

        /* renamed from: c */
        private static final C5961b f13447c = C5961b.m23168d("identifier");

        /* renamed from: d */
        private static final C5961b f13448d = C5961b.m23168d("startedAt");

        /* renamed from: e */
        private static final C5961b f13449e = C5961b.m23168d("endedAt");

        /* renamed from: f */
        private static final C5961b f13450f = C5961b.m23168d("crashed");

        /* renamed from: g */
        private static final C5961b f13451g = C5961b.m23168d("app");

        /* renamed from: h */
        private static final C5961b f13452h = C5961b.m23168d("user");

        /* renamed from: i */
        private static final C5961b f13453i = C5961b.m23168d("os");

        /* renamed from: j */
        private static final C5961b f13454j = C5961b.m23168d("device");

        /* renamed from: k */
        private static final C5961b f13455k = C5961b.m23168d("events");

        /* renamed from: l */
        private static final C5961b f13456l = C5961b.m23168d("generatorType");

        private C5435i() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e abstractC5458e, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13446b, abstractC5458e.mo24640f());
            interfaceC5965d.mo15507f(f13447c, abstractC5458e.m24752i());
            interfaceC5965d.mo15511b(f13448d, abstractC5458e.mo24636k());
            interfaceC5965d.mo15507f(f13449e, abstractC5458e.mo24642d());
            interfaceC5965d.mo15512a(f13450f, abstractC5458e.mo24634m());
            interfaceC5965d.mo15507f(f13451g, abstractC5458e.mo24644b());
            interfaceC5965d.mo15507f(f13452h, abstractC5458e.mo24635l());
            interfaceC5965d.mo15507f(f13453i, abstractC5458e.mo24637j());
            interfaceC5965d.mo15507f(f13454j, abstractC5458e.mo24643c());
            interfaceC5965d.mo15507f(f13455k, abstractC5458e.mo24641e());
            interfaceC5965d.mo15510c(f13456l, abstractC5458e.mo24639g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$j */
    /* loaded from: classes2.dex */
    private static final class C5436j implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a> {

        /* renamed from: a */
        static final C5436j f13457a = new C5436j();

        /* renamed from: b */
        private static final C5961b f13458b = C5961b.m23168d("execution");

        /* renamed from: c */
        private static final C5961b f13459c = C5961b.m23168d("customAttributes");

        /* renamed from: d */
        private static final C5961b f13460d = C5961b.m23168d("internalKeys");

        /* renamed from: e */
        private static final C5961b f13461e = C5961b.m23168d("background");

        /* renamed from: f */
        private static final C5961b f13462f = C5961b.m23168d("uiOrientation");

        private C5436j() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a abstractC5466a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13458b, abstractC5466a.mo24572d());
            interfaceC5965d.mo15507f(f13459c, abstractC5466a.mo24573c());
            interfaceC5965d.mo15507f(f13460d, abstractC5466a.mo24571e());
            interfaceC5965d.mo15507f(f13461e, abstractC5466a.mo24574b());
            interfaceC5965d.mo15510c(f13462f, abstractC5466a.mo24570f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$k */
    /* loaded from: classes2.dex */
    private static final class C5437k implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> {

        /* renamed from: a */
        static final C5437k f13463a = new C5437k();

        /* renamed from: b */
        private static final C5961b f13464b = C5961b.m23168d("baseAddress");

        /* renamed from: c */
        private static final C5961b f13465c = C5961b.m23168d("size");

        /* renamed from: d */
        private static final C5961b f13466d = C5961b.m23168d("name");

        /* renamed from: e */
        private static final C5961b f13467e = C5961b.m23168d("uuid");

        private C5437k() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a abstractC5469a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f13464b, abstractC5469a.mo24551b());
            interfaceC5965d.mo15511b(f13465c, abstractC5469a.mo24549d());
            interfaceC5965d.mo15507f(f13466d, abstractC5469a.mo24550c());
            interfaceC5965d.mo15507f(f13467e, abstractC5469a.m24742f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$l */
    /* loaded from: classes2.dex */
    private static final class C5438l implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b> {

        /* renamed from: a */
        static final C5438l f13468a = new C5438l();

        /* renamed from: b */
        private static final C5961b f13469b = C5961b.m23168d("threads");

        /* renamed from: c */
        private static final C5961b f13470c = C5961b.m23168d("exception");

        /* renamed from: d */
        private static final C5961b f13471d = C5961b.m23168d("appExitInfo");

        /* renamed from: e */
        private static final C5961b f13472e = C5961b.m23168d("signal");

        /* renamed from: f */
        private static final C5961b f13473f = C5961b.m23168d("binaries");

        private C5438l() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b abstractC5468b, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13469b, abstractC5468b.mo24558f());
            interfaceC5965d.mo15507f(f13470c, abstractC5468b.mo24560d());
            interfaceC5965d.mo15507f(f13471d, abstractC5468b.mo24562b());
            interfaceC5965d.mo15507f(f13472e, abstractC5468b.mo24559e());
            interfaceC5965d.mo15507f(f13473f, abstractC5468b.mo24561c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$m */
    /* loaded from: classes2.dex */
    private static final class C5439m implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c> {

        /* renamed from: a */
        static final C5439m f13474a = new C5439m();

        /* renamed from: b */
        private static final C5961b f13475b = C5961b.m23168d("type");

        /* renamed from: c */
        private static final C5961b f13476c = C5961b.m23168d("reason");

        /* renamed from: d */
        private static final C5961b f13477d = C5961b.m23168d("frames");

        /* renamed from: e */
        private static final C5961b f13478e = C5961b.m23168d("causedBy");

        /* renamed from: f */
        private static final C5961b f13479f = C5961b.m23168d("overflowCount");

        private C5439m() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13475b, abstractC5472c.mo24538f());
            interfaceC5965d.mo15507f(f13476c, abstractC5472c.mo24539e());
            interfaceC5965d.mo15507f(f13477d, abstractC5472c.mo24541c());
            interfaceC5965d.mo15507f(f13478e, abstractC5472c.mo24542b());
            interfaceC5965d.mo15510c(f13479f, abstractC5472c.mo24540d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$n */
    /* loaded from: classes2.dex */
    private static final class C5440n implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d> {

        /* renamed from: a */
        static final C5440n f13480a = new C5440n();

        /* renamed from: b */
        private static final C5961b f13481b = C5961b.m23168d("name");

        /* renamed from: c */
        private static final C5961b f13482c = C5961b.m23168d("code");

        /* renamed from: d */
        private static final C5961b f13483d = C5961b.m23168d("address");

        private C5440n() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d abstractC5474d, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13481b, abstractC5474d.mo24529d());
            interfaceC5965d.mo15507f(f13482c, abstractC5474d.mo24530c());
            interfaceC5965d.mo15511b(f13483d, abstractC5474d.mo24531b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$o */
    /* loaded from: classes2.dex */
    private static final class C5441o implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> {

        /* renamed from: a */
        static final C5441o f13484a = new C5441o();

        /* renamed from: b */
        private static final C5961b f13485b = C5961b.m23168d("name");

        /* renamed from: c */
        private static final C5961b f13486c = C5961b.m23168d("importance");

        /* renamed from: d */
        private static final C5961b f13487d = C5961b.m23168d("frames");

        private C5441o() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e abstractC5476e, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13485b, abstractC5476e.mo24522d());
            interfaceC5965d.mo15510c(f13486c, abstractC5476e.mo24523c());
            interfaceC5965d.mo15507f(f13487d, abstractC5476e.mo24524b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$p */
    /* loaded from: classes2.dex */
    private static final class C5442p implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> {

        /* renamed from: a */
        static final C5442p f13488a = new C5442p();

        /* renamed from: b */
        private static final C5961b f13489b = C5961b.m23168d("pc");

        /* renamed from: c */
        private static final C5961b f13490c = C5961b.m23168d("symbol");

        /* renamed from: d */
        private static final C5961b f13491d = C5961b.m23168d("file");

        /* renamed from: e */
        private static final C5961b f13492e = C5961b.m23168d(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);

        /* renamed from: f */
        private static final C5961b f13493f = C5961b.m23168d("importance");

        private C5442p() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b abstractC5478b, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f13489b, abstractC5478b.mo24514e());
            interfaceC5965d.mo15507f(f13490c, abstractC5478b.mo24513f());
            interfaceC5965d.mo15507f(f13491d, abstractC5478b.mo24517b());
            interfaceC5965d.mo15511b(f13492e, abstractC5478b.mo24515d());
            interfaceC5965d.mo15510c(f13493f, abstractC5478b.mo24516c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$q */
    /* loaded from: classes2.dex */
    private static final class C5443q implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c> {

        /* renamed from: a */
        static final C5443q f13494a = new C5443q();

        /* renamed from: b */
        private static final C5961b f13495b = C5961b.m23168d("batteryLevel");

        /* renamed from: c */
        private static final C5961b f13496c = C5961b.m23168d("batteryVelocity");

        /* renamed from: d */
        private static final C5961b f13497d = C5961b.m23168d("proximityOn");

        /* renamed from: e */
        private static final C5961b f13498e = C5961b.m23168d("orientation");

        /* renamed from: f */
        private static final C5961b f13499f = C5961b.m23168d("ramUsed");

        /* renamed from: g */
        private static final C5961b f13500g = C5961b.m23168d("diskUsed");

        private C5443q() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c abstractC5481c, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13495b, abstractC5481c.mo24506b());
            interfaceC5965d.mo15510c(f13496c, abstractC5481c.mo24505c());
            interfaceC5965d.mo15512a(f13497d, abstractC5481c.mo24501g());
            interfaceC5965d.mo15510c(f13498e, abstractC5481c.mo24503e());
            interfaceC5965d.mo15511b(f13499f, abstractC5481c.mo24502f());
            interfaceC5965d.mo15511b(f13500g, abstractC5481c.mo24504d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$r */
    /* loaded from: classes2.dex */
    private static final class C5444r implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d> {

        /* renamed from: a */
        static final C5444r f13501a = new C5444r();

        /* renamed from: b */
        private static final C5961b f13502b = C5961b.m23168d("timestamp");

        /* renamed from: c */
        private static final C5961b f13503c = C5961b.m23168d("type");

        /* renamed from: d */
        private static final C5961b f13504d = C5961b.m23168d("app");

        /* renamed from: e */
        private static final C5961b f13505e = C5961b.m23168d("device");

        /* renamed from: f */
        private static final C5961b f13506f = C5961b.m23168d("log");

        private C5444r() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f13502b, abstractC5465d.mo24583e());
            interfaceC5965d.mo15507f(f13503c, abstractC5465d.mo24582f());
            interfaceC5965d.mo15507f(f13504d, abstractC5465d.mo24586b());
            interfaceC5965d.mo15507f(f13505e, abstractC5465d.mo24585c());
            interfaceC5965d.mo15507f(f13506f, abstractC5465d.mo24584d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$s */
    /* loaded from: classes2.dex */
    private static final class C5445s implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d> {

        /* renamed from: a */
        static final C5445s f13507a = new C5445s();

        /* renamed from: b */
        private static final C5961b f13508b = C5961b.m23168d("content");

        private C5445s() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d abstractC5483d, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13508b, abstractC5483d.mo24493b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$t */
    /* loaded from: classes2.dex */
    private static final class C5446t implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5485e> {

        /* renamed from: a */
        static final C5446t f13509a = new C5446t();

        /* renamed from: b */
        private static final C5961b f13510b = C5961b.m23168d("platform");

        /* renamed from: c */
        private static final C5961b f13511c = C5961b.m23168d("version");

        /* renamed from: d */
        private static final C5961b f13512d = C5961b.m23168d("buildVersion");

        /* renamed from: e */
        private static final C5961b f13513e = C5961b.m23168d("jailbroken");

        private C5446t() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15510c(f13510b, abstractC5485e.mo24489c());
            interfaceC5965d.mo15507f(f13511c, abstractC5485e.mo24488d());
            interfaceC5965d.mo15507f(f13512d, abstractC5485e.mo24490b());
            interfaceC5965d.mo15512a(f13513e, abstractC5485e.mo24487e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.a$u */
    /* loaded from: classes2.dex */
    private static final class C5447u implements InterfaceC5964c<AbstractC5448a0.AbstractC5458e.AbstractC5487f> {

        /* renamed from: a */
        static final C5447u f13514a = new C5447u();

        /* renamed from: b */
        private static final C5961b f13515b = C5961b.m23168d("identifier");

        private C5447u() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC5448a0.AbstractC5458e.AbstractC5487f abstractC5487f, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f13515b, abstractC5487f.mo24481b());
        }
    }

    private C5426a() {
    }

    @Override // com.google.firebase.encoders.p141g.InterfaceC5968a
    /* renamed from: a */
    public void mo15620a(InterfaceC5969b<?> interfaceC5969b) {
        interfaceC5969b.mo15833a(AbstractC5448a0.class, C5429c.f13410a);
        interfaceC5969b.mo15833a(C5489b.class, C5429c.f13410a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.class, C5435i.f13445a);
        interfaceC5969b.mo15833a(C5517g.class, C5435i.f13445a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5459a.class, C5432f.f13425a);
        interfaceC5969b.mo15833a(C5520h.class, C5432f.f13425a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b.class, C5433g.f13433a);
        interfaceC5969b.mo15833a(C5523i.class, C5433g.f13433a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5487f.class, C5447u.f13514a);
        interfaceC5969b.mo15833a(C5560v.class, C5447u.f13514a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5485e.class, C5446t.f13509a);
        interfaceC5969b.mo15833a(C5557u.class, C5446t.f13509a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5463c.class, C5434h.f13435a);
        interfaceC5969b.mo15833a(C5524j.class, C5434h.f13435a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.class, C5444r.f13501a);
        interfaceC5969b.mo15833a(C5527k.class, C5444r.f13501a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.class, C5436j.f13457a);
        interfaceC5969b.mo15833a(C5530l.class, C5436j.f13457a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.class, C5438l.f13468a);
        interfaceC5969b.mo15833a(C5533m.class, C5438l.f13468a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.class, C5441o.f13484a);
        interfaceC5969b.mo15833a(C5545q.class, C5441o.f13484a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.class, C5442p.f13488a);
        interfaceC5969b.mo15833a(C5548r.class, C5442p.f13488a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.class, C5439m.f13474a);
        interfaceC5969b.mo15833a(C5539o.class, C5439m.f13474a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5449a.class, C5427a.f13398a);
        interfaceC5969b.mo15833a(C5493c.class, C5427a.f13398a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.class, C5440n.f13480a);
        interfaceC5969b.mo15833a(C5542p.class, C5440n.f13480a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.class, C5437k.f13463a);
        interfaceC5969b.mo15833a(C5536n.class, C5437k.f13463a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5452c.class, C5428b.f13407a);
        interfaceC5969b.mo15833a(C5500d.class, C5428b.f13407a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.class, C5443q.f13494a);
        interfaceC5969b.mo15833a(C5551s.class, C5443q.f13494a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.class, C5445s.f13507a);
        interfaceC5969b.mo15833a(C5554t.class, C5445s.f13507a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5454d.class, C5430d.f13419a);
        interfaceC5969b.mo15833a(C5511e.class, C5430d.f13419a);
        interfaceC5969b.mo15833a(AbstractC5448a0.AbstractC5454d.AbstractC5456b.class, C5431e.f13422a);
        interfaceC5969b.mo15833a(C5514f.class, C5431e.f13422a);
    }
}
