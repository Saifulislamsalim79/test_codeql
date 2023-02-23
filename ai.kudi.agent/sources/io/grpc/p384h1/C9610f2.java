package io.grpc.p384h1;

import com.google.common.base.C5051n;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: SharedResourceHolder.java */
/* renamed from: io.grpc.h1.f2 */
/* loaded from: classes2.dex */
public final class C9610f2 {

    /* renamed from: d */
    private static final C9610f2 f22497d = new C9610f2(new C9611a());

    /* renamed from: a */
    private final IdentityHashMap<InterfaceC9614d<?>, C9613c> f22498a = new IdentityHashMap<>();

    /* renamed from: b */
    private final InterfaceC9615e f22499b;

    /* renamed from: c */
    private ScheduledExecutorService f22500c;

    /* compiled from: SharedResourceHolder.java */
    /* renamed from: io.grpc.h1.f2$a */
    /* loaded from: classes2.dex */
    class C9611a implements InterfaceC9615e {
        C9611a() {
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9615e
        /* renamed from: a */
        public ScheduledExecutorService mo14332a() {
            return Executors.newSingleThreadScheduledExecutor(C9755r0.m14059i("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedResourceHolder.java */
    /* renamed from: io.grpc.h1.f2$b */
    /* loaded from: classes2.dex */
    public class RunnableC9612b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9613c f22501c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC9614d f22502d;

        /* renamed from: e */
        final /* synthetic */ Object f22503e;

        RunnableC9612b(C9613c c9613c, InterfaceC9614d interfaceC9614d, Object obj) {
            this.f22501c = c9613c;
            this.f22502d = interfaceC9614d;
            this.f22503e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C9610f2.this) {
                if (this.f22501c.f22506b == 0) {
                    this.f22502d.mo13721b(this.f22503e);
                    C9610f2.this.f22498a.remove(this.f22502d);
                    if (C9610f2.this.f22498a.isEmpty()) {
                        C9610f2.this.f22500c.shutdown();
                        C9610f2.this.f22500c = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedResourceHolder.java */
    /* renamed from: io.grpc.h1.f2$c */
    /* loaded from: classes2.dex */
    public static class C9613c {

        /* renamed from: a */
        final Object f22505a;

        /* renamed from: b */
        int f22506b;

        /* renamed from: c */
        ScheduledFuture<?> f22507c;

        C9613c(Object obj) {
            this.f22505a = obj;
        }
    }

    /* compiled from: SharedResourceHolder.java */
    /* renamed from: io.grpc.h1.f2$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC9614d<T> {
        /* renamed from: b */
        void mo13721b(T t);

        T create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedResourceHolder.java */
    /* renamed from: io.grpc.h1.f2$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC9615e {
        /* renamed from: a */
        ScheduledExecutorService mo14332a();
    }

    C9610f2(InterfaceC9615e interfaceC9615e) {
        this.f22499b = interfaceC9615e;
    }

    /* renamed from: d */
    public static <T> T m14336d(InterfaceC9614d<T> interfaceC9614d) {
        return (T) f22497d.m14335e(interfaceC9614d);
    }

    /* renamed from: f */
    public static <T> T m14334f(InterfaceC9614d<T> interfaceC9614d, T t) {
        return (T) f22497d.m14333g(interfaceC9614d, t);
    }

    /* renamed from: e */
    synchronized <T> T m14335e(InterfaceC9614d<T> interfaceC9614d) {
        C9613c c9613c;
        c9613c = this.f22498a.get(interfaceC9614d);
        if (c9613c == null) {
            c9613c = new C9613c(interfaceC9614d.create());
            this.f22498a.put(interfaceC9614d, c9613c);
        }
        if (c9613c.f22507c != null) {
            c9613c.f22507c.cancel(false);
            c9613c.f22507c = null;
        }
        c9613c.f22506b++;
        return (T) c9613c.f22505a;
    }

    /* renamed from: g */
    synchronized <T> T m14333g(InterfaceC9614d<T> interfaceC9614d, T t) {
        C9613c c9613c = this.f22498a.get(interfaceC9614d);
        if (c9613c != null) {
            C5051n.m25789e(t == c9613c.f22505a, "Releasing the wrong instance");
            C5051n.m25773u(c9613c.f22506b > 0, "Refcount has already reached zero");
            int i = c9613c.f22506b - 1;
            c9613c.f22506b = i;
            if (i == 0) {
                C5051n.m25773u(c9613c.f22507c == null, "Destroy task already scheduled");
                if (this.f22500c == null) {
                    this.f22500c = this.f22499b.mo14332a();
                }
                c9613c.f22507c = this.f22500c.schedule(new RunnableC9586d1(new RunnableC9612b(c9613c, interfaceC9614d, t)), 1L, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + interfaceC9614d);
        }
        return null;
    }
}
