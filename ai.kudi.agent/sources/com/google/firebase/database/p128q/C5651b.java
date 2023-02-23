package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.AbstractC5653c;
import com.google.firebase.database.p128q.InterfaceC5661h;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ArraySortedMap.java */
/* renamed from: com.google.firebase.database.q.b */
/* loaded from: classes2.dex */
public class C5651b<K, V> extends AbstractC5653c<K, V> {

    /* renamed from: c */
    private final K[] f13894c;

    /* renamed from: d */
    private final V[] f13895d;

    /* renamed from: e */
    private final Comparator<K> f13896e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySortedMap.java */
    /* renamed from: com.google.firebase.database.q.b$a */
    /* loaded from: classes2.dex */
    public class C5652a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c */
        int f13897c;

        /* renamed from: d */
        final /* synthetic */ int f13898d;

        /* renamed from: e */
        final /* synthetic */ boolean f13899e;

        C5652a(int i, boolean z) {
            this.f13898d = i;
            this.f13899e = z;
            this.f13897c = this.f13898d;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Object obj = C5651b.this.f13894c[this.f13897c];
            Object[] objArr = C5651b.this.f13895d;
            int i = this.f13897c;
            Object obj2 = objArr[i];
            this.f13897c = this.f13899e ? i - 1 : i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13899e) {
                if (this.f13897c >= 0) {
                    return true;
                }
            } else if (this.f13897c < C5651b.this.f13894c.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C5651b(Comparator<K> comparator) {
        this.f13894c = (K[]) new Object[0];
        this.f13895d = (V[]) new Object[0];
        this.f13896e = comparator;
    }

    /* renamed from: I */
    private static <T> T[] m24256I(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    /* renamed from: J */
    public static <A, B, C> C5651b<A, C> m24255J(List<A> list, Map<B, C> map, AbstractC5653c.C5654a.InterfaceC5655a<A, B> interfaceC5655a, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(interfaceC5655a.mo24242a(a));
            i++;
        }
        return new C5651b<>(comparator, objArr, objArr2);
    }

    /* renamed from: O */
    private int m24254O(K k) {
        int i = 0;
        for (K k2 : this.f13894c) {
            if (this.f13896e.compare(k, k2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: P */
    private int m24253P(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.f13894c;
            if (i >= kArr.length || this.f13896e.compare(kArr[i], k) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: V */
    public static <K, V> C5651b<K, V> m24252V(Map<K, V> map, Comparator<K> comparator) {
        return m24255J(new ArrayList(map.keySet()), map, AbstractC5653c.C5654a.m24244d(), comparator);
    }

    /* renamed from: X */
    private Iterator<Map.Entry<K, V>> m24251X(int i, boolean z) {
        return new C5652a(i, z);
    }

    /* renamed from: Z */
    private static <T> T[] m24250Z(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* renamed from: b0 */
    private static <T> T[] m24249b0(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: a0 */
    public Iterator<Map.Entry<K, V>> mo24209a0() {
        return m24251X(this.f13894c.length - 1, true);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: d */
    public boolean mo24208d(K k) {
        return m24254O(k) != -1;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: e */
    public V mo24207e(K k) {
        int m24254O = m24254O(k);
        if (m24254O != -1) {
            return this.f13895d[m24254O];
        }
        return null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: f */
    public Comparator<K> mo24206f() {
        return this.f13896e;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: h */
    public K mo24205h() {
        K[] kArr = this.f13894c;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    public boolean isEmpty() {
        return this.f13894c.length == 0;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return m24251X(0, false);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: k */
    public K mo24204k() {
        K[] kArr = this.f13894c;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: l */
    public K mo24203l(K k) {
        int m24254O = m24254O(k);
        if (m24254O != -1) {
            if (m24254O > 0) {
                return this.f13894c[m24254O - 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: m */
    public void mo24202m(InterfaceC5661h.AbstractC5663b<K, V> abstractC5663b) {
        int i = 0;
        while (true) {
            K[] kArr = this.f13894c;
            if (i >= kArr.length) {
                return;
            }
            abstractC5663b.mo23281a(kArr[i], this.f13895d[i]);
            i++;
        }
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: s */
    public AbstractC5653c<K, V> mo24201s(K k, V v) {
        int m24254O = m24254O(k);
        if (m24254O != -1) {
            if (this.f13894c[m24254O] == k && this.f13895d[m24254O] == v) {
                return this;
            }
            return new C5651b(this.f13896e, m24249b0(this.f13894c, m24254O, k), m24249b0(this.f13895d, m24254O, v));
        } else if (this.f13894c.length > 25) {
            HashMap hashMap = new HashMap(this.f13894c.length + 1);
            int i = 0;
            while (true) {
                K[] kArr = this.f13894c;
                if (i < kArr.length) {
                    hashMap.put(kArr[i], this.f13895d[i]);
                    i++;
                } else {
                    hashMap.put(k, v);
                    return C5666k.m24211F(hashMap, this.f13896e);
                }
            }
        } else {
            int m24253P = m24253P(k);
            return new C5651b(this.f13896e, m24256I(this.f13894c, m24253P, k), m24256I(this.f13895d, m24253P, v));
        }
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    public int size() {
        return this.f13894c.length;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5653c
    /* renamed from: u */
    public AbstractC5653c<K, V> mo24200u(K k) {
        int m24254O = m24254O(k);
        if (m24254O == -1) {
            return this;
        }
        return new C5651b(this.f13896e, m24250Z(this.f13894c, m24254O), m24250Z(this.f13895d, m24254O));
    }

    private C5651b(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f13894c = kArr;
        this.f13895d = vArr;
        this.f13896e = comparator;
    }
}
