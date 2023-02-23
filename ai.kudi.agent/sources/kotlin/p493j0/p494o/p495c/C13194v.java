package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Field;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty2Impl.kt */
/* renamed from: kotlin.j0.o.c.v */
/* loaded from: classes3.dex */
public class C13194v<D, E, V> extends AbstractC13198w<V> implements Object<D, E, V>, InterfaceC11771p {

    /* renamed from: A */
    private final C11916f0.C11918b<C13195a<D, E, V>> f29328A;

    /* compiled from: KProperty2Impl.kt */
    /* renamed from: kotlin.j0.o.c.v$a */
    /* loaded from: classes3.dex */
    public static final class C13195a<D, E, V> extends AbstractC13198w.AbstractC13200b<V> implements Object<D, E, V>, InterfaceC11771p {

        /* renamed from: w */
        private final C13194v<D, E, V> f29329w;

        /* JADX WARN: Multi-variable type inference failed */
        public C13195a(C13194v<D, E, ? extends V> c13194v) {
            l.f(c13194v, "property");
            this.f29329w = c13194v;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public V invoke(D d, E e) {
            return mo5655n().m5669u(d, e);
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C13194v<D, E, V> mo5655n() {
            return this.f29329w;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    /* renamed from: kotlin.j0.o.c.v$b */
    /* loaded from: classes3.dex */
    static final class C13196b extends AbstractC11802m implements InterfaceC11756a<C13195a<D, E, ? extends V>> {
        C13196b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C13195a<D, E, V> invoke() {
            return new C13195a<>(C13194v.this);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    /* renamed from: kotlin.j0.o.c.v$c */
    /* loaded from: classes3.dex */
    static final class C13197c extends AbstractC11802m implements InterfaceC11756a<Field> {
        C13197c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Field invoke() {
            return C13194v.this.m5664m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13194v(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C13195a<D, E, V>> m10166b = C11916f0.m10166b(new C13196b());
        l.e(m10166b, "ReflectProperties.lazy { Getter(this) }");
        this.f29328A = m10166b;
        C13218k.m5626a(EnumC13285m.PUBLICATION, new C13197c());
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public V invoke(D d, E e) {
        return m5669u(d, e);
    }

    /* renamed from: u */
    public V m5669u(D d, E e) {
        return mo5660r().mo10180a(d, e);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w
    /* renamed from: v */
    public C13195a<D, E, V> mo5660r() {
        C13195a<D, E, V> invoke = this.f29328A.invoke();
        l.e(invoke, "_getter()");
        return invoke;
    }
}
