package org.apache.commons.collections4.p594c;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.p592a.AbstractC14518a;
import org.apache.commons.collections4.p593b.AbstractC14520b;
/* compiled from: ListOrderedMap.java */
/* renamed from: org.apache.commons.collections4.c.c */
/* loaded from: classes3.dex */
public class C14523c<K, V> extends AbstractC14522b<K, V> implements Object<K, V>, Serializable {

    /* renamed from: d */
    private final List<K> f32071d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListOrderedMap.java */
    /* renamed from: org.apache.commons.collections4.c.c$a */
    /* loaded from: classes3.dex */
    public static class C14524a<K, V> extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: c */
        private final C14523c<K, V> f32072c;

        /* renamed from: d */
        private final List<K> f32073d;

        /* renamed from: e */
        private Set<Map.Entry<K, V>> f32074e;

        public C14524a(C14523c<K, V> c14523c, List<K> list) {
            this.f32072c = c14523c;
            this.f32073d = list;
        }

        /* renamed from: d */
        private Set<Map.Entry<K, V>> m1395d() {
            if (this.f32074e == null) {
                this.f32074e = this.f32072c.m1401a().entrySet();
            }
            return this.f32074e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f32072c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m1395d().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m1395d().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return m1395d().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m1395d().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f32072c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14527c(this.f32072c, this.f32073d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if ((obj instanceof Map.Entry) && m1395d().contains(obj)) {
                this.f32072c.remove(((Map.Entry) obj).getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f32072c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return m1395d().toString();
        }
    }

    /* compiled from: ListOrderedMap.java */
    /* renamed from: org.apache.commons.collections4.c.c$b */
    /* loaded from: classes3.dex */
    static class C14525b<K> extends AbstractSet<K> {

        /* renamed from: c */
        private final C14523c<K, Object> f32075c;

        /* compiled from: ListOrderedMap.java */
        /* renamed from: org.apache.commons.collections4.c.c$b$a */
        /* loaded from: classes3.dex */
        class C14526a extends AbstractC14518a<Map.Entry<K, Object>, K> {
            C14526a(C14525b c14525b, Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public K next() {
                return m1402a().next().getKey();
            }
        }

        C14525b(C14523c<K, ?> c14523c) {
            this.f32075c = c14523c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f32075c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f32075c.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C14526a(this, this.f32075c.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f32075c.size();
        }
    }

    /* compiled from: ListOrderedMap.java */
    /* renamed from: org.apache.commons.collections4.c.c$c */
    /* loaded from: classes3.dex */
    static class C14527c<K, V> extends AbstractC14518a<K, Map.Entry<K, V>> {

        /* renamed from: d */
        private final C14523c<K, V> f32076d;

        /* renamed from: e */
        private K f32077e;

        C14527c(C14523c<K, V> c14523c, List<K> list) {
            super(list.iterator());
            this.f32077e = null;
            this.f32076d = c14523c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            K next = m1402a().next();
            this.f32077e = next;
            return new C14528d(this.f32076d, next);
        }

        @Override // org.apache.commons.collections4.p592a.AbstractC14518a, java.util.Iterator
        public void remove() {
            super.remove();
            this.f32076d.m1401a().remove(this.f32077e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListOrderedMap.java */
    /* renamed from: org.apache.commons.collections4.c.c$d */
    /* loaded from: classes3.dex */
    public static class C14528d<K, V> extends AbstractC14520b<K, V> {

        /* renamed from: e */
        private final C14523c<K, V> f32078e;

        C14528d(C14523c<K, V> c14523c, K k) {
            super(k, null);
            this.f32078e = c14523c;
        }

        @Override // org.apache.commons.collections4.p593b.AbstractC14519a, java.util.Map.Entry
        public V getValue() {
            return this.f32078e.get(getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            return this.f32078e.m1401a().put(getKey(), v);
        }
    }

    /* compiled from: ListOrderedMap.java */
    /* renamed from: org.apache.commons.collections4.c.c$e */
    /* loaded from: classes3.dex */
    static class C14529e<V> extends AbstractList<V> {

        /* renamed from: c */
        private final C14523c<Object, V> f32079c;

        /* compiled from: ListOrderedMap.java */
        /* renamed from: org.apache.commons.collections4.c.c$e$a */
        /* loaded from: classes3.dex */
        class C14530a extends AbstractC14518a<Map.Entry<Object, V>, V> {
            C14530a(C14529e c14529e, Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public V next() {
                return m1402a().next().getValue();
            }
        }

        C14529e(C14523c<?, V> c14523c) {
            this.f32079c = c14523c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f32079c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f32079c.containsValue(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public V get(int i) {
            return this.f32079c.m1399c(i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new C14530a(this, this.f32079c.entrySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public V remove(int i) {
            return this.f32079c.m1397g(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public V set(int i, V v) {
            return this.f32079c.m1396h(i, v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32079c.size();
        }
    }

    public C14523c() {
        this(new HashMap());
    }

    /* renamed from: b */
    public K m1400b(int i) {
        return this.f32071d.get(i);
    }

    /* renamed from: c */
    public V m1399c(int i) {
        return get(this.f32071d.get(i));
    }

    public void clear() {
        m1401a().clear();
        this.f32071d.clear();
    }

    /* renamed from: e */
    public V m1398e(int i, K k, V v) {
        if (i >= 0 && i <= this.f32071d.size()) {
            Map<K, V> m1401a = m1401a();
            if (m1401a.containsKey(k)) {
                V remove = m1401a.remove(k);
                int indexOf = this.f32071d.indexOf(k);
                this.f32071d.remove(indexOf);
                if (indexOf < i) {
                    i--;
                }
                this.f32071d.add(i, k);
                m1401a.put(k, v);
                return remove;
            }
            this.f32071d.add(i, k);
            m1401a.put(k, v);
            return null;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f32071d.size());
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return new C14524a(this, this.f32071d);
    }

    /* renamed from: g */
    public V m1397g(int i) {
        return remove(m1400b(i));
    }

    /* renamed from: h */
    public V m1396h(int i, V v) {
        return put(this.f32071d.get(i), v);
    }

    public Set<K> keySet() {
        return new C14525b(this);
    }

    public V put(K k, V v) {
        if (m1401a().containsKey(k)) {
            return m1401a().put(k, v);
        }
        V put = m1401a().put(k, v);
        this.f32071d.add(k);
        return put;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        if (m1401a().containsKey(obj)) {
            V remove = m1401a().remove(obj);
            this.f32071d.remove(obj);
            return remove;
        }
        return null;
    }

    @Override // java.lang.Object
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            if (key == this) {
                key = "(this Map)";
            }
            sb.append(key);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
        }
        sb.append('}');
        return sb.toString();
    }

    public Collection<V> values() {
        return new C14529e(this);
    }

    protected C14523c(Map<K, V> map) {
        super(map);
        ArrayList arrayList = new ArrayList();
        this.f32071d = arrayList;
        arrayList.addAll(m1401a().keySet());
    }
}
