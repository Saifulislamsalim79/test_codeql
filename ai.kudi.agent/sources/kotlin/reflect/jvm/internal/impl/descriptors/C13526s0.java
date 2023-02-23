package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
/* compiled from: ScopesHolderForClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s0 */
/* loaded from: classes3.dex */
public final class C13526s0<T extends InterfaceC12777h> {

    /* renamed from: a */
    private final InterfaceC13312e f29881a;

    /* renamed from: b */
    private final InterfaceC11767l<AbstractC13026h, T> f29882b;

    /* renamed from: c */
    private final AbstractC13026h f29883c;

    /* renamed from: d */
    private final InterfaceC12948i f29884d;

    /* renamed from: f */
    static final /* synthetic */ InterfaceC11872i<Object>[] f29880f = {C11813x.m10312f(new C11808s(C11813x.m10316b(C13526s0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e */
    public static final C13527a f29879e = new C13527a(null);

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s0$a */
    /* loaded from: classes3.dex */
    public static final class C13527a {
        private C13527a() {
        }

        public /* synthetic */ C13527a(kotlin.e0.d.g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T extends InterfaceC12777h> C13526s0<T> m4737a(InterfaceC13312e interfaceC13312e, InterfaceC12954n interfaceC12954n, AbstractC13026h abstractC13026h, InterfaceC11767l<? super AbstractC13026h, ? extends T> interfaceC11767l) {
            kotlin.e0.d.l.f(interfaceC13312e, "classDescriptor");
            kotlin.e0.d.l.f(interfaceC12954n, "storageManager");
            kotlin.e0.d.l.f(abstractC13026h, "kotlinTypeRefinerForOwnerModule");
            kotlin.e0.d.l.f(interfaceC11767l, "scopeFactory");
            return new C13526s0<>(interfaceC13312e, interfaceC12954n, interfaceC11767l, abstractC13026h, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s0$b */
    /* loaded from: classes3.dex */
    public static final class C13528b extends AbstractC11802m implements InterfaceC11756a<T> {

        /* renamed from: c */
        final /* synthetic */ C13526s0<T> f29885c;

        /* renamed from: d */
        final /* synthetic */ AbstractC13026h f29886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13528b(C13526s0<T> c13526s0, AbstractC13026h abstractC13026h) {
            super(0);
            this.f29885c = c13526s0;
            this.f29886d = abstractC13026h;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final T invoke() {
            return (T) ((C13526s0) this.f29885c).f29882b.invoke(this.f29886d);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s0$c */
    /* loaded from: classes3.dex */
    static final class C13529c extends AbstractC11802m implements InterfaceC11756a<T> {

        /* renamed from: c */
        final /* synthetic */ C13526s0<T> f29887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13529c(C13526s0<T> c13526s0) {
            super(0);
            this.f29887c = c13526s0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final T invoke() {
            return (T) ((C13526s0) this.f29887c).f29882b.invoke(((C13526s0) this.f29887c).f29883c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13526s0(InterfaceC13312e interfaceC13312e, InterfaceC12954n interfaceC12954n, InterfaceC11767l<? super AbstractC13026h, ? extends T> interfaceC11767l, AbstractC13026h abstractC13026h) {
        this.f29881a = interfaceC13312e;
        this.f29882b = interfaceC11767l;
        this.f29883c = abstractC13026h;
        this.f29884d = interfaceC12954n.mo6367d(new C13529c(this));
    }

    public /* synthetic */ C13526s0(InterfaceC13312e interfaceC13312e, InterfaceC12954n interfaceC12954n, InterfaceC11767l interfaceC11767l, AbstractC13026h abstractC13026h, kotlin.e0.d.g gVar) {
        this(interfaceC13312e, interfaceC12954n, interfaceC11767l, abstractC13026h);
    }

    /* renamed from: d */
    private final T m4738d() {
        return (T) C12953m.m6372a(this.f29884d, this, f29880f[0]);
    }

    /* renamed from: c */
    public final T m4739c(AbstractC13026h abstractC13026h) {
        kotlin.e0.d.l.f(abstractC13026h, "kotlinTypeRefiner");
        if (abstractC13026h.mo6103c(C12747a.m6858l(this.f29881a))) {
            InterfaceC13125t0 mo4649n = this.f29881a.mo4649n();
            kotlin.e0.d.l.e(mo4649n, "classDescriptor.typeConstructor");
            return !abstractC13026h.mo6102d(mo4649n) ? m4738d() : (T) abstractC13026h.mo6104b(this.f29881a, new C13528b(this, abstractC13026h));
        }
        return m4738d();
    }
}
