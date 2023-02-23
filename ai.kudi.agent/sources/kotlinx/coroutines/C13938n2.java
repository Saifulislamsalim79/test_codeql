package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineContext.kt */
/* renamed from: kotlinx.coroutines.n2 */
/* loaded from: classes3.dex */
public final class C13938n2 implements InterfaceC11719g.InterfaceC11722b, InterfaceC11719g.InterfaceC11724c<C13938n2> {

    /* renamed from: c */
    public static final C13938n2 f30424c = new C13938n2();

    private C13938n2() {
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
        return this;
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
