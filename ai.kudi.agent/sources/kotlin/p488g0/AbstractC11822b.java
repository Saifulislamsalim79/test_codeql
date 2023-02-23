package kotlin.p488g0;

import kotlin.e0.d.l;
import kotlin.p493j0.InterfaceC11872i;
/* compiled from: ObservableProperty.kt */
/* renamed from: kotlin.g0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11822b<V> implements InterfaceC11823c<Object, V> {

    /* renamed from: a */
    private V f26508a;

    public AbstractC11822b(V v) {
        this.f26508a = v;
    }

    @Override // kotlin.p488g0.InterfaceC11823c
    /* renamed from: a */
    public void mo10299a(Object obj, InterfaceC11872i<?> interfaceC11872i, V v) {
        l.f(interfaceC11872i, "property");
        V v2 = this.f26508a;
        if (mo7089d(interfaceC11872i, v2, v)) {
            this.f26508a = v;
            m10300c(interfaceC11872i, v2, v);
        }
    }

    @Override // kotlin.p488g0.InterfaceC11823c
    /* renamed from: b */
    public V mo10298b(Object obj, InterfaceC11872i<?> interfaceC11872i) {
        l.f(interfaceC11872i, "property");
        return this.f26508a;
    }

    /* renamed from: c */
    protected void m10300c(InterfaceC11872i<?> interfaceC11872i, V v, V v2) {
        l.f(interfaceC11872i, "property");
    }

    /* renamed from: d */
    protected boolean mo7089d(InterfaceC11872i<?> interfaceC11872i, V v, V v2) {
        l.f(interfaceC11872i, "property");
        return true;
    }
}
