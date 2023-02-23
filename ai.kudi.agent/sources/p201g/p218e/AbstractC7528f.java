package p201g.p218e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapCollections.java */
/* renamed from: g.e.f */
/* loaded from: classes2.dex */
public abstract class AbstractC7528f<K, V> {

    /* renamed from: a */
    AbstractC7528f<K, V>.C7530b f17888a;

    /* renamed from: b */
    AbstractC7528f<K, V>.C7531c f17889b;

    /* renamed from: c */
    AbstractC7528f<K, V>.C7533e f17890c;

    /* compiled from: MapCollections.java */
    /* renamed from: g.e.f$a */
    /* loaded from: classes2.dex */
    final class C7529a<T> implements Iterator<T> {

        /* renamed from: c */
        final int f17891c;

        /* renamed from: d */
        int f17892d;

        /* renamed from: e */
        int f17893e;

        /* renamed from: f */
        boolean f17894f = false;

        C7529a(int i) {
            this.f17891c = i;
            this.f17892d = AbstractC7528f.this.mo18477d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17893e < this.f17892d;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC7528f.this.mo18479b(this.f17893e, this.f17891c);
                this.f17893e++;
                this.f17894f = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f17894f) {
                int i = this.f17893e - 1;
                this.f17893e = i;
                this.f17892d--;
                this.f17894f = false;
                AbstractC7528f.this.mo18473h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: g.e.f$b */
    /* loaded from: classes2.dex */
    final class C7530b implements Set<Map.Entry<K, V>> {
        C7530b() {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m18462d((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo18477d = AbstractC7528f.this.mo18477d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC7528f.this.mo18474g(entry.getKey(), entry.getValue());
            }
            return mo18477d != AbstractC7528f.this.mo18477d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC7528f.this.mo18480a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo18476e = AbstractC7528f.this.mo18476e(entry.getKey());
                if (mo18476e < 0) {
                    return false;
                }
                return C7525c.m18508c(AbstractC7528f.this.mo18479b(mo18476e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean m18462d(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC7528f.m18470k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo18477d = AbstractC7528f.this.mo18477d() - 1; mo18477d >= 0; mo18477d--) {
                Object mo18479b = AbstractC7528f.this.mo18479b(mo18477d, 0);
                Object mo18479b2 = AbstractC7528f.this.mo18479b(mo18477d, 1);
                i += (mo18479b == null ? 0 : mo18479b.hashCode()) ^ (mo18479b2 == null ? 0 : mo18479b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC7528f.this.mo18477d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7532d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC7528f.this.mo18477d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: g.e.f$c */
    /* loaded from: classes2.dex */
    final class C7531c implements Set<K> {
        C7531c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC7528f.this.mo18480a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC7528f.this.mo18476e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC7528f.m18471j(AbstractC7528f.this.mo18478c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC7528f.m18470k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo18477d = AbstractC7528f.this.mo18477d() - 1; mo18477d >= 0; mo18477d--) {
                Object mo18479b = AbstractC7528f.this.mo18479b(mo18477d, 0);
                i += mo18479b == null ? 0 : mo18479b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC7528f.this.mo18477d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C7529a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo18476e = AbstractC7528f.this.mo18476e(obj);
            if (mo18476e >= 0) {
                AbstractC7528f.this.mo18473h(mo18476e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC7528f.m18466o(AbstractC7528f.this.mo18478c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC7528f.m18465p(AbstractC7528f.this.mo18478c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC7528f.this.mo18477d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC7528f.this.m18464q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC7528f.this.m18463r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: g.e.f$d */
    /* loaded from: classes2.dex */
    final class C7532d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c */
        int f17898c;

        /* renamed from: e */
        boolean f17900e = false;

        /* renamed from: d */
        int f17899d = -1;

        C7532d() {
            this.f17898c = AbstractC7528f.this.mo18477d() - 1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> m18461a() {
            if (hasNext()) {
                this.f17899d++;
                this.f17900e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f17900e) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C7525c.m18508c(entry.getKey(), AbstractC7528f.this.mo18479b(this.f17899d, 0)) && C7525c.m18508c(entry.getValue(), AbstractC7528f.this.mo18479b(this.f17899d, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f17900e) {
                return (K) AbstractC7528f.this.mo18479b(this.f17899d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f17900e) {
                return (V) AbstractC7528f.this.mo18479b(this.f17899d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17899d < this.f17898c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f17900e) {
                Object mo18479b = AbstractC7528f.this.mo18479b(this.f17899d, 0);
                Object mo18479b2 = AbstractC7528f.this.mo18479b(this.f17899d, 1);
                return (mo18479b == null ? 0 : mo18479b.hashCode()) ^ (mo18479b2 != null ? mo18479b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            m18461a();
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f17900e) {
                AbstractC7528f.this.mo18473h(this.f17899d);
                this.f17899d--;
                this.f17898c--;
                this.f17900e = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f17900e) {
                return (V) AbstractC7528f.this.mo18472i(this.f17899d, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: g.e.f$e */
    /* loaded from: classes2.dex */
    final class C7533e implements Collection<V> {
        C7533e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC7528f.this.mo18480a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC7528f.this.mo18475f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC7528f.this.mo18477d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C7529a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo18475f = AbstractC7528f.this.mo18475f(obj);
            if (mo18475f >= 0) {
                AbstractC7528f.this.mo18473h(mo18475f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo18477d = AbstractC7528f.this.mo18477d();
            int i = 0;
            boolean z = false;
            while (i < mo18477d) {
                if (collection.contains(AbstractC7528f.this.mo18479b(i, 1))) {
                    AbstractC7528f.this.mo18473h(i);
                    i--;
                    mo18477d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo18477d = AbstractC7528f.this.mo18477d();
            int i = 0;
            boolean z = false;
            while (i < mo18477d) {
                if (!collection.contains(AbstractC7528f.this.mo18479b(i, 1))) {
                    AbstractC7528f.this.mo18473h(i);
                    i--;
                    mo18477d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC7528f.this.mo18477d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC7528f.this.m18464q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC7528f.this.m18463r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m18471j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m18470k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m18466o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m18465p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo18480a();

    /* renamed from: b */
    protected abstract Object mo18479b(int i, int i2);

    /* renamed from: c */
    protected abstract Map<K, V> mo18478c();

    /* renamed from: d */
    protected abstract int mo18477d();

    /* renamed from: e */
    protected abstract int mo18476e(Object obj);

    /* renamed from: f */
    protected abstract int mo18475f(Object obj);

    /* renamed from: g */
    protected abstract void mo18474g(K k, V v);

    /* renamed from: h */
    protected abstract void mo18473h(int i);

    /* renamed from: i */
    protected abstract V mo18472i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m18469l() {
        if (this.f17888a == null) {
            this.f17888a = new C7530b();
        }
        return this.f17888a;
    }

    /* renamed from: m */
    public Set<K> m18468m() {
        if (this.f17889b == null) {
            this.f17889b = new C7531c();
        }
        return this.f17889b;
    }

    /* renamed from: n */
    public Collection<V> m18467n() {
        if (this.f17890c == null) {
            this.f17890c = new C7533e();
        }
        return this.f17890c;
    }

    /* renamed from: q */
    public Object[] m18464q(int i) {
        int mo18477d = mo18477d();
        Object[] objArr = new Object[mo18477d];
        for (int i2 = 0; i2 < mo18477d; i2++) {
            objArr[i2] = mo18479b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m18463r(T[] tArr, int i) {
        int mo18477d = mo18477d();
        if (tArr.length < mo18477d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo18477d));
        }
        for (int i2 = 0; i2 < mo18477d; i2++) {
            tArr[i2] = mo18479b(i2, i);
        }
        if (tArr.length > mo18477d) {
            tArr[mo18477d] = null;
        }
        return tArr;
    }
}
