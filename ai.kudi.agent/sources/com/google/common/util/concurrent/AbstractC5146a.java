package com.google.common.util.concurrent;

import ai.kudi.agent.kshock.data.model.LoanStatusType;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import com.google.common.base.C5051n;
import com.google.common.base.C5057q;
import com.google.common.base.C5059s;
import com.google.common.util.concurrent.p110h.AbstractC5167a;
import com.google.common.util.concurrent.p110h.C5168b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: AbstractFuture.java */
/* renamed from: com.google.common.util.concurrent.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5146a<V> extends AbstractC5167a implements InterfaceFutureC5161c<V> {

    /* renamed from: f */
    private static final boolean f12830f;

    /* renamed from: w */
    private static final Logger f12831w;

    /* renamed from: x */
    private static final AbstractC5148b f12832x;

    /* renamed from: y */
    private static final Object f12833y;

    /* renamed from: c */
    private volatile Object f12834c;

    /* renamed from: d */
    private volatile C5152e f12835d;

    /* renamed from: e */
    private volatile C5159k f12836e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5148b {
        private AbstractC5148b() {
        }

        /* renamed from: a */
        abstract boolean mo25498a(AbstractC5146a<?> abstractC5146a, C5152e c5152e, C5152e c5152e2);

        /* renamed from: b */
        abstract boolean mo25497b(AbstractC5146a<?> abstractC5146a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo25496c(AbstractC5146a<?> abstractC5146a, C5159k c5159k, C5159k c5159k2);

        /* renamed from: d */
        abstract void mo25495d(C5159k c5159k, C5159k c5159k2);

        /* renamed from: e */
        abstract void mo25494e(C5159k c5159k, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$c */
    /* loaded from: classes2.dex */
    public static final class C5149c {

        /* renamed from: c */
        static final C5149c f12837c;

        /* renamed from: d */
        static final C5149c f12838d;

        /* renamed from: a */
        final boolean f12839a;

        /* renamed from: b */
        final Throwable f12840b;

        static {
            if (AbstractC5146a.f12830f) {
                f12838d = null;
                f12837c = null;
                return;
            }
            f12838d = new C5149c(false, null);
            f12837c = new C5149c(true, null);
        }

        C5149c(boolean z, Throwable th) {
            this.f12839a = z;
            this.f12840b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$d */
    /* loaded from: classes2.dex */
    public static final class C5150d {

        /* renamed from: a */
        final Throwable f12841a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* loaded from: classes2.dex */
        class C5151a extends Throwable {
            C5151a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C5150d(new C5151a("Failure occurred while trying to finish a future."));
        }

        C5150d(Throwable th) {
            C5051n.m25780n(th);
            this.f12841a = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$e */
    /* loaded from: classes2.dex */
    public static final class C5152e {

        /* renamed from: d */
        static final C5152e f12842d = new C5152e(null, null);

        /* renamed from: a */
        final Runnable f12843a;

        /* renamed from: b */
        final Executor f12844b;

        /* renamed from: c */
        C5152e f12845c;

        C5152e(Runnable runnable, Executor executor) {
            this.f12843a = runnable;
            this.f12844b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$f */
    /* loaded from: classes2.dex */
    private static final class C5153f extends AbstractC5148b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C5159k, Thread> f12846a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C5159k, C5159k> f12847b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC5146a, C5159k> f12848c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC5146a, C5152e> f12849d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC5146a, Object> f12850e;

        C5153f(AtomicReferenceFieldUpdater<C5159k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C5159k, C5159k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC5146a, C5159k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC5146a, C5152e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC5146a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f12846a = atomicReferenceFieldUpdater;
            this.f12847b = atomicReferenceFieldUpdater2;
            this.f12848c = atomicReferenceFieldUpdater3;
            this.f12849d = atomicReferenceFieldUpdater4;
            this.f12850e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: a */
        boolean mo25498a(AbstractC5146a<?> abstractC5146a, C5152e c5152e, C5152e c5152e2) {
            return this.f12849d.compareAndSet(abstractC5146a, c5152e, c5152e2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: b */
        boolean mo25497b(AbstractC5146a<?> abstractC5146a, Object obj, Object obj2) {
            return this.f12850e.compareAndSet(abstractC5146a, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: c */
        boolean mo25496c(AbstractC5146a<?> abstractC5146a, C5159k c5159k, C5159k c5159k2) {
            return this.f12848c.compareAndSet(abstractC5146a, c5159k, c5159k2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: d */
        void mo25495d(C5159k c5159k, C5159k c5159k2) {
            this.f12847b.lazySet(c5159k, c5159k2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: e */
        void mo25494e(C5159k c5159k, Thread thread) {
            this.f12846a.lazySet(c5159k, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$g */
    /* loaded from: classes2.dex */
    public static final class RunnableC5154g<V> implements Runnable {

        /* renamed from: c */
        final AbstractC5146a<V> f12851c;

        /* renamed from: d */
        final InterfaceFutureC5161c<? extends V> f12852d;

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC5146a) this.f12851c).f12834c != this) {
                return;
            }
            if (AbstractC5146a.f12832x.mo25497b(this.f12851c, this, AbstractC5146a.m25501v(this.f12852d))) {
                AbstractC5146a.m25504s(this.f12851c);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$h */
    /* loaded from: classes2.dex */
    private static final class C5155h extends AbstractC5148b {
        private C5155h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: a */
        boolean mo25498a(AbstractC5146a<?> abstractC5146a, C5152e c5152e, C5152e c5152e2) {
            synchronized (abstractC5146a) {
                if (((AbstractC5146a) abstractC5146a).f12835d == c5152e) {
                    ((AbstractC5146a) abstractC5146a).f12835d = c5152e2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: b */
        boolean mo25497b(AbstractC5146a<?> abstractC5146a, Object obj, Object obj2) {
            synchronized (abstractC5146a) {
                if (((AbstractC5146a) abstractC5146a).f12834c == obj) {
                    ((AbstractC5146a) abstractC5146a).f12834c = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: c */
        boolean mo25496c(AbstractC5146a<?> abstractC5146a, C5159k c5159k, C5159k c5159k2) {
            synchronized (abstractC5146a) {
                if (((AbstractC5146a) abstractC5146a).f12836e == c5159k) {
                    ((AbstractC5146a) abstractC5146a).f12836e = c5159k2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: d */
        void mo25495d(C5159k c5159k, C5159k c5159k2) {
            c5159k.f12861b = c5159k2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: e */
        void mo25494e(C5159k c5159k, Thread thread) {
            c5159k.f12860a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$i */
    /* loaded from: classes2.dex */
    static abstract class AbstractC5156i<V> extends AbstractC5146a<V> implements Object<V> {
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$j */
    /* loaded from: classes2.dex */
    private static final class C5157j extends AbstractC5148b {

        /* renamed from: a */
        static final Unsafe f12853a;

        /* renamed from: b */
        static final long f12854b;

        /* renamed from: c */
        static final long f12855c;

        /* renamed from: d */
        static final long f12856d;

        /* renamed from: e */
        static final long f12857e;

        /* renamed from: f */
        static final long f12858f;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.a$j$a */
        /* loaded from: classes2.dex */
        class C5158a implements PrivilegedExceptionAction<Unsafe> {
            C5158a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() throws Exception {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C5158a());
            }
            try {
                f12855c = unsafe.objectFieldOffset(AbstractC5146a.class.getDeclaredField("e"));
                f12854b = unsafe.objectFieldOffset(AbstractC5146a.class.getDeclaredField("d"));
                f12856d = unsafe.objectFieldOffset(AbstractC5146a.class.getDeclaredField("c"));
                f12857e = unsafe.objectFieldOffset(C5159k.class.getDeclaredField("a"));
                f12858f = unsafe.objectFieldOffset(C5159k.class.getDeclaredField("b"));
                f12853a = unsafe;
            } catch (Exception e2) {
                C5059s.m25750f(e2);
                throw new RuntimeException(e2);
            }
        }

        private C5157j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: a */
        boolean mo25498a(AbstractC5146a<?> abstractC5146a, C5152e c5152e, C5152e c5152e2) {
            return f12853a.compareAndSwapObject(abstractC5146a, f12854b, c5152e, c5152e2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: b */
        boolean mo25497b(AbstractC5146a<?> abstractC5146a, Object obj, Object obj2) {
            return f12853a.compareAndSwapObject(abstractC5146a, f12856d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: c */
        boolean mo25496c(AbstractC5146a<?> abstractC5146a, C5159k c5159k, C5159k c5159k2) {
            return f12853a.compareAndSwapObject(abstractC5146a, f12855c, c5159k, c5159k2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: d */
        void mo25495d(C5159k c5159k, C5159k c5159k2) {
            f12853a.putObject(c5159k, f12858f, c5159k2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5146a.AbstractC5148b
        /* renamed from: e */
        void mo25494e(C5159k c5159k, Thread thread) {
            f12853a.putObject(c5159k, f12857e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$k */
    /* loaded from: classes2.dex */
    public static final class C5159k {

        /* renamed from: c */
        static final C5159k f12859c = new C5159k(false);

        /* renamed from: a */
        volatile Thread f12860a;

        /* renamed from: b */
        volatile C5159k f12861b;

        C5159k(boolean z) {
        }

        /* renamed from: a */
        void m25492a(C5159k c5159k) {
            AbstractC5146a.f12832x.mo25495d(this, c5159k);
        }

        /* renamed from: b */
        void m25491b() {
            Thread thread = this.f12860a;
            if (thread != null) {
                this.f12860a = null;
                LockSupport.unpark(thread);
            }
        }

        C5159k() {
            AbstractC5146a.f12832x.mo25494e(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        AbstractC5148b c5155h;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f12830f = z;
        f12831w = Logger.getLogger(AbstractC5146a.class.getName());
        Throwable th = null;
        try {
            c5155h = new C5157j();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c5155h = new C5153f(AtomicReferenceFieldUpdater.newUpdater(C5159k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C5159k.class, C5159k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5146a.class, C5159k.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5146a.class, C5152e.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5146a.class, Object.class, "c"));
            } catch (Throwable th3) {
                c5155h = new C5155h();
                th = th3;
            }
        }
        f12832x = c5155h;
        if (th != null) {
            f12831w.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f12831w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12833y = new Object();
    }

    /* renamed from: A */
    private void m25522A(C5159k c5159k) {
        c5159k.f12860a = null;
        while (true) {
            C5159k c5159k2 = this.f12836e;
            if (c5159k2 == C5159k.f12859c) {
                return;
            }
            C5159k c5159k3 = null;
            while (c5159k2 != null) {
                C5159k c5159k4 = c5159k2.f12861b;
                if (c5159k2.f12860a != null) {
                    c5159k3 = c5159k2;
                } else if (c5159k3 != null) {
                    c5159k3.f12861b = c5159k4;
                    if (c5159k3.f12860a == null) {
                        break;
                    }
                } else if (!f12832x.mo25496c(this, c5159k2, c5159k4)) {
                    break;
                }
                c5159k2 = c5159k4;
            }
            return;
        }
    }

    /* renamed from: l */
    private void m25511l(StringBuilder sb) {
        try {
            Object m25500w = m25500w(this);
            sb.append("SUCCESS, result=[");
            m25508o(sb, m25500w);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append(LoanStatusType.CANCELLED);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* renamed from: m */
    private void m25510m(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append(KShockActivity.PAYBACK_PENDING);
        Object obj = this.f12834c;
        if (obj instanceof RunnableC5154g) {
            sb.append(", setFuture=[");
            m25507p(sb, ((RunnableC5154g) obj).f12852d);
            sb.append("]");
        } else {
            try {
                sb2 = C5057q.m25759a(mo13346y());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(valueOf);
                sb2 = sb3.toString();
            }
            if (sb2 != null) {
                sb.append(", info=[");
                sb.append(sb2);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m25511l(sb);
        }
    }

    /* renamed from: o */
    private void m25508o(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: p */
    private void m25507p(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* renamed from: q */
    private static CancellationException m25506q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: r */
    private C5152e m25505r(C5152e c5152e) {
        C5152e c5152e2;
        do {
            c5152e2 = this.f12835d;
        } while (!f12832x.mo25498a(this, c5152e2, C5152e.f12842d));
        C5152e c5152e3 = c5152e;
        C5152e c5152e4 = c5152e2;
        while (c5152e4 != null) {
            C5152e c5152e5 = c5152e4.f12845c;
            c5152e4.f12845c = c5152e3;
            c5152e3 = c5152e4;
            c5152e4 = c5152e5;
        }
        return c5152e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.common.util.concurrent.a, com.google.common.util.concurrent.a<V>] */
    /* renamed from: s */
    public static void m25504s(AbstractC5146a<?> abstractC5146a) {
        C5152e c5152e = null;
        while (true) {
            abstractC5146a.m25499z();
            abstractC5146a.m25509n();
            C5152e m25505r = abstractC5146a.m25505r(c5152e);
            while (m25505r != null) {
                c5152e = m25505r.f12845c;
                Runnable runnable = m25505r.f12843a;
                if (runnable instanceof RunnableC5154g) {
                    RunnableC5154g runnableC5154g = (RunnableC5154g) runnable;
                    abstractC5146a = runnableC5154g.f12851c;
                    if (((AbstractC5146a) abstractC5146a).f12834c == runnableC5154g) {
                        if (f12832x.mo25497b(abstractC5146a, runnableC5154g, m25501v(runnableC5154g.f12852d))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m25503t(runnable, m25505r.f12844b);
                }
                m25505r = c5152e;
            }
            return;
        }
    }

    /* renamed from: t */
    private static void m25503t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f12831w;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private V m25502u(Object obj) throws ExecutionException {
        if (!(obj instanceof C5149c)) {
            if (!(obj instanceof C5150d)) {
                if (obj == f12833y) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C5150d) obj).f12841a);
        }
        throw m25506q("Task was cancelled.", ((C5149c) obj).f12840b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static Object m25501v(InterfaceFutureC5161c<?> interfaceFutureC5161c) {
        Throwable m25480a;
        if ((interfaceFutureC5161c instanceof AbstractC5167a) && (m25480a = C5168b.m25480a((AbstractC5167a) interfaceFutureC5161c)) != null) {
            return new C5150d(m25480a);
        }
        boolean isCancelled = interfaceFutureC5161c.isCancelled();
        if ((!f12830f) & isCancelled) {
            return C5149c.f12838d;
        }
        try {
            Object m25500w = m25500w(interfaceFutureC5161c);
            if (!isCancelled) {
                return m25500w == null ? f12833y : m25500w;
            }
            String valueOf = String.valueOf(interfaceFutureC5161c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new C5149c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (!isCancelled) {
                String valueOf2 = String.valueOf(interfaceFutureC5161c);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(valueOf2);
                return new C5150d(new IllegalArgumentException(sb2.toString(), e));
            }
            return new C5149c(false, e);
        } catch (ExecutionException e2) {
            if (isCancelled) {
                String valueOf3 = String.valueOf(interfaceFutureC5161c);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(valueOf3);
                return new C5149c(false, new IllegalArgumentException(sb3.toString(), e2));
            }
            return new C5150d(e2.getCause());
        } catch (Throwable th) {
            return new C5150d(th);
        }
    }

    /* renamed from: w */
    private static <V> V m25500w(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: z */
    private void m25499z() {
        C5159k c5159k;
        do {
            c5159k = this.f12836e;
        } while (!f12832x.mo25496c(this, c5159k, C5159k.f12859c));
        while (c5159k != null) {
            c5159k.m25491b();
            c5159k = c5159k.f12861b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo13350B(V v) {
        if (v == null) {
            v = (V) f12833y;
        }
        if (f12832x.mo25497b(this, null, v)) {
            m25504s(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo13349C(Throwable th) {
        C5051n.m25780n(th);
        if (f12832x.mo25497b(this, null, new C5150d(th))) {
            m25504s(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.p110h.AbstractC5167a
    /* renamed from: a */
    public final Throwable mo25481a() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C5149c c5149c;
        Object obj = this.f12834c;
        if (!(obj == null) && !(obj instanceof RunnableC5154g)) {
            return false;
        }
        if (f12830f) {
            c5149c = new C5149c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            c5149c = C5149c.f12837c;
        } else {
            c5149c = C5149c.f12838d;
        }
        while (!f12832x.mo25497b(this, obj, c5149c)) {
            obj = this.f12834c;
            if (!(obj instanceof RunnableC5154g)) {
                return false;
            }
        }
        if (z) {
            mo13347x();
        }
        m25504s(this);
        if (obj instanceof RunnableC5154g) {
            ((RunnableC5154g) obj).f12852d.cancel(z);
            return true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f12834c;
            if ((obj != null) & (!(obj instanceof RunnableC5154g))) {
                return m25502u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C5159k c5159k = this.f12836e;
                if (c5159k != C5159k.f12859c) {
                    C5159k c5159k2 = new C5159k();
                    do {
                        c5159k2.m25492a(c5159k);
                        if (f12832x.mo25496c(this, c5159k, c5159k2)) {
                            do {
                                C5163e.m25488a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12834c;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC5154g))) {
                                        return m25502u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m25522A(c5159k2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m25522A(c5159k2);
                        } else {
                            c5159k = this.f12836e;
                        }
                    } while (c5159k != C5159k.f12859c);
                    return m25502u(this.f12834c);
                }
                return m25502u(this.f12834c);
            }
            while (nanos > 0) {
                Object obj3 = this.f12834c;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC5154g))) {
                    return m25502u(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC5146a = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(abstractC5146a).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(abstractC5146a);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f12834c instanceof C5149c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f12834c;
        return (!(obj instanceof RunnableC5154g)) & (obj != null);
    }

    /* renamed from: n */
    protected void m25509n() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(LoanStatusType.CANCELLED);
        } else if (isDone()) {
            m25511l(sb);
        } else {
            m25510m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: x */
    protected void mo13347x() {
    }

    /* renamed from: y */
    protected String mo13346y() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12834c;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC5154g))) {
                return m25502u(obj2);
            }
            C5159k c5159k = this.f12836e;
            if (c5159k != C5159k.f12859c) {
                C5159k c5159k2 = new C5159k();
                do {
                    c5159k2.m25492a(c5159k);
                    if (f12832x.mo25496c(this, c5159k, c5159k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12834c;
                            } else {
                                m25522A(c5159k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC5154g))));
                        return m25502u(obj);
                    }
                    c5159k = this.f12836e;
                } while (c5159k != C5159k.f12859c);
                return m25502u(this.f12834c);
            }
            return m25502u(this.f12834c);
        }
        throw new InterruptedException();
    }
}
