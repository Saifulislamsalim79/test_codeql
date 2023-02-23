package p425j.p444e.p451f0.p467j;
/* compiled from: OpenHashSet.java */
/* renamed from: j.e.f0.j.k */
/* loaded from: classes3.dex */
public final class C11667k<T> {

    /* renamed from: a */
    final float f26357a;

    /* renamed from: b */
    int f26358b;

    /* renamed from: c */
    int f26359c;

    /* renamed from: d */
    int f26360d;

    /* renamed from: e */
    T[] f26361e;

    public C11667k() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m10627c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean m10629a(T t) {
        T t2;
        T[] tArr = this.f26361e;
        int i = this.f26358b;
        int m10627c = m10627c(t.hashCode()) & i;
        T t3 = tArr[m10627c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                m10627c = (m10627c + 1) & i;
                t2 = tArr[m10627c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[m10627c] = t;
        int i2 = this.f26359c + 1;
        this.f26359c = i2;
        if (i2 >= this.f26360d) {
            m10626d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m10628b() {
        return this.f26361e;
    }

    /* renamed from: d */
    void m10626d() {
        T[] tArr = this.f26361e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f26359c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int m10627c = m10627c(tArr[length].hashCode()) & i2;
                if (tArr2[m10627c] != null) {
                    do {
                        m10627c = (m10627c + 1) & i2;
                    } while (tArr2[m10627c] != null);
                }
                tArr2[m10627c] = tArr[length];
                i3 = i4;
            } else {
                this.f26358b = i2;
                this.f26360d = (int) (i * this.f26357a);
                this.f26361e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m10625e(T t) {
        T t2;
        T[] tArr = this.f26361e;
        int i = this.f26358b;
        int m10627c = m10627c(t.hashCode()) & i;
        T t3 = tArr[m10627c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m10624f(m10627c, tArr, i);
        }
        do {
            m10627c = (m10627c + 1) & i;
            t2 = tArr[m10627c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m10624f(m10627c, tArr, i);
    }

    /* renamed from: f */
    boolean m10624f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f26359c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int m10627c = m10627c(t.hashCode()) & i2;
                if (i > i3) {
                    if (i >= m10627c && m10627c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < m10627c && m10627c <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public C11667k(int i, float f) {
        this.f26357a = f;
        int m10623a = C11668l.m10623a(i);
        this.f26358b = m10623a - 1;
        this.f26360d = (int) (f * m10623a);
        this.f26361e = (T[]) new Object[m10623a];
    }
}
