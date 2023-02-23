package kotlin.p548k0;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.b */
/* loaded from: classes3.dex */
public final class C13220b<T> implements InterfaceC13230h<T>, InterfaceC13222c<T> {

    /* renamed from: a */
    private final InterfaceC13230h<T> f29371a;

    /* renamed from: b */
    private final int f29372b;

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.b$a */
    /* loaded from: classes3.dex */
    public static final class C13221a implements Iterator<T>, InterfaceC11791a {

        /* renamed from: c */
        private final Iterator<T> f29373c;

        /* renamed from: d */
        private int f29374d;

        C13221a(C13220b c13220b) {
            this.f29373c = c13220b.f29371a.iterator();
            this.f29374d = c13220b.f29372b;
        }

        /* renamed from: a */
        private final void m5622a() {
            while (this.f29374d > 0 && this.f29373c.hasNext()) {
                this.f29373c.next();
                this.f29374d--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m5622a();
            return this.f29373c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m5622a();
            return this.f29373c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13220b(InterfaceC13230h<? extends T> interfaceC13230h, int i) {
        l.f(interfaceC13230h, "sequence");
        this.f29371a = interfaceC13230h;
        this.f29372b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + this.f29372b + '.').toString());
    }

    @Override // kotlin.p548k0.InterfaceC13222c
    /* renamed from: a */
    public InterfaceC13230h<T> mo5621a(int i) {
        int i2 = this.f29372b + i;
        return i2 < 0 ? new C13220b(this, i) : new C13220b(this.f29371a, i2);
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<T> iterator() {
        return new C13221a(this);
    }
}
