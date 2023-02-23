package p201g.p218e;
/* compiled from: SparseArrayCompat.java */
/* renamed from: g.e.h */
/* loaded from: classes2.dex */
public class C7535h<E> implements Cloneable {

    /* renamed from: w */
    private static final Object f17910w = new Object();

    /* renamed from: c */
    private boolean f17911c;

    /* renamed from: d */
    private int[] f17912d;

    /* renamed from: e */
    private Object[] f17913e;

    /* renamed from: f */
    private int f17914f;

    public C7535h() {
        this(10);
    }

    /* renamed from: d */
    private void m18444d() {
        int i = this.f17914f;
        int[] iArr = this.f17912d;
        Object[] objArr = this.f17913e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f17910w) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f17911c = false;
        this.f17914f = i2;
    }

    /* renamed from: a */
    public void m18447a(int i, E e) {
        int i2 = this.f17914f;
        if (i2 != 0 && i <= this.f17912d[i2 - 1]) {
            m18439i(i, e);
            return;
        }
        if (this.f17911c && this.f17914f >= this.f17912d.length) {
            m18444d();
        }
        int i3 = this.f17914f;
        if (i3 >= this.f17912d.length) {
            int m18506e = C7525c.m18506e(i3 + 1);
            int[] iArr = new int[m18506e];
            Object[] objArr = new Object[m18506e];
            int[] iArr2 = this.f17912d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17913e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17912d = iArr;
            this.f17913e = objArr;
        }
        this.f17912d[i3] = i;
        this.f17913e[i3] = e;
        this.f17914f = i3 + 1;
    }

    /* renamed from: b */
    public void m18446b() {
        int i = this.f17914f;
        Object[] objArr = this.f17913e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f17914f = 0;
        this.f17911c = false;
    }

    /* renamed from: c */
    public C7535h<E> clone() {
        try {
            C7535h<E> c7535h = (C7535h) super.clone();
            c7535h.f17912d = (int[]) this.f17912d.clone();
            c7535h.f17913e = (Object[]) this.f17913e.clone();
            return c7535h;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E m18443e(int i) {
        return m18442f(i, null);
    }

    /* renamed from: f */
    public E m18442f(int i, E e) {
        int m18510a = C7525c.m18510a(this.f17912d, this.f17914f, i);
        if (m18510a >= 0) {
            Object[] objArr = this.f17913e;
            if (objArr[m18510a] != f17910w) {
                return (E) objArr[m18510a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int m18441g(E e) {
        if (this.f17911c) {
            m18444d();
        }
        for (int i = 0; i < this.f17914f; i++) {
            if (this.f17913e[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public int m18440h(int i) {
        if (this.f17911c) {
            m18444d();
        }
        return this.f17912d[i];
    }

    /* renamed from: i */
    public void m18439i(int i, E e) {
        int m18510a = C7525c.m18510a(this.f17912d, this.f17914f, i);
        if (m18510a >= 0) {
            this.f17913e[m18510a] = e;
            return;
        }
        int i2 = m18510a ^ (-1);
        if (i2 < this.f17914f) {
            Object[] objArr = this.f17913e;
            if (objArr[i2] == f17910w) {
                this.f17912d[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f17911c && this.f17914f >= this.f17912d.length) {
            m18444d();
            i2 = C7525c.m18510a(this.f17912d, this.f17914f, i) ^ (-1);
        }
        int i3 = this.f17914f;
        if (i3 >= this.f17912d.length) {
            int m18506e = C7525c.m18506e(i3 + 1);
            int[] iArr = new int[m18506e];
            Object[] objArr2 = new Object[m18506e];
            int[] iArr2 = this.f17912d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17913e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17912d = iArr;
            this.f17913e = objArr2;
        }
        int i4 = this.f17914f;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f17912d;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f17913e;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f17914f - i2);
        }
        this.f17912d[i2] = i;
        this.f17913e[i2] = e;
        this.f17914f++;
    }

    /* renamed from: j */
    public int m18438j() {
        if (this.f17911c) {
            m18444d();
        }
        return this.f17914f;
    }

    /* renamed from: k */
    public E m18437k(int i) {
        if (this.f17911c) {
            m18444d();
        }
        return (E) this.f17913e[i];
    }

    public String toString() {
        if (m18438j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17914f * 28);
        sb.append('{');
        for (int i = 0; i < this.f17914f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m18440h(i));
            sb.append('=');
            E m18437k = m18437k(i);
            if (m18437k != this) {
                sb.append(m18437k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7535h(int i) {
        this.f17911c = false;
        if (i == 0) {
            this.f17912d = C7525c.f17872a;
            this.f17913e = C7525c.f17874c;
            return;
        }
        int m18506e = C7525c.m18506e(i);
        this.f17912d = new int[m18506e];
        this.f17913e = new Object[m18506e];
    }
}
