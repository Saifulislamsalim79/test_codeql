package kotlin.p557z;

import java.util.Collection;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11797f;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: AbstractCollection.kt */
/* renamed from: kotlin.z.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13669a<E> implements Collection<E>, InterfaceC11791a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: kotlin.z.a$a */
    /* loaded from: classes3.dex */
    static final class C13670a extends AbstractC11802m implements InterfaceC11767l<E, CharSequence> {
        C13670a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(E e) {
            return e == AbstractC13669a.this ? "(this Collection)" : String.valueOf(e);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (E e : this) {
            if (l.b(e, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract int mo4055e();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
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
        return mo4055e();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C11797f.m10324a(this);
    }

    public String toString() {
        String m3797a0;
        m3797a0 = C13742z.m3797a0(this, ", ", "[", "]", 0, null, new C13670a(), 24, null);
        return m3797a0;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        l.f(tArr, "array");
        T[] tArr2 = (T[]) C11797f.m10323b(this, tArr);
        if (tArr2 != null) {
            return tArr2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
