package kotlin.p493j0.p494o.p495c.p497p0.p537k;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: locks.kt */
/* renamed from: kotlin.j0.o.c.p0.k.d */
/* loaded from: classes3.dex */
public class C12926d implements InterfaceC12950k {

    /* renamed from: b */
    private final Lock f28981b;

    public C12926d(Lock lock) {
        l.f(lock, "lock");
        this.f28981b = lock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Lock m6412a() {
        return this.f28981b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12950k
    public void lock() {
        this.f28981b.lock();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12950k
    public void unlock() {
        this.f28981b.unlock();
    }

    public /* synthetic */ C12926d(Lock lock, int i, g gVar) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
