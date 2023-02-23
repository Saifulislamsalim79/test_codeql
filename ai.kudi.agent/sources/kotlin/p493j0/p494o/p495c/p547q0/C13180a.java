package kotlin.p493j0.p494o.p495c.p547q0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ConsPStack.java */
/* renamed from: kotlin.j0.o.c.q0.a */
/* loaded from: classes3.dex */
final class C13180a<E> implements Iterable<E> {

    /* renamed from: f */
    private static final C13180a<Object> f29302f = new C13180a<>();

    /* renamed from: c */
    final E f29303c;

    /* renamed from: d */
    final C13180a<E> f29304d;

    /* renamed from: e */
    private final int f29305e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConsPStack.java */
    /* renamed from: kotlin.j0.o.c.q0.a$a */
    /* loaded from: classes3.dex */
    public static class C13181a<E> implements Iterator<E> {

        /* renamed from: c */
        private C13180a<E> f29306c;

        public C13181a(C13180a<E> c13180a) {
            this.f29306c = c13180a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((C13180a) this.f29306c).f29305e > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            C13180a<E> c13180a = this.f29306c;
            E e = c13180a.f29303c;
            this.f29306c = c13180a.f29304d;
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private C13180a() {
        this.f29305e = 0;
        this.f29303c = null;
        this.f29304d = null;
    }

    /* renamed from: e */
    public static <E> C13180a<E> m5699e() {
        return (C13180a<E>) f29302f;
    }

    /* renamed from: f */
    private Iterator<E> m5698f(int i) {
        return new C13181a(m5694m(i));
    }

    /* renamed from: k */
    private C13180a<E> m5696k(Object obj) {
        if (this.f29305e == 0) {
            return this;
        }
        if (this.f29303c.equals(obj)) {
            return this.f29304d;
        }
        C13180a<E> m5696k = this.f29304d.m5696k(obj);
        return m5696k == this.f29304d ? this : new C13180a<>(this.f29303c, m5696k);
    }

    /* renamed from: m */
    private C13180a<E> m5694m(int i) {
        if (i < 0 || i > this.f29305e) {
            throw new IndexOutOfBoundsException();
        }
        return i == 0 ? this : this.f29304d.m5694m(i - 1);
    }

    public E get(int i) {
        if (i >= 0 && i <= this.f29305e) {
            try {
                return m5698f(i).next();
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException("Index: " + i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: h */
    public C13180a<E> m5697h(int i) {
        return m5696k(get(i));
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return m5698f(0);
    }

    /* renamed from: l */
    public C13180a<E> m5695l(E e) {
        return new C13180a<>(e, this);
    }

    public int size() {
        return this.f29305e;
    }

    private C13180a(E e, C13180a<E> c13180a) {
        this.f29303c = e;
        this.f29304d = c13180a;
        this.f29305e = c13180a.f29305e + 1;
    }
}
