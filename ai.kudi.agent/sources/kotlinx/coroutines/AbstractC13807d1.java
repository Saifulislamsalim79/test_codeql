package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC13760c1;
/* compiled from: EventLoop.kt */
/* renamed from: kotlinx.coroutines.d1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13807d1 extends AbstractC13756b1 {
    /* renamed from: c1 */
    protected abstract Thread mo3192c1();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d1 */
    public final void m3624d1(long j, AbstractC13760c1.AbstractRunnableC13761a abstractRunnableC13761a) {
        if (C13952q0.m3345a()) {
            if (!(this != RunnableC14039s0.f30618y)) {
                throw new AssertionError();
            }
        }
        RunnableC14039s0.f30618y.m3736o1(j, abstractRunnableC13761a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e1 */
    public final void m3623e1() {
        Thread mo3192c1 = mo3192c1();
        if (Thread.currentThread() != mo3192c1) {
            AbstractC13805d m3622a = C13809e.m3622a();
            if (m3622a == null) {
                LockSupport.unpark(mo3192c1);
            } else {
                m3622a.m3627f(mo3192c1);
            }
        }
    }
}
