package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.internal.InterfaceC13880e0;
/* compiled from: ThreadSafeHeap.kt */
/* renamed from: kotlinx.coroutines.internal.d0 */
/* loaded from: classes3.dex */
public class C13878d0<T extends InterfaceC13880e0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f30350a;

    /* renamed from: f */
    private final T[] m3538f() {
        T[] tArr = this.f30350a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC13880e0[4];
            this.f30350a = tArr2;
            return tArr2;
        } else if (m3541c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m3541c() * 2);
            kotlin.e0.d.l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((InterfaceC13880e0[]) copyOf);
            this.f30350a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    /* renamed from: j */
    private final void m3534j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m3533k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m3541c()) {
                return;
            }
            T[] tArr = this.f30350a;
            kotlin.e0.d.l.d(tArr);
            int i3 = i2 + 1;
            if (i3 < m3541c()) {
                T t = tArr[i3];
                kotlin.e0.d.l.d(t);
                T t2 = tArr[i2];
                kotlin.e0.d.l.d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            kotlin.e0.d.l.d(t3);
            T t4 = tArr[i2];
            kotlin.e0.d.l.d(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m3531m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    private final void m3532l(int i) {
        while (i > 0) {
            T[] tArr = this.f30350a;
            kotlin.e0.d.l.d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            kotlin.e0.d.l.d(t);
            T t2 = tArr[i];
            kotlin.e0.d.l.d(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m3531m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    private final void m3531m(int i, int i2) {
        T[] tArr = this.f30350a;
        kotlin.e0.d.l.d(tArr);
        T t = tArr[i2];
        kotlin.e0.d.l.d(t);
        T t2 = tArr[i];
        kotlin.e0.d.l.d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo3528g(i);
        t2.mo3528g(i2);
    }

    /* renamed from: a */
    public final void m3543a(T t) {
        if (C13952q0.m3345a()) {
            if (!(t.mo3529e() == null)) {
                throw new AssertionError();
            }
        }
        t.mo3530a(this);
        T[] m3538f = m3538f();
        int m3541c = m3541c();
        m3534j(m3541c + 1);
        m3538f[m3541c] = t;
        t.mo3528g(m3541c);
        m3532l(m3541c);
    }

    /* renamed from: b */
    public final T m3542b() {
        T[] tArr = this.f30350a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int m3541c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m3540d() {
        return m3541c() == 0;
    }

    /* renamed from: e */
    public final T m3539e() {
        T m3542b;
        synchronized (this) {
            m3542b = m3542b();
        }
        return m3542b;
    }

    /* renamed from: g */
    public final boolean m3537g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.mo3529e() == null) {
                z = false;
            } else {
                int mo3527h = t.mo3527h();
                if (C13952q0.m3345a()) {
                    if (!(mo3527h >= 0)) {
                        throw new AssertionError();
                    }
                }
                m3536h(mo3527h);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T m3536h(int i) {
        if (C13952q0.m3345a()) {
            if (!(m3541c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f30350a;
        kotlin.e0.d.l.d(tArr);
        m3534j(m3541c() - 1);
        if (i < m3541c()) {
            m3531m(i, m3541c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                kotlin.e0.d.l.d(t);
                T t2 = tArr[i2];
                kotlin.e0.d.l.d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m3531m(i, i2);
                    m3532l(i2);
                }
            }
            m3533k(i);
        }
        T t3 = tArr[m3541c()];
        kotlin.e0.d.l.d(t3);
        if (C13952q0.m3345a()) {
            if (!(t3.mo3529e() == this)) {
                throw new AssertionError();
            }
        }
        t3.mo3530a(null);
        t3.mo3528g(-1);
        tArr[m3541c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T m3535i() {
        T m3536h;
        synchronized (this) {
            m3536h = m3541c() > 0 ? m3536h(0) : null;
        }
        return m3536h;
    }
}
