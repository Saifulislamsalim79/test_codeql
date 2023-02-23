package kotlin.p493j0.p494o.p495c.p497p0.p537k;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: locks.kt */
/* renamed from: kotlin.j0.o.c.p0.k.c */
/* loaded from: classes3.dex */
public final class C12925c extends C12926d {

    /* renamed from: c */
    private final Runnable f28979c;

    /* renamed from: d */
    private final InterfaceC11767l<InterruptedException, C13666w> f28980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12925c(Lock lock, Runnable runnable, InterfaceC11767l<? super InterruptedException, C13666w> interfaceC11767l) {
        super(lock);
        l.f(lock, "lock");
        l.f(runnable, "checkCancelled");
        l.f(interfaceC11767l, "interruptedExceptionHandler");
        this.f28979c = runnable;
        this.f28980d = interfaceC11767l;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12926d, kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12950k
    public void lock() {
        while (!m6412a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f28979c.run();
            } catch (InterruptedException e) {
                this.f28980d.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12925c(Runnable runnable, InterfaceC11767l<? super InterruptedException, C13666w> interfaceC11767l) {
        this(new ReentrantLock(), runnable, interfaceC11767l);
        l.f(runnable, "checkCancelled");
        l.f(interfaceC11767l, "interruptedExceptionHandler");
    }
}
