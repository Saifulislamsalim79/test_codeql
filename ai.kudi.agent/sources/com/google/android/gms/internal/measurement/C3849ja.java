package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ja */
/* loaded from: classes2.dex */
public class C3849ja<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c */
    private final int f9439c;

    /* renamed from: f */
    private boolean f9442f;

    /* renamed from: w */
    private volatile C3833ia f9443w;

    /* renamed from: d */
    private List<C3801ga> f9440d = Collections.emptyList();

    /* renamed from: e */
    private Map<K, V> f9441e = Collections.emptyMap();

    /* renamed from: x */
    private Map<K, V> f9444x = Collections.emptyMap();

    /* renamed from: m */
    private final int m29438m(K k) {
        int size = this.f9440d.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f9440d.get(size).m29583a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f9440d.get(i2).m29583a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final V m29437n(int i) {
        m29435p();
        V v = (V) this.f9440d.remove(i).getValue();
        if (!this.f9441e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m29436o().entrySet().iterator();
            List<C3801ga> list = this.f9440d;
            Map.Entry<K, V> next = it.next();
            list.add(new C3801ga(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: o */
    private final SortedMap<K, V> m29436o() {
        m29435p();
        if (this.f9441e.isEmpty() && !(this.f9441e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9441e = treeMap;
            this.f9444x = treeMap.descendingMap();
        }
        return (SortedMap) this.f9441e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m29435p() {
        if (this.f9442f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo29448a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f9442f) {
            return;
        }
        if (this.f9441e.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f9441e);
        }
        this.f9441e = unmodifiableMap;
        if (this.f9444x.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f9444x);
        }
        this.f9444x = unmodifiableMap2;
        this.f9442f = true;
    }

    /* renamed from: b */
    public final int m29447b() {
        return this.f9440d.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> m29446c() {
        return this.f9441e.isEmpty() ? C3785fa.m29607a() : this.f9441e.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m29435p();
        if (!this.f9440d.isEmpty()) {
            this.f9440d.clear();
        }
        if (this.f9441e.isEmpty()) {
            return;
        }
        this.f9441e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m29438m(comparable) >= 0 || this.f9441e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f9443w == null) {
            this.f9443w = new C3833ia(this, null);
        }
        return this.f9443w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3849ja)) {
            return super.equals(obj);
        }
        C3849ja c3849ja = (C3849ja) obj;
        int size = size();
        if (size != c3849ja.size()) {
            return false;
        }
        int m29447b = m29447b();
        if (m29447b == c3849ja.m29447b()) {
            for (int i = 0; i < m29447b; i++) {
                if (!m29442i(i).equals(c3849ja.m29442i(i))) {
                    return false;
                }
            }
            if (m29447b != size) {
                return this.f9441e.equals(c3849ja.f9441e);
            }
            return true;
        }
        return entrySet().equals(c3849ja.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final V put(K k, V v) {
        m29435p();
        int m29438m = m29438m(k);
        if (m29438m >= 0) {
            return (V) this.f9440d.get(m29438m).setValue(v);
        }
        m29435p();
        if (this.f9440d.isEmpty() && !(this.f9440d instanceof ArrayList)) {
            this.f9440d = new ArrayList(this.f9439c);
        }
        int i = -(m29438m + 1);
        if (i >= this.f9439c) {
            return m29436o().put(k, v);
        }
        int size = this.f9440d.size();
        int i2 = this.f9439c;
        if (size == i2) {
            C3801ga remove = this.f9440d.remove(i2 - 1);
            m29436o().put((K) remove.m29583a(), (V) remove.getValue());
        }
        this.f9440d.add(i, new C3801ga(this, k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m29438m = m29438m(comparable);
        if (m29438m >= 0) {
            return (V) this.f9440d.get(m29438m).getValue();
        }
        return this.f9441e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m29447b = m29447b();
        int i = 0;
        for (int i2 = 0; i2 < m29447b; i2++) {
            i += this.f9440d.get(i2).hashCode();
        }
        return this.f9441e.size() > 0 ? i + this.f9441e.hashCode() : i;
    }

    /* renamed from: i */
    public final Map.Entry<K, V> m29442i(int i) {
        return this.f9440d.get(i);
    }

    /* renamed from: l */
    public final boolean m29439l() {
        return this.f9442f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m29435p();
        Comparable comparable = (Comparable) obj;
        int m29438m = m29438m(comparable);
        if (m29438m >= 0) {
            return (V) m29437n(m29438m);
        }
        if (this.f9441e.isEmpty()) {
            return null;
        }
        return this.f9441e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9440d.size() + this.f9441e.size();
    }
}
