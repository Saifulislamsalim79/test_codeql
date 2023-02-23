package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Field;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.InterfaceC11870h;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty1Impl.kt */
/* renamed from: kotlin.j0.o.c.u */
/* loaded from: classes3.dex */
public class C13190u<T, V> extends AbstractC13198w<V> implements InterfaceC11870h<T, V> {

    /* renamed from: A */
    private final C11916f0.C11918b<C13191a<T, V>> f29324A;

    /* compiled from: KProperty1Impl.kt */
    /* renamed from: kotlin.j0.o.c.u$a */
    /* loaded from: classes3.dex */
    public static final class C13191a<T, V> extends AbstractC13198w.AbstractC13200b<V> implements InterfaceC11870h.InterfaceC11871a<T, V> {

        /* renamed from: w */
        private final C13190u<T, V> f29325w;

        /* JADX WARN: Multi-variable type inference failed */
        public C13191a(C13190u<T, ? extends V> c13190u) {
            l.f(c13190u, "property");
            this.f29325w = c13190u;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public V invoke(T t) {
            return mo5655n().get(t);
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C13190u<T, V> mo5655n() {
            return this.f29325w;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* renamed from: kotlin.j0.o.c.u$b */
    /* loaded from: classes3.dex */
    static final class C13192b extends AbstractC11802m implements InterfaceC11756a<C13191a<T, ? extends V>> {
        C13192b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C13191a<T, V> invoke() {
            return new C13191a<>(C13190u.this);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* renamed from: kotlin.j0.o.c.u$c */
    /* loaded from: classes3.dex */
    static final class C13193c extends AbstractC11802m implements InterfaceC11756a<Field> {
        C13193c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Field invoke() {
            return C13190u.this.m5664m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13190u(AbstractC11952j abstractC11952j, String str, String str2, Object obj) {
        super(abstractC11952j, str, str2, obj);
        l.f(abstractC11952j, "container");
        l.f(str, "name");
        l.f(str2, "signature");
        C11916f0.C11918b<C13191a<T, V>> m10166b = C11916f0.m10166b(new C13192b());
        l.e(m10166b, "ReflectProperties.lazy { Getter(this) }");
        this.f29324A = m10166b;
        C13218k.m5626a(EnumC13285m.PUBLICATION, new C13193c());
    }

    @Override // kotlin.p493j0.InterfaceC11870h
    public V get(T t) {
        return mo5660r().mo10180a(t);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public V invoke(T t) {
        return get(t);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w
    /* renamed from: u */
    public C13191a<T, V> mo5660r() {
        C13191a<T, V> invoke = this.f29324A.invoke();
        l.e(invoke, "_getter()");
        return invoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13190u(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C13191a<T, V>> m10166b = C11916f0.m10166b(new C13192b());
        l.e(m10166b, "ReflectProperties.lazy { Getter(this) }");
        this.f29324A = m10166b;
        C13218k.m5626a(EnumC13285m.PUBLICATION, new C13193c());
    }
}
