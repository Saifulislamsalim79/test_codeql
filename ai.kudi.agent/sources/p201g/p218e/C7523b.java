package p201g.p218e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ArraySet.java */
/* renamed from: g.e.b */
/* loaded from: classes2.dex */
public final class C7523b<E> implements Collection<E>, Set<E> {

    /* renamed from: A */
    private static Object[] f17861A;

    /* renamed from: B */
    private static int f17862B;

    /* renamed from: w */
    private static final int[] f17863w = new int[0];

    /* renamed from: x */
    private static final Object[] f17864x = new Object[0];

    /* renamed from: y */
    private static Object[] f17865y;

    /* renamed from: z */
    private static int f17866z;

    /* renamed from: c */
    private int[] f17867c;

    /* renamed from: d */
    Object[] f17868d;

    /* renamed from: e */
    int f17869e;

    /* renamed from: f */
    private AbstractC7528f<E, E> f17870f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* renamed from: g.e.b$a */
    /* loaded from: classes2.dex */
    public class C7524a extends AbstractC7528f<E, E> {
        C7524a() {
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: a */
        protected void mo18480a() {
            C7523b.this.clear();
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: b */
        protected Object mo18479b(int i, int i2) {
            return C7523b.this.f17868d[i];
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: c */
        protected Map<E, E> mo18478c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: d */
        protected int mo18477d() {
            return C7523b.this.f17869e;
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: e */
        protected int mo18476e(Object obj) {
            return C7523b.this.indexOf(obj);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: f */
        protected int mo18475f(Object obj) {
            return C7523b.this.indexOf(obj);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: g */
        protected void mo18474g(E e, E e2) {
            C7523b.this.add(e);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: h */
        protected void mo18473h(int i) {
            C7523b.this.m18512m(i);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: i */
        protected E mo18472i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C7523b() {
        this(0);
    }

    /* renamed from: d */
    private void m18518d(int i) {
        if (i == 8) {
            synchronized (C7523b.class) {
                if (f17861A != null) {
                    Object[] objArr = f17861A;
                    this.f17868d = objArr;
                    f17861A = (Object[]) objArr[0];
                    this.f17867c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17862B--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C7523b.class) {
                if (f17865y != null) {
                    Object[] objArr2 = f17865y;
                    this.f17868d = objArr2;
                    f17865y = (Object[]) objArr2[0];
                    this.f17867c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17866z--;
                    return;
                }
            }
        }
        this.f17867c = new int[i];
        this.f17868d = new Object[i];
    }

    /* renamed from: f */
    private static void m18516f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C7523b.class) {
                if (f17862B < 10) {
                    objArr[0] = f17861A;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17861A = objArr;
                    f17862B++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C7523b.class) {
                if (f17866z < 10) {
                    objArr[0] = f17865y;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f17865y = objArr;
                    f17866z++;
                }
            }
        }
    }

    /* renamed from: h */
    private AbstractC7528f<E, E> m18515h() {
        if (this.f17870f == null) {
            this.f17870f = new C7524a();
        }
        return this.f17870f;
    }

    /* renamed from: k */
    private int m18514k(Object obj, int i) {
        int i2 = this.f17869e;
        if (i2 == 0) {
            return -1;
        }
        int m18510a = C7525c.m18510a(this.f17867c, i2, i);
        if (m18510a >= 0 && !obj.equals(this.f17868d[m18510a])) {
            int i3 = m18510a + 1;
            while (i3 < i2 && this.f17867c[i3] == i) {
                if (obj.equals(this.f17868d[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m18510a - 1; i4 >= 0 && this.f17867c[i4] == i; i4--) {
                if (obj.equals(this.f17868d[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m18510a;
    }

    /* renamed from: l */
    private int m18513l() {
        int i = this.f17869e;
        if (i == 0) {
            return -1;
        }
        int m18510a = C7525c.m18510a(this.f17867c, i, 0);
        if (m18510a >= 0 && this.f17868d[m18510a] != null) {
            int i2 = m18510a + 1;
            while (i2 < i && this.f17867c[i2] == 0) {
                if (this.f17868d[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m18510a - 1; i3 >= 0 && this.f17867c[i3] == 0; i3--) {
                if (this.f17868d[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m18510a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m18514k;
        if (e == null) {
            m18514k = m18513l();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m18514k = m18514k(e, hashCode);
        }
        if (m18514k >= 0) {
            return false;
        }
        int i2 = m18514k ^ (-1);
        int i3 = this.f17869e;
        if (i3 >= this.f17867c.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f17867c;
            Object[] objArr = this.f17868d;
            m18518d(i4);
            int[] iArr2 = this.f17867c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17868d, 0, objArr.length);
            }
            m18516f(iArr, objArr, this.f17869e);
        }
        int i5 = this.f17869e;
        if (i2 < i5) {
            int[] iArr3 = this.f17867c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f17868d;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f17869e - i2);
        }
        this.f17867c[i2] = i;
        this.f17868d[i2] = e;
        this.f17869e++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m18517e(this.f17869e + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f17869e;
        if (i != 0) {
            m18516f(this.f17867c, this.f17868d, i);
            this.f17867c = f17863w;
            this.f17868d = f17864x;
            this.f17869e = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void m18517e(int i) {
        int[] iArr = this.f17867c;
        if (iArr.length < i) {
            Object[] objArr = this.f17868d;
            m18518d(i);
            int i2 = this.f17869e;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f17867c, 0, i2);
                System.arraycopy(objArr, 0, this.f17868d, 0, this.f17869e);
            }
            m18516f(iArr, objArr, this.f17869e);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f17869e; i++) {
                try {
                    if (!set.contains(m18511s(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f17867c;
        int i = this.f17869e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m18513l() : m18514k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17869e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m18515h().m18468m().iterator();
    }

    /* renamed from: m */
    public E m18512m(int i) {
        Object[] objArr = this.f17868d;
        E e = (E) objArr[i];
        int i2 = this.f17869e;
        if (i2 <= 1) {
            m18516f(this.f17867c, objArr, i2);
            this.f17867c = f17863w;
            this.f17868d = f17864x;
            this.f17869e = 0;
        } else {
            int[] iArr = this.f17867c;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                int i3 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = this.f17867c;
                Object[] objArr2 = this.f17868d;
                m18518d(i3);
                this.f17869e--;
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.f17867c, 0, i);
                    System.arraycopy(objArr2, 0, this.f17868d, 0, i);
                }
                int i4 = this.f17869e;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, this.f17867c, i, i4 - i);
                    System.arraycopy(objArr2, i5, this.f17868d, i, this.f17869e - i);
                }
            } else {
                int i6 = this.f17869e - 1;
                this.f17869e = i6;
                if (i < i6) {
                    int[] iArr3 = this.f17867c;
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, iArr3, i, i6 - i);
                    Object[] objArr3 = this.f17868d;
                    System.arraycopy(objArr3, i7, objArr3, i, this.f17869e - i);
                }
                this.f17868d[this.f17869e] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m18512m(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f17869e - 1; i >= 0; i--) {
            if (!collection.contains(this.f17868d[i])) {
                m18512m(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public E m18511s(int i) {
        return (E) this.f17868d[i];
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f17869e;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f17869e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f17868d, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17869e * 14);
        sb.append('{');
        for (int i = 0; i < this.f17869e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m18511s = m18511s(i);
            if (m18511s != this) {
                sb.append(m18511s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7523b(int i) {
        if (i == 0) {
            this.f17867c = f17863w;
            this.f17868d = f17864x;
        } else {
            m18518d(i);
        }
        this.f17869e = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17869e) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17869e));
        }
        System.arraycopy(this.f17868d, 0, tArr, 0, this.f17869e);
        int length = tArr.length;
        int i = this.f17869e;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
