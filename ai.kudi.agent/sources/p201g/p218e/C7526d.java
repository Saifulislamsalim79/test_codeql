package p201g.p218e;
/* compiled from: LongSparseArray.java */
/* renamed from: g.e.d */
/* loaded from: classes2.dex */
public class C7526d<E> implements Cloneable {

    /* renamed from: w */
    private static final Object f17875w = new Object();

    /* renamed from: c */
    private boolean f17876c;

    /* renamed from: d */
    private long[] f17877d;

    /* renamed from: e */
    private Object[] f17878e;

    /* renamed from: f */
    private int f17879f;

    public C7526d() {
        this(10);
    }

    /* renamed from: e */
    private void m18500e() {
        int i = this.f17879f;
        long[] jArr = this.f17877d;
        Object[] objArr = this.f17878e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f17875w) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f17876c = false;
        this.f17879f = i2;
    }

    /* renamed from: a */
    public void m18504a(long j, E e) {
        int i = this.f17879f;
        if (i != 0 && j <= this.f17877d[i - 1]) {
            m18494k(j, e);
            return;
        }
        if (this.f17876c && this.f17879f >= this.f17877d.length) {
            m18500e();
        }
        int i2 = this.f17879f;
        if (i2 >= this.f17877d.length) {
            int m18505f = C7525c.m18505f(i2 + 1);
            long[] jArr = new long[m18505f];
            Object[] objArr = new Object[m18505f];
            long[] jArr2 = this.f17877d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f17878e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17877d = jArr;
            this.f17878e = objArr;
        }
        this.f17877d[i2] = j;
        this.f17878e[i2] = e;
        this.f17879f = i2 + 1;
    }

    /* renamed from: b */
    public void m18503b() {
        int i = this.f17879f;
        Object[] objArr = this.f17878e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f17879f = 0;
        this.f17876c = false;
    }

    /* renamed from: c */
    public C7526d<E> clone() {
        try {
            C7526d<E> c7526d = (C7526d) super.clone();
            c7526d.f17877d = (long[]) this.f17877d.clone();
            c7526d.f17878e = (Object[]) this.f17878e.clone();
            return c7526d;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean m18501d(long j) {
        return m18497h(j) >= 0;
    }

    /* renamed from: f */
    public E m18499f(long j) {
        return m18498g(j, null);
    }

    /* renamed from: g */
    public E m18498g(long j, E e) {
        int m18509b = C7525c.m18509b(this.f17877d, this.f17879f, j);
        if (m18509b >= 0) {
            Object[] objArr = this.f17878e;
            if (objArr[m18509b] != f17875w) {
                return (E) objArr[m18509b];
            }
        }
        return e;
    }

    /* renamed from: h */
    public int m18497h(long j) {
        if (this.f17876c) {
            m18500e();
        }
        return C7525c.m18509b(this.f17877d, this.f17879f, j);
    }

    /* renamed from: i */
    public boolean m18496i() {
        return m18491o() == 0;
    }

    /* renamed from: j */
    public long m18495j(int i) {
        if (this.f17876c) {
            m18500e();
        }
        return this.f17877d[i];
    }

    /* renamed from: k */
    public void m18494k(long j, E e) {
        int m18509b = C7525c.m18509b(this.f17877d, this.f17879f, j);
        if (m18509b >= 0) {
            this.f17878e[m18509b] = e;
            return;
        }
        int i = m18509b ^ (-1);
        if (i < this.f17879f) {
            Object[] objArr = this.f17878e;
            if (objArr[i] == f17875w) {
                this.f17877d[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f17876c && this.f17879f >= this.f17877d.length) {
            m18500e();
            i = C7525c.m18509b(this.f17877d, this.f17879f, j) ^ (-1);
        }
        int i2 = this.f17879f;
        if (i2 >= this.f17877d.length) {
            int m18505f = C7525c.m18505f(i2 + 1);
            long[] jArr = new long[m18505f];
            Object[] objArr2 = new Object[m18505f];
            long[] jArr2 = this.f17877d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f17878e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17877d = jArr;
            this.f17878e = objArr2;
        }
        int i3 = this.f17879f;
        if (i3 - i != 0) {
            long[] jArr3 = this.f17877d;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f17878e;
            System.arraycopy(objArr4, i, objArr4, i4, this.f17879f - i);
        }
        this.f17877d[i] = j;
        this.f17878e[i] = e;
        this.f17879f++;
    }

    /* renamed from: l */
    public void m18493l(long j) {
        int m18509b = C7525c.m18509b(this.f17877d, this.f17879f, j);
        if (m18509b >= 0) {
            Object[] objArr = this.f17878e;
            Object obj = objArr[m18509b];
            Object obj2 = f17875w;
            if (obj != obj2) {
                objArr[m18509b] = obj2;
                this.f17876c = true;
            }
        }
    }

    /* renamed from: n */
    public void m18492n(int i) {
        Object[] objArr = this.f17878e;
        Object obj = objArr[i];
        Object obj2 = f17875w;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f17876c = true;
        }
    }

    /* renamed from: o */
    public int m18491o() {
        if (this.f17876c) {
            m18500e();
        }
        return this.f17879f;
    }

    /* renamed from: p */
    public E m18490p(int i) {
        if (this.f17876c) {
            m18500e();
        }
        return (E) this.f17878e[i];
    }

    public String toString() {
        if (m18491o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17879f * 28);
        sb.append('{');
        for (int i = 0; i < this.f17879f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m18495j(i));
            sb.append('=');
            E m18490p = m18490p(i);
            if (m18490p != this) {
                sb.append(m18490p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7526d(int i) {
        this.f17876c = false;
        if (i == 0) {
            this.f17877d = C7525c.f17873b;
            this.f17878e = C7525c.f17874c;
            return;
        }
        int m18505f = C7525c.m18505f(i);
        this.f17877d = new long[m18505f];
        this.f17878e = new Object[m18505f];
    }
}
