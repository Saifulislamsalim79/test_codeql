package p201g.p227h.p237k;
/* compiled from: Pools.java */
/* renamed from: g.h.k.g */
/* loaded from: classes2.dex */
public class C7674g<T> extends C7673f<T> {

    /* renamed from: c */
    private final Object f18397c;

    public C7674g(int i) {
        super(i);
        this.f18397c = new Object();
    }

    @Override // p201g.p227h.p237k.C7673f, p201g.p227h.p237k.InterfaceC7672e
    /* renamed from: a */
    public boolean mo11983a(T t) {
        boolean mo11983a;
        synchronized (this.f18397c) {
            mo11983a = super.mo11983a(t);
        }
        return mo11983a;
    }

    @Override // p201g.p227h.p237k.C7673f, p201g.p227h.p237k.InterfaceC7672e
    /* renamed from: b */
    public T mo11982b() {
        T t;
        synchronized (this.f18397c) {
            t = (T) super.mo11982b();
        }
        return t;
    }
}
