package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
/* compiled from: LazyScopeAdapter.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.g */
/* loaded from: classes3.dex */
public final class C12775g extends AbstractC12762a {

    /* renamed from: b */
    private final InterfaceC12948i<InterfaceC12777h> f28665b;

    /* compiled from: LazyScopeAdapter.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.g$a */
    /* loaded from: classes3.dex */
    static final class C12776a extends AbstractC11802m implements InterfaceC11756a<InterfaceC12777h> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11756a<InterfaceC12777h> f28666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12776a(InterfaceC11756a<? extends InterfaceC12777h> interfaceC11756a) {
            super(0);
            this.f28666c = interfaceC11756a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC12777h invoke() {
            InterfaceC12777h invoke = this.f28666c.invoke();
            return invoke instanceof AbstractC12762a ? ((AbstractC12762a) invoke).m6816h() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12775g(InterfaceC11756a<? extends InterfaceC12777h> interfaceC11756a) {
        this(null, interfaceC11756a, 1, null);
        l.f(interfaceC11756a, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C12775g(kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n r1, kotlin.p483e0.p484c.InterfaceC11756a r2, int r3, kotlin.e0.d.g r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            kotlin.j0.o.c.p0.k.n r1 = kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.f28984e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.e0.d.l.e(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12775g.<init>(kotlin.j0.o.c.p0.k.n, kotlin.e0.c.a, int, kotlin.e0.d.g):void");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12762a
    /* renamed from: i */
    protected InterfaceC12777h mo6761i() {
        return this.f28665b.invoke();
    }

    public C12775g(InterfaceC12954n interfaceC12954n, InterfaceC11756a<? extends InterfaceC12777h> interfaceC11756a) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC11756a, "getScope");
        this.f28665b = interfaceC12954n.mo6367d(new C12776a(interfaceC11756a));
    }
}
