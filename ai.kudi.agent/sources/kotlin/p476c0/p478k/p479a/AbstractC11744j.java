package kotlin.p476c0.p478k.p479a;

import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: ContinuationImpl.kt */
/* renamed from: kotlin.c0.k.a.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11744j extends AbstractC11735a {
    public AbstractC11744j(InterfaceC11714d<Object> interfaceC11714d) {
        super(interfaceC11714d);
        if (interfaceC11714d != null) {
            if (!(interfaceC11714d.getContext() == C11725h.f26446c)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        return C11725h.f26446c;
    }
}
