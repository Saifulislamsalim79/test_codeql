package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: LinkedTreeMap.java */
/* renamed from: com.google.gson.internal.g */
/* loaded from: classes2.dex */
public final class C6876g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: z */
    private static final Comparator<Comparable> f16517z = new C6877a();

    /* renamed from: c */
    Comparator<? super K> f16518c;

    /* renamed from: d */
    C6883e<K, V> f16519d;

    /* renamed from: e */
    int f16520e;

    /* renamed from: f */
    int f16521f;

    /* renamed from: w */
    final C6883e<K, V> f16522w;

    /* renamed from: x */
    private C6876g<K, V>.C6878b f16523x;

    /* renamed from: y */
    private C6876g<K, V>.C6880c f16524y;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.internal.g$a */
    /* loaded from: classes2.dex */
    class C6877a implements Comparator<Comparable> {
        C6877a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.internal.g$b */
    /* loaded from: classes2.dex */
    class C6878b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: com.google.gson.internal.g$b$a */
        /* loaded from: classes2.dex */
        class C6879a extends C6876g<K, V>.AbstractC6882d<Map.Entry<K, V>> {
            C6879a(C6878b c6878b) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return m20571a();
            }
        }

        C6878b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6876g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C6876g.this.m20581c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6879a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C6883e<K, V> m20581c;
            if ((obj instanceof Map.Entry) && (m20581c = C6876g.this.m20581c((Map.Entry) obj)) != null) {
                C6876g.this.m20578h(m20581c, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6876g.this.f16520e;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.internal.g$c */
    /* loaded from: classes2.dex */
    final class C6880c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: com.google.gson.internal.g$c$a */
        /* loaded from: classes2.dex */
        class C6881a extends C6876g<K, V>.AbstractC6882d<K> {
            C6881a(C6880c c6880c) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m20571a().f16536x;
            }
        }

        C6880c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6876g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C6876g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C6881a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C6876g.this.m20577i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6876g.this.f16520e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.internal.g$d */
    /* loaded from: classes2.dex */
    public abstract class AbstractC6882d<T> implements Iterator<T> {

        /* renamed from: c */
        C6883e<K, V> f16527c;

        /* renamed from: d */
        C6883e<K, V> f16528d;

        /* renamed from: e */
        int f16529e;

        AbstractC6882d() {
            C6876g c6876g = C6876g.this;
            this.f16527c = c6876g.f16522w.f16534f;
            this.f16528d = null;
            this.f16529e = c6876g.f16521f;
        }

        /* renamed from: a */
        final C6883e<K, V> m20571a() {
            C6883e<K, V> c6883e = this.f16527c;
            C6876g c6876g = C6876g.this;
            if (c6883e != c6876g.f16522w) {
                if (c6876g.f16521f == this.f16529e) {
                    this.f16527c = c6883e.f16534f;
                    this.f16528d = c6883e;
                    return c6883e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16527c != C6876g.this.f16522w;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C6883e<K, V> c6883e = this.f16528d;
            if (c6883e != null) {
                C6876g.this.m20578h(c6883e, true);
                this.f16528d = null;
                this.f16529e = C6876g.this.f16521f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C6876g() {
        this(f16517z);
    }

    /* renamed from: a */
    private boolean m20583a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    private void m20579g(C6883e<K, V> c6883e, boolean z) {
        while (c6883e != null) {
            C6883e<K, V> c6883e2 = c6883e.f16532d;
            C6883e<K, V> c6883e3 = c6883e.f16533e;
            int i = c6883e2 != null ? c6883e2.f16538z : 0;
            int i2 = c6883e3 != null ? c6883e3.f16538z : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C6883e<K, V> c6883e4 = c6883e3.f16532d;
                C6883e<K, V> c6883e5 = c6883e3.f16533e;
                int i4 = (c6883e4 != null ? c6883e4.f16538z : 0) - (c6883e5 != null ? c6883e5.f16538z : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m20574l(c6883e3);
                    m20575k(c6883e);
                } else {
                    m20575k(c6883e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C6883e<K, V> c6883e6 = c6883e2.f16532d;
                C6883e<K, V> c6883e7 = c6883e2.f16533e;
                int i5 = (c6883e6 != null ? c6883e6.f16538z : 0) - (c6883e7 != null ? c6883e7.f16538z : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m20575k(c6883e2);
                    m20574l(c6883e);
                } else {
                    m20574l(c6883e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c6883e.f16538z = i + 1;
                if (z) {
                    return;
                }
            } else {
                c6883e.f16538z = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c6883e = c6883e.f16531c;
        }
    }

    /* renamed from: j */
    private void m20576j(C6883e<K, V> c6883e, C6883e<K, V> c6883e2) {
        C6883e<K, V> c6883e3 = c6883e.f16531c;
        c6883e.f16531c = null;
        if (c6883e2 != null) {
            c6883e2.f16531c = c6883e3;
        }
        if (c6883e3 != null) {
            if (c6883e3.f16532d == c6883e) {
                c6883e3.f16532d = c6883e2;
                return;
            } else {
                c6883e3.f16533e = c6883e2;
                return;
            }
        }
        this.f16519d = c6883e2;
    }

    /* renamed from: k */
    private void m20575k(C6883e<K, V> c6883e) {
        C6883e<K, V> c6883e2 = c6883e.f16532d;
        C6883e<K, V> c6883e3 = c6883e.f16533e;
        C6883e<K, V> c6883e4 = c6883e3.f16532d;
        C6883e<K, V> c6883e5 = c6883e3.f16533e;
        c6883e.f16533e = c6883e4;
        if (c6883e4 != null) {
            c6883e4.f16531c = c6883e;
        }
        m20576j(c6883e, c6883e3);
        c6883e3.f16532d = c6883e;
        c6883e.f16531c = c6883e3;
        int max = Math.max(c6883e2 != null ? c6883e2.f16538z : 0, c6883e4 != null ? c6883e4.f16538z : 0) + 1;
        c6883e.f16538z = max;
        c6883e3.f16538z = Math.max(max, c6883e5 != null ? c6883e5.f16538z : 0) + 1;
    }

    /* renamed from: l */
    private void m20574l(C6883e<K, V> c6883e) {
        C6883e<K, V> c6883e2 = c6883e.f16532d;
        C6883e<K, V> c6883e3 = c6883e.f16533e;
        C6883e<K, V> c6883e4 = c6883e2.f16532d;
        C6883e<K, V> c6883e5 = c6883e2.f16533e;
        c6883e.f16532d = c6883e5;
        if (c6883e5 != null) {
            c6883e5.f16531c = c6883e;
        }
        m20576j(c6883e, c6883e2);
        c6883e2.f16533e = c6883e;
        c6883e.f16531c = c6883e2;
        int max = Math.max(c6883e3 != null ? c6883e3.f16538z : 0, c6883e5 != null ? c6883e5.f16538z : 0) + 1;
        c6883e.f16538z = max;
        c6883e2.f16538z = Math.max(max, c6883e4 != null ? c6883e4.f16538z : 0) + 1;
    }

    /* renamed from: b */
    C6883e<K, V> m20582b(K k, boolean z) {
        int i;
        C6883e<K, V> c6883e;
        Comparator<? super K> comparator = this.f16518c;
        C6883e<K, V> c6883e2 = this.f16519d;
        if (c6883e2 != null) {
            Comparable comparable = comparator == f16517z ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c6883e2.f16536x);
                } else {
                    i = comparator.compare(k, (K) c6883e2.f16536x);
                }
                if (i == 0) {
                    return c6883e2;
                }
                C6883e<K, V> c6883e3 = i < 0 ? c6883e2.f16532d : c6883e2.f16533e;
                if (c6883e3 == null) {
                    break;
                }
                c6883e2 = c6883e3;
            }
        } else {
            i = 0;
        }
        if (z) {
            C6883e<K, V> c6883e4 = this.f16522w;
            if (c6883e2 == null) {
                if (comparator == f16517z && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                c6883e = new C6883e<>(c6883e2, k, c6883e4, c6883e4.f16535w);
                this.f16519d = c6883e;
            } else {
                c6883e = new C6883e<>(c6883e2, k, c6883e4, c6883e4.f16535w);
                if (i < 0) {
                    c6883e2.f16532d = c6883e;
                } else {
                    c6883e2.f16533e = c6883e;
                }
                m20579g(c6883e2, true);
            }
            this.f16520e++;
            this.f16521f++;
            return c6883e;
        }
        return null;
    }

    /* renamed from: c */
    C6883e<K, V> m20581c(Map.Entry<?, ?> entry) {
        C6883e<K, V> m20580e = m20580e(entry.getKey());
        if (m20580e != null && m20583a(m20580e.f16537y, entry.getValue())) {
            return m20580e;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f16519d = null;
        this.f16520e = 0;
        this.f16521f++;
        C6883e<K, V> c6883e = this.f16522w;
        c6883e.f16535w = c6883e;
        c6883e.f16534f = c6883e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m20580e(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    C6883e<K, V> m20580e(Object obj) {
        if (obj != 0) {
            try {
                return m20582b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C6876g<K, V>.C6878b c6878b = this.f16523x;
        if (c6878b != null) {
            return c6878b;
        }
        C6876g<K, V>.C6878b c6878b2 = new C6878b();
        this.f16523x = c6878b2;
        return c6878b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C6883e<K, V> m20580e = m20580e(obj);
        if (m20580e != null) {
            return m20580e.f16537y;
        }
        return null;
    }

    /* renamed from: h */
    void m20578h(C6883e<K, V> c6883e, boolean z) {
        int i;
        if (z) {
            C6883e<K, V> c6883e2 = c6883e.f16535w;
            c6883e2.f16534f = c6883e.f16534f;
            c6883e.f16534f.f16535w = c6883e2;
        }
        C6883e<K, V> c6883e3 = c6883e.f16532d;
        C6883e<K, V> c6883e4 = c6883e.f16533e;
        C6883e<K, V> c6883e5 = c6883e.f16531c;
        int i2 = 0;
        if (c6883e3 != null && c6883e4 != null) {
            C6883e<K, V> m20569b = c6883e3.f16538z > c6883e4.f16538z ? c6883e3.m20569b() : c6883e4.m20570a();
            m20578h(m20569b, false);
            C6883e<K, V> c6883e6 = c6883e.f16532d;
            if (c6883e6 != null) {
                i = c6883e6.f16538z;
                m20569b.f16532d = c6883e6;
                c6883e6.f16531c = m20569b;
                c6883e.f16532d = null;
            } else {
                i = 0;
            }
            C6883e<K, V> c6883e7 = c6883e.f16533e;
            if (c6883e7 != null) {
                i2 = c6883e7.f16538z;
                m20569b.f16533e = c6883e7;
                c6883e7.f16531c = m20569b;
                c6883e.f16533e = null;
            }
            m20569b.f16538z = Math.max(i, i2) + 1;
            m20576j(c6883e, m20569b);
            return;
        }
        if (c6883e3 != null) {
            m20576j(c6883e, c6883e3);
            c6883e.f16532d = null;
        } else if (c6883e4 != null) {
            m20576j(c6883e, c6883e4);
            c6883e.f16533e = null;
        } else {
            m20576j(c6883e, null);
        }
        m20579g(c6883e5, false);
        this.f16520e--;
        this.f16521f++;
    }

    /* renamed from: i */
    C6883e<K, V> m20577i(Object obj) {
        C6883e<K, V> m20580e = m20580e(obj);
        if (m20580e != null) {
            m20578h(m20580e, true);
        }
        return m20580e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C6876g<K, V>.C6880c c6880c = this.f16524y;
        if (c6880c != null) {
            return c6880c;
        }
        C6876g<K, V>.C6880c c6880c2 = new C6880c();
        this.f16524y = c6880c2;
        return c6880c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            C6883e<K, V> m20582b = m20582b(k, true);
            V v2 = m20582b.f16537y;
            m20582b.f16537y = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C6883e<K, V> m20577i = m20577i(obj);
        if (m20577i != null) {
            return m20577i.f16537y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16520e;
    }

    public C6876g(Comparator<? super K> comparator) {
        this.f16520e = 0;
        this.f16521f = 0;
        this.f16522w = new C6883e<>();
        this.f16518c = comparator == null ? f16517z : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.internal.g$e */
    /* loaded from: classes2.dex */
    public static final class C6883e<K, V> implements Map.Entry<K, V> {

        /* renamed from: c */
        C6883e<K, V> f16531c;

        /* renamed from: d */
        C6883e<K, V> f16532d;

        /* renamed from: e */
        C6883e<K, V> f16533e;

        /* renamed from: f */
        C6883e<K, V> f16534f;

        /* renamed from: w */
        C6883e<K, V> f16535w;

        /* renamed from: x */
        final K f16536x;

        /* renamed from: y */
        V f16537y;

        /* renamed from: z */
        int f16538z;

        C6883e() {
            this.f16536x = null;
            this.f16535w = this;
            this.f16534f = this;
        }

        /* renamed from: a */
        public C6883e<K, V> m20570a() {
            C6883e<K, V> c6883e = this;
            for (C6883e<K, V> c6883e2 = this.f16532d; c6883e2 != null; c6883e2 = c6883e2.f16532d) {
                c6883e = c6883e2;
            }
            return c6883e;
        }

        /* renamed from: b */
        public C6883e<K, V> m20569b() {
            C6883e<K, V> c6883e = this;
            for (C6883e<K, V> c6883e2 = this.f16533e; c6883e2 != null; c6883e2 = c6883e2.f16533e) {
                c6883e = c6883e2;
            }
            return c6883e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f16536x;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f16537y;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16536x;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16537y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f16536x;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f16537y;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f16537y;
            this.f16537y = v;
            return v2;
        }

        public String toString() {
            return this.f16536x + "=" + this.f16537y;
        }

        C6883e(C6883e<K, V> c6883e, K k, C6883e<K, V> c6883e2, C6883e<K, V> c6883e3) {
            this.f16531c = c6883e;
            this.f16536x = k;
            this.f16538z = 1;
            this.f16534f = c6883e2;
            this.f16535w = c6883e3;
            c6883e3.f16534f = this;
            c6883e2.f16535w = this;
        }
    }
}
