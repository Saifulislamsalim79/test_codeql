package p201g.p219f.p223b;
/* compiled from: Pools.java */
/* renamed from: g.f.b.g */
/* loaded from: classes2.dex */
class C7548g<T> implements InterfaceC7547f<T> {

    /* renamed from: a */
    private final Object[] f17996a;

    /* renamed from: b */
    private int f17997b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7548g(int i) {
        if (i > 0) {
            this.f17996a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p201g.p219f.p223b.InterfaceC7547f
    /* renamed from: a */
    public boolean mo18377a(T t) {
        int i = this.f17997b;
        Object[] objArr = this.f17996a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f17997b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p201g.p219f.p223b.InterfaceC7547f
    /* renamed from: b */
    public T mo18376b() {
        int i = this.f17997b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f17996a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f17997b = i - 1;
            return t;
        }
        return null;
    }

    @Override // p201g.p219f.p223b.InterfaceC7547f
    /* renamed from: c */
    public void mo18375c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f17997b;
            Object[] objArr = this.f17996a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f17997b = i3 + 1;
            }
        }
    }
}
