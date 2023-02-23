package kotlin.p548k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.f */
/* loaded from: classes3.dex */
public final class C13226f<T, R, E> implements InterfaceC13230h<E> {

    /* renamed from: a */
    private final InterfaceC13230h<T> f29383a;

    /* renamed from: b */
    private final InterfaceC11767l<T, R> f29384b;

    /* renamed from: c */
    private final InterfaceC11767l<R, Iterator<E>> f29385c;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.f$a */
    /* loaded from: classes3.dex */
    public static final class C13227a implements Iterator<E>, InterfaceC11791a {

        /* renamed from: c */
        private final Iterator<T> f29386c;

        /* renamed from: d */
        private Iterator<? extends E> f29387d;

        C13227a() {
            this.f29386c = C13226f.this.f29383a.iterator();
        }

        /* renamed from: a */
        private final boolean m5612a() {
            Iterator<? extends E> it = this.f29387d;
            if (it != null && !it.hasNext()) {
                this.f29387d = null;
            }
            while (true) {
                if (this.f29387d == null) {
                    if (!this.f29386c.hasNext()) {
                        return false;
                    }
                    Iterator<? extends E> it2 = (Iterator) C13226f.this.f29385c.invoke(C13226f.this.f29384b.invoke(this.f29386c.next()));
                    if (it2.hasNext()) {
                        this.f29387d = it2;
                        break;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return m5612a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (m5612a()) {
                Iterator<? extends E> it = this.f29387d;
                l.d(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13226f(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends R> interfaceC11767l, InterfaceC11767l<? super R, ? extends Iterator<? extends E>> interfaceC11767l2) {
        l.f(interfaceC13230h, "sequence");
        l.f(interfaceC11767l, "transformer");
        l.f(interfaceC11767l2, "iterator");
        this.f29383a = interfaceC13230h;
        this.f29384b = interfaceC11767l;
        this.f29385c = interfaceC11767l2;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<E> iterator() {
        return new C13227a();
    }
}
