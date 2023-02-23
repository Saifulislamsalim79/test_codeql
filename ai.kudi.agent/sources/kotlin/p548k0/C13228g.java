package kotlin.p548k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.g */
/* loaded from: classes3.dex */
public final class C13228g<T> implements InterfaceC13230h<T> {

    /* renamed from: a */
    private final InterfaceC11756a<T> f29389a;

    /* renamed from: b */
    private final InterfaceC11767l<T, T> f29390b;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.g$a */
    /* loaded from: classes3.dex */
    public static final class C13229a implements Iterator<T>, InterfaceC11791a {

        /* renamed from: c */
        private T f29391c;

        /* renamed from: d */
        private int f29392d = -2;

        C13229a() {
        }

        /* renamed from: a */
        private final void m5609a() {
            T t;
            if (this.f29392d == -2) {
                t = (T) C13228g.this.f29389a.invoke();
            } else {
                InterfaceC11767l interfaceC11767l = C13228g.this.f29390b;
                T t2 = this.f29391c;
                l.d(t2);
                t = (T) interfaceC11767l.invoke(t2);
            }
            this.f29391c = t;
            this.f29392d = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29392d < 0) {
                m5609a();
            }
            return this.f29392d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f29392d < 0) {
                m5609a();
            }
            if (this.f29392d != 0) {
                T t = this.f29391c;
                if (t != null) {
                    this.f29392d = -1;
                    return t;
                }
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13228g(InterfaceC11756a<? extends T> interfaceC11756a, InterfaceC11767l<? super T, ? extends T> interfaceC11767l) {
        l.f(interfaceC11756a, "getInitialValue");
        l.f(interfaceC11767l, "getNextValue");
        this.f29389a = interfaceC11756a;
        this.f29390b = interfaceC11767l;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<T> iterator() {
        return new C13229a();
    }
}
