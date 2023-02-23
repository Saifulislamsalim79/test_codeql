package com.google.protobuf;

import com.google.protobuf.C7126u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* renamed from: com.google.protobuf.k1 */
/* loaded from: classes2.dex */
public class C7066k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c */
    private final int f16880c;

    /* renamed from: d */
    private List<C7066k1<K, V>.C7071c> f16881d;

    /* renamed from: e */
    private Map<K, V> f16882e;

    /* renamed from: f */
    private boolean f16883f;

    /* renamed from: w */
    private volatile C7066k1<K, V>.C7073e f16884w;

    /* renamed from: x */
    private Map<K, V> f16885x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: com.google.protobuf.k1$a */
    /* loaded from: classes2.dex */
    public static class C7067a extends C7066k1<FieldDescriptorType, Object> {
        C7067a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.C7066k1
        /* renamed from: p */
        public void mo19850p() {
            if (!m19854o()) {
                for (int i = 0; i < m19858k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> m19859j = m19859j(i);
                    if (((C7126u.InterfaceC7128b) m19859j.getKey()).mo19347f()) {
                        m19859j.setValue(Collections.unmodifiableList((List) m19859j.getValue()));
                    }
                }
                Iterator it = m19856m().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C7126u.InterfaceC7128b) entry.getKey()).mo19347f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo19850p();
        }

        @Override // com.google.protobuf.C7066k1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C7126u.InterfaceC7128b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: com.google.protobuf.k1$b */
    /* loaded from: classes2.dex */
    public static class C7068b {

        /* renamed from: a */
        private static final Iterator<Object> f16886a = new C7069a();

        /* renamed from: b */
        private static final Iterable<Object> f16887b = new C7070b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: com.google.protobuf.k1$b$a */
        /* loaded from: classes2.dex */
        static class C7069a implements Iterator<Object> {
            C7069a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* renamed from: com.google.protobuf.k1$b$b */
        /* loaded from: classes2.dex */
        static class C7070b implements Iterable<Object> {
            C7070b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C7068b.f16886a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m19848b() {
            return (Iterable<T>) f16887b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: com.google.protobuf.k1$c */
    /* loaded from: classes2.dex */
    public class C7071c implements Map.Entry<K, V>, Comparable<C7066k1<K, V>.C7071c> {

        /* renamed from: c */
        private final K f16888c;

        /* renamed from: d */
        private V f16889d;

        C7071c(C7066k1 c7066k1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m19846b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C7066k1<K, V>.C7071c c7071c) {
            return getKey().compareTo(c7071c.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: e */
        public K getKey() {
            return this.f16888c;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return m19846b(this.f16888c, entry.getKey()) && m19846b(this.f16889d, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16889d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f16888c;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f16889d;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C7066k1.this.m19861h();
            V v2 = this.f16889d;
            this.f16889d = v;
            return v2;
        }

        public String toString() {
            return this.f16888c + "=" + this.f16889d;
        }

        C7071c(K k, V v) {
            this.f16888c = k;
            this.f16889d = v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: com.google.protobuf.k1$e */
    /* loaded from: classes2.dex */
    public class C7073e extends AbstractSet<Map.Entry<K, V>> {
        private C7073e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7066k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C7066k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C7066k1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7072d(C7066k1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C7066k1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7066k1.this.size();
        }

        /* synthetic */ C7073e(C7066k1 c7066k1, C7067a c7067a) {
            this();
        }
    }

    /* synthetic */ C7066k1(int i, C7067a c7067a) {
        this(i);
    }

    /* renamed from: g */
    private int m19862g(K k) {
        int size = this.f16881d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f16881d.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f16881d.get(i2).getKey());
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
    /* renamed from: h */
    public void m19861h() {
        if (this.f16883f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m19860i() {
        m19861h();
        if (!this.f16881d.isEmpty() || (this.f16881d instanceof ArrayList)) {
            return;
        }
        this.f16881d = new ArrayList(this.f16880c);
    }

    /* renamed from: n */
    private SortedMap<K, V> m19855n() {
        m19861h();
        if (this.f16882e.isEmpty() && !(this.f16882e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16882e = treeMap;
            this.f16885x = treeMap.descendingMap();
        }
        return (SortedMap) this.f16882e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static <FieldDescriptorType extends C7126u.InterfaceC7128b<FieldDescriptorType>> C7066k1<FieldDescriptorType, Object> m19853q(int i) {
        return new C7067a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public V m19851s(int i) {
        m19861h();
        V value = this.f16881d.remove(i).getValue();
        if (!this.f16882e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m19855n().entrySet().iterator();
            this.f16881d.add(new C7071c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m19861h();
        if (!this.f16881d.isEmpty()) {
            this.f16881d.clear();
        }
        if (this.f16882e.isEmpty()) {
            return;
        }
        this.f16882e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m19862g(comparable) >= 0 || this.f16882e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f16884w == null) {
            this.f16884w = new C7073e(this, null);
        }
        return this.f16884w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7066k1)) {
            return super.equals(obj);
        }
        C7066k1 c7066k1 = (C7066k1) obj;
        int size = size();
        if (size != c7066k1.size()) {
            return false;
        }
        int m19858k = m19858k();
        if (m19858k != c7066k1.m19858k()) {
            return entrySet().equals(c7066k1.entrySet());
        }
        for (int i = 0; i < m19858k; i++) {
            if (!m19859j(i).equals(c7066k1.m19859j(i))) {
                return false;
            }
        }
        if (m19858k != size) {
            return this.f16882e.equals(c7066k1.f16882e);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m19862g = m19862g(comparable);
        if (m19862g >= 0) {
            return this.f16881d.get(m19862g).getValue();
        }
        return this.f16882e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m19858k = m19858k();
        int i = 0;
        for (int i2 = 0; i2 < m19858k; i2++) {
            i += this.f16881d.get(i2).hashCode();
        }
        return m19857l() > 0 ? i + this.f16882e.hashCode() : i;
    }

    /* renamed from: j */
    public Map.Entry<K, V> m19859j(int i) {
        return this.f16881d.get(i);
    }

    /* renamed from: k */
    public int m19858k() {
        return this.f16881d.size();
    }

    /* renamed from: l */
    public int m19857l() {
        return this.f16882e.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> m19856m() {
        if (this.f16882e.isEmpty()) {
            return C7068b.m19848b();
        }
        return this.f16882e.entrySet();
    }

    /* renamed from: o */
    public boolean m19854o() {
        return this.f16883f;
    }

    /* renamed from: p */
    public void mo19850p() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f16883f) {
            return;
        }
        if (this.f16882e.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f16882e);
        }
        this.f16882e = unmodifiableMap;
        if (this.f16885x.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f16885x);
        }
        this.f16885x = unmodifiableMap2;
        this.f16883f = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k, V v) {
        m19861h();
        int m19862g = m19862g(k);
        if (m19862g >= 0) {
            return this.f16881d.get(m19862g).setValue(v);
        }
        m19860i();
        int i = -(m19862g + 1);
        if (i >= this.f16880c) {
            return m19855n().put(k, v);
        }
        int size = this.f16881d.size();
        int i2 = this.f16880c;
        if (size == i2) {
            C7066k1<K, V>.C7071c remove = this.f16881d.remove(i2 - 1);
            m19855n().put((K) remove.getKey(), remove.getValue());
        }
        this.f16881d.add(i, new C7071c(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m19861h();
        Comparable comparable = (Comparable) obj;
        int m19862g = m19862g(comparable);
        if (m19862g >= 0) {
            return (V) m19851s(m19862g);
        }
        if (this.f16882e.isEmpty()) {
            return null;
        }
        return this.f16882e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16881d.size() + this.f16882e.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: com.google.protobuf.k1$d */
    /* loaded from: classes2.dex */
    private class C7072d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c */
        private int f16891c;

        /* renamed from: d */
        private boolean f16892d;

        /* renamed from: e */
        private Iterator<Map.Entry<K, V>> f16893e;

        private C7072d() {
            this.f16891c = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m19844a() {
            if (this.f16893e == null) {
                this.f16893e = C7066k1.this.f16882e.entrySet().iterator();
            }
            return this.f16893e;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f16892d = true;
            int i = this.f16891c + 1;
            this.f16891c = i;
            if (i < C7066k1.this.f16881d.size()) {
                return (Map.Entry) C7066k1.this.f16881d.get(this.f16891c);
            }
            return m19844a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16891c + 1 >= C7066k1.this.f16881d.size()) {
                return !C7066k1.this.f16882e.isEmpty() && m19844a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f16892d) {
                this.f16892d = false;
                C7066k1.this.m19861h();
                if (this.f16891c < C7066k1.this.f16881d.size()) {
                    C7066k1 c7066k1 = C7066k1.this;
                    int i = this.f16891c;
                    this.f16891c = i - 1;
                    c7066k1.m19851s(i);
                    return;
                }
                m19844a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C7072d(C7066k1 c7066k1, C7067a c7067a) {
            this();
        }
    }

    private C7066k1(int i) {
        this.f16880c = i;
        this.f16881d = Collections.emptyList();
        this.f16882e = Collections.emptyMap();
        this.f16885x = Collections.emptyMap();
    }
}
