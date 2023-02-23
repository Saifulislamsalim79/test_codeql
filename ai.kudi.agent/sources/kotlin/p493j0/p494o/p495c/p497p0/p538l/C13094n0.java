package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.l.n0 */
/* loaded from: classes3.dex */
public final class C13094n0 extends AbstractC13133w0 {

    /* renamed from: a */
    private final InterfaceC13562z0 f29167a;

    /* renamed from: b */
    private final InterfaceC11824h f29168b;

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.n0$a */
    /* loaded from: classes3.dex */
    static final class C13095a extends AbstractC11802m implements InterfaceC11756a<AbstractC12965b0> {
        C13095a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC12965b0 invoke() {
            return C13104o0.m5857a(C13094n0.this.f29167a);
        }
    }

    public C13094n0(InterfaceC13562z0 interfaceC13562z0) {
        InterfaceC11824h m5626a;
        l.f(interfaceC13562z0, "typeParameter");
        this.f29167a = interfaceC13562z0;
        m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C13095a());
        this.f29168b = m5626a;
    }

    /* renamed from: f */
    private final AbstractC12965b0 m5881f() {
        return (AbstractC12965b0) this.f29168b.getValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: a */
    public EnumC13008h1 mo5760a() {
        return EnumC13008h1.OUT_VARIANCE;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: b */
    public InterfaceC13131v0 mo5759b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: c */
    public AbstractC12965b0 mo5758c() {
        return m5881f();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: d */
    public boolean mo5757d() {
        return true;
    }
}
