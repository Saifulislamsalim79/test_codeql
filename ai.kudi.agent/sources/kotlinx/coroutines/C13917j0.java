package kotlinx.coroutines;

import kotlin.C11709c;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: CoroutineExceptionHandler.kt */
/* renamed from: kotlinx.coroutines.j0 */
/* loaded from: classes3.dex */
public final class C13917j0 {
    /* renamed from: a */
    public static final void m3410a(InterfaceC11719g interfaceC11719g, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC11719g.get(CoroutineExceptionHandler.f30180t);
            if (coroutineExceptionHandler == null) {
                C13865i0.m3565a(interfaceC11719g, th);
            } else {
                coroutineExceptionHandler.handleException(interfaceC11719g, th);
            }
        } catch (Throwable th2) {
            C13865i0.m3565a(interfaceC11719g, m3409b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m3409b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C11709c.m10411a(runtimeException, th);
        return runtimeException;
    }
}
