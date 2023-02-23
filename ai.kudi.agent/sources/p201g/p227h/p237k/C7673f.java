package p201g.p227h.p237k;
/* compiled from: Pools.java */
/* renamed from: g.h.k.f */
/* loaded from: classes2.dex */
public class C7673f<T> implements InterfaceC7672e<T> {

    /* renamed from: a */
    private final Object[] f18395a;

    /* renamed from: b */
    private int f18396b;

    public C7673f(int i) {
        if (i > 0) {
            this.f18395a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m17872c(T t) {
        for (int i = 0; i < this.f18396b; i++) {
            if (this.f18395a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p201g.p227h.p237k.InterfaceC7672e
    /* renamed from: a */
    public boolean mo11983a(T t) {
        if (!m17872c(t)) {
            int i = this.f18396b;
            Object[] objArr = this.f18395a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f18396b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // p201g.p227h.p237k.InterfaceC7672e
    /* renamed from: b */
    public T mo11982b() {
        int i = this.f18396b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f18395a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f18396b = i - 1;
            return t;
        }
        return null;
    }
}
