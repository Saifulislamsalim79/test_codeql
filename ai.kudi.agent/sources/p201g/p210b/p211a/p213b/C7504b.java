package p201g.p210b.p211a.p213b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* renamed from: g.b.a.b.b */
/* loaded from: classes2.dex */
public class C7504b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c */
    C7507c<K, V> f17839c;

    /* renamed from: d */
    private C7507c<K, V> f17840d;

    /* renamed from: e */
    private WeakHashMap<InterfaceC7510f<K, V>, Boolean> f17841e = new WeakHashMap<>();

    /* renamed from: f */
    private int f17842f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$a */
    /* loaded from: classes2.dex */
    public static class C7505a<K, V> extends AbstractC7509e<K, V> {
        C7505a(C7507c<K, V> c7507c, C7507c<K, V> c7507c2) {
            super(c7507c, c7507c2);
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.AbstractC7509e
        /* renamed from: b */
        C7507c<K, V> mo18532b(C7507c<K, V> c7507c) {
            return c7507c.f17846f;
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.AbstractC7509e
        /* renamed from: c */
        C7507c<K, V> mo18531c(C7507c<K, V> c7507c) {
            return c7507c.f17845e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$b */
    /* loaded from: classes2.dex */
    private static class C7506b<K, V> extends AbstractC7509e<K, V> {
        C7506b(C7507c<K, V> c7507c, C7507c<K, V> c7507c2) {
            super(c7507c, c7507c2);
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.AbstractC7509e
        /* renamed from: b */
        C7507c<K, V> mo18532b(C7507c<K, V> c7507c) {
            return c7507c.f17845e;
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.AbstractC7509e
        /* renamed from: c */
        C7507c<K, V> mo18531c(C7507c<K, V> c7507c) {
            return c7507c.f17846f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$c */
    /* loaded from: classes2.dex */
    public static class C7507c<K, V> implements Map.Entry<K, V> {

        /* renamed from: c */
        final K f17843c;

        /* renamed from: d */
        final V f17844d;

        /* renamed from: e */
        C7507c<K, V> f17845e;

        /* renamed from: f */
        C7507c<K, V> f17846f;

        C7507c(K k, V v) {
            this.f17843c = k;
            this.f17844d = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C7507c) {
                C7507c c7507c = (C7507c) obj;
                return this.f17843c.equals(c7507c.f17843c) && this.f17844d.equals(c7507c.f17844d);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f17843c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f17844d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f17843c.hashCode() ^ this.f17844d.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f17843c + "=" + this.f17844d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$d */
    /* loaded from: classes2.dex */
    public class C7508d implements Iterator<Map.Entry<K, V>>, InterfaceC7510f<K, V> {

        /* renamed from: c */
        private C7507c<K, V> f17847c;

        /* renamed from: d */
        private boolean f17848d = true;

        C7508d() {
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.InterfaceC7510f
        /* renamed from: a */
        public void mo18528a(C7507c<K, V> c7507c) {
            C7507c<K, V> c7507c2 = this.f17847c;
            if (c7507c == c7507c2) {
                C7507c<K, V> c7507c3 = c7507c2.f17846f;
                this.f17847c = c7507c3;
                this.f17848d = c7507c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f17848d) {
                this.f17848d = false;
                this.f17847c = C7504b.this.f17839c;
            } else {
                C7507c<K, V> c7507c = this.f17847c;
                this.f17847c = c7507c != null ? c7507c.f17845e : null;
            }
            return this.f17847c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f17848d) {
                return C7504b.this.f17839c != null;
            }
            C7507c<K, V> c7507c = this.f17847c;
            return (c7507c == null || c7507c.f17845e == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$e */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC7509e<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC7510f<K, V> {

        /* renamed from: c */
        C7507c<K, V> f17850c;

        /* renamed from: d */
        C7507c<K, V> f17851d;

        AbstractC7509e(C7507c<K, V> c7507c, C7507c<K, V> c7507c2) {
            this.f17850c = c7507c2;
            this.f17851d = c7507c;
        }

        /* renamed from: e */
        private C7507c<K, V> m18529e() {
            C7507c<K, V> c7507c = this.f17851d;
            C7507c<K, V> c7507c2 = this.f17850c;
            if (c7507c == c7507c2 || c7507c2 == null) {
                return null;
            }
            return mo18531c(c7507c);
        }

        @Override // p201g.p210b.p211a.p213b.C7504b.InterfaceC7510f
        /* renamed from: a */
        public void mo18528a(C7507c<K, V> c7507c) {
            if (this.f17850c == c7507c && c7507c == this.f17851d) {
                this.f17851d = null;
                this.f17850c = null;
            }
            C7507c<K, V> c7507c2 = this.f17850c;
            if (c7507c2 == c7507c) {
                this.f17850c = mo18532b(c7507c2);
            }
            if (this.f17851d == c7507c) {
                this.f17851d = m18529e();
            }
        }

        /* renamed from: b */
        abstract C7507c<K, V> mo18532b(C7507c<K, V> c7507c);

        /* renamed from: c */
        abstract C7507c<K, V> mo18531c(C7507c<K, V> c7507c);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C7507c<K, V> c7507c = this.f17851d;
            this.f17851d = m18529e();
            return c7507c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17851d != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: g.b.a.b.b$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC7510f<K, V> {
        /* renamed from: a */
        void mo18528a(C7507c<K, V> c7507c);
    }

    /* renamed from: d */
    public Map.Entry<K, V> m18540d() {
        return this.f17839c;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C7506b c7506b = new C7506b(this.f17840d, this.f17839c);
        this.f17841e.put(c7506b, Boolean.FALSE);
        return c7506b;
    }

    /* renamed from: e */
    protected C7507c<K, V> mo18539e(K k) {
        C7507c<K, V> c7507c = this.f17839c;
        while (c7507c != null && !c7507c.f17843c.equals(k)) {
            c7507c = c7507c.f17845e;
        }
        return c7507c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7504b) {
            C7504b c7504b = (C7504b) obj;
            if (size() != c7504b.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = c7504b.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    /* renamed from: f */
    public C7504b<K, V>.C7508d m18538f() {
        C7504b<K, V>.C7508d c7508d = new C7508d();
        this.f17841e.put(c7508d, Boolean.FALSE);
        return c7508d;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m18537h() {
        return this.f17840d;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C7505a c7505a = new C7505a(this.f17839c, this.f17840d);
        this.f17841e.put(c7505a, Boolean.FALSE);
        return c7505a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public C7507c<K, V> m18536k(K k, V v) {
        C7507c<K, V> c7507c = new C7507c<>(k, v);
        this.f17842f++;
        C7507c<K, V> c7507c2 = this.f17840d;
        if (c7507c2 == null) {
            this.f17839c = c7507c;
            this.f17840d = c7507c;
            return c7507c;
        }
        c7507c2.f17845e = c7507c;
        c7507c.f17846f = c7507c2;
        this.f17840d = c7507c;
        return c7507c;
    }

    /* renamed from: l */
    public V mo18535l(K k, V v) {
        C7507c<K, V> mo18539e = mo18539e(k);
        if (mo18539e != null) {
            return mo18539e.f17844d;
        }
        m18536k(k, v);
        return null;
    }

    /* renamed from: m */
    public V mo18534m(K k) {
        C7507c<K, V> mo18539e = mo18539e(k);
        if (mo18539e == null) {
            return null;
        }
        this.f17842f--;
        if (!this.f17841e.isEmpty()) {
            for (InterfaceC7510f<K, V> interfaceC7510f : this.f17841e.keySet()) {
                interfaceC7510f.mo18528a(mo18539e);
            }
        }
        C7507c<K, V> c7507c = mo18539e.f17846f;
        if (c7507c != null) {
            c7507c.f17845e = mo18539e.f17845e;
        } else {
            this.f17839c = mo18539e.f17845e;
        }
        C7507c<K, V> c7507c2 = mo18539e.f17845e;
        if (c7507c2 != null) {
            c7507c2.f17846f = mo18539e.f17846f;
        } else {
            this.f17840d = mo18539e.f17846f;
        }
        mo18539e.f17845e = null;
        mo18539e.f17846f = null;
        return mo18539e.f17844d;
    }

    public int size() {
        return this.f17842f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
