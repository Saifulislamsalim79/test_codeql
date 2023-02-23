package kotlinx.coroutines;

import java.util.List;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* renamed from: kotlinx.coroutines.i0 */
/* loaded from: classes3.dex */
public final class C13865i0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f30335a;

    static {
        InterfaceC13230h m5588a;
        List<CoroutineExceptionHandler> m5563x;
        m5588a = C13234l.m5588a(a.a());
        m5563x = C13242n.m5563x(m5588a);
        f30335a = m5563x;
    }

    /* renamed from: a */
    public static final void m3565a(InterfaceC11719g interfaceC11719g, Throwable th) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : f30335a) {
            try {
                coroutineExceptionHandler.handleException(interfaceC11719g, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C13917j0.m3409b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
