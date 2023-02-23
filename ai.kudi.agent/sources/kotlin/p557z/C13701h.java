package kotlin.p557z;

import java.util.Collection;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11781b;
import kotlin.p483e0.p485d.C11797f;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* renamed from: kotlin.z.h */
/* loaded from: classes3.dex */
public final class C13701h<T> implements Collection<T>, InterfaceC11791a {

    /* renamed from: c */
    private final T[] f30157c;

    /* renamed from: d */
    private final boolean f30158d;

    public C13701h(T[] tArr, boolean z) {
        l.f(tArr, "values");
        this.f30157c = tArr;
        this.f30158d = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean m4006s;
        m4006s = C13715n.m4006s(this.f30157c, obj);
        return m4006s;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public int m4134e() {
        return this.f30157c.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f30157c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C11781b.m10351a(this.f30157c);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m4134e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C13724q.m3902a(this.f30157c, this.f30158d);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C11797f.m10323b(this, tArr);
    }
}
