package com.google.firebase.crashlytics.p112h.p115j;

import android.os.Looper;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.j;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: Utils.java */
/* renamed from: com.google.firebase.crashlytics.h.j.k0 */
/* loaded from: classes2.dex */
public final class C5368k0 {

    /* renamed from: a */
    private static final ExecutorService f13237a = C5408y.m24834c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utils.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.k0$a */
    /* loaded from: classes2.dex */
    public class RunnableC5369a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Callable f13238c;

        /* renamed from: d */
        final /* synthetic */ C4465k f13239d;

        /* compiled from: Utils.java */
        /* renamed from: com.google.firebase.crashlytics.h.j.k0$a$a */
        /* loaded from: classes2.dex */
        class C5370a implements InterfaceC4450c<T, Void> {
            C5370a() {
            }

            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: b */
            public Void mo20893a(j<T> jVar) throws Exception {
                if (jVar.p()) {
                    RunnableC5369a.this.f13239d.m27775c(jVar.l());
                    return null;
                }
                RunnableC5369a.this.f13239d.m27776b(jVar.k());
                return null;
            }
        }

        RunnableC5369a(Callable callable, C4465k c4465k) {
            this.f13238c = callable;
            this.f13239d = c4465k;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((j) this.f13238c.call()).h(new C5370a());
            } catch (Exception e) {
                this.f13239d.m27776b(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m25018a(j<T> jVar) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        jVar.i(f13237a, new InterfaceC4450c() { // from class: com.google.firebase.crashlytics.h.j.g
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(j jVar2) {
                return countDownLatch.countDown();
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (jVar.p()) {
            return (T) jVar.l();
        }
        if (!jVar.n()) {
            if (jVar.o()) {
                throw new IllegalStateException(jVar.k());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: b */
    public static <T> j<T> m25017b(Executor executor, Callable<j<T>> callable) {
        C4465k c4465k = new C4465k();
        executor.execute(new RunnableC5369a(callable, c4465k));
        return c4465k.m27777a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ Void m25015d(C4465k c4465k, j jVar) throws Exception {
        if (jVar.p()) {
            c4465k.m27773e(jVar.l());
            return null;
        }
        c4465k.m27774d((Exception) Objects.requireNonNull(jVar.k()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ Void m25014e(C4465k c4465k, j jVar) throws Exception {
        if (jVar.p()) {
            c4465k.m27773e(jVar.l());
            return null;
        }
        c4465k.m27774d((Exception) Objects.requireNonNull(jVar.k()));
        return null;
    }

    /* renamed from: f */
    public static <T> j<T> m25013f(j<T> jVar, j<T> jVar2) {
        final C4465k c4465k = new C4465k();
        InterfaceC4450c interfaceC4450c = new InterfaceC4450c() { // from class: com.google.firebase.crashlytics.h.j.e
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(j jVar3) {
                return C5368k0.m25015d(C4465k.this, jVar3);
            }
        };
        jVar.h(interfaceC4450c);
        jVar2.h(interfaceC4450c);
        return c4465k.m27777a();
    }

    /* renamed from: g */
    public static <T> j<T> m25012g(Executor executor, j<T> jVar, j<T> jVar2) {
        final C4465k c4465k = new C4465k();
        InterfaceC4450c interfaceC4450c = new InterfaceC4450c() { // from class: com.google.firebase.crashlytics.h.j.f
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(j jVar3) {
                return C5368k0.m25014e(C4465k.this, jVar3);
            }
        };
        jVar.i(executor, interfaceC4450c);
        jVar2.i(executor, interfaceC4450c);
        return c4465k.m27777a();
    }
}
