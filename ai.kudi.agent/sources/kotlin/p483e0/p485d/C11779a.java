package kotlin.p483e0.p485d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: ArrayIterator.kt */
/* renamed from: kotlin.e0.d.a */
/* loaded from: classes3.dex */
final class C11779a<T> implements Iterator<T>, InterfaceC11791a {

    /* renamed from: c */
    private int f26473c;

    /* renamed from: d */
    private final T[] f26474d;

    public C11779a(T[] tArr) {
        l.f(tArr, "array");
        this.f26474d = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26473c < this.f26474d.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f26474d;
            int i = this.f26473c;
            this.f26473c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f26473c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
