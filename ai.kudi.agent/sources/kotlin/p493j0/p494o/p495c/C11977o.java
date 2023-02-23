package kotlin.p493j0.p494o.p495c;

import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty2Impl.kt */
/* renamed from: kotlin.j0.o.c.o */
/* loaded from: classes3.dex */
public final class C11977o<D, E, V> extends C13194v<D, E, V> implements Object<D, E, V>, InterfaceC11771p {

    /* renamed from: B */
    private final C11916f0.C11918b<C11978a<D, E, V>> f26683B;

    /* compiled from: KProperty2Impl.kt */
    /* renamed from: kotlin.j0.o.c.o$a */
    /* loaded from: classes3.dex */
    public static final class C11978a<D, E, V> extends AbstractC13198w.AbstractC13203c<V> implements Object<D, E, V>, InterfaceC11772q {

        /* renamed from: w */
        private final C11977o<D, E, V> f26684w;

        public C11978a(C11977o<D, E, V> c11977o) {
            l.f(c11977o, "property");
            this.f26684w = c11977o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m10018r(obj, obj2, obj3);
            return C13666w.f30112a;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C11977o<D, E, V> mo5655n() {
            return this.f26684w;
        }

        /* renamed from: r */
        public void m10018r(D d, E e, V v) {
            mo5655n().m10020x(d, e, v);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    /* renamed from: kotlin.j0.o.c.o$b */
    /* loaded from: classes3.dex */
    static final class C11979b extends AbstractC11802m implements InterfaceC11756a<C11978a<D, E, V>> {
        C11979b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C11978a<D, E, V> invoke() {
            return new C11978a<>(C11977o.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11977o(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C11978a<D, E, V>> m10166b = C11916f0.m10166b(new C11979b());
        l.e(m10166b, "ReflectProperties.lazy { Setter(this) }");
        this.f26683B = m10166b;
    }

    /* renamed from: w */
    public C11978a<D, E, V> m10021w() {
        C11978a<D, E, V> invoke = this.f26683B.invoke();
        l.e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: x */
    public void m10020x(D d, E e, V v) {
        m10021w().mo10180a(d, e, v);
    }
}
