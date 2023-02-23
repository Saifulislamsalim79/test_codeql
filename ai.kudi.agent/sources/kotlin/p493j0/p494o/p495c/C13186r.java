package kotlin.p493j0.p494o.p495c;

import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KProperty0Impl.kt */
/* renamed from: kotlin.j0.o.c.r */
/* loaded from: classes3.dex */
public class C13186r<V> extends AbstractC13198w<V> implements Object<V>, InterfaceC11756a {

    /* renamed from: A */
    private final C11916f0.C11918b<C13187a<V>> f29320A;

    /* compiled from: KProperty0Impl.kt */
    /* renamed from: kotlin.j0.o.c.r$a */
    /* loaded from: classes3.dex */
    public static final class C13187a<R> extends AbstractC13198w.AbstractC13200b<R> implements Object<R>, InterfaceC11756a {

        /* renamed from: w */
        private final C13186r<R> f29321w;

        /* JADX WARN: Multi-variable type inference failed */
        public C13187a(C13186r<? extends R> c13186r) {
            l.f(c13186r, "property");
            this.f29321w = c13186r;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public R invoke() {
            return mo5655n().m5678u();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: p */
        public C13186r<R> mo5655n() {
            return this.f29321w;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13186r(AbstractC11952j abstractC11952j, InterfaceC13518o0 interfaceC13518o0) {
        super(abstractC11952j, interfaceC13518o0);
        l.f(abstractC11952j, "container");
        l.f(interfaceC13518o0, "descriptor");
        C11916f0.C11918b<C13187a<V>> m10166b = C11916f0.m10166b(new C13188s(this));
        l.e(m10166b, "ReflectProperties.lazy { Getter(this) }");
        this.f29320A = m10166b;
        C13218k.m5626a(EnumC13285m.PUBLICATION, new C13189t(this));
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public V invoke() {
        return m5678u();
    }

    /* renamed from: u */
    public V m5678u() {
        return mo5660r().mo10180a(new Object[0]);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w
    /* renamed from: v */
    public C13187a<V> mo5660r() {
        C13187a<V> invoke = this.f29320A.invoke();
        l.e(invoke, "_getter()");
        return invoke;
    }
}
