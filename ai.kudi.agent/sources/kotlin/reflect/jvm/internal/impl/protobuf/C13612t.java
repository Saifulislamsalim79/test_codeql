package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.C13577g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t */
/* loaded from: classes3.dex */
public class C13612t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c */
    private final int f30011c;

    /* renamed from: d */
    private List<C13612t<K, V>.C13617c> f30012d;

    /* renamed from: e */
    private Map<K, V> f30013e;

    /* renamed from: f */
    private boolean f30014f;

    /* renamed from: w */
    private volatile C13612t<K, V>.C13619e f30015w;

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$a */
    /* loaded from: classes3.dex */
    static class C13613a extends C13612t<FieldDescriptorType, Object> {
        C13613a(int i) {
            super(i, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13612t
        /* renamed from: o */
        public void mo4330o() {
            if (!m4334n()) {
                for (int i = 0; i < m4337k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> m4338j = m4338j(i);
                    if (((C13577g.InterfaceC13579b) m4338j.getKey()).mo4418f()) {
                        m4338j.setValue(Collections.unmodifiableList((List) m4338j.getValue()));
                    }
                }
                Iterator it = m4336l().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C13577g.InterfaceC13579b) entry.getKey()).mo4418f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo4330o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m4332q((C13577g.InterfaceC13579b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b */
    /* loaded from: classes3.dex */
    public static class C13614b {

        /* renamed from: a */
        private static final Iterator<Object> f30016a = new C13615a();

        /* renamed from: b */
        private static final Iterable<Object> f30017b = new C13616b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$a */
        /* loaded from: classes3.dex */
        static class C13615a implements Iterator<Object> {
            C13615a() {
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
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b */
        /* loaded from: classes3.dex */
        static class C13616b implements Iterable<Object> {
            C13616b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C13614b.f30016a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m4328b() {
            return (Iterable<T>) f30017b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$c */
    /* loaded from: classes3.dex */
    public class C13617c implements Comparable<C13612t<K, V>.C13617c>, Map.Entry<K, V> {

        /* renamed from: c */
        private final K f30018c;

        /* renamed from: d */
        private V f30019d;

        C13617c(C13612t c13612t, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m4326b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C13612t<K, V>.C13617c c13617c) {
            return getKey().compareTo(c13617c.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: e */
        public K getKey() {
            return this.f30018c;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return m4326b(this.f30018c, entry.getKey()) && m4326b(this.f30019d, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f30019d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f30018c;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f30019d;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C13612t.this.m4340h();
            V v2 = this.f30019d;
            this.f30019d = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.f30018c));
            String valueOf2 = String.valueOf(String.valueOf(this.f30019d));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        C13617c(K k, V v) {
            this.f30018c = k;
            this.f30019d = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$e */
    /* loaded from: classes3.dex */
    private class C13619e extends AbstractSet<Map.Entry<K, V>> {
        private C13619e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C13612t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C13612t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C13612t.this.m4332q(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C13618d(C13612t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C13612t.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C13612t.this.size();
        }

        /* synthetic */ C13619e(C13612t c13612t, C13613a c13613a) {
            this();
        }
    }

    /* synthetic */ C13612t(int i, C13613a c13613a) {
        this(i);
    }

    /* renamed from: g */
    private int m4341g(K k) {
        int size = this.f30012d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f30012d.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f30012d.get(i2).getKey());
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
    public void m4340h() {
        if (this.f30014f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m4339i() {
        m4340h();
        if (!this.f30012d.isEmpty() || (this.f30012d instanceof ArrayList)) {
            return;
        }
        this.f30012d = new ArrayList(this.f30011c);
    }

    /* renamed from: m */
    private SortedMap<K, V> m4335m() {
        m4340h();
        if (this.f30013e.isEmpty() && !(this.f30013e instanceof TreeMap)) {
            this.f30013e = new TreeMap();
        }
        return (SortedMap) this.f30013e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static <FieldDescriptorType extends C13577g.InterfaceC13579b<FieldDescriptorType>> C13612t<FieldDescriptorType, Object> m4333p(int i) {
        return new C13613a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public V m4331r(int i) {
        m4340h();
        V value = this.f30012d.remove(i).getValue();
        if (!this.f30013e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m4335m().entrySet().iterator();
            this.f30012d.add(new C13617c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m4340h();
        if (!this.f30012d.isEmpty()) {
            this.f30012d.clear();
        }
        if (this.f30013e.isEmpty()) {
            return;
        }
        this.f30013e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4341g(comparable) >= 0 || this.f30013e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f30015w == null) {
            this.f30015w = new C13619e(this, null);
        }
        return this.f30015w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m4341g = m4341g(comparable);
        if (m4341g >= 0) {
            return this.f30012d.get(m4341g).getValue();
        }
        return this.f30013e.get(comparable);
    }

    /* renamed from: j */
    public Map.Entry<K, V> m4338j(int i) {
        return this.f30012d.get(i);
    }

    /* renamed from: k */
    public int m4337k() {
        return this.f30012d.size();
    }

    /* renamed from: l */
    public Iterable<Map.Entry<K, V>> m4336l() {
        return this.f30013e.isEmpty() ? C13614b.m4328b() : this.f30013e.entrySet();
    }

    /* renamed from: n */
    public boolean m4334n() {
        return this.f30014f;
    }

    /* renamed from: o */
    public void mo4330o() {
        if (this.f30014f) {
            return;
        }
        this.f30013e = this.f30013e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f30013e);
        this.f30014f = true;
    }

    /* renamed from: q */
    public V m4332q(K k, V v) {
        m4340h();
        int m4341g = m4341g(k);
        if (m4341g >= 0) {
            return this.f30012d.get(m4341g).setValue(v);
        }
        m4339i();
        int i = -(m4341g + 1);
        if (i >= this.f30011c) {
            return m4335m().put(k, v);
        }
        int size = this.f30012d.size();
        int i2 = this.f30011c;
        if (size == i2) {
            C13612t<K, V>.C13617c remove = this.f30012d.remove(i2 - 1);
            m4335m().put((K) remove.getKey(), remove.getValue());
        }
        this.f30012d.add(i, new C13617c(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m4340h();
        Comparable comparable = (Comparable) obj;
        int m4341g = m4341g(comparable);
        if (m4341g >= 0) {
            return (V) m4331r(m4341g);
        }
        if (this.f30013e.isEmpty()) {
            return null;
        }
        return this.f30013e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f30012d.size() + this.f30013e.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$d */
    /* loaded from: classes3.dex */
    private class C13618d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c */
        private int f30021c;

        /* renamed from: d */
        private boolean f30022d;

        /* renamed from: e */
        private Iterator<Map.Entry<K, V>> f30023e;

        private C13618d() {
            this.f30021c = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m4324a() {
            if (this.f30023e == null) {
                this.f30023e = C13612t.this.f30013e.entrySet().iterator();
            }
            return this.f30023e;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f30022d = true;
            int i = this.f30021c + 1;
            this.f30021c = i;
            if (i < C13612t.this.f30012d.size()) {
                return (Map.Entry) C13612t.this.f30012d.get(this.f30021c);
            }
            return m4324a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30021c + 1 < C13612t.this.f30012d.size() || m4324a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f30022d) {
                this.f30022d = false;
                C13612t.this.m4340h();
                if (this.f30021c < C13612t.this.f30012d.size()) {
                    C13612t c13612t = C13612t.this;
                    int i = this.f30021c;
                    this.f30021c = i - 1;
                    c13612t.m4331r(i);
                    return;
                }
                m4324a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C13618d(C13612t c13612t, C13613a c13613a) {
            this();
        }
    }

    private C13612t(int i) {
        this.f30011c = i;
        this.f30012d = Collections.emptyList();
        this.f30013e = Collections.emptyMap();
    }
}
