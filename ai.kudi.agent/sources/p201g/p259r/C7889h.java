package p201g.p259r;

import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.channels.InterfaceC13801x;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: FlowExt.kt */
/* renamed from: g.r.h */
/* loaded from: classes2.dex */
public final class C7889h<T> implements InterfaceC13969e<T> {

    /* renamed from: c */
    private final InterfaceC13801x<T> f18892c;

    /* JADX WARN: Multi-variable type inference failed */
    public C7889h(InterfaceC13801x<? super T> interfaceC13801x) {
        l.f(interfaceC13801x, "channel");
        this.f18892c = interfaceC13801x;
    }

    /* renamed from: a */
    public final InterfaceC13801x<T> m17110a() {
        return this.f18892c;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3639o = m17110a().mo3639o(t, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
    }
}
