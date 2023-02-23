package com.google.common.collect;

import com.google.common.collect.AbstractC5072h;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
/* compiled from: ImmutableMap.java */
/* renamed from: com.google.common.collect.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5077j<K, V> implements Map<K, V>, Serializable {

    /* renamed from: c */
    private transient AbstractC5079k<Map.Entry<K, V>> f12719c;

    /* renamed from: d */
    private transient AbstractC5079k<K> f12720d;

    /* renamed from: e */
    private transient AbstractC5072h<V> f12721e;

    /* compiled from: ImmutableMap.java */
    /* renamed from: com.google.common.collect.j$a */
    /* loaded from: classes2.dex */
    public static class C5078a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f12722a;

        /* renamed from: b */
        Object[] f12723b;

        /* renamed from: c */
        int f12724c = 0;

        /* renamed from: d */
        boolean f12725d = false;

        C5078a(int i) {
            this.f12723b = new Object[i * 2];
        }

        /* renamed from: b */
        private void m25721b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f12723b;
            if (i2 > objArr.length) {
                this.f12723b = Arrays.copyOf(objArr, AbstractC5072h.AbstractC5073a.m25740a(objArr.length, i2));
                this.f12725d = false;
            }
        }

        /* renamed from: a */
        public AbstractC5077j<K, V> m25722a() {
            m25717f();
            this.f12725d = true;
            return C5128v.m25571n(this.f12724c, this.f12723b);
        }

        /* renamed from: c */
        public C5078a<K, V> m25720c(K k, V v) {
            m25721b(this.f12724c + 1);
            C5068d.m25746a(k, v);
            Object[] objArr = this.f12723b;
            int i = this.f12724c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f12724c = i + 1;
            return this;
        }

        /* renamed from: d */
        public C5078a<K, V> m25719d(Map.Entry<? extends K, ? extends V> entry) {
            m25720c(entry.getKey(), entry.getValue());
            return this;
        }

        /* renamed from: e */
        public C5078a<K, V> m25718e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m25721b(this.f12724c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                m25719d(entry);
            }
            return this;
        }

        /* renamed from: f */
        void m25717f() {
            int i;
            if (this.f12722a != null) {
                if (this.f12725d) {
                    this.f12723b = Arrays.copyOf(this.f12723b, this.f12724c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f12724c];
                int i2 = 0;
                while (true) {
                    i = this.f12724c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f12723b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, AbstractC5125s.m25579a(this.f12722a).m25578b(C5120q.m25588c()));
                for (int i4 = 0; i4 < this.f12724c; i4++) {
                    int i5 = i4 * 2;
                    this.f12723b[i5] = entryArr[i4].getKey();
                    this.f12723b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    /* renamed from: a */
    public static <K, V> C5078a<K, V> m25729a(int i) {
        C5068d.m25745b(i, "expectedSize");
        return new C5078a<>(i);
    }

    /* renamed from: b */
    public static <K, V> AbstractC5077j<K, V> m25728b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C5078a c5078a = new C5078a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c5078a.m25718e(iterable);
        return c5078a.m25722a();
    }

    /* renamed from: c */
    public static <K, V> AbstractC5077j<K, V> m25727c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC5077j) && !(map instanceof SortedMap)) {
            AbstractC5077j<K, V> abstractC5077j = (AbstractC5077j) map;
            if (!abstractC5077j.mo25572j()) {
                return abstractC5077j;
            }
        }
        return m25728b(map.entrySet());
    }

    /* renamed from: l */
    public static <K, V> AbstractC5077j<K, V> m25724l() {
        return (AbstractC5077j<K, V>) C5128v.f12793y;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    abstract AbstractC5079k<Map.Entry<K, V>> mo25575e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C5120q.m25590a(this, obj);
    }

    /* renamed from: g */
    abstract AbstractC5079k<K> mo25574g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    abstract AbstractC5072h<V> mo25573h();

    @Override // java.util.Map
    public int hashCode() {
        return C5134x.m25558b(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public AbstractC5079k<Map.Entry<K, V>> entrySet() {
        AbstractC5079k<Map.Entry<K, V>> abstractC5079k = this.f12719c;
        if (abstractC5079k == null) {
            AbstractC5079k<Map.Entry<K, V>> mo25575e = mo25575e();
            this.f12719c = mo25575e;
            return mo25575e;
        }
        return abstractC5079k;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    abstract boolean mo25572j();

    @Override // java.util.Map
    /* renamed from: k */
    public AbstractC5079k<K> keySet() {
        AbstractC5079k<K> abstractC5079k = this.f12720d;
        if (abstractC5079k == null) {
            AbstractC5079k<K> mo25574g = mo25574g();
            this.f12720d = mo25574g;
            return mo25574g;
        }
        return abstractC5079k;
    }

    @Override // java.util.Map
    /* renamed from: m */
    public AbstractC5072h<V> values() {
        AbstractC5072h<V> abstractC5072h = this.f12721e;
        if (abstractC5072h == null) {
            AbstractC5072h<V> mo25573h = mo25573h();
            this.f12721e = mo25573h;
            return mo25573h;
        }
        return abstractC5072h;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C5120q.m25589b(this);
    }
}
