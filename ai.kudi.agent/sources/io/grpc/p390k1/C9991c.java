package io.grpc.p390k1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.util.concurrent.AbstractC5146a;
import com.google.common.util.concurrent.InterfaceFutureC5161c;
import io.grpc.AbstractC9508e;
import io.grpc.AbstractC9524h;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ClientCalls.java */
/* renamed from: io.grpc.k1.c */
/* loaded from: classes2.dex */
public final class C9991c {

    /* renamed from: a */
    private static final Logger f23705a = Logger.getLogger(C9991c.class.getName());

    /* renamed from: b */
    static final C9502d.C9503a<EnumC9995d> f23706b = C9502d.C9503a.m14546b("internal-stub-type");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCalls.java */
    /* renamed from: io.grpc.k1.c$b */
    /* loaded from: classes2.dex */
    public static final class C9993b<RespT> extends AbstractC5146a<RespT> {

        /* renamed from: z */
        private final AbstractC9524h<?, RespT> f23707z;

        C9993b(AbstractC9524h<?, RespT> abstractC9524h) {
            this.f23707z = abstractC9524h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.AbstractC5146a
        /* renamed from: B */
        public boolean mo13350B(RespT respt) {
            return super.mo13350B(respt);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.AbstractC5146a
        /* renamed from: C */
        public boolean mo13349C(Throwable th) {
            return super.mo13349C(th);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a
        /* renamed from: x */
        protected void mo13347x() {
            this.f23707z.mo13081a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a
        /* renamed from: y */
        protected String mo13346y() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("clientCall", this.f23707z);
            return m25812c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCalls.java */
    /* renamed from: io.grpc.k1.c$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9994c<T> extends AbstractC9524h.AbstractC9525a<T> {
        private AbstractC9994c() {
        }

        /* renamed from: e */
        abstract void mo13340e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClientCalls.java */
    /* renamed from: io.grpc.k1.c$d */
    /* loaded from: classes2.dex */
    public enum EnumC9995d {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCalls.java */
    /* renamed from: io.grpc.k1.c$e */
    /* loaded from: classes2.dex */
    public static final class ExecutorC9996e extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: d */
        private static final Logger f23712d = Logger.getLogger(ExecutorC9996e.class.getName());

        /* renamed from: c */
        private volatile Thread f23713c;

        ExecutorC9996e() {
        }

        /* renamed from: d */
        private static void m13345d() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        /* renamed from: e */
        public void m13344e() throws InterruptedException {
            Runnable poll;
            m13345d();
            Runnable poll2 = poll();
            if (poll2 == null) {
                this.f23713c = Thread.currentThread();
                while (true) {
                    try {
                        poll = poll();
                        if (poll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        m13345d();
                    } catch (Throwable th) {
                        this.f23713c = null;
                        throw th;
                    }
                }
                this.f23713c = null;
                poll2 = poll;
            }
            do {
                try {
                    poll2.run();
                } catch (Throwable th2) {
                    f23712d.log(Level.WARNING, "Runnable threw exception", th2);
                }
                poll2 = poll();
            } while (poll2 != null);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            LockSupport.unpark(this.f23713c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCalls.java */
    /* renamed from: io.grpc.k1.c$f */
    /* loaded from: classes2.dex */
    public static final class C9997f<RespT> extends AbstractC9994c<RespT> {

        /* renamed from: a */
        private final C9993b<RespT> f23714a;

        /* renamed from: b */
        private RespT f23715b;

        C9997f(C9993b<RespT> c9993b) {
            super();
            this.f23714a = c9993b;
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: a */
        public void mo13343a(C9497c1 c9497c1, C10049s0 c10049s0) {
            if (c9497c1.m14580p()) {
                if (this.f23715b == null) {
                    this.f23714a.mo13349C(C9497c1.f22194m.m14578r("No value received for unary call").m14591e(c10049s0));
                }
                this.f23714a.mo13350B(this.f23715b);
                return;
            }
            this.f23714a.mo13349C(c9497c1.m14591e(c10049s0));
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: b */
        public void mo13342b(C10049s0 c10049s0) {
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: c */
        public void mo13341c(RespT respt) {
            if (this.f23715b == null) {
                this.f23715b = respt;
                return;
            }
            throw C9497c1.f22194m.m14578r("More than one value received for unary call").m14592d();
        }

        @Override // io.grpc.p390k1.C9991c.AbstractC9994c
        /* renamed from: e */
        void mo13340e() {
            ((C9993b) this.f23714a).f23707z.mo13079c(2);
        }
    }

    private C9991c() {
    }

    /* renamed from: a */
    private static <ReqT, RespT> void m13357a(AbstractC9524h<ReqT, RespT> abstractC9524h, ReqT reqt, AbstractC9994c<RespT> abstractC9994c) {
        m13352f(abstractC9524h, abstractC9994c);
        try {
            abstractC9524h.mo13076d(reqt);
            abstractC9524h.mo13080b();
        } catch (Error e) {
            m13355c(abstractC9524h, e);
            throw null;
        } catch (RuntimeException e2) {
            m13355c(abstractC9524h, e2);
            throw null;
        }
    }

    /* renamed from: b */
    public static <ReqT, RespT> RespT m13356b(AbstractC9508e abstractC9508e, C10060t0<ReqT, RespT> c10060t0, C9502d c9502d, ReqT reqt) {
        ExecutorC9996e executorC9996e = new ExecutorC9996e();
        AbstractC9524h mo13365h = abstractC9508e.mo13365h(c10060t0, c9502d.m14551p(f23706b, EnumC9995d.BLOCKING).m14554m(executorC9996e));
        boolean z = false;
        try {
            try {
                InterfaceFutureC5161c m13354d = m13354d(mo13365h, reqt);
                while (!m13354d.isDone()) {
                    try {
                        executorC9996e.m13344e();
                    } catch (InterruptedException e) {
                        try {
                            mo13365h.mo13081a("Thread interrupted", e);
                            z = true;
                        } catch (Error e2) {
                            e = e2;
                            m13355c(mo13365h, e);
                            throw null;
                        } catch (RuntimeException e3) {
                            e = e3;
                            m13355c(mo13365h, e);
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                RespT respt = (RespT) m13353e(m13354d);
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* renamed from: c */
    private static RuntimeException m13355c(AbstractC9524h<?, ?> abstractC9524h, Throwable th) {
        try {
            abstractC9524h.mo13081a(null, th);
        } catch (Throwable th2) {
            f23705a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
        throw ((RuntimeException) th);
    }

    /* renamed from: d */
    public static <ReqT, RespT> InterfaceFutureC5161c<RespT> m13354d(AbstractC9524h<ReqT, RespT> abstractC9524h, ReqT reqt) {
        C9993b c9993b = new C9993b(abstractC9524h);
        m13357a(abstractC9524h, reqt, new C9997f(c9993b));
        return c9993b;
    }

    /* renamed from: e */
    private static <V> V m13353e(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw C9497c1.f22188g.m14578r("Thread interrupted").m14579q(e).m14592d();
        } catch (ExecutionException e2) {
            throw m13351g(e2.getCause());
        }
    }

    /* renamed from: f */
    private static <ReqT, RespT> void m13352f(AbstractC9524h<ReqT, RespT> abstractC9524h, AbstractC9994c<RespT> abstractC9994c) {
        abstractC9524h.mo13075e(abstractC9994c, new C10049s0());
        abstractC9994c.mo13340e();
    }

    /* renamed from: g */
    private static StatusRuntimeException m13351g(Throwable th) {
        C5051n.m25779o(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                StatusException statusException = (StatusException) th2;
                return new StatusRuntimeException(statusException.m14635a(), statusException.m14634b());
            } else if (th2 instanceof StatusRuntimeException) {
                StatusRuntimeException statusRuntimeException = (StatusRuntimeException) th2;
                return new StatusRuntimeException(statusRuntimeException.m14633a(), statusRuntimeException.m14632b());
            }
        }
        return C9497c1.f22189h.m14578r("unexpected exception").m14579q(th).m14592d();
    }
}
