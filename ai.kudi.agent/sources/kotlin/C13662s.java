package kotlin;

import java.io.Serializable;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: LazyJVM.kt */
/* renamed from: kotlin.s */
/* loaded from: classes3.dex */
final class C13662s<T> implements InterfaceC11824h<T>, Serializable {

    /* renamed from: c */
    private InterfaceC11756a<? extends T> f30105c;

    /* renamed from: d */
    private volatile Object f30106d;

    /* renamed from: e */
    private final Object f30107e;

    public C13662s(InterfaceC11756a<? extends T> interfaceC11756a, Object obj) {
        kotlin.e0.d.l.f(interfaceC11756a, "initializer");
        this.f30105c = interfaceC11756a;
        this.f30106d = C13665v.f30111a;
        this.f30107e = obj == null ? this : obj;
    }

    /* renamed from: a */
    public boolean m4233a() {
        return this.f30106d != C13665v.f30111a;
    }

    @Override // kotlin.InterfaceC11824h
    public T getValue() {
        T t;
        T t2 = (T) this.f30106d;
        if (t2 != C13665v.f30111a) {
            return t2;
        }
        synchronized (this.f30107e) {
            t = (T) this.f30106d;
            if (t == C13665v.f30111a) {
                InterfaceC11756a<? extends T> interfaceC11756a = this.f30105c;
                kotlin.e0.d.l.d(interfaceC11756a);
                t = interfaceC11756a.invoke();
                this.f30106d = t;
                this.f30105c = null;
            }
        }
        return t;
    }

    public String toString() {
        return m4233a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C13662s(InterfaceC11756a interfaceC11756a, Object obj, int i, kotlin.e0.d.g gVar) {
        this(interfaceC11756a, (i & 2) != 0 ? null : obj);
    }
}
