package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.e0 */
/* loaded from: classes3.dex */
public final class C12981e0 extends AbstractC13011i1 {

    /* renamed from: d */
    private final InterfaceC12954n f29049d;

    /* renamed from: e */
    private final InterfaceC11756a<AbstractC12965b0> f29050e;

    /* renamed from: f */
    private final InterfaceC12948i<AbstractC12965b0> f29051f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.e0$a */
    /* loaded from: classes3.dex */
    public static final class C12982a extends AbstractC11802m implements InterfaceC11756a<AbstractC12965b0> {

        /* renamed from: c */
        final /* synthetic */ AbstractC13026h f29052c;

        /* renamed from: d */
        final /* synthetic */ C12981e0 f29053d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12982a(AbstractC13026h abstractC13026h, C12981e0 c12981e0) {
            super(0);
            this.f29052c = abstractC13026h;
            this.f29053d = c12981e0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC12965b0 invoke() {
            AbstractC13026h abstractC13026h = this.f29052c;
            AbstractC12965b0 abstractC12965b0 = (AbstractC12965b0) this.f29053d.f29050e.invoke();
            abstractC13026h.mo6099g(abstractC12965b0);
            return abstractC12965b0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12981e0(InterfaceC12954n interfaceC12954n, InterfaceC11756a<? extends AbstractC12965b0> interfaceC11756a) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC11756a, "computation");
        this.f29049d = interfaceC12954n;
        this.f29050e = interfaceC11756a;
        this.f29051f = interfaceC12954n.mo6367d(interfaceC11756a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13011i1
    /* renamed from: a1 */
    protected AbstractC12965b0 mo6201a1() {
        return this.f29051f.invoke();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13011i1
    /* renamed from: b1 */
    public boolean mo6200b1() {
        return this.f29051f.m6376d();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: d1 */
    public C12981e0 mo5768Y0(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return new C12981e0(this.f29049d, new C12982a(abstractC13026h, this));
    }
}
