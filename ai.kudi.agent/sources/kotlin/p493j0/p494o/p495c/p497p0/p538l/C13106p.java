package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* renamed from: kotlin.j0.o.c.p0.l.p */
/* loaded from: classes3.dex */
public final class C13106p extends AbstractC13137y0 {

    /* renamed from: d */
    public static final C13107a f29179d = new C13107a(null);

    /* renamed from: b */
    private final AbstractC13137y0 f29180b;

    /* renamed from: c */
    private final AbstractC13137y0 f29181c;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.p$a */
    /* loaded from: classes3.dex */
    public static final class C13107a {
        private C13107a() {
        }

        public /* synthetic */ C13107a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13137y0 m5855a(AbstractC13137y0 abstractC13137y0, AbstractC13137y0 abstractC13137y02) {
            l.f(abstractC13137y0, "first");
            l.f(abstractC13137y02, "second");
            return abstractC13137y0.mo5744f() ? abstractC13137y02 : abstractC13137y02.mo5744f() ? abstractC13137y0 : new C13106p(abstractC13137y0, abstractC13137y02, null);
        }
    }

    private C13106p(AbstractC13137y0 abstractC13137y0, AbstractC13137y0 abstractC13137y02) {
        this.f29180b = abstractC13137y0;
        this.f29181c = abstractC13137y02;
    }

    public /* synthetic */ C13106p(AbstractC13137y0 abstractC13137y0, AbstractC13137y0 abstractC13137y02, g gVar) {
        this(abstractC13137y0, abstractC13137y02);
    }

    /* renamed from: h */
    public static final AbstractC13137y0 m5856h(AbstractC13137y0 abstractC13137y0, AbstractC13137y0 abstractC13137y02) {
        return f29179d.m5855a(abstractC13137y0, abstractC13137y02);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: a */
    public boolean mo5751a() {
        return this.f29180b.mo5751a() || this.f29181c.mo5751a();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: b */
    public boolean mo5746b() {
        return this.f29180b.mo5746b() || this.f29181c.mo5746b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: d */
    public InterfaceC13346g mo5749d(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "annotations");
        return this.f29181c.mo5749d(this.f29180b.mo5749d(interfaceC13346g));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: e */
    public InterfaceC13131v0 mo5745e(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "key");
        InterfaceC13131v0 mo5745e = this.f29180b.mo5745e(abstractC12965b0);
        return mo5745e == null ? this.f29181c.mo5745e(abstractC12965b0) : mo5745e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: f */
    public boolean mo5744f() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: g */
    public AbstractC12965b0 mo5748g(AbstractC12965b0 abstractC12965b0, EnumC13008h1 enumC13008h1) {
        l.f(abstractC12965b0, "topLevelType");
        l.f(enumC13008h1, "position");
        return this.f29181c.mo5748g(this.f29180b.mo5748g(abstractC12965b0, enumC13008h1), enumC13008h1);
    }
}
