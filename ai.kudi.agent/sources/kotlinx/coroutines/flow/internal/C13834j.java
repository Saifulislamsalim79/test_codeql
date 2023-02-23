package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.internal.C13912w;
/* compiled from: FlowCoroutine.kt */
/* renamed from: kotlinx.coroutines.flow.internal.j */
/* loaded from: classes3.dex */
final class C13834j<T> extends C13912w<T> {
    public C13834j(InterfaceC11719g interfaceC11719g, InterfaceC11714d<? super T> interfaceC11714d) {
        super(interfaceC11719g, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: D */
    public boolean mo3054D(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m2997y(th);
    }
}
