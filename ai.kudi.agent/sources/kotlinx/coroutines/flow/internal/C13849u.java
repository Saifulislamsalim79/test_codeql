package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.u */
/* loaded from: classes3.dex */
final class C13849u<T> implements InterfaceC11714d<T>, InterfaceC11739e {

    /* renamed from: c */
    private final InterfaceC11714d<T> f30322c;

    /* renamed from: d */
    private final InterfaceC11719g f30323d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13849u(InterfaceC11714d<? super T> interfaceC11714d, InterfaceC11719g interfaceC11719g) {
        this.f30322c = interfaceC11714d;
        this.f30323d = interfaceC11719g;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f30322c;
        if (interfaceC11714d instanceof InterfaceC11739e) {
            return (InterfaceC11739e) interfaceC11714d;
        }
        return null;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        return this.f30323d;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        this.f30322c.resumeWith(obj);
    }
}
