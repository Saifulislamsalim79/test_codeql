package com.google.android.gms.internal.p104firebaseauthapi;

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
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v0 */
/* loaded from: classes2.dex */
public class C3567v0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c */
    private final int f9009c;

    /* renamed from: f */
    private boolean f9012f;

    /* renamed from: w */
    private volatile C3541u0 f9013w;

    /* renamed from: d */
    private List<C3489s0> f9010d = Collections.emptyList();

    /* renamed from: e */
    private Map<K, V> f9011e = Collections.emptyMap();

    /* renamed from: x */
    private Map<K, V> f9014x = Collections.emptyMap();

    /* renamed from: m */
    private final int m30150m(K k) {
        int size = this.f9010d.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f9010d.get(size).m30296a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f9010d.get(i2).m30296a());
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
    public final V m30149n(int i) {
        m30147p();
        V v = (V) this.f9010d.remove(i).getValue();
        if (!this.f9011e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m30148o().entrySet().iterator();
            List<C3489s0> list = this.f9010d;
            Map.Entry<K, V> next = it.next();
            list.add(new C3489s0(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: o */
    private final SortedMap<K, V> m30148o() {
        m30147p();
        if (this.f9011e.isEmpty() && !(this.f9011e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9011e = treeMap;
            this.f9014x = treeMap.descendingMap();
        }
        return (SortedMap) this.f9011e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m30147p() {
        if (this.f9012f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo30160a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f9012f) {
            return;
        }
        if (this.f9011e.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f9011e);
        }
        this.f9011e = unmodifiableMap;
        if (this.f9014x.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f9014x);
        }
        this.f9014x = unmodifiableMap2;
        this.f9012f = true;
    }

    /* renamed from: b */
    public final int m30159b() {
        return this.f9010d.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> m30158c() {
        return this.f9011e.isEmpty() ? C3463r0.m30397a() : this.f9011e.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m30147p();
        if (!this.f9010d.isEmpty()) {
            this.f9010d.clear();
        }
        if (this.f9011e.isEmpty()) {
            return;
        }
        this.f9011e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m30150m(comparable) >= 0 || this.f9011e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f9013w == null) {
            this.f9013w = new C3541u0(this, null);
        }
        return this.f9013w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3567v0)) {
            return super.equals(obj);
        }
        C3567v0 c3567v0 = (C3567v0) obj;
        int size = size();
        if (size != c3567v0.size()) {
            return false;
        }
        int m30159b = m30159b();
        if (m30159b == c3567v0.m30159b()) {
            for (int i = 0; i < m30159b; i++) {
                if (!m30154i(i).equals(c3567v0.m30154i(i))) {
                    return false;
                }
            }
            if (m30159b != size) {
                return this.f9011e.equals(c3567v0.f9011e);
            }
            return true;
        }
        return entrySet().equals(c3567v0.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final V put(K k, V v) {
        m30147p();
        int m30150m = m30150m(k);
        if (m30150m >= 0) {
            return (V) this.f9010d.get(m30150m).setValue(v);
        }
        m30147p();
        if (this.f9010d.isEmpty() && !(this.f9010d instanceof ArrayList)) {
            this.f9010d = new ArrayList(this.f9009c);
        }
        int i = -(m30150m + 1);
        if (i >= this.f9009c) {
            return m30148o().put(k, v);
        }
        int size = this.f9010d.size();
        int i2 = this.f9009c;
        if (size == i2) {
            C3489s0 remove = this.f9010d.remove(i2 - 1);
            m30148o().put((K) remove.m30296a(), (V) remove.getValue());
        }
        this.f9010d.add(i, new C3489s0(this, k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m30150m = m30150m(comparable);
        if (m30150m >= 0) {
            return (V) this.f9010d.get(m30150m).getValue();
        }
        return this.f9011e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m30159b = m30159b();
        int i = 0;
        for (int i2 = 0; i2 < m30159b; i2++) {
            i += this.f9010d.get(i2).hashCode();
        }
        return this.f9011e.size() > 0 ? i + this.f9011e.hashCode() : i;
    }

    /* renamed from: i */
    public final Map.Entry<K, V> m30154i(int i) {
        return this.f9010d.get(i);
    }

    /* renamed from: l */
    public final boolean m30151l() {
        return this.f9012f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m30147p();
        Comparable comparable = (Comparable) obj;
        int m30150m = m30150m(comparable);
        if (m30150m >= 0) {
            return (V) m30149n(m30150m);
        }
        if (this.f9011e.isEmpty()) {
            return null;
        }
        return this.f9011e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9010d.size() + this.f9011e.size();
    }
}
