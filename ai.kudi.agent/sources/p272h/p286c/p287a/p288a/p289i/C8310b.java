package p272h.p286c.p287a.p288a.p289i;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.p141g.InterfaceC5968a;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import com.google.firebase.encoders.p143i.C5979c;
import java.io.IOException;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8366a;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8368b;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8370c;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8373d;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8375e;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8377f;
/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: h.c.a.a.i.b */
/* loaded from: classes2.dex */
public final class C8310b implements InterfaceC5968a {

    /* renamed from: a */
    public static final InterfaceC5968a f19927a = new C8310b();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$a */
    /* loaded from: classes2.dex */
    private static final class C8311a implements InterfaceC5964c<C8366a> {

        /* renamed from: a */
        static final C8311a f19928a = new C8311a();

        /* renamed from: b */
        private static final C5961b f19929b;

        /* renamed from: c */
        private static final C5961b f19930c;

        /* renamed from: d */
        private static final C5961b f19931d;

        /* renamed from: e */
        private static final C5961b f19932e;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("window");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19929b = m23171a.m23167a();
            C5961b.C5963b m23171a2 = C5961b.m23171a("logSourceMetrics");
            C5979c m23132b2 = C5979c.m23132b();
            m23132b2.m23131c(2);
            m23171a2.m23166b(m23132b2.m23133a());
            f19930c = m23171a2.m23167a();
            C5961b.C5963b m23171a3 = C5961b.m23171a("globalMetrics");
            C5979c m23132b3 = C5979c.m23132b();
            m23132b3.m23131c(3);
            m23171a3.m23166b(m23132b3.m23133a());
            f19931d = m23171a3.m23167a();
            C5961b.C5963b m23171a4 = C5961b.m23171a("appNamespace");
            C5979c m23132b4 = C5979c.m23132b();
            m23132b4.m23131c(4);
            m23171a4.m23166b(m23132b4.m23133a());
            f19932e = m23171a4.m23167a();
        }

        private C8311a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8366a c8366a, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f19929b, c8366a.m16204d());
            interfaceC5965d.mo15507f(f19930c, c8366a.m16205c());
            interfaceC5965d.mo15507f(f19931d, c8366a.m16206b());
            interfaceC5965d.mo15507f(f19932e, c8366a.m16207a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$b */
    /* loaded from: classes2.dex */
    private static final class C8312b implements InterfaceC5964c<C8368b> {

        /* renamed from: a */
        static final C8312b f19933a = new C8312b();

        /* renamed from: b */
        private static final C5961b f19934b;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("storageMetrics");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19934b = m23171a.m23167a();
        }

        private C8312b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8368b c8368b, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f19934b, c8368b.m16196a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$c */
    /* loaded from: classes2.dex */
    private static final class C8313c implements InterfaceC5964c<C8370c> {

        /* renamed from: a */
        static final C8313c f19935a = new C8313c();

        /* renamed from: b */
        private static final C5961b f19936b;

        /* renamed from: c */
        private static final C5961b f19937c;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("eventsDroppedCount");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19936b = m23171a.m23167a();
            C5961b.C5963b m23171a2 = C5961b.m23171a("reason");
            C5979c m23132b2 = C5979c.m23132b();
            m23132b2.m23131c(3);
            m23171a2.m23166b(m23132b2.m23133a());
            f19937c = m23171a2.m23167a();
        }

        private C8313c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8370c c8370c, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f19936b, c8370c.m16192a());
            interfaceC5965d.mo15507f(f19937c, c8370c.m16191b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$d */
    /* loaded from: classes2.dex */
    private static final class C8314d implements InterfaceC5964c<C8373d> {

        /* renamed from: a */
        static final C8314d f19938a = new C8314d();

        /* renamed from: b */
        private static final C5961b f19939b;

        /* renamed from: c */
        private static final C5961b f19940c;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("logSource");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19939b = m23171a.m23167a();
            C5961b.C5963b m23171a2 = C5961b.m23171a("logEventDropped");
            C5979c m23132b2 = C5979c.m23132b();
            m23132b2.m23131c(2);
            m23171a2.m23166b(m23132b2.m23133a());
            f19940c = m23171a2.m23167a();
        }

        private C8314d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8373d c8373d, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f19939b, c8373d.m16184b());
            interfaceC5965d.mo15507f(f19940c, c8373d.m16185a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$e */
    /* loaded from: classes2.dex */
    private static final class C8315e implements InterfaceC5964c<AbstractC8347m> {

        /* renamed from: a */
        static final C8315e f19941a = new C8315e();

        /* renamed from: b */
        private static final C5961b f19942b = C5961b.m23168d("clientMetrics");

        private C8315e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(AbstractC8347m abstractC8347m, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15507f(f19942b, abstractC8347m.m16256b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$f */
    /* loaded from: classes2.dex */
    private static final class C8316f implements InterfaceC5964c<C8375e> {

        /* renamed from: a */
        static final C8316f f19943a = new C8316f();

        /* renamed from: b */
        private static final C5961b f19944b;

        /* renamed from: c */
        private static final C5961b f19945c;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("currentCacheSizeBytes");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19944b = m23171a.m23167a();
            C5961b.C5963b m23171a2 = C5961b.m23171a("maxCacheSizeBytes");
            C5979c m23132b2 = C5979c.m23132b();
            m23132b2.m23131c(2);
            m23171a2.m23166b(m23132b2.m23133a());
            f19945c = m23171a2.m23167a();
        }

        private C8316f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8375e c8375e, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f19944b, c8375e.m16179a());
            interfaceC5965d.mo15511b(f19945c, c8375e.m16178b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: h.c.a.a.i.b$g */
    /* loaded from: classes2.dex */
    private static final class C8317g implements InterfaceC5964c<C8377f> {

        /* renamed from: a */
        static final C8317g f19946a = new C8317g();

        /* renamed from: b */
        private static final C5961b f19947b;

        /* renamed from: c */
        private static final C5961b f19948c;

        static {
            C5961b.C5963b m23171a = C5961b.m23171a("startMs");
            C5979c m23132b = C5979c.m23132b();
            m23132b.m23131c(1);
            m23171a.m23166b(m23132b.m23133a());
            f19947b = m23171a.m23167a();
            C5961b.C5963b m23171a2 = C5961b.m23171a("endMs");
            C5979c m23132b2 = C5979c.m23132b();
            m23132b2.m23131c(2);
            m23171a2.m23166b(m23132b2.m23133a());
            f19948c = m23171a2.m23167a();
        }

        private C8317g() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5964c
        /* renamed from: b */
        public void mo15475a(C8377f c8377f, InterfaceC5965d interfaceC5965d) throws IOException {
            interfaceC5965d.mo15511b(f19947b, c8377f.m16172b());
            interfaceC5965d.mo15511b(f19948c, c8377f.m16173a());
        }
    }

    private C8310b() {
    }

    @Override // com.google.firebase.encoders.p141g.InterfaceC5968a
    /* renamed from: a */
    public void mo15620a(InterfaceC5969b<?> interfaceC5969b) {
        interfaceC5969b.mo15833a(AbstractC8347m.class, C8315e.f19941a);
        interfaceC5969b.mo15833a(C8366a.class, C8311a.f19928a);
        interfaceC5969b.mo15833a(C8377f.class, C8317g.f19946a);
        interfaceC5969b.mo15833a(C8373d.class, C8314d.f19938a);
        interfaceC5969b.mo15833a(C8370c.class, C8313c.f19935a);
        interfaceC5969b.mo15833a(C8368b.class, C8312b.f19933a);
        interfaceC5969b.mo15833a(C8375e.class, C8316f.f19943a);
    }
}
