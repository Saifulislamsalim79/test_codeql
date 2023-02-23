package kotlin.p557z;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* compiled from: ArrayDeque.kt */
/* renamed from: kotlin.z.i */
/* loaded from: classes3.dex */
public final class C13703i<E> extends AbstractC13697f<E> {

    /* renamed from: c */
    private int f30161c;

    /* renamed from: d */
    private Object[] f30162d = f30159f;

    /* renamed from: e */
    private int f30163e;

    /* renamed from: w */
    public static final C13704a f30160w = new C13704a(null);

    /* renamed from: f */
    private static final Object[] f30159f = new Object[0];

    /* compiled from: ArrayDeque.kt */
    /* renamed from: kotlin.z.i$a */
    /* loaded from: classes3.dex */
    public static final class C13704a {
        private C13704a() {
        }

        /* renamed from: a */
        public final int m4120a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }

        public /* synthetic */ C13704a(g gVar) {
            this();
        }
    }

    /* renamed from: F */
    private final void m4132F(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f30162d.length;
        while (i < length && it.hasNext()) {
            this.f30162d[i] = it.next();
            i++;
        }
        int i2 = this.f30161c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f30162d[i3] = it.next();
        }
        this.f30163e = size() + collection.size();
    }

    /* renamed from: I */
    private final void m4131I(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f30162d;
        C13712m.m4065f(objArr2, objArr, 0, this.f30161c, objArr2.length);
        Object[] objArr3 = this.f30162d;
        int length = objArr3.length;
        int i2 = this.f30161c;
        C13712m.m4065f(objArr3, objArr, length - i2, 0, i2);
        this.f30161c = 0;
        this.f30162d = objArr;
    }

    /* renamed from: J */
    private final int m4130J(int i) {
        int m3999z;
        if (i == 0) {
            m3999z = C13715n.m3999z(this.f30162d);
            return m3999z;
        }
        return i - 1;
    }

    /* renamed from: O */
    private final void m4129O(int i) {
        int m10271a;
        if (i >= 0) {
            Object[] objArr = this.f30162d;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f30159f) {
                m10271a = C11841h.m10271a(i, 10);
                this.f30162d = new Object[m10271a];
                return;
            }
            m4131I(f30160w.m4120a(objArr.length, i));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final int m4128P(int i) {
        int m3999z;
        m3999z = C13715n.m3999z(this.f30162d);
        if (i == m3999z) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final int m4127V(int i) {
        return i < 0 ? i + this.f30162d.length : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final int m4126X(int i) {
        Object[] objArr = this.f30162d;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m4129O(size() + collection.size());
        m4132F(m4126X(this.f30161c + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        m4129O(size() + 1);
        int m4130J = m4130J(this.f30161c);
        this.f30161c = m4130J;
        this.f30162d[m4130J] = e;
        this.f30163e = size() + 1;
    }

    public final void addLast(E e) {
        m4129O(size() + 1);
        this.f30162d[m4126X(this.f30161c + size())] = e;
        this.f30163e = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m4126X = m4126X(this.f30161c + size());
        int i = this.f30161c;
        if (i < m4126X) {
            C13712m.m4061j(this.f30162d, null, i, m4126X);
        } else if (!isEmpty()) {
            Object[] objArr = this.f30162d;
            C13712m.m4061j(objArr, null, this.f30161c, objArr.length);
            C13712m.m4061j(this.f30162d, null, 0, m4126X);
        }
        this.f30161c = 0;
        this.f30163e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.p557z.AbstractC13697f
    /* renamed from: e */
    public int mo3853e() {
        return this.f30163e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC13689d.f30149c.m4149a(i, size());
        return (E) this.f30162d[m4126X(this.f30161c + i)];
    }

    @Override // kotlin.p557z.AbstractC13697f
    /* renamed from: h */
    public E mo3852h(int i) {
        int m3889g;
        int m3889g2;
        AbstractC13689d.f30149c.m4149a(i, size());
        m3889g = C13726r.m3889g(this);
        if (i == m3889g) {
            return removeLast();
        }
        if (i != 0) {
            int m4126X = m4126X(this.f30161c + i);
            E e = (E) this.f30162d[m4126X];
            if (i < (size() >> 1)) {
                int i2 = this.f30161c;
                if (m4126X >= i2) {
                    Object[] objArr = this.f30162d;
                    C13712m.m4065f(objArr, objArr, i2 + 1, i2, m4126X);
                } else {
                    Object[] objArr2 = this.f30162d;
                    C13712m.m4065f(objArr2, objArr2, 1, 0, m4126X);
                    Object[] objArr3 = this.f30162d;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i3 = this.f30161c;
                    C13712m.m4065f(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
                }
                Object[] objArr4 = this.f30162d;
                int i4 = this.f30161c;
                objArr4[i4] = null;
                this.f30161c = m4128P(i4);
            } else {
                m3889g2 = C13726r.m3889g(this);
                int m4126X2 = m4126X(this.f30161c + m3889g2);
                if (m4126X <= m4126X2) {
                    Object[] objArr5 = this.f30162d;
                    C13712m.m4065f(objArr5, objArr5, m4126X, m4126X + 1, m4126X2 + 1);
                } else {
                    Object[] objArr6 = this.f30162d;
                    C13712m.m4065f(objArr6, objArr6, m4126X, m4126X + 1, objArr6.length);
                    Object[] objArr7 = this.f30162d;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    C13712m.m4065f(objArr7, objArr7, 0, 1, m4126X2 + 1);
                }
                this.f30162d[m4126X2] = null;
            }
            this.f30163e = size() - 1;
            return e;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int m4126X = m4126X(this.f30161c + size());
        int i2 = this.f30161c;
        if (i2 < m4126X) {
            while (i2 < m4126X) {
                if (l.b(obj, this.f30162d[i2])) {
                    i = this.f30161c;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < m4126X) {
            return -1;
        } else {
            int length = this.f30162d.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < m4126X; i3++) {
                        if (l.b(obj, this.f30162d[i3])) {
                            i2 = i3 + this.f30162d.length;
                            i = this.f30161c;
                        }
                    }
                    return -1;
                } else if (l.b(obj, this.f30162d[i2])) {
                    i = this.f30161c;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m3999z;
        int i;
        int m4126X = m4126X(this.f30161c + size());
        int i2 = this.f30161c;
        if (i2 < m4126X) {
            m3999z = m4126X - 1;
            if (m3999z < i2) {
                return -1;
            }
            while (!l.b(obj, this.f30162d[m3999z])) {
                if (m3999z == i2) {
                    return -1;
                }
                m3999z--;
            }
            i = this.f30161c;
        } else if (i2 <= m4126X) {
            return -1;
        } else {
            int i3 = m4126X - 1;
            while (true) {
                if (i3 >= 0) {
                    if (l.b(obj, this.f30162d[i3])) {
                        m3999z = i3 + this.f30162d.length;
                        i = this.f30161c;
                        break;
                    }
                    i3--;
                } else {
                    m3999z = C13715n.m3999z(this.f30162d);
                    int i4 = this.f30161c;
                    if (m3999z < i4) {
                        return -1;
                    }
                    while (!l.b(obj, this.f30162d[m3999z])) {
                        if (m3999z == i4) {
                            return -1;
                        }
                        m3999z--;
                    }
                    i = this.f30161c;
                }
            }
        }
        return m3999z - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.f30162d.length == 0)) {
                int m4126X = m4126X(this.f30161c + size());
                int i = this.f30161c;
                if (this.f30161c < m4126X) {
                    for (int i2 = this.f30161c; i2 < m4126X; i2++) {
                        Object obj = this.f30162d[i2];
                        if (!collection.contains(obj)) {
                            this.f30162d[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    C13712m.m4061j(this.f30162d, null, i, m4126X);
                } else {
                    int length = this.f30162d.length;
                    boolean z2 = false;
                    for (int i3 = this.f30161c; i3 < length; i3++) {
                        Object obj2 = this.f30162d[i3];
                        this.f30162d[i3] = null;
                        if (!collection.contains(obj2)) {
                            this.f30162d[i] = obj2;
                            i++;
                        } else {
                            z2 = true;
                        }
                    }
                    i = m4126X(i);
                    for (int i4 = 0; i4 < m4126X; i4++) {
                        Object obj3 = this.f30162d[i4];
                        this.f30162d[i4] = null;
                        if (!collection.contains(obj3)) {
                            this.f30162d[i] = obj3;
                            i = m4128P(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f30163e = m4127V(i - this.f30161c);
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E e = (E) this.f30162d[this.f30161c];
            Object[] objArr = this.f30162d;
            int i = this.f30161c;
            objArr[i] = null;
            this.f30161c = m4128P(i);
            this.f30163e = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int m3889g;
        if (!isEmpty()) {
            m3889g = C13726r.m3889g(this);
            int m4126X = m4126X(this.f30161c + m3889g);
            E e = (E) this.f30162d[m4126X];
            this.f30162d[m4126X] = null;
            this.f30163e = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.f30162d.length == 0)) {
                int m4126X = m4126X(this.f30161c + size());
                int i = this.f30161c;
                if (this.f30161c < m4126X) {
                    for (int i2 = this.f30161c; i2 < m4126X; i2++) {
                        Object obj = this.f30162d[i2];
                        if (collection.contains(obj)) {
                            this.f30162d[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    C13712m.m4061j(this.f30162d, null, i, m4126X);
                } else {
                    int length = this.f30162d.length;
                    boolean z2 = false;
                    for (int i3 = this.f30161c; i3 < length; i3++) {
                        Object obj2 = this.f30162d[i3];
                        this.f30162d[i3] = null;
                        if (collection.contains(obj2)) {
                            this.f30162d[i] = obj2;
                            i++;
                        } else {
                            z2 = true;
                        }
                    }
                    i = m4126X(i);
                    for (int i4 = 0; i4 < m4126X; i4++) {
                        Object obj3 = this.f30162d[i4];
                        this.f30162d[i4] = null;
                        if (collection.contains(obj3)) {
                            this.f30162d[i] = obj3;
                            i = m4128P(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f30163e = m4127V(i - this.f30161c);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC13689d.f30149c.m4149a(i, size());
        int m4126X = m4126X(this.f30161c + i);
        E e2 = (E) this.f30162d[m4126X];
        this.f30162d[m4126X] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        l.f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C13708k.m4073a(tArr, size());
        }
        if (tArr != null) {
            int m4126X = m4126X(this.f30161c + size());
            int i = this.f30161c;
            if (i < m4126X) {
                C13712m.m4064g(this.f30162d, tArr, 0, i, m4126X, 2, null);
            } else if (!isEmpty()) {
                Object[] objArr = this.f30162d;
                C13712m.m4065f(objArr, tArr, 0, this.f30161c, objArr.length);
                Object[] objArr2 = this.f30162d;
                C13712m.m4065f(objArr2, tArr, objArr2.length - this.f30161c, 0, m4126X);
            }
            if (tArr.length > size()) {
                tArr[size()] = null;
            }
            if (tArr != null) {
                return tArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC13689d.f30149c.m4148b(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m4129O(size() + 1);
            int m4126X = m4126X(this.f30161c + i);
            if (i < ((size() + 1) >> 1)) {
                int m4130J = m4130J(m4126X);
                int m4130J2 = m4130J(this.f30161c);
                int i2 = this.f30161c;
                if (m4130J >= i2) {
                    Object[] objArr = this.f30162d;
                    objArr[m4130J2] = objArr[i2];
                    C13712m.m4065f(objArr, objArr, i2, i2 + 1, m4130J + 1);
                } else {
                    Object[] objArr2 = this.f30162d;
                    C13712m.m4065f(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f30162d;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C13712m.m4065f(objArr3, objArr3, 0, 1, m4130J + 1);
                }
                this.f30162d[m4130J] = e;
                this.f30161c = m4130J2;
            } else {
                int m4126X2 = m4126X(this.f30161c + size());
                if (m4126X < m4126X2) {
                    Object[] objArr4 = this.f30162d;
                    C13712m.m4065f(objArr4, objArr4, m4126X + 1, m4126X, m4126X2);
                } else {
                    Object[] objArr5 = this.f30162d;
                    C13712m.m4065f(objArr5, objArr5, 1, 0, m4126X2);
                    Object[] objArr6 = this.f30162d;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C13712m.m4065f(objArr6, objArr6, m4126X + 1, m4126X, objArr6.length - 1);
                }
                this.f30162d[m4126X] = e;
            }
            this.f30163e = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        l.f(collection, "elements");
        AbstractC13689d.f30149c.m4148b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m4129O(size() + collection.size());
        int m4126X = m4126X(this.f30161c + size());
        int m4126X2 = m4126X(this.f30161c + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f30161c;
            int i3 = i2 - size;
            if (m4126X2 < i2) {
                Object[] objArr = this.f30162d;
                C13712m.m4065f(objArr, objArr, i3, i2, objArr.length);
                if (size >= m4126X2) {
                    Object[] objArr2 = this.f30162d;
                    C13712m.m4065f(objArr2, objArr2, objArr2.length - size, 0, m4126X2);
                } else {
                    Object[] objArr3 = this.f30162d;
                    C13712m.m4065f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f30162d;
                    C13712m.m4065f(objArr4, objArr4, 0, size, m4126X2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f30162d;
                C13712m.m4065f(objArr5, objArr5, i3, i2, m4126X2);
            } else {
                Object[] objArr6 = this.f30162d;
                i3 += objArr6.length;
                int i4 = m4126X2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C13712m.m4065f(objArr6, objArr6, i3, i2, m4126X2);
                } else {
                    C13712m.m4065f(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f30162d;
                    C13712m.m4065f(objArr7, objArr7, 0, this.f30161c + length, m4126X2);
                }
            }
            this.f30161c = i3;
            m4132F(m4127V(m4126X2 - size), collection);
        } else {
            int i5 = m4126X2 + size;
            if (m4126X2 < m4126X) {
                int i6 = size + m4126X;
                Object[] objArr8 = this.f30162d;
                if (i6 <= objArr8.length) {
                    C13712m.m4065f(objArr8, objArr8, i5, m4126X2, m4126X);
                } else if (i5 >= objArr8.length) {
                    C13712m.m4065f(objArr8, objArr8, i5 - objArr8.length, m4126X2, m4126X);
                } else {
                    int length2 = m4126X - (i6 - objArr8.length);
                    C13712m.m4065f(objArr8, objArr8, 0, length2, m4126X);
                    Object[] objArr9 = this.f30162d;
                    C13712m.m4065f(objArr9, objArr9, i5, m4126X2, length2);
                }
            } else {
                Object[] objArr10 = this.f30162d;
                C13712m.m4065f(objArr10, objArr10, size, 0, m4126X);
                Object[] objArr11 = this.f30162d;
                if (i5 >= objArr11.length) {
                    C13712m.m4065f(objArr11, objArr11, i5 - objArr11.length, m4126X2, objArr11.length);
                } else {
                    C13712m.m4065f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f30162d;
                    C13712m.m4065f(objArr12, objArr12, i5, m4126X2, objArr12.length - size);
                }
            }
            m4132F(m4126X2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
