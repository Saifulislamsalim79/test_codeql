package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4452d;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.InterfaceC4462i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ConfigCacheClient.java */
/* renamed from: com.google.firebase.remoteconfig.internal.j */
/* loaded from: classes2.dex */
public class C6751j {

    /* renamed from: d */
    private static final Map<String, C6751j> f16242d = new HashMap();

    /* renamed from: e */
    private static final Executor f16243e = ExecutorC6749h.f16240c;

    /* renamed from: a */
    private final ExecutorService f16244a;

    /* renamed from: b */
    private final C6762o f16245b;

    /* renamed from: c */
    private com.google.android.gms.tasks.j<C6754k> f16246c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConfigCacheClient.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.j$b */
    /* loaded from: classes2.dex */
    public static class C6753b<TResult> implements InterfaceC4458g<TResult>, InterfaceC4456f, InterfaceC4452d {

        /* renamed from: a */
        private final CountDownLatch f16247a;

        private C6753b() {
            this.f16247a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.InterfaceC4452d
        /* renamed from: a */
        public void mo20881a() {
            this.f16247a.countDown();
        }

        @Override // com.google.android.gms.tasks.InterfaceC4456f
        /* renamed from: b */
        public void mo15657b(Exception exc) {
            this.f16247a.countDown();
        }

        @Override // com.google.android.gms.tasks.InterfaceC4458g
        /* renamed from: c */
        public void mo18742c(TResult tresult) {
            this.f16247a.countDown();
        }

        /* renamed from: d */
        public boolean m20880d(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f16247a.await(j, timeUnit);
        }
    }

    private C6751j(ExecutorService executorService, C6762o c6762o) {
        this.f16244a = executorService;
        this.f16245b = c6762o;
    }

    /* renamed from: a */
    private static <TResult> TResult m20892a(com.google.android.gms.tasks.j<TResult> jVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C6753b c6753b = new C6753b();
        jVar.g(f16243e, c6753b);
        jVar.e(f16243e, c6753b);
        jVar.a(f16243e, c6753b);
        if (c6753b.m20880d(j, timeUnit)) {
            if (jVar.p()) {
                return (TResult) jVar.l();
            }
            throw new ExecutionException(jVar.k());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* renamed from: f */
    public static synchronized C6751j m20887f(ExecutorService executorService, C6762o c6762o) {
        C6751j c6751j;
        synchronized (C6751j.class) {
            String m20813b = c6762o.m20813b();
            if (!f16242d.containsKey(m20813b)) {
                f16242d.put(m20813b, new C6751j(executorService, c6762o));
            }
            c6751j = f16242d.get(m20813b);
        }
        return c6751j;
    }

    /* renamed from: k */
    private synchronized void m20882k(C6754k c6754k) {
        this.f16246c = C4469m.m27765f(c6754k);
    }

    /* renamed from: b */
    public void m20891b() {
        synchronized (this) {
            this.f16246c = C4469m.m27765f(null);
        }
        this.f16245b.m20814a();
    }

    /* renamed from: c */
    public synchronized com.google.android.gms.tasks.j<C6754k> m20890c() {
        if (this.f16246c == null || (this.f16246c.o() && !this.f16246c.p())) {
            ExecutorService executorService = this.f16244a;
            final C6762o c6762o = this.f16245b;
            Objects.requireNonNull(c6762o);
            this.f16246c = C4469m.m27768c(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6762o.this.m20811d();
                }
            });
        }
        return this.f16246c;
    }

    /* renamed from: d */
    public C6754k m20889d() {
        return m20888e(5L);
    }

    /* renamed from: e */
    C6754k m20888e(long j) {
        synchronized (this) {
            if (this.f16246c != null && this.f16246c.p()) {
                return (C6754k) this.f16246c.l();
            }
            try {
                return (C6754k) m20892a(m20890c(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    /* renamed from: g */
    public /* synthetic */ Void m20886g(C6754k c6754k) throws Exception {
        return this.f16245b.m20810e(c6754k);
    }

    /* renamed from: h */
    public /* synthetic */ com.google.android.gms.tasks.j m20885h(boolean z, C6754k c6754k, Void r3) throws Exception {
        if (z) {
            m20882k(c6754k);
        }
        return C4469m.m27765f(c6754k);
    }

    /* renamed from: i */
    public com.google.android.gms.tasks.j<C6754k> m20884i(C6754k c6754k) {
        return m20883j(c6754k, true);
    }

    /* renamed from: j */
    public com.google.android.gms.tasks.j<C6754k> m20883j(final C6754k c6754k, final boolean z) {
        return C4469m.m27768c(this.f16244a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6751j.this.m20886g(c6754k);
            }
        }).r(this.f16244a, new InterfaceC4462i() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // com.google.android.gms.tasks.InterfaceC4462i
            /* renamed from: a */
            public final com.google.android.gms.tasks.j mo20894a(Object obj) {
                return C6751j.this.m20885h(z, c6754k, (Void) obj);
            }
        });
    }
}
