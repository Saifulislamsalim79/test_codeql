package kotlin.p557z;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: AbstractList.kt */
/* renamed from: kotlin.z.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13689d<E> extends AbstractC13669a<E> implements List<E>, InterfaceC11791a {

    /* renamed from: c */
    public static final C13690a f30149c = new C13690a(null);

    /* compiled from: AbstractList.kt */
    /* renamed from: kotlin.z.d$a */
    /* loaded from: classes3.dex */
    public static final class C13690a {
        private C13690a() {
        }

        /* renamed from: a */
        public final void m4149a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void m4148b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void m4147c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: d */
        public final boolean m4146d(Collection<?> collection, Collection<?> collection2) {
            l.f(collection, "c");
            l.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!l.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m4145e(Collection<?> collection) {
            l.f(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public /* synthetic */ C13690a(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    /* renamed from: kotlin.z.d$b */
    /* loaded from: classes3.dex */
    public class C13691b implements Iterator<E>, InterfaceC11791a {

        /* renamed from: c */
        private int f30150c;

        public C13691b() {
        }

        /* renamed from: a */
        protected final int m4144a() {
            return this.f30150c;
        }

        /* renamed from: b */
        protected final void m4143b(int i) {
            this.f30150c = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30150c < AbstractC13689d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractC13689d abstractC13689d = AbstractC13689d.this;
                int i = this.f30150c;
                this.f30150c = i + 1;
                return (E) abstractC13689d.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: kotlin.z.d$c */
    /* loaded from: classes3.dex */
    private class C13692c extends AbstractC13689d<E>.C13691b implements ListIterator<E>, InterfaceC11791a {
        public C13692c(int i) {
            super();
            AbstractC13689d.f30149c.m4148b(i, AbstractC13689d.this.size());
            m4143b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m4144a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m4144a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractC13689d abstractC13689d = AbstractC13689d.this;
                m4143b(m4144a() - 1);
                return (E) abstractC13689d.get(m4144a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m4144a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: kotlin.z.d$d */
    /* loaded from: classes3.dex */
    private static final class C13693d<E> extends AbstractC13689d<E> implements RandomAccess {

        /* renamed from: d */
        private int f30153d;

        /* renamed from: e */
        private final AbstractC13689d<E> f30154e;

        /* renamed from: f */
        private final int f30155f;

        /* JADX WARN: Multi-variable type inference failed */
        public C13693d(AbstractC13689d<? extends E> abstractC13689d, int i, int i2) {
            l.f(abstractC13689d, AttributeType.LIST);
            this.f30154e = abstractC13689d;
            this.f30155f = i;
            AbstractC13689d.f30149c.m4147c(i, i2, abstractC13689d.size());
            this.f30153d = i2 - this.f30155f;
        }

        @Override // kotlin.p557z.AbstractC13669a
        /* renamed from: e */
        public int mo4055e() {
            return this.f30153d;
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        public E get(int i) {
            AbstractC13689d.f30149c.m4149a(i, this.f30153d);
            return this.f30154e.get(this.f30155f + i);
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f30149c.m4146d(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f30149c.m4145e(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (l.b(e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C13691b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C13692c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new C13693d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C13692c(i);
    }
}
