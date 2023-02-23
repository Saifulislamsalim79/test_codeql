package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: SafeCollector.kt */
/* renamed from: kotlinx.coroutines.flow.internal.i */
/* loaded from: classes3.dex */
public final class C13832i implements InterfaceC11719g.InterfaceC11722b {

    /* renamed from: e */
    public static final C13833a f30305e = new C13833a(null);

    /* renamed from: c */
    public final Throwable f30306c;

    /* renamed from: d */
    private final InterfaceC11719g.InterfaceC11724c<?> f30307d = f30305e;

    /* compiled from: SafeCollector.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.i$a */
    /* loaded from: classes3.dex */
    public static final class C13833a implements InterfaceC11719g.InterfaceC11724c<C13832i> {
        private C13833a() {
        }

        public /* synthetic */ C13833a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    public C13832i(Throwable th) {
        this.f30306c = th;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
        return (R) InterfaceC11719g.InterfaceC11722b.C11723a.m10399a(this, r, interfaceC11771p);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b, kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        return (E) InterfaceC11719g.InterfaceC11722b.C11723a.m10398b(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b
    public InterfaceC11719g.InterfaceC11724c<?> getKey() {
        return this.f30307d;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        return InterfaceC11719g.InterfaceC11722b.C11723a.m10397c(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        return InterfaceC11719g.InterfaceC11722b.C11723a.m10396d(this, interfaceC11719g);
    }
}
