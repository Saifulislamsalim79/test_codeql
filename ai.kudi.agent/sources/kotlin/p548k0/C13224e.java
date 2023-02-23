package kotlin.p548k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.e */
/* loaded from: classes3.dex */
public final class C13224e<T> implements InterfaceC13230h<T> {

    /* renamed from: a */
    private final InterfaceC13230h<T> f29376a;

    /* renamed from: b */
    private final boolean f29377b;

    /* renamed from: c */
    private final InterfaceC11767l<T, Boolean> f29378c;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.e$a */
    /* loaded from: classes3.dex */
    public static final class C13225a implements Iterator<T>, InterfaceC11791a {

        /* renamed from: c */
        private final Iterator<T> f29379c;

        /* renamed from: d */
        private int f29380d = -1;

        /* renamed from: e */
        private T f29381e;

        C13225a() {
            this.f29379c = C13224e.this.f29376a.iterator();
        }

        /* renamed from: a */
        private final void m5616a() {
            while (this.f29379c.hasNext()) {
                T next = this.f29379c.next();
                if (((Boolean) C13224e.this.f29378c.invoke(next)).booleanValue() == C13224e.this.f29377b) {
                    this.f29381e = next;
                    this.f29380d = 1;
                    return;
                }
            }
            this.f29380d = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29380d == -1) {
                m5616a();
            }
            return this.f29380d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f29380d == -1) {
                m5616a();
            }
            if (this.f29380d != 0) {
                T t = this.f29381e;
                this.f29381e = null;
                this.f29380d = -1;
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
    public C13224e(InterfaceC13230h<? extends T> interfaceC13230h, boolean z, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(interfaceC13230h, "sequence");
        l.f(interfaceC11767l, "predicate");
        this.f29376a = interfaceC13230h;
        this.f29377b = z;
        this.f29378c = interfaceC11767l;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<T> iterator() {
        return new C13225a();
    }
}
