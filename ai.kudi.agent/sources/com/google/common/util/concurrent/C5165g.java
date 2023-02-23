package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ThreadFactoryBuilder.java */
/* renamed from: com.google.common.util.concurrent.g */
/* loaded from: classes2.dex */
public final class C5165g {

    /* renamed from: a */
    private String f12864a = null;

    /* renamed from: b */
    private Boolean f12865b = null;

    /* renamed from: c */
    private Integer f12866c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f12867d = null;

    /* renamed from: e */
    private ThreadFactory f12868e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ThreadFactoryBuilder.java */
    /* renamed from: com.google.common.util.concurrent.g$a */
    /* loaded from: classes2.dex */
    public class ThreadFactoryC5166a implements ThreadFactory {

        /* renamed from: c */
        final /* synthetic */ ThreadFactory f12869c;

        /* renamed from: d */
        final /* synthetic */ String f12870d;

        /* renamed from: e */
        final /* synthetic */ AtomicLong f12871e;

        /* renamed from: f */
        final /* synthetic */ Boolean f12872f;

        /* renamed from: w */
        final /* synthetic */ Integer f12873w;

        /* renamed from: x */
        final /* synthetic */ Thread.UncaughtExceptionHandler f12874x;

        ThreadFactoryC5166a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f12869c = threadFactory;
            this.f12870d = str;
            this.f12871e = atomicLong;
            this.f12872f = bool;
            this.f12873w = num;
            this.f12874x = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f12869c.newThread(runnable);
            String str = this.f12870d;
            if (str != null) {
                newThread.setName(C5165g.m25484d(str, Long.valueOf(this.f12871e.getAndIncrement())));
            }
            Boolean bool = this.f12872f;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f12873w;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12874x;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    private static ThreadFactory m25485c(C5165g c5165g) {
        String str = c5165g.f12864a;
        Boolean bool = c5165g.f12865b;
        Integer num = c5165g.f12866c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c5165g.f12867d;
        ThreadFactory threadFactory = c5165g.f12868e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new ThreadFactoryC5166a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m25484d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory m25486b() {
        return m25485c(this);
    }

    /* renamed from: e */
    public C5165g m25483e(boolean z) {
        this.f12865b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public C5165g m25482f(String str) {
        m25484d(str, 0);
        this.f12864a = str;
        return this;
    }
}
