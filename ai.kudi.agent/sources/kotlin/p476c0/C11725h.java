package kotlin.p476c0;

import java.io.Serializable;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: CoroutineContextImpl.kt */
/* renamed from: kotlin.c0.h */
/* loaded from: classes3.dex */
public final class C11725h implements InterfaceC11719g, Serializable {

    /* renamed from: c */
    public static final C11725h f26446c = new C11725h();

    private C11725h() {
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
        l.f(interfaceC11771p, "operation");
        return r;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        return this;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        l.f(interfaceC11719g, "context");
        return interfaceC11719g;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
