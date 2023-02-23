package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: LazyJVM.kt */
/* renamed from: kotlin.r */
/* loaded from: classes3.dex */
final class C13292r<T> implements InterfaceC11824h<T>, Serializable {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater<C13292r<?>, Object> f29446e = AtomicReferenceFieldUpdater.newUpdater(C13292r.class, Object.class, "d");

    /* renamed from: c */
    private volatile InterfaceC11756a<? extends T> f29447c;

    /* renamed from: d */
    private volatile Object f29448d;

    public C13292r(InterfaceC11756a<? extends T> interfaceC11756a) {
        kotlin.e0.d.l.f(interfaceC11756a, "initializer");
        this.f29447c = interfaceC11756a;
        this.f29448d = C13665v.f30111a;
        C13665v c13665v = C13665v.f30111a;
    }

    /* renamed from: a */
    public boolean m5356a() {
        return this.f29448d != C13665v.f30111a;
    }

    @Override // kotlin.InterfaceC11824h
    public T getValue() {
        T t = (T) this.f29448d;
        if (t != C13665v.f30111a) {
            return t;
        }
        InterfaceC11756a<? extends T> interfaceC11756a = this.f29447c;
        if (interfaceC11756a != null) {
            T invoke = interfaceC11756a.invoke();
            if (f29446e.compareAndSet(this, C13665v.f30111a, invoke)) {
                this.f29447c = null;
                return invoke;
            }
        }
        return (T) this.f29448d;
    }

    public String toString() {
        return m5356a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
