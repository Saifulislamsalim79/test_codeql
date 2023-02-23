package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.AbstractC5653c;
import com.google.firebase.database.p128q.InterfaceC5661h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: RBTreeSortedMap.java */
/* renamed from: com.google.firebase.database.q.k */
/* loaded from: classes2.dex */
public class C5666k<K, V> extends AbstractC5653c<K, V> {

    /* renamed from: c */
    private InterfaceC5661h<K, V> f13915c;

    /* renamed from: d */
    private Comparator<K> f13916d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RBTreeSortedMap.java */
    /* renamed from: com.google.firebase.database.q.k$b */
    /* loaded from: classes2.dex */
    public static class C5668b<A, B, C> {

        /* renamed from: a */
        private final List<A> f13917a;

        /* renamed from: b */
        private final Map<B, C> f13918b;

        /* renamed from: c */
        private final AbstractC5653c.C5654a.InterfaceC5655a<A, B> f13919c;

        /* renamed from: d */
        private AbstractC5665j<A, C> f13920d;

        /* renamed from: e */
        private AbstractC5665j<A, C> f13921e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RBTreeSortedMap.java */
        /* renamed from: com.google.firebase.database.q.k$b$a */
        /* loaded from: classes2.dex */
        public static class C5669a implements Iterable<C5671b> {

            /* renamed from: c */
            private long f13922c;

            /* renamed from: d */
            private final int f13923d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RBTreeSortedMap.java */
            /* renamed from: com.google.firebase.database.q.k$b$a$a */
            /* loaded from: classes2.dex */
            public class C5670a implements Iterator<C5671b> {

                /* renamed from: c */
                private int f13924c;

                C5670a() {
                    this.f13924c = C5669a.this.f13923d - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public C5671b next() {
                    C5671b c5671b = new C5671b();
                    c5671b.f13926a = (C5669a.this.f13922c & ((long) (1 << this.f13924c))) == 0;
                    c5671b.f13927b = (int) Math.pow(2.0d, this.f13924c);
                    this.f13924c--;
                    return c5671b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f13924c >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public C5669a(int i) {
                int i2 = i + 1;
                int floor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.f13923d = floor;
                this.f13922c = (((long) Math.pow(2.0d, floor)) - 1) & i2;
            }

            @Override // java.lang.Iterable
            public Iterator<C5671b> iterator() {
                return new C5670a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RBTreeSortedMap.java */
        /* renamed from: com.google.firebase.database.q.k$b$b */
        /* loaded from: classes2.dex */
        public static class C5671b {

            /* renamed from: a */
            public boolean f13926a;

            /* renamed from: b */
            public int f13927b;

            C5671b() {
            }
        }

        private C5668b(List<A> list, Map<B, C> map, AbstractC5653c.C5654a.InterfaceC5655a<A, B> interfaceC5655a) {
            this.f13917a = list;
            this.f13918b = map;
            this.f13919c = interfaceC5655a;
        }

        /* renamed from: a */
        private InterfaceC5661h<A, C> m24199a(int i, int i2) {
            if (i2 == 0) {
                return C5660g.m24234j();
            }
            if (i2 == 1) {
                A a = this.f13917a.get(i);
                return new C5659f(a, m24196d(a), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            InterfaceC5661h<A, C> m24199a = m24199a(i, i3);
            InterfaceC5661h<A, C> m24199a2 = m24199a(i4 + 1, i3);
            A a2 = this.f13917a.get(i4);
            return new C5659f(a2, m24196d(a2), m24199a, m24199a2);
        }

        /* renamed from: b */
        public static <A, B, C> C5666k<A, C> m24198b(List<A> list, Map<B, C> map, AbstractC5653c.C5654a.InterfaceC5655a<A, B> interfaceC5655a, Comparator<A> comparator) {
            C5668b c5668b = new C5668b(list, map, interfaceC5655a);
            Collections.sort(list, comparator);
            Iterator<C5671b> it = new C5669a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C5671b next = it.next();
                int i = next.f13927b;
                size -= i;
                if (next.f13926a) {
                    c5668b.m24197c(InterfaceC5661h.EnumC5662a.BLACK, i, size);
                } else {
                    c5668b.m24197c(InterfaceC5661h.EnumC5662a.BLACK, i, size);
                    int i2 = next.f13927b;
                    size -= i2;
                    c5668b.m24197c(InterfaceC5661h.EnumC5662a.RED, i2, size);
                }
            }
            InterfaceC5661h interfaceC5661h = c5668b.f13920d;
            if (interfaceC5661h == null) {
                interfaceC5661h = C5660g.m24234j();
            }
            return new C5666k<>(interfaceC5661h, comparator);
        }

        /* renamed from: c */
        private void m24197c(InterfaceC5661h.EnumC5662a enumC5662a, int i, int i2) {
            AbstractC5665j<A, C> c5659f;
            InterfaceC5661h<A, C> m24199a = m24199a(i2 + 1, i - 1);
            A a = this.f13917a.get(i2);
            if (enumC5662a == InterfaceC5661h.EnumC5662a.RED) {
                c5659f = new C5664i<>(a, m24196d(a), null, m24199a);
            } else {
                c5659f = new C5659f<>(a, m24196d(a), null, m24199a);
            }
            if (this.f13920d == null) {
                this.f13920d = c5659f;
                this.f13921e = c5659f;
                return;
            }
            this.f13921e.mo24213u(c5659f);
            this.f13921e = c5659f;
        }

        /* renamed from: d */
        private C m24196d(A a) {
            return this.f13918b.get(this.f13919c.mo24242a(a));
        }
    }

    /* renamed from: E */
    public static <A, B, C> C5666k<A, C> m24212E(List<A> list, Map<B, C> map, AbstractC5653c.C5654a.InterfaceC5655a<A, B> interfaceC5655a, Comparator<A> comparator) {
        return C5668b.m24198b(list, map, interfaceC5655a, comparator);
    }

    /* renamed from: F */
    public static <A, B> C5666k<A, B> m24211F(Map<A, B> map, Comparator<A> comparator) {
        return C5668b.m24198b(new ArrayList(map.keySet()), map, AbstractC5653c.C5654a.m24244d(), comparator);
    }

    /* renamed from: I */
    private InterfaceC5661h<K, V> m24210I(K k) {
        InterfaceC5661h<K, V> interfaceC5661h = this.f13915c;
        while (!interfaceC5661h.isEmpty()) {
            int compare = this.f13916d.compare(k, interfaceC5661h.getKey());
            if (compare < 0) {
                interfaceC5661h = interfaceC5661h.mo24232a();
            } else if (compare == 0) {
                return interfaceC5661h;
            } else {
                interfaceC5661h = interfaceC5661h.mo24228f();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: a0 */
    public Iterator<Map.Entry<K, V>> mo24209a0() {
        return new C5656d(this.f13915c, null, this.f13916d, true);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: d */
    public boolean mo24208d(K k) {
        return m24210I(k) != null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: e */
    public V mo24207e(K k) {
        InterfaceC5661h<K, V> m24210I = m24210I(k);
        if (m24210I != null) {
            return m24210I.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: f */
    public Comparator<K> mo24206f() {
        return this.f13916d;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: h */
    public K mo24205h() {
        return this.f13915c.mo24225i().getKey();
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    public boolean isEmpty() {
        return this.f13915c.isEmpty();
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C5656d(this.f13915c, null, this.f13916d, false);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: k */
    public K mo24204k() {
        return this.f13915c.mo24226h().getKey();
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: l */
    public K mo24203l(K k) {
        InterfaceC5661h<K, V> interfaceC5661h = this.f13915c;
        InterfaceC5661h<K, V> interfaceC5661h2 = null;
        while (!interfaceC5661h.isEmpty()) {
            int compare = this.f13916d.compare(k, interfaceC5661h.getKey());
            if (compare == 0) {
                if (interfaceC5661h.mo24232a().isEmpty()) {
                    if (interfaceC5661h2 != null) {
                        return interfaceC5661h2.getKey();
                    }
                    return null;
                }
                InterfaceC5661h<K, V> mo24232a = interfaceC5661h.mo24232a();
                while (!mo24232a.mo24228f().isEmpty()) {
                    mo24232a = mo24232a.mo24228f();
                }
                return mo24232a.getKey();
            } else if (compare < 0) {
                interfaceC5661h = interfaceC5661h.mo24232a();
            } else {
                interfaceC5661h2 = interfaceC5661h;
                interfaceC5661h = interfaceC5661h.mo24228f();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + k);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: m */
    public void mo24202m(InterfaceC5661h.AbstractC5663b<K, V> abstractC5663b) {
        this.f13915c.mo24229d(abstractC5663b);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: s */
    public AbstractC5653c<K, V> mo24201s(K k, V v) {
        return new C5666k(this.f13915c.mo24231b(k, v, this.f13916d).mo24227g(null, null, InterfaceC5661h.EnumC5662a.BLACK, null, null), this.f13916d);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    public int size() {
        return this.f13915c.size();
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: u */
    public AbstractC5653c<K, V> mo24200u(K k) {
        return !mo24208d(k) ? this : new C5666k(this.f13915c.mo24230c(k, this.f13916d).mo24227g(null, null, InterfaceC5661h.EnumC5662a.BLACK, null, null), this.f13916d);
    }

    private C5666k(InterfaceC5661h<K, V> interfaceC5661h, Comparator<K> comparator) {
        this.f13915c = interfaceC5661h;
        this.f13916d = comparator;
    }
}
