package io.intercom.com.google.gson.p418t;

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
/* renamed from: io.intercom.com.google.gson.t.h */
/* loaded from: classes3.dex */
public final class C10968h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: z */
    private static final Comparator<Comparable> f24972z = new C10969a();

    /* renamed from: c */
    Comparator<? super K> f24973c;

    /* renamed from: d */
    C10975e<K, V> f24974d;

    /* renamed from: e */
    int f24975e;

    /* renamed from: f */
    int f24976f;

    /* renamed from: w */
    final C10975e<K, V> f24977w;

    /* renamed from: x */
    private C10968h<K, V>.C10970b f24978x;

    /* renamed from: y */
    private C10968h<K, V>.C10972c f24979y;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: io.intercom.com.google.gson.t.h$a */
    /* loaded from: classes3.dex */
    static class C10969a implements Comparator<Comparable> {
        C10969a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: io.intercom.com.google.gson.t.h$b */
    /* loaded from: classes3.dex */
    class C10970b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: io.intercom.com.google.gson.t.h$b$a */
        /* loaded from: classes3.dex */
        class C10971a extends C10968h<K, V>.AbstractC10974d<Map.Entry<K, V>> {
            C10971a(C10970b c10970b) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return m11811a();
            }
        }

        C10970b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C10968h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C10968h.this.m11821c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C10971a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C10975e<K, V> m11821c;
            if ((obj instanceof Map.Entry) && (m11821c = C10968h.this.m11821c((Map.Entry) obj)) != null) {
                C10968h.this.m11818h(m11821c, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10968h.this.f24975e;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: io.intercom.com.google.gson.t.h$c */
    /* loaded from: classes3.dex */
    final class C10972c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: io.intercom.com.google.gson.t.h$c$a */
        /* loaded from: classes3.dex */
        class C10973a extends C10968h<K, V>.AbstractC10974d<K> {
            C10973a(C10972c c10972c) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m11811a().f24991x;
            }
        }

        C10972c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C10968h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C10968h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C10973a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C10968h.this.m11817i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10968h.this.f24975e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: io.intercom.com.google.gson.t.h$d */
    /* loaded from: classes3.dex */
    public abstract class AbstractC10974d<T> implements Iterator<T> {

        /* renamed from: c */
        C10975e<K, V> f24982c;

        /* renamed from: d */
        C10975e<K, V> f24983d;

        /* renamed from: e */
        int f24984e;

        AbstractC10974d() {
            C10968h c10968h = C10968h.this;
            this.f24982c = c10968h.f24977w.f24989f;
            this.f24983d = null;
            this.f24984e = c10968h.f24976f;
        }

        /* renamed from: a */
        final C10975e<K, V> m11811a() {
            C10975e<K, V> c10975e = this.f24982c;
            C10968h c10968h = C10968h.this;
            if (c10975e != c10968h.f24977w) {
                if (c10968h.f24976f == this.f24984e) {
                    this.f24982c = c10975e.f24989f;
                    this.f24983d = c10975e;
                    return c10975e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24982c != C10968h.this.f24977w;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C10975e<K, V> c10975e = this.f24983d;
            if (c10975e != null) {
                C10968h.this.m11818h(c10975e, true);
                this.f24983d = null;
                this.f24984e = C10968h.this.f24976f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C10968h() {
        this(f24972z);
    }

    /* renamed from: a */
    private boolean m11823a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    private void m11819g(C10975e<K, V> c10975e, boolean z) {
        while (c10975e != null) {
            C10975e<K, V> c10975e2 = c10975e.f24987d;
            C10975e<K, V> c10975e3 = c10975e.f24988e;
            int i = c10975e2 != null ? c10975e2.f24993z : 0;
            int i2 = c10975e3 != null ? c10975e3.f24993z : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C10975e<K, V> c10975e4 = c10975e3.f24987d;
                C10975e<K, V> c10975e5 = c10975e3.f24988e;
                int i4 = (c10975e4 != null ? c10975e4.f24993z : 0) - (c10975e5 != null ? c10975e5.f24993z : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m11814l(c10975e3);
                    m11815k(c10975e);
                } else {
                    m11815k(c10975e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C10975e<K, V> c10975e6 = c10975e2.f24987d;
                C10975e<K, V> c10975e7 = c10975e2.f24988e;
                int i5 = (c10975e6 != null ? c10975e6.f24993z : 0) - (c10975e7 != null ? c10975e7.f24993z : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m11815k(c10975e2);
                    m11814l(c10975e);
                } else {
                    m11814l(c10975e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c10975e.f24993z = i + 1;
                if (z) {
                    return;
                }
            } else {
                c10975e.f24993z = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c10975e = c10975e.f24986c;
        }
    }

    /* renamed from: j */
    private void m11816j(C10975e<K, V> c10975e, C10975e<K, V> c10975e2) {
        C10975e<K, V> c10975e3 = c10975e.f24986c;
        c10975e.f24986c = null;
        if (c10975e2 != null) {
            c10975e2.f24986c = c10975e3;
        }
        if (c10975e3 != null) {
            if (c10975e3.f24987d == c10975e) {
                c10975e3.f24987d = c10975e2;
                return;
            } else {
                c10975e3.f24988e = c10975e2;
                return;
            }
        }
        this.f24974d = c10975e2;
    }

    /* renamed from: k */
    private void m11815k(C10975e<K, V> c10975e) {
        C10975e<K, V> c10975e2 = c10975e.f24987d;
        C10975e<K, V> c10975e3 = c10975e.f24988e;
        C10975e<K, V> c10975e4 = c10975e3.f24987d;
        C10975e<K, V> c10975e5 = c10975e3.f24988e;
        c10975e.f24988e = c10975e4;
        if (c10975e4 != null) {
            c10975e4.f24986c = c10975e;
        }
        m11816j(c10975e, c10975e3);
        c10975e3.f24987d = c10975e;
        c10975e.f24986c = c10975e3;
        int max = Math.max(c10975e2 != null ? c10975e2.f24993z : 0, c10975e4 != null ? c10975e4.f24993z : 0) + 1;
        c10975e.f24993z = max;
        c10975e3.f24993z = Math.max(max, c10975e5 != null ? c10975e5.f24993z : 0) + 1;
    }

    /* renamed from: l */
    private void m11814l(C10975e<K, V> c10975e) {
        C10975e<K, V> c10975e2 = c10975e.f24987d;
        C10975e<K, V> c10975e3 = c10975e.f24988e;
        C10975e<K, V> c10975e4 = c10975e2.f24987d;
        C10975e<K, V> c10975e5 = c10975e2.f24988e;
        c10975e.f24987d = c10975e5;
        if (c10975e5 != null) {
            c10975e5.f24986c = c10975e;
        }
        m11816j(c10975e, c10975e2);
        c10975e2.f24988e = c10975e;
        c10975e.f24986c = c10975e2;
        int max = Math.max(c10975e3 != null ? c10975e3.f24993z : 0, c10975e5 != null ? c10975e5.f24993z : 0) + 1;
        c10975e.f24993z = max;
        c10975e2.f24993z = Math.max(max, c10975e4 != null ? c10975e4.f24993z : 0) + 1;
    }

    /* renamed from: b */
    C10975e<K, V> m11822b(K k, boolean z) {
        int i;
        C10975e<K, V> c10975e;
        Comparator<? super K> comparator = this.f24973c;
        C10975e<K, V> c10975e2 = this.f24974d;
        if (c10975e2 != null) {
            Comparable comparable = comparator == f24972z ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c10975e2.f24991x);
                } else {
                    i = comparator.compare(k, (K) c10975e2.f24991x);
                }
                if (i == 0) {
                    return c10975e2;
                }
                C10975e<K, V> c10975e3 = i < 0 ? c10975e2.f24987d : c10975e2.f24988e;
                if (c10975e3 == null) {
                    break;
                }
                c10975e2 = c10975e3;
            }
        } else {
            i = 0;
        }
        if (z) {
            C10975e<K, V> c10975e4 = this.f24977w;
            if (c10975e2 == null) {
                if (comparator == f24972z && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                c10975e = new C10975e<>(c10975e2, k, c10975e4, c10975e4.f24990w);
                this.f24974d = c10975e;
            } else {
                c10975e = new C10975e<>(c10975e2, k, c10975e4, c10975e4.f24990w);
                if (i < 0) {
                    c10975e2.f24987d = c10975e;
                } else {
                    c10975e2.f24988e = c10975e;
                }
                m11819g(c10975e2, true);
            }
            this.f24975e++;
            this.f24976f++;
            return c10975e;
        }
        return null;
    }

    /* renamed from: c */
    C10975e<K, V> m11821c(Map.Entry<?, ?> entry) {
        C10975e<K, V> m11820e = m11820e(entry.getKey());
        if (m11820e != null && m11823a(m11820e.f24992y, entry.getValue())) {
            return m11820e;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f24974d = null;
        this.f24975e = 0;
        this.f24976f++;
        C10975e<K, V> c10975e = this.f24977w;
        c10975e.f24990w = c10975e;
        c10975e.f24989f = c10975e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m11820e(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    C10975e<K, V> m11820e(Object obj) {
        if (obj != 0) {
            try {
                return m11822b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C10968h<K, V>.C10970b c10970b = this.f24978x;
        if (c10970b != null) {
            return c10970b;
        }
        C10968h<K, V>.C10970b c10970b2 = new C10970b();
        this.f24978x = c10970b2;
        return c10970b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C10975e<K, V> m11820e = m11820e(obj);
        if (m11820e != null) {
            return m11820e.f24992y;
        }
        return null;
    }

    /* renamed from: h */
    void m11818h(C10975e<K, V> c10975e, boolean z) {
        int i;
        if (z) {
            C10975e<K, V> c10975e2 = c10975e.f24990w;
            c10975e2.f24989f = c10975e.f24989f;
            c10975e.f24989f.f24990w = c10975e2;
        }
        C10975e<K, V> c10975e3 = c10975e.f24987d;
        C10975e<K, V> c10975e4 = c10975e.f24988e;
        C10975e<K, V> c10975e5 = c10975e.f24986c;
        int i2 = 0;
        if (c10975e3 != null && c10975e4 != null) {
            C10975e<K, V> m11809b = c10975e3.f24993z > c10975e4.f24993z ? c10975e3.m11809b() : c10975e4.m11810a();
            m11818h(m11809b, false);
            C10975e<K, V> c10975e6 = c10975e.f24987d;
            if (c10975e6 != null) {
                i = c10975e6.f24993z;
                m11809b.f24987d = c10975e6;
                c10975e6.f24986c = m11809b;
                c10975e.f24987d = null;
            } else {
                i = 0;
            }
            C10975e<K, V> c10975e7 = c10975e.f24988e;
            if (c10975e7 != null) {
                i2 = c10975e7.f24993z;
                m11809b.f24988e = c10975e7;
                c10975e7.f24986c = m11809b;
                c10975e.f24988e = null;
            }
            m11809b.f24993z = Math.max(i, i2) + 1;
            m11816j(c10975e, m11809b);
            return;
        }
        if (c10975e3 != null) {
            m11816j(c10975e, c10975e3);
            c10975e.f24987d = null;
        } else if (c10975e4 != null) {
            m11816j(c10975e, c10975e4);
            c10975e.f24988e = null;
        } else {
            m11816j(c10975e, null);
        }
        m11819g(c10975e5, false);
        this.f24975e--;
        this.f24976f++;
    }

    /* renamed from: i */
    C10975e<K, V> m11817i(Object obj) {
        C10975e<K, V> m11820e = m11820e(obj);
        if (m11820e != null) {
            m11818h(m11820e, true);
        }
        return m11820e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C10968h<K, V>.C10972c c10972c = this.f24979y;
        if (c10972c != null) {
            return c10972c;
        }
        C10968h<K, V>.C10972c c10972c2 = new C10972c();
        this.f24979y = c10972c2;
        return c10972c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            C10975e<K, V> m11822b = m11822b(k, true);
            V v2 = m11822b.f24992y;
            m11822b.f24992y = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C10975e<K, V> m11817i = m11817i(obj);
        if (m11817i != null) {
            return m11817i.f24992y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f24975e;
    }

    public C10968h(Comparator<? super K> comparator) {
        this.f24975e = 0;
        this.f24976f = 0;
        this.f24977w = new C10975e<>();
        this.f24973c = comparator == null ? f24972z : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: io.intercom.com.google.gson.t.h$e */
    /* loaded from: classes3.dex */
    public static final class C10975e<K, V> implements Map.Entry<K, V> {

        /* renamed from: c */
        C10975e<K, V> f24986c;

        /* renamed from: d */
        C10975e<K, V> f24987d;

        /* renamed from: e */
        C10975e<K, V> f24988e;

        /* renamed from: f */
        C10975e<K, V> f24989f;

        /* renamed from: w */
        C10975e<K, V> f24990w;

        /* renamed from: x */
        final K f24991x;

        /* renamed from: y */
        V f24992y;

        /* renamed from: z */
        int f24993z;

        C10975e() {
            this.f24991x = null;
            this.f24990w = this;
            this.f24989f = this;
        }

        /* renamed from: a */
        public C10975e<K, V> m11810a() {
            C10975e<K, V> c10975e = this;
            for (C10975e<K, V> c10975e2 = this.f24987d; c10975e2 != null; c10975e2 = c10975e2.f24987d) {
                c10975e = c10975e2;
            }
            return c10975e;
        }

        /* renamed from: b */
        public C10975e<K, V> m11809b() {
            C10975e<K, V> c10975e = this;
            for (C10975e<K, V> c10975e2 = this.f24988e; c10975e2 != null; c10975e2 = c10975e2.f24988e) {
                c10975e = c10975e2;
            }
            return c10975e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f24991x;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f24992y;
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
            return this.f24991x;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24992y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f24991x;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f24992y;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f24992y;
            this.f24992y = v;
            return v2;
        }

        public String toString() {
            return this.f24991x + "=" + this.f24992y;
        }

        C10975e(C10975e<K, V> c10975e, K k, C10975e<K, V> c10975e2, C10975e<K, V> c10975e3) {
            this.f24986c = c10975e;
            this.f24991x = k;
            this.f24993z = 1;
            this.f24989f = c10975e2;
            this.f24990w = c10975e3;
            c10975e3.f24989f = this;
            c10975e2.f24990w = this;
        }
    }
}
