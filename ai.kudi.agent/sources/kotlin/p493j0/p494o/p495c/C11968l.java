package kotlin.p493j0.p494o.p495c;

import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty0Impl.kt */
/* renamed from: kotlin.j0.o.c.l */
/* loaded from: classes3.dex */
public final class C11968l<V> extends C13186r<V> implements Object<V>, InterfaceC11756a {

    /* renamed from: B */
    private final C11916f0.C11918b<C11969a<V>> f26674B;

    /* compiled from: KProperty0Impl.kt */
    /* renamed from: kotlin.j0.o.c.l$a */
    /* loaded from: classes3.dex */
    public static final class C11969a<R> extends AbstractC13198w.AbstractC13203c<R> implements Object<R>, InterfaceC11767l {

        /* renamed from: w */
        private final C11968l<R> f26675w;

        public C11969a(C11968l<R> c11968l) {
            l.f(c11968l, "property");
            this.f26675w = c11968l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10044r(obj);
            return C13666w.f30112a;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C11968l<R> mo5655n() {
            return this.f26675w;
        }

        /* renamed from: r */
        public void m10044r(R r) {
            mo5655n().m10046x(r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11968l(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C11969a<V>> m10166b = C11916f0.m10166b(new C11971m(this));
        l.e(m10166b, "ReflectProperties.lazy { Setter(this) }");
        this.f26674B = m10166b;
    }

    /* renamed from: w */
    public C11969a<V> m10047w() {
        C11969a<V> invoke = this.f26674B.invoke();
        l.e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: x */
    public void m10046x(V v) {
        m10047w().mo10180a(v);
    }
}
