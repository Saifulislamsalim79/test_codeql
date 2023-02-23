package kotlin.p493j0.p494o.p495c;

import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.InterfaceC11867f;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty1Impl.kt */
/* renamed from: kotlin.j0.o.c.n */
/* loaded from: classes3.dex */
public final class C11973n<T, V> extends C13190u<T, V> implements InterfaceC11867f<T, V> {

    /* renamed from: B */
    private final C11916f0.C11918b<C11974a<T, V>> f26678B;

    /* compiled from: KProperty1Impl.kt */
    /* renamed from: kotlin.j0.o.c.n$a */
    /* loaded from: classes3.dex */
    public static final class C11974a<T, V> extends AbstractC13198w.AbstractC13203c<V> implements Object<T, V>, InterfaceC11771p {

        /* renamed from: w */
        private final C11973n<T, V> f26679w;

        public C11974a(C11973n<T, V> c11973n) {
            l.f(c11973n, "property");
            this.f26679w = c11973n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m10024r(obj, obj2);
            return C13666w.f30112a;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C11973n<T, V> mo5655n() {
            return this.f26679w;
        }

        /* renamed from: r */
        public void m10024r(T t, V v) {
            mo5655n().m10026w(t, v);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* renamed from: kotlin.j0.o.c.n$b */
    /* loaded from: classes3.dex */
    static final class C11975b extends AbstractC11802m implements InterfaceC11756a<C11974a<T, V>> {
        C11975b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C11974a<T, V> invoke() {
            return new C11974a<>(C11973n.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11973n(AbstractC11952j abstractC11952j, String str, String str2, Object obj) {
        super(abstractC11952j, str, str2, obj);
        l.f(abstractC11952j, "container");
        l.f(str, "name");
        l.f(str2, "signature");
        C11916f0.C11918b<C11974a<T, V>> m10166b = C11916f0.m10166b(new C11975b());
        l.e(m10166b, "ReflectProperties.lazy { Setter(this) }");
        this.f26678B = m10166b;
    }

    /* renamed from: v */
    public C11974a<T, V> m10027v() {
        C11974a<T, V> invoke = this.f26678B.invoke();
        l.e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: w */
    public void m10026w(T t, V v) {
        m10027v().mo10180a(t, v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11973n(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C11974a<T, V>> m10166b = C11916f0.m10166b(new C11975b());
        l.e(m10166b, "ReflectProperties.lazy { Setter(this) }");
        this.f26678B = m10166b;
    }
}
