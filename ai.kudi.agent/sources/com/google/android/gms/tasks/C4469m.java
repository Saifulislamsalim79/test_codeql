package com.google.android.gms.tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: classes2.dex */
public final class C4469m {
    /* renamed from: a */
    public static <TResult> TResult m27770a(j<TResult> jVar) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.s.h();
        com.google.android.gms.common.internal.s.k(jVar, "Task must not be null");
        if (jVar.o()) {
            return (TResult) m27760k(jVar);
        }
        C4476q c4476q = new C4476q(null);
        m27759l(jVar, c4476q);
        c4476q.m27731d();
        return (TResult) m27760k(jVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m27769b(j<TResult> jVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.s.h();
        com.google.android.gms.common.internal.s.k(jVar, "Task must not be null");
        com.google.android.gms.common.internal.s.k(timeUnit, "TimeUnit must not be null");
        if (jVar.o()) {
            return (TResult) m27760k(jVar);
        }
        C4476q c4476q = new C4476q(null);
        m27759l(jVar, c4476q);
        if (c4476q.m27730e(j, timeUnit)) {
            return (TResult) m27760k(jVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> j<TResult> m27768c(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.s.k(executor, "Executor must not be null");
        com.google.android.gms.common.internal.s.k(callable, "Callback must not be null");
        C4472n0 c4472n0 = new C4472n0();
        executor.execute(new RunnableC4474o0(c4472n0, callable));
        return c4472n0;
    }

    /* renamed from: d */
    public static <TResult> j<TResult> m27767d() {
        C4472n0 c4472n0 = new C4472n0();
        c4472n0.m27737u();
        return c4472n0;
    }

    /* renamed from: e */
    public static <TResult> j<TResult> m27766e(Exception exc) {
        C4472n0 c4472n0 = new C4472n0();
        c4472n0.m27739s(exc);
        return c4472n0;
    }

    /* renamed from: f */
    public static <TResult> j<TResult> m27765f(TResult tresult) {
        C4472n0 c4472n0 = new C4472n0();
        c4472n0.m27738t(tresult);
        return c4472n0;
    }

    /* renamed from: g */
    public static j<Void> m27764g(Collection<? extends j<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (j<?> jVar : collection) {
                if (jVar == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C4472n0 c4472n0 = new C4472n0();
            C4478s c4478s = new C4478s(collection.size(), c4472n0);
            for (j<?> jVar2 : collection) {
                m27759l(jVar2, c4478s);
            }
            return c4472n0;
        }
        return m27765f(null);
    }

    /* renamed from: h */
    public static j<Void> m27763h(j<?>... jVarArr) {
        if (jVarArr != null && jVarArr.length != 0) {
            return m27764g(Arrays.asList(jVarArr));
        }
        return m27765f(null);
    }

    /* renamed from: i */
    public static j<List<j<?>>> m27762i(Collection<? extends j<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return m27764g(collection).j(C4467l.f10891a, new C4473o(collection));
        }
        return m27765f(Collections.emptyList());
    }

    /* renamed from: j */
    public static j<List<j<?>>> m27761j(j<?>... jVarArr) {
        if (jVarArr != null && jVarArr.length != 0) {
            return m27762i(Arrays.asList(jVarArr));
        }
        return m27765f(Collections.emptyList());
    }

    /* renamed from: k */
    private static <TResult> TResult m27760k(j<TResult> jVar) throws ExecutionException {
        if (jVar.p()) {
            return (TResult) jVar.l();
        }
        if (jVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jVar.k());
    }

    /* renamed from: l */
    private static <T> void m27759l(j<T> jVar, InterfaceC4477r<? super T> interfaceC4477r) {
        jVar.g(C4467l.f10892b, interfaceC4477r);
        jVar.e(C4467l.f10892b, interfaceC4477r);
        jVar.a(C4467l.f10892b, interfaceC4477r);
    }
}
