package kotlin;

import java.io.Serializable;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: Lazy.kt */
/* renamed from: kotlin.x */
/* loaded from: classes3.dex */
public final class C13667x<T> implements InterfaceC11824h<T>, Serializable {

    /* renamed from: c */
    private InterfaceC11756a<? extends T> f30113c;

    /* renamed from: d */
    private Object f30114d;

    public C13667x(InterfaceC11756a<? extends T> interfaceC11756a) {
        kotlin.e0.d.l.f(interfaceC11756a, "initializer");
        this.f30113c = interfaceC11756a;
        this.f30114d = C13665v.f30111a;
    }

    /* renamed from: a */
    public boolean m4226a() {
        return this.f30114d != C13665v.f30111a;
    }

    @Override // kotlin.InterfaceC11824h
    public T getValue() {
        if (this.f30114d == C13665v.f30111a) {
            InterfaceC11756a<? extends T> interfaceC11756a = this.f30113c;
            kotlin.e0.d.l.d(interfaceC11756a);
            this.f30114d = interfaceC11756a.invoke();
            this.f30113c = null;
        }
        return (T) this.f30114d;
    }

    public String toString() {
        return m4226a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
