package com.google.mlkit.common.p186b;

import com.google.android.gms.common.internal.s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p300b.p307d.p315h.AbstractExecutorServiceC8530x;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.j */
/* loaded from: classes2.dex */
public class C6940j extends AbstractExecutorServiceC8530x {

    /* renamed from: d */
    private static final ThreadLocal f16634d = new ThreadLocal();

    /* renamed from: c */
    private final ThreadPoolExecutor f16635c;

    public C6940j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.b.y
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.b.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6940j.m20442d(runnable);
                    }
                });
            }
        });
        this.f16635c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m20442d(Runnable runnable) {
        f16634d.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m20441e(Deque deque, Runnable runnable) {
        s.j(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8495f
    /* renamed from: a */
    protected final /* synthetic */ Object mo16028a() {
        return this.f16635c;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractExecutorServiceC8530x
    /* renamed from: b */
    protected final ExecutorService mo15996b() {
        return this.f16635c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f16634d.get();
        if (deque != null && deque.size() <= 1) {
            m20441e(deque, runnable);
        } else {
            this.f16635c.execute(new Runnable() { // from class: com.google.mlkit.common.b.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6940j.m20441e((Deque) C6940j.f16634d.get(), runnable);
                }
            });
        }
    }
}
