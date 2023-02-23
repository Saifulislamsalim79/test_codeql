package io.grpc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Context.java */
/* renamed from: io.grpc.s */
/* loaded from: classes2.dex */
public class C10043s {

    /* renamed from: e */
    static final Logger f23776e = Logger.getLogger(C10043s.class.getName());

    /* renamed from: f */
    public static final C10043s f23777f = new C10043s();

    /* renamed from: c */
    final C10044a f23778c = null;

    /* renamed from: d */
    final int f23779d = 0;

    /* compiled from: Context.java */
    /* renamed from: io.grpc.s$a */
    /* loaded from: classes2.dex */
    public static final class C10044a extends C10043s implements Closeable {

        /* renamed from: w */
        private ArrayList<RunnableC10046c> f23780w;

        /* renamed from: x */
        private InterfaceC10045b f23781x;

        /* renamed from: b0 */
        static /* synthetic */ void m13228b0(C10044a c10044a, RunnableC10046c runnableC10046c) {
            c10044a.m13226g0(runnableC10046c);
            throw null;
        }

        /* renamed from: g0 */
        private void m13226g0(RunnableC10046c runnableC10046c) {
            synchronized (this) {
                mo13230P();
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i0 */
        public void m13225i0(InterfaceC10045b interfaceC10045b, C10043s c10043s) {
            synchronized (this) {
                if (this.f23780w != null) {
                    int size = this.f23780w.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        RunnableC10046c runnableC10046c = this.f23780w.get(size);
                        if (runnableC10046c.f23783d == interfaceC10045b && runnableC10046c.f23784e == c10043s) {
                            this.f23780w.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (this.f23780w.isEmpty()) {
                        if (this.f23778c == null) {
                            this.f23781x = null;
                            this.f23780w = null;
                        } else {
                            this.f23778c.mo13229V(this.f23781x);
                            throw null;
                        }
                    }
                }
            }
        }

        @Override // io.grpc.C10043s
        /* renamed from: O */
        public C10065u mo13231O() {
            throw null;
        }

        @Override // io.grpc.C10043s
        /* renamed from: P */
        public boolean mo13230P() {
            throw null;
        }

        @Override // io.grpc.C10043s
        /* renamed from: V */
        public void mo13229V(InterfaceC10045b interfaceC10045b) {
            throw null;
        }

        @Override // io.grpc.C10043s
        /* renamed from: m */
        public Throwable mo13224m() {
            throw null;
        }
    }

    /* compiled from: Context.java */
    /* renamed from: io.grpc.s$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC10045b {
        /* renamed from: a */
        void mo13223a(C10043s c10043s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Context.java */
    /* renamed from: io.grpc.s$c */
    /* loaded from: classes2.dex */
    public static final class RunnableC10046c implements Runnable {

        /* renamed from: c */
        private final Executor f23782c;

        /* renamed from: d */
        final InterfaceC10045b f23783d;

        /* renamed from: e */
        private final C10043s f23784e;

        RunnableC10046c(Executor executor, InterfaceC10045b interfaceC10045b, C10043s c10043s) {
            this.f23782c = executor;
            this.f23783d = interfaceC10045b;
            this.f23784e = c10043s;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23783d.mo13223a(this.f23784e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Context.java */
    /* renamed from: io.grpc.s$d */
    /* loaded from: classes2.dex */
    public static final class C10047d {

        /* renamed from: a */
        static final AbstractC10048e f23785a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f23785a = m13221a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C10043s.f23776e.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        private static AbstractC10048e m13221a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (AbstractC10048e) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC10048e.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C9519f1();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* compiled from: Context.java */
    /* renamed from: io.grpc.s$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10048e {
        @Deprecated
        /* renamed from: a */
        public void m13220a(C10043s c10043s) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* renamed from: b */
        public abstract C10043s mo13219b();

        /* renamed from: c */
        public abstract void mo13218c(C10043s c10043s, C10043s c10043s2);

        /* renamed from: d */
        public C10043s mo13217d(C10043s c10043s) {
            mo13219b();
            m13220a(c10043s);
            throw null;
        }
    }

    private C10043s() {
        m13234Z(0);
    }

    /* renamed from: F */
    static <T> T m13238F(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: I */
    public static C10043s m13237I() {
        C10043s mo13219b = m13235X().mo13219b();
        return mo13219b == null ? f23777f : mo13219b;
    }

    /* renamed from: X */
    static AbstractC10048e m13235X() {
        return C10047d.f23785a;
    }

    /* renamed from: Z */
    private static void m13234Z(int i) {
        if (i == 1000) {
            f23776e.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* renamed from: J */
    public void m13236J(C10043s c10043s) {
        m13238F(c10043s, "toAttach");
        m13235X().mo13218c(this, c10043s);
    }

    /* renamed from: O */
    public C10065u mo13231O() {
        C10044a c10044a = this.f23778c;
        if (c10044a == null) {
            return null;
        }
        c10044a.mo13231O();
        throw null;
    }

    /* renamed from: P */
    public boolean mo13230P() {
        C10044a c10044a = this.f23778c;
        if (c10044a == null) {
            return false;
        }
        c10044a.mo13230P();
        throw null;
    }

    /* renamed from: V */
    public void mo13229V(InterfaceC10045b interfaceC10045b) {
        C10044a c10044a = this.f23778c;
        if (c10044a == null) {
            return;
        }
        c10044a.m13225i0(interfaceC10045b, this);
    }

    /* renamed from: c */
    public void m13233c(InterfaceC10045b interfaceC10045b, Executor executor) {
        m13238F(interfaceC10045b, "cancellationListener");
        m13238F(executor, "executor");
        C10044a c10044a = this.f23778c;
        if (c10044a == null) {
            return;
        }
        C10044a.m13228b0(c10044a, new RunnableC10046c(executor, interfaceC10045b, this));
        throw null;
    }

    /* renamed from: g */
    public C10043s m13232g() {
        C10043s mo13217d = m13235X().mo13217d(this);
        return mo13217d == null ? f23777f : mo13217d;
    }

    /* renamed from: m */
    public Throwable mo13224m() {
        C10044a c10044a = this.f23778c;
        if (c10044a == null) {
            return null;
        }
        c10044a.mo13224m();
        throw null;
    }
}
