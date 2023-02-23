package kotlin.p548k0;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.p */
/* loaded from: classes3.dex */
public final class C13248p<T, R> implements InterfaceC13230h<R> {

    /* renamed from: a */
    private final InterfaceC13230h<T> f29409a;

    /* renamed from: b */
    private final InterfaceC11767l<T, R> f29410b;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.p$a */
    /* loaded from: classes3.dex */
    public static final class C13249a implements Iterator<R>, InterfaceC11791a {

        /* renamed from: c */
        private final Iterator<T> f29411c;

        C13249a() {
            this.f29411c = C13248p.this.f29409a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29411c.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) C13248p.this.f29410b.invoke(this.f29411c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13248p(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends R> interfaceC11767l) {
        l.f(interfaceC13230h, "sequence");
        l.f(interfaceC11767l, "transformer");
        this.f29409a = interfaceC13230h;
        this.f29410b = interfaceC11767l;
    }

    /* renamed from: d */
    public final <E> InterfaceC13230h<E> m5554d(InterfaceC11767l<? super R, ? extends Iterator<? extends E>> interfaceC11767l) {
        l.f(interfaceC11767l, "iterator");
        return new C13226f(this.f29409a, this.f29410b, interfaceC11767l);
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<R> iterator() {
        return new C13249a();
    }
}
