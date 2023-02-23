package kotlinx.coroutines.p561s2;

import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
/* compiled from: ReactiveFlow.kt */
/* renamed from: kotlinx.coroutines.s2.b */
/* loaded from: classes3.dex */
final class C14042b<T> implements InterfaceC14455a<T> {

    /* renamed from: c */
    private final InterfaceC13964d<T> f30620c;

    /* renamed from: d */
    private final InterfaceC11719g f30621d;

    /* JADX WARN: Multi-variable type inference failed */
    public C14042b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11719g interfaceC11719g) {
        this.f30620c = interfaceC13964d;
        this.f30621d = interfaceC11719g;
    }

    @Override // p577n.p586b.InterfaceC14455a
    /* renamed from: a */
    public void mo1691a(InterfaceC14456b<? super T> interfaceC14456b) {
        if (interfaceC14456b != null) {
            interfaceC14456b.mo1687g(new C14043c(this.f30620c, interfaceC14456b, this.f30621d));
            return;
        }
        throw null;
    }
}
