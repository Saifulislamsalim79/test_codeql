package kotlin.p548k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.o */
/* loaded from: classes3.dex */
public final class C13246o<T> implements InterfaceC13230h<T> {

    /* renamed from: a */
    private final InterfaceC13230h<T> f29403a;

    /* renamed from: b */
    private final InterfaceC11767l<T, Boolean> f29404b;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.o$a */
    /* loaded from: classes3.dex */
    public static final class C13247a implements Iterator<T>, InterfaceC11791a {

        /* renamed from: c */
        private final Iterator<T> f29405c;

        /* renamed from: d */
        private int f29406d = -1;

        /* renamed from: e */
        private T f29407e;

        C13247a() {
            this.f29405c = C13246o.this.f29403a.iterator();
        }

        /* renamed from: a */
        private final void m5557a() {
            if (this.f29405c.hasNext()) {
                T next = this.f29405c.next();
                if (((Boolean) C13246o.this.f29404b.invoke(next)).booleanValue()) {
                    this.f29406d = 1;
                    this.f29407e = next;
                    return;
                }
            }
            this.f29406d = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29406d == -1) {
                m5557a();
            }
            return this.f29406d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f29406d == -1) {
                m5557a();
            }
            if (this.f29406d != 0) {
                T t = this.f29407e;
                this.f29407e = null;
                this.f29406d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13246o(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(interfaceC13230h, "sequence");
        l.f(interfaceC11767l, "predicate");
        this.f29403a = interfaceC13230h;
        this.f29404b = interfaceC11767l;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<T> iterator() {
        return new C13247a();
    }
}
