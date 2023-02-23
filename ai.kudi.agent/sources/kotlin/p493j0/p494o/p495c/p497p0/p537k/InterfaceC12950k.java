package kotlin.p493j0.p494o.p495c.p497p0.p537k;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: locks.kt */
/* renamed from: kotlin.j0.o.c.p0.k.k */
/* loaded from: classes3.dex */
public interface InterfaceC12950k {

    /* renamed from: a */
    public static final C12951a f29007a = C12951a.f29008a;

    /* compiled from: locks.kt */
    /* renamed from: kotlin.j0.o.c.p0.k.k$a */
    /* loaded from: classes3.dex */
    public static final class C12951a {

        /* renamed from: a */
        static final /* synthetic */ C12951a f29008a = new C12951a();

        private C12951a() {
        }

        /* renamed from: a */
        public final C12926d m6375a(Runnable runnable, InterfaceC11767l<? super InterruptedException, C13666w> interfaceC11767l) {
            if (runnable != null && interfaceC11767l != null) {
                return new C12925c(runnable, interfaceC11767l);
            }
            return new C12926d(null, 1, null);
        }
    }

    void lock();

    void unlock();
}
