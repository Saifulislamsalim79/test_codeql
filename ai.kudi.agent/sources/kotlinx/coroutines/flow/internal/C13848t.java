package kotlinx.coroutines.flow.internal;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.channels.InterfaceC13801x;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: SendingCollector.kt */
/* renamed from: kotlinx.coroutines.flow.internal.t */
/* loaded from: classes3.dex */
public final class C13848t<T> implements InterfaceC13969e<T> {

    /* renamed from: c */
    private final InterfaceC13801x<T> f30321c;

    /* JADX WARN: Multi-variable type inference failed */
    public C13848t(InterfaceC13801x<? super T> interfaceC13801x) {
        this.f30321c = interfaceC13801x;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3639o = this.f30321c.mo3639o(t, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
    }
}
