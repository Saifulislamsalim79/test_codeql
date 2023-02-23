package p201g.p218e;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SimpleArrayMap.java */
/* renamed from: g.e.g */
/* loaded from: classes2.dex */
public class C7534g<K, V> {

    /* renamed from: f */
    static Object[] f17903f;

    /* renamed from: w */
    static int f17904w;

    /* renamed from: x */
    static Object[] f17905x;

    /* renamed from: y */
    static int f17906y;

    /* renamed from: c */
    int[] f17907c;

    /* renamed from: d */
    Object[] f17908d;

    /* renamed from: e */
    int f17909e;

    public C7534g() {
        this.f17907c = C7525c.f17872a;
        this.f17908d = C7525c.f17874c;
        this.f17909e = 0;
    }

    /* renamed from: a */
    private void m18460a(int i) {
        if (i == 8) {
            synchronized (C7534g.class) {
                if (f17905x != null) {
                    Object[] objArr = f17905x;
                    this.f17908d = objArr;
                    f17905x = (Object[]) objArr[0];
                    this.f17907c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17906y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C7534g.class) {
                if (f17903f != null) {
                    Object[] objArr2 = f17903f;
                    this.f17908d = objArr2;
                    f17903f = (Object[]) objArr2[0];
                    this.f17907c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17904w--;
                    return;
                }
            }
        }
        this.f17907c = new int[i];
        this.f17908d = new Object[i << 1];
    }

    /* renamed from: b */
    private static int m18459b(int[] iArr, int i, int i2) {
        try {
            return C7525c.m18510a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private static void m18457e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C7534g.class) {
                if (f17906y < 10) {
                    objArr[0] = f17905x;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17905x = objArr;
                    f17906y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C7534g.class) {
                if (f17904w < 10) {
                    objArr[0] = f17903f;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f17903f = objArr;
                    f17904w++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m18458c(int i) {
        int i2 = this.f17909e;
        int[] iArr = this.f17907c;
        if (iArr.length < i) {
            Object[] objArr = this.f17908d;
            m18460a(i);
            if (this.f17909e > 0) {
                System.arraycopy(iArr, 0, this.f17907c, 0, i2);
                System.arraycopy(objArr, 0, this.f17908d, 0, i2 << 1);
            }
            m18457e(iArr, objArr, i2);
        }
        if (this.f17909e != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f17909e;
        if (i > 0) {
            int[] iArr = this.f17907c;
            Object[] objArr = this.f17908d;
            this.f17907c = C7525c.f17872a;
            this.f17908d = C7525c.f17874c;
            this.f17909e = 0;
            m18457e(iArr, objArr, i);
        }
        if (this.f17909e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m18455h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m18453j(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7534g) {
            C7534g c7534g = (C7534g) obj;
            if (size() != c7534g.size()) {
                return false;
            }
            for (int i = 0; i < this.f17909e; i++) {
                try {
                    K m18452k = m18452k(i);
                    V m18448o = m18448o(i);
                    Object obj2 = c7534g.get(m18452k);
                    if (m18448o == null) {
                        if (obj2 != null || !c7534g.containsKey(m18452k)) {
                            return false;
                        }
                    } else if (!m18448o.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f17909e; i2++) {
                try {
                    K m18452k2 = m18452k(i2);
                    V m18448o2 = m18448o(i2);
                    Object obj3 = map.get(m18452k2);
                    if (m18448o2 == null) {
                        if (obj3 != null || !map.containsKey(m18452k2)) {
                            return false;
                        }
                    } else if (!m18448o2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    int m18456g(Object obj, int i) {
        int i2 = this.f17909e;
        if (i2 == 0) {
            return -1;
        }
        int m18459b = m18459b(this.f17907c, i2, i);
        if (m18459b >= 0 && !obj.equals(this.f17908d[m18459b << 1])) {
            int i3 = m18459b + 1;
            while (i3 < i2 && this.f17907c[i3] == i) {
                if (obj.equals(this.f17908d[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m18459b - 1; i4 >= 0 && this.f17907c[i4] == i; i4--) {
                if (obj.equals(this.f17908d[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m18459b;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m18455h = m18455h(obj);
        return m18455h >= 0 ? (V) this.f17908d[(m18455h << 1) + 1] : v;
    }

    /* renamed from: h */
    public int m18455h(Object obj) {
        return obj == null ? m18454i() : m18456g(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.f17907c;
        Object[] objArr = this.f17908d;
        int i = this.f17909e;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    int m18454i() {
        int i = this.f17909e;
        if (i == 0) {
            return -1;
        }
        int m18459b = m18459b(this.f17907c, i, 0);
        if (m18459b >= 0 && this.f17908d[m18459b << 1] != null) {
            int i2 = m18459b + 1;
            while (i2 < i && this.f17907c[i2] == 0) {
                if (this.f17908d[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m18459b - 1; i3 >= 0 && this.f17907c[i3] == 0; i3--) {
                if (this.f17908d[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m18459b;
    }

    public boolean isEmpty() {
        return this.f17909e <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m18453j(Object obj) {
        int i = this.f17909e * 2;
        Object[] objArr = this.f17908d;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public K m18452k(int i) {
        return (K) this.f17908d[i << 1];
    }

    /* renamed from: l */
    public void mo18451l(C7534g<? extends K, ? extends V> c7534g) {
        int i = c7534g.f17909e;
        m18458c(this.f17909e + i);
        if (this.f17909e != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c7534g.m18452k(i2), c7534g.m18448o(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c7534g.f17907c, 0, this.f17907c, 0, i);
            System.arraycopy(c7534g.f17908d, 0, this.f17908d, 0, i << 1);
            this.f17909e = i;
        }
    }

    /* renamed from: m */
    public V mo18450m(int i) {
        Object[] objArr = this.f17908d;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f17909e;
        int i4 = 0;
        if (i3 <= 1) {
            m18457e(this.f17907c, objArr, i3);
            this.f17907c = C7525c.f17872a;
            this.f17908d = C7525c.f17874c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f17907c;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr2 = this.f17907c;
                Object[] objArr2 = this.f17908d;
                m18460a(i6);
                if (i3 != this.f17909e) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.f17907c, 0, i);
                    System.arraycopy(objArr2, 0, this.f17908d, 0, i2);
                }
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, this.f17907c, i, i8);
                    System.arraycopy(objArr2, i7 << 1, this.f17908d, i2, i8 << 1);
                }
            } else {
                if (i < i5) {
                    int[] iArr3 = this.f17907c;
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr3, i9, iArr3, i, i10);
                    Object[] objArr3 = this.f17908d;
                    System.arraycopy(objArr3, i9 << 1, objArr3, i2, i10 << 1);
                }
                Object[] objArr4 = this.f17908d;
                int i11 = i5 << 1;
                objArr4[i11] = null;
                objArr4[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.f17909e) {
            this.f17909e = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public V mo18449n(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f17908d;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: o */
    public V m18448o(int i) {
        return (V) this.f17908d[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m18456g;
        int i2 = this.f17909e;
        if (k == null) {
            m18456g = m18454i();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m18456g = m18456g(k, hashCode);
        }
        if (m18456g >= 0) {
            int i3 = (m18456g << 1) + 1;
            Object[] objArr = this.f17908d;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m18456g ^ (-1);
        if (i2 >= this.f17907c.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f17907c;
            Object[] objArr2 = this.f17908d;
            m18460a(i5);
            if (i2 == this.f17909e) {
                int[] iArr2 = this.f17907c;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f17908d, 0, objArr2.length);
                }
                m18457e(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f17907c;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f17908d;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f17909e - i4) << 1);
        }
        int i7 = this.f17909e;
        if (i2 == i7) {
            int[] iArr4 = this.f17907c;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f17908d;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f17909e = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int m18455h = m18455h(obj);
        if (m18455h >= 0) {
            return mo18450m(m18455h);
        }
        return null;
    }

    public V replace(K k, V v) {
        int m18455h = m18455h(k);
        if (m18455h >= 0) {
            return mo18449n(m18455h, v);
        }
        return null;
    }

    public int size() {
        return this.f17909e;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17909e * 28);
        sb.append('{');
        for (int i = 0; i < this.f17909e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m18452k = m18452k(i);
            if (m18452k != this) {
                sb.append(m18452k);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m18448o = m18448o(i);
            if (m18448o != this) {
                sb.append(m18448o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m18455h = m18455h(obj);
        if (m18455h >= 0) {
            V m18448o = m18448o(m18455h);
            if (obj2 == m18448o || (obj2 != null && obj2.equals(m18448o))) {
                mo18450m(m18455h);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int m18455h = m18455h(k);
        if (m18455h >= 0) {
            V m18448o = m18448o(m18455h);
            if (m18448o == v || (v != null && v.equals(m18448o))) {
                mo18449n(m18455h, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public C7534g(int i) {
        if (i == 0) {
            this.f17907c = C7525c.f17872a;
            this.f17908d = C7525c.f17874c;
        } else {
            m18460a(i);
        }
        this.f17909e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7534g(C7534g<K, V> c7534g) {
        this();
        if (c7534g != 0) {
            mo18451l(c7534g);
        }
    }
}
