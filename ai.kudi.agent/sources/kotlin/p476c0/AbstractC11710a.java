package kotlin.p476c0;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: CoroutineContextImpl.kt */
/* renamed from: kotlin.c0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11710a implements InterfaceC11719g.InterfaceC11722b {
    private final InterfaceC11719g.InterfaceC11724c<?> key;

    public AbstractC11710a(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        this.key = interfaceC11724c;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
        l.f(interfaceC11771p, "operation");
        return (R) InterfaceC11719g.InterfaceC11722b.C11723a.m10399a(this, r, interfaceC11771p);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b, kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        return (E) InterfaceC11719g.InterfaceC11722b.C11723a.m10398b(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b
    public InterfaceC11719g.InterfaceC11724c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        return InterfaceC11719g.InterfaceC11722b.C11723a.m10397c(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        l.f(interfaceC11719g, "context");
        return InterfaceC11719g.InterfaceC11722b.C11723a.m10396d(this, interfaceC11719g);
    }
}
