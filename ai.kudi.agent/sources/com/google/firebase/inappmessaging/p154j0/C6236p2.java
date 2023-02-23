package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.InterfaceC6409s;
import com.google.firebase.inappmessaging.InterfaceC6410t;
import com.google.firebase.inappmessaging.InterfaceC6411u;
import com.google.firebase.inappmessaging.InterfaceC6414v;
import com.google.firebase.inappmessaging.InterfaceC6415w;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.p154j0.C6236p2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: DeveloperListenerManager.java */
/* renamed from: com.google.firebase.inappmessaging.j0.p2 */
/* loaded from: classes2.dex */
public class C6236p2 {

    /* renamed from: e */
    private static BlockingQueue<Runnable> f15135e;

    /* renamed from: f */
    private static final ThreadPoolExecutor f15136f;

    /* renamed from: a */
    private Map<InterfaceC6409s, C6237a> f15137a = new HashMap();

    /* renamed from: b */
    private Map<InterfaceC6410t, C6238b> f15138b = new HashMap();

    /* renamed from: c */
    private Map<InterfaceC6414v, C6239c> f15139c = new HashMap();

    /* renamed from: d */
    private Map<InterfaceC6415w, C6242f> f15140d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$a */
    /* loaded from: classes2.dex */
    public static class C6237a extends AbstractC6240d<InterfaceC6409s> {

        /* renamed from: b */
        InterfaceC6409s f15141b;

        /* renamed from: b */
        public InterfaceC6409s m22495b() {
            return this.f15141b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$b */
    /* loaded from: classes2.dex */
    public static class C6238b extends AbstractC6240d<InterfaceC6410t> {

        /* renamed from: b */
        InterfaceC6410t f15142b;

        /* renamed from: b */
        public InterfaceC6410t m22494b() {
            return this.f15142b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$c */
    /* loaded from: classes2.dex */
    public static class C6239c extends AbstractC6240d<InterfaceC6414v> {

        /* renamed from: b */
        InterfaceC6414v f15143b;

        /* renamed from: b */
        public InterfaceC6414v m22493b() {
            return this.f15143b;
        }
    }

    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6240d<T> {

        /* renamed from: a */
        private final Executor f15144a;

        /* renamed from: a */
        public Executor m22492a(Executor executor) {
            Executor executor2 = this.f15144a;
            return executor2 == null ? executor : executor2;
        }
    }

    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$e */
    /* loaded from: classes2.dex */
    static class ThreadFactoryC6241e implements ThreadFactory {

        /* renamed from: c */
        private final AtomicInteger f15145c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f15146d;

        ThreadFactoryC6241e(String str) {
            this.f15146d = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "FIAM-" + this.f15146d + this.f15145c.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeveloperListenerManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.p2$f */
    /* loaded from: classes2.dex */
    public static class C6242f extends AbstractC6240d<InterfaceC6415w> {

        /* renamed from: b */
        InterfaceC6415w f15147b;

        /* renamed from: b */
        public InterfaceC6415w m22491b() {
            return this.f15147b;
        }
    }

    static {
        new C6236p2();
        f15135e = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, f15135e, new ThreadFactoryC6241e("EventListeners-"));
        f15136f = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public void m22504a(final AbstractC6386i abstractC6386i, final InterfaceC6411u.EnumC6413b enumC6413b) {
        for (final C6239c c6239c : this.f15139c.values()) {
            c6239c.m22492a(f15136f).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.j0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C6236p2.C6239c.this.m22493b().m22086a(abstractC6386i, enumC6413b);
                }
            });
        }
    }

    /* renamed from: b */
    public void m22503b(final AbstractC6386i abstractC6386i) {
        for (final C6242f c6242f : this.f15140d.values()) {
            c6242f.m22492a(f15136f).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.j0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C6236p2.C6242f.this.m22491b().m22085a(abstractC6386i);
                }
            });
        }
    }

    /* renamed from: g */
    public void m22498g(final AbstractC6386i abstractC6386i, final C6365a c6365a) {
        for (final C6237a c6237a : this.f15137a.values()) {
            c6237a.m22492a(f15136f).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.j0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C6236p2.C6237a.this.m22495b().m22092a(abstractC6386i, c6365a);
                }
            });
        }
    }

    /* renamed from: h */
    public void m22497h(final AbstractC6386i abstractC6386i) {
        for (final C6238b c6238b : this.f15138b.values()) {
            c6238b.m22492a(f15136f).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.j0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C6236p2.C6238b.this.m22494b().m22091a(abstractC6386i);
                }
            });
        }
    }

    /* renamed from: i */
    public void m22496i() {
        this.f15137a.clear();
        this.f15140d.clear();
        this.f15139c.clear();
    }
}
