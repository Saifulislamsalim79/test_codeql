package com.google.common.collect;

import com.google.common.base.AbstractC5035e;
import com.google.common.base.C5051n;
import com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m;
import com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p272h.p286c.p348b.p350b.C9362a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapMakerInternalMap.java */
/* renamed from: com.google.common.collect.o */
/* loaded from: classes2.dex */
public class ConcurrentMapC5084o<K, V, E extends InterfaceC5094h<K, V, E>, S extends AbstractC5099m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: B */
    static final InterfaceC5118z<Object, Object, C5090d> f12735B = new C5085a();

    /* renamed from: A */
    transient Set<Map.Entry<K, V>> f12736A;

    /* renamed from: c */
    final transient int f12737c;

    /* renamed from: d */
    final transient int f12738d;

    /* renamed from: e */
    final transient AbstractC5099m<K, V, E, S>[] f12739e;

    /* renamed from: f */
    final int f12740f;

    /* renamed from: w */
    final AbstractC5035e<Object> f12741w;

    /* renamed from: x */
    final transient InterfaceC5095i<K, V, E, S> f12742x;

    /* renamed from: y */
    transient Set<K> f12743y;

    /* renamed from: z */
    transient Collection<V> f12744z;

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$a */
    /* loaded from: classes2.dex */
    class C5085a implements InterfaceC5118z<Object, Object, C5090d> {
        C5085a() {
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC5118z<Object, Object, C5090d> mo25591b(ReferenceQueue<Object> referenceQueue, C5090d c5090d) {
            m25679c(referenceQueue, c5090d);
            return this;
        }

        /* renamed from: c */
        public InterfaceC5118z<Object, Object, C5090d> m25679c(ReferenceQueue<Object> referenceQueue, C5090d c5090d) {
            return this;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        public void clear() {
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        /* renamed from: d */
        public C5090d mo25592a() {
            return null;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        public Object get() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$a0 */
    /* loaded from: classes2.dex */
    public static final class C5086a0<K, V, E extends InterfaceC5094h<K, V, E>> extends WeakReference<V> implements InterfaceC5118z<K, V, E> {

        /* renamed from: a */
        final E f12745a;

        C5086a0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f12745a = e;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        /* renamed from: a */
        public E mo25592a() {
            return this.f12745a;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5118z
        /* renamed from: b */
        public InterfaceC5118z<K, V, E> mo25591b(ReferenceQueue<V> referenceQueue, E e) {
            return new C5086a0(referenceQueue, get(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5087b<K, V, E extends InterfaceC5094h<K, V, E>> implements InterfaceC5094h<K, V, E> {

        /* renamed from: a */
        final K f12746a;

        /* renamed from: b */
        final int f12747b;

        /* renamed from: c */
        final E f12748c;

        AbstractC5087b(K k, int i, E e) {
            this.f12746a = k;
            this.f12747b = i;
            this.f12748c = e;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public K getKey() {
            return this.f12746a;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: t */
        public int mo25670t() {
            return this.f12747b;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: u */
        public E mo25669u() {
            return this.f12748c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$b0 */
    /* loaded from: classes2.dex */
    public final class C5088b0 extends AbstractC5065b<K, V> {

        /* renamed from: c */
        final K f12749c;

        /* renamed from: d */
        V f12750d;

        C5088b0(K k, V v) {
            this.f12749c = k;
            this.f12750d = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f12749c.equals(entry.getKey()) && this.f12750d.equals(entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC5065b, java.util.Map.Entry
        public K getKey() {
            return this.f12749c;
        }

        @Override // com.google.common.collect.AbstractC5065b, java.util.Map.Entry
        public V getValue() {
            return this.f12750d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f12749c.hashCode() ^ this.f12750d.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) ConcurrentMapC5084o.this.put(this.f12749c, v);
            this.f12750d = v;
            return v2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5089c<K, V, E extends InterfaceC5094h<K, V, E>> extends WeakReference<K> implements InterfaceC5094h<K, V, E> {

        /* renamed from: a */
        final int f12752a;

        /* renamed from: b */
        final E f12753b;

        AbstractC5089c(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f12752a = i;
            this.f12753b = e;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: t */
        public int mo25670t() {
            return this.f12752a;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: u */
        public E mo25669u() {
            return this.f12753b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$d */
    /* loaded from: classes2.dex */
    public static final class C5090d implements InterfaceC5094h<Object, Object, C5090d> {
        private C5090d() {
            throw new AssertionError();
        }

        /* renamed from: b */
        public C5090d m25677b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: t */
        public int mo25670t() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        /* renamed from: u */
        public /* bridge */ /* synthetic */ C5090d mo25669u() {
            m25677b();
            throw null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$e */
    /* loaded from: classes2.dex */
    final class C5091e extends ConcurrentMapC5084o<K, V, E, S>.AbstractC5093g<Map.Entry<K, V>> {
        C5091e(ConcurrentMapC5084o concurrentMapC5084o) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry<K, V> next() {
            return m25673c();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$f */
    /* loaded from: classes2.dex */
    final class C5092f extends AbstractC5098l<Map.Entry<K, V>> {
        C5092f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentMapC5084o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = ConcurrentMapC5084o.this.get(key)) != null && ConcurrentMapC5084o.this.m25680o().m25827d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentMapC5084o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5091e(ConcurrentMapC5084o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && ConcurrentMapC5084o.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentMapC5084o.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$g */
    /* loaded from: classes2.dex */
    public abstract class AbstractC5093g<T> implements Iterator<T> {

        /* renamed from: c */
        int f12755c;

        /* renamed from: d */
        int f12756d = -1;

        /* renamed from: e */
        AbstractC5099m<K, V, E, S> f12757e;

        /* renamed from: f */
        AtomicReferenceArray<E> f12758f;

        /* renamed from: w */
        E f12759w;

        /* renamed from: x */
        ConcurrentMapC5084o<K, V, E, S>.C5088b0 f12760x;

        /* renamed from: y */
        ConcurrentMapC5084o<K, V, E, S>.C5088b0 f12761y;

        AbstractC5093g() {
            this.f12755c = ConcurrentMapC5084o.this.f12739e.length - 1;
            m25675a();
        }

        /* renamed from: a */
        final void m25675a() {
            this.f12760x = null;
            if (m25672d() || m25671e()) {
                return;
            }
            while (true) {
                int i = this.f12755c;
                if (i < 0) {
                    return;
                }
                AbstractC5099m<K, V, E, S>[] abstractC5099mArr = ConcurrentMapC5084o.this.f12739e;
                this.f12755c = i - 1;
                AbstractC5099m<K, V, E, S> abstractC5099m = abstractC5099mArr[i];
                this.f12757e = abstractC5099m;
                if (abstractC5099m.f12765d != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f12757e.f12768w;
                    this.f12758f = atomicReferenceArray;
                    this.f12756d = atomicReferenceArray.length() - 1;
                    if (m25671e()) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m25674b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object m25689e = ConcurrentMapC5084o.this.m25689e(e);
                if (m25689e != null) {
                    this.f12760x = new C5088b0(key, m25689e);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f12757e.m25648r();
            }
        }

        /* renamed from: c */
        ConcurrentMapC5084o<K, V, E, S>.C5088b0 m25673c() {
            ConcurrentMapC5084o<K, V, E, S>.C5088b0 c5088b0 = this.f12760x;
            if (c5088b0 != null) {
                this.f12761y = c5088b0;
                m25675a();
                return this.f12761y;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        boolean m25672d() {
            E e = this.f12759w;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f12759w = (E) e.mo25669u();
                E e2 = this.f12759w;
                if (e2 == null) {
                    return false;
                }
                if (m25674b(e2)) {
                    return true;
                }
                e = this.f12759w;
            }
        }

        /* renamed from: e */
        boolean m25671e() {
            while (true) {
                int i = this.f12756d;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f12758f;
                this.f12756d = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f12759w = e;
                if (e != null && (m25674b(e) || m25672d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12760x != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C5068d.m25744c(this.f12761y != null);
            ConcurrentMapC5084o.this.remove(this.f12761y.getKey());
            this.f12761y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$h */
    /* loaded from: classes2.dex */
    public interface InterfaceC5094h<K, V, E extends InterfaceC5094h<K, V, E>> {
        K getKey();

        V getValue();

        /* renamed from: t */
        int mo25670t();

        /* renamed from: u */
        E mo25669u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC5095i<K, V, E extends InterfaceC5094h<K, V, E>, S extends AbstractC5099m<K, V, E, S>> {
        /* renamed from: a */
        E mo25609a(S s, E e, E e2);

        /* renamed from: b */
        EnumC5100n mo25608b();

        /* renamed from: c */
        void mo25607c(S s, E e, V v);

        /* renamed from: d */
        S mo25606d(ConcurrentMapC5084o<K, V, E, S> concurrentMapC5084o, int i, int i2);

        /* renamed from: e */
        E mo25605e(S s, K k, int i, E e);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$j */
    /* loaded from: classes2.dex */
    final class C5096j extends ConcurrentMapC5084o<K, V, E, S>.AbstractC5093g<K> {
        C5096j(ConcurrentMapC5084o concurrentMapC5084o) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m25673c().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$k */
    /* loaded from: classes2.dex */
    final class C5097k extends AbstractC5098l<K> {
        C5097k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentMapC5084o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ConcurrentMapC5084o.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentMapC5084o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C5096j(ConcurrentMapC5084o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return ConcurrentMapC5084o.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentMapC5084o.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$l */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5098l<E> extends AbstractSet<E> {
        private AbstractC5098l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return ConcurrentMapC5084o.m25682m(this).toArray();
        }

        /* synthetic */ AbstractC5098l(C5085a c5085a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC5084o.m25682m(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$m */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5099m<K, V, E extends InterfaceC5094h<K, V, E>, S extends AbstractC5099m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: c */
        final ConcurrentMapC5084o<K, V, E, S> f12764c;

        /* renamed from: d */
        volatile int f12765d;

        /* renamed from: e */
        int f12766e;

        /* renamed from: f */
        int f12767f;

        /* renamed from: w */
        volatile AtomicReferenceArray<E> f12768w;

        /* renamed from: x */
        final int f12769x;

        /* renamed from: y */
        final AtomicInteger f12770y = new AtomicInteger();

        AbstractC5099m(ConcurrentMapC5084o<K, V, E, S> concurrentMapC5084o, int i, int i2) {
            this.f12764c = concurrentMapC5084o;
            this.f12769x = i2;
            m25651m(m25649q(i));
        }

        /* renamed from: n */
        static <K, V, E extends InterfaceC5094h<K, V, E>> boolean m25650n(E e) {
            return e.getValue() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: A */
        boolean m25668A(K k, int i, V v, V v2) {
            lock();
            try {
                m25647s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    Object key = interfaceC5094h.getKey();
                    if (interfaceC5094h.mo25670t() == i && key != null && this.f12764c.f12741w.m25827d(k, key)) {
                        Object value = interfaceC5094h.getValue();
                        if (value == null) {
                            if (m25650n(interfaceC5094h)) {
                                this.f12766e++;
                                atomicReferenceArray.set(length, m25641y(e, interfaceC5094h));
                                this.f12765d--;
                            }
                            return false;
                        } else if (this.f12764c.m25680o().m25827d(v, value)) {
                            this.f12766e++;
                            m25665E(interfaceC5094h, v2);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: B */
        void m25667B() {
            m25666C();
        }

        /* renamed from: C */
        void m25666C() {
            if (tryLock()) {
                try {
                    mo25594p();
                    this.f12770y.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: D */
        abstract S mo25599D();

        /* renamed from: E */
        void m25665E(E e, V v) {
            this.f12764c.f12742x.mo25607c(mo25599D(), e, v);
        }

        /* renamed from: F */
        void m25664F() {
            if (tryLock()) {
                try {
                    mo25594p();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        void m25663a() {
            if (this.f12765d != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo25595o();
                    this.f12770y.set(0);
                    this.f12766e++;
                    this.f12765d = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        <T> void m25662b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* renamed from: c */
        boolean m25661c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f12765d != 0) {
                    E m25653k = m25653k(obj, i);
                    if (m25653k != null) {
                        if (m25653k.getValue() != null) {
                            z = true;
                        }
                    }
                    return z;
                }
                return false;
            } finally {
                m25648r();
            }
        }

        /* renamed from: d */
        E m25660d(E e, E e2) {
            return this.f12764c.f12742x.mo25609a(mo25599D(), e, e2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        void m25659e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f12764c.m25686i((InterfaceC5094h) poll);
                i++;
            } while (i != 16);
        }

        /* renamed from: f */
        void m25658f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f12764c.m25685j((InterfaceC5118z) poll);
                i++;
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        void m25657g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f12765d;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) m25649q(length << 1);
            this.f12767f = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    InterfaceC5094h mo25669u = e.mo25669u();
                    int mo25670t = e.mo25670t() & length2;
                    if (mo25669u == null) {
                        atomicReferenceArray2.set(mo25670t, e);
                    } else {
                        InterfaceC5094h interfaceC5094h = e;
                        while (mo25669u != null) {
                            int mo25670t2 = mo25669u.mo25670t() & length2;
                            if (mo25670t2 != mo25670t) {
                                interfaceC5094h = mo25669u;
                                mo25670t = mo25670t2;
                            }
                            mo25669u = mo25669u.mo25669u();
                        }
                        atomicReferenceArray2.set(mo25670t, interfaceC5094h);
                        while (e != interfaceC5094h) {
                            int mo25670t3 = e.mo25670t() & length2;
                            InterfaceC5094h m25660d = m25660d(e, (InterfaceC5094h) atomicReferenceArray2.get(mo25670t3));
                            if (m25660d != null) {
                                atomicReferenceArray2.set(mo25670t3, m25660d);
                            } else {
                                i--;
                            }
                            e = e.mo25669u();
                        }
                    }
                }
            }
            this.f12768w = atomicReferenceArray2;
            this.f12765d = i;
        }

        /* renamed from: h */
        V m25656h(Object obj, int i) {
            try {
                E m25653k = m25653k(obj, i);
                if (m25653k == null) {
                    return null;
                }
                V v = (V) m25653k.getValue();
                if (v == null) {
                    m25664F();
                }
                return v;
            } finally {
                m25648r();
            }
        }

        /* renamed from: i */
        E m25655i(Object obj, int i) {
            if (this.f12765d != 0) {
                for (E m25654j = m25654j(i); m25654j != null; m25654j = (E) m25654j.mo25669u()) {
                    if (m25654j.mo25670t() == i) {
                        Object key = m25654j.getKey();
                        if (key == null) {
                            m25664F();
                        } else if (this.f12764c.f12741w.m25827d(obj, key)) {
                            return m25654j;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: j */
        E m25654j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: k */
        E m25653k(Object obj, int i) {
            return m25655i(obj, i);
        }

        /* renamed from: l */
        V m25652l(E e) {
            if (e.getKey() == null) {
                m25664F();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                m25664F();
                return null;
            }
            return v;
        }

        /* renamed from: m */
        void m25651m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f12767f = length;
            if (length == this.f12769x) {
                this.f12767f = length + 1;
            }
            this.f12768w = atomicReferenceArray;
        }

        /* renamed from: o */
        void mo25595o() {
        }

        /* renamed from: p */
        void mo25594p() {
        }

        /* renamed from: q */
        AtomicReferenceArray<E> m25649q(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: r */
        void m25648r() {
            if ((this.f12770y.incrementAndGet() & 63) == 0) {
                m25667B();
            }
        }

        /* renamed from: s */
        void m25647s() {
            m25666C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: t */
        V m25646t(K k, int i, V v, boolean z) {
            lock();
            try {
                m25647s();
                int i2 = this.f12765d + 1;
                if (i2 > this.f12767f) {
                    m25657g();
                    i2 = this.f12765d + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    Object key = interfaceC5094h.getKey();
                    if (interfaceC5094h.mo25670t() == i && key != null && this.f12764c.f12741w.m25827d(k, key)) {
                        V v2 = (V) interfaceC5094h.getValue();
                        if (v2 == null) {
                            this.f12766e++;
                            m25665E(interfaceC5094h, v);
                            this.f12765d = this.f12765d;
                            return null;
                        } else if (z) {
                            return v2;
                        } else {
                            this.f12766e++;
                            m25665E(interfaceC5094h, v);
                            return v2;
                        }
                    }
                }
                this.f12766e++;
                E mo25605e = this.f12764c.f12742x.mo25605e(mo25599D(), k, i, e);
                m25665E(mo25605e, v);
                atomicReferenceArray.set(length, mo25605e);
                this.f12765d = i2;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        boolean m25645u(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e2; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    if (interfaceC5094h == e) {
                        this.f12766e++;
                        atomicReferenceArray.set(length, m25641y(e2, interfaceC5094h));
                        this.f12765d--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: v */
        boolean m25644v(K k, int i, InterfaceC5118z<K, V, E> interfaceC5118z) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    Object key = interfaceC5094h.getKey();
                    if (interfaceC5094h.mo25670t() == i && key != null && this.f12764c.f12741w.m25827d(k, key)) {
                        if (((InterfaceC5117y) interfaceC5094h).mo25593a() == interfaceC5118z) {
                            this.f12766e++;
                            atomicReferenceArray.set(length, m25641y(e, interfaceC5094h));
                            this.f12765d--;
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: w */
        V m25643w(Object obj, int i) {
            lock();
            try {
                m25647s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    Object key = interfaceC5094h.getKey();
                    if (interfaceC5094h.mo25670t() == i && key != null && this.f12764c.f12741w.m25827d(obj, key)) {
                        V v = (V) interfaceC5094h.getValue();
                        if (v == null && !m25650n(interfaceC5094h)) {
                            return null;
                        }
                        this.f12766e++;
                        atomicReferenceArray.set(length, m25641y(e, interfaceC5094h));
                        this.f12765d--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.f12764c.m25680o().m25827d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (m25650n(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.f12766e++;
            r0.set(r1, m25641y(r3, r4));
            r8.f12765d--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean m25642x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.m25647s()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.o$h<K, V, E>> r0 = r8.f12768w     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o$h r3 = (com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.mo25670t()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.o<K, V, E extends com.google.common.collect.o$h<K, V, E>, S extends com.google.common.collect.o$m<K, V, E, S>> r7 = r8.f12764c     // Catch: java.lang.Throwable -> L69
                com.google.common.base.e<java.lang.Object> r7 = r7.f12741w     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.m25827d(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o<K, V, E extends com.google.common.collect.o$h<K, V, E>, S extends com.google.common.collect.o$m<K, V, E, S>> r10 = r8.f12764c     // Catch: java.lang.Throwable -> L69
                com.google.common.base.e r10 = r10.m25680o()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.m25827d(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = 1
                goto L47
            L41:
                boolean r9 = m25650n(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.f12766e     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.f12766e = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o$h r9 = r8.m25641y(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.f12765d     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.f12765d = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.o$h r4 = r4.mo25669u()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                goto L6f
            L6e:
                throw r9
            L6f:
                goto L6e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m.m25642x(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* renamed from: y */
        E m25641y(E e, E e2) {
            int i = this.f12765d;
            E e3 = (E) e2.mo25669u();
            while (e != e2) {
                E m25660d = m25660d(e, e3);
                if (m25660d != null) {
                    e3 = m25660d;
                } else {
                    i--;
                }
                e = (E) e.mo25669u();
            }
            this.f12765d = i;
            return e3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        V m25640z(K k, int i, V v) {
            lock();
            try {
                m25647s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f12768w;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC5094h interfaceC5094h = e; interfaceC5094h != null; interfaceC5094h = interfaceC5094h.mo25669u()) {
                    Object key = interfaceC5094h.getKey();
                    if (interfaceC5094h.mo25670t() == i && key != null && this.f12764c.f12741w.m25827d(k, key)) {
                        V v2 = (V) interfaceC5094h.getValue();
                        if (v2 == null) {
                            if (m25650n(interfaceC5094h)) {
                                this.f12766e++;
                                atomicReferenceArray.set(length, m25641y(e, interfaceC5094h));
                                this.f12765d--;
                            }
                            return null;
                        }
                        this.f12766e++;
                        m25665E(interfaceC5094h, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$n */
    /* loaded from: classes2.dex */
    public static abstract class EnumC5100n {

        /* renamed from: c */
        public static final EnumC5100n f12771c = new C5101a("STRONG", 0);

        /* renamed from: d */
        public static final EnumC5100n f12772d = new C5102b("WEAK", 1);

        /* renamed from: e */
        private static final /* synthetic */ EnumC5100n[] f12773e = m25639a();

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$n$a */
        /* loaded from: classes2.dex */
        enum C5101a extends EnumC5100n {
            C5101a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.EnumC5100n
            /* renamed from: b */
            AbstractC5035e<Object> mo25638b() {
                return AbstractC5035e.m25828c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$n$b */
        /* loaded from: classes2.dex */
        enum C5102b extends EnumC5100n {
            C5102b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.EnumC5100n
            /* renamed from: b */
            AbstractC5035e<Object> mo25638b() {
                return AbstractC5035e.m25825f();
            }
        }

        private EnumC5100n(String str, int i) {
        }

        /* renamed from: a */
        private static /* synthetic */ EnumC5100n[] m25639a() {
            return new EnumC5100n[]{f12771c, f12772d};
        }

        public static EnumC5100n valueOf(String str) {
            return (EnumC5100n) Enum.valueOf(EnumC5100n.class, str);
        }

        public static EnumC5100n[] values() {
            return (EnumC5100n[]) f12773e.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC5035e<Object> mo25638b();

        /* synthetic */ EnumC5100n(String str, int i, C5085a c5085a) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$o */
    /* loaded from: classes2.dex */
    public static final class C5103o<K, V> extends AbstractC5087b<K, V, C5103o<K, V>> implements Object<K, V, C5103o<K, V>> {

        /* renamed from: d */
        private volatile V f12774d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$o$a */
        /* loaded from: classes2.dex */
        public static final class C5104a<K, V> implements InterfaceC5095i<K, V, C5103o<K, V>, C5105p<K, V>> {

            /* renamed from: a */
            private static final C5104a<?, ?> f12775a = new C5104a<>();

            C5104a() {
            }

            /* renamed from: g */
            static <K, V> C5104a<K, V> m25634g() {
                return (C5104a<K, V>) f12775a;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: b */
            public EnumC5100n mo25608b() {
                return EnumC5100n.f12771c;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: f */
            public C5103o<K, V> mo25609a(C5105p<K, V> c5105p, C5103o<K, V> c5103o, C5103o<K, V> c5103o2) {
                return c5103o.m25637b(c5103o2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: h */
            public C5103o<K, V> mo25605e(C5105p<K, V> c5105p, K k, int i, C5103o<K, V> c5103o) {
                return new C5103o<>(k, i, c5103o);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: i */
            public C5105p<K, V> mo25606d(ConcurrentMapC5084o<K, V, C5103o<K, V>, C5105p<K, V>> concurrentMapC5084o, int i, int i2) {
                return new C5105p<>(concurrentMapC5084o, i, i2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: j */
            public void mo25607c(C5105p<K, V> c5105p, C5103o<K, V> c5103o, V v) {
                c5103o.m25636c(v);
            }
        }

        C5103o(K k, int i, C5103o<K, V> c5103o) {
            super(k, i, c5103o);
            this.f12774d = null;
        }

        /* renamed from: b */
        C5103o<K, V> m25637b(C5103o<K, V> c5103o) {
            C5103o<K, V> c5103o2 = new C5103o<>(this.f12746a, this.f12747b, c5103o);
            c5103o2.f12774d = this.f12774d;
            return c5103o2;
        }

        /* renamed from: c */
        void m25636c(V v) {
            this.f12774d = v;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public V getValue() {
            return this.f12774d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$p */
    /* loaded from: classes2.dex */
    public static final class C5105p<K, V> extends AbstractC5099m<K, V, C5103o<K, V>, C5105p<K, V>> {
        C5105p(ConcurrentMapC5084o<K, V, C5103o<K, V>, C5105p<K, V>> concurrentMapC5084o, int i, int i2) {
            super(concurrentMapC5084o, i, i2);
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: D */
        /* bridge */ /* synthetic */ AbstractC5099m mo25599D() {
            m25630G();
            return this;
        }

        /* renamed from: G */
        C5105p<K, V> m25630G() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$q */
    /* loaded from: classes2.dex */
    public static final class C5106q<K, V> extends AbstractC5087b<K, V, C5106q<K, V>> implements InterfaceC5117y<K, V, C5106q<K, V>> {

        /* renamed from: d */
        private volatile InterfaceC5118z<K, V, C5106q<K, V>> f12776d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$q$a */
        /* loaded from: classes2.dex */
        public static final class C5107a<K, V> implements InterfaceC5095i<K, V, C5106q<K, V>, C5108r<K, V>> {

            /* renamed from: a */
            private static final C5107a<?, ?> f12777a = new C5107a<>();

            C5107a() {
            }

            /* renamed from: g */
            static <K, V> C5107a<K, V> m25626g() {
                return (C5107a<K, V>) f12777a;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: b */
            public EnumC5100n mo25608b() {
                return EnumC5100n.f12772d;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: f */
            public C5106q<K, V> mo25609a(C5108r<K, V> c5108r, C5106q<K, V> c5106q, C5106q<K, V> c5106q2) {
                if (AbstractC5099m.m25650n(c5106q)) {
                    return null;
                }
                return c5106q.m25629b(((C5108r) c5108r).f12778z, c5106q2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: h */
            public C5106q<K, V> mo25605e(C5108r<K, V> c5108r, K k, int i, C5106q<K, V> c5106q) {
                return new C5106q<>(k, i, c5106q);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: i */
            public C5108r<K, V> mo25606d(ConcurrentMapC5084o<K, V, C5106q<K, V>, C5108r<K, V>> concurrentMapC5084o, int i, int i2) {
                return new C5108r<>(concurrentMapC5084o, i, i2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: j */
            public void mo25607c(C5108r<K, V> c5108r, C5106q<K, V> c5106q, V v) {
                c5106q.m25628c(v, ((C5108r) c5108r).f12778z);
            }
        }

        C5106q(K k, int i, C5106q<K, V> c5106q) {
            super(k, i, c5106q);
            this.f12776d = ConcurrentMapC5084o.m25681n();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5117y
        /* renamed from: a */
        public InterfaceC5118z<K, V, C5106q<K, V>> mo25593a() {
            return this.f12776d;
        }

        /* renamed from: b */
        C5106q<K, V> m25629b(ReferenceQueue<V> referenceQueue, C5106q<K, V> c5106q) {
            C5106q<K, V> c5106q2 = new C5106q<>(this.f12746a, this.f12747b, c5106q);
            c5106q2.f12776d = this.f12776d.mo25591b(referenceQueue, c5106q2);
            return c5106q2;
        }

        /* renamed from: c */
        void m25628c(V v, ReferenceQueue<V> referenceQueue) {
            InterfaceC5118z<K, V, C5106q<K, V>> interfaceC5118z = this.f12776d;
            this.f12776d = new C5086a0(referenceQueue, v, this);
            interfaceC5118z.clear();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public V getValue() {
            return this.f12776d.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$r */
    /* loaded from: classes2.dex */
    public static final class C5108r<K, V> extends AbstractC5099m<K, V, C5106q<K, V>, C5108r<K, V>> {

        /* renamed from: z */
        private final ReferenceQueue<V> f12778z;

        C5108r(ConcurrentMapC5084o<K, V, C5106q<K, V>, C5108r<K, V>> concurrentMapC5084o, int i, int i2) {
            super(concurrentMapC5084o, i, i2);
            this.f12778z = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: D */
        /* bridge */ /* synthetic */ AbstractC5099m mo25599D() {
            m25621H();
            return this;
        }

        /* renamed from: H */
        C5108r<K, V> m25621H() {
            return this;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: o */
        void mo25595o() {
            m25662b((ReferenceQueue<V>) this.f12778z);
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: p */
        void mo25594p() {
            m25658f(this.f12778z);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$s */
    /* loaded from: classes2.dex */
    final class C5109s extends ConcurrentMapC5084o<K, V, E, S>.AbstractC5093g<V> {
        C5109s(ConcurrentMapC5084o concurrentMapC5084o) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m25673c().getValue();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$t */
    /* loaded from: classes2.dex */
    final class C5110t extends AbstractCollection<V> {
        C5110t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ConcurrentMapC5084o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ConcurrentMapC5084o.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return ConcurrentMapC5084o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C5109s(ConcurrentMapC5084o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ConcurrentMapC5084o.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return ConcurrentMapC5084o.m25682m(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC5084o.m25682m(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$u */
    /* loaded from: classes2.dex */
    public static final class C5111u<K, V> extends AbstractC5089c<K, V, C5111u<K, V>> implements Object<K, V, C5111u<K, V>> {

        /* renamed from: c */
        private volatile V f12780c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$u$a */
        /* loaded from: classes2.dex */
        public static final class C5112a<K, V> implements InterfaceC5095i<K, V, C5111u<K, V>, C5113v<K, V>> {

            /* renamed from: a */
            private static final C5112a<?, ?> f12781a = new C5112a<>();

            C5112a() {
            }

            /* renamed from: g */
            static <K, V> C5112a<K, V> m25617g() {
                return (C5112a<K, V>) f12781a;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: b */
            public EnumC5100n mo25608b() {
                return EnumC5100n.f12771c;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: f */
            public C5111u<K, V> mo25609a(C5113v<K, V> c5113v, C5111u<K, V> c5111u, C5111u<K, V> c5111u2) {
                if (c5111u.getKey() == null) {
                    return null;
                }
                return c5111u.m25620b(((C5113v) c5113v).f12782z, c5111u2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: h */
            public C5111u<K, V> mo25605e(C5113v<K, V> c5113v, K k, int i, C5111u<K, V> c5111u) {
                return new C5111u<>(((C5113v) c5113v).f12782z, k, i, c5111u);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: i */
            public C5113v<K, V> mo25606d(ConcurrentMapC5084o<K, V, C5111u<K, V>, C5113v<K, V>> concurrentMapC5084o, int i, int i2) {
                return new C5113v<>(concurrentMapC5084o, i, i2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: j */
            public void mo25607c(C5113v<K, V> c5113v, C5111u<K, V> c5111u, V v) {
                c5111u.m25619c(v);
            }
        }

        C5111u(ReferenceQueue<K> referenceQueue, K k, int i, C5111u<K, V> c5111u) {
            super(referenceQueue, k, i, c5111u);
            this.f12780c = null;
        }

        /* renamed from: b */
        C5111u<K, V> m25620b(ReferenceQueue<K> referenceQueue, C5111u<K, V> c5111u) {
            C5111u<K, V> c5111u2 = new C5111u<>(referenceQueue, getKey(), this.f12752a, c5111u);
            c5111u2.m25619c(this.f12780c);
            return c5111u2;
        }

        /* renamed from: c */
        void m25619c(V v) {
            this.f12780c = v;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public V getValue() {
            return this.f12780c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$v */
    /* loaded from: classes2.dex */
    public static final class C5113v<K, V> extends AbstractC5099m<K, V, C5111u<K, V>, C5113v<K, V>> {

        /* renamed from: z */
        private final ReferenceQueue<K> f12782z;

        C5113v(ConcurrentMapC5084o<K, V, C5111u<K, V>, C5113v<K, V>> concurrentMapC5084o, int i, int i2) {
            super(concurrentMapC5084o, i, i2);
            this.f12782z = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: D */
        /* bridge */ /* synthetic */ AbstractC5099m mo25599D() {
            m25612H();
            return this;
        }

        /* renamed from: H */
        C5113v<K, V> m25612H() {
            return this;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: o */
        void mo25595o() {
            m25662b((ReferenceQueue<K>) this.f12782z);
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: p */
        void mo25594p() {
            m25659e(this.f12782z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$w */
    /* loaded from: classes2.dex */
    public static final class C5114w<K, V> extends AbstractC5089c<K, V, C5114w<K, V>> implements InterfaceC5117y<K, V, C5114w<K, V>> {

        /* renamed from: c */
        private volatile InterfaceC5118z<K, V, C5114w<K, V>> f12783c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$w$a */
        /* loaded from: classes2.dex */
        public static final class C5115a<K, V> implements InterfaceC5095i<K, V, C5114w<K, V>, C5116x<K, V>> {

            /* renamed from: a */
            private static final C5115a<?, ?> f12784a = new C5115a<>();

            C5115a() {
            }

            /* renamed from: g */
            static <K, V> C5115a<K, V> m25603g() {
                return (C5115a<K, V>) f12784a;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: b */
            public EnumC5100n mo25608b() {
                return EnumC5100n.f12772d;
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: f */
            public C5114w<K, V> mo25609a(C5116x<K, V> c5116x, C5114w<K, V> c5114w, C5114w<K, V> c5114w2) {
                if (c5114w.getKey() == null || AbstractC5099m.m25650n(c5114w)) {
                    return null;
                }
                return c5114w.m25611b(((C5116x) c5116x).f12786z, ((C5116x) c5116x).f12785A, c5114w2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: h */
            public C5114w<K, V> mo25605e(C5116x<K, V> c5116x, K k, int i, C5114w<K, V> c5114w) {
                return new C5114w<>(((C5116x) c5116x).f12786z, k, i, c5114w);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: i */
            public C5116x<K, V> mo25606d(ConcurrentMapC5084o<K, V, C5114w<K, V>, C5116x<K, V>> concurrentMapC5084o, int i, int i2) {
                return new C5116x<>(concurrentMapC5084o, i, i2);
            }

            @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5095i
            /* renamed from: j */
            public void mo25607c(C5116x<K, V> c5116x, C5114w<K, V> c5114w, V v) {
                c5114w.m25610c(v, ((C5116x) c5116x).f12785A);
            }
        }

        C5114w(ReferenceQueue<K> referenceQueue, K k, int i, C5114w<K, V> c5114w) {
            super(referenceQueue, k, i, c5114w);
            this.f12783c = ConcurrentMapC5084o.m25681n();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5117y
        /* renamed from: a */
        public InterfaceC5118z<K, V, C5114w<K, V>> mo25593a() {
            return this.f12783c;
        }

        /* renamed from: b */
        C5114w<K, V> m25611b(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C5114w<K, V> c5114w) {
            C5114w<K, V> c5114w2 = new C5114w<>(referenceQueue, getKey(), this.f12752a, c5114w);
            c5114w2.f12783c = this.f12783c.mo25591b(referenceQueue2, c5114w2);
            return c5114w2;
        }

        /* renamed from: c */
        void m25610c(V v, ReferenceQueue<V> referenceQueue) {
            InterfaceC5118z<K, V, C5114w<K, V>> interfaceC5118z = this.f12783c;
            this.f12783c = new C5086a0(referenceQueue, v, this);
            interfaceC5118z.clear();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.InterfaceC5094h
        public V getValue() {
            return this.f12783c.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$x */
    /* loaded from: classes2.dex */
    public static final class C5116x<K, V> extends AbstractC5099m<K, V, C5114w<K, V>, C5116x<K, V>> {

        /* renamed from: A */
        private final ReferenceQueue<V> f12785A;

        /* renamed from: z */
        private final ReferenceQueue<K> f12786z;

        C5116x(ConcurrentMapC5084o<K, V, C5114w<K, V>, C5116x<K, V>> concurrentMapC5084o, int i, int i2) {
            super(concurrentMapC5084o, i, i2);
            this.f12786z = new ReferenceQueue<>();
            this.f12785A = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: D */
        /* bridge */ /* synthetic */ AbstractC5099m mo25599D() {
            m25596I();
            return this;
        }

        /* renamed from: I */
        C5116x<K, V> m25596I() {
            return this;
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: o */
        void mo25595o() {
            m25662b((ReferenceQueue<K>) this.f12786z);
        }

        @Override // com.google.common.collect.ConcurrentMapC5084o.AbstractC5099m
        /* renamed from: p */
        void mo25594p() {
            m25659e(this.f12786z);
            m25658f(this.f12785A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$y */
    /* loaded from: classes2.dex */
    public interface InterfaceC5117y<K, V, E extends InterfaceC5094h<K, V, E>> extends InterfaceC5094h<K, V, E> {
        /* renamed from: a */
        InterfaceC5118z<K, V, E> mo25593a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$z */
    /* loaded from: classes2.dex */
    public interface InterfaceC5118z<K, V, E extends InterfaceC5094h<K, V, E>> {
        /* renamed from: a */
        E mo25592a();

        /* renamed from: b */
        InterfaceC5118z<K, V, E> mo25591b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();
    }

    private ConcurrentMapC5084o(C5083n c5083n, InterfaceC5095i<K, V, E, S> interfaceC5095i) {
        this.f12740f = Math.min(c5083n.m25700a(), 65536);
        this.f12741w = c5083n.m25698c();
        this.f12742x = interfaceC5095i;
        int min = Math.min(c5083n.m25699b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f12740f) {
            i4++;
            i3 <<= 1;
        }
        this.f12738d = 32 - i4;
        this.f12737c = i3 - 1;
        this.f12739e = m25687h(i3);
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            AbstractC5099m<K, V, E, S>[] abstractC5099mArr = this.f12739e;
            if (i >= abstractC5099mArr.length) {
                return;
            }
            abstractC5099mArr[i] = m25690c(i2, -1);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> ConcurrentMapC5084o<K, V, ? extends InterfaceC5094h<K, V, ?>, ?> m25691b(C5083n c5083n) {
        if (c5083n.m25697d() == EnumC5100n.f12771c && c5083n.m25696e() == EnumC5100n.f12771c) {
            return new ConcurrentMapC5084o<>(c5083n, C5103o.C5104a.m25634g());
        }
        if (c5083n.m25697d() == EnumC5100n.f12771c && c5083n.m25696e() == EnumC5100n.f12772d) {
            return new ConcurrentMapC5084o<>(c5083n, C5106q.C5107a.m25626g());
        }
        if (c5083n.m25697d() == EnumC5100n.f12772d && c5083n.m25696e() == EnumC5100n.f12771c) {
            return new ConcurrentMapC5084o<>(c5083n, C5111u.C5112a.m25617g());
        }
        if (c5083n.m25697d() == EnumC5100n.f12772d && c5083n.m25696e() == EnumC5100n.f12772d) {
            return new ConcurrentMapC5084o<>(c5083n, C5114w.C5115a.m25603g());
        }
        throw new AssertionError();
    }

    /* renamed from: k */
    static int m25684k(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static <E> ArrayList<E> m25682m(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C5080l.m25709a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: n */
    static <K, V, E extends InterfaceC5094h<K, V, E>> InterfaceC5118z<K, V, E> m25681n() {
        return (InterfaceC5118z<K, V, E>) f12735B;
    }

    /* renamed from: c */
    AbstractC5099m<K, V, E, S> m25690c(int i, int i2) {
        return (S) this.f12742x.mo25606d(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (AbstractC5099m<K, V, E, S> abstractC5099m : this.f12739e) {
            abstractC5099m.m25663a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m25688g = m25688g(obj);
        return m25683l(m25688g).m25661c(obj, m25688g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        AbstractC5099m<K, V, E, S>[] abstractC5099mArr = this.f12739e;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (C5116x c5116x : abstractC5099mArr) {
                int i2 = c5116x.f12765d;
                AtomicReferenceArray<E> atomicReferenceArray = c5116x.f12768w;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (E e = atomicReferenceArray.get(i3); e != null; e = e.mo25669u()) {
                        Object m25652l = c5116x.m25652l(e);
                        if (m25652l != null && m25680o().m25827d(obj, m25652l)) {
                            return true;
                        }
                    }
                }
                j2 += c5116x.f12766e;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    /* renamed from: e */
    V m25689e(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f12736A;
        if (set != null) {
            return set;
        }
        C5092f c5092f = new C5092f();
        this.f12736A = c5092f;
        return c5092f;
    }

    /* renamed from: g */
    int m25688g(Object obj) {
        return m25684k(this.f12741w.m25826e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m25688g = m25688g(obj);
        return m25683l(m25688g).m25656h(obj, m25688g);
    }

    /* renamed from: h */
    final AbstractC5099m<K, V, E, S>[] m25687h(int i) {
        return new AbstractC5099m[i];
    }

    /* renamed from: i */
    void m25686i(E e) {
        int mo25670t = e.mo25670t();
        m25683l(mo25670t).m25645u(e, mo25670t);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        AbstractC5099m<K, V, E, S>[] abstractC5099mArr = this.f12739e;
        long j = 0;
        for (int i = 0; i < abstractC5099mArr.length; i++) {
            if (abstractC5099mArr[i].f12765d != 0) {
                return false;
            }
            j += abstractC5099mArr[i].f12766e;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < abstractC5099mArr.length; i2++) {
                if (abstractC5099mArr[i2].f12765d != 0) {
                    return false;
                }
                j -= abstractC5099mArr[i2].f12766e;
            }
            return j == 0;
        }
        return true;
    }

    /* renamed from: j */
    void m25685j(InterfaceC5118z<K, V, E> interfaceC5118z) {
        E mo25592a = interfaceC5118z.mo25592a();
        int mo25670t = mo25592a.mo25670t();
        m25683l(mo25670t).m25644v((K) mo25592a.getKey(), mo25670t, interfaceC5118z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f12743y;
        if (set != null) {
            return set;
        }
        C5097k c5097k = new C5097k();
        this.f12743y = c5097k;
        return c5097k;
    }

    /* renamed from: l */
    AbstractC5099m<K, V, E, S> m25683l(int i) {
        return this.f12739e[(i >>> this.f12738d) & this.f12737c];
    }

    /* renamed from: o */
    AbstractC5035e<Object> m25680o() {
        return this.f12742x.mo25608b().mo25638b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        C5051n.m25780n(k);
        C5051n.m25780n(v);
        int m25688g = m25688g(k);
        return m25683l(m25688g).m25646t(k, m25688g, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        C5051n.m25780n(k);
        C5051n.m25780n(v);
        int m25688g = m25688g(k);
        return m25683l(m25688g).m25646t(k, m25688g, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m25688g = m25688g(obj);
        return m25683l(m25688g).m25643w(obj, m25688g);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        C5051n.m25780n(k);
        C5051n.m25780n(v2);
        if (v == null) {
            return false;
        }
        int m25688g = m25688g(k);
        return m25683l(m25688g).m25668A(k, m25688g, v, v2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (AbstractC5099m<K, V, E, S> abstractC5099m : this.f12739e) {
            j += abstractC5099m.f12765d;
        }
        return C9362a.m14959a(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f12744z;
        if (collection != null) {
            return collection;
        }
        C5110t c5110t = new C5110t();
        this.f12744z = c5110t;
        return c5110t;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m25688g = m25688g(obj);
        return m25683l(m25688g).m25642x(obj, m25688g, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        C5051n.m25780n(k);
        C5051n.m25780n(v);
        int m25688g = m25688g(k);
        return m25683l(m25688g).m25640z(k, m25688g, v);
    }
}
