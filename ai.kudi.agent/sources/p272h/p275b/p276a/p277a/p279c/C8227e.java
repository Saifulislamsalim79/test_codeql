package p272h.p275b.p276a.p277a.p279c;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p488g0.InterfaceC11823c;
import kotlin.p493j0.InterfaceC11872i;
/* compiled from: Delegates.kt */
/* renamed from: h.b.a.a.c.e */
/* loaded from: classes2.dex */
final class C8227e<T> implements InterfaceC11823c<Object, T> {

    /* renamed from: a */
    private Object f19796a;

    /* renamed from: b */
    private final InterfaceC11756a<T> f19797b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8227e(InterfaceC11756a<? extends T> interfaceC11756a) {
        l.g(interfaceC11756a, "initializer");
        this.f19797b = interfaceC11756a;
    }

    @Override // kotlin.p488g0.InterfaceC11823c
    /* renamed from: a */
    public void mo10299a(Object obj, InterfaceC11872i<?> interfaceC11872i, T t) {
        l.g(interfaceC11872i, "property");
        this.f19796a = t;
    }

    @Override // kotlin.p488g0.InterfaceC11823c
    /* renamed from: b */
    public T mo10298b(Object obj, InterfaceC11872i<?> interfaceC11872i) {
        l.g(interfaceC11872i, "property");
        if (this.f19796a == null) {
            T invoke = this.f19797b.invoke();
            if (invoke == null) {
                throw new IllegalStateException("Initializer block of property " + interfaceC11872i.mo4699b() + " return null");
            }
            this.f19796a = invoke;
        }
        return (T) this.f19796a;
    }
}
